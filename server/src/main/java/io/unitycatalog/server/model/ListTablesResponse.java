/*
 * Unity Catalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.unitycatalog.server.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.unitycatalog.server.model.TableInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ListTablesResponse
 */
@JsonPropertyOrder({
  ListTablesResponse.JSON_PROPERTY_TABLES,
  ListTablesResponse.JSON_PROPERTY_NEXT_PAGE_TOKEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ListTablesResponse {
  public static final String JSON_PROPERTY_TABLES = "tables";
  private List<TableInfo> tables = new ArrayList<>();

  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "next_page_token";
  private String nextPageToken;

  public ListTablesResponse() {
  }

  public ListTablesResponse tables(List<TableInfo> tables) {
    
    this.tables = tables;
    return this;
  }

  public ListTablesResponse addTablesItem(TableInfo tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<>();
    }
    this.tables.add(tablesItem);
    return this;
  }

   /**
   * An array of table information objects.
   * @return tables
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TableInfo> getTables() {
    return tables;
  }


  @JsonProperty(JSON_PROPERTY_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTables(List<TableInfo> tables) {
    this.tables = tables;
  }


  public ListTablesResponse nextPageToken(String nextPageToken) {
    
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages. __page_token__ should be set to this value for the next request (for the next page of results). 
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageToken() {
    return nextPageToken;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTablesResponse listTablesResponse = (ListTablesResponse) o;
    return Objects.equals(this.tables, listTablesResponse.tables) &&
        Objects.equals(this.nextPageToken, listTablesResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tables, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTablesResponse {\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

