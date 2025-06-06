/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package net.ouranos.application.digiline.controller;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-22T14:29:44.033493500+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "航路予約", description = "the 航路予約 API")
public interface AirwayReservationsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /airwayReservations : 航路予約詳細取得API
     * __航路予約詳細取得API__
     *
     * @param airwayReservationId  (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Not Found (status code 404)
     *         or Serever Error (status code 500)
     */
    @Operation(
        operationId = "airwayReservationsGet",
        summary = "航路予約詳細取得API",
        description = "__航路予約詳細取得API__",
        tags = { "航路予約" }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/airwayReservations",
        produces = { "application/json" }
    )
    
    ResponseEntity<Object> airwayReservationsGet(@Parameter(name = "X-Tracking", description = "トラッキングID", in = ParameterIn.HEADER) @RequestHeader(value = "X-Tracking", required = false) UUID xTracking,
        @NotNull @Parameter(name = "airwayReservationId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "airwayReservationId", required = true) String airwayReservationId
    ); 

}
