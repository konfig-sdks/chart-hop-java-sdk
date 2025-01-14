/*
 * ChartHop API
 * REST API for ChartHop
 *
 * The version of the OpenAPI document: V1.0.0
 * Contact: support@charthop.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.CompReviewWorkbookColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * CompReviewReviewerWorkbook
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CompReviewReviewerWorkbook {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<CompReviewWorkbookColumn> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_NUM_FROZEN_COLUMNS = "numFrozenColumns";
  @SerializedName(SERIALIZED_NAME_NUM_FROZEN_COLUMNS)
  private Integer numFrozenColumns;

  public static final String SERIALIZED_NAME_MORE_INFO_URL = "moreInfoUrl";
  @SerializedName(SERIALIZED_NAME_MORE_INFO_URL)
  private String moreInfoUrl;

  public static final String SERIALIZED_NAME_MORE_INFO_LABEL = "moreInfoLabel";
  @SerializedName(SERIALIZED_NAME_MORE_INFO_LABEL)
  private String moreInfoLabel;

  public static final String SERIALIZED_NAME_IS_EDITED = "isEdited";
  @SerializedName(SERIALIZED_NAME_IS_EDITED)
  private Boolean isEdited;

  public CompReviewReviewerWorkbook() {
  }

  public CompReviewReviewerWorkbook columns(List<CompReviewWorkbookColumn> columns) {
    
    
    
    
    this.columns = columns;
    return this;
  }

  public CompReviewReviewerWorkbook addColumnsItem(CompReviewWorkbookColumn columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * ordering and settings of columns in workbook
   * @return columns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ordering and settings of columns in workbook")

  public List<CompReviewWorkbookColumn> getColumns() {
    return columns;
  }


  public void setColumns(List<CompReviewWorkbookColumn> columns) {
    
    
    
    this.columns = columns;
  }


  public CompReviewReviewerWorkbook numFrozenColumns(Integer numFrozenColumns) {
    
    
    
    
    this.numFrozenColumns = numFrozenColumns;
    return this;
  }

   /**
   * number of frozen columns at start of workbook
   * @return numFrozenColumns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of frozen columns at start of workbook")

  public Integer getNumFrozenColumns() {
    return numFrozenColumns;
  }


  public void setNumFrozenColumns(Integer numFrozenColumns) {
    
    
    
    this.numFrozenColumns = numFrozenColumns;
  }


  public CompReviewReviewerWorkbook moreInfoUrl(String moreInfoUrl) {
    
    
    
    
    this.moreInfoUrl = moreInfoUrl;
    return this;
  }

   /**
   * optional link to see additional customer documentation
   * @return moreInfoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional link to see additional customer documentation")

  public String getMoreInfoUrl() {
    return moreInfoUrl;
  }


  public void setMoreInfoUrl(String moreInfoUrl) {
    
    
    
    this.moreInfoUrl = moreInfoUrl;
  }


  public CompReviewReviewerWorkbook moreInfoLabel(String moreInfoLabel) {
    
    
    
    
    this.moreInfoLabel = moreInfoLabel;
    return this;
  }

   /**
   * optional label for additional customer documentation
   * @return moreInfoLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional label for additional customer documentation")

  public String getMoreInfoLabel() {
    return moreInfoLabel;
  }


  public void setMoreInfoLabel(String moreInfoLabel) {
    
    
    
    this.moreInfoLabel = moreInfoLabel;
  }


  public CompReviewReviewerWorkbook isEdited(Boolean isEdited) {
    
    
    
    
    this.isEdited = isEdited;
    return this;
  }

   /**
   * whether the default config has been modified
   * @return isEdited
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether the default config has been modified")

  public Boolean getIsEdited() {
    return isEdited;
  }


  public void setIsEdited(Boolean isEdited) {
    
    
    
    this.isEdited = isEdited;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CompReviewReviewerWorkbook instance itself
   */
  public CompReviewReviewerWorkbook putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompReviewReviewerWorkbook compReviewReviewerWorkbook = (CompReviewReviewerWorkbook) o;
    return Objects.equals(this.columns, compReviewReviewerWorkbook.columns) &&
        Objects.equals(this.numFrozenColumns, compReviewReviewerWorkbook.numFrozenColumns) &&
        Objects.equals(this.moreInfoUrl, compReviewReviewerWorkbook.moreInfoUrl) &&
        Objects.equals(this.moreInfoLabel, compReviewReviewerWorkbook.moreInfoLabel) &&
        Objects.equals(this.isEdited, compReviewReviewerWorkbook.isEdited)&&
        Objects.equals(this.additionalProperties, compReviewReviewerWorkbook.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, numFrozenColumns, moreInfoUrl, moreInfoLabel, isEdited, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompReviewReviewerWorkbook {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    numFrozenColumns: ").append(toIndentedString(numFrozenColumns)).append("\n");
    sb.append("    moreInfoUrl: ").append(toIndentedString(moreInfoUrl)).append("\n");
    sb.append("    moreInfoLabel: ").append(toIndentedString(moreInfoLabel)).append("\n");
    sb.append("    isEdited: ").append(toIndentedString(isEdited)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("columns");
    openapiFields.add("numFrozenColumns");
    openapiFields.add("moreInfoUrl");
    openapiFields.add("moreInfoLabel");
    openapiFields.add("isEdited");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("columns");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompReviewReviewerWorkbook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompReviewReviewerWorkbook.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompReviewReviewerWorkbook is not found in the empty JSON string", CompReviewReviewerWorkbook.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompReviewReviewerWorkbook.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
      }

      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      // validate the required field `columns` (array)
      for (int i = 0; i < jsonArraycolumns.size(); i++) {
        CompReviewWorkbookColumn.validateJsonObject(jsonArraycolumns.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("moreInfoUrl") != null && !jsonObj.get("moreInfoUrl").isJsonNull()) && !jsonObj.get("moreInfoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moreInfoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moreInfoUrl").toString()));
      }
      if ((jsonObj.get("moreInfoLabel") != null && !jsonObj.get("moreInfoLabel").isJsonNull()) && !jsonObj.get("moreInfoLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moreInfoLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moreInfoLabel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompReviewReviewerWorkbook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompReviewReviewerWorkbook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompReviewReviewerWorkbook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompReviewReviewerWorkbook.class));

       return (TypeAdapter<T>) new TypeAdapter<CompReviewReviewerWorkbook>() {
           @Override
           public void write(JsonWriter out, CompReviewReviewerWorkbook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CompReviewReviewerWorkbook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CompReviewReviewerWorkbook instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CompReviewReviewerWorkbook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompReviewReviewerWorkbook
  * @throws IOException if the JSON string is invalid with respect to CompReviewReviewerWorkbook
  */
  public static CompReviewReviewerWorkbook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompReviewReviewerWorkbook.class);
  }

 /**
  * Convert an instance of CompReviewReviewerWorkbook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

