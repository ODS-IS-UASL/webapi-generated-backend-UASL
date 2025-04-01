package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import net.ouranos.domain.digiline.model.NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 航路逸脱検知情報のエンティティ
 */

@Schema(name = "NearMissInformationResponse_attributes_RouteDeviationInfo_inner_RouteDeviationDetectionInfo_inner", description = "航路逸脱検知情報のエンティティ")
@JsonTypeName("NearMissInformationResponse_attributes_RouteDeviationInfo_inner_RouteDeviationDetectionInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner {

  private UUID airwaySectionId;

  private NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates coodinates;

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner(NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates coodinates) {
    this.coodinates = coodinates;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner airwaySectionId(UUID airwaySectionId) {
    this.airwaySectionId = airwaySectionId;
    return this;
  }

  /**
   * 航路区画のID
   * @return airwaySectionId
  */
  @Valid 
  @Schema(name = "airwaySectionId", example = "123e4567-e89b-12d3-a456-426614174000", description = "航路区画のID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airwaySectionId")
  public UUID getAirwaySectionId() {
    return airwaySectionId;
  }

  public void setAirwaySectionId(UUID airwaySectionId) {
    this.airwaySectionId = airwaySectionId;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner coodinates(NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates coodinates) {
    this.coodinates = coodinates;
    return this;
  }

  /**
   * Get coodinates
   * @return coodinates
  */
  @NotNull @Valid 
  @Schema(name = "coodinates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("coodinates")
  public NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates getCoodinates() {
    return coodinates;
  }

  public void setCoodinates(NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates coodinates) {
    this.coodinates = coodinates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner nearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner = (NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner) o;
    return Objects.equals(this.airwaySectionId, nearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner.airwaySectionId) &&
        Objects.equals(this.coodinates, nearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner.coodinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airwaySectionId, coodinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner {\n");
    sb.append("    airwaySectionId: ").append(toIndentedString(airwaySectionId)).append("\n");
    sb.append("    coodinates: ").append(toIndentedString(coodinates)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

