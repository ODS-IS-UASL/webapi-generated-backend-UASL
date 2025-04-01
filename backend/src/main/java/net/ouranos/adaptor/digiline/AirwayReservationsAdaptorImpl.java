package net.ouranos.adaptor.digiline;

import java.net.URI;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.extern.slf4j.Slf4j;

/**
 * AirwayReservationsAdaptorImpl実装クラス。
 */
@Component("AirwayReservationsAdaptor")
@Slf4j
public class AirwayReservationsAdaptorImpl implements Adaptor<Object>{

    /**
     * 環境変数からapiKeyを取得し保持するフィールド。
    */
    @Value("${apiKey}")
    private String apiKey;

    /**
     * 環境変数からbaseUrlを取得し保持するフィールド。
    */
    @Value("${trustsystem.base-url}")
    private String baseUrl;

    /**
     * RestClientのビルダーを保持するフィールド。
    */
    @Autowired
    private RestClient.Builder restClient;

    /**
     * 指定されたデータモデルに対してGETリクエストを送信します。
     *
     * @param targetDataModel 取得対象のデータモデル
     * @param tracking トラッキングID
     * @param queryParam クエリパラメータ
     * @param token アクセストークン
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Object> sendGet(String targetDataModel, UUID tracking, String queryParam, String token) {
        log.info("Send GET to XXX service. Tracking = {}", tracking);
        ResponseEntity<Object> result;
        if(queryParam == null) {
            String url = baseUrl + "/airwayReservations";
            result = this.restClient.build().get()
            .uri(url)
            .header("X-Tracking", tracking.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .retrieve()
            .toEntity(Object.class);
        } else if(queryParam.contains("[") && queryParam.contains("]")){
            String url = baseUrl + "/airwayReservations";
            URI uri = UriComponentsBuilder.fromUriString(url)
            .query(queryParam)
            .build().toUri();
            result = this.restClient.build().get()
            .uri(uri)
            .header("X-Tracking", tracking.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .retrieve()
            .toEntity(Object.class);
        } else {
            String url = baseUrl + "/airwayReservations";
            URI uri = UriComponentsBuilder.fromUriString(url)
            .query(queryParam)
            .build(true).toUri();
            result = this.restClient.build().get()
            .uri(uri)
            .header("X-Tracking", tracking.toString())
            .header("apiKey", apiKey)
            .header("Authorization", token)
            .retrieve()
            .toEntity(Object.class);
        }
        HttpStatusCode statusCode = result.getStatusCode();
        Object body = result.getBody();
        HttpHeaders headers = new HttpHeaders();
        if(result.getHeaders().containsKey("X-Tracking")) {
            headers.set("X-tracking", result.getHeaders().getFirst("X-Tracking"));
        } else {
            headers.set("X-Tracking", tracking.toString());
        }
        if(result.getHeaders().containsKey("Link")) {
            headers.set("Link", result.getHeaders().getFirst("Link"));
        }
        return new ResponseEntity<>(body, headers, statusCode);
    }

    /**
     * API仕様上存在しないので何もしない
     *
     * @param dataModel 送信するデータモデル
     * @param tracking トラッキングID
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Object> sendPut(Object dataModel, UUID tracking, String queryParam, String token) {
        return null;
    }

    /**
     * API仕様上存在しないので何もしない
     *
     * @param id 消去するデータのID
     * @param tracking トラッキングID
     * @return サーバーからのレスポンス
     */
    @Override
    public ResponseEntity<Void> sendDelete(UUID tracking, String queryParam, String token) {
        return null;
    }

}
