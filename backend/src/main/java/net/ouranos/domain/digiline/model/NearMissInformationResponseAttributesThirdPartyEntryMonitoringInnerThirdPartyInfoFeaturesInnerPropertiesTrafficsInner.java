package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner
 */

@JsonTypeName("NearMissInformationResponse_attributes_ThirdPartyEntryMonitoring_inner_thirdPartyInfo_features_inner_properties_traffics_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime currentTime;

  /**
   * 侵入検知対象の種別
   */
  public enum TypeEnum {
    u("車"),
    
    u2("自転車"),
    
    u3("人"),
    
    u4("バイク");

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

  private Integer count;

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner currentTime(OffsetDateTime currentTime) {
    this.currentTime = currentTime;
    return this;
  }

  /**
   * 侵入検知対象がいる時刻
   * @return currentTime
  */
  @Valid 
  @Schema(name = "current_time", description = "侵入検知対象がいる時刻", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_time")
  public OffsetDateTime getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(OffsetDateTime currentTime) {
    this.currentTime = currentTime;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * 侵入検知対象の種別
   * @return type
  */
  
  @Schema(name = "type", description = "侵入検知対象の種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * 侵入検知対象の検出数
   * minimum: 0
   * maximum: 100
   * @return count
  */
  @Min(0) @Max(100) 
  @Schema(name = "count", description = "侵入検知対象の検出数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner = (NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner) o;
    return Objects.equals(this.currentTime, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner.currentTime) &&
        Objects.equals(this.type, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner.type) &&
        Objects.equals(this.count, nearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTime, type, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributesThirdPartyEntryMonitoringInnerThirdPartyInfoFeaturesInnerPropertiesTrafficsInner {\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

