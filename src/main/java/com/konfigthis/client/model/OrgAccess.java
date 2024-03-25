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
 * OrgAccess
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrgAccess {
  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_PERSON_ID = "personId";
  @SerializedName(SERIALIZED_NAME_PERSON_ID)
  private String personId;

  /**
   * legacy access permission level
   */
  @JsonAdapter(AccessEnum.Adapter.class)
 public enum AccessEnum {
    NONE("NONE"),
    
    VIEW("VIEW"),
    
    LIMITED("LIMITED"),
    
    MEMBER_LIMITED_COMP("MEMBER_LIMITED_COMP"),
    
    MEMBER("MEMBER"),
    
    CUSTOM("CUSTOM"),
    
    TECH_OWNER("TECH_OWNER"),
    
    TIMEOFF("TIMEOFF"),
    
    CONTACT("CONTACT"),
    
    COMP_CASH("COMP_CASH"),
    
    COMP_EQUITY("COMP_EQUITY"),
    
    COMP_ALL("COMP_ALL"),
    
    RECRUIT_SENSITIVE("RECRUIT_SENSITIVE"),
    
    RECRUIT_PRIMARY("RECRUIT_PRIMARY"),
    
    SENSITIVE_LIMITED_COMP("SENSITIVE_LIMITED_COMP"),
    
    SENSITIVE("SENSITIVE"),
    
    PRIMARY("PRIMARY"),
    
    PEOPLE_OPS_ADMIN("PEOPLE_OPS_ADMIN"),
    
    PEOPLE_OPS_ADMIN_NO_COMP_DATA("PEOPLE_OPS_ADMIN_NO_COMP_DATA"),
    
    PEOPLE_OPS_ADMIN_NO_SENSITIVE_DATA("PEOPLE_OPS_ADMIN_NO_SENSITIVE_DATA"),
    
    OWNER("OWNER");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String value) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private AccessEnum access;

  public static final String SERIALIZED_NAME_GROUP_IDS = "groupIds";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private Set<String> groupIds = null;

  public static final String SERIALIZED_NAME_EXPR = "expr";
  @SerializedName(SERIALIZED_NAME_EXPR)
  private String expr;

  public static final String SERIALIZED_NAME_EXPIRE_AT = "expireAt";
  @SerializedName(SERIALIZED_NAME_EXPIRE_AT)
  private String expireAt;

  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  public OrgAccess() {
  }

  public OrgAccess orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * org id
   * @return orgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5887a7718f138b6a2a0041a7", required = true, value = "org id")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public OrgAccess personId(String personId) {
    
    
    
    
    this.personId = personId;
    return this;
  }

   /**
   * person id, if this user directly corresponds with a person
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5887a7718f138b6a2a0041a7", value = "person id, if this user directly corresponds with a person")

  public String getPersonId() {
    return personId;
  }


  public void setPersonId(String personId) {
    
    
    
    this.personId = personId;
  }


  public OrgAccess access(AccessEnum access) {
    
    
    
    
    this.access = access;
    return this;
  }

   /**
   * legacy access permission level
   * @return access
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "legacy access permission level")

  public AccessEnum getAccess() {
    return access;
  }


  public void setAccess(AccessEnum access) {
    
    
    
    this.access = access;
  }


  public OrgAccess groupIds(Set<String> groupIds) {
    
    
    
    
    this.groupIds = groupIds;
    return this;
  }

  public OrgAccess addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new LinkedHashSet<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * group ids that the above access applies to
   * @return groupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "group ids that the above access applies to")

  public Set<String> getGroupIds() {
    return groupIds;
  }


  public void setGroupIds(Set<String> groupIds) {
    
    
    
    this.groupIds = groupIds;
  }


  public OrgAccess expr(String expr) {
    
    
    
    
    this.expr = expr;
    return this;
  }

   /**
   * expression that the above access applies to
   * @return expr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "expression that the above access applies to")

  public String getExpr() {
    return expr;
  }


  public void setExpr(String expr) {
    
    
    
    this.expr = expr;
  }


  public OrgAccess expireAt(String expireAt) {
    
    
    
    
    this.expireAt = expireAt;
    return this;
  }

   /**
   * timestamp that this org access will expire
   * @return expireAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "timestamp that this org access will expire")

  public String getExpireAt() {
    return expireAt;
  }


  public void setExpireAt(String expireAt) {
    
    
    
    this.expireAt = expireAt;
  }


  public OrgAccess roleId(String roleId) {
    
    
    
    
    this.roleId = roleId;
    return this;
  }

   /**
   * the role id that defines the users access
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5887a7718f138b6a2a0041a7", value = "the role id that defines the users access")

  public String getRoleId() {
    return roleId;
  }


  public void setRoleId(String roleId) {
    
    
    
    this.roleId = roleId;
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
   * @return the OrgAccess instance itself
   */
  public OrgAccess putAdditionalProperty(String key, Object value) {
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
    OrgAccess orgAccess = (OrgAccess) o;
    return Objects.equals(this.orgId, orgAccess.orgId) &&
        Objects.equals(this.personId, orgAccess.personId) &&
        Objects.equals(this.access, orgAccess.access) &&
        Objects.equals(this.groupIds, orgAccess.groupIds) &&
        Objects.equals(this.expr, orgAccess.expr) &&
        Objects.equals(this.expireAt, orgAccess.expireAt) &&
        Objects.equals(this.roleId, orgAccess.roleId)&&
        Objects.equals(this.additionalProperties, orgAccess.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, personId, access, groupIds, expr, expireAt, roleId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgAccess {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    expr: ").append(toIndentedString(expr)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
    openapiFields.add("orgId");
    openapiFields.add("personId");
    openapiFields.add("access");
    openapiFields.add("groupIds");
    openapiFields.add("expr");
    openapiFields.add("expireAt");
    openapiFields.add("roleId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orgId");
    openapiRequiredFields.add("access");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrgAccess
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrgAccess.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgAccess is not found in the empty JSON string", OrgAccess.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrgAccess.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if ((jsonObj.get("personId") != null && !jsonObj.get("personId").isJsonNull()) && !jsonObj.get("personId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personId").toString()));
      }
      if (!jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupIds") != null && !jsonObj.get("groupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupIds` to be an array in the JSON string but got `%s`", jsonObj.get("groupIds").toString()));
      }
      if ((jsonObj.get("expr") != null && !jsonObj.get("expr").isJsonNull()) && !jsonObj.get("expr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expr").toString()));
      }
      if ((jsonObj.get("expireAt") != null && !jsonObj.get("expireAt").isJsonNull()) && !jsonObj.get("expireAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expireAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expireAt").toString()));
      }
      if ((jsonObj.get("roleId") != null && !jsonObj.get("roleId").isJsonNull()) && !jsonObj.get("roleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgAccess.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgAccess' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgAccess> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgAccess.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgAccess>() {
           @Override
           public void write(JsonWriter out, OrgAccess value) throws IOException {
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
           public OrgAccess read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrgAccess instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrgAccess given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrgAccess
  * @throws IOException if the JSON string is invalid with respect to OrgAccess
  */
  public static OrgAccess fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgAccess.class);
  }

 /**
  * Convert an instance of OrgAccess to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

