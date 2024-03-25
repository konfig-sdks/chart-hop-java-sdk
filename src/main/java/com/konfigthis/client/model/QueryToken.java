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
 * QueryToken
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class QueryToken {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private Object params;

  public static final String SERIALIZED_NAME_ACCESS_COUNT = "accessCount";
  @SerializedName(SERIALIZED_NAME_ACCESS_COUNT)
  private Long accessCount;

  public static final String SERIALIZED_NAME_CREATE_AT = "createAt";
  @SerializedName(SERIALIZED_NAME_CREATE_AT)
  private String createAt;

  public static final String SERIALIZED_NAME_EXPIRE_AT = "expireAt";
  @SerializedName(SERIALIZED_NAME_EXPIRE_AT)
  private String expireAt;

  public static final String SERIALIZED_NAME_ACTIVE_AT = "activeAt";
  @SerializedName(SERIALIZED_NAME_ACTIVE_AT)
  private String activeAt;

  public QueryToken() {
  }

  public QueryToken id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * globally unique id for query token
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "globally unique id for query token")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public QueryToken token(String token) {
    
    
    
    
    this.token = token;
    return this;
  }

   /**
   * globally unique random token string
   * @return token
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "globally unique random token string")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    
    
    
    this.token = token;
  }


  public QueryToken orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * id of org
   * @return orgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "id of org")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public QueryToken userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * id of user
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "id of user")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
  }


  public QueryToken type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * query type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "query type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public QueryToken path(String path) {
    
    
    
    
    this.path = path;
    return this;
  }

   /**
   * query path (deprecated)
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "query path (deprecated)")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    
    
    
    this.path = path;
  }


  public QueryToken params(Object params) {
    
    
    
    
    this.params = params;
    return this;
  }

   /**
   * query params
   * @return params
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "query params")

  public Object getParams() {
    return params;
  }


  public void setParams(Object params) {
    
    
    
    this.params = params;
  }


  public QueryToken accessCount(Long accessCount) {
    
    
    
    
    this.accessCount = accessCount;
    return this;
  }

   /**
   * total number of uses
   * @return accessCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total number of uses")

  public Long getAccessCount() {
    return accessCount;
  }


  public void setAccessCount(Long accessCount) {
    
    
    
    this.accessCount = accessCount;
  }


  public QueryToken createAt(String createAt) {
    
    
    
    
    this.createAt = createAt;
    return this;
  }

   /**
   * created timestamp
   * @return createAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2016-11-16T13:40:47Z", required = true, value = "created timestamp")

  public String getCreateAt() {
    return createAt;
  }


  public void setCreateAt(String createAt) {
    
    
    
    this.createAt = createAt;
  }


  public QueryToken expireAt(String expireAt) {
    
    
    
    
    this.expireAt = expireAt;
    return this;
  }

   /**
   * expire timestamp
   * @return expireAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2016-11-16T13:40:47Z", required = true, value = "expire timestamp")

  public String getExpireAt() {
    return expireAt;
  }


  public void setExpireAt(String expireAt) {
    
    
    
    this.expireAt = expireAt;
  }


  public QueryToken activeAt(String activeAt) {
    
    
    
    
    this.activeAt = activeAt;
    return this;
  }

   /**
   * last active timestamp
   * @return activeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-11-16T13:40:47Z", value = "last active timestamp")

  public String getActiveAt() {
    return activeAt;
  }


  public void setActiveAt(String activeAt) {
    
    
    
    this.activeAt = activeAt;
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
   * @return the QueryToken instance itself
   */
  public QueryToken putAdditionalProperty(String key, Object value) {
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
    QueryToken queryToken = (QueryToken) o;
    return Objects.equals(this.id, queryToken.id) &&
        Objects.equals(this.token, queryToken.token) &&
        Objects.equals(this.orgId, queryToken.orgId) &&
        Objects.equals(this.userId, queryToken.userId) &&
        Objects.equals(this.type, queryToken.type) &&
        Objects.equals(this.path, queryToken.path) &&
        Objects.equals(this.params, queryToken.params) &&
        Objects.equals(this.accessCount, queryToken.accessCount) &&
        Objects.equals(this.createAt, queryToken.createAt) &&
        Objects.equals(this.expireAt, queryToken.expireAt) &&
        Objects.equals(this.activeAt, queryToken.activeAt)&&
        Objects.equals(this.additionalProperties, queryToken.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, orgId, userId, type, path, params, accessCount, createAt, expireAt, activeAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryToken {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    accessCount: ").append(toIndentedString(accessCount)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    activeAt: ").append(toIndentedString(activeAt)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("orgId");
    openapiFields.add("userId");
    openapiFields.add("type");
    openapiFields.add("path");
    openapiFields.add("params");
    openapiFields.add("accessCount");
    openapiFields.add("createAt");
    openapiFields.add("expireAt");
    openapiFields.add("activeAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("token");
    openapiRequiredFields.add("orgId");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("params");
    openapiRequiredFields.add("createAt");
    openapiRequiredFields.add("expireAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryToken
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!QueryToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryToken is not found in the empty JSON string", QueryToken.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryToken.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if (!jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("createAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createAt").toString()));
      }
      if (!jsonObj.get("expireAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expireAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expireAt").toString()));
      }
      if ((jsonObj.get("activeAt") != null && !jsonObj.get("activeAt").isJsonNull()) && !jsonObj.get("activeAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activeAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryToken.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryToken>() {
           @Override
           public void write(JsonWriter out, QueryToken value) throws IOException {
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
           public QueryToken read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QueryToken instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QueryToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryToken
  * @throws IOException if the JSON string is invalid with respect to QueryToken
  */
  public static QueryToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryToken.class);
  }

 /**
  * Convert an instance of QueryToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
