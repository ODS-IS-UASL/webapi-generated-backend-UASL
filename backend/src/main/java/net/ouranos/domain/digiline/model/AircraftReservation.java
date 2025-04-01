package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import net.ouranos.domain.digiline.model.AircraftReservationAttributes;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 機体情報
 */

@Schema(name = "aircraftReservation", description = "機体情報")
@JsonTypeName("aircraftReservation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-14T13:53:43.540625200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class AircraftReservation {

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

  private AircraftReservationAttributes attributes;

  public AircraftReservation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AircraftReservation(DataModelTypeEnum dataModelType, AircraftReservationAttributes attributes) {
    this.dataModelType = dataModelType;
    this.attributes = attributes;
  }

  public AircraftReservation dataModelType(DataModelTypeEnum dataModelType) {
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

  public AircraftReservation attributes(AircraftReservationAttributes attributes) {
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
  public AircraftReservationAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AircraftReservationAttributes attributes) {
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
    AircraftReservation aircraftReservation = (AircraftReservation) o;
    return Objects.equals(this.dataModelType, aircraftReservation.dataModelType) &&
        Objects.equals(this.attributes, aircraftReservation.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AircraftReservation {\n");
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

