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
 * GroupType
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GroupType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_REQUIRE_POSITIONS = "requirePositions";
  @SerializedName(SERIALIZED_NAME_REQUIRE_POSITIONS)
  private Boolean requirePositions;

  public static final String SERIALIZED_NAME_CREATE_ID = "createId";
  @SerializedName(SERIALIZED_NAME_CREATE_ID)
  private String createId;

  public static final String SERIALIZED_NAME_CREATE_AT = "createAt";
  @SerializedName(SERIALIZED_NAME_CREATE_AT)
  private String createAt;

  public static final String SERIALIZED_NAME_UPDATE_ID = "updateId";
  @SerializedName(SERIALIZED_NAME_UPDATE_ID)
  private String updateId;

  public static final String SERIALIZED_NAME_UPDATE_AT = "updateAt";
  @SerializedName(SERIALIZED_NAME_UPDATE_AT)
  private String updateAt;

  public static final String SERIALIZED_NAME_DELETE_ID = "deleteId";
  @SerializedName(SERIALIZED_NAME_DELETE_ID)
  private String deleteId;

  public static final String SERIALIZED_NAME_DELETE_AT = "deleteAt";
  @SerializedName(SERIALIZED_NAME_DELETE_AT)
  private String deleteAt;

  public GroupType() {
  }

  public GroupType id(String id) {
    
    
    
    
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


  public GroupType orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * parent organization id
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "parent organization id")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public GroupType name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * unique name of group
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Engineering", required = true, value = "unique name of group")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public GroupType slug(String slug) {
    
    
    
    
    this.slug = slug;
    return this;
  }

   /**
   * unique slug of group
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "engineering", required = true, value = "unique slug of group")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    
    
    
    this.slug = slug;
  }


  public GroupType requirePositions(Boolean requirePositions) {
    
    
    
    
    this.requirePositions = requirePositions;
    return this;
  }

   /**
   * whether the group requires members to be positions
   * @return requirePositions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether the group requires members to be positions")

  public Boolean getRequirePositions() {
    return requirePositions;
  }


  public void setRequirePositions(Boolean requirePositions) {
    
    
    
    this.requirePositions = requirePositions;
  }


  public GroupType createId(String createId) {
    
    
    
    
    this.createId = createId;
    return this;
  }

   /**
   * created by user id
   * @return createId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "created by user id")

  public String getCreateId() {
    return createId;
  }


  public void setCreateId(String createId) {
    
    
    
    this.createId = createId;
  }


  public GroupType createAt(String createAt) {
    
    
    
    
    this.createAt = createAt;
    return this;
  }

   /**
   * created timestamp
   * @return createAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", value = "created timestamp")

  public String getCreateAt() {
    return createAt;
  }


  public void setCreateAt(String createAt) {
    
    
    
    this.createAt = createAt;
  }


  public GroupType updateId(String updateId) {
    
    
    
    
    this.updateId = updateId;
    return this;
  }

   /**
   * last updated by user id
   * @return updateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "last updated by user id")

  public String getUpdateId() {
    return updateId;
  }


  public void setUpdateId(String updateId) {
    
    
    
    this.updateId = updateId;
  }


  public GroupType updateAt(String updateAt) {
    
    
    
    
    this.updateAt = updateAt;
    return this;
  }

   /**
   * last updated timestamp
   * @return updateAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", value = "last updated timestamp")

  public String getUpdateAt() {
    return updateAt;
  }


  public void setUpdateAt(String updateAt) {
    
    
    
    this.updateAt = updateAt;
  }


  public GroupType deleteId(String deleteId) {
    
    
    
    
    this.deleteId = deleteId;
    return this;
  }

   /**
   * deleted by user id
   * @return deleteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "deleted by user id")

  public String getDeleteId() {
    return deleteId;
  }


  public void setDeleteId(String deleteId) {
    
    
    
    this.deleteId = deleteId;
  }


  public GroupType deleteAt(String deleteAt) {
    
    
    
    
    this.deleteAt = deleteAt;
    return this;
  }

   /**
   * deleted timestamp
   * @return deleteAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", value = "deleted timestamp")

  public String getDeleteAt() {
    return deleteAt;
  }


  public void setDeleteAt(String deleteAt) {
    
    
    
    this.deleteAt = deleteAt;
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
   * @return the GroupType instance itself
   */
  public GroupType putAdditionalProperty(String key, Object value) {
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
    GroupType groupType = (GroupType) o;
    return Objects.equals(this.id, groupType.id) &&
        Objects.equals(this.orgId, groupType.orgId) &&
        Objects.equals(this.name, groupType.name) &&
        Objects.equals(this.slug, groupType.slug) &&
        Objects.equals(this.requirePositions, groupType.requirePositions) &&
        Objects.equals(this.createId, groupType.createId) &&
        Objects.equals(this.createAt, groupType.createAt) &&
        Objects.equals(this.updateId, groupType.updateId) &&
        Objects.equals(this.updateAt, groupType.updateAt) &&
        Objects.equals(this.deleteId, groupType.deleteId) &&
        Objects.equals(this.deleteAt, groupType.deleteAt)&&
        Objects.equals(this.additionalProperties, groupType.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, name, slug, requirePositions, createId, createAt, updateId, updateAt, deleteId, deleteAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    requirePositions: ").append(toIndentedString(requirePositions)).append("\n");
    sb.append("    createId: ").append(toIndentedString(createId)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteId: ").append(toIndentedString(deleteId)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("slug");
    openapiFields.add("requirePositions");
    openapiFields.add("createId");
    openapiFields.add("createAt");
    openapiFields.add("updateId");
    openapiFields.add("updateAt");
    openapiFields.add("deleteId");
    openapiFields.add("deleteAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("slug");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupType is not found in the empty JSON string", GroupType.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupType.openapiRequiredFields) {
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
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("createId") != null && !jsonObj.get("createId").isJsonNull()) && !jsonObj.get("createId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createId").toString()));
      }
      if ((jsonObj.get("createAt") != null && !jsonObj.get("createAt").isJsonNull()) && !jsonObj.get("createAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createAt").toString()));
      }
      if ((jsonObj.get("updateId") != null && !jsonObj.get("updateId").isJsonNull()) && !jsonObj.get("updateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateId").toString()));
      }
      if ((jsonObj.get("updateAt") != null && !jsonObj.get("updateAt").isJsonNull()) && !jsonObj.get("updateAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateAt").toString()));
      }
      if ((jsonObj.get("deleteId") != null && !jsonObj.get("deleteId").isJsonNull()) && !jsonObj.get("deleteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleteId").toString()));
      }
      if ((jsonObj.get("deleteAt") != null && !jsonObj.get("deleteAt").isJsonNull()) && !jsonObj.get("deleteAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleteAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleteAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupType.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupType>() {
           @Override
           public void write(JsonWriter out, GroupType value) throws IOException {
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
           public GroupType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupType instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupType
  * @throws IOException if the JSON string is invalid with respect to GroupType
  */
  public static GroupType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupType.class);
  }

 /**
  * Convert an instance of GroupType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
