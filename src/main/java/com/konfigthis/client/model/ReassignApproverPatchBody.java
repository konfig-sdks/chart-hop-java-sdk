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
 * ReassignApproverPatchBody
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReassignApproverPatchBody {
  public static final String SERIALIZED_NAME_STAGE_ORDER = "stageOrder";
  @SerializedName(SERIALIZED_NAME_STAGE_ORDER)
  private Integer stageOrder;

  public static final String SERIALIZED_NAME_INITIAL_JOB_ID = "initialJobId";
  @SerializedName(SERIALIZED_NAME_INITIAL_JOB_ID)
  private String initialJobId;

  public static final String SERIALIZED_NAME_REASSIGN_JOB_ID = "reassignJobId";
  @SerializedName(SERIALIZED_NAME_REASSIGN_JOB_ID)
  private String reassignJobId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public ReassignApproverPatchBody() {
  }

  public ReassignApproverPatchBody stageOrder(Integer stageOrder) {
    
    
    
    
    this.stageOrder = stageOrder;
    return this;
  }

   /**
   * Get stageOrder
   * @return stageOrder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStageOrder() {
    return stageOrder;
  }


  public void setStageOrder(Integer stageOrder) {
    
    
    
    this.stageOrder = stageOrder;
  }


  public ReassignApproverPatchBody initialJobId(String initialJobId) {
    
    
    
    
    this.initialJobId = initialJobId;
    return this;
  }

   /**
   * Get initialJobId
   * @return initialJobId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getInitialJobId() {
    return initialJobId;
  }


  public void setInitialJobId(String initialJobId) {
    
    
    
    this.initialJobId = initialJobId;
  }


  public ReassignApproverPatchBody reassignJobId(String reassignJobId) {
    
    
    
    
    this.reassignJobId = reassignJobId;
    return this;
  }

   /**
   * Get reassignJobId
   * @return reassignJobId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getReassignJobId() {
    return reassignJobId;
  }


  public void setReassignJobId(String reassignJobId) {
    
    
    
    this.reassignJobId = reassignJobId;
  }


  public ReassignApproverPatchBody message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
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
   * @return the ReassignApproverPatchBody instance itself
   */
  public ReassignApproverPatchBody putAdditionalProperty(String key, Object value) {
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
    ReassignApproverPatchBody reassignApproverPatchBody = (ReassignApproverPatchBody) o;
    return Objects.equals(this.stageOrder, reassignApproverPatchBody.stageOrder) &&
        Objects.equals(this.initialJobId, reassignApproverPatchBody.initialJobId) &&
        Objects.equals(this.reassignJobId, reassignApproverPatchBody.reassignJobId) &&
        Objects.equals(this.message, reassignApproverPatchBody.message)&&
        Objects.equals(this.additionalProperties, reassignApproverPatchBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stageOrder, initialJobId, reassignJobId, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReassignApproverPatchBody {\n");
    sb.append("    stageOrder: ").append(toIndentedString(stageOrder)).append("\n");
    sb.append("    initialJobId: ").append(toIndentedString(initialJobId)).append("\n");
    sb.append("    reassignJobId: ").append(toIndentedString(reassignJobId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("stageOrder");
    openapiFields.add("initialJobId");
    openapiFields.add("reassignJobId");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("stageOrder");
    openapiRequiredFields.add("initialJobId");
    openapiRequiredFields.add("reassignJobId");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReassignApproverPatchBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReassignApproverPatchBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReassignApproverPatchBody is not found in the empty JSON string", ReassignApproverPatchBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReassignApproverPatchBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("initialJobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initialJobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initialJobId").toString()));
      }
      if (!jsonObj.get("reassignJobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reassignJobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reassignJobId").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReassignApproverPatchBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReassignApproverPatchBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReassignApproverPatchBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReassignApproverPatchBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ReassignApproverPatchBody>() {
           @Override
           public void write(JsonWriter out, ReassignApproverPatchBody value) throws IOException {
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
           public ReassignApproverPatchBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReassignApproverPatchBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReassignApproverPatchBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReassignApproverPatchBody
  * @throws IOException if the JSON string is invalid with respect to ReassignApproverPatchBody
  */
  public static ReassignApproverPatchBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReassignApproverPatchBody.class);
  }

 /**
  * Convert an instance of ReassignApproverPatchBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

