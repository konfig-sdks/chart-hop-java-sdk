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
 * OrgStockData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrgStockData {
  public static final String SERIALIZED_NAME_STRIKE_PRICE = "strikePrice";
  @SerializedName(SERIALIZED_NAME_STRIKE_PRICE)
  private Double strikePrice;

  public static final String SERIALIZED_NAME_GRANT_PRICE = "grantPrice";
  @SerializedName(SERIALIZED_NAME_GRANT_PRICE)
  private Double grantPrice;

  public static final String SERIALIZED_NAME_TOTAL_SHARES = "totalShares";
  @SerializedName(SERIALIZED_NAME_TOTAL_SHARES)
  private Long totalShares;

  public OrgStockData() {
  }

  public OrgStockData strikePrice(Double strikePrice) {
    
    
    
    
    this.strikePrice = strikePrice;
    return this;
  }

  public OrgStockData strikePrice(Integer strikePrice) {
    
    
    
    
    this.strikePrice = strikePrice.doubleValue();
    return this;
  }

   /**
   * Get strikePrice
   * @return strikePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getStrikePrice() {
    return strikePrice;
  }


  public void setStrikePrice(Double strikePrice) {
    
    
    
    this.strikePrice = strikePrice;
  }


  public OrgStockData grantPrice(Double grantPrice) {
    
    
    
    
    this.grantPrice = grantPrice;
    return this;
  }

  public OrgStockData grantPrice(Integer grantPrice) {
    
    
    
    
    this.grantPrice = grantPrice.doubleValue();
    return this;
  }

   /**
   * Get grantPrice
   * @return grantPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGrantPrice() {
    return grantPrice;
  }


  public void setGrantPrice(Double grantPrice) {
    
    
    
    this.grantPrice = grantPrice;
  }


  public OrgStockData totalShares(Long totalShares) {
    
    
    
    
    this.totalShares = totalShares;
    return this;
  }

   /**
   * Get totalShares
   * @return totalShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalShares() {
    return totalShares;
  }


  public void setTotalShares(Long totalShares) {
    
    
    
    this.totalShares = totalShares;
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
   * @return the OrgStockData instance itself
   */
  public OrgStockData putAdditionalProperty(String key, Object value) {
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
    OrgStockData orgStockData = (OrgStockData) o;
    return Objects.equals(this.strikePrice, orgStockData.strikePrice) &&
        Objects.equals(this.grantPrice, orgStockData.grantPrice) &&
        Objects.equals(this.totalShares, orgStockData.totalShares)&&
        Objects.equals(this.additionalProperties, orgStockData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strikePrice, grantPrice, totalShares, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgStockData {\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    grantPrice: ").append(toIndentedString(grantPrice)).append("\n");
    sb.append("    totalShares: ").append(toIndentedString(totalShares)).append("\n");
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
    openapiFields.add("strikePrice");
    openapiFields.add("grantPrice");
    openapiFields.add("totalShares");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrgStockData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrgStockData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgStockData is not found in the empty JSON string", OrgStockData.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgStockData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgStockData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgStockData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgStockData.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgStockData>() {
           @Override
           public void write(JsonWriter out, OrgStockData value) throws IOException {
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
           public OrgStockData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrgStockData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrgStockData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrgStockData
  * @throws IOException if the JSON string is invalid with respect to OrgStockData
  */
  public static OrgStockData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgStockData.class);
  }

 /**
  * Convert an instance of OrgStockData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

