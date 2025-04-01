package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
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
 * 機体情報要素
 */

@Schema(name = "aircraftReservation_attributes", description = "機体情報要素")
@JsonTypeName("aircraftReservation_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-14T13:53:43.540625200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class AircraftReservationAttributes {

  private UUID aircraftId;

  private UUID aircraftReserveId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime reservationTimeFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime reservationTimeTo;

  public AircraftReservationAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AircraftReservationAttributes(UUID aircraftId, UUID aircraftReserveId, OffsetDateTime reservationTimeFrom, OffsetDateTime reservationTimeTo) {
    this.aircraftId = aircraftId;
    this.aircraftReserveId = aircraftReserveId;
    this.reservationTimeFrom = reservationTimeFrom;
    this.reservationTimeTo = reservationTimeTo;
  }

  public AircraftReservationAttributes aircraftId(UUID aircraftId) {
    this.aircraftId = aircraftId;
    return this;
  }

  /**
   * 機体ID
   * @return aircraftId
  */
  @NotNull @Valid 
  @Schema(name = "aircraftId", description = "機体ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aircraftId")
  public UUID getAircraftId() {
    return aircraftId;
  }

  public void setAircraftId(UUID aircraftId) {
    this.aircraftId = aircraftId;
  }

  public AircraftReservationAttributes aircraftReserveId(UUID aircraftReserveId) {
    this.aircraftReserveId = aircraftReserveId;
    return this;
  }

  /**
   * 機体ID
   * @return aircraftReserveId
  */
  @NotNull @Valid 
  @Schema(name = "aircraftReserveId", description = "機体ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aircraftReserveId")
  public UUID getAircraftReserveId() {
    return aircraftReserveId;
  }

  public void setAircraftReserveId(UUID aircraftReserveId) {
    this.aircraftReserveId = aircraftReserveId;
  }

  public AircraftReservationAttributes reservationTimeFrom(OffsetDateTime reservationTimeFrom) {
    this.reservationTimeFrom = reservationTimeFrom;
    return this;
  }

  /**
   * 予約開始日時。ISO8601形式
   * @return reservationTimeFrom
  */
  @NotNull @Valid 
  @Schema(name = "reservationTimeFrom", description = "予約開始日時。ISO8601形式", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reservationTimeFrom")
  public OffsetDateTime getReservationTimeFrom() {
    return reservationTimeFrom;
  }

  public void setReservationTimeFrom(OffsetDateTime reservationTimeFrom) {
    this.reservationTimeFrom = reservationTimeFrom;
  }

  public AircraftReservationAttributes reservationTimeTo(OffsetDateTime reservationTimeTo) {
    this.reservationTimeTo = reservationTimeTo;
    return this;
  }

  /**
   * 予約終了日時。ISO8601形式
   * @return reservationTimeTo
  */
  @NotNull @Valid 
  @Schema(name = "reservationTimeTo", description = "予約終了日時。ISO8601形式", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reservationTimeTo")
  public OffsetDateTime getReservationTimeTo() {
    return reservationTimeTo;
  }

  public void setReservationTimeTo(OffsetDateTime reservationTimeTo) {
    this.reservationTimeTo = reservationTimeTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AircraftReservationAttributes aircraftReservationAttributes = (AircraftReservationAttributes) o;
    return Objects.equals(this.aircraftId, aircraftReservationAttributes.aircraftId) &&
        Objects.equals(this.aircraftReserveId, aircraftReservationAttributes.aircraftReserveId) &&
        Objects.equals(this.reservationTimeFrom, aircraftReservationAttributes.reservationTimeFrom) &&
        Objects.equals(this.reservationTimeTo, aircraftReservationAttributes.reservationTimeTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aircraftId, aircraftReserveId, reservationTimeFrom, reservationTimeTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AircraftReservationAttributes {\n");
    sb.append("    aircraftId: ").append(toIndentedString(aircraftId)).append("\n");
    sb.append("    aircraftReserveId: ").append(toIndentedString(aircraftReserveId)).append("\n");
    sb.append("    reservationTimeFrom: ").append(toIndentedString(reservationTimeFrom)).append("\n");
    sb.append("    reservationTimeTo: ").append(toIndentedString(reservationTimeTo)).append("\n");
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

