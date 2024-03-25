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
import java.util.HashMap;
import java.util.Map;

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
 * StockGrant
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StockGrant {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STOCK = "stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private String stock;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_VEST_START_DATE = "vestStartDate";
  @SerializedName(SERIALIZED_NAME_VEST_START_DATE)
  private LocalDate vestStartDate;

  public static final String SERIALIZED_NAME_EXPIRE_DATE = "expireDate";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
  private LocalDate expireDate;

  public static final String SERIALIZED_NAME_SHARES = "shares";
  @SerializedName(SERIALIZED_NAME_SHARES)
  private Double shares;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  /**
   * type of grant
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    ISO("ISO"),
    
    NSO("NSO"),
    
    RSU("RSU"),
    
    SAR("SAR"),
    
    PERFORMANCE_SHARES("PERFORMANCE_SHARES"),
    
    PHANTOM_STOCK("PHANTOM_STOCK"),
    
    RSA("RSA");

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

  public static final String SERIALIZED_NAME_VEST_SCHEDULE = "vestSchedule";
  @SerializedName(SERIALIZED_NAME_VEST_SCHEDULE)
  private String vestSchedule;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "originalPrice";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private Double originalPrice;

  public static final String SERIALIZED_NAME_CURRENT_PRICE = "currentPrice";
  @SerializedName(SERIALIZED_NAME_CURRENT_PRICE)
  private Double currentPrice;

  public static final String SERIALIZED_NAME_VESTED_SHARES = "vestedShares";
  @SerializedName(SERIALIZED_NAME_VESTED_SHARES)
  private Double vestedShares;

  public static final String SERIALIZED_NAME_VESTED_SHARES_NEXT_YEAR = "vestedSharesNextYear";
  @SerializedName(SERIALIZED_NAME_VESTED_SHARES_NEXT_YEAR)
  private Double vestedSharesNextYear;

  public static final String SERIALIZED_NAME_VESTED_SHARES_BY_DATE = "vestedSharesByDate";
  @SerializedName(SERIALIZED_NAME_VESTED_SHARES_BY_DATE)
  private Map<String, Double> vestedSharesByDate = null;

  public static final String SERIALIZED_NAME_VEST_END_DATE = "vestEndDate";
  @SerializedName(SERIALIZED_NAME_VEST_END_DATE)
  private LocalDate vestEndDate;

  public static final String SERIALIZED_NAME_CANCEL_DATE = "cancelDate";
  @SerializedName(SERIALIZED_NAME_CANCEL_DATE)
  private LocalDate cancelDate;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public StockGrant() {
  }

  public StockGrant description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * human-readable description of vesting schedule
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "human-readable description of vesting schedule")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public StockGrant id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * unique identifier of grant
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "unique identifier of grant")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public StockGrant stock(String stock) {
    
    
    
    
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


  public StockGrant date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * date of grant
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "date of grant")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public StockGrant vestStartDate(LocalDate vestStartDate) {
    
    
    
    
    this.vestStartDate = vestStartDate;
    return this;
  }

   /**
   * vesting start date of grant
   * @return vestStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "vesting start date of grant")

  public LocalDate getVestStartDate() {
    return vestStartDate;
  }


  public void setVestStartDate(LocalDate vestStartDate) {
    
    
    
    this.vestStartDate = vestStartDate;
  }


  public StockGrant expireDate(LocalDate expireDate) {
    
    
    
    
    this.expireDate = expireDate;
    return this;
  }

   /**
   * expiration date of grant
   * @return expireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "expiration date of grant")

  public LocalDate getExpireDate() {
    return expireDate;
  }


  public void setExpireDate(LocalDate expireDate) {
    
    
    
    this.expireDate = expireDate;
  }


  public StockGrant shares(Double shares) {
    
    
    
    
    this.shares = shares;
    return this;
  }

  public StockGrant shares(Integer shares) {
    
    
    
    
    this.shares = shares.doubleValue();
    return this;
  }

   /**
   * number of shares granted
   * @return shares
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "number of shares granted")

  public Double getShares() {
    return shares;
  }


  public void setShares(Double shares) {
    
    
    
    this.shares = shares;
  }


  public StockGrant price(Double price) {
    
    
    
    
    this.price = price;
    return this;
  }

  public StockGrant price(Integer price) {
    
    
    
    
    this.price = price.doubleValue();
    return this;
  }

   /**
   * per share strike price
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "per share strike price")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    
    
    
    this.price = price;
  }


  public StockGrant type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * type of grant
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "type of grant")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public StockGrant vestSchedule(String vestSchedule) {
    
    
    
    
    this.vestSchedule = vestSchedule;
    return this;
  }

   /**
   * vesting schedule
   * @return vestSchedule
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "vesting schedule")

  public String getVestSchedule() {
    return vestSchedule;
  }


  public void setVestSchedule(String vestSchedule) {
    
    
    
    this.vestSchedule = vestSchedule;
  }


  public StockGrant originalPrice(Double originalPrice) {
    
    
    
    
    this.originalPrice = originalPrice;
    return this;
  }

  public StockGrant originalPrice(Integer originalPrice) {
    
    
    
    
    this.originalPrice = originalPrice.doubleValue();
    return this;
  }

   /**
   * original per share value of stock (grant price at time of issue)
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "original per share value of stock (grant price at time of issue)")

  public Double getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(Double originalPrice) {
    
    
    
    this.originalPrice = originalPrice;
  }


  public StockGrant currentPrice(Double currentPrice) {
    
    
    
    
    this.currentPrice = currentPrice;
    return this;
  }

  public StockGrant currentPrice(Integer currentPrice) {
    
    
    
    
    this.currentPrice = currentPrice.doubleValue();
    return this;
  }

   /**
   * current per share value of stock
   * @return currentPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current per share value of stock")

  public Double getCurrentPrice() {
    return currentPrice;
  }


  public void setCurrentPrice(Double currentPrice) {
    
    
    
    this.currentPrice = currentPrice;
  }


  public StockGrant vestedShares(Double vestedShares) {
    
    
    
    
    this.vestedShares = vestedShares;
    return this;
  }

  public StockGrant vestedShares(Integer vestedShares) {
    
    
    
    
    this.vestedShares = vestedShares.doubleValue();
    return this;
  }

   /**
   * current number of shares vested
   * @return vestedShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current number of shares vested")

  public Double getVestedShares() {
    return vestedShares;
  }


  public void setVestedShares(Double vestedShares) {
    
    
    
    this.vestedShares = vestedShares;
  }


  public StockGrant vestedSharesNextYear(Double vestedSharesNextYear) {
    
    
    
    
    this.vestedSharesNextYear = vestedSharesNextYear;
    return this;
  }

  public StockGrant vestedSharesNextYear(Integer vestedSharesNextYear) {
    
    
    
    
    this.vestedSharesNextYear = vestedSharesNextYear.doubleValue();
    return this;
  }

   /**
   * number of shares vested one year from today
   * @return vestedSharesNextYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of shares vested one year from today")

  public Double getVestedSharesNextYear() {
    return vestedSharesNextYear;
  }


  public void setVestedSharesNextYear(Double vestedSharesNextYear) {
    
    
    
    this.vestedSharesNextYear = vestedSharesNextYear;
  }


  public StockGrant vestedSharesByDate(Map<String, Double> vestedSharesByDate) {
    
    
    
    
    this.vestedSharesByDate = vestedSharesByDate;
    return this;
  }

  public StockGrant putVestedSharesByDateItem(String key, Double vestedSharesByDateItem) {
    if (this.vestedSharesByDate == null) {
      this.vestedSharesByDate = new HashMap<>();
    }
    this.vestedSharesByDate.put(key, vestedSharesByDateItem);
    return this;
  }

   /**
   * number of shares vested, by future date
   * @return vestedSharesByDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of shares vested, by future date")

  public Map<String, Double> getVestedSharesByDate() {
    return vestedSharesByDate;
  }


  public void setVestedSharesByDate(Map<String, Double> vestedSharesByDate) {
    
    
    
    this.vestedSharesByDate = vestedSharesByDate;
  }


  public StockGrant vestEndDate(LocalDate vestEndDate) {
    
    
    
    
    this.vestEndDate = vestEndDate;
    return this;
  }

   /**
   * vesting end date
   * @return vestEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "vesting end date")

  public LocalDate getVestEndDate() {
    return vestEndDate;
  }


  public void setVestEndDate(LocalDate vestEndDate) {
    
    
    
    this.vestEndDate = vestEndDate;
  }


  public StockGrant cancelDate(LocalDate cancelDate) {
    
    
    
    
    this.cancelDate = cancelDate;
    return this;
  }

   /**
   * cancellation date
   * @return cancelDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "cancellation date")

  public LocalDate getCancelDate() {
    return cancelDate;
  }


  public void setCancelDate(LocalDate cancelDate) {
    
    
    
    this.cancelDate = cancelDate;
  }


  public StockGrant details(String details) {
    
    
    
    
    this.details = details;
    return this;
  }

   /**
   * details of the grant (arbitrary text)
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "details of the grant (arbitrary text)")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    
    
    
    this.details = details;
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
   * @return the StockGrant instance itself
   */
  public StockGrant putAdditionalProperty(String key, Object value) {
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
    StockGrant stockGrant = (StockGrant) o;
    return Objects.equals(this.description, stockGrant.description) &&
        Objects.equals(this.id, stockGrant.id) &&
        Objects.equals(this.stock, stockGrant.stock) &&
        Objects.equals(this.date, stockGrant.date) &&
        Objects.equals(this.vestStartDate, stockGrant.vestStartDate) &&
        Objects.equals(this.expireDate, stockGrant.expireDate) &&
        Objects.equals(this.shares, stockGrant.shares) &&
        Objects.equals(this.price, stockGrant.price) &&
        Objects.equals(this.type, stockGrant.type) &&
        Objects.equals(this.vestSchedule, stockGrant.vestSchedule) &&
        Objects.equals(this.originalPrice, stockGrant.originalPrice) &&
        Objects.equals(this.currentPrice, stockGrant.currentPrice) &&
        Objects.equals(this.vestedShares, stockGrant.vestedShares) &&
        Objects.equals(this.vestedSharesNextYear, stockGrant.vestedSharesNextYear) &&
        Objects.equals(this.vestedSharesByDate, stockGrant.vestedSharesByDate) &&
        Objects.equals(this.vestEndDate, stockGrant.vestEndDate) &&
        Objects.equals(this.cancelDate, stockGrant.cancelDate) &&
        Objects.equals(this.details, stockGrant.details)&&
        Objects.equals(this.additionalProperties, stockGrant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, stock, date, vestStartDate, expireDate, shares, price, type, vestSchedule, originalPrice, currentPrice, vestedShares, vestedSharesNextYear, vestedSharesByDate, vestEndDate, cancelDate, details, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockGrant {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    vestStartDate: ").append(toIndentedString(vestStartDate)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vestSchedule: ").append(toIndentedString(vestSchedule)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    vestedShares: ").append(toIndentedString(vestedShares)).append("\n");
    sb.append("    vestedSharesNextYear: ").append(toIndentedString(vestedSharesNextYear)).append("\n");
    sb.append("    vestedSharesByDate: ").append(toIndentedString(vestedSharesByDate)).append("\n");
    sb.append("    vestEndDate: ").append(toIndentedString(vestEndDate)).append("\n");
    sb.append("    cancelDate: ").append(toIndentedString(cancelDate)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("stock");
    openapiFields.add("date");
    openapiFields.add("vestStartDate");
    openapiFields.add("expireDate");
    openapiFields.add("shares");
    openapiFields.add("price");
    openapiFields.add("type");
    openapiFields.add("vestSchedule");
    openapiFields.add("originalPrice");
    openapiFields.add("currentPrice");
    openapiFields.add("vestedShares");
    openapiFields.add("vestedSharesNextYear");
    openapiFields.add("vestedSharesByDate");
    openapiFields.add("vestEndDate");
    openapiFields.add("cancelDate");
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("stock");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("shares");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("vestSchedule");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StockGrant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StockGrant.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StockGrant is not found in the empty JSON string", StockGrant.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StockGrant.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("stock").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stock` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stock").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("vestSchedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vestSchedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vestSchedule").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StockGrant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StockGrant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StockGrant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StockGrant.class));

       return (TypeAdapter<T>) new TypeAdapter<StockGrant>() {
           @Override
           public void write(JsonWriter out, StockGrant value) throws IOException {
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
           public StockGrant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StockGrant instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StockGrant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StockGrant
  * @throws IOException if the JSON string is invalid with respect to StockGrant
  */
  public static StockGrant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StockGrant.class);
  }

 /**
  * Convert an instance of StockGrant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

