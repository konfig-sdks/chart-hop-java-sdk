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
 * ApprovalChain
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApprovalChain {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  /**
   * entity type
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
 public enum EntityTypeEnum {
    COMP_REVIEW("COMP_REVIEW"),
    
    SCENARIO("SCENARIO"),
    
    TIMEOFF("TIMEOFF");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private EntityTypeEnum entityType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_PREVIEW = "isPreview";
  @SerializedName(SERIALIZED_NAME_IS_PREVIEW)
  private Boolean isPreview;

  public static final String SERIALIZED_NAME_FALLBACK_APPROVER_JOB_ID = "fallbackApproverJobId";
  @SerializedName(SERIALIZED_NAME_FALLBACK_APPROVER_JOB_ID)
  private String fallbackApproverJobId;

  public static final String SERIALIZED_NAME_FALLBACK_APPROVER_JOB_ERROR = "fallbackApproverJobError";
  @SerializedName(SERIALIZED_NAME_FALLBACK_APPROVER_JOB_ERROR)
  private String fallbackApproverJobError;

  public static final String SERIALIZED_NAME_APPROVAL_NOTIFIER_USER_IDS = "approvalNotifierUserIds";
  @SerializedName(SERIALIZED_NAME_APPROVAL_NOTIFIER_USER_IDS)
  private Set<String> approvalNotifierUserIds = new LinkedHashSet<>();

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

  public ApprovalChain() {
  }

  public ApprovalChain id(String id) {
    
    
    
    
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


  public ApprovalChain orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * parent organization id
   * @return orgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "parent organization id")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public ApprovalChain entityId(String entityId) {
    
    
    
    
    this.entityId = entityId;
    return this;
  }

   /**
   * entity id
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "entity id")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    
    
    
    this.entityId = entityId;
  }


  public ApprovalChain entityType(EntityTypeEnum entityType) {
    
    
    
    
    this.entityType = entityType;
    return this;
  }

   /**
   * entity type
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SCENARIO", value = "entity type")

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  public void setEntityType(EntityTypeEnum entityType) {
    
    
    
    this.entityType = entityType;
  }


  public ApprovalChain name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * human-readable name of approval chain
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Comp Review 06/15/2022", required = true, value = "human-readable name of approval chain")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ApprovalChain isPreview(Boolean isPreview) {
    
    
    
    
    this.isPreview = isPreview;
    return this;
  }

   /**
   * isPreview specifies that this is a preview for implementations that use it (e.g. Compensation Reviews)
   * @return isPreview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "isPreview specifies that this is a preview for implementations that use it (e.g. Compensation Reviews)")

  public Boolean getIsPreview() {
    return isPreview;
  }


  public void setIsPreview(Boolean isPreview) {
    
    
    
    this.isPreview = isPreview;
  }


  public ApprovalChain fallbackApproverJobId(String fallbackApproverJobId) {
    
    
    
    
    this.fallbackApproverJobId = fallbackApproverJobId;
    return this;
  }

   /**
   * the jobId of the fallback approver
   * @return fallbackApproverJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "the jobId of the fallback approver")

  public String getFallbackApproverJobId() {
    return fallbackApproverJobId;
  }


  public void setFallbackApproverJobId(String fallbackApproverJobId) {
    
    
    
    this.fallbackApproverJobId = fallbackApproverJobId;
  }


  public ApprovalChain fallbackApproverJobError(String fallbackApproverJobError) {
    
    
    
    
    this.fallbackApproverJobError = fallbackApproverJobError;
    return this;
  }

   /**
   * most recent error for fallback approver
   * @return fallbackApproverJobError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "most recent error for fallback approver")

  public String getFallbackApproverJobError() {
    return fallbackApproverJobError;
  }


  public void setFallbackApproverJobError(String fallbackApproverJobError) {
    
    
    
    this.fallbackApproverJobError = fallbackApproverJobError;
  }


  public ApprovalChain approvalNotifierUserIds(Set<String> approvalNotifierUserIds) {
    
    
    
    
    this.approvalNotifierUserIds = approvalNotifierUserIds;
    return this;
  }

  public ApprovalChain addApprovalNotifierUserIdsItem(String approvalNotifierUserIdsItem) {
    this.approvalNotifierUserIds.add(approvalNotifierUserIdsItem);
    return this;
  }

   /**
   * ids of any users who should be notified when approval is complete
   * @return approvalNotifierUserIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ids of any users who should be notified when approval is complete")

  public Set<String> getApprovalNotifierUserIds() {
    return approvalNotifierUserIds;
  }


  public void setApprovalNotifierUserIds(Set<String> approvalNotifierUserIds) {
    
    
    
    this.approvalNotifierUserIds = approvalNotifierUserIds;
  }


  public ApprovalChain createId(String createId) {
    
    
    
    
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


  public ApprovalChain createAt(String createAt) {
    
    
    
    
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


  public ApprovalChain updateId(String updateId) {
    
    
    
    
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


  public ApprovalChain updateAt(String updateAt) {
    
    
    
    
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


  public ApprovalChain deleteId(String deleteId) {
    
    
    
    
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


  public ApprovalChain deleteAt(String deleteAt) {
    
    
    
    
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
   * @return the ApprovalChain instance itself
   */
  public ApprovalChain putAdditionalProperty(String key, Object value) {
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
    ApprovalChain approvalChain = (ApprovalChain) o;
    return Objects.equals(this.id, approvalChain.id) &&
        Objects.equals(this.orgId, approvalChain.orgId) &&
        Objects.equals(this.entityId, approvalChain.entityId) &&
        Objects.equals(this.entityType, approvalChain.entityType) &&
        Objects.equals(this.name, approvalChain.name) &&
        Objects.equals(this.isPreview, approvalChain.isPreview) &&
        Objects.equals(this.fallbackApproverJobId, approvalChain.fallbackApproverJobId) &&
        Objects.equals(this.fallbackApproverJobError, approvalChain.fallbackApproverJobError) &&
        Objects.equals(this.approvalNotifierUserIds, approvalChain.approvalNotifierUserIds) &&
        Objects.equals(this.createId, approvalChain.createId) &&
        Objects.equals(this.createAt, approvalChain.createAt) &&
        Objects.equals(this.updateId, approvalChain.updateId) &&
        Objects.equals(this.updateAt, approvalChain.updateAt) &&
        Objects.equals(this.deleteId, approvalChain.deleteId) &&
        Objects.equals(this.deleteAt, approvalChain.deleteAt)&&
        Objects.equals(this.additionalProperties, approvalChain.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, entityId, entityType, name, isPreview, fallbackApproverJobId, fallbackApproverJobError, approvalNotifierUserIds, createId, createAt, updateId, updateAt, deleteId, deleteAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalChain {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isPreview: ").append(toIndentedString(isPreview)).append("\n");
    sb.append("    fallbackApproverJobId: ").append(toIndentedString(fallbackApproverJobId)).append("\n");
    sb.append("    fallbackApproverJobError: ").append(toIndentedString(fallbackApproverJobError)).append("\n");
    sb.append("    approvalNotifierUserIds: ").append(toIndentedString(approvalNotifierUserIds)).append("\n");
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
    openapiFields.add("entityId");
    openapiFields.add("entityType");
    openapiFields.add("name");
    openapiFields.add("isPreview");
    openapiFields.add("fallbackApproverJobId");
    openapiFields.add("fallbackApproverJobError");
    openapiFields.add("approvalNotifierUserIds");
    openapiFields.add("createId");
    openapiFields.add("createAt");
    openapiFields.add("updateId");
    openapiFields.add("updateAt");
    openapiFields.add("deleteId");
    openapiFields.add("deleteAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("orgId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("approvalNotifierUserIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApprovalChain
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApprovalChain.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApprovalChain is not found in the empty JSON string", ApprovalChain.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApprovalChain.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if ((jsonObj.get("entityId") != null && !jsonObj.get("entityId").isJsonNull()) && !jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
      if ((jsonObj.get("entityType") != null && !jsonObj.get("entityType").isJsonNull()) && !jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("fallbackApproverJobId") != null && !jsonObj.get("fallbackApproverJobId").isJsonNull()) && !jsonObj.get("fallbackApproverJobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackApproverJobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackApproverJobId").toString()));
      }
      if ((jsonObj.get("fallbackApproverJobError") != null && !jsonObj.get("fallbackApproverJobError").isJsonNull()) && !jsonObj.get("fallbackApproverJobError").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackApproverJobError` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackApproverJobError").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("approvalNotifierUserIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("approvalNotifierUserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvalNotifierUserIds` to be an array in the JSON string but got `%s`", jsonObj.get("approvalNotifierUserIds").toString()));
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
       if (!ApprovalChain.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApprovalChain' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApprovalChain> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApprovalChain.class));

       return (TypeAdapter<T>) new TypeAdapter<ApprovalChain>() {
           @Override
           public void write(JsonWriter out, ApprovalChain value) throws IOException {
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
           public ApprovalChain read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApprovalChain instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApprovalChain given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApprovalChain
  * @throws IOException if the JSON string is invalid with respect to ApprovalChain
  */
  public static ApprovalChain fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApprovalChain.class);
  }

 /**
  * Convert an instance of ApprovalChain to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
