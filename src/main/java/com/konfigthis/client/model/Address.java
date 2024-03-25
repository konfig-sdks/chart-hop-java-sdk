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
import com.konfigthis.client.model.Geopoint;
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
 * Address
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Address {
  public static final String SERIALIZED_NAME_STREET1 = "street1";
  @SerializedName(SERIALIZED_NAME_STREET1)
  private String street1;

  public static final String SERIALIZED_NAME_STREET2 = "street2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public static final String SERIALIZED_NAME_STREET3 = "street3";
  @SerializedName(SERIALIZED_NAME_STREET3)
  private String street3;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL = "postal";
  @SerializedName(SERIALIZED_NAME_POSTAL)
  private String postal;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private Geopoint geo;

  public static final String SERIALIZED_NAME_APPROX_GEO = "approxGeo";
  @SerializedName(SERIALIZED_NAME_APPROX_GEO)
  private Geopoint approxGeo;

  public Address() {
  }

  public Address street1(String street1) {
    
    
    
    
    this.street1 = street1;
    return this;
  }

   /**
   * street address, line 1
   * @return street1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123 Anywhere Street", value = "street address, line 1")

  public String getStreet1() {
    return street1;
  }


  public void setStreet1(String street1) {
    
    
    
    this.street1 = street1;
  }


  public Address street2(String street2) {
    
    
    
    
    this.street2 = street2;
    return this;
  }

   /**
   * street address, line 2
   * @return street2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Apt 6L", value = "street address, line 2")

  public String getStreet2() {
    return street2;
  }


  public void setStreet2(String street2) {
    
    
    
    this.street2 = street2;
  }


  public Address street3(String street3) {
    
    
    
    
    this.street3 = street3;
    return this;
  }

   /**
   * street address, line 3
   * @return street3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sixth Floor", value = "street address, line 3")

  public String getStreet3() {
    return street3;
  }


  public void setStreet3(String street3) {
    
    
    
    this.street3 = street3;
  }


  public Address city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New York", value = "city")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public Address state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NY", value = "state")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public Address country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * country (two-digit ISO code)
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "NY", required = true, value = "country (two-digit ISO code)")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public Address postal(String postal) {
    
    
    
    
    this.postal = postal;
    return this;
  }

   /**
   * postal code
   * @return postal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001", value = "postal code")

  public String getPostal() {
    return postal;
  }


  public void setPostal(String postal) {
    
    
    
    this.postal = postal;
  }


  public Address geo(Geopoint geo) {
    
    
    
    
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geopoint getGeo() {
    return geo;
  }


  public void setGeo(Geopoint geo) {
    
    
    
    this.geo = geo;
  }


  public Address approxGeo(Geopoint approxGeo) {
    
    
    
    
    this.approxGeo = approxGeo;
    return this;
  }

   /**
   * Get approxGeo
   * @return approxGeo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geopoint getApproxGeo() {
    return approxGeo;
  }


  public void setApproxGeo(Geopoint approxGeo) {
    
    
    
    this.approxGeo = approxGeo;
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
   * @return the Address instance itself
   */
  public Address putAdditionalProperty(String key, Object value) {
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
    Address address = (Address) o;
    return Objects.equals(this.street1, address.street1) &&
        Objects.equals(this.street2, address.street2) &&
        Objects.equals(this.street3, address.street3) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.postal, address.postal) &&
        Objects.equals(this.geo, address.geo) &&
        Objects.equals(this.approxGeo, address.approxGeo)&&
        Objects.equals(this.additionalProperties, address.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street1, street2, street3, city, state, country, postal, geo, approxGeo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    street3: ").append(toIndentedString(street3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postal: ").append(toIndentedString(postal)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    approxGeo: ").append(toIndentedString(approxGeo)).append("\n");
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
    openapiFields.add("street1");
    openapiFields.add("street2");
    openapiFields.add("street3");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("country");
    openapiFields.add("postal");
    openapiFields.add("geo");
    openapiFields.add("approxGeo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Address
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Address.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Address is not found in the empty JSON string", Address.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Address.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("street1") != null && !jsonObj.get("street1").isJsonNull()) && !jsonObj.get("street1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street1").toString()));
      }
      if ((jsonObj.get("street2") != null && !jsonObj.get("street2").isJsonNull()) && !jsonObj.get("street2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street2").toString()));
      }
      if ((jsonObj.get("street3") != null && !jsonObj.get("street3").isJsonNull()) && !jsonObj.get("street3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street3").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("postal") != null && !jsonObj.get("postal").isJsonNull()) && !jsonObj.get("postal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal").toString()));
      }
      // validate the optional field `geo`
      if (jsonObj.get("geo") != null && !jsonObj.get("geo").isJsonNull()) {
        Geopoint.validateJsonObject(jsonObj.getAsJsonObject("geo"));
      }
      // validate the optional field `approxGeo`
      if (jsonObj.get("approxGeo") != null && !jsonObj.get("approxGeo").isJsonNull()) {
        Geopoint.validateJsonObject(jsonObj.getAsJsonObject("approxGeo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Address.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Address' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Address> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Address.class));

       return (TypeAdapter<T>) new TypeAdapter<Address>() {
           @Override
           public void write(JsonWriter out, Address value) throws IOException {
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
           public Address read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Address instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Address given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Address
  * @throws IOException if the JSON string is invalid with respect to Address
  */
  public static Address fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Address.class);
  }

 /**
  * Convert an instance of Address to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
