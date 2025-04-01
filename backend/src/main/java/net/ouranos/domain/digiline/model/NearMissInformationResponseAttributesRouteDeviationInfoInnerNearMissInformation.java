package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 航路逸脱情報
 */

@Schema(name = "NearMissInformationResponse_attributes_RouteDeviationInfo_inner_NearMissInformation", description = "航路逸脱情報")
@JsonTypeName("NearMissInformationResponse_attributes_RouteDeviationInfo_inner_NearMissInformation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation {

  private Double routeDeviationRate;

  private String routeDeviationAmount;

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation(Double routeDeviationRate, String routeDeviationAmount) {
    this.routeDeviationRate = routeDeviationRate;
    this.routeDeviationAmount = routeDeviationAmount;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation routeDeviationRate(Double routeDeviationRate) {
    this.routeDeviationRate = routeDeviationRate;
    return this;
  }

  /**
   * 逸脱割合(%)
   * minimum: 0
   * maximum: 100
   * @return routeDeviationRate
  */
  @NotNull @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "routeDeviationRate", example = "5.8", description = "逸脱割合(%)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("routeDeviationRate")
  public Double getRouteDeviationRate() {
    return routeDeviationRate;
  }

  public void setRouteDeviationRate(Double routeDeviationRate) {
    this.routeDeviationRate = routeDeviationRate;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation routeDeviationAmount(String routeDeviationAmount) {
    this.routeDeviationAmount = routeDeviationAmount;
    return this;
  }

  /**
   * 逸脱量(m)
   * @return routeDeviationAmount
  */
  @NotNull @Size(min = 1, max = 128) 
  @Schema(name = "routeDeviationAmount", example = "5", description = "逸脱量(m)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("routeDeviationAmount")
  public String getRouteDeviationAmount() {
    return routeDeviationAmount;
  }

  public void setRouteDeviationAmount(String routeDeviationAmount) {
    this.routeDeviationAmount = routeDeviationAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation nearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation = (NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation) o;
    return Objects.equals(this.routeDeviationRate, nearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation.routeDeviationRate) &&
        Objects.equals(this.routeDeviationAmount, nearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation.routeDeviationAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeDeviationRate, routeDeviationAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation {\n");
    sb.append("    routeDeviationRate: ").append(toIndentedString(routeDeviationRate)).append("\n");
    sb.append("    routeDeviationAmount: ").append(toIndentedString(routeDeviationAmount)).append("\n");
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

