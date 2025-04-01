package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import net.ouranos.domain.digiline.model.DronePortReservationAttributes;
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

@Schema(name = "dronePortReservation", description = "ドローンポート予約情報")
@JsonTypeName("dronePortReservation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-14T14:38:17.564999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DronePortReservation {

  /**
   * データモデルタイプ
   */
  public enum DataModelTypeEnum {
    TEST1("test1"),
    
    TEST2("test2");

    private String value;

    DataModelTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataModelTypeEnum fromValue(String value) {
      for (DataModelTypeEnum b : DataModelTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DataModelTypeEnum dataModelType;

  private DronePortReservationAttributes attributes;

  public DronePortReservation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DronePortReservation(DataModelTypeEnum dataModelType, DronePortReservationAttributes attributes) {
    this.dataModelType = dataModelType;
    this.attributes = attributes;
  }

  public DronePortReservation dataModelType(DataModelTypeEnum dataModelType) {
    this.dataModelType = dataModelType;
    return this;
  }

  /**
   * データモデルタイプ
   * @return dataModelType
  */
  @NotNull 
  @Schema(name = "dataModelType", example = "test1", description = "データモデルタイプ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dataModelType")
  public DataModelTypeEnum getDataModelType() {
    return dataModelType;
  }

  public void setDataModelType(DataModelTypeEnum dataModelType) {
    this.dataModelType = dataModelType;
  }

  public DronePortReservation attributes(DronePortReservationAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @NotNull @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributes")
  public DronePortReservationAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DronePortReservationAttributes attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DronePortReservation dronePortReservation = (DronePortReservation) o;
    return Objects.equals(this.dataModelType, dronePortReservation.dataModelType) &&
        Objects.equals(this.attributes, dronePortReservation.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DronePortReservation {\n");
    sb.append("    dataModelType: ").append(toIndentedString(dataModelType)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

