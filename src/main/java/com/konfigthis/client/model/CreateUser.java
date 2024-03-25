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
import com.konfigthis.client.model.OrgAccess;
import com.konfigthis.client.model.UserEmailSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
 * CreateUser
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateUser {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ORGS = "orgs";
  @SerializedName(SERIALIZED_NAME_ORGS)
  private Set<OrgAccess> orgs = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_IMAGE_PATH = "imagePath";
  @SerializedName(SERIALIZED_NAME_IMAGE_PATH)
  private String imagePath;

  /**
   * current status of user
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    SUPERUSER("SUPERUSER"),
    
    NORMAL("NORMAL"),
    
    INACTIVE("INACTIVE"),
    
    UNINSTALLED("UNINSTALLED");

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

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Object options;

  public static final String SERIALIZED_NAME_INTERNAL_OPTIONS = "internalOptions";
  @SerializedName(SERIALIZED_NAME_INTERNAL_OPTIONS)
  private Object internalOptions;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private Object secrets;

  public static final String SERIALIZED_NAME_EMAIL_SETTINGS = "emailSettings";
  @SerializedName(SERIALIZED_NAME_EMAIL_SETTINGS)
  private List<UserEmailSetting> emailSettings = null;

  public CreateUser() {
  }

  public CreateUser appId(String appId) {
    
    
    
    
    this.appId = appId;
    return this;
  }

   /**
   * if the user is an app user, the id of the app
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if the user is an app user, the id of the app")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    
    
    
    this.appId = appId;
  }


  public CreateUser name(Name name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name getName() {
    return name;
  }


  public void setName(Name name) {
    
    
    
    this.name = name;
  }


  public CreateUser email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * email address of user
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bob@example.com", value = "email address of user")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public CreateUser orgs(Set<OrgAccess> orgs) {
    
    
    
    
    this.orgs = orgs;
    return this;
  }

  public CreateUser addOrgsItem(OrgAccess orgsItem) {
    this.orgs.add(orgsItem);
    return this;
  }

   /**
   * list of member orgs with permission levels
   * @return orgs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "list of member orgs with permission levels")

  public Set<OrgAccess> getOrgs() {
    return orgs;
  }


  public void setOrgs(Set<OrgAccess> orgs) {
    
    
    
    this.orgs = orgs;
  }


  public CreateUser imagePath(String imagePath) {
    
    
    
    
    this.imagePath = imagePath;
    return this;
  }

   /**
   * path to full-sized profile image in storage
   * @return imagePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "path to full-sized profile image in storage")

  public String getImagePath() {
    return imagePath;
  }


  public void setImagePath(String imagePath) {
    
    
    
    this.imagePath = imagePath;
  }


  public CreateUser status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * current status of user
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current status of user")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public CreateUser options(Object options) {
    
    
    
    
    this.options = options;
    return this;
  }

   /**
   * for apps, options (specific options are specific to the particular app); for users, user-set preferences
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "for apps, options (specific options are specific to the particular app); for users, user-set preferences")

  public Object getOptions() {
    return options;
  }


  public void setOptions(Object options) {
    
    
    
    this.options = options;
  }


  public CreateUser internalOptions(Object internalOptions) {
    
    
    
    
    this.internalOptions = internalOptions;
    return this;
  }

   /**
   * internal (ChartHop controlled) options
   * @return internalOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "internal (ChartHop controlled) options")

  public Object getInternalOptions() {
    return internalOptions;
  }


  public void setInternalOptions(Object internalOptions) {
    
    
    
    this.internalOptions = internalOptions;
  }


  public CreateUser secrets(Object secrets) {
    
    
    
    
    this.secrets = secrets;
    return this;
  }

   /**
   * write-only secrets; the content of these secrets are not retrievable via the external-facing API
   * @return secrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "write-only secrets; the content of these secrets are not retrievable via the external-facing API")

  public Object getSecrets() {
    return secrets;
  }


  public void setSecrets(Object secrets) {
    
    
    
    this.secrets = secrets;
  }


  public CreateUser emailSettings(List<UserEmailSetting> emailSettings) {
    
    
    
    
    this.emailSettings = emailSettings;
    return this;
  }

  public CreateUser addEmailSettingsItem(UserEmailSetting emailSettingsItem) {
    if (this.emailSettings == null) {
      this.emailSettings = new ArrayList<>();
    }
    this.emailSettings.add(emailSettingsItem);
    return this;
  }

   /**
   * Email settings for the user
   * @return emailSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email settings for the user")

  public List<UserEmailSetting> getEmailSettings() {
    return emailSettings;
  }


  public void setEmailSettings(List<UserEmailSetting> emailSettings) {
    
    
    
    this.emailSettings = emailSettings;
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
   * @return the CreateUser instance itself
   */
  public CreateUser putAdditionalProperty(String key, Object value) {
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
    CreateUser createUser = (CreateUser) o;
    return Objects.equals(this.appId, createUser.appId) &&
        Objects.equals(this.name, createUser.name) &&
        Objects.equals(this.email, createUser.email) &&
        Objects.equals(this.orgs, createUser.orgs) &&
        Objects.equals(this.imagePath, createUser.imagePath) &&
        Objects.equals(this.status, createUser.status) &&
        Objects.equals(this.options, createUser.options) &&
        Objects.equals(this.internalOptions, createUser.internalOptions) &&
        Objects.equals(this.secrets, createUser.secrets) &&
        Objects.equals(this.emailSettings, createUser.emailSettings)&&
        Objects.equals(this.additionalProperties, createUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, name, email, orgs, imagePath, status, options, internalOptions, secrets, emailSettings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUser {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    internalOptions: ").append(toIndentedString(internalOptions)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
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
    openapiFields.add("appId");
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("orgs");
    openapiFields.add("imagePath");
    openapiFields.add("status");
    openapiFields.add("options");
    openapiFields.add("internalOptions");
    openapiFields.add("secrets");
    openapiFields.add("emailSettings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orgs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateUser is not found in the empty JSON string", CreateUser.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateUser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("appId") != null && !jsonObj.get("appId").isJsonNull()) && !jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        Name.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("orgs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgs` to be an array in the JSON string but got `%s`", jsonObj.get("orgs").toString()));
      }

      JsonArray jsonArrayorgs = jsonObj.getAsJsonArray("orgs");
      // validate the required field `orgs` (array)
      for (int i = 0; i < jsonArrayorgs.size(); i++) {
        OrgAccess.validateJsonObject(jsonArrayorgs.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("imagePath") != null && !jsonObj.get("imagePath").isJsonNull()) && !jsonObj.get("imagePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imagePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imagePath").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("emailSettings") != null && !jsonObj.get("emailSettings").isJsonNull()) {
        JsonArray jsonArrayemailSettings = jsonObj.getAsJsonArray("emailSettings");
        if (jsonArrayemailSettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emailSettings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emailSettings` to be an array in the JSON string but got `%s`", jsonObj.get("emailSettings").toString()));
          }

          // validate the optional field `emailSettings` (array)
          for (int i = 0; i < jsonArrayemailSettings.size(); i++) {
            UserEmailSetting.validateJsonObject(jsonArrayemailSettings.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateUser.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateUser>() {
           @Override
           public void write(JsonWriter out, CreateUser value) throws IOException {
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
           public CreateUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateUser instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateUser
  * @throws IOException if the JSON string is invalid with respect to CreateUser
  */
  public static CreateUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateUser.class);
  }

 /**
  * Convert an instance of CreateUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
