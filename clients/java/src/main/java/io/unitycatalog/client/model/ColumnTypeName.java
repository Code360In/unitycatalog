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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Name of type (INT, STRUCT, MAP, etc.).
 */
public enum ColumnTypeName {
  
  BOOLEAN("BOOLEAN"),
  
  BYTE("BYTE"),
  
  SHORT("SHORT"),
  
  INT("INT"),
  
  LONG("LONG"),
  
  FLOAT("FLOAT"),
  
  DOUBLE("DOUBLE"),
  
  DATE("DATE"),
  
  TIMESTAMP("TIMESTAMP"),
  
  TIMESTAMP_NTZ("TIMESTAMP_NTZ"),
  
  STRING("STRING"),
  
  BINARY("BINARY"),
  
  DECIMAL("DECIMAL"),
  
  INTERVAL("INTERVAL"),
  
  ARRAY("ARRAY"),
  
  STRUCT("STRUCT"),
  
  MAP("MAP"),
  
  CHAR("CHAR"),
  
  NULL("NULL"),
  
  USER_DEFINED_TYPE("USER_DEFINED_TYPE"),
  
  TABLE_TYPE("TABLE_TYPE");

  private String value;

  ColumnTypeName(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ColumnTypeName fromValue(String value) {
    for (ColumnTypeName b : ColumnTypeName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

