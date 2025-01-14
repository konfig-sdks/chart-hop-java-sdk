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
import com.konfigthis.client.model.ApprovalGroupApprover;
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
 * ApprovalGroup
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApprovalGroup {
  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  /**
   * What type of group this is
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    REVIEWER("REVIEWER"),
    
    COLLABORATOR("COLLABORATOR"),
    
    FINAL_APPROVER("FINAL_APPROVER");

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

  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  private List<ApprovalGroupApprover> approvers = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPAND_EXPRESSION = "expandExpression";
  @SerializedName(SERIALIZED_NAME_EXPAND_EXPRESSION)
  private String expandExpression;

  public ApprovalGroup() {
  }

  public ApprovalGroup groupId(String groupId) {
    
    
    
    
    this.groupId = groupId;
    return this;
  }

   /**
   * globally unique id
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "globally unique id")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    
    
    
    this.groupId = groupId;
  }


  public ApprovalGroup type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * What type of group this is
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "What type of group this is")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public ApprovalGroup approvers(List<ApprovalGroupApprover> approvers) {
    
    
    
    
    this.approvers = approvers;
    return this;
  }

  public ApprovalGroup addApproversItem(ApprovalGroupApprover approversItem) {
    this.approvers.add(approversItem);
    return this;
  }

   /**
   * approvers that make up the group
   * @return approvers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "approvers that make up the group")

  public List<ApprovalGroupApprover> getApprovers() {
    return approvers;
  }


  public void setApprovers(List<ApprovalGroupApprover> approvers) {
    
    
    
    this.approvers = approvers;
  }


  public ApprovalGroup expandExpression(String expandExpression) {
    
    
    
    
    this.expandExpression = expandExpression;
    return this;
  }

   /**
   * optional custom expression to determine approval request tree
   * @return expandExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional custom expression to determine approval request tree")

  public String getExpandExpression() {
    return expandExpression;
  }


  public void setExpandExpression(String expandExpression) {
    
    
    
    this.expandExpression = expandExpression;
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
   * @return the ApprovalGroup instance itself
   */
  public ApprovalGroup putAdditionalProperty(String key, Object value) {
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
    ApprovalGroup approvalGroup = (ApprovalGroup) o;
    return Objects.equals(this.groupId, approvalGroup.groupId) &&
        Objects.equals(this.type, approvalGroup.type) &&
        Objects.equals(this.approvers, approvalGroup.approvers) &&
        Objects.equals(this.expandExpression, approvalGroup.expandExpression)&&
        Objects.equals(this.additionalProperties, approvalGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, type, approvers, expandExpression, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalGroup {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
    sb.append("    expandExpression: ").append(toIndentedString(expandExpression)).append("\n");
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
    openapiFields.add("groupId");
    openapiFields.add("type");
    openapiFields.add("approvers");
    openapiFields.add("expandExpression");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("approvers");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApprovalGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApprovalGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApprovalGroup is not found in the empty JSON string", ApprovalGroup.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApprovalGroup.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("approvers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
      }

      JsonArray jsonArrayapprovers = jsonObj.getAsJsonArray("approvers");
      // validate the required field `approvers` (array)
      for (int i = 0; i < jsonArrayapprovers.size(); i++) {
        ApprovalGroupApprover.validateJsonObject(jsonArrayapprovers.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("expandExpression") != null && !jsonObj.get("expandExpression").isJsonNull()) && !jsonObj.get("expandExpression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expandExpression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expandExpression").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApprovalGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApprovalGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApprovalGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApprovalGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<ApprovalGroup>() {
           @Override
           public void write(JsonWriter out, ApprovalGroup value) throws IOException {
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
           public ApprovalGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApprovalGroup instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApprovalGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApprovalGroup
  * @throws IOException if the JSON string is invalid with respect to ApprovalGroup
  */
  public static ApprovalGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApprovalGroup.class);
  }

 /**
  * Convert an instance of ApprovalGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

