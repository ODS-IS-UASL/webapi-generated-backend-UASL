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

@Schema(name = "airwayReservations_attribute", description = "データモデル要素")
@JsonTypeName("airwayReservations_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-22T14:29:44.033493500+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class AirwayReservationsAttribute {

  private UUID airwayReservationId;

  private UUID operatorId;

  @Valid
  private List<UUID> airwaySectionIds = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime reservedAt;

  public AirwayReservationsAttribute airwayReservationId(UUID airwayReservationId) {
    this.airwayReservationId = airwayReservationId;
    return this;
  }

  /**
   * 航路予約ID
   * @return airwayReservationId
  */
  @Valid 
  @Schema(name = "airwayReservationId", example = "123e4567-e89b-12d3-a456-426614174000", description = "航路予約ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airwayReservationId")
  public UUID getAirwayReservationId() {
    return airwayReservationId;
  }

  public void setAirwayReservationId(UUID airwayReservationId) {
    this.airwayReservationId = airwayReservationId;
  }

  public AirwayReservationsAttribute operatorId(UUID operatorId) {
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

  public AirwayReservationsAttribute airwaySectionIds(List<UUID> airwaySectionIds) {
    this.airwaySectionIds = airwaySectionIds;
    return this;
  }

  public AirwayReservationsAttribute addAirwaySectionIdsItem(UUID airwaySectionIdsItem) {
    if (this.airwaySectionIds == null) {
      this.airwaySectionIds = new ArrayList<>();
    }
    this.airwaySectionIds.add(airwaySectionIdsItem);
    return this;
  }

  /**
   * 航路区画配列
   * @return airwaySectionIds
  */
  @Valid @Size(min = 1, max = 99) 
  @Schema(name = "airwaySectionIds", description = "航路区画配列", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airwaySectionIds")
  public List<UUID> getAirwaySectionIds() {
    return airwaySectionIds;
  }

  public void setAirwaySectionIds(List<UUID> airwaySectionIds) {
    this.airwaySectionIds = airwaySectionIds;
  }

  public AirwayReservationsAttribute startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * 予約開始日時
   * @return startAt
  */
  @Valid 
  @Schema(name = "startAt", description = "予約開始日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAt")
  public OffsetDateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }

  public AirwayReservationsAttribute endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * 予約終了日時
   * @return endAt
  */
  @Valid 
  @Schema(name = "endAt", description = "予約終了日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endAt")
  public OffsetDateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }

  public AirwayReservationsAttribute reservedAt(OffsetDateTime reservedAt) {
    this.reservedAt = reservedAt;
    return this;
  }

  /**
   * 予約登録日時
   * @return reservedAt
  */
  @Valid 
  @Schema(name = "reservedAt", description = "予約登録日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservedAt")
  public OffsetDateTime getReservedAt() {
    return reservedAt;
  }

  public void setReservedAt(OffsetDateTime reservedAt) {
    this.reservedAt = reservedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirwayReservationsAttribute airwayReservationsAttribute = (AirwayReservationsAttribute) o;
    return Objects.equals(this.airwayReservationId, airwayReservationsAttribute.airwayReservationId) &&
        Objects.equals(this.operatorId, airwayReservationsAttribute.operatorId) &&
        Objects.equals(this.airwaySectionIds, airwayReservationsAttribute.airwaySectionIds) &&
        Objects.equals(this.startAt, airwayReservationsAttribute.startAt) &&
        Objects.equals(this.endAt, airwayReservationsAttribute.endAt) &&
        Objects.equals(this.reservedAt, airwayReservationsAttribute.reservedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airwayReservationId, operatorId, airwaySectionIds, startAt, endAt, reservedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirwayReservationsAttribute {\n");
    sb.append("    airwayReservationId: ").append(toIndentedString(airwayReservationId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    airwaySectionIds: ").append(toIndentedString(airwaySectionIds)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    reservedAt: ").append(toIndentedString(reservedAt)).append("\n");
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

