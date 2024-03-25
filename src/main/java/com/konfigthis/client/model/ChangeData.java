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
import com.konfigthis.client.model.Change;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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
 * ChangeData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChangeData {
  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private Change change;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Map<String, Object> data = new HashMap<>();

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;

  public static final String SERIALIZED_NAME_LOCKED_FIELDS = "lockedFields";
  @SerializedName(SERIALIZED_NAME_LOCKED_FIELDS)
  private Set<String> lockedFields = null;

  public ChangeData() {
  }

  public ChangeData change(Change change) {
    
    
    
    
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Change getChange() {
    return change;
  }


  public void setChange(Change change) {
    
    
    
    this.change = change;
  }


  public ChangeData data(Map<String, Object> data) {
    
    
    
    
    this.data = data;
    return this;
  }

  public ChangeData putDataItem(String key, Object dataItem) {
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * the returned data fields requested
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the returned data fields requested")

  public Map<String, Object> getData() {
    return data;
  }


  public void setData(Map<String, Object> data) {
    
    
    
    this.data = data;
  }


  public ChangeData cost(Double cost) {
    
    
    
    
    this.cost = cost;
    return this;
  }

  public ChangeData cost(Integer cost) {
    
    
    
    
    this.cost = cost.doubleValue();
    return this;
  }

   /**
   * the annualized impact of this change, denoted in organization&#39;s currency
   * @return cost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the annualized impact of this change, denoted in organization's currency")

  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    
    
    
    this.cost = cost;
  }


  public ChangeData lockedFields(Set<String> lockedFields) {
    
    
    
    
    this.lockedFields = lockedFields;
    return this;
  }

  public ChangeData addLockedFieldsItem(String lockedFieldsItem) {
    if (this.lockedFields == null) {
      this.lockedFields = new LinkedHashSet<>();
    }
    this.lockedFields.add(lockedFieldsItem);
    return this;
  }

   /**
   * set of locked fields for this change
   * @return lockedFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "set of locked fields for this change")

  public Set<String> getLockedFields() {
    return lockedFields;
  }


  public void setLockedFields(Set<String> lockedFields) {
    
    
    
    this.lockedFields = lockedFields;
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
   * @return the ChangeData instance itself
   */
  public ChangeData putAdditionalProperty(String key, Object value) {
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
    ChangeData changeData = (ChangeData) o;
    return Objects.equals(this.change, changeData.change) &&
        Objects.equals(this.data, changeData.data) &&
        Objects.equals(this.cost, changeData.cost) &&
        Objects.equals(this.lockedFields, changeData.lockedFields)&&
        Objects.equals(this.additionalProperties, changeData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, data, cost, lockedFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeData {\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    lockedFields: ").append(toIndentedString(lockedFields)).append("\n");
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
    openapiFields.add("change");
    openapiFields.add("data");
    openapiFields.add("cost");
    openapiFields.add("lockedFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("change");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("cost");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangeData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChangeData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeData is not found in the empty JSON string", ChangeData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChangeData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `change`
      Change.validateJsonObject(jsonObj.getAsJsonObject("change"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("lockedFields") != null && !jsonObj.get("lockedFields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lockedFields` to be an array in the JSON string but got `%s`", jsonObj.get("lockedFields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeData.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeData>() {
           @Override
           public void write(JsonWriter out, ChangeData value) throws IOException {
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
           public ChangeData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChangeData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChangeData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeData
  * @throws IOException if the JSON string is invalid with respect to ChangeData
  */
  public static ChangeData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeData.class);
  }

 /**
  * Convert an instance of ChangeData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
