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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AdsProceedingObjectProblemDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-05T12:46:40.910754800+03:00[Europe/Helsinki]")
public class AdsProceedingObjectProblemDTO {
  @SerializedName("notice")
  private String notice = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("errorText")
  private String errorText = null;

  public AdsProceedingObjectProblemDTO notice(String notice) {
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

  public AdsProceedingObjectProblemDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AdsProceedingObjectProblemDTO errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public AdsProceedingObjectProblemDTO errorText(String errorText) {
    this.errorText = errorText;
    return this;
  }

   /**
   * Get errorText
   * @return errorText
  **/
  @Schema(description = "")
  public String getErrorText() {
    return errorText;
  }

  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsProceedingObjectProblemDTO adsProceedingObjectProblemDTO = (AdsProceedingObjectProblemDTO) o;
    return Objects.equals(this.notice, adsProceedingObjectProblemDTO.notice) &&
        Objects.equals(this.address, adsProceedingObjectProblemDTO.address) &&
        Objects.equals(this.errorCode, adsProceedingObjectProblemDTO.errorCode) &&
        Objects.equals(this.errorText, adsProceedingObjectProblemDTO.errorText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notice, address, errorCode, errorText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsProceedingObjectProblemDTO {\n");
    
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
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
