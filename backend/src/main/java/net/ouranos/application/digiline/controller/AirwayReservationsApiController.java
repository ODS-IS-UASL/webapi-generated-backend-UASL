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
@Tag(name = "ドローン航路システム", description = "the ドローン航路システム API")
@Slf4j
@RestController
@RequestMapping("/")
public class AirwayReservationsApiController implements AirwayReservationsApi {

    private final Transform<Object> transform;
    private final Adaptor<Object> adaptor;
    private final TokenIntrospection tokenIntrospection;

    public AirwayReservationsApiController(Transform<Object> transform, @Qualifier("AirwayReservationsAdaptor")Adaptor<Object> adaptor, TokenIntrospection tokenIntrospection) {
        this.transform = transform;
        this.adaptor = adaptor;
        this.tokenIntrospection = tokenIntrospection;
    }

    @Override
    @GetMapping("/airwayReservations")
    public ResponseEntity<Object> airwayReservationsGet(UUID xTracking, String airwayReservationId) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
            .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String token = request.getHeader("Authorization");
        String queryParam = request.getQueryString();

        tokenIntrospection.verifyToken(token);
        log.info("Starts a GET process. dataModel = AirwayReservations, tracking = {}", xTracking);
        log.info("Execute the adaptor. adaptor = {} dataModel = AirwayReservations, tracking = {}",this.adaptor.getClass(), xTracking);
        ResponseEntity<Object> response = this.adaptor.sendGet("AirwayReservations", xTracking, queryParam, token);
        log.info("Execute the decode by Transform. adaptor = {} dataModel = AirwayReservations, tracking = {}",this.transform.getClass(), xTracking);
        ResponseEntity<Object> result = this.transform.decode(response, xTracking, queryParam);
        return result;
    }

}
