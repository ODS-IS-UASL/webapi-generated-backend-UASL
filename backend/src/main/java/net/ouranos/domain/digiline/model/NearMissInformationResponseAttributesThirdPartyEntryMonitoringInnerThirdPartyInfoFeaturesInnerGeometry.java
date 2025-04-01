package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry
 */

@JsonTypeName("NearMissInformationResponse_attributes_ThirdPartyEntryMonitoring_inner_thirdPartyInfo_features_inner_geometry")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry {

  /**
   * 種別
   */
  public enum TypeEnum {
    POLYGON("Polygon");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  @Valid
  private List<List<@DecimalMin(value = "-180.0", inclusive = true) @DecimalMax(value = "180.0", inclusive = true)Double>> coordinates = new ArrayList<>();

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * 種別
   * @return type
  */
  
  @Schema(name = "type", description = "種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry coordinates(List<List<@DecimalMin(value = "-180.0", inclusive = true) @DecimalMax(value = "180.0", inclusive = true)Double>> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry addCoordinatesItem(List<@DecimalMin(value = "-180.0", inclusive = true) @DecimalMax(value = "180.0", inclusive = true)Double> coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

  /**
   * 座標
   * @return coordinates
  */
  @Valid @Size(min = 1, max = 99) 
  @Schema(name = "coordinates", description = "座標", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coordinates")
  public List<List<@DecimalMin(value = "-180.0", inclusive = true) @DecimalMax(value = "180.0", inclusive = true)Double>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<List<@DecimalMin(value = "-180.0", inclusive = true) @DecimalMax(value = "180.0", inclusive = true)Double>> coordinates) {
    this.coordinates = coordinates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry = (NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry) o;
    return Objects.equals(this.type, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry.type) &&
        Objects.equals(this.coordinates, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

