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
import io.swagger.client.model.AdsProceedingObjectProblemDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AdsProceedingObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-05T12:46:40.910754800+03:00[Europe/Helsinki]")
public class AdsProceedingObject {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("problems")
  private List<AdsProceedingObjectProblemDTO> problems = null;

  public AdsProceedingObject identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public AdsProceedingObject problems(List<AdsProceedingObjectProblemDTO> problems) {
    this.problems = problems;
    return this;
  }

  public AdsProceedingObject addProblemsItem(AdsProceedingObjectProblemDTO problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<AdsProceedingObjectProblemDTO>();
    }
    this.problems.add(problemsItem);
    return this;
  }

   /**
   * Get problems
   * @return problems
  **/
  @Schema(description = "")
  public List<AdsProceedingObjectProblemDTO> getProblems() {
    return problems;
  }

  public void setProblems(List<AdsProceedingObjectProblemDTO> problems) {
    this.problems = problems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsProceedingObject adsProceedingObject = (AdsProceedingObject) o;
    return Objects.equals(this.identifier, adsProceedingObject.identifier) &&
        Objects.equals(this.problems, adsProceedingObject.problems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, problems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsProceedingObject {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
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
