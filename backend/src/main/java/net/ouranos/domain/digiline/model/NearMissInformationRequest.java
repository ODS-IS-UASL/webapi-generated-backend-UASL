package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import net.ouranos.domain.digiline.model.NearMissInformationRequestAttributes;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ヒヤリハット情報の取得リクエストボディ
 */

@Schema(name = "NearMissInformationRequest", description = "ヒヤリハット情報の取得リクエストボディ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-24T15:55:05.483153+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class NearMissInformationRequest {

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

  private NearMissInformationRequestAttributes attributes;

  public NearMissInformationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NearMissInformationRequest(DataModelTypeEnum dataModelType, NearMissInformationRequestAttributes attributes) {
    this.dataModelType = dataModelType;
    this.attributes = attributes;
  }

  public NearMissInformationRequest dataModelType(DataModelTypeEnum dataModelType) {
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

  public NearMissInformationRequest attributes(NearMissInformationRequestAttributes attributes) {
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
  public NearMissInformationRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(NearMissInformationRequestAttributes attributes) {
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
    NearMissInformationRequest nearMissInformationRequest = (NearMissInformationRequest) o;
    return Objects.equals(this.dataModelType, nearMissInformationRequest.dataModelType) &&
        Objects.equals(this.attributes, nearMissInformationRequest.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataModelType, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearMissInformationRequest {\n");
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

