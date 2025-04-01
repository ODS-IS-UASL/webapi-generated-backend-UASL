package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ドローンポート要素
 */

@Schema(name = "dronePort_attributes", description = "ドローンポート要素")
@JsonTypeName("dronePort_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-14T14:38:17.564999600+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class DronePortAttributes {

  private UUID dronePortId;

  private String dronePortName;

  private String address;

  private String manufacturer;

  private String serialNumber;

  /**
   * ポート形状。1:機械式、2:簡易、0:不明
   */
  public enum PortTypeEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2"));

    private BigDecimal value;

    PortTypeEnum(BigDecimal value) {
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
    public static PortTypeEnum fromValue(BigDecimal value) {
      for (PortTypeEnum b : PortTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PortTypeEnum portType;

  private Double lat;

  private Double lon;

  private BigDecimal alt;

  private String supportDroneType;

  /**
   * 使用用途。1:駐機場、2:緊急着陸地点
   */
  public enum UsageTypeEnum {
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2"));

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

  private String activeStatus;

  public DronePortAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DronePortAttributes(UUID dronePortId, String dronePortName, PortTypeEnum portType, Double lat, Double lon, BigDecimal alt, String supportDroneType, UsageTypeEnum usageType, String activeStatus) {
    this.dronePortId = dronePortId;
    this.dronePortName = dronePortName;
    this.portType = portType;
    this.lat = lat;
    this.lon = lon;
    this.alt = alt;
    this.supportDroneType = supportDroneType;
    this.usageType = usageType;
    this.activeStatus = activeStatus;
  }

  public DronePortAttributes dronePortId(UUID dronePortId) {
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

  public DronePortAttributes dronePortName(String dronePortName) {
    this.dronePortName = dronePortName;
    return this;
  }

  /**
   * ドローンポート名
   * @return dronePortName
  */
  @NotNull @Size(min = 1, max = 24) 
  @Schema(name = "dronePortName", example = "ドローンポート１", description = "ドローンポート名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dronePortName")
  public String getDronePortName() {
    return dronePortName;
  }

  public void setDronePortName(String dronePortName) {
    this.dronePortName = dronePortName;
  }

  public DronePortAttributes address(String address) {
    this.address = address;
    return this;
  }

  /**
   * 設置場所住所
   * @return address
  */
  @Size(min = 1, max = 50) 
  @Schema(name = "address", example = "神奈川県横浜市XXX区XXX町", description = "設置場所住所", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DronePortAttributes manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * 製造メーカー
   * @return manufacturer
  */
  @Size(min = 1, max = 24) 
  @Schema(name = "manufacturer", example = "ブルーイノベーション", description = "製造メーカー", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public DronePortAttributes serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * 製造番号
   * @return serialNumber
  */
  @Size(min = 1, max = 20) 
  @Schema(name = "serialNumber", example = "XXX-XXXXXX等", description = "製造番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public DronePortAttributes portType(PortTypeEnum portType) {
    this.portType = portType;
    return this;
  }

  /**
   * ポート形状。1:機械式、2:簡易、0:不明
   * @return portType
  */
  @NotNull @Valid 
  @Schema(name = "portType", description = "ポート形状。1:機械式、2:簡易、0:不明", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("portType")
  public PortTypeEnum getPortType() {
    return portType;
  }

  public void setPortType(PortTypeEnum portType) {
    this.portType = portType;
  }

  public DronePortAttributes lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * ドローンポート中心緯度
   * minimum: -90.0
   * maximum: 90.0
   * @return lat
  */
  @NotNull @DecimalMin("-90.0") @DecimalMax("90.0") 
  @Schema(name = "lat", example = "35.12345678", description = "ドローンポート中心緯度", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public DronePortAttributes lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * ドローンポート中心経度
   * minimum: -180.0
   * maximum: 180.0
   * @return lon
  */
  @NotNull @DecimalMin("-180.0") @DecimalMax("180.0") 
  @Schema(name = "lon", example = "140.12345678", description = "ドローンポート中心経度", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lon")
  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public DronePortAttributes alt(BigDecimal alt) {
    this.alt = alt;
    return this;
  }

  /**
   * ドローンポート着陸面の高さ(対地高度)
   * minimum: 0
   * maximum: 100
   * @return alt
  */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "alt", example = "12", description = "ドローンポート着陸面の高さ(対地高度)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alt")
  public BigDecimal getAlt() {
    return alt;
  }

  public void setAlt(BigDecimal alt) {
    this.alt = alt;
  }

  public DronePortAttributes supportDroneType(String supportDroneType) {
    this.supportDroneType = supportDroneType;
    return this;
  }

  /**
   * 対応機体。着陸可能な機体の種類等を設定
   * @return supportDroneType
  */
  @NotNull @Size(min = 0, max = 24) 
  @Schema(name = "supportDroneType", example = "マルチコプター", description = "対応機体。着陸可能な機体の種類等を設定", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supportDroneType")
  public String getSupportDroneType() {
    return supportDroneType;
  }

  public void setSupportDroneType(String supportDroneType) {
    this.supportDroneType = supportDroneType;
  }

  public DronePortAttributes usageType(UsageTypeEnum usageType) {
    this.usageType = usageType;
    return this;
  }

  /**
   * 使用用途。1:駐機場、2:緊急着陸地点
   * @return usageType
  */
  @NotNull @Valid 
  @Schema(name = "usageType", description = "使用用途。1:駐機場、2:緊急着陸地点", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usageType")
  public UsageTypeEnum getUsageType() {
    return usageType;
  }

  public void setUsageType(UsageTypeEnum usageType) {
    this.usageType = usageType;
  }

  public DronePortAttributes activeStatus(String activeStatus) {
    this.activeStatus = activeStatus;
    return this;
  }

  /**
   * 動作状況。使用可否、準備中、着陸済み等
   * @return activeStatus
  */
  @NotNull @Size(min = 1, max = 30) 
  @Schema(name = "activeStatus", example = "使用可能", description = "動作状況。使用可否、準備中、着陸済み等", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activeStatus")
  public String getActiveStatus() {
    return activeStatus;
  }

  public void setActiveStatus(String activeStatus) {
    this.activeStatus = activeStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DronePortAttributes dronePortAttributes = (DronePortAttributes) o;
    return Objects.equals(this.dronePortId, dronePortAttributes.dronePortId) &&
        Objects.equals(this.dronePortName, dronePortAttributes.dronePortName) &&
        Objects.equals(this.address, dronePortAttributes.address) &&
        Objects.equals(this.manufacturer, dronePortAttributes.manufacturer) &&
        Objects.equals(this.serialNumber, dronePortAttributes.serialNumber) &&
        Objects.equals(this.portType, dronePortAttributes.portType) &&
        Objects.equals(this.lat, dronePortAttributes.lat) &&
        Objects.equals(this.lon, dronePortAttributes.lon) &&
        Objects.equals(this.alt, dronePortAttributes.alt) &&
        Objects.equals(this.supportDroneType, dronePortAttributes.supportDroneType) &&
        Objects.equals(this.usageType, dronePortAttributes.usageType) &&
        Objects.equals(this.activeStatus, dronePortAttributes.activeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dronePortId, dronePortName, address, manufacturer, serialNumber, portType, lat, lon, alt, supportDroneType, usageType, activeStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DronePortAttributes {\n");
    sb.append("    dronePortId: ").append(toIndentedString(dronePortId)).append("\n");
    sb.append("    dronePortName: ").append(toIndentedString(dronePortName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    supportDroneType: ").append(toIndentedString(supportDroneType)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
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

