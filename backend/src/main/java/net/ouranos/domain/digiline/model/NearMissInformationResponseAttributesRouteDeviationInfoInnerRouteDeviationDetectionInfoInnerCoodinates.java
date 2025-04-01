package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 逸脱発生地点の座標
 */

@Schema(name = "NearMissInformationResponse_attributes_RouteDeviationInfo_inner_RouteDeviationDetectionInfo_inner_coodinates", description = "逸脱発生地点の座標")
@JsonTypeName("NearMissInformationResponse_attributes_RouteDeviationInfo_inner_RouteDeviationDetectionInfo_inner_coodinates")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates {

  private Double latitude;

  private Double longitude;

  private BigDecimal aboveGroundLevel;

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * 緯度
   * minimum: -90.0
   * maximum: 90.0
   * @return latitude
  */
  @DecimalMin("-90.0") @DecimalMax("90.0") 
  @Schema(name = "latitude", example = "35.6895", description = "緯度", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * 経度
   * minimum: -180.0
   * maximum: 180.0
   * @return longitude
  */
  @DecimalMin("-180.0") @DecimalMax("180.0") 
  @Schema(name = "longitude", example = "139.6917", description = "経度", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates aboveGroundLevel(BigDecimal aboveGroundLevel) {
    this.aboveGroundLevel = aboveGroundLevel;
    return this;
  }

  /**
   * 対地高度
   * minimum: 0
   * maximum: 150
   * @return aboveGroundLevel
  */
  @Valid @DecimalMin("0") @DecimalMax("150") 
  @Schema(name = "aboveGroundLevel", example = "50", description = "対地高度", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aboveGroundLevel")
  public BigDecimal getAboveGroundLevel() {
    return aboveGroundLevel;
  }

  public void setAboveGroundLevel(BigDecimal aboveGroundLevel) {
    this.aboveGroundLevel = aboveGroundLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates nearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates = (NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates) o;
    return Objects.equals(this.latitude, nearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates.latitude) &&
        Objects.equals(this.longitude, nearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates.longitude) &&
        Objects.equals(this.aboveGroundLevel, nearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates.aboveGroundLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, aboveGroundLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInnerCoodinates {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    aboveGroundLevel: ").append(toIndentedString(aboveGroundLevel)).append("\n");
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

