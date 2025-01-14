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
import com.konfigthis.client.model.ActionStep;
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
 * Action
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Action {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_CRON_SCHEDULE = "cronSchedule";
  @SerializedName(SERIALIZED_NAME_CRON_SCHEDULE)
  private String cronSchedule;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<ActionStep> steps = new ArrayList<>();

  /**
   * status of the action
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_RUN_USER_ID = "runUserId";
  @SerializedName(SERIALIZED_NAME_RUN_USER_ID)
  private String runUserId;

  public static final String SERIALIZED_NAME_SENSITIVE = "sensitive";
  @SerializedName(SERIALIZED_NAME_SENSITIVE)
  private Boolean sensitive;

  /**
   * organizational category for HRIS-themed actions
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
 public enum CategoryEnum {
    ONBOARDING("ONBOARDING"),
    
    OFFBOARDING("OFFBOARDING");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

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

  public Action() {
  }

  public Action tags(List<String> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public Action addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * tags to organize the purpose of the action
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tags to organize the purpose of the action")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    
    
    
    this.tags = tags;
  }


  public Action description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * description of the action
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "description of the action")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public Action id(String id) {
    
    
    
    
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


  public Action orgId(String orgId) {
    
    
    
    
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


  public Action event(String event) {
    
    
    
    
    this.event = event;
    return this;
  }

   /**
   * event pattern to match on, such as change.create.*
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "event pattern to match on, such as change.create.*")

  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    
    
    
    this.event = event;
  }


  public Action cronSchedule(String cronSchedule) {
    
    
    
    
    this.cronSchedule = cronSchedule;
    return this;
  }

   /**
   * cron schedule to run on, in crontab format
   * @return cronSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5 4 * * *", value = "cron schedule to run on, in crontab format")

  public String getCronSchedule() {
    return cronSchedule;
  }


  public void setCronSchedule(String cronSchedule) {
    
    
    
    this.cronSchedule = cronSchedule;
  }


  public Action filter(String filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * only run when matching a particular filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "only run when matching a particular filter")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    
    
    
    this.filter = filter;
  }


  public Action steps(List<ActionStep> steps) {
    
    
    
    
    this.steps = steps;
    return this;
  }

  public Action addStepsItem(ActionStep stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * list of steps to run when matching the event, schedule, and filter
   * @return steps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "list of steps to run when matching the event, schedule, and filter")

  public List<ActionStep> getSteps() {
    return steps;
  }


  public void setSteps(List<ActionStep> steps) {
    
    
    
    this.steps = steps;
  }


  public Action status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * status of the action
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "status of the action")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public Action runUserId(String runUserId) {
    
    
    
    
    this.runUserId = runUserId;
    return this;
  }

   /**
   * the user to run the action as - normally the same as the user who created the action
   * @return runUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "the user to run the action as - normally the same as the user who created the action")

  public String getRunUserId() {
    return runUserId;
  }


  public void setRunUserId(String runUserId) {
    
    
    
    this.runUserId = runUserId;
  }


  public Action sensitive(Boolean sensitive) {
    
    
    
    
    this.sensitive = sensitive;
    return this;
  }

   /**
   * whether to run with access to sensitive events or not
   * @return sensitive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "whether to run with access to sensitive events or not")

  public Boolean getSensitive() {
    return sensitive;
  }


  public void setSensitive(Boolean sensitive) {
    
    
    
    this.sensitive = sensitive;
  }


  public Action category(CategoryEnum category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * organizational category for HRIS-themed actions
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "organizational category for HRIS-themed actions")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    
    
    
    this.category = category;
  }


  public Action createId(String createId) {
    
    
    
    
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


  public Action createAt(String createAt) {
    
    
    
    
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


  public Action updateId(String updateId) {
    
    
    
    
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


  public Action updateAt(String updateAt) {
    
    
    
    
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


  public Action deleteId(String deleteId) {
    
    
    
    
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


  public Action deleteAt(String deleteAt) {
    
    
    
    
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
   * @return the Action instance itself
   */
  public Action putAdditionalProperty(String key, Object value) {
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
    Action action = (Action) o;
    return Objects.equals(this.tags, action.tags) &&
        Objects.equals(this.description, action.description) &&
        Objects.equals(this.id, action.id) &&
        Objects.equals(this.orgId, action.orgId) &&
        Objects.equals(this.event, action.event) &&
        Objects.equals(this.cronSchedule, action.cronSchedule) &&
        Objects.equals(this.filter, action.filter) &&
        Objects.equals(this.steps, action.steps) &&
        Objects.equals(this.status, action.status) &&
        Objects.equals(this.runUserId, action.runUserId) &&
        Objects.equals(this.sensitive, action.sensitive) &&
        Objects.equals(this.category, action.category) &&
        Objects.equals(this.createId, action.createId) &&
        Objects.equals(this.createAt, action.createAt) &&
        Objects.equals(this.updateId, action.updateId) &&
        Objects.equals(this.updateAt, action.updateAt) &&
        Objects.equals(this.deleteId, action.deleteId) &&
        Objects.equals(this.deleteAt, action.deleteAt)&&
        Objects.equals(this.additionalProperties, action.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, description, id, orgId, event, cronSchedule, filter, steps, status, runUserId, sensitive, category, createId, createAt, updateId, updateAt, deleteId, deleteAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    cronSchedule: ").append(toIndentedString(cronSchedule)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    runUserId: ").append(toIndentedString(runUserId)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("orgId");
    openapiFields.add("event");
    openapiFields.add("cronSchedule");
    openapiFields.add("filter");
    openapiFields.add("steps");
    openapiFields.add("status");
    openapiFields.add("runUserId");
    openapiFields.add("sensitive");
    openapiFields.add("category");
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
    openapiRequiredFields.add("steps");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("runUserId");
    openapiRequiredFields.add("sensitive");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Action
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Action.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Action is not found in the empty JSON string", Action.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Action.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
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
      if ((jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) && !jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      if ((jsonObj.get("cronSchedule") != null && !jsonObj.get("cronSchedule").isJsonNull()) && !jsonObj.get("cronSchedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cronSchedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cronSchedule").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
      }

      JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
      // validate the required field `steps` (array)
      for (int i = 0; i < jsonArraysteps.size(); i++) {
        ActionStep.validateJsonObject(jsonArraysteps.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("runUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runUserId").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
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
       if (!Action.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Action' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Action> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Action.class));

       return (TypeAdapter<T>) new TypeAdapter<Action>() {
           @Override
           public void write(JsonWriter out, Action value) throws IOException {
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
           public Action read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Action instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Action given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Action
  * @throws IOException if the JSON string is invalid with respect to Action
  */
  public static Action fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Action.class);
  }

 /**
  * Convert an instance of Action to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

