package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.UUID;
import net.ouranos.domain.digiline.model.NearMissInformationRequestAttributesAreaInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * データモデル要素
 */

@Schema(name = "NearMissInformationRequest_attributes", description = "データモデル要素")
@JsonTypeName("NearMissInformationRequest_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationRequestAttributes {

  private NearMissInformationRequestAttributesAreaInfo areaInfo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endAt;

  private UUID airwayAdministratorId;

  private UUID operatorId;

  private UUID airwayId;

  private UUID airwaySectionId;

  public NearMissInformationRequestAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NearMissInformationRequestAttributes(NearMissInformationRequestAttributesAreaInfo areaInfo, OffsetDateTime startAt, OffsetDateTime endAt) {
    this.areaInfo = areaInfo;
    this.startAt = startAt;
    this.endAt = endAt;
  }

  public NearMissInformationRequestAttributes areaInfo(NearMissInformationRequestAttributesAreaInfo areaInfo) {
    this.areaInfo = areaInfo;
    return this;
  }

  /**
   * Get areaInfo
   * @return areaInfo
  */
  @NotNull @Valid 
  @Schema(name = "areaInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areaInfo")
  public NearMissInformationRequestAttributesAreaInfo getAreaInfo() {
    return areaInfo;
  }

  public void setAreaInfo(NearMissInformationRequestAttributesAreaInfo areaInfo) {
    this.areaInfo = areaInfo;
  }

  public NearMissInformationRequestAttributes startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * 開始日時
   * @return startAt
  */
  @NotNull @Valid 
  @Schema(name = "startAt", description = "開始日時", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startAt")
  public OffsetDateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }

  public NearMissInformationRequestAttributes endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * 終了日時
   * @return endAt
  */
  @NotNull @Valid 
  @Schema(name = "endAt", description = "終了日時", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endAt")
  public OffsetDateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }

  public NearMissInformationRequestAttributes airwayAdministratorId(UUID airwayAdministratorId) {
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

  public NearMissInformationRequestAttributes operatorId(UUID operatorId) {
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

  public NearMissInformationRequestAttributes airwayId(UUID airwayId) {
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

  public NearMissInformationRequestAttributes airwaySectionId(UUID airwaySectionId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationRequestAttributes nearMissInformationRequestAttributes = (NearMissInformationRequestAttributes) o;
    return Objects.equals(this.areaInfo, nearMissInformationRequestAttributes.areaInfo) &&
        Objects.equals(this.startAt, nearMissInformationRequestAttributes.startAt) &&
        Objects.equals(this.endAt, nearMissInformationRequestAttributes.endAt) &&
        Objects.equals(this.airwayAdministratorId, nearMissInformationRequestAttributes.airwayAdministratorId) &&
        Objects.equals(this.operatorId, nearMissInformationRequestAttributes.operatorId) &&
        Objects.equals(this.airwayId, nearMissInformationRequestAttributes.airwayId) &&
        Objects.equals(this.airwaySectionId, nearMissInformationRequestAttributes.airwaySectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaInfo, startAt, endAt, airwayAdministratorId, operatorId, airwayId, airwaySectionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationRequestAttributes {\n");
    sb.append("    areaInfo: ").append(toIndentedString(areaInfo)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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

