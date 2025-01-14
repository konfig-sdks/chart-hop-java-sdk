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
import java.time.LocalDate;

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
 * GenerateTemplateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GenerateTemplateRequest {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_EMAIL_SUBJECT = "emailSubject";
  @SerializedName(SERIALIZED_NAME_EMAIL_SUBJECT)
  private String emailSubject;

  public static final String SERIALIZED_NAME_EMAIL_MESSAGE = "emailMessage";
  @SerializedName(SERIALIZED_NAME_EMAIL_MESSAGE)
  private String emailMessage;

  public static final String SERIALIZED_NAME_SAVE_TO_FILES = "saveToFiles";
  @SerializedName(SERIALIZED_NAME_SAVE_TO_FILES)
  private Boolean saveToFiles;

  /**
   * Gets or Sets fileSensitive
   */
  @JsonAdapter(FileSensitiveEnum.Adapter.class)
 public enum FileSensitiveEnum {
    GLOBAL("GLOBAL"),
    
    ORG("ORG"),
    
    ORG_OTHER("ORG_OTHER"),
    
    PERSONAL_DEMOG("PERSONAL_DEMOG"),
    
    PERSONAL_BIRTH("PERSONAL_BIRTH"),
    
    PERSONAL_CONTACT("PERSONAL_CONTACT"),
    
    PERSONAL_PRIVATE("PERSONAL_PRIVATE"),
    
    SENSITIVE_BIRTH("SENSITIVE_BIRTH"),
    
    SENSITIVE_CONTACT("SENSITIVE_CONTACT"),
    
    TIMEOFF("TIMEOFF"),
    
    COMP_CASH("COMP_CASH"),
    
    COMP_EQUITY("COMP_EQUITY"),
    
    SENSITIVE("SENSITIVE"),
    
    PERSONAL("PERSONAL"),
    
    MANAGER("MANAGER"),
    
    GRAND_MANAGER("GRAND_MANAGER"),
    
    DIRECT("DIRECT"),
    
    PEERS("PEERS"),
    
    HIGH("HIGH"),
    
    PRIVATE("PRIVATE");

    private String value;

    FileSensitiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileSensitiveEnum fromValue(String value) {
      for (FileSensitiveEnum b : FileSensitiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FileSensitiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileSensitiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileSensitiveEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FileSensitiveEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FILE_SENSITIVE = "fileSensitive";
  @SerializedName(SERIALIZED_NAME_FILE_SENSITIVE)
  private FileSensitiveEnum fileSensitive;

  public static final String SERIALIZED_NAME_FILE_FIELD = "fileField";
  @SerializedName(SERIALIZED_NAME_FILE_FIELD)
  private String fileField;

  public static final String SERIALIZED_NAME_SEND_TO_MANAGERS = "sendToManagers";
  @SerializedName(SERIALIZED_NAME_SEND_TO_MANAGERS)
  private Boolean sendToManagers;

  public static final String SERIALIZED_NAME_SEND_TO_PERSONS = "sendToPersons";
  @SerializedName(SERIALIZED_NAME_SEND_TO_PERSONS)
  private Boolean sendToPersons;

  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private String scenarioId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_USE_SCENARIO_CHANGES = "useScenarioChanges";
  @SerializedName(SERIALIZED_NAME_USE_SCENARIO_CHANGES)
  private Boolean useScenarioChanges;

  /**
   * Gets or Sets changeGroupingType
   */
  @JsonAdapter(ChangeGroupingTypeEnum.Adapter.class)
 public enum ChangeGroupingTypeEnum {
    PRIMARY("PRIMARY"),
    
    SCENARIO("SCENARIO"),
    
    COMP_REVIEW("COMP_REVIEW");

    private String value;

    ChangeGroupingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChangeGroupingTypeEnum fromValue(String value) {
      for (ChangeGroupingTypeEnum b : ChangeGroupingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChangeGroupingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChangeGroupingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChangeGroupingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChangeGroupingTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANGE_GROUPING_TYPE = "changeGroupingType";
  @SerializedName(SERIALIZED_NAME_CHANGE_GROUPING_TYPE)
  private ChangeGroupingTypeEnum changeGroupingType;

  public static final String SERIALIZED_NAME_CHANGE_GROUPING_ID = "changeGroupingId";
  @SerializedName(SERIALIZED_NAME_CHANGE_GROUPING_ID)
  private String changeGroupingId;

  public GenerateTemplateRequest() {
  }

  public GenerateTemplateRequest filter(String filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    
    
    
    this.filter = filter;
  }


  public GenerateTemplateRequest emailSubject(String emailSubject) {
    
    
    
    
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Get emailSubject
   * @return emailSubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailSubject() {
    return emailSubject;
  }


  public void setEmailSubject(String emailSubject) {
    
    
    
    this.emailSubject = emailSubject;
  }


  public GenerateTemplateRequest emailMessage(String emailMessage) {
    
    
    
    
    this.emailMessage = emailMessage;
    return this;
  }

   /**
   * Get emailMessage
   * @return emailMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailMessage() {
    return emailMessage;
  }


  public void setEmailMessage(String emailMessage) {
    
    
    
    this.emailMessage = emailMessage;
  }


  public GenerateTemplateRequest saveToFiles(Boolean saveToFiles) {
    
    
    
    
    this.saveToFiles = saveToFiles;
    return this;
  }

   /**
   * Get saveToFiles
   * @return saveToFiles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSaveToFiles() {
    return saveToFiles;
  }


  public void setSaveToFiles(Boolean saveToFiles) {
    
    
    
    this.saveToFiles = saveToFiles;
  }


  public GenerateTemplateRequest fileSensitive(FileSensitiveEnum fileSensitive) {
    
    
    
    
    this.fileSensitive = fileSensitive;
    return this;
  }

   /**
   * Get fileSensitive
   * @return fileSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileSensitiveEnum getFileSensitive() {
    return fileSensitive;
  }


  public void setFileSensitive(FileSensitiveEnum fileSensitive) {
    
    
    
    this.fileSensitive = fileSensitive;
  }


  public GenerateTemplateRequest fileField(String fileField) {
    
    
    
    
    this.fileField = fileField;
    return this;
  }

   /**
   * Get fileField
   * @return fileField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileField() {
    return fileField;
  }


  public void setFileField(String fileField) {
    
    
    
    this.fileField = fileField;
  }


  public GenerateTemplateRequest sendToManagers(Boolean sendToManagers) {
    
    
    
    
    this.sendToManagers = sendToManagers;
    return this;
  }

   /**
   * Get sendToManagers
   * @return sendToManagers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSendToManagers() {
    return sendToManagers;
  }


  public void setSendToManagers(Boolean sendToManagers) {
    
    
    
    this.sendToManagers = sendToManagers;
  }


  public GenerateTemplateRequest sendToPersons(Boolean sendToPersons) {
    
    
    
    
    this.sendToPersons = sendToPersons;
    return this;
  }

   /**
   * Get sendToPersons
   * @return sendToPersons
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSendToPersons() {
    return sendToPersons;
  }


  public void setSendToPersons(Boolean sendToPersons) {
    
    
    
    this.sendToPersons = sendToPersons;
  }


  public GenerateTemplateRequest scenarioId(String scenarioId) {
    
    
    
    
    this.scenarioId = scenarioId;
    return this;
  }

   /**
   * Get scenarioId
   * @return scenarioId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScenarioId() {
    return scenarioId;
  }


  public void setScenarioId(String scenarioId) {
    
    
    
    this.scenarioId = scenarioId;
  }


  public GenerateTemplateRequest date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public GenerateTemplateRequest useScenarioChanges(Boolean useScenarioChanges) {
    
    
    
    
    this.useScenarioChanges = useScenarioChanges;
    return this;
  }

   /**
   * Get useScenarioChanges
   * @return useScenarioChanges
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getUseScenarioChanges() {
    return useScenarioChanges;
  }


  public void setUseScenarioChanges(Boolean useScenarioChanges) {
    
    
    
    this.useScenarioChanges = useScenarioChanges;
  }


  public GenerateTemplateRequest changeGroupingType(ChangeGroupingTypeEnum changeGroupingType) {
    
    
    
    
    this.changeGroupingType = changeGroupingType;
    return this;
  }

   /**
   * Get changeGroupingType
   * @return changeGroupingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChangeGroupingTypeEnum getChangeGroupingType() {
    return changeGroupingType;
  }


  public void setChangeGroupingType(ChangeGroupingTypeEnum changeGroupingType) {
    
    
    
    this.changeGroupingType = changeGroupingType;
  }


  public GenerateTemplateRequest changeGroupingId(String changeGroupingId) {
    
    
    
    
    this.changeGroupingId = changeGroupingId;
    return this;
  }

   /**
   * Get changeGroupingId
   * @return changeGroupingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChangeGroupingId() {
    return changeGroupingId;
  }


  public void setChangeGroupingId(String changeGroupingId) {
    
    
    
    this.changeGroupingId = changeGroupingId;
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
   * @return the GenerateTemplateRequest instance itself
   */
  public GenerateTemplateRequest putAdditionalProperty(String key, Object value) {
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
    GenerateTemplateRequest generateTemplateRequest = (GenerateTemplateRequest) o;
    return Objects.equals(this.filter, generateTemplateRequest.filter) &&
        Objects.equals(this.emailSubject, generateTemplateRequest.emailSubject) &&
        Objects.equals(this.emailMessage, generateTemplateRequest.emailMessage) &&
        Objects.equals(this.saveToFiles, generateTemplateRequest.saveToFiles) &&
        Objects.equals(this.fileSensitive, generateTemplateRequest.fileSensitive) &&
        Objects.equals(this.fileField, generateTemplateRequest.fileField) &&
        Objects.equals(this.sendToManagers, generateTemplateRequest.sendToManagers) &&
        Objects.equals(this.sendToPersons, generateTemplateRequest.sendToPersons) &&
        Objects.equals(this.scenarioId, generateTemplateRequest.scenarioId) &&
        Objects.equals(this.date, generateTemplateRequest.date) &&
        Objects.equals(this.useScenarioChanges, generateTemplateRequest.useScenarioChanges) &&
        Objects.equals(this.changeGroupingType, generateTemplateRequest.changeGroupingType) &&
        Objects.equals(this.changeGroupingId, generateTemplateRequest.changeGroupingId)&&
        Objects.equals(this.additionalProperties, generateTemplateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, emailSubject, emailMessage, saveToFiles, fileSensitive, fileField, sendToManagers, sendToPersons, scenarioId, date, useScenarioChanges, changeGroupingType, changeGroupingId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateTemplateRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailMessage: ").append(toIndentedString(emailMessage)).append("\n");
    sb.append("    saveToFiles: ").append(toIndentedString(saveToFiles)).append("\n");
    sb.append("    fileSensitive: ").append(toIndentedString(fileSensitive)).append("\n");
    sb.append("    fileField: ").append(toIndentedString(fileField)).append("\n");
    sb.append("    sendToManagers: ").append(toIndentedString(sendToManagers)).append("\n");
    sb.append("    sendToPersons: ").append(toIndentedString(sendToPersons)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    useScenarioChanges: ").append(toIndentedString(useScenarioChanges)).append("\n");
    sb.append("    changeGroupingType: ").append(toIndentedString(changeGroupingType)).append("\n");
    sb.append("    changeGroupingId: ").append(toIndentedString(changeGroupingId)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("emailSubject");
    openapiFields.add("emailMessage");
    openapiFields.add("saveToFiles");
    openapiFields.add("fileSensitive");
    openapiFields.add("fileField");
    openapiFields.add("sendToManagers");
    openapiFields.add("sendToPersons");
    openapiFields.add("scenarioId");
    openapiFields.add("date");
    openapiFields.add("useScenarioChanges");
    openapiFields.add("changeGroupingType");
    openapiFields.add("changeGroupingId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("saveToFiles");
    openapiRequiredFields.add("sendToManagers");
    openapiRequiredFields.add("sendToPersons");
    openapiRequiredFields.add("useScenarioChanges");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenerateTemplateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GenerateTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateTemplateRequest is not found in the empty JSON string", GenerateTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateTemplateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if ((jsonObj.get("emailSubject") != null && !jsonObj.get("emailSubject").isJsonNull()) && !jsonObj.get("emailSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailSubject").toString()));
      }
      if ((jsonObj.get("emailMessage") != null && !jsonObj.get("emailMessage").isJsonNull()) && !jsonObj.get("emailMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailMessage").toString()));
      }
      if ((jsonObj.get("fileSensitive") != null && !jsonObj.get("fileSensitive").isJsonNull()) && !jsonObj.get("fileSensitive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileSensitive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileSensitive").toString()));
      }
      if ((jsonObj.get("fileField") != null && !jsonObj.get("fileField").isJsonNull()) && !jsonObj.get("fileField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileField").toString()));
      }
      if ((jsonObj.get("scenarioId") != null && !jsonObj.get("scenarioId").isJsonNull()) && !jsonObj.get("scenarioId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scenarioId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scenarioId").toString()));
      }
      if ((jsonObj.get("changeGroupingType") != null && !jsonObj.get("changeGroupingType").isJsonNull()) && !jsonObj.get("changeGroupingType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeGroupingType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeGroupingType").toString()));
      }
      if ((jsonObj.get("changeGroupingId") != null && !jsonObj.get("changeGroupingId").isJsonNull()) && !jsonObj.get("changeGroupingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeGroupingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeGroupingId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateTemplateRequest>() {
           @Override
           public void write(JsonWriter out, GenerateTemplateRequest value) throws IOException {
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
           public GenerateTemplateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GenerateTemplateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GenerateTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to GenerateTemplateRequest
  */
  public static GenerateTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateTemplateRequest.class);
  }

 /**
  * Convert an instance of GenerateTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

