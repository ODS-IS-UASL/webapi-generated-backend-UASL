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
 * 機体情報要素
 */

@Schema(name = "aircraft_attributes", description = "機体情報要素")
@JsonTypeName("aircraft_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-14T13:53:43.540625200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class AircraftAttributes {

  private UUID aircraftId;

  private String aircraftName;

  private String manufacturer;

  private String manufacturingNumber;

  /**
   * 機体の種類。1:飛行機、2:回転翼航空機（ヘリコプター）、3:回転翼航空機（マルチローター）、4:回転翼航空機（その他） 、5:滑空機 、6:飛行船
   */
  public enum AircraftTypeEnum {
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2")),
    
    NUMBER_3(new BigDecimal("3")),
    
    NUMBER_4(new BigDecimal("4")),
    
    NUMBER_5(new BigDecimal("5")),
    
    NUMBER_6(new BigDecimal("6"));

    private BigDecimal value;

    AircraftTypeEnum(BigDecimal value) {
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
    public static AircraftTypeEnum fromValue(BigDecimal value) {
      for (AircraftTypeEnum b : AircraftTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AircraftTypeEnum aircraftType;

  private Double maxTakeoffWeight;

  private Double bodyWeight;

  private Double maxFlightSpeed;

  private Double maxFlightTime;

  private Boolean certification;

  private String dipsRegistrationCode;

  /**
   * 機体所有種別。1:事業者所有機体、2:レンタル機体
   */
  public enum OwnerTypeEnum {
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2"));

    private BigDecimal value;

    OwnerTypeEnum(BigDecimal value) {
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
    public static OwnerTypeEnum fromValue(BigDecimal value) {
      for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OwnerTypeEnum ownerType;

  private UUID ownerId;

  public AircraftAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AircraftAttributes(UUID aircraftId, String aircraftName, String manufacturer, String manufacturingNumber, AircraftTypeEnum aircraftType, Boolean certification, String dipsRegistrationCode) {
    this.aircraftId = aircraftId;
    this.aircraftName = aircraftName;
    this.manufacturer = manufacturer;
    this.manufacturingNumber = manufacturingNumber;
    this.aircraftType = aircraftType;
    this.certification = certification;
    this.dipsRegistrationCode = dipsRegistrationCode;
  }

  public AircraftAttributes aircraftId(UUID aircraftId) {
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

  public AircraftAttributes aircraftName(String aircraftName) {
    this.aircraftName = aircraftName;
    return this;
  }

  /**
   * 機体に付与する任意の名称。
   * @return aircraftName
  */
  @NotNull @Size(min = 1, max = 24) 
  @Schema(name = "aircraftName", example = "機体1", description = "機体に付与する任意の名称。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aircraftName")
  public String getAircraftName() {
    return aircraftName;
  }

  public void setAircraftName(String aircraftName) {
    this.aircraftName = aircraftName;
  }

  public AircraftAttributes manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * 製造メーカー
   * @return manufacturer
  */
  @NotNull @Size(min = 1, max = 24) 
  @Schema(name = "manufacturer", example = "XXXXX", description = "製造メーカー", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public AircraftAttributes manufacturingNumber(String manufacturingNumber) {
    this.manufacturingNumber = manufacturingNumber;
    return this;
  }

  /**
   * 製造メーカーが機体に付与した番号。シリアル番号など。
   * @return manufacturingNumber
  */
  @NotNull @Size(min = 1, max = 20) 
  @Schema(name = "manufacturingNumber", example = "XXXXX", description = "製造メーカーが機体に付与した番号。シリアル番号など。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manufacturingNumber")
  public String getManufacturingNumber() {
    return manufacturingNumber;
  }

  public void setManufacturingNumber(String manufacturingNumber) {
    this.manufacturingNumber = manufacturingNumber;
  }

  public AircraftAttributes aircraftType(AircraftTypeEnum aircraftType) {
    this.aircraftType = aircraftType;
    return this;
  }

  /**
   * 機体の種類。1:飛行機、2:回転翼航空機（ヘリコプター）、3:回転翼航空機（マルチローター）、4:回転翼航空機（その他） 、5:滑空機 、6:飛行船
   * @return aircraftType
  */
  @NotNull @Valid 
  @Schema(name = "aircraftType", description = "機体の種類。1:飛行機、2:回転翼航空機（ヘリコプター）、3:回転翼航空機（マルチローター）、4:回転翼航空機（その他） 、5:滑空機 、6:飛行船", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aircraftType")
  public AircraftTypeEnum getAircraftType() {
    return aircraftType;
  }

  public void setAircraftType(AircraftTypeEnum aircraftType) {
    this.aircraftType = aircraftType;
  }

  public AircraftAttributes maxTakeoffWeight(Double maxTakeoffWeight) {
    this.maxTakeoffWeight = maxTakeoffWeight;
    return this;
  }

  /**
   * 最大離陸重量
   * minimum: 0
   * maximum: 999999
   * @return maxTakeoffWeight
  */
  @DecimalMin("0") @DecimalMax("999999") 
  @Schema(name = "maxTakeoffWeight", example = "10", description = "最大離陸重量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTakeoffWeight")
  public Double getMaxTakeoffWeight() {
    return maxTakeoffWeight;
  }

  public void setMaxTakeoffWeight(Double maxTakeoffWeight) {
    this.maxTakeoffWeight = maxTakeoffWeight;
  }

  public AircraftAttributes bodyWeight(Double bodyWeight) {
    this.bodyWeight = bodyWeight;
    return this;
  }

  /**
   * 重量
   * minimum: 0
   * maximum: 999999
   * @return bodyWeight
  */
  @DecimalMin("0") @DecimalMax("999999") 
  @Schema(name = "bodyWeight", example = "30", description = "重量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bodyWeight")
  public Double getBodyWeight() {
    return bodyWeight;
  }

  public void setBodyWeight(Double bodyWeight) {
    this.bodyWeight = bodyWeight;
  }

  public AircraftAttributes maxFlightSpeed(Double maxFlightSpeed) {
    this.maxFlightSpeed = maxFlightSpeed;
    return this;
  }

  /**
   * 最大速度
   * minimum: 0
   * maximum: 999999
   * @return maxFlightSpeed
  */
  @DecimalMin("0") @DecimalMax("999999") 
  @Schema(name = "maxFlightSpeed", example = "30", description = "最大速度", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxFlightSpeed")
  public Double getMaxFlightSpeed() {
    return maxFlightSpeed;
  }

  public void setMaxFlightSpeed(Double maxFlightSpeed) {
    this.maxFlightSpeed = maxFlightSpeed;
  }

  public AircraftAttributes maxFlightTime(Double maxFlightTime) {
    this.maxFlightTime = maxFlightTime;
    return this;
  }

  /**
   * 最大飛行時間
   * minimum: 0
   * maximum: 999999
   * @return maxFlightTime
  */
  @DecimalMin("0") @DecimalMax("999999") 
  @Schema(name = "maxFlightTime", example = "30", description = "最大飛行時間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxFlightTime")
  public Double getMaxFlightTime() {
    return maxFlightTime;
  }

  public void setMaxFlightTime(Double maxFlightTime) {
    this.maxFlightTime = maxFlightTime;
  }

  public AircraftAttributes certification(Boolean certification) {
    this.certification = certification;
    return this;
  }

  /**
   * 機体認証の有無
   * @return certification
  */
  @NotNull 
  @Schema(name = "certification", description = "機体認証の有無", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("certification")
  public Boolean getCertification() {
    return certification;
  }

  public void setCertification(Boolean certification) {
    this.certification = certification;
  }

  public AircraftAttributes dipsRegistrationCode(String dipsRegistrationCode) {
    this.dipsRegistrationCode = dipsRegistrationCode;
    return this;
  }

  /**
   * DIPS登録記号
   * @return dipsRegistrationCode
  */
  @NotNull @Size(min = 12, max = 12) 
  @Schema(name = "dipsRegistrationCode", example = "AA1234567890", description = "DIPS登録記号", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dipsRegistrationCode")
  public String getDipsRegistrationCode() {
    return dipsRegistrationCode;
  }

  public void setDipsRegistrationCode(String dipsRegistrationCode) {
    this.dipsRegistrationCode = dipsRegistrationCode;
  }

  public AircraftAttributes ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }

  /**
   * 機体所有種別。1:事業者所有機体、2:レンタル機体
   * @return ownerType
  */
  @Valid 
  @Schema(name = "ownerType", description = "機体所有種別。1:事業者所有機体、2:レンタル機体", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerType")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  public AircraftAttributes ownerId(UUID ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * レンタル事業者を含む事業者を識別するID
   * @return ownerId
  */
  @Valid 
  @Schema(name = "ownerId", description = "レンタル事業者を含む事業者を識別するID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public UUID getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AircraftAttributes aircraftAttributes = (AircraftAttributes) o;
    return Objects.equals(this.aircraftId, aircraftAttributes.aircraftId) &&
        Objects.equals(this.aircraftName, aircraftAttributes.aircraftName) &&
        Objects.equals(this.manufacturer, aircraftAttributes.manufacturer) &&
        Objects.equals(this.manufacturingNumber, aircraftAttributes.manufacturingNumber) &&
        Objects.equals(this.aircraftType, aircraftAttributes.aircraftType) &&
        Objects.equals(this.maxTakeoffWeight, aircraftAttributes.maxTakeoffWeight) &&
        Objects.equals(this.bodyWeight, aircraftAttributes.bodyWeight) &&
        Objects.equals(this.maxFlightSpeed, aircraftAttributes.maxFlightSpeed) &&
        Objects.equals(this.maxFlightTime, aircraftAttributes.maxFlightTime) &&
        Objects.equals(this.certification, aircraftAttributes.certification) &&
        Objects.equals(this.dipsRegistrationCode, aircraftAttributes.dipsRegistrationCode) &&
        Objects.equals(this.ownerType, aircraftAttributes.ownerType) &&
        Objects.equals(this.ownerId, aircraftAttributes.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aircraftId, aircraftName, manufacturer, manufacturingNumber, aircraftType, maxTakeoffWeight, bodyWeight, maxFlightSpeed, maxFlightTime, certification, dipsRegistrationCode, ownerType, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AircraftAttributes {\n");
    sb.append("    aircraftId: ").append(toIndentedString(aircraftId)).append("\n");
    sb.append("    aircraftName: ").append(toIndentedString(aircraftName)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturingNumber: ").append(toIndentedString(manufacturingNumber)).append("\n");
    sb.append("    aircraftType: ").append(toIndentedString(aircraftType)).append("\n");
    sb.append("    maxTakeoffWeight: ").append(toIndentedString(maxTakeoffWeight)).append("\n");
    sb.append("    bodyWeight: ").append(toIndentedString(bodyWeight)).append("\n");
    sb.append("    maxFlightSpeed: ").append(toIndentedString(maxFlightSpeed)).append("\n");
    sb.append("    maxFlightTime: ").append(toIndentedString(maxFlightTime)).append("\n");
    sb.append("    certification: ").append(toIndentedString(certification)).append("\n");
    sb.append("    dipsRegistrationCode: ").append(toIndentedString(dipsRegistrationCode)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

