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
import com.konfigthis.client.model.Money;
import com.konfigthis.client.model.ScenarioSharedViewConfig;
import com.konfigthis.client.model.ShareAccess;
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
 * UpdateScenario
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateScenario {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  /**
   * status of scenario
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    OPEN("OPEN"),
    
    INACTIVE("INACTIVE"),
    
    MERGED("MERGED"),
    
    DRAFT("DRAFT"),
    
    ARCHIVED("ARCHIVED");

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

  public static final String SERIALIZED_NAME_SHARE_ACCESS = "shareAccess";
  @SerializedName(SERIALIZED_NAME_SHARE_ACCESS)
  private List<ShareAccess> shareAccess = null;

  /**
   * whether or not the start date should stay fixed in time, or update to today&#39;s date as time passes
   */
  @JsonAdapter(StartDateFixedEnum.Adapter.class)
 public enum StartDateFixedEnum {
    FIXED("FIXED"),
    
    TODAY("TODAY");

    private String value;

    StartDateFixedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StartDateFixedEnum fromValue(String value) {
      for (StartDateFixedEnum b : StartDateFixedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StartDateFixedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StartDateFixedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StartDateFixedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StartDateFixedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_START_DATE_FIXED = "startDateFixed";
  @SerializedName(SERIALIZED_NAME_START_DATE_FIXED)
  private StartDateFixedEnum startDateFixed;

  public static final String SERIALIZED_NAME_VALID_JOB_ID_SET = "validJobIdSet";
  @SerializedName(SERIALIZED_NAME_VALID_JOB_ID_SET)
  private Set<String> validJobIdSet = null;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  /**
   * The type of entity associated with this scenario
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
 public enum EntityTypeEnum {
    COMP_REVIEW("COMP_REVIEW");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private EntityTypeEnum entityType;

  public static final String SERIALIZED_NAME_SHARED_VIEW_CONFIG = "sharedViewConfig";
  @SerializedName(SERIALIZED_NAME_SHARED_VIEW_CONFIG)
  private Set<ScenarioSharedViewConfig> sharedViewConfig = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Money budget;

  public static final String SERIALIZED_NAME_COST_CALC = "costCalc";
  @SerializedName(SERIALIZED_NAME_COST_CALC)
  private String costCalc;

  public UpdateScenario() {
  }

  public UpdateScenario description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * scenario description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Q4 Conservative Plan", value = "scenario description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UpdateScenario name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * scenario name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Q4 Conservative Plan", value = "scenario name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UpdateScenario startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * date that this scenario diverges from primary
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-15", value = "date that this scenario diverges from primary")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public UpdateScenario status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * status of scenario
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status of scenario")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public UpdateScenario shareAccess(List<ShareAccess> shareAccess) {
    
    
    
    
    this.shareAccess = shareAccess;
    return this;
  }

  public UpdateScenario addShareAccessItem(ShareAccess shareAccessItem) {
    if (this.shareAccess == null) {
      this.shareAccess = new ArrayList<>();
    }
    this.shareAccess.add(shareAccessItem);
    return this;
  }

   /**
   * users who are specifically granted permission to this scenario
   * @return shareAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "users who are specifically granted permission to this scenario")

  public List<ShareAccess> getShareAccess() {
    return shareAccess;
  }


  public void setShareAccess(List<ShareAccess> shareAccess) {
    
    
    
    this.shareAccess = shareAccess;
  }


  public UpdateScenario startDateFixed(StartDateFixedEnum startDateFixed) {
    
    
    
    
    this.startDateFixed = startDateFixed;
    return this;
  }

   /**
   * whether or not the start date should stay fixed in time, or update to today&#39;s date as time passes
   * @return startDateFixed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the start date should stay fixed in time, or update to today's date as time passes")

  public StartDateFixedEnum getStartDateFixed() {
    return startDateFixed;
  }


  public void setStartDateFixed(StartDateFixedEnum startDateFixed) {
    
    
    
    this.startDateFixed = startDateFixed;
  }


  public UpdateScenario validJobIdSet(Set<String> validJobIdSet) {
    
    
    
    
    this.validJobIdSet = validJobIdSet;
    return this;
  }

  public UpdateScenario addValidJobIdSetItem(String validJobIdSetItem) {
    if (this.validJobIdSet == null) {
      this.validJobIdSet = new LinkedHashSet<>();
    }
    this.validJobIdSet.add(validJobIdSetItem);
    return this;
  }

   /**
   * This scenario changes are restricted to the following jobIds
   * @return validJobIdSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This scenario changes are restricted to the following jobIds")

  public Set<String> getValidJobIdSet() {
    return validJobIdSet;
  }


  public void setValidJobIdSet(Set<String> validJobIdSet) {
    
    
    
    this.validJobIdSet = validJobIdSet;
  }


  public UpdateScenario entityId(String entityId) {
    
    
    
    
    this.entityId = entityId;
    return this;
  }

   /**
   * The entity this scenario is associated with
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The entity this scenario is associated with")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    
    
    
    this.entityId = entityId;
  }


  public UpdateScenario entityType(EntityTypeEnum entityType) {
    
    
    
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The type of entity associated with this scenario
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of entity associated with this scenario")

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  public void setEntityType(EntityTypeEnum entityType) {
    
    
    
    this.entityType = entityType;
  }


  public UpdateScenario sharedViewConfig(Set<ScenarioSharedViewConfig> sharedViewConfig) {
    
    
    
    
    this.sharedViewConfig = sharedViewConfig;
    return this;
  }

  public UpdateScenario addSharedViewConfigItem(ScenarioSharedViewConfig sharedViewConfigItem) {
    if (this.sharedViewConfig == null) {
      this.sharedViewConfig = new LinkedHashSet<>();
    }
    this.sharedViewConfig.add(sharedViewConfigItem);
    return this;
  }

   /**
   * View configurations associated with this scenario
   * @return sharedViewConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "View configurations associated with this scenario")

  public Set<ScenarioSharedViewConfig> getSharedViewConfig() {
    return sharedViewConfig;
  }


  public void setSharedViewConfig(Set<ScenarioSharedViewConfig> sharedViewConfig) {
    
    
    
    this.sharedViewConfig = sharedViewConfig;
  }


  public UpdateScenario budget(Money budget) {
    
    
    
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getBudget() {
    return budget;
  }


  public void setBudget(Money budget) {
    
    
    
    this.budget = budget;
  }


  public UpdateScenario costCalc(String costCalc) {
    
    
    
    
    this.costCalc = costCalc;
    return this;
  }

   /**
   * CQL used to calculate the budget allocation in the scenario
   * @return costCalc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CQL used to calculate the budget allocation in the scenario")

  public String getCostCalc() {
    return costCalc;
  }


  public void setCostCalc(String costCalc) {
    
    
    
    this.costCalc = costCalc;
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
   * @return the UpdateScenario instance itself
   */
  public UpdateScenario putAdditionalProperty(String key, Object value) {
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
    UpdateScenario updateScenario = (UpdateScenario) o;
    return Objects.equals(this.description, updateScenario.description) &&
        Objects.equals(this.name, updateScenario.name) &&
        Objects.equals(this.startDate, updateScenario.startDate) &&
        Objects.equals(this.status, updateScenario.status) &&
        Objects.equals(this.shareAccess, updateScenario.shareAccess) &&
        Objects.equals(this.startDateFixed, updateScenario.startDateFixed) &&
        Objects.equals(this.validJobIdSet, updateScenario.validJobIdSet) &&
        Objects.equals(this.entityId, updateScenario.entityId) &&
        Objects.equals(this.entityType, updateScenario.entityType) &&
        Objects.equals(this.sharedViewConfig, updateScenario.sharedViewConfig) &&
        Objects.equals(this.budget, updateScenario.budget) &&
        Objects.equals(this.costCalc, updateScenario.costCalc)&&
        Objects.equals(this.additionalProperties, updateScenario.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, startDate, status, shareAccess, startDateFixed, validJobIdSet, entityId, entityType, sharedViewConfig, budget, costCalc, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScenario {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shareAccess: ").append(toIndentedString(shareAccess)).append("\n");
    sb.append("    startDateFixed: ").append(toIndentedString(startDateFixed)).append("\n");
    sb.append("    validJobIdSet: ").append(toIndentedString(validJobIdSet)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    sharedViewConfig: ").append(toIndentedString(sharedViewConfig)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    costCalc: ").append(toIndentedString(costCalc)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("startDate");
    openapiFields.add("status");
    openapiFields.add("shareAccess");
    openapiFields.add("startDateFixed");
    openapiFields.add("validJobIdSet");
    openapiFields.add("entityId");
    openapiFields.add("entityType");
    openapiFields.add("sharedViewConfig");
    openapiFields.add("budget");
    openapiFields.add("costCalc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateScenario
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateScenario.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateScenario is not found in the empty JSON string", UpdateScenario.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("shareAccess") != null && !jsonObj.get("shareAccess").isJsonNull()) {
        JsonArray jsonArrayshareAccess = jsonObj.getAsJsonArray("shareAccess");
        if (jsonArrayshareAccess != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shareAccess").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shareAccess` to be an array in the JSON string but got `%s`", jsonObj.get("shareAccess").toString()));
          }

          // validate the optional field `shareAccess` (array)
          for (int i = 0; i < jsonArrayshareAccess.size(); i++) {
            ShareAccess.validateJsonObject(jsonArrayshareAccess.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("startDateFixed") != null && !jsonObj.get("startDateFixed").isJsonNull()) && !jsonObj.get("startDateFixed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDateFixed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDateFixed").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validJobIdSet") != null && !jsonObj.get("validJobIdSet").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validJobIdSet` to be an array in the JSON string but got `%s`", jsonObj.get("validJobIdSet").toString()));
      }
      if ((jsonObj.get("entityId") != null && !jsonObj.get("entityId").isJsonNull()) && !jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
      if ((jsonObj.get("entityType") != null && !jsonObj.get("entityType").isJsonNull()) && !jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      if (jsonObj.get("sharedViewConfig") != null && !jsonObj.get("sharedViewConfig").isJsonNull()) {
        JsonArray jsonArraysharedViewConfig = jsonObj.getAsJsonArray("sharedViewConfig");
        if (jsonArraysharedViewConfig != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sharedViewConfig").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sharedViewConfig` to be an array in the JSON string but got `%s`", jsonObj.get("sharedViewConfig").toString()));
          }

          // validate the optional field `sharedViewConfig` (array)
          for (int i = 0; i < jsonArraysharedViewConfig.size(); i++) {
            ScenarioSharedViewConfig.validateJsonObject(jsonArraysharedViewConfig.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `budget`
      if (jsonObj.get("budget") != null && !jsonObj.get("budget").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("budget"));
      }
      if ((jsonObj.get("costCalc") != null && !jsonObj.get("costCalc").isJsonNull()) && !jsonObj.get("costCalc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `costCalc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("costCalc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateScenario.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateScenario' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateScenario> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateScenario.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateScenario>() {
           @Override
           public void write(JsonWriter out, UpdateScenario value) throws IOException {
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
           public UpdateScenario read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateScenario instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateScenario given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateScenario
  * @throws IOException if the JSON string is invalid with respect to UpdateScenario
  */
  public static UpdateScenario fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateScenario.class);
  }

 /**
  * Convert an instance of UpdateScenario to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

