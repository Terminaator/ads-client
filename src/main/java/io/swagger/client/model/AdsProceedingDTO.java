/*
 * sample application API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.AdsProceedingObject;
import io.swagger.client.model.AdsProceedingXmlDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * AdsProceedingDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-01T15:16:31.615068100+03:00[Europe/Helsinki]")
public class AdsProceedingDTO {
  /**
   * Gets or Sets result
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    ADS_TASK_FAILED("ADS_TASK_FAILED"),
    EHR_TASK_FAILED("EHR_TASK_FAILED"),
    ADS_TASK_SUCCEEDED("ADS_TASK_SUCCEEDED");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResultEnum fromValue(String text) {
      for (ResultEnum b : ResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResultEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("result")
  private ResultEnum result = null;

  @SerializedName("buildingId")
  private Long buildingId = null;

  @SerializedName("notice")
  private String notice = null;

  @SerializedName("enacted")
  private OffsetDateTime enacted = null;

  @SerializedName("adsProcedureNr")
  private Integer adsProcedureNr = null;

  @SerializedName("objects")
  private List<AdsProceedingObject> objects = null;

  @SerializedName("xml")
  private AdsProceedingXmlDTO xml = null;

  public AdsProceedingDTO result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }

  public AdsProceedingDTO buildingId(Long buildingId) {
    this.buildingId = buildingId;
    return this;
  }

   /**
   * Get buildingId
   * @return buildingId
  **/
  @Schema(description = "")
  public Long getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(Long buildingId) {
    this.buildingId = buildingId;
  }

  public AdsProceedingDTO notice(String notice) {
    this.notice = notice;
    return this;
  }

   /**
   * Get notice
   * @return notice
  **/
  @Schema(description = "")
  public String getNotice() {
    return notice;
  }

  public void setNotice(String notice) {
    this.notice = notice;
  }

  public AdsProceedingDTO enacted(OffsetDateTime enacted) {
    this.enacted = enacted;
    return this;
  }

   /**
   * Get enacted
   * @return enacted
  **/
  @Schema(description = "")
  public OffsetDateTime getEnacted() {
    return enacted;
  }

  public void setEnacted(OffsetDateTime enacted) {
    this.enacted = enacted;
  }

  public AdsProceedingDTO adsProcedureNr(Integer adsProcedureNr) {
    this.adsProcedureNr = adsProcedureNr;
    return this;
  }

   /**
   * Get adsProcedureNr
   * @return adsProcedureNr
  **/
  @Schema(description = "")
  public Integer getAdsProcedureNr() {
    return adsProcedureNr;
  }

  public void setAdsProcedureNr(Integer adsProcedureNr) {
    this.adsProcedureNr = adsProcedureNr;
  }

  public AdsProceedingDTO objects(List<AdsProceedingObject> objects) {
    this.objects = objects;
    return this;
  }

  public AdsProceedingDTO addObjectsItem(AdsProceedingObject objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<AdsProceedingObject>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Get objects
   * @return objects
  **/
  @Schema(description = "")
  public List<AdsProceedingObject> getObjects() {
    return objects;
  }

  public void setObjects(List<AdsProceedingObject> objects) {
    this.objects = objects;
  }

  public AdsProceedingDTO xml(AdsProceedingXmlDTO xml) {
    this.xml = xml;
    return this;
  }

   /**
   * Get xml
   * @return xml
  **/
  @Schema(description = "")
  public AdsProceedingXmlDTO getXml() {
    return xml;
  }

  public void setXml(AdsProceedingXmlDTO xml) {
    this.xml = xml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsProceedingDTO adsProceedingDTO = (AdsProceedingDTO) o;
    return Objects.equals(this.result, adsProceedingDTO.result) &&
        Objects.equals(this.buildingId, adsProceedingDTO.buildingId) &&
        Objects.equals(this.notice, adsProceedingDTO.notice) &&
        Objects.equals(this.enacted, adsProceedingDTO.enacted) &&
        Objects.equals(this.adsProcedureNr, adsProceedingDTO.adsProcedureNr) &&
        Objects.equals(this.objects, adsProceedingDTO.objects) &&
        Objects.equals(this.xml, adsProceedingDTO.xml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, buildingId, notice, enacted, adsProcedureNr, objects, xml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsProceedingDTO {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    buildingId: ").append(toIndentedString(buildingId)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    enacted: ").append(toIndentedString(enacted)).append("\n");
    sb.append("    adsProcedureNr: ").append(toIndentedString(adsProcedureNr)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}