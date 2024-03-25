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
import com.konfigthis.client.model.ShareAccess;
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
 * UpdateTask
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateTask {
  /**
   * status of this task
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    PENDING("PENDING"),
    
    DONE("DONE"),
    
    EXPIRED("EXPIRED"),
    
    SKIPPED("SKIPPED");

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

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SHARE_ACCESS = "shareAccess";
  @SerializedName(SERIALIZED_NAME_SHARE_ACCESS)
  private List<ShareAccess> shareAccess = null;

  public static final String SERIALIZED_NAME_TASK_CONFIG_ID = "taskConfigId";
  @SerializedName(SERIALIZED_NAME_TASK_CONFIG_ID)
  private String taskConfigId;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_DUE_AT = "dueAt";
  @SerializedName(SERIALIZED_NAME_DUE_AT)
  private String dueAt;

  /**
   * what action to take when the task is past its due date
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

  public UpdateTask() {
  }

  public UpdateTask status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * status of this task
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status of this task")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public UpdateTask message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * The message attached to this task
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "this is the best task ever", value = "The message attached to this task")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public UpdateTask shareAccess(List<ShareAccess> shareAccess) {
    
    
    
    
    this.shareAccess = shareAccess;
    return this;
  }

  public UpdateTask addShareAccessItem(ShareAccess shareAccessItem) {
    if (this.shareAccess == null) {
      this.shareAccess = new ArrayList<>();
    }
    this.shareAccess.add(shareAccessItem);
    return this;
  }

   /**
   * users who are specifically granted permission to view or edit this task
   * @return shareAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "users who are specifically granted permission to view or edit this task")

  public List<ShareAccess> getShareAccess() {
    return shareAccess;
  }


  public void setShareAccess(List<ShareAccess> shareAccess) {
    
    
    
    this.shareAccess = shareAccess;
  }


  public UpdateTask taskConfigId(String taskConfigId) {
    
    
    
    
    this.taskConfigId = taskConfigId;
    return this;
  }

   /**
   * id of the TaskConfig
   * @return taskConfigId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "id of the TaskConfig")

  public String getTaskConfigId() {
    return taskConfigId;
  }


  public void setTaskConfigId(String taskConfigId) {
    
    
    
    this.taskConfigId = taskConfigId;
  }


  public UpdateTask slug(String slug) {
    
    
    
    
    this.slug = slug;
    return this;
  }

   /**
   * slug used to reference tasks in events
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "onboardingForm", value = "slug used to reference tasks in events")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    
    
    
    this.slug = slug;
  }


  public UpdateTask dueAt(String dueAt) {
    
    
    
    
    this.dueAt = dueAt;
    return this;
  }

   /**
   * due date for the task
   * @return dueAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "due date for the task")

  public String getDueAt() {
    return dueAt;
  }


  public void setDueAt(String dueAt) {
    
    
    
    this.dueAt = dueAt;
  }


  public UpdateTask pastDueAction(PastDueActionEnum pastDueAction) {
    
    
    
    
    this.pastDueAction = pastDueAction;
    return this;
  }

   /**
   * what action to take when the task is past its due date
   * @return pastDueAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NONE", value = "what action to take when the task is past its due date")

  public PastDueActionEnum getPastDueAction() {
    return pastDueAction;
  }


  public void setPastDueAction(PastDueActionEnum pastDueAction) {
    
    
    
    this.pastDueAction = pastDueAction;
  }


  public UpdateTask isSkippable(Boolean isSkippable) {
    
    
    
    
    this.isSkippable = isSkippable;
    return this;
  }

   /**
   * check for if the task can be skipped
   * @return isSkippable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "check for if the task can be skipped")

  public Boolean getIsSkippable() {
    return isSkippable;
  }


  public void setIsSkippable(Boolean isSkippable) {
    
    
    
    this.isSkippable = isSkippable;
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
   * @return the UpdateTask instance itself
   */
  public UpdateTask putAdditionalProperty(String key, Object value) {
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
    UpdateTask updateTask = (UpdateTask) o;
    return Objects.equals(this.status, updateTask.status) &&
        Objects.equals(this.message, updateTask.message) &&
        Objects.equals(this.shareAccess, updateTask.shareAccess) &&
        Objects.equals(this.taskConfigId, updateTask.taskConfigId) &&
        Objects.equals(this.slug, updateTask.slug) &&
        Objects.equals(this.dueAt, updateTask.dueAt) &&
        Objects.equals(this.pastDueAction, updateTask.pastDueAction) &&
        Objects.equals(this.isSkippable, updateTask.isSkippable)&&
        Objects.equals(this.additionalProperties, updateTask.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, shareAccess, taskConfigId, slug, dueAt, pastDueAction, isSkippable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTask {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    shareAccess: ").append(toIndentedString(shareAccess)).append("\n");
    sb.append("    taskConfigId: ").append(toIndentedString(taskConfigId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    pastDueAction: ").append(toIndentedString(pastDueAction)).append("\n");
    sb.append("    isSkippable: ").append(toIndentedString(isSkippable)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("shareAccess");
    openapiFields.add("taskConfigId");
    openapiFields.add("slug");
    openapiFields.add("dueAt");
    openapiFields.add("pastDueAction");
    openapiFields.add("isSkippable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateTask
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateTask.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTask is not found in the empty JSON string", UpdateTask.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("shareAccess") != null && !jsonObj.get("shareAccess").isJsonNull()) {
        JsonArray jsonArrayshareAccess = jsonObj.getAsJsonArray("shareAccess");
        if (jsonArrayshareAccess != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shareAccess").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shareAccess` to be an array in the JSON string but got `%s`", jsonObj.get("shareAccess").toString()));
          }

          // validate the optional field `shareAccess` (array)
          for (int i = 0; i < jsonArrayshareAccess.size(); i++) {
            ShareAccess.validateJsonObject(jsonArrayshareAccess.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("taskConfigId") != null && !jsonObj.get("taskConfigId").isJsonNull()) && !jsonObj.get("taskConfigId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskConfigId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskConfigId").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("dueAt") != null && !jsonObj.get("dueAt").isJsonNull()) && !jsonObj.get("dueAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dueAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dueAt").toString()));
      }
      if ((jsonObj.get("pastDueAction") != null && !jsonObj.get("pastDueAction").isJsonNull()) && !jsonObj.get("pastDueAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pastDueAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pastDueAction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTask.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTask>() {
           @Override
           public void write(JsonWriter out, UpdateTask value) throws IOException {
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
           public UpdateTask read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateTask instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateTask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTask
  * @throws IOException if the JSON string is invalid with respect to UpdateTask
  */
  public static UpdateTask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTask.class);
  }

 /**
  * Convert an instance of UpdateTask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
