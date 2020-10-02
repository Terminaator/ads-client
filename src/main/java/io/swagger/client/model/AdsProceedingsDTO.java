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
import io.swagger.client.model.AdsProceedingDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AdsProceedingsDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-02T14:22:54.670916200+03:00[Europe/Helsinki]")
public class AdsProceedingsDTO {
  /**
   * Gets or Sets result
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    SUCCESSFUL("SUCCESSFUL"),
    FAILURE("FAILURE");

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

  @SerializedName("proceedings")
  private List<AdsProceedingDTO> proceedings = null;

  public AdsProceedingsDTO result(ResultEnum result) {
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

  public AdsProceedingsDTO proceedings(List<AdsProceedingDTO> proceedings) {
    this.proceedings = proceedings;
    return this;
  }

  public AdsProceedingsDTO addProceedingsItem(AdsProceedingDTO proceedingsItem) {
    if (this.proceedings == null) {
      this.proceedings = new ArrayList<AdsProceedingDTO>();
    }
    this.proceedings.add(proceedingsItem);
    return this;
  }

   /**
   * Get proceedings
   * @return proceedings
  **/
  @Schema(description = "")
  public List<AdsProceedingDTO> getProceedings() {
    return proceedings;
  }

  public void setProceedings(List<AdsProceedingDTO> proceedings) {
    this.proceedings = proceedings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsProceedingsDTO adsProceedingsDTO = (AdsProceedingsDTO) o;
    return Objects.equals(this.result, adsProceedingsDTO.result) &&
        Objects.equals(this.proceedings, adsProceedingsDTO.proceedings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, proceedings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsProceedingsDTO {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    proceedings: ").append(toIndentedString(proceedings)).append("\n");
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
