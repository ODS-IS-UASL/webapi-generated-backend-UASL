package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import net.ouranos.domain.digiline.model.NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation;
import net.ouranos.domain.digiline.model.NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NearMissInformationResponseAttributesRouteDeviationInfoInner
 */

@JsonTypeName("NearMissInformationResponse_attributes_RouteDeviationInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributesRouteDeviationInfoInner {

  private NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation nearMissInformation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  private UUID airwayAdministratorId;

  private UUID operatorId;

  private UUID airwayId;

  @Valid
  private List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner> routeDeviationDetectionInfo = new ArrayList<>();

  public NearMissInformationResponseAttributesRouteDeviationInfoInner nearMissInformation(NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation nearMissInformation) {
    this.nearMissInformation = nearMissInformation;
    return this;
  }

  /**
   * Get nearMissInformation
   * @return nearMissInformation
  */
  @Valid 
  @Schema(name = "NearMissInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NearMissInformation")
  public NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation getNearMissInformation() {
    return nearMissInformation;
  }

  public void setNearMissInformation(NearMissInformationResponseAttributesRouteDeviationInfoInnerNearMissInformation nearMissInformation) {
    this.nearMissInformation = nearMissInformation;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInner time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * 逸脱検知時刻
   * @return time
  */
  @Valid 
  @Schema(name = "time", description = "逸脱検知時刻", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInner airwayAdministratorId(UUID airwayAdministratorId) {
    this.airwayAdministratorId = airwayAdministratorId;
    return this;
  }

  /**
   * 航路運営者ID
   * @return airwayAdministratorId
  */
  @Valid 
  @Schema(name = "airwayAdministratorId", example = "123e4567-e89b-12d3-a456-426614174000", description = "航路運営者ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airwayAdministratorId")
  public UUID getAirwayAdministratorId() {
    return airwayAdministratorId;
  }

  public void setAirwayAdministratorId(UUID airwayAdministratorId) {
    this.airwayAdministratorId = airwayAdministratorId;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInner operatorId(UUID operatorId) {
    this.operatorId = operatorId;
    return this;
  }

  /**
   * 運航事業者ID
   * @return operatorId
  */
  @Valid 
  @Schema(name = "operatorId", example = "123e4567-e89b-12d3-a456-426614174000", description = "運航事業者ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatorId")
  public UUID getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(UUID operatorId) {
    this.operatorId = operatorId;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInner airwayId(UUID airwayId) {
    this.airwayId = airwayId;
    return this;
  }

  /**
   * 航路ID
   * @return airwayId
  */
  @Valid 
  @Schema(name = "airwayId", example = "123e4567-e89b-12d3-a456-426614174000", description = "航路ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airwayId")
  public UUID getAirwayId() {
    return airwayId;
  }

  public void setAirwayId(UUID airwayId) {
    this.airwayId = airwayId;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInner routeDeviationDetectionInfo(List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner> routeDeviationDetectionInfo) {
    this.routeDeviationDetectionInfo = routeDeviationDetectionInfo;
    return this;
  }

  public NearMissInformationResponseAttributesRouteDeviationInfoInner addRouteDeviationDetectionInfoItem(NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner routeDeviationDetectionInfoItem) {
    if (this.routeDeviationDetectionInfo == null) {
      this.routeDeviationDetectionInfo = new ArrayList<>();
    }
    this.routeDeviationDetectionInfo.add(routeDeviationDetectionInfoItem);
    return this;
  }

  /**
   * 逸脱検知情報のリスト
   * @return routeDeviationDetectionInfo
  */
  @Valid @Size(min = 1, max = 99) 
  @Schema(name = "RouteDeviationDetectionInfo", description = "逸脱検知情報のリスト", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RouteDeviationDetectionInfo")
  public List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner> getRouteDeviationDetectionInfo() {
    return routeDeviationDetectionInfo;
  }

  public void setRouteDeviationDetectionInfo(List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInnerRouteDeviationDetectionInfoInner> routeDeviationDetectionInfo) {
    this.routeDeviationDetectionInfo = routeDeviationDetectionInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributesRouteDeviationInfoInner nearMissInformationResponseAttributesRouteDeviationInfoInner = (NearMissInformationResponseAttributesRouteDeviationInfoInner) o;
    return Objects.equals(this.nearMissInformation, nearMissInformationResponseAttributesRouteDeviationInfoInner.nearMissInformation) &&
        Objects.equals(this.time, nearMissInformationResponseAttributesRouteDeviationInfoInner.time) &&
        Objects.equals(this.airwayAdministratorId, nearMissInformationResponseAttributesRouteDeviationInfoInner.airwayAdministratorId) &&
        Objects.equals(this.operatorId, nearMissInformationResponseAttributesRouteDeviationInfoInner.operatorId) &&
        Objects.equals(this.airwayId, nearMissInformationResponseAttributesRouteDeviationInfoInner.airwayId) &&
        Objects.equals(this.routeDeviationDetectionInfo, nearMissInformationResponseAttributesRouteDeviationInfoInner.routeDeviationDetectionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nearMissInformation, time, airwayAdministratorId, operatorId, airwayId, routeDeviationDetectionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributesRouteDeviationInfoInner {\n");
    sb.append("    nearMissInformation: ").append(toIndentedString(nearMissInformation)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    airwayAdministratorId: ").append(toIndentedString(airwayAdministratorId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    airwayId: ").append(toIndentedString(airwayId)).append("\n");
    sb.append("    routeDeviationDetectionInfo: ").append(toIndentedString(routeDeviationDetectionInfo)).append("\n");
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

