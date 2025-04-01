package net.ouranos.application.digiline.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import jakarta.servlet.http.HttpServletRequest;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.NearMissInformationRequest;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class NearMissInformationApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<Object> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private Adaptor<Object> adaptor;

    /**
     * {@link TokenIntrospection} のモック。
     */
    @Mock
    private TokenIntrospection tokenIntrospection;

    /**
     * {@link HttpServletRequest} のモック。
     */
    @Mock
    private HttpServletRequest request;

    /**
     * {@link ServletRequestAttributes} のモック。
     */
    @Mock
    private ServletRequestAttributes servletRequestAttributes;

    /**
     * テスト対象クラス{@link NearMissInformationApiController} 。
     */
    @InjectMocks
    private NearMissInformationApiController nearMissInformationApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testPost_query() {
        // テストデータ
        NearMissInformationRequest dataModelNearMissInformationRequest = new NearMissInformationRequest();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelNearMissInformationRequest);
        UUID uuid = UUID.randomUUID();

        // モックの設定
        when(transform.encode(dataModelNearMissInformationRequest, uuid, null)).thenReturn(dataModelNearMissInformationRequest);
        when(adaptor.sendPost(dataModelNearMissInformationRequest, uuid, null, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, null)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Object> response = nearMissInformationApiController.nearMissInformationPost(uuid, dataModelNearMissInformationRequest);

        // 検証
        assertEquals(ResponseEntity.ok(dataModelNearMissInformationRequest), response, "レスポンスが期待通りであること");
        verify(transform, times(1)).encode(dataModelNearMissInformationRequest, uuid, null);
        verify(adaptor, times(1)).sendPost(dataModelNearMissInformationRequest, uuid, null, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, null);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}