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
 * AdsNecessityDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-14T13:36:08.403514+03:00[Europe/Helsinki]")
public class AdsNecessityDTO {
  @SerializedName("buildingId")
  private Long buildingId = null;

  @SerializedName("necessary")
  private Boolean necessary = null;

  public AdsNecessityDTO buildingId(Long buildingId) {
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

  public AdsNecessityDTO necessary(Boolean necessary) {
    this.necessary = necessary;
    return this;
  }

   /**
   * Get necessary
   * @return necessary
  **/
  @Schema(description = "")
  public Boolean isNecessary() {
    return necessary;
  }

  public void setNecessary(Boolean necessary) {
    this.necessary = necessary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsNecessityDTO adsNecessityDTO = (AdsNecessityDTO) o;
    return Objects.equals(this.buildingId, adsNecessityDTO.buildingId) &&
        Objects.equals(this.necessary, adsNecessityDTO.necessary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildingId, necessary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsNecessityDTO {\n");
    
    sb.append("    buildingId: ").append(toIndentedString(buildingId)).append("\n");
    sb.append("    necessary: ").append(toIndentedString(necessary)).append("\n");
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