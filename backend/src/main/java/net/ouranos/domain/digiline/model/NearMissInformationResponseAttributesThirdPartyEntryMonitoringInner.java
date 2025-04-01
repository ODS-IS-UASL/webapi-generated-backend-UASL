package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import net.ouranos.domain.digiline.model.NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner
 */

@JsonTypeName("NearMissInformationResponse_attributes_ThirdPartyEntryMonitoring_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner {

  private NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfo thirdPartyInfo;

  private UUID airwayAdministratorId;

  private UUID operatorId;

  private UUID airwayId;

  private UUID airwaySectionId;

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner thirdPartyInfo(NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfo thirdPartyInfo) {
    this.thirdPartyInfo = thirdPartyInfo;
    return this;
  }

  /**
   * Get thirdPartyInfo
   * @return thirdPartyInfo
  */
  @Valid 
  @Schema(name = "thirdPartyInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyInfo")
  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfo getThirdPartyInfo() {
    return thirdPartyInfo;
  }

  public void setThirdPartyInfo(NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfo thirdPartyInfo) {
    this.thirdPartyInfo = thirdPartyInfo;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner airwayAdministratorId(UUID airwayAdministratorId) {
    this.airwayAdministratorId = airwayAdministratorId;
    return this;
  }

  /**
   * 航路運営者ID
   * @return airwayAdministratorId
  */
  @Valid 
  @Schema(name = "airwayAdministratorId", description = "航路運営者ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airwayAdministratorId")
  public UUID getAirwayAdministratorId() {
    return airwayAdministratorId;
  }

  public void setAirwayAdministratorId(UUID airwayAdministratorId) {
    this.airwayAdministratorId = airwayAdministratorId;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner operatorId(UUID operatorId) {
    this.operatorId = operatorId;
    return this;
  }

  /**
   * 運航事業者ID
   * @return operatorId
  */
  @Valid 
  @Schema(name = "operatorId", description = "運航事業者ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatorId")
  public UUID getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(UUID operatorId) {
    this.operatorId = operatorId;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner airwayId(UUID airwayId) {
    this.airwayId = airwayId;
    return this;
  }

  /**
   * 航路ID
   * @return airwayId
  */
  @Valid 
  @Schema(name = "airwayId", description = "航路ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airwayId")
  public UUID getAirwayId() {
    return airwayId;
  }

  public void setAirwayId(UUID airwayId) {
    this.airwayId = airwayId;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner airwaySectionId(UUID airwaySectionId) {
    this.airwaySectionId = airwaySectionId;
    return this;
  }

  /**
   * 航路区画のID
   * @return airwaySectionId
  */
  @Valid 
  @Schema(name = "airwaySectionId", description = "航路区画のID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airwaySectionId")
  public UUID getAirwaySectionId() {
    return airwaySectionId;
  }

  public void setAirwaySectionId(UUID airwaySectionId) {
    this.airwaySectionId = airwaySectionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner nearMissInformationResponseAttributesThirdPartyEntryMonitoringInner = (NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner) o;
    return Objects.equals(this.thirdPartyInfo, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInner.thirdPartyInfo) &&
        Objects.equals(this.airwayAdministratorId, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInner.airwayAdministratorId) &&
        Objects.equals(this.operatorId, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInner.operatorId) &&
        Objects.equals(this.airwayId, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInner.airwayId) &&
        Objects.equals(this.airwaySectionId, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInner.airwaySectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdPartyInfo, airwayAdministratorId, operatorId, airwayId, airwaySectionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner {\n");
    sb.append("    thirdPartyInfo: ").append(toIndentedString(thirdPartyInfo)).append("\n");
    sb.append("    airwayAdministratorId: ").append(toIndentedString(airwayAdministratorId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    airwayId: ").append(toIndentedString(airwayId)).append("\n");
    sb.append("    airwaySectionId: ").append(toIndentedString(airwaySectionId)).append("\n");
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

