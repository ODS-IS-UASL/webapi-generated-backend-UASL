package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
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
 * ドローンポート予約情報
 */

@Schema(name = "dronePortReservation_attributes", description = "ドローンポート予約情報")
@JsonTypeName("dronePortReservation_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-14T14:38:17.564999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DronePortReservationAttributes {

  private UUID dronePortId;

  private UUID aircraftId;

  private UUID routeId;

  /**
   * 利用形態。1:離陸ポート、2:着陸ポート、3:その他
   */
  public enum UsageTypeEnum {
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2")),
    
    NUMBER_3(new BigDecimal("3"));

    private BigDecimal value;

    UsageTypeEnum(BigDecimal value) {
      this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UsageTypeEnum fromValue(BigDecimal value) {
      for (UsageTypeEnum b : UsageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private UsageTypeEnum usageType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime reservationTimeFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime reservationTimeTo;

  public DronePortReservationAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DronePortReservationAttributes(UUID dronePortId, UUID aircraftId, OffsetDateTime reservationTimeFrom, OffsetDateTime reservationTimeTo) {
    this.dronePortId = dronePortId;
    this.aircraftId = aircraftId;
    this.reservationTimeFrom = reservationTimeFrom;
    this.reservationTimeTo = reservationTimeTo;
  }

  public DronePortReservationAttributes dronePortId(UUID dronePortId) {
    this.dronePortId = dronePortId;
    return this;
  }

  /**
   * ドローンポートID
   * @return dronePortId
  */
  @NotNull @Valid 
  @Schema(name = "dronePortId", description = "ドローンポートID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dronePortId")
  public UUID getDronePortId() {
    return dronePortId;
  }

  public void setDronePortId(UUID dronePortId) {
    this.dronePortId = dronePortId;
  }

  public DronePortReservationAttributes aircraftId(UUID aircraftId) {
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

  public DronePortReservationAttributes routeId(UUID routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * 紐づける航路ID
   * @return routeId
  */
  @Valid 
  @Schema(name = "routeId", description = "紐づける航路ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routeId")
  public UUID getRouteId() {
    return routeId;
  }

  public void setRouteId(UUID routeId) {
    this.routeId = routeId;
  }

  public DronePortReservationAttributes usageType(UsageTypeEnum usageType) {
    this.usageType = usageType;
    return this;
  }

  /**
   * 利用形態。1:離陸ポート、2:着陸ポート、3:その他
   * @return usageType
  */
  @Valid 
  @Schema(name = "usageType", example = "1", description = "利用形態。1:離陸ポート、2:着陸ポート、3:その他", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usageType")
  public UsageTypeEnum getUsageType() {
    return usageType;
  }

  public void setUsageType(UsageTypeEnum usageType) {
    this.usageType = usageType;
  }

  public DronePortReservationAttributes reservationTimeFrom(OffsetDateTime reservationTimeFrom) {
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

  public DronePortReservationAttributes reservationTimeTo(OffsetDateTime reservationTimeTo) {
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
    DronePortReservationAttributes dronePortReservationAttributes = (DronePortReservationAttributes) o;
    return Objects.equals(this.dronePortId, dronePortReservationAttributes.dronePortId) &&
        Objects.equals(this.aircraftId, dronePortReservationAttributes.aircraftId) &&
        Objects.equals(this.routeId, dronePortReservationAttributes.routeId) &&
        Objects.equals(this.usageType, dronePortReservationAttributes.usageType) &&
        Objects.equals(this.reservationTimeFrom, dronePortReservationAttributes.reservationTimeFrom) &&
        Objects.equals(this.reservationTimeTo, dronePortReservationAttributes.reservationTimeTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dronePortId, aircraftId, routeId, usageType, reservationTimeFrom, reservationTimeTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DronePortReservationAttributes {\n");
    sb.append("    dronePortId: ").append(toIndentedString(dronePortId)).append("\n");
    sb.append("    aircraftId: ").append(toIndentedString(aircraftId)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
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

