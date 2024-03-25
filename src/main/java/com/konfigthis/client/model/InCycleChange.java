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
import com.konfigthis.client.model.ChangeData;
import com.konfigthis.client.model.GuidelineCalculation;
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
 * InCycleChange
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InCycleChange {
  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private ChangeData change;

  public static final String SERIALIZED_NAME_GUIDELINES = "guidelines";
  @SerializedName(SERIALIZED_NAME_GUIDELINES)
  private List<GuidelineCalculation> guidelines = new ArrayList<>();

  public InCycleChange() {
  }

  public InCycleChange change(ChangeData change) {
    
    
    
    
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ChangeData getChange() {
    return change;
  }


  public void setChange(ChangeData change) {
    
    
    
    this.change = change;
  }


  public InCycleChange guidelines(List<GuidelineCalculation> guidelines) {
    
    
    
    
    this.guidelines = guidelines;
    return this;
  }

  public InCycleChange addGuidelinesItem(GuidelineCalculation guidelinesItem) {
    this.guidelines.add(guidelinesItem);
    return this;
  }

   /**
   * Get guidelines
   * @return guidelines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<GuidelineCalculation> getGuidelines() {
    return guidelines;
  }


  public void setGuidelines(List<GuidelineCalculation> guidelines) {
    
    
    
    this.guidelines = guidelines;
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
   * @return the InCycleChange instance itself
   */
  public InCycleChange putAdditionalProperty(String key, Object value) {
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
    InCycleChange inCycleChange = (InCycleChange) o;
    return Objects.equals(this.change, inCycleChange.change) &&
        Objects.equals(this.guidelines, inCycleChange.guidelines)&&
        Objects.equals(this.additionalProperties, inCycleChange.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, guidelines, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InCycleChange {\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    guidelines: ").append(toIndentedString(guidelines)).append("\n");
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
    openapiFields.add("guidelines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("change");
    openapiRequiredFields.add("guidelines");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InCycleChange
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InCycleChange.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InCycleChange is not found in the empty JSON string", InCycleChange.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InCycleChange.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `change`
      ChangeData.validateJsonObject(jsonObj.getAsJsonObject("change"));
      // ensure the json data is an array
      if (!jsonObj.get("guidelines").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `guidelines` to be an array in the JSON string but got `%s`", jsonObj.get("guidelines").toString()));
      }

      JsonArray jsonArrayguidelines = jsonObj.getAsJsonArray("guidelines");
      // validate the required field `guidelines` (array)
      for (int i = 0; i < jsonArrayguidelines.size(); i++) {
        GuidelineCalculation.validateJsonObject(jsonArrayguidelines.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InCycleChange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InCycleChange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InCycleChange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InCycleChange.class));

       return (TypeAdapter<T>) new TypeAdapter<InCycleChange>() {
           @Override
           public void write(JsonWriter out, InCycleChange value) throws IOException {
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
           public InCycleChange read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InCycleChange instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InCycleChange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InCycleChange
  * @throws IOException if the JSON string is invalid with respect to InCycleChange
  */
  public static InCycleChange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InCycleChange.class);
  }

 /**
  * Convert an instance of InCycleChange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
