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
import net.ouranos.domain.digiline.model.DronePort;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class DronePortApiControllerTest {

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
     * テスト対象クラス{@link DronePortApiController} 。
     */    @InjectMocks
    private DronePortApiController dronePortApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
    }

    @Test
    void testGet_query() {
        // テストデータ
        DronePort dataModelDronePort = new DronePort();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelDronePort);
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
        UUID xTracking = UUID.randomUUID();
        UUID dronePortId = UUID.randomUUID();

        String queryParam = dronePortId.toString();

        // モックの設定
        when(adaptor.sendGet("DronePort", xTracking, queryParam, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, xTracking, queryParam)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(queryParam);

        // 実行
        ResponseEntity<Object> response = dronePortApiController.dronePortGet(xTracking, dronePortId);
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelDronePort), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("DronePort", xTracking, queryParam, "token");
        verify(transform, times(1)).decode(responseEntity, xTracking, queryParam);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
