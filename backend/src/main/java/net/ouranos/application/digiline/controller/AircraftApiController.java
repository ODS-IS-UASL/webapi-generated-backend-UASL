package net.ouranos.application.digiline.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import lombok.extern.slf4j.Slf4j;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.transform.digiline.Transform;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-31T14:08:30.360621200+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "INDX_0018.出力ファイル取得業務", description = "the INDX_0018.出力ファイル取得業務 API")
@Slf4j
@RestController
@RequestMapping("/")
public class AircraftApiController implements AircraftApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public AircraftApiController(Transform<Object> transform, @Qualifier("AircraftAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/aircraft")
    public ResponseEntity<Object> aircraftGet(
        UUID xTracking,
        UUID aircraftId) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        String queryParam = request.getQueryString();

        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = Aircraft, tracking = {}", xTracking);
        log.info("Execute the adaptor. adaptor = {} dataModel = Aircraft, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendGet("Aircraft", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = Aircraft, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }

}
