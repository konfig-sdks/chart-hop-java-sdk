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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * ExportField
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExportField {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_APPLIES_TO = "appliesTo";
  @SerializedName(SERIALIZED_NAME_APPLIES_TO)
  private String appliesTo;

  public static final String SERIALIZED_NAME_DATED = "dated";
  @SerializedName(SERIALIZED_NAME_DATED)
  private String dated;

  public static final String SERIALIZED_NAME_SENSITIVITY = "sensitivity";
  @SerializedName(SERIALIZED_NAME_SENSITIVITY)
  private String sensitivity;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_IN_USE = "inUse";
  @SerializedName(SERIALIZED_NAME_IN_USE)
  private String inUse;

  public ExportField() {
  }

  public ExportField label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * human-readable full name of field
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Job Summary", required = true, value = "human-readable full name of field")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public ExportField name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * short field name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "summary", required = true, value = "short field name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ExportField dataType(String dataType) {
    
    
    
    
    this.dataType = dataType;
    return this;
  }

   /**
   * entity type of field
   * @return dataType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "entity type of field")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    
    
    
    this.dataType = dataType;
  }


  public ExportField appliesTo(String appliesTo) {
    
    
    
    
    this.appliesTo = appliesTo;
    return this;
  }

   /**
   * type of field
   * @return appliesTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "type of field")

  public String getAppliesTo() {
    return appliesTo;
  }


  public void setAppliesTo(String appliesTo) {
    
    
    
    this.appliesTo = appliesTo;
  }


  public ExportField dated(String dated) {
    
    
    
    
    this.dated = dated;
    return this;
  }

   /**
   * dated
   * @return dated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "dated")

  public String getDated() {
    return dated;
  }


  public void setDated(String dated) {
    
    
    
    this.dated = dated;
  }


  public ExportField sensitivity(String sensitivity) {
    
    
    
    
    this.sensitivity = sensitivity;
    return this;
  }

   /**
   * sensitivity
   * @return sensitivity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "sensitivity")

  public String getSensitivity() {
    return sensitivity;
  }


  public void setSensitivity(String sensitivity) {
    
    
    
    this.sensitivity = sensitivity;
  }


  public ExportField category(String category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * category
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "category")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    
    
    
    this.category = category;
  }


  public ExportField inUse(String inUse) {
    
    
    
    
    this.inUse = inUse;
    return this;
  }

   /**
   * in use
   * @return inUse
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "in use")

  public String getInUse() {
    return inUse;
  }


  public void setInUse(String inUse) {
    
    
    
    this.inUse = inUse;
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
   * @return the ExportField instance itself
   */
  public ExportField putAdditionalProperty(String key, Object value) {
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
    ExportField exportField = (ExportField) o;
    return Objects.equals(this.label, exportField.label) &&
        Objects.equals(this.name, exportField.name) &&
        Objects.equals(this.dataType, exportField.dataType) &&
        Objects.equals(this.appliesTo, exportField.appliesTo) &&
        Objects.equals(this.dated, exportField.dated) &&
        Objects.equals(this.sensitivity, exportField.sensitivity) &&
        Objects.equals(this.category, exportField.category) &&
        Objects.equals(this.inUse, exportField.inUse)&&
        Objects.equals(this.additionalProperties, exportField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, name, dataType, appliesTo, dated, sensitivity, category, inUse, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportField {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
    sb.append("    dated: ").append(toIndentedString(dated)).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(sensitivity)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("name");
    openapiFields.add("dataType");
    openapiFields.add("appliesTo");
    openapiFields.add("dated");
    openapiFields.add("sensitivity");
    openapiFields.add("category");
    openapiFields.add("inUse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("dataType");
    openapiRequiredFields.add("appliesTo");
    openapiRequiredFields.add("dated");
    openapiRequiredFields.add("sensitivity");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("inUse");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExportField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExportField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportField is not found in the empty JSON string", ExportField.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExportField.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if (!jsonObj.get("appliesTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appliesTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appliesTo").toString()));
      }
      if (!jsonObj.get("dated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dated").toString()));
      }
      if (!jsonObj.get("sensitivity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitivity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sensitivity").toString()));
      }
      if (!jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (!jsonObj.get("inUse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inUse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inUse").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportField.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportField>() {
           @Override
           public void write(JsonWriter out, ExportField value) throws IOException {
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
           public ExportField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExportField instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExportField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportField
  * @throws IOException if the JSON string is invalid with respect to ExportField
  */
  public static ExportField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportField.class);
  }

 /**
  * Convert an instance of ExportField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

