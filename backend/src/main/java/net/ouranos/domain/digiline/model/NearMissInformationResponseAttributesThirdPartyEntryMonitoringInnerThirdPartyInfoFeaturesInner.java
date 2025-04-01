package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import net.ouranos.domain.digiline.model.NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry;
import net.ouranos.domain.digiline.model.NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerProperties;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner
 */

@JsonTypeName("NearMissInformationResponse_attributes_ThirdPartyEntryMonitoring_inner_thirdPartyInfo_features_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FEATURE("feature");

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

  private NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry geometry;

  private NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerProperties properties;

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner geometry(NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * Get geometry
   * @return geometry
  */
  @Valid 
  @Schema(name = "geometry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geometry")
  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerGeometry geometry) {
    this.geometry = geometry;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner properties(NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
  */
  @Valid 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerProperties getProperties() {
    return properties;
  }

  public void setProperties(NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerProperties properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner = (NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner) o;
    return Objects.equals(this.type, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner.type) &&
        Objects.equals(this.geometry, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner.geometry) &&
        Objects.equals(this.properties, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, geometry, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

