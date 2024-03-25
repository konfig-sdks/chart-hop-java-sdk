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
import java.time.LocalDate;

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
 * StockPrice
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StockPrice {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_STOCK = "stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private String stock;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  /**
   * type of valuation
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    COMMON_FMV("COMMON_FMV"),
    
    FUNDRAISE("FUNDRAISE"),
    
    GRANT("GRANT"),
    
    PUBLIC("PUBLIC");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_UPDATE_AT = "updateAt";
  @SerializedName(SERIALIZED_NAME_UPDATE_AT)
  private String updateAt;

  public static final String SERIALIZED_NAME_UPDATE_ID = "updateId";
  @SerializedName(SERIALIZED_NAME_UPDATE_ID)
  private String updateId;

  public StockPrice() {
  }

  public StockPrice id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * globally unique id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "globally unique id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public StockPrice orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * org id that this stock price derives from
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "org id that this stock price derives from")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public StockPrice stock(String stock) {
    
    
    
    
    this.stock = stock;
    return this;
  }

   /**
   * ticker symbol of this stock
   * @return stock
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GOOG", required = true, value = "ticker symbol of this stock")

  public String getStock() {
    return stock;
  }


  public void setStock(String stock) {
    
    
    
    this.stock = stock;
  }


  public StockPrice date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * date
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "date")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public StockPrice price(Double price) {
    
    
    
    
    this.price = price;
    return this;
  }

  public StockPrice price(Integer price) {
    
    
    
    
    this.price = price.doubleValue();
    return this;
  }

   /**
   * price per share
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "price per share")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    
    
    
    this.price = price;
  }


  public StockPrice type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * type of valuation
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "type of valuation")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public StockPrice total(Long total) {
    
    
    
    
    this.total = total;
    return this;
  }

   /**
   * total shares outstanding
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total shares outstanding")

  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    
    
    
    this.total = total;
  }


  public StockPrice updateAt(String updateAt) {
    
    
    
    
    this.updateAt = updateAt;
    return this;
  }

   /**
   * updated timestamp
   * @return updateAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", value = "updated timestamp")

  public String getUpdateAt() {
    return updateAt;
  }


  public void setUpdateAt(String updateAt) {
    
    
    
    this.updateAt = updateAt;
  }


  public StockPrice updateId(String updateId) {
    
    
    
    
    this.updateId = updateId;
    return this;
  }

   /**
   * updated by person
   * @return updateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "updated by person")

  public String getUpdateId() {
    return updateId;
  }


  public void setUpdateId(String updateId) {
    
    
    
    this.updateId = updateId;
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
   * @return the StockPrice instance itself
   */
  public StockPrice putAdditionalProperty(String key, Object value) {
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
    StockPrice stockPrice = (StockPrice) o;
    return Objects.equals(this.id, stockPrice.id) &&
        Objects.equals(this.orgId, stockPrice.orgId) &&
        Objects.equals(this.stock, stockPrice.stock) &&
        Objects.equals(this.date, stockPrice.date) &&
        Objects.equals(this.price, stockPrice.price) &&
        Objects.equals(this.type, stockPrice.type) &&
        Objects.equals(this.total, stockPrice.total) &&
        Objects.equals(this.updateAt, stockPrice.updateAt) &&
        Objects.equals(this.updateId, stockPrice.updateId)&&
        Objects.equals(this.additionalProperties, stockPrice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, stock, date, price, type, total, updateAt, updateId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockPrice {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("orgId");
    openapiFields.add("stock");
    openapiFields.add("date");
    openapiFields.add("price");
    openapiFields.add("type");
    openapiFields.add("total");
    openapiFields.add("updateAt");
    openapiFields.add("updateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("stock");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StockPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StockPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StockPrice is not found in the empty JSON string", StockPrice.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StockPrice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if (!jsonObj.get("stock").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stock` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stock").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("updateAt") != null && !jsonObj.get("updateAt").isJsonNull()) && !jsonObj.get("updateAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateAt").toString()));
      }
      if ((jsonObj.get("updateId") != null && !jsonObj.get("updateId").isJsonNull()) && !jsonObj.get("updateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StockPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StockPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StockPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StockPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<StockPrice>() {
           @Override
           public void write(JsonWriter out, StockPrice value) throws IOException {
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
           public StockPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StockPrice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StockPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StockPrice
  * @throws IOException if the JSON string is invalid with respect to StockPrice
  */
  public static StockPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StockPrice.class);
  }

 /**
  * Convert an instance of StockPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

