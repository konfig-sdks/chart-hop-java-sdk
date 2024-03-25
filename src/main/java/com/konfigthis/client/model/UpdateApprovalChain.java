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
 * UpdateApprovalChain
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateApprovalChain {
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
  private Set<String> approvalNotifierUserIds = null;

  public UpdateApprovalChain() {
  }

  public UpdateApprovalChain name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * human-readable name of approval chain
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Comp Review 06/15/2022", value = "human-readable name of approval chain")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UpdateApprovalChain isPreview(Boolean isPreview) {
    
    
    
    
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


  public UpdateApprovalChain fallbackApproverJobId(String fallbackApproverJobId) {
    
    
    
    
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


  public UpdateApprovalChain fallbackApproverJobError(String fallbackApproverJobError) {
    
    
    
    
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


  public UpdateApprovalChain approvalNotifierUserIds(Set<String> approvalNotifierUserIds) {
    
    
    
    
    this.approvalNotifierUserIds = approvalNotifierUserIds;
    return this;
  }

  public UpdateApprovalChain addApprovalNotifierUserIdsItem(String approvalNotifierUserIdsItem) {
    if (this.approvalNotifierUserIds == null) {
      this.approvalNotifierUserIds = new LinkedHashSet<>();
    }
    this.approvalNotifierUserIds.add(approvalNotifierUserIdsItem);
    return this;
  }

   /**
   * ids of any users who should be notified when approval is complete
   * @return approvalNotifierUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ids of any users who should be notified when approval is complete")

  public Set<String> getApprovalNotifierUserIds() {
    return approvalNotifierUserIds;
  }


  public void setApprovalNotifierUserIds(Set<String> approvalNotifierUserIds) {
    
    
    
    this.approvalNotifierUserIds = approvalNotifierUserIds;
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
   * @return the UpdateApprovalChain instance itself
   */
  public UpdateApprovalChain putAdditionalProperty(String key, Object value) {
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
    UpdateApprovalChain updateApprovalChain = (UpdateApprovalChain) o;
    return Objects.equals(this.name, updateApprovalChain.name) &&
        Objects.equals(this.isPreview, updateApprovalChain.isPreview) &&
        Objects.equals(this.fallbackApproverJobId, updateApprovalChain.fallbackApproverJobId) &&
        Objects.equals(this.fallbackApproverJobError, updateApprovalChain.fallbackApproverJobError) &&
        Objects.equals(this.approvalNotifierUserIds, updateApprovalChain.approvalNotifierUserIds)&&
        Objects.equals(this.additionalProperties, updateApprovalChain.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isPreview, fallbackApproverJobId, fallbackApproverJobError, approvalNotifierUserIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApprovalChain {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isPreview: ").append(toIndentedString(isPreview)).append("\n");
    sb.append("    fallbackApproverJobId: ").append(toIndentedString(fallbackApproverJobId)).append("\n");
    sb.append("    fallbackApproverJobError: ").append(toIndentedString(fallbackApproverJobError)).append("\n");
    sb.append("    approvalNotifierUserIds: ").append(toIndentedString(approvalNotifierUserIds)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("isPreview");
    openapiFields.add("fallbackApproverJobId");
    openapiFields.add("fallbackApproverJobError");
    openapiFields.add("approvalNotifierUserIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateApprovalChain
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateApprovalChain.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateApprovalChain is not found in the empty JSON string", UpdateApprovalChain.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("fallbackApproverJobId") != null && !jsonObj.get("fallbackApproverJobId").isJsonNull()) && !jsonObj.get("fallbackApproverJobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackApproverJobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackApproverJobId").toString()));
      }
      if ((jsonObj.get("fallbackApproverJobError") != null && !jsonObj.get("fallbackApproverJobError").isJsonNull()) && !jsonObj.get("fallbackApproverJobError").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackApproverJobError` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackApproverJobError").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("approvalNotifierUserIds") != null && !jsonObj.get("approvalNotifierUserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvalNotifierUserIds` to be an array in the JSON string but got `%s`", jsonObj.get("approvalNotifierUserIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateApprovalChain.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateApprovalChain' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateApprovalChain> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateApprovalChain.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateApprovalChain>() {
           @Override
           public void write(JsonWriter out, UpdateApprovalChain value) throws IOException {
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
           public UpdateApprovalChain read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateApprovalChain instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateApprovalChain given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateApprovalChain
  * @throws IOException if the JSON string is invalid with respect to UpdateApprovalChain
  */
  public static UpdateApprovalChain fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateApprovalChain.class);
  }

 /**
  * Convert an instance of UpdateApprovalChain to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
