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
import io.swagger.client.model.BuildingDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProceedingDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-05T12:46:40.910754800+03:00[Europe/Helsinki]")
public class ProceedingDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("building")
  private BuildingDTO building = null;

  public ProceedingDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the Contact.
   * @return id
  **/
  @Schema(example = "1", description = "Unique identifier of the Contact.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ProceedingDTO building(BuildingDTO building) {
    this.building = building;
    return this;
  }

   /**
   * Get building
   * @return building
  **/
  @Schema(description = "")
  public BuildingDTO getBuilding() {
    return building;
  }

  public void setBuilding(BuildingDTO building) {
    this.building = building;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProceedingDTO proceedingDTO = (ProceedingDTO) o;
    return Objects.equals(this.id, proceedingDTO.id) &&
        Objects.equals(this.building, proceedingDTO.building);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, building);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProceedingDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
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
