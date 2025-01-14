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
import com.konfigthis.client.model.GroupGraphCount;
import com.konfigthis.client.model.GroupParent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * GroupGraphResult
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GroupGraphResult {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private Map<String, Object> group = new HashMap<>();

  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private List<Map<String, Object>> jobs = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP_POSITIONS = "groupPositions";
  @SerializedName(SERIALIZED_NAME_GROUP_POSITIONS)
  private List<Map<String, Object>> groupPositions = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private GroupParent parent;

  public static final String SERIALIZED_NAME_UNDER_COUNT = "underCount";
  @SerializedName(SERIALIZED_NAME_UNDER_COUNT)
  private GroupGraphCount underCount;

  public GroupGraphResult() {
  }

  public GroupGraphResult group(Map<String, Object> group) {
    
    
    
    
    this.group = group;
    return this;
  }

  public GroupGraphResult putGroupItem(String key, Object groupItem) {
    this.group.put(key, groupItem);
    return this;
  }

   /**
   * group data
   * @return group
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "group data")

  public Map<String, Object> getGroup() {
    return group;
  }


  public void setGroup(Map<String, Object> group) {
    
    
    
    this.group = group;
  }


  public GroupGraphResult jobs(List<Map<String, Object>> jobs) {
    
    
    
    
    this.jobs = jobs;
    return this;
  }

  public GroupGraphResult addJobsItem(Map<String, Object> jobsItem) {
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * job data
   * @return jobs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "job data")

  public List<Map<String, Object>> getJobs() {
    return jobs;
  }


  public void setJobs(List<Map<String, Object>> jobs) {
    
    
    
    this.jobs = jobs;
  }


  public GroupGraphResult groupPositions(List<Map<String, Object>> groupPositions) {
    
    
    
    
    this.groupPositions = groupPositions;
    return this;
  }

  public GroupGraphResult addGroupPositionsItem(Map<String, Object> groupPositionsItem) {
    this.groupPositions.add(groupPositionsItem);
    return this;
  }

   /**
   * positions available within the group
   * @return groupPositions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "positions available within the group")

  public List<Map<String, Object>> getGroupPositions() {
    return groupPositions;
  }


  public void setGroupPositions(List<Map<String, Object>> groupPositions) {
    
    
    
    this.groupPositions = groupPositions;
  }


  public GroupGraphResult parent(GroupParent parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupParent getParent() {
    return parent;
  }


  public void setParent(GroupParent parent) {
    
    
    
    this.parent = parent;
  }


  public GroupGraphResult underCount(GroupGraphCount underCount) {
    
    
    
    
    this.underCount = underCount;
    return this;
  }

   /**
   * Get underCount
   * @return underCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GroupGraphCount getUnderCount() {
    return underCount;
  }


  public void setUnderCount(GroupGraphCount underCount) {
    
    
    
    this.underCount = underCount;
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
   * @return the GroupGraphResult instance itself
   */
  public GroupGraphResult putAdditionalProperty(String key, Object value) {
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
    GroupGraphResult groupGraphResult = (GroupGraphResult) o;
    return Objects.equals(this.group, groupGraphResult.group) &&
        Objects.equals(this.jobs, groupGraphResult.jobs) &&
        Objects.equals(this.groupPositions, groupGraphResult.groupPositions) &&
        Objects.equals(this.parent, groupGraphResult.parent) &&
        Objects.equals(this.underCount, groupGraphResult.underCount)&&
        Objects.equals(this.additionalProperties, groupGraphResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, jobs, groupPositions, parent, underCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupGraphResult {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    groupPositions: ").append(toIndentedString(groupPositions)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    underCount: ").append(toIndentedString(underCount)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("jobs");
    openapiFields.add("groupPositions");
    openapiFields.add("parent");
    openapiFields.add("underCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("group");
    openapiRequiredFields.add("jobs");
    openapiRequiredFields.add("groupPositions");
    openapiRequiredFields.add("underCount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupGraphResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupGraphResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupGraphResult is not found in the empty JSON string", GroupGraphResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupGraphResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("jobs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("jobs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobs` to be an array in the JSON string but got `%s`", jsonObj.get("jobs").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("groupPositions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("groupPositions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupPositions` to be an array in the JSON string but got `%s`", jsonObj.get("groupPositions").toString()));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        GroupParent.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      // validate the required field `underCount`
      GroupGraphCount.validateJsonObject(jsonObj.getAsJsonObject("underCount"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupGraphResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupGraphResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupGraphResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupGraphResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupGraphResult>() {
           @Override
           public void write(JsonWriter out, GroupGraphResult value) throws IOException {
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
           public GroupGraphResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupGraphResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupGraphResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupGraphResult
  * @throws IOException if the JSON string is invalid with respect to GroupGraphResult
  */
  public static GroupGraphResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupGraphResult.class);
  }

 /**
  * Convert an instance of GroupGraphResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

