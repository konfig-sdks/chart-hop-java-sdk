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
import java.util.LinkedHashSet;
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
 * Category
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Category {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_FIELD_IDS = "fieldIds";
  @SerializedName(SERIALIZED_NAME_FIELD_IDS)
  private Set<String> fieldIds = null;

  public static final String SERIALIZED_NAME_NATIVE_FIELDS = "nativeFields";
  @SerializedName(SERIALIZED_NAME_NATIVE_FIELDS)
  private Set<String> nativeFields = null;

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

  public Category() {
  }

  public Category id(String id) {
    
    
    
    
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


  public Category orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * parent organization id (empty if built-in)
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "parent organization id (empty if built-in)")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public Category label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * human-readable label of category
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Performance", required = true, value = "human-readable label of category")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public Category fieldIds(Set<String> fieldIds) {
    
    
    
    
    this.fieldIds = fieldIds;
    return this;
  }

  public Category addFieldIdsItem(String fieldIdsItem) {
    if (this.fieldIds == null) {
      this.fieldIds = new LinkedHashSet<>();
    }
    this.fieldIds.add(fieldIdsItem);
    return this;
  }

   /**
   * set of field ids included in this category
   * @return fieldIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "set of field ids included in this category")

  public Set<String> getFieldIds() {
    return fieldIds;
  }


  public void setFieldIds(Set<String> fieldIds) {
    
    
    
    this.fieldIds = fieldIds;
  }


  public Category nativeFields(Set<String> nativeFields) {
    
    
    
    
    this.nativeFields = nativeFields;
    return this;
  }

  public Category addNativeFieldsItem(String nativeFieldsItem) {
    if (this.nativeFields == null) {
      this.nativeFields = new LinkedHashSet<>();
    }
    this.nativeFields.add(nativeFieldsItem);
    return this;
  }

   /**
   * set of native field names included in this category
   * @return nativeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "set of native field names included in this category")

  public Set<String> getNativeFields() {
    return nativeFields;
  }


  public void setNativeFields(Set<String> nativeFields) {
    
    
    
    this.nativeFields = nativeFields;
  }


  public Category createId(String createId) {
    
    
    
    
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


  public Category createAt(String createAt) {
    
    
    
    
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


  public Category updateId(String updateId) {
    
    
    
    
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


  public Category updateAt(String updateAt) {
    
    
    
    
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


  public Category deleteId(String deleteId) {
    
    
    
    
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


  public Category deleteAt(String deleteAt) {
    
    
    
    
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
   * @return the Category instance itself
   */
  public Category putAdditionalProperty(String key, Object value) {
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
    Category category = (Category) o;
    return Objects.equals(this.id, category.id) &&
        Objects.equals(this.orgId, category.orgId) &&
        Objects.equals(this.label, category.label) &&
        Objects.equals(this.fieldIds, category.fieldIds) &&
        Objects.equals(this.nativeFields, category.nativeFields) &&
        Objects.equals(this.createId, category.createId) &&
        Objects.equals(this.createAt, category.createAt) &&
        Objects.equals(this.updateId, category.updateId) &&
        Objects.equals(this.updateAt, category.updateAt) &&
        Objects.equals(this.deleteId, category.deleteId) &&
        Objects.equals(this.deleteAt, category.deleteAt)&&
        Objects.equals(this.additionalProperties, category.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, label, fieldIds, nativeFields, createId, createAt, updateId, updateAt, deleteId, deleteAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    fieldIds: ").append(toIndentedString(fieldIds)).append("\n");
    sb.append("    nativeFields: ").append(toIndentedString(nativeFields)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("fieldIds");
    openapiFields.add("nativeFields");
    openapiFields.add("createId");
    openapiFields.add("createAt");
    openapiFields.add("updateId");
    openapiFields.add("updateAt");
    openapiFields.add("deleteId");
    openapiFields.add("deleteAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("label");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Category
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Category.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Category is not found in the empty JSON string", Category.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Category.openapiRequiredFields) {
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
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fieldIds") != null && !jsonObj.get("fieldIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldIds` to be an array in the JSON string but got `%s`", jsonObj.get("fieldIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nativeFields") != null && !jsonObj.get("nativeFields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nativeFields` to be an array in the JSON string but got `%s`", jsonObj.get("nativeFields").toString()));
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
       if (!Category.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Category' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Category> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Category.class));

       return (TypeAdapter<T>) new TypeAdapter<Category>() {
           @Override
           public void write(JsonWriter out, Category value) throws IOException {
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
           public Category read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Category instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Category given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Category
  * @throws IOException if the JSON string is invalid with respect to Category
  */
  public static Category fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Category.class);
  }

 /**
  * Convert an instance of Category to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

