package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.NearMissInformationResponseAttributesRouteDeviationInfoInner;
import net.ouranos.domain.digiline.model.NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner;
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

@Schema(name = "NearMissInformationResponse_attributes", description = "データモデル要素")
@JsonTypeName("NearMissInformationResponse_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationResponseAttributes {

  @Valid
  private List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInner> routeDeviationInfo = new ArrayList<>();

  @Valid
  private List<@Valid NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner> thirdPartyEntryMonitoring = new ArrayList<>();

  public NearMissInformationResponseAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NearMissInformationResponseAttributes(List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInner> routeDeviationInfo, List<@Valid NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner> thirdPartyEntryMonitoring) {
    this.routeDeviationInfo = routeDeviationInfo;
    this.thirdPartyEntryMonitoring = thirdPartyEntryMonitoring;
  }

  public NearMissInformationResponseAttributes routeDeviationInfo(List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInner> routeDeviationInfo) {
    this.routeDeviationInfo = routeDeviationInfo;
    return this;
  }

  public NearMissInformationResponseAttributes addRouteDeviationInfoItem(NearMissInformationResponseAttributesRouteDeviationInfoInner routeDeviationInfoItem) {
    if (this.routeDeviationInfo == null) {
      this.routeDeviationInfo = new ArrayList<>();
    }
    this.routeDeviationInfo.add(routeDeviationInfoItem);
    return this;
  }

  /**
   * 航路逸脱情報のリスト
   * @return routeDeviationInfo
  */
  @NotNull @Valid 
  @Schema(name = "RouteDeviationInfo", description = "航路逸脱情報のリスト", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RouteDeviationInfo")
  public List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInner> getRouteDeviationInfo() {
    return routeDeviationInfo;
  }

  public void setRouteDeviationInfo(List<@Valid NearMissInformationResponseAttributesRouteDeviationInfoInner> routeDeviationInfo) {
    this.routeDeviationInfo = routeDeviationInfo;
  }

  public NearMissInformationResponseAttributes thirdPartyEntryMonitoring(List<@Valid NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner> thirdPartyEntryMonitoring) {
    this.thirdPartyEntryMonitoring = thirdPartyEntryMonitoring;
    return this;
  }

  public NearMissInformationResponseAttributes addThirdPartyEntryMonitoringItem(NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner thirdPartyEntryMonitoringItem) {
    if (this.thirdPartyEntryMonitoring == null) {
      this.thirdPartyEntryMonitoring = new ArrayList<>();
    }
    this.thirdPartyEntryMonitoring.add(thirdPartyEntryMonitoringItem);
    return this;
  }

  /**
   * 第三者立入監視情報のリスト
   * @return thirdPartyEntryMonitoring
  */
  @NotNull @Valid 
  @Schema(name = "ThirdPartyEntryMonitoring", description = "第三者立入監視情報のリスト", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ThirdPartyEntryMonitoring")
  public List<@Valid NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner> getThirdPartyEntryMonitoring() {
    return thirdPartyEntryMonitoring;
  }

  public void setThirdPartyEntryMonitoring(List<@Valid NearMissInformationResponseAttributesThirdPartyEntryMonitoringInner> thirdPartyEntryMonitoring) {
    this.thirdPartyEntryMonitoring = thirdPartyEntryMonitoring;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearMissInformationResponseAttributes nearMissInformationResponseAttributes = (NearMissInformationResponseAttributes) o;
    return Objects.equals(this.routeDeviationInfo, nearMissInformationResponseAttributes.routeDeviationInfo) &&
        Objects.equals(this.thirdPartyEntryMonitoring, nearMissInformationResponseAttributes.thirdPartyEntryMonitoring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeDeviationInfo, thirdPartyEntryMonitoring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationResponseAttributes {\n");
    sb.append("    routeDeviationInfo: ").append(toIndentedString(routeDeviationInfo)).append("\n");
    sb.append("    thirdPartyEntryMonitoring: ").append(toIndentedString(thirdPartyEntryMonitoring)).append("\n");
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

