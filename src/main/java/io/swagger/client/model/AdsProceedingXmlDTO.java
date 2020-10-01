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
 * AdsProceedingXmlDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-01T15:16:31.615068100+03:00[Europe/Helsinki]")
public class AdsProceedingXmlDTO {
  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("request")
  private String request = null;

  @SerializedName("response")
  private String response = null;

  public AdsProceedingXmlDTO encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Get encoding
   * @return encoding
  **/
  @Schema(description = "")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public AdsProceedingXmlDTO request(String request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @Schema(description = "")
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public AdsProceedingXmlDTO response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @Schema(description = "")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsProceedingXmlDTO adsProceedingXmlDTO = (AdsProceedingXmlDTO) o;
    return Objects.equals(this.encoding, adsProceedingXmlDTO.encoding) &&
        Objects.equals(this.request, adsProceedingXmlDTO.request) &&
        Objects.equals(this.response, adsProceedingXmlDTO.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, request, response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsProceedingXmlDTO {\n");
    
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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