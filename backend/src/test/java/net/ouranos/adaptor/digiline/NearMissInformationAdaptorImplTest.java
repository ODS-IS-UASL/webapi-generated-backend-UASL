package net.ouranos.adaptor.digiline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.ouranos.domain.digiline.model.NearMissInformationRequest;

/**
 * NearMissInformationAdaptorImplのテストクラス
 */
@RestClientTest(NearMissInformationAdaptorImpl.class)
public class NearMissInformationAdaptorImplTest {

    /**
     * テスト対象クラス
     */
    @InjectMocks
    private NearMissInformationAdaptorImpl nearMissInformationAdaptorImpl;

    /**
     * RestClient.Builderのモック
     */
    @Mock
    private RestClient.Builder mockRestClient;

    /**
     * RestClient.Builderのインスタンス
     */
    @Autowired
    private RestClient.Builder restClient;

    /**
     * MockRestServiceServerのインスタンス
     */
    private MockRestServiceServer mockServer;

    @Autowired
    ObjectMapper objectmapper;

    /**
     * テスト前処理
     */
    @BeforeEach
    public void setUp() {
        ReflectionTestUtils.setField(nearMissInformationAdaptorImpl, "apiKey", "testapiKey");
        ReflectionTestUtils.setField(nearMissInformationAdaptorImpl, "baseUrl", "http://localhost:8080/");
        MockitoAnnotations.openMocks(this);
        mockServer = MockRestServiceServer.bindTo(restClient).build();
    }

       /**
     * sendGetメソッドのテスト
     */
    @Test
    public void testSendGet() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";

        // Act
        ResponseEntity<Object> response = nearMissInformationAdaptorImpl.sendGet(null,uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }

       /**
     * sendGetメソッドのテスト
     */
    @Test
    public void testSendPut() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";

        // Act
        ResponseEntity<Object> response = nearMissInformationAdaptorImpl.sendPut(null,uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }


    /**
     * sendPostメソッドのテスト  response headerにX-tracking, linkが含まれる場合
     */
    @Test
    public void testSendPost_withQuery_withHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        NearMissInformationRequest targetModelNearMissInformationRequest = new NearMissInformationRequest();
        NearMissInformationRequest assertModelNearMissInformationRequest = new NearMissInformationRequest();
        NearMissInformationRequest responseModelNearMissInformationRequest = new NearMissInformationRequest();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/nearMissInformation?" + queryParam))
                  .andExpect(method(HttpMethod.POST))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelNearMissInformationRequest.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", "test").header("link", "link"));

        // Act
        ResponseEntity<Object> response = nearMissInformationAdaptorImpl.sendPost(targetModelNearMissInformationRequest, uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelNearMissInformationRequest.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), "test");
        assertEquals(response.getHeaders().get("Link").get(0), "link"); 
        mockServer.verify();
    }

    /**
     * sendPostメソッドのテスト  response headerにX-tracking, linkが含まれない場合
     */
    @Test
    public void testSendPost_withQuery_noHeader() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";
        NearMissInformationRequest targetModelNearMissInformationRequest = new NearMissInformationRequest();
        NearMissInformationRequest assertModelNearMissInformationRequest = new NearMissInformationRequest();
        NearMissInformationRequest responseModelNearMissInformationRequest = new NearMissInformationRequest();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/nearMissInformation?" + queryParam))
                  .andExpect(method(HttpMethod.POST))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelNearMissInformationRequest.toString()), MediaType.APPLICATION_JSON));

        // Act
        ResponseEntity<Object> response = nearMissInformationAdaptorImpl.sendPost(targetModelNearMissInformationRequest, uuid, queryParam, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelNearMissInformationRequest.toString(), response.getBody());
        assertEquals(response.getHeaders().get("X-Tracking").get(0), uuid.toString()); 
        assertEquals(response.getHeaders().containsKey("Link"), false);
        mockServer.verify();
    }

    /**
     * sendPostメソッドのテスト 
     */
    @Test
    public void testSendPost_noQuery() throws JsonProcessingException {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        NearMissInformationRequest targetModelNearMissInformationRequest = new NearMissInformationRequest();
        NearMissInformationRequest assertModelNearMissInformationRequest = new NearMissInformationRequest();
        NearMissInformationRequest responseModelNearMissInformationRequest = new NearMissInformationRequest();

        when(mockRestClient.build()).thenReturn(restClient.build());
        mockServer.expect(requestTo("http://localhost:8080/nearMissInformation"))
                  .andExpect(method(HttpMethod.POST))
                  .andExpect(header("X-Tracking", uuid.toString()))
                  .andExpect(header("Authorization", "Bearer token"))
                  .andRespond(withSuccess(this.objectmapper.writeValueAsString(responseModelNearMissInformationRequest.toString()), MediaType.APPLICATION_JSON).header("X-Tracking", uuid.toString()));

        // Act
        ResponseEntity<Object> response = nearMissInformationAdaptorImpl.sendPost(targetModelNearMissInformationRequest, uuid, null, "Bearer token");

        // Assert
        assertNotNull(response);
        assertEquals(assertModelNearMissInformationRequest.toString(), response.getBody());
        mockServer.verify();
    }

    /**
     * sendDeleteメソッドのテスト
     */
    @Test
    public void testSendDelete() {
        // Mock setting
        UUID uuid = UUID.randomUUID();
        String queryParam = "queryParam";

        // Act
        ResponseEntity<Void> response = nearMissInformationAdaptorImpl.sendDelete(uuid, queryParam, "Bearer token");

        // Assert
        assertEquals(response, null);
    }
}