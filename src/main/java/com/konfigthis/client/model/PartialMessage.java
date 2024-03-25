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
 * PartialMessage
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PartialMessage {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  /**
   * type of message
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    CHAT("CHAT"),
    
    EMAIL("EMAIL"),
    
    WEB("WEB");

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

  /**
   * type of notification (SUCCESS, ERR, ANNOUNCEMENT etc.)
   */
  @JsonAdapter(NotificationTypeEnum.Adapter.class)
 public enum NotificationTypeEnum {
    SUCCESS("SUCCESS"),
    
    WARN("WARN"),
    
    ERROR("ERROR"),
    
    COMMENT("COMMENT"),
    
    TASK_COMPLETED("TASK_COMPLETED"),
    
    TASK_ASSIGNED("TASK_ASSIGNED"),
    
    REMINDER("REMINDER"),
    
    ANNOUNCEMENT("ANNOUNCEMENT"),
    
    PROCESS_ERROR("PROCESS_ERROR"),
    
    PROCESS_DONE("PROCESS_DONE");

    private String value;

    NotificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationTypeEnum fromValue(String value) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotificationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private NotificationTypeEnum notificationType;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_MESSAGE_URL = "messageUrl";
  @SerializedName(SERIALIZED_NAME_MESSAGE_URL)
  private String messageUrl;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_READ_AT = "readAt";
  @SerializedName(SERIALIZED_NAME_READ_AT)
  private String readAt;

  public static final String SERIALIZED_NAME_SEEN_AT = "seenAt";
  @SerializedName(SERIALIZED_NAME_SEEN_AT)
  private String seenAt;

  public static final String SERIALIZED_NAME_CREATE_ID = "createId";
  @SerializedName(SERIALIZED_NAME_CREATE_ID)
  private String createId;

  public static final String SERIALIZED_NAME_CREATE_AT = "createAt";
  @SerializedName(SERIALIZED_NAME_CREATE_AT)
  private String createAt;

  public PartialMessage() {
  }

  public PartialMessage title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * message title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "message title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public PartialMessage id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * globally unique id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "globally unique id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public PartialMessage orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * parent organization id
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "parent organization id")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public PartialMessage type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * type of message
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type of message")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public PartialMessage notificationType(NotificationTypeEnum notificationType) {
    
    
    
    
    this.notificationType = notificationType;
    return this;
  }

   /**
   * type of notification (SUCCESS, ERR, ANNOUNCEMENT etc.)
   * @return notificationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type of notification (SUCCESS, ERR, ANNOUNCEMENT etc.)")

  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }


  public void setNotificationType(NotificationTypeEnum notificationType) {
    
    
    
    this.notificationType = notificationType;
  }


  public PartialMessage userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * user who receives the message
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "user who receives the message")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
  }


  public PartialMessage content(String content) {
    
    
    
    
    this.content = content;
    return this;
  }

   /**
   * message content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "message content")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    
    
    
    this.content = content;
  }


  public PartialMessage messageUrl(String messageUrl) {
    
    
    
    
    this.messageUrl = messageUrl;
    return this;
  }

   /**
   * link to message content (if applicable)
   * @return messageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "link to message content (if applicable)")

  public String getMessageUrl() {
    return messageUrl;
  }


  public void setMessageUrl(String messageUrl) {
    
    
    
    this.messageUrl = messageUrl;
  }


  public PartialMessage key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * key of message if applicable (e.g. product-tour, import-complete-{id})
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "key of message if applicable (e.g. product-tour, import-complete-{id})")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


  public PartialMessage readAt(String readAt) {
    
    
    
    
    this.readAt = readAt;
    return this;
  }

   /**
   * read timestamp
   * @return readAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", value = "read timestamp")

  public String getReadAt() {
    return readAt;
  }


  public void setReadAt(String readAt) {
    
    
    
    this.readAt = readAt;
  }


  public PartialMessage seenAt(String seenAt) {
    
    
    
    
    this.seenAt = seenAt;
    return this;
  }

   /**
   * seen timestamp
   * @return seenAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", value = "seen timestamp")

  public String getSeenAt() {
    return seenAt;
  }


  public void setSeenAt(String seenAt) {
    
    
    
    this.seenAt = seenAt;
  }


  public PartialMessage createId(String createId) {
    
    
    
    
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


  public PartialMessage createAt(String createAt) {
    
    
    
    
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
   * @return the PartialMessage instance itself
   */
  public PartialMessage putAdditionalProperty(String key, Object value) {
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
    PartialMessage partialMessage = (PartialMessage) o;
    return Objects.equals(this.title, partialMessage.title) &&
        Objects.equals(this.id, partialMessage.id) &&
        Objects.equals(this.orgId, partialMessage.orgId) &&
        Objects.equals(this.type, partialMessage.type) &&
        Objects.equals(this.notificationType, partialMessage.notificationType) &&
        Objects.equals(this.userId, partialMessage.userId) &&
        Objects.equals(this.content, partialMessage.content) &&
        Objects.equals(this.messageUrl, partialMessage.messageUrl) &&
        Objects.equals(this.key, partialMessage.key) &&
        Objects.equals(this.readAt, partialMessage.readAt) &&
        Objects.equals(this.seenAt, partialMessage.seenAt) &&
        Objects.equals(this.createId, partialMessage.createId) &&
        Objects.equals(this.createAt, partialMessage.createAt)&&
        Objects.equals(this.additionalProperties, partialMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, id, orgId, type, notificationType, userId, content, messageUrl, key, readAt, seenAt, createId, createAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialMessage {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    messageUrl: ").append(toIndentedString(messageUrl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    readAt: ").append(toIndentedString(readAt)).append("\n");
    sb.append("    seenAt: ").append(toIndentedString(seenAt)).append("\n");
    sb.append("    createId: ").append(toIndentedString(createId)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("id");
    openapiFields.add("orgId");
    openapiFields.add("type");
    openapiFields.add("notificationType");
    openapiFields.add("userId");
    openapiFields.add("content");
    openapiFields.add("messageUrl");
    openapiFields.add("key");
    openapiFields.add("readAt");
    openapiFields.add("seenAt");
    openapiFields.add("createId");
    openapiFields.add("createAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartialMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PartialMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartialMessage is not found in the empty JSON string", PartialMessage.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("notificationType") != null && !jsonObj.get("notificationType").isJsonNull()) && !jsonObj.get("notificationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationType").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("messageUrl") != null && !jsonObj.get("messageUrl").isJsonNull()) && !jsonObj.get("messageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageUrl").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("readAt") != null && !jsonObj.get("readAt").isJsonNull()) && !jsonObj.get("readAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `readAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("readAt").toString()));
      }
      if ((jsonObj.get("seenAt") != null && !jsonObj.get("seenAt").isJsonNull()) && !jsonObj.get("seenAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seenAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seenAt").toString()));
      }
      if ((jsonObj.get("createId") != null && !jsonObj.get("createId").isJsonNull()) && !jsonObj.get("createId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createId").toString()));
      }
      if ((jsonObj.get("createAt") != null && !jsonObj.get("createAt").isJsonNull()) && !jsonObj.get("createAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartialMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartialMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartialMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartialMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<PartialMessage>() {
           @Override
           public void write(JsonWriter out, PartialMessage value) throws IOException {
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
           public PartialMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PartialMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PartialMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartialMessage
  * @throws IOException if the JSON string is invalid with respect to PartialMessage
  */
  public static PartialMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartialMessage.class);
  }

 /**
  * Convert an instance of PartialMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

