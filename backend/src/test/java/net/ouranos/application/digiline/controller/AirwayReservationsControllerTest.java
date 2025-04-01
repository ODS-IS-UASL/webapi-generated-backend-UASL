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
import net.ouranos.domain.digiline.model.AirwayReservations;
import net.ouranos.transform.digiline.Transform;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class AirwayReservationsControllerTest {

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
     * テスト対象クラス{@link AirwayReservationsApiController} 。
     */
    @InjectMocks
    private AirwayReservationsApiController airwayReservationsApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testGet_query() {
        // テストデータ
        AirwayReservations airwayReservations = new AirwayReservations();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(airwayReservations);
        UUID uuid = UUID.randomUUID();
        String query = "airwayReservationId";

        // モックの設定
        when(adaptor.sendGet("AirwayReservations", uuid, query, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, query)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(query);

        // 実行
        ResponseEntity<Object> response = airwayReservationsApiController.airwayReservationsGet(uuid, query);
        
        // 検証
        assertEquals(ResponseEntity.ok(airwayReservations), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("AirwayReservations", uuid, query, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, query);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}