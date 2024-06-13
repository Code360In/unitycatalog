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
import io.unitycatalog.client.model.ColumnTypeName;
import io.unitycatalog.client.model.DependencyList;
import io.unitycatalog.client.model.FunctionParameterInfos;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateFunction
 */
@JsonPropertyOrder({
  CreateFunction.JSON_PROPERTY_NAME,
  CreateFunction.JSON_PROPERTY_CATALOG_NAME,
  CreateFunction.JSON_PROPERTY_SCHEMA_NAME,
  CreateFunction.JSON_PROPERTY_INPUT_PARAMS,
  CreateFunction.JSON_PROPERTY_DATA_TYPE,
  CreateFunction.JSON_PROPERTY_FULL_DATA_TYPE,
  CreateFunction.JSON_PROPERTY_RETURN_PARAMS,
  CreateFunction.JSON_PROPERTY_ROUTINE_BODY,
  CreateFunction.JSON_PROPERTY_ROUTINE_DEFINITION,
  CreateFunction.JSON_PROPERTY_ROUTINE_DEPENDENCIES,
  CreateFunction.JSON_PROPERTY_PARAMETER_STYLE,
  CreateFunction.JSON_PROPERTY_IS_DETERMINISTIC,
  CreateFunction.JSON_PROPERTY_SQL_DATA_ACCESS,
  CreateFunction.JSON_PROPERTY_IS_NULL_CALL,
  CreateFunction.JSON_PROPERTY_SECURITY_TYPE,
  CreateFunction.JSON_PROPERTY_SPECIFIC_NAME,
  CreateFunction.JSON_PROPERTY_COMMENT,
  CreateFunction.JSON_PROPERTY_PROPERTIES,
  CreateFunction.JSON_PROPERTY_EXTERNAL_LANGUAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CreateFunction {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CATALOG_NAME = "catalog_name";
  private String catalogName;

  public static final String JSON_PROPERTY_SCHEMA_NAME = "schema_name";
  private String schemaName;

  public static final String JSON_PROPERTY_INPUT_PARAMS = "input_params";
  private FunctionParameterInfos inputParams;

  public static final String JSON_PROPERTY_DATA_TYPE = "data_type";
  private ColumnTypeName dataType;

  public static final String JSON_PROPERTY_FULL_DATA_TYPE = "full_data_type";
  private String fullDataType;

  public static final String JSON_PROPERTY_RETURN_PARAMS = "return_params";
  private FunctionParameterInfos returnParams;

  /**
   * Function language. When **EXTERNAL** is used, the language of the routine function should be specified in the __external_language__ field,  and the __return_params__ of the function cannot be used (as **TABLE** return type is not supported), and the __sql_data_access__ field must be **NO_SQL**. 
   */
  public enum RoutineBodyEnum {
    SQL("SQL"),
    
    EXTERNAL("EXTERNAL");

    private String value;

    RoutineBodyEnum(String value) {
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
    public static RoutineBodyEnum fromValue(String value) {
      for (RoutineBodyEnum b : RoutineBodyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROUTINE_BODY = "routine_body";
  private RoutineBodyEnum routineBody;

  public static final String JSON_PROPERTY_ROUTINE_DEFINITION = "routine_definition";
  private String routineDefinition;

  public static final String JSON_PROPERTY_ROUTINE_DEPENDENCIES = "routine_dependencies";
  private DependencyList routineDependencies;

  /**
   * Function parameter style. **S** is the value for SQL.
   */
  public enum ParameterStyleEnum {
    S("S");

    private String value;

    ParameterStyleEnum(String value) {
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
    public static ParameterStyleEnum fromValue(String value) {
      for (ParameterStyleEnum b : ParameterStyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PARAMETER_STYLE = "parameter_style";
  private ParameterStyleEnum parameterStyle;

  public static final String JSON_PROPERTY_IS_DETERMINISTIC = "is_deterministic";
  private Boolean isDeterministic;

  /**
   * Function SQL data access.
   */
  public enum SqlDataAccessEnum {
    CONTAINS_SQL("CONTAINS_SQL"),
    
    READS_SQL_DATA("READS_SQL_DATA"),
    
    NO_SQL("NO_SQL");

    private String value;

    SqlDataAccessEnum(String value) {
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
    public static SqlDataAccessEnum fromValue(String value) {
      for (SqlDataAccessEnum b : SqlDataAccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SQL_DATA_ACCESS = "sql_data_access";
  private SqlDataAccessEnum sqlDataAccess;

  public static final String JSON_PROPERTY_IS_NULL_CALL = "is_null_call";
  private Boolean isNullCall;

  /**
   * Function security type.
   */
  public enum SecurityTypeEnum {
    DEFINER("DEFINER");

    private String value;

    SecurityTypeEnum(String value) {
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
    public static SecurityTypeEnum fromValue(String value) {
      for (SecurityTypeEnum b : SecurityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SECURITY_TYPE = "security_type";
  private SecurityTypeEnum securityType;

  public static final String JSON_PROPERTY_SPECIFIC_NAME = "specific_name";
  private String specificName;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private String properties;

  public static final String JSON_PROPERTY_EXTERNAL_LANGUAGE = "external_language";
  private String externalLanguage;

  public CreateFunction() { 
  }

  public CreateFunction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of function, relative to parent schema.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateFunction catalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

   /**
   * Name of parent catalog.
   * @return catalogName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CATALOG_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCatalogName() {
    return catalogName;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }


  public CreateFunction schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

   /**
   * Name of parent schema relative to its parent catalog.
   * @return schemaName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEMA_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSchemaName() {
    return schemaName;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public CreateFunction inputParams(FunctionParameterInfos inputParams) {
    this.inputParams = inputParams;
    return this;
  }

   /**
   * Get inputParams
   * @return inputParams
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INPUT_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FunctionParameterInfos getInputParams() {
    return inputParams;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputParams(FunctionParameterInfos inputParams) {
    this.inputParams = inputParams;
  }


  public CreateFunction dataType(ColumnTypeName dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ColumnTypeName getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataType(ColumnTypeName dataType) {
    this.dataType = dataType;
  }


  public CreateFunction fullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
    return this;
  }

   /**
   * Pretty printed function data type.
   * @return fullDataType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FULL_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFullDataType() {
    return fullDataType;
  }


  @JsonProperty(JSON_PROPERTY_FULL_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
  }


  public CreateFunction returnParams(FunctionParameterInfos returnParams) {
    this.returnParams = returnParams;
    return this;
  }

   /**
   * Get returnParams
   * @return returnParams
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FunctionParameterInfos getReturnParams() {
    return returnParams;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnParams(FunctionParameterInfos returnParams) {
    this.returnParams = returnParams;
  }


  public CreateFunction routineBody(RoutineBodyEnum routineBody) {
    this.routineBody = routineBody;
    return this;
  }

   /**
   * Function language. When **EXTERNAL** is used, the language of the routine function should be specified in the __external_language__ field,  and the __return_params__ of the function cannot be used (as **TABLE** return type is not supported), and the __sql_data_access__ field must be **NO_SQL**. 
   * @return routineBody
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTINE_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoutineBodyEnum getRoutineBody() {
    return routineBody;
  }


  @JsonProperty(JSON_PROPERTY_ROUTINE_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutineBody(RoutineBodyEnum routineBody) {
    this.routineBody = routineBody;
  }


  public CreateFunction routineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
    return this;
  }

   /**
   * Function body.
   * @return routineDefinition
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTINE_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoutineDefinition() {
    return routineDefinition;
  }


  @JsonProperty(JSON_PROPERTY_ROUTINE_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
  }


  public CreateFunction routineDependencies(DependencyList routineDependencies) {
    this.routineDependencies = routineDependencies;
    return this;
  }

   /**
   * Get routineDependencies
   * @return routineDependencies
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUTINE_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DependencyList getRoutineDependencies() {
    return routineDependencies;
  }


  @JsonProperty(JSON_PROPERTY_ROUTINE_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutineDependencies(DependencyList routineDependencies) {
    this.routineDependencies = routineDependencies;
  }


  public CreateFunction parameterStyle(ParameterStyleEnum parameterStyle) {
    this.parameterStyle = parameterStyle;
    return this;
  }

   /**
   * Function parameter style. **S** is the value for SQL.
   * @return parameterStyle
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARAMETER_STYLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ParameterStyleEnum getParameterStyle() {
    return parameterStyle;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_STYLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameterStyle(ParameterStyleEnum parameterStyle) {
    this.parameterStyle = parameterStyle;
  }


  public CreateFunction isDeterministic(Boolean isDeterministic) {
    this.isDeterministic = isDeterministic;
    return this;
  }

   /**
   * Whether the function is deterministic.
   * @return isDeterministic
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DETERMINISTIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDeterministic() {
    return isDeterministic;
  }


  @JsonProperty(JSON_PROPERTY_IS_DETERMINISTIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDeterministic(Boolean isDeterministic) {
    this.isDeterministic = isDeterministic;
  }


  public CreateFunction sqlDataAccess(SqlDataAccessEnum sqlDataAccess) {
    this.sqlDataAccess = sqlDataAccess;
    return this;
  }

   /**
   * Function SQL data access.
   * @return sqlDataAccess
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SQL_DATA_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SqlDataAccessEnum getSqlDataAccess() {
    return sqlDataAccess;
  }


  @JsonProperty(JSON_PROPERTY_SQL_DATA_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSqlDataAccess(SqlDataAccessEnum sqlDataAccess) {
    this.sqlDataAccess = sqlDataAccess;
  }


  public CreateFunction isNullCall(Boolean isNullCall) {
    this.isNullCall = isNullCall;
    return this;
  }

   /**
   * Function null call.
   * @return isNullCall
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_NULL_CALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsNullCall() {
    return isNullCall;
  }


  @JsonProperty(JSON_PROPERTY_IS_NULL_CALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsNullCall(Boolean isNullCall) {
    this.isNullCall = isNullCall;
  }


  public CreateFunction securityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
    return this;
  }

   /**
   * Function security type.
   * @return securityType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SECURITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SecurityTypeEnum getSecurityType() {
    return securityType;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecurityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
  }


  public CreateFunction specificName(String specificName) {
    this.specificName = specificName;
    return this;
  }

   /**
   * Specific name of the function; Reserved for future use.
   * @return specificName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SPECIFIC_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSpecificName() {
    return specificName;
  }


  @JsonProperty(JSON_PROPERTY_SPECIFIC_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpecificName(String specificName) {
    this.specificName = specificName;
  }


  public CreateFunction comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * User-provided free-form text description.
   * @return comment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public CreateFunction properties(String properties) {
    this.properties = properties;
    return this;
  }

   /**
   * JSON-serialized key-value pair map, encoded (escaped) as a string.
   * @return properties
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProperties(String properties) {
    this.properties = properties;
  }


  public CreateFunction externalLanguage(String externalLanguage) {
    this.externalLanguage = externalLanguage;
    return this;
  }

   /**
   * External language of the function.
   * @return externalLanguage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalLanguage() {
    return externalLanguage;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalLanguage(String externalLanguage) {
    this.externalLanguage = externalLanguage;
  }


  /**
   * Return true if this CreateFunction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFunction createFunction = (CreateFunction) o;
    return Objects.equals(this.name, createFunction.name) &&
        Objects.equals(this.catalogName, createFunction.catalogName) &&
        Objects.equals(this.schemaName, createFunction.schemaName) &&
        Objects.equals(this.inputParams, createFunction.inputParams) &&
        Objects.equals(this.dataType, createFunction.dataType) &&
        Objects.equals(this.fullDataType, createFunction.fullDataType) &&
        Objects.equals(this.returnParams, createFunction.returnParams) &&
        Objects.equals(this.routineBody, createFunction.routineBody) &&
        Objects.equals(this.routineDefinition, createFunction.routineDefinition) &&
        Objects.equals(this.routineDependencies, createFunction.routineDependencies) &&
        Objects.equals(this.parameterStyle, createFunction.parameterStyle) &&
        Objects.equals(this.isDeterministic, createFunction.isDeterministic) &&
        Objects.equals(this.sqlDataAccess, createFunction.sqlDataAccess) &&
        Objects.equals(this.isNullCall, createFunction.isNullCall) &&
        Objects.equals(this.securityType, createFunction.securityType) &&
        Objects.equals(this.specificName, createFunction.specificName) &&
        Objects.equals(this.comment, createFunction.comment) &&
        Objects.equals(this.properties, createFunction.properties) &&
        Objects.equals(this.externalLanguage, createFunction.externalLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, catalogName, schemaName, inputParams, dataType, fullDataType, returnParams, routineBody, routineDefinition, routineDependencies, parameterStyle, isDeterministic, sqlDataAccess, isNullCall, securityType, specificName, comment, properties, externalLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFunction {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    inputParams: ").append(toIndentedString(inputParams)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    fullDataType: ").append(toIndentedString(fullDataType)).append("\n");
    sb.append("    returnParams: ").append(toIndentedString(returnParams)).append("\n");
    sb.append("    routineBody: ").append(toIndentedString(routineBody)).append("\n");
    sb.append("    routineDefinition: ").append(toIndentedString(routineDefinition)).append("\n");
    sb.append("    routineDependencies: ").append(toIndentedString(routineDependencies)).append("\n");
    sb.append("    parameterStyle: ").append(toIndentedString(parameterStyle)).append("\n");
    sb.append("    isDeterministic: ").append(toIndentedString(isDeterministic)).append("\n");
    sb.append("    sqlDataAccess: ").append(toIndentedString(sqlDataAccess)).append("\n");
    sb.append("    isNullCall: ").append(toIndentedString(isNullCall)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    specificName: ").append(toIndentedString(specificName)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    externalLanguage: ").append(toIndentedString(externalLanguage)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `catalog_name` to the URL query string
    if (getCatalogName() != null) {
      joiner.add(String.format("%scatalog_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCatalogName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `schema_name` to the URL query string
    if (getSchemaName() != null) {
      joiner.add(String.format("%sschema_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSchemaName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `input_params` to the URL query string
    if (getInputParams() != null) {
      joiner.add(getInputParams().toUrlQueryString(prefix + "input_params" + suffix));
    }

    // add `data_type` to the URL query string
    if (getDataType() != null) {
      joiner.add(String.format("%sdata_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDataType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `full_data_type` to the URL query string
    if (getFullDataType() != null) {
      joiner.add(String.format("%sfull_data_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFullDataType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `return_params` to the URL query string
    if (getReturnParams() != null) {
      joiner.add(getReturnParams().toUrlQueryString(prefix + "return_params" + suffix));
    }

    // add `routine_body` to the URL query string
    if (getRoutineBody() != null) {
      joiner.add(String.format("%sroutine_body%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoutineBody()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `routine_definition` to the URL query string
    if (getRoutineDefinition() != null) {
      joiner.add(String.format("%sroutine_definition%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoutineDefinition()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `routine_dependencies` to the URL query string
    if (getRoutineDependencies() != null) {
      joiner.add(getRoutineDependencies().toUrlQueryString(prefix + "routine_dependencies" + suffix));
    }

    // add `parameter_style` to the URL query string
    if (getParameterStyle() != null) {
      joiner.add(String.format("%sparameter_style%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParameterStyle()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `is_deterministic` to the URL query string
    if (getIsDeterministic() != null) {
      joiner.add(String.format("%sis_deterministic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDeterministic()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sql_data_access` to the URL query string
    if (getSqlDataAccess() != null) {
      joiner.add(String.format("%ssql_data_access%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSqlDataAccess()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `is_null_call` to the URL query string
    if (getIsNullCall() != null) {
      joiner.add(String.format("%sis_null_call%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsNullCall()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `security_type` to the URL query string
    if (getSecurityType() != null) {
      joiner.add(String.format("%ssecurity_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecurityType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `specific_name` to the URL query string
    if (getSpecificName() != null) {
      joiner.add(String.format("%sspecific_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpecificName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `comment` to the URL query string
    if (getComment() != null) {
      joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `external_language` to the URL query string
    if (getExternalLanguage() != null) {
      joiner.add(String.format("%sexternal_language%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalLanguage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

