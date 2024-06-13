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


package io.unitycatalog.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.unitycatalog.client.model.FunctionInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ListFunctionsResponse
 */
@JsonPropertyOrder({
  ListFunctionsResponse.JSON_PROPERTY_FUNCTIONS,
  ListFunctionsResponse.JSON_PROPERTY_NEXT_PAGE_TOKEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ListFunctionsResponse {
  public static final String JSON_PROPERTY_FUNCTIONS = "functions";
  private List<FunctionInfo> functions = new ArrayList<>();

  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "next_page_token";
  private String nextPageToken;

  public ListFunctionsResponse() { 
  }

  public ListFunctionsResponse functions(List<FunctionInfo> functions) {
    this.functions = functions;
    return this;
  }

  public ListFunctionsResponse addFunctionsItem(FunctionInfo functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

   /**
   * An array of function information objects.
   * @return functions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FunctionInfo> getFunctions() {
    return functions;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunctions(List<FunctionInfo> functions) {
    this.functions = functions;
  }


  public ListFunctionsResponse nextPageToken(String nextPageToken) {
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


  /**
   * Return true if this ListFunctionsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFunctionsResponse listFunctionsResponse = (ListFunctionsResponse) o;
    return Objects.equals(this.functions, listFunctionsResponse.functions) &&
        Objects.equals(this.nextPageToken, listFunctionsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functions, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFunctionsResponse {\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `functions` to the URL query string
    if (getFunctions() != null) {
      for (int i = 0; i < getFunctions().size(); i++) {
        if (getFunctions().get(i) != null) {
          joiner.add(getFunctions().get(i).toUrlQueryString(String.format("%sfunctions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `next_page_token` to the URL query string
    if (getNextPageToken() != null) {
      joiner.add(String.format("%snext_page_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextPageToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

