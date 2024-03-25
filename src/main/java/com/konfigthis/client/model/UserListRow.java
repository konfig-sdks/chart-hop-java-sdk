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
import com.konfigthis.client.model.Name;
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
 * UserListRow
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserListRow {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name name;

  /**
   * Gets or Sets inviteStatus
   */
  @JsonAdapter(InviteStatusEnum.Adapter.class)
 public enum InviteStatusEnum {
    INVITED("INVITED"),
    
    JOINED("JOINED"),
    
    NOT_INVITED("NOT_INVITED");

    private String value;

    InviteStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InviteStatusEnum fromValue(String value) {
      for (InviteStatusEnum b : InviteStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InviteStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InviteStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InviteStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InviteStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INVITE_STATUS = "inviteStatus";
  @SerializedName(SERIALIZED_NAME_INVITE_STATUS)
  private InviteStatusEnum inviteStatus;

  public static final String SERIALIZED_NAME_IS_ORG_MEMBER = "isOrgMember";
  @SerializedName(SERIALIZED_NAME_IS_ORG_MEMBER)
  private Boolean isOrgMember;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_PERSON_ID = "personId";
  @SerializedName(SERIALIZED_NAME_PERSON_ID)
  private String personId;

  public static final String SERIALIZED_NAME_IMAGE_PATH = "imagePath";
  @SerializedName(SERIALIZED_NAME_IMAGE_PATH)
  private String imagePath;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private String access;

  public static final String SERIALIZED_NAME_ROLE_LABEL = "roleLabel";
  @SerializedName(SERIALIZED_NAME_ROLE_LABEL)
  private String roleLabel;

  public static final String SERIALIZED_NAME_EXPR = "expr";
  @SerializedName(SERIALIZED_NAME_EXPR)
  private String expr;

  public static final String SERIALIZED_NAME_GROUP_IDS = "groupIds";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private Set<String> groupIds = null;

  public static final String SERIALIZED_NAME_LOGIN_AT = "loginAt";
  @SerializedName(SERIALIZED_NAME_LOGIN_AT)
  private Long loginAt;

  public static final String SERIALIZED_NAME_ACTIVE_AT = "activeAt";
  @SerializedName(SERIALIZED_NAME_ACTIVE_AT)
  private Long activeAt;

  public UserListRow() {
  }

  public UserListRow name(Name name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Name getName() {
    return name;
  }


  public void setName(Name name) {
    
    
    
    this.name = name;
  }


  public UserListRow inviteStatus(InviteStatusEnum inviteStatus) {
    
    
    
    
    this.inviteStatus = inviteStatus;
    return this;
  }

   /**
   * Get inviteStatus
   * @return inviteStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InviteStatusEnum getInviteStatus() {
    return inviteStatus;
  }


  public void setInviteStatus(InviteStatusEnum inviteStatus) {
    
    
    
    this.inviteStatus = inviteStatus;
  }


  public UserListRow isOrgMember(Boolean isOrgMember) {
    
    
    
    
    this.isOrgMember = isOrgMember;
    return this;
  }

   /**
   * Get isOrgMember
   * @return isOrgMember
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsOrgMember() {
    return isOrgMember;
  }


  public void setIsOrgMember(Boolean isOrgMember) {
    
    
    
    this.isOrgMember = isOrgMember;
  }


  public UserListRow userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
  }


  public UserListRow personId(String personId) {
    
    
    
    
    this.personId = personId;
    return this;
  }

   /**
   * Get personId
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPersonId() {
    return personId;
  }


  public void setPersonId(String personId) {
    
    
    
    this.personId = personId;
  }


  public UserListRow imagePath(String imagePath) {
    
    
    
    
    this.imagePath = imagePath;
    return this;
  }

   /**
   * Get imagePath
   * @return imagePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImagePath() {
    return imagePath;
  }


  public void setImagePath(String imagePath) {
    
    
    
    this.imagePath = imagePath;
  }


  public UserListRow email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public UserListRow access(String access) {
    
    
    
    
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccess() {
    return access;
  }


  public void setAccess(String access) {
    
    
    
    this.access = access;
  }


  public UserListRow roleLabel(String roleLabel) {
    
    
    
    
    this.roleLabel = roleLabel;
    return this;
  }

   /**
   * Get roleLabel
   * @return roleLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoleLabel() {
    return roleLabel;
  }


  public void setRoleLabel(String roleLabel) {
    
    
    
    this.roleLabel = roleLabel;
  }


  public UserListRow expr(String expr) {
    
    
    
    
    this.expr = expr;
    return this;
  }

   /**
   * Get expr
   * @return expr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpr() {
    return expr;
  }


  public void setExpr(String expr) {
    
    
    
    this.expr = expr;
  }


  public UserListRow groupIds(Set<String> groupIds) {
    
    
    
    
    this.groupIds = groupIds;
    return this;
  }

  public UserListRow addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new LinkedHashSet<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * Get groupIds
   * @return groupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getGroupIds() {
    return groupIds;
  }


  public void setGroupIds(Set<String> groupIds) {
    
    
    
    this.groupIds = groupIds;
  }


  public UserListRow loginAt(Long loginAt) {
    
    
    
    
    this.loginAt = loginAt;
    return this;
  }

   /**
   * Get loginAt
   * @return loginAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLoginAt() {
    return loginAt;
  }


  public void setLoginAt(Long loginAt) {
    
    
    
    this.loginAt = loginAt;
  }


  public UserListRow activeAt(Long activeAt) {
    
    
    
    
    this.activeAt = activeAt;
    return this;
  }

   /**
   * Get activeAt
   * @return activeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getActiveAt() {
    return activeAt;
  }


  public void setActiveAt(Long activeAt) {
    
    
    
    this.activeAt = activeAt;
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
   * @return the UserListRow instance itself
   */
  public UserListRow putAdditionalProperty(String key, Object value) {
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
    UserListRow userListRow = (UserListRow) o;
    return Objects.equals(this.name, userListRow.name) &&
        Objects.equals(this.inviteStatus, userListRow.inviteStatus) &&
        Objects.equals(this.isOrgMember, userListRow.isOrgMember) &&
        Objects.equals(this.userId, userListRow.userId) &&
        Objects.equals(this.personId, userListRow.personId) &&
        Objects.equals(this.imagePath, userListRow.imagePath) &&
        Objects.equals(this.email, userListRow.email) &&
        Objects.equals(this.access, userListRow.access) &&
        Objects.equals(this.roleLabel, userListRow.roleLabel) &&
        Objects.equals(this.expr, userListRow.expr) &&
        Objects.equals(this.groupIds, userListRow.groupIds) &&
        Objects.equals(this.loginAt, userListRow.loginAt) &&
        Objects.equals(this.activeAt, userListRow.activeAt)&&
        Objects.equals(this.additionalProperties, userListRow.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inviteStatus, isOrgMember, userId, personId, imagePath, email, access, roleLabel, expr, groupIds, loginAt, activeAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserListRow {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inviteStatus: ").append(toIndentedString(inviteStatus)).append("\n");
    sb.append("    isOrgMember: ").append(toIndentedString(isOrgMember)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    roleLabel: ").append(toIndentedString(roleLabel)).append("\n");
    sb.append("    expr: ").append(toIndentedString(expr)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    loginAt: ").append(toIndentedString(loginAt)).append("\n");
    sb.append("    activeAt: ").append(toIndentedString(activeAt)).append("\n");
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
    openapiFields.add("inviteStatus");
    openapiFields.add("isOrgMember");
    openapiFields.add("userId");
    openapiFields.add("personId");
    openapiFields.add("imagePath");
    openapiFields.add("email");
    openapiFields.add("access");
    openapiFields.add("roleLabel");
    openapiFields.add("expr");
    openapiFields.add("groupIds");
    openapiFields.add("loginAt");
    openapiFields.add("activeAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("inviteStatus");
    openapiRequiredFields.add("isOrgMember");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserListRow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserListRow.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserListRow is not found in the empty JSON string", UserListRow.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserListRow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `name`
      Name.validateJsonObject(jsonObj.getAsJsonObject("name"));
      if (!jsonObj.get("inviteStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inviteStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inviteStatus").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("personId") != null && !jsonObj.get("personId").isJsonNull()) && !jsonObj.get("personId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personId").toString()));
      }
      if ((jsonObj.get("imagePath") != null && !jsonObj.get("imagePath").isJsonNull()) && !jsonObj.get("imagePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imagePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imagePath").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("access") != null && !jsonObj.get("access").isJsonNull()) && !jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      if ((jsonObj.get("roleLabel") != null && !jsonObj.get("roleLabel").isJsonNull()) && !jsonObj.get("roleLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleLabel").toString()));
      }
      if ((jsonObj.get("expr") != null && !jsonObj.get("expr").isJsonNull()) && !jsonObj.get("expr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expr").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupIds") != null && !jsonObj.get("groupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupIds` to be an array in the JSON string but got `%s`", jsonObj.get("groupIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserListRow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserListRow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserListRow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserListRow.class));

       return (TypeAdapter<T>) new TypeAdapter<UserListRow>() {
           @Override
           public void write(JsonWriter out, UserListRow value) throws IOException {
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
           public UserListRow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserListRow instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserListRow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserListRow
  * @throws IOException if the JSON string is invalid with respect to UserListRow
  */
  public static UserListRow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserListRow.class);
  }

 /**
  * Convert an instance of UserListRow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
