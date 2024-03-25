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
import com.konfigthis.client.model.Bucket;
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
 * RaisePercentageHistogram
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RaisePercentageHistogram {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Double min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Double max;

  public static final String SERIALIZED_NAME_INCREMENT = "increment";
  @SerializedName(SERIALIZED_NAME_INCREMENT)
  private Double increment;

  public static final String SERIALIZED_NAME_BUCKETS = "buckets";
  @SerializedName(SERIALIZED_NAME_BUCKETS)
  private List<Bucket> buckets = new ArrayList<>();

  public RaisePercentageHistogram() {
  }

  public RaisePercentageHistogram min(Double min) {
    
    
    
    
    this.min = min;
    return this;
  }

  public RaisePercentageHistogram min(Integer min) {
    
    
    
    
    this.min = min.doubleValue();
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getMin() {
    return min;
  }


  public void setMin(Double min) {
    
    
    
    this.min = min;
  }


  public RaisePercentageHistogram max(Double max) {
    
    
    
    
    this.max = max;
    return this;
  }

  public RaisePercentageHistogram max(Integer max) {
    
    
    
    
    this.max = max.doubleValue();
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getMax() {
    return max;
  }


  public void setMax(Double max) {
    
    
    
    this.max = max;
  }


  public RaisePercentageHistogram increment(Double increment) {
    
    
    
    
    this.increment = increment;
    return this;
  }

  public RaisePercentageHistogram increment(Integer increment) {
    
    
    
    
    this.increment = increment.doubleValue();
    return this;
  }

   /**
   * Get increment
   * @return increment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getIncrement() {
    return increment;
  }


  public void setIncrement(Double increment) {
    
    
    
    this.increment = increment;
  }


  public RaisePercentageHistogram buckets(List<Bucket> buckets) {
    
    
    
    
    this.buckets = buckets;
    return this;
  }

  public RaisePercentageHistogram addBucketsItem(Bucket bucketsItem) {
    this.buckets.add(bucketsItem);
    return this;
  }

   /**
   * Get buckets
   * @return buckets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Bucket> getBuckets() {
    return buckets;
  }


  public void setBuckets(List<Bucket> buckets) {
    
    
    
    this.buckets = buckets;
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
   * @return the RaisePercentageHistogram instance itself
   */
  public RaisePercentageHistogram putAdditionalProperty(String key, Object value) {
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
    RaisePercentageHistogram raisePercentageHistogram = (RaisePercentageHistogram) o;
    return Objects.equals(this.min, raisePercentageHistogram.min) &&
        Objects.equals(this.max, raisePercentageHistogram.max) &&
        Objects.equals(this.increment, raisePercentageHistogram.increment) &&
        Objects.equals(this.buckets, raisePercentageHistogram.buckets)&&
        Objects.equals(this.additionalProperties, raisePercentageHistogram.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, increment, buckets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaisePercentageHistogram {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    increment: ").append(toIndentedString(increment)).append("\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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
    openapiFields.add("min");
    openapiFields.add("max");
    openapiFields.add("increment");
    openapiFields.add("buckets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("min");
    openapiRequiredFields.add("max");
    openapiRequiredFields.add("increment");
    openapiRequiredFields.add("buckets");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RaisePercentageHistogram
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RaisePercentageHistogram.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RaisePercentageHistogram is not found in the empty JSON string", RaisePercentageHistogram.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RaisePercentageHistogram.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("buckets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buckets` to be an array in the JSON string but got `%s`", jsonObj.get("buckets").toString()));
      }

      JsonArray jsonArraybuckets = jsonObj.getAsJsonArray("buckets");
      // validate the required field `buckets` (array)
      for (int i = 0; i < jsonArraybuckets.size(); i++) {
        Bucket.validateJsonObject(jsonArraybuckets.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RaisePercentageHistogram.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RaisePercentageHistogram' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RaisePercentageHistogram> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RaisePercentageHistogram.class));

       return (TypeAdapter<T>) new TypeAdapter<RaisePercentageHistogram>() {
           @Override
           public void write(JsonWriter out, RaisePercentageHistogram value) throws IOException {
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
           public RaisePercentageHistogram read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RaisePercentageHistogram instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RaisePercentageHistogram given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RaisePercentageHistogram
  * @throws IOException if the JSON string is invalid with respect to RaisePercentageHistogram
  */
  public static RaisePercentageHistogram fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RaisePercentageHistogram.class);
  }

 /**
  * Convert an instance of RaisePercentageHistogram to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

