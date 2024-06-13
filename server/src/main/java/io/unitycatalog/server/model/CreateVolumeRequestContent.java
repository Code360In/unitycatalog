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
import io.unitycatalog.server.model.VolumeType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateVolumeRequestContent
 */
@JsonPropertyOrder({
  CreateVolumeRequestContent.JSON_PROPERTY_CATALOG_NAME,
  CreateVolumeRequestContent.JSON_PROPERTY_SCHEMA_NAME,
  CreateVolumeRequestContent.JSON_PROPERTY_NAME,
  CreateVolumeRequestContent.JSON_PROPERTY_VOLUME_TYPE,
  CreateVolumeRequestContent.JSON_PROPERTY_COMMENT,
  CreateVolumeRequestContent.JSON_PROPERTY_STORAGE_LOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CreateVolumeRequestContent {
  public static final String JSON_PROPERTY_CATALOG_NAME = "catalog_name";
  private String catalogName;

  public static final String JSON_PROPERTY_SCHEMA_NAME = "schema_name";
  private String schemaName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VOLUME_TYPE = "volume_type";
  private VolumeType volumeType;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_STORAGE_LOCATION = "storage_location";
  private String storageLocation;

  public CreateVolumeRequestContent() {
  }

  public CreateVolumeRequestContent catalogName(String catalogName) {
    
    this.catalogName = catalogName;
    return this;
  }

   /**
   * The name of the catalog where the schema and the volume are
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


  public CreateVolumeRequestContent schemaName(String schemaName) {
    
    this.schemaName = schemaName;
    return this;
  }

   /**
   * The name of the schema where the volume is
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


  public CreateVolumeRequestContent name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the volume
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


  public CreateVolumeRequestContent volumeType(VolumeType volumeType) {
    
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VOLUME_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VolumeType getVolumeType() {
    return volumeType;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVolumeType(VolumeType volumeType) {
    this.volumeType = volumeType;
  }


  public CreateVolumeRequestContent comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The comment attached to the volume
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


  public CreateVolumeRequestContent storageLocation(String storageLocation) {
    
    this.storageLocation = storageLocation;
    return this;
  }

   /**
   * The storage location of the volume
   * @return storageLocation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STORAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStorageLocation() {
    return storageLocation;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVolumeRequestContent createVolumeRequestContent = (CreateVolumeRequestContent) o;
    return Objects.equals(this.catalogName, createVolumeRequestContent.catalogName) &&
        Objects.equals(this.schemaName, createVolumeRequestContent.schemaName) &&
        Objects.equals(this.name, createVolumeRequestContent.name) &&
        Objects.equals(this.volumeType, createVolumeRequestContent.volumeType) &&
        Objects.equals(this.comment, createVolumeRequestContent.comment) &&
        Objects.equals(this.storageLocation, createVolumeRequestContent.storageLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName, name, volumeType, comment, storageLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVolumeRequestContent {\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
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

