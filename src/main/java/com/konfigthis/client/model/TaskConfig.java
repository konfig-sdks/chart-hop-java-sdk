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
import com.konfigthis.client.model.DueDate;
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
 * TaskConfig
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaskConfig {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_ASSESSMENT_ID = "assessmentId";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_ID)
  private String assessmentId;

  public static final String SERIALIZED_NAME_PARENT_ENTITY_ID = "parentEntityId";
  @SerializedName(SERIALIZED_NAME_PARENT_ENTITY_ID)
  private String parentEntityId;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  /**
   * type of task generated by the task config
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    FORM_SUBMIT("FORM_SUBMIT"),
    
    CHANGE_APPROVE("CHANGE_APPROVE"),
    
    TIMEOFF_APPROVE("TIMEOFF_APPROVE"),
    
    SCENARIO_CHANGES_APPROVE("SCENARIO_CHANGES_APPROVE"),
    
    SCENARIO_CHANGES_CREATE("SCENARIO_CHANGES_CREATE"),
    
    ORG_IMPORT("ORG_IMPORT"),
    
    COMP_REVIEW_APPROVAL_SUBMIT("COMP_REVIEW_APPROVAL_SUBMIT"),
    
    SCENARIO_APPROVAL_SUBMIT("SCENARIO_APPROVAL_SUBMIT"),
    
    APPROVAL_CHAIN_UPDATE_FALLBACK_APPROVER("APPROVAL_CHAIN_UPDATE_FALLBACK_APPROVER"),
    
    ACTION("ACTION");

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

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private DueDate dueDate;

  /**
   * sets pastDueAction on the task when it&#39;s generated
   */
  @JsonAdapter(PastDueActionEnum.Adapter.class)
 public enum PastDueActionEnum {
    NONE("NONE"),
    
    SET_EXPIRED("SET_EXPIRED");

    private String value;

    PastDueActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PastDueActionEnum fromValue(String value) {
      for (PastDueActionEnum b : PastDueActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PastDueActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PastDueActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PastDueActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PastDueActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAST_DUE_ACTION = "pastDueAction";
  @SerializedName(SERIALIZED_NAME_PAST_DUE_ACTION)
  private PastDueActionEnum pastDueAction;

  public static final String SERIALIZED_NAME_IS_SKIPPABLE = "isSkippable";
  @SerializedName(SERIALIZED_NAME_IS_SKIPPABLE)
  private Boolean isSkippable;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

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

  public TaskConfig() {
  }

  public TaskConfig description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * description for all tasks associated with the config that should be used in notifications
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "description for all tasks associated with the config that should be used in notifications")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TaskConfig id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * unique id of task config
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "unique id of task config")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TaskConfig orgId(String orgId) {
    
    
    
    
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


  public TaskConfig assessmentId(String assessmentId) {
    
    
    
    
    this.assessmentId = assessmentId;
    return this;
  }

   /**
   * parent assessment id that this task config belongs to
   * @return assessmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "parent assessment id that this task config belongs to")

  public String getAssessmentId() {
    return assessmentId;
  }


  public void setAssessmentId(String assessmentId) {
    
    
    
    this.assessmentId = assessmentId;
  }


  public TaskConfig parentEntityId(String parentEntityId) {
    
    
    
    
    this.parentEntityId = parentEntityId;
    return this;
  }

   /**
   * parent entity id that this task config belongs to, should be used with entityId
   * @return parentEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "parent entity id that this task config belongs to, should be used with entityId")

  public String getParentEntityId() {
    return parentEntityId;
  }


  public void setParentEntityId(String parentEntityId) {
    
    
    
    this.parentEntityId = parentEntityId;
  }


  public TaskConfig entityId(String entityId) {
    
    
    
    
    this.entityId = entityId;
    return this;
  }

   /**
   * the primary entity being referenced by the task config
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "the primary entity being referenced by the task config")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    
    
    
    this.entityId = entityId;
  }


  public TaskConfig slug(String slug) {
    
    
    
    
    this.slug = slug;
    return this;
  }

   /**
   * System generated identifying name so that actions can be triggered as a result of task completion
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "System generated identifying name so that actions can be triggered as a result of task completion")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    
    
    
    this.slug = slug;
  }


  public TaskConfig type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * type of task generated by the task config
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "type of task generated by the task config")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public TaskConfig dueDate(DueDate dueDate) {
    
    
    
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DueDate getDueDate() {
    return dueDate;
  }


  public void setDueDate(DueDate dueDate) {
    
    
    
    this.dueDate = dueDate;
  }


  public TaskConfig pastDueAction(PastDueActionEnum pastDueAction) {
    
    
    
    
    this.pastDueAction = pastDueAction;
    return this;
  }

   /**
   * sets pastDueAction on the task when it&#39;s generated
   * @return pastDueAction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "sets pastDueAction on the task when it's generated")

  public PastDueActionEnum getPastDueAction() {
    return pastDueAction;
  }


  public void setPastDueAction(PastDueActionEnum pastDueAction) {
    
    
    
    this.pastDueAction = pastDueAction;
  }


  public TaskConfig isSkippable(Boolean isSkippable) {
    
    
    
    
    this.isSkippable = isSkippable;
    return this;
  }

   /**
   * sets isSkippable on the task
   * @return isSkippable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sets isSkippable on the task")

  public Boolean getIsSkippable() {
    return isSkippable;
  }


  public void setIsSkippable(Boolean isSkippable) {
    
    
    
    this.isSkippable = isSkippable;
  }


  public TaskConfig label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * human-readable label that should be used for all tasks associated with the config as the task name
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "human-readable label that should be used for all tasks associated with the config as the task name")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public TaskConfig createId(String createId) {
    
    
    
    
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


  public TaskConfig createAt(String createAt) {
    
    
    
    
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


  public TaskConfig updateId(String updateId) {
    
    
    
    
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


  public TaskConfig updateAt(String updateAt) {
    
    
    
    
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


  public TaskConfig deleteId(String deleteId) {
    
    
    
    
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


  public TaskConfig deleteAt(String deleteAt) {
    
    
    
    
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
   * @return the TaskConfig instance itself
   */
  public TaskConfig putAdditionalProperty(String key, Object value) {
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
    TaskConfig taskConfig = (TaskConfig) o;
    return Objects.equals(this.description, taskConfig.description) &&
        Objects.equals(this.id, taskConfig.id) &&
        Objects.equals(this.orgId, taskConfig.orgId) &&
        Objects.equals(this.assessmentId, taskConfig.assessmentId) &&
        Objects.equals(this.parentEntityId, taskConfig.parentEntityId) &&
        Objects.equals(this.entityId, taskConfig.entityId) &&
        Objects.equals(this.slug, taskConfig.slug) &&
        Objects.equals(this.type, taskConfig.type) &&
        Objects.equals(this.dueDate, taskConfig.dueDate) &&
        Objects.equals(this.pastDueAction, taskConfig.pastDueAction) &&
        Objects.equals(this.isSkippable, taskConfig.isSkippable) &&
        Objects.equals(this.label, taskConfig.label) &&
        Objects.equals(this.createId, taskConfig.createId) &&
        Objects.equals(this.createAt, taskConfig.createAt) &&
        Objects.equals(this.updateId, taskConfig.updateId) &&
        Objects.equals(this.updateAt, taskConfig.updateAt) &&
        Objects.equals(this.deleteId, taskConfig.deleteId) &&
        Objects.equals(this.deleteAt, taskConfig.deleteAt)&&
        Objects.equals(this.additionalProperties, taskConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, orgId, assessmentId, parentEntityId, entityId, slug, type, dueDate, pastDueAction, isSkippable, label, createId, createAt, updateId, updateAt, deleteId, deleteAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskConfig {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    assessmentId: ").append(toIndentedString(assessmentId)).append("\n");
    sb.append("    parentEntityId: ").append(toIndentedString(parentEntityId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    pastDueAction: ").append(toIndentedString(pastDueAction)).append("\n");
    sb.append("    isSkippable: ").append(toIndentedString(isSkippable)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("orgId");
    openapiFields.add("assessmentId");
    openapiFields.add("parentEntityId");
    openapiFields.add("entityId");
    openapiFields.add("slug");
    openapiFields.add("type");
    openapiFields.add("dueDate");
    openapiFields.add("pastDueAction");
    openapiFields.add("isSkippable");
    openapiFields.add("label");
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
    openapiRequiredFields.add("entityId");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("pastDueAction");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaskConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskConfig is not found in the empty JSON string", TaskConfig.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaskConfig.openapiRequiredFields) {
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
      if (!jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if ((jsonObj.get("assessmentId") != null && !jsonObj.get("assessmentId").isJsonNull()) && !jsonObj.get("assessmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assessmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assessmentId").toString()));
      }
      if ((jsonObj.get("parentEntityId") != null && !jsonObj.get("parentEntityId").isJsonNull()) && !jsonObj.get("parentEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentEntityId").toString()));
      }
      if (!jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `dueDate`
      if (jsonObj.get("dueDate") != null && !jsonObj.get("dueDate").isJsonNull()) {
        DueDate.validateJsonObject(jsonObj.getAsJsonObject("dueDate"));
      }
      if (!jsonObj.get("pastDueAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pastDueAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pastDueAction").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
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
       if (!TaskConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskConfig>() {
           @Override
           public void write(JsonWriter out, TaskConfig value) throws IOException {
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
           public TaskConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskConfig
  * @throws IOException if the JSON string is invalid with respect to TaskConfig
  */
  public static TaskConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskConfig.class);
  }

 /**
  * Convert an instance of TaskConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

