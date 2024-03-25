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
import com.konfigthis.client.model.Task;
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
 * TaskFormSummary
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaskFormSummary {
  public static final String SERIALIZED_NAME_SUBMIT_COUNT = "submitCount";
  @SerializedName(SERIALIZED_NAME_SUBMIT_COUNT)
  private Integer submitCount;

  public static final String SERIALIZED_NAME_APPROVE_COUNT = "approveCount";
  @SerializedName(SERIALIZED_NAME_APPROVE_COUNT)
  private Integer approveCount;

  public static final String SERIALIZED_NAME_PENDING_COUNT = "pendingCount";
  @SerializedName(SERIALIZED_NAME_PENDING_COUNT)
  private Integer pendingCount;

  public static final String SERIALIZED_NAME_SKIPPED_COUNT = "skippedCount";
  @SerializedName(SERIALIZED_NAME_SKIPPED_COUNT)
  private Integer skippedCount;

  public static final String SERIALIZED_NAME_EXPIRED_COUNT = "expiredCount";
  @SerializedName(SERIALIZED_NAME_EXPIRED_COUNT)
  private Integer expiredCount;

  public static final String SERIALIZED_NAME_PEOPLE_INCLUDED_COUNT = "peopleIncludedCount";
  @SerializedName(SERIALIZED_NAME_PEOPLE_INCLUDED_COUNT)
  private Integer peopleIncludedCount;

  public static final String SERIALIZED_NAME_TASK_LIST = "taskList";
  @SerializedName(SERIALIZED_NAME_TASK_LIST)
  private List<Task> taskList = new ArrayList<>();

  public TaskFormSummary() {
  }

  public TaskFormSummary submitCount(Integer submitCount) {
    
    
    
    
    this.submitCount = submitCount;
    return this;
  }

   /**
   * Number of FORM_SUBMIT tasks that are marked as DONE
   * @return submitCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of FORM_SUBMIT tasks that are marked as DONE")

  public Integer getSubmitCount() {
    return submitCount;
  }


  public void setSubmitCount(Integer submitCount) {
    
    
    
    this.submitCount = submitCount;
  }


  public TaskFormSummary approveCount(Integer approveCount) {
    
    
    
    
    this.approveCount = approveCount;
    return this;
  }

   /**
   * Number CHANGE_APPROVE tasks that are done.
   * @return approveCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number CHANGE_APPROVE tasks that are done.")

  public Integer getApproveCount() {
    return approveCount;
  }


  public void setApproveCount(Integer approveCount) {
    
    
    
    this.approveCount = approveCount;
  }


  public TaskFormSummary pendingCount(Integer pendingCount) {
    
    
    
    
    this.pendingCount = pendingCount;
    return this;
  }

   /**
   * Number FORM_SUBMIT tasks that are PENDING
   * @return pendingCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number FORM_SUBMIT tasks that are PENDING")

  public Integer getPendingCount() {
    return pendingCount;
  }


  public void setPendingCount(Integer pendingCount) {
    
    
    
    this.pendingCount = pendingCount;
  }


  public TaskFormSummary skippedCount(Integer skippedCount) {
    
    
    
    
    this.skippedCount = skippedCount;
    return this;
  }

   /**
   * Number FORM_SUBMIT tasks that are SKIPPED
   * @return skippedCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number FORM_SUBMIT tasks that are SKIPPED")

  public Integer getSkippedCount() {
    return skippedCount;
  }


  public void setSkippedCount(Integer skippedCount) {
    
    
    
    this.skippedCount = skippedCount;
  }


  public TaskFormSummary expiredCount(Integer expiredCount) {
    
    
    
    
    this.expiredCount = expiredCount;
    return this;
  }

   /**
   * Number FORM_SUBMIT tasks that are EXPIRED
   * @return expiredCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number FORM_SUBMIT tasks that are EXPIRED")

  public Integer getExpiredCount() {
    return expiredCount;
  }


  public void setExpiredCount(Integer expiredCount) {
    
    
    
    this.expiredCount = expiredCount;
  }


  public TaskFormSummary peopleIncludedCount(Integer peopleIncludedCount) {
    
    
    
    
    this.peopleIncludedCount = peopleIncludedCount;
    return this;
  }

   /**
   * Number of unique people included in the form
   * @return peopleIncludedCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of unique people included in the form")

  public Integer getPeopleIncludedCount() {
    return peopleIncludedCount;
  }


  public void setPeopleIncludedCount(Integer peopleIncludedCount) {
    
    
    
    this.peopleIncludedCount = peopleIncludedCount;
  }


  public TaskFormSummary taskList(List<Task> taskList) {
    
    
    
    
    this.taskList = taskList;
    return this;
  }

  public TaskFormSummary addTaskListItem(Task taskListItem) {
    this.taskList.add(taskListItem);
    return this;
  }

   /**
   * List of Dto Tasks
   * @return taskList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of Dto Tasks")

  public List<Task> getTaskList() {
    return taskList;
  }


  public void setTaskList(List<Task> taskList) {
    
    
    
    this.taskList = taskList;
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
   * @return the TaskFormSummary instance itself
   */
  public TaskFormSummary putAdditionalProperty(String key, Object value) {
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
    TaskFormSummary taskFormSummary = (TaskFormSummary) o;
    return Objects.equals(this.submitCount, taskFormSummary.submitCount) &&
        Objects.equals(this.approveCount, taskFormSummary.approveCount) &&
        Objects.equals(this.pendingCount, taskFormSummary.pendingCount) &&
        Objects.equals(this.skippedCount, taskFormSummary.skippedCount) &&
        Objects.equals(this.expiredCount, taskFormSummary.expiredCount) &&
        Objects.equals(this.peopleIncludedCount, taskFormSummary.peopleIncludedCount) &&
        Objects.equals(this.taskList, taskFormSummary.taskList)&&
        Objects.equals(this.additionalProperties, taskFormSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitCount, approveCount, pendingCount, skippedCount, expiredCount, peopleIncludedCount, taskList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskFormSummary {\n");
    sb.append("    submitCount: ").append(toIndentedString(submitCount)).append("\n");
    sb.append("    approveCount: ").append(toIndentedString(approveCount)).append("\n");
    sb.append("    pendingCount: ").append(toIndentedString(pendingCount)).append("\n");
    sb.append("    skippedCount: ").append(toIndentedString(skippedCount)).append("\n");
    sb.append("    expiredCount: ").append(toIndentedString(expiredCount)).append("\n");
    sb.append("    peopleIncludedCount: ").append(toIndentedString(peopleIncludedCount)).append("\n");
    sb.append("    taskList: ").append(toIndentedString(taskList)).append("\n");
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
    openapiFields.add("submitCount");
    openapiFields.add("approveCount");
    openapiFields.add("pendingCount");
    openapiFields.add("skippedCount");
    openapiFields.add("expiredCount");
    openapiFields.add("peopleIncludedCount");
    openapiFields.add("taskList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("submitCount");
    openapiRequiredFields.add("approveCount");
    openapiRequiredFields.add("pendingCount");
    openapiRequiredFields.add("skippedCount");
    openapiRequiredFields.add("expiredCount");
    openapiRequiredFields.add("peopleIncludedCount");
    openapiRequiredFields.add("taskList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskFormSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaskFormSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskFormSummary is not found in the empty JSON string", TaskFormSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaskFormSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("taskList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskList` to be an array in the JSON string but got `%s`", jsonObj.get("taskList").toString()));
      }

      JsonArray jsonArraytaskList = jsonObj.getAsJsonArray("taskList");
      // validate the required field `taskList` (array)
      for (int i = 0; i < jsonArraytaskList.size(); i++) {
        Task.validateJsonObject(jsonArraytaskList.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskFormSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskFormSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskFormSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskFormSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskFormSummary>() {
           @Override
           public void write(JsonWriter out, TaskFormSummary value) throws IOException {
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
           public TaskFormSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskFormSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskFormSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskFormSummary
  * @throws IOException if the JSON string is invalid with respect to TaskFormSummary
  */
  public static TaskFormSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskFormSummary.class);
  }

 /**
  * Convert an instance of TaskFormSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

