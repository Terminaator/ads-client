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
 * AdsXmlRequestDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-05T12:46:40.910754800+03:00[Europe/Helsinki]")
public class AdsXmlRequestDTO {
  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("buildingId")
  private Long buildingId = null;

  @SerializedName("request")
  private String request = null;

  public AdsXmlRequestDTO encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Unique identifier of the Contact.
   * @return encoding
  **/
  @Schema(example = "base64", description = "Unique identifier of the Contact.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public AdsXmlRequestDTO buildingId(Long buildingId) {
    this.buildingId = buildingId;
    return this;
  }

   /**
   * Unique identifier of the Contact.
   * @return buildingId
  **/
  @Schema(example = "1", description = "Unique identifier of the Contact.")
  public Long getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(Long buildingId) {
    this.buildingId = buildingId;
  }

  public AdsXmlRequestDTO request(String request) {
    this.request = request;
    return this;
  }

   /**
   * Unique identifier of the Contact.
   * @return request
  **/
  @Schema(example = "PHhtbC1mcmFnbWVudD5cclxuICA8ZXNpdGFqYUtvb2Q+WDwvZXNpdGFqYUtvb2Q+XHJcbiAgPG1lbmV0bGVqYU5pbWk+WDwvbWVuZXRsZWphTmltaT5cclxuICA8YWludWx0S29udHJvbGw+dHJ1ZTwvYWludWx0S29udHJvbGw+XHJcbiAgPG1lbmV0bHVzTnI+WDwvbWVuZXRsdXNOcj5cclxuPC94bWwtZnJhZ21lbnQ+", description = "Unique identifier of the Contact.")
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsXmlRequestDTO adsXmlRequestDTO = (AdsXmlRequestDTO) o;
    return Objects.equals(this.encoding, adsXmlRequestDTO.encoding) &&
        Objects.equals(this.buildingId, adsXmlRequestDTO.buildingId) &&
        Objects.equals(this.request, adsXmlRequestDTO.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, buildingId, request);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsXmlRequestDTO {\n");
    
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    buildingId: ").append(toIndentedString(buildingId)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
