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
import com.konfigthis.client.model.FieldMapper;
import com.konfigthis.client.model.OutboundFieldMapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
 * UpdateAppConfig
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateAppConfig {
  public static final String SERIALIZED_NAME_FIELD_MAPPERS = "fieldMappers";
  @SerializedName(SERIALIZED_NAME_FIELD_MAPPERS)
  private List<FieldMapper> fieldMappers = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD_MAPPERS = "customFieldMappers";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_MAPPERS)
  private List<FieldMapper> customFieldMappers = null;

  public static final String SERIALIZED_NAME_CUSTOM_OUTBOUND_FIELD_MAPPERS = "customOutboundFieldMappers";
  @SerializedName(SERIALIZED_NAME_CUSTOM_OUTBOUND_FIELD_MAPPERS)
  private List<OutboundFieldMapper> customOutboundFieldMappers = null;

  public static final String SERIALIZED_NAME_DISABLED_FIELD_MAPPERS = "disabledFieldMappers";
  @SerializedName(SERIALIZED_NAME_DISABLED_FIELD_MAPPERS)
  private Set<String> disabledFieldMappers = null;

  public static final String SERIALIZED_NAME_ENABLED_OUTBOUND_FIELD_MAPPERS = "enabledOutboundFieldMappers";
  @SerializedName(SERIALIZED_NAME_ENABLED_OUTBOUND_FIELD_MAPPERS)
  private Set<String> enabledOutboundFieldMappers = null;

  public static final String SERIALIZED_NAME_TEMPLATE_MATCHERS = "templateMatchers";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_MATCHERS)
  private List<Map<String, String>> templateMatchers = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Object options;

  public UpdateAppConfig() {
  }

  public UpdateAppConfig fieldMappers(List<FieldMapper> fieldMappers) {
    
    
    
    
    this.fieldMappers = fieldMappers;
    return this;
  }

  public UpdateAppConfig addFieldMappersItem(FieldMapper fieldMappersItem) {
    if (this.fieldMappers == null) {
      this.fieldMappers = new ArrayList<>();
    }
    this.fieldMappers.add(fieldMappersItem);
    return this;
  }

   /**
   * list of default field mappers
   * @return fieldMappers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of default field mappers")

  public List<FieldMapper> getFieldMappers() {
    return fieldMappers;
  }


  public void setFieldMappers(List<FieldMapper> fieldMappers) {
    
    
    
    this.fieldMappers = fieldMappers;
  }


  public UpdateAppConfig customFieldMappers(List<FieldMapper> customFieldMappers) {
    
    
    
    
    this.customFieldMappers = customFieldMappers;
    return this;
  }

  public UpdateAppConfig addCustomFieldMappersItem(FieldMapper customFieldMappersItem) {
    if (this.customFieldMappers == null) {
      this.customFieldMappers = new ArrayList<>();
    }
    this.customFieldMappers.add(customFieldMappersItem);
    return this;
  }

   /**
   * list of custom field mappers by a user
   * @return customFieldMappers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of custom field mappers by a user")

  public List<FieldMapper> getCustomFieldMappers() {
    return customFieldMappers;
  }


  public void setCustomFieldMappers(List<FieldMapper> customFieldMappers) {
    
    
    
    this.customFieldMappers = customFieldMappers;
  }


  public UpdateAppConfig customOutboundFieldMappers(List<OutboundFieldMapper> customOutboundFieldMappers) {
    
    
    
    
    this.customOutboundFieldMappers = customOutboundFieldMappers;
    return this;
  }

  public UpdateAppConfig addCustomOutboundFieldMappersItem(OutboundFieldMapper customOutboundFieldMappersItem) {
    if (this.customOutboundFieldMappers == null) {
      this.customOutboundFieldMappers = new ArrayList<>();
    }
    this.customOutboundFieldMappers.add(customOutboundFieldMappersItem);
    return this;
  }

   /**
   * list of custom outbound field mappers
   * @return customOutboundFieldMappers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of custom outbound field mappers")

  public List<OutboundFieldMapper> getCustomOutboundFieldMappers() {
    return customOutboundFieldMappers;
  }


  public void setCustomOutboundFieldMappers(List<OutboundFieldMapper> customOutboundFieldMappers) {
    
    
    
    this.customOutboundFieldMappers = customOutboundFieldMappers;
  }


  public UpdateAppConfig disabledFieldMappers(Set<String> disabledFieldMappers) {
    
    
    
    
    this.disabledFieldMappers = disabledFieldMappers;
    return this;
  }

  public UpdateAppConfig addDisabledFieldMappersItem(String disabledFieldMappersItem) {
    if (this.disabledFieldMappers == null) {
      this.disabledFieldMappers = new LinkedHashSet<>();
    }
    this.disabledFieldMappers.add(disabledFieldMappersItem);
    return this;
  }

   /**
   * list of disabled inbound field mappers by id
   * @return disabledFieldMappers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of disabled inbound field mappers by id")

  public Set<String> getDisabledFieldMappers() {
    return disabledFieldMappers;
  }


  public void setDisabledFieldMappers(Set<String> disabledFieldMappers) {
    
    
    
    this.disabledFieldMappers = disabledFieldMappers;
  }


  public UpdateAppConfig enabledOutboundFieldMappers(Set<String> enabledOutboundFieldMappers) {
    
    
    
    
    this.enabledOutboundFieldMappers = enabledOutboundFieldMappers;
    return this;
  }

  public UpdateAppConfig addEnabledOutboundFieldMappersItem(String enabledOutboundFieldMappersItem) {
    if (this.enabledOutboundFieldMappers == null) {
      this.enabledOutboundFieldMappers = new LinkedHashSet<>();
    }
    this.enabledOutboundFieldMappers.add(enabledOutboundFieldMappersItem);
    return this;
  }

   /**
   * list of enabled outbound field mappers by id
   * @return enabledOutboundFieldMappers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of enabled outbound field mappers by id")

  public Set<String> getEnabledOutboundFieldMappers() {
    return enabledOutboundFieldMappers;
  }


  public void setEnabledOutboundFieldMappers(Set<String> enabledOutboundFieldMappers) {
    
    
    
    this.enabledOutboundFieldMappers = enabledOutboundFieldMappers;
  }


  public UpdateAppConfig templateMatchers(List<Map<String, String>> templateMatchers) {
    
    
    
    
    this.templateMatchers = templateMatchers;
    return this;
  }

  public UpdateAppConfig addTemplateMatchersItem(Map<String, String> templateMatchersItem) {
    if (this.templateMatchers == null) {
      this.templateMatchers = new ArrayList<>();
    }
    this.templateMatchers.add(templateMatchersItem);
    return this;
  }

   /**
   * template field matchers defined by a user
   * @return templateMatchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "template field matchers defined by a user")

  public List<Map<String, String>> getTemplateMatchers() {
    return templateMatchers;
  }


  public void setTemplateMatchers(List<Map<String, String>> templateMatchers) {
    
    
    
    this.templateMatchers = templateMatchers;
  }


  public UpdateAppConfig options(Object options) {
    
    
    
    
    this.options = options;
    return this;
  }

   /**
   * app specific options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "app specific options")

  public Object getOptions() {
    return options;
  }


  public void setOptions(Object options) {
    
    
    
    this.options = options;
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
   * @return the UpdateAppConfig instance itself
   */
  public UpdateAppConfig putAdditionalProperty(String key, Object value) {
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
    UpdateAppConfig updateAppConfig = (UpdateAppConfig) o;
    return Objects.equals(this.fieldMappers, updateAppConfig.fieldMappers) &&
        Objects.equals(this.customFieldMappers, updateAppConfig.customFieldMappers) &&
        Objects.equals(this.customOutboundFieldMappers, updateAppConfig.customOutboundFieldMappers) &&
        Objects.equals(this.disabledFieldMappers, updateAppConfig.disabledFieldMappers) &&
        Objects.equals(this.enabledOutboundFieldMappers, updateAppConfig.enabledOutboundFieldMappers) &&
        Objects.equals(this.templateMatchers, updateAppConfig.templateMatchers) &&
        Objects.equals(this.options, updateAppConfig.options)&&
        Objects.equals(this.additionalProperties, updateAppConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldMappers, customFieldMappers, customOutboundFieldMappers, disabledFieldMappers, enabledOutboundFieldMappers, templateMatchers, options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppConfig {\n");
    sb.append("    fieldMappers: ").append(toIndentedString(fieldMappers)).append("\n");
    sb.append("    customFieldMappers: ").append(toIndentedString(customFieldMappers)).append("\n");
    sb.append("    customOutboundFieldMappers: ").append(toIndentedString(customOutboundFieldMappers)).append("\n");
    sb.append("    disabledFieldMappers: ").append(toIndentedString(disabledFieldMappers)).append("\n");
    sb.append("    enabledOutboundFieldMappers: ").append(toIndentedString(enabledOutboundFieldMappers)).append("\n");
    sb.append("    templateMatchers: ").append(toIndentedString(templateMatchers)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("fieldMappers");
    openapiFields.add("customFieldMappers");
    openapiFields.add("customOutboundFieldMappers");
    openapiFields.add("disabledFieldMappers");
    openapiFields.add("enabledOutboundFieldMappers");
    openapiFields.add("templateMatchers");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateAppConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateAppConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAppConfig is not found in the empty JSON string", UpdateAppConfig.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("fieldMappers") != null && !jsonObj.get("fieldMappers").isJsonNull()) {
        JsonArray jsonArrayfieldMappers = jsonObj.getAsJsonArray("fieldMappers");
        if (jsonArrayfieldMappers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fieldMappers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fieldMappers` to be an array in the JSON string but got `%s`", jsonObj.get("fieldMappers").toString()));
          }

          // validate the optional field `fieldMappers` (array)
          for (int i = 0; i < jsonArrayfieldMappers.size(); i++) {
            FieldMapper.validateJsonObject(jsonArrayfieldMappers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("customFieldMappers") != null && !jsonObj.get("customFieldMappers").isJsonNull()) {
        JsonArray jsonArraycustomFieldMappers = jsonObj.getAsJsonArray("customFieldMappers");
        if (jsonArraycustomFieldMappers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customFieldMappers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customFieldMappers` to be an array in the JSON string but got `%s`", jsonObj.get("customFieldMappers").toString()));
          }

          // validate the optional field `customFieldMappers` (array)
          for (int i = 0; i < jsonArraycustomFieldMappers.size(); i++) {
            FieldMapper.validateJsonObject(jsonArraycustomFieldMappers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("customOutboundFieldMappers") != null && !jsonObj.get("customOutboundFieldMappers").isJsonNull()) {
        JsonArray jsonArraycustomOutboundFieldMappers = jsonObj.getAsJsonArray("customOutboundFieldMappers");
        if (jsonArraycustomOutboundFieldMappers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customOutboundFieldMappers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customOutboundFieldMappers` to be an array in the JSON string but got `%s`", jsonObj.get("customOutboundFieldMappers").toString()));
          }

          // validate the optional field `customOutboundFieldMappers` (array)
          for (int i = 0; i < jsonArraycustomOutboundFieldMappers.size(); i++) {
            OutboundFieldMapper.validateJsonObject(jsonArraycustomOutboundFieldMappers.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("disabledFieldMappers") != null && !jsonObj.get("disabledFieldMappers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `disabledFieldMappers` to be an array in the JSON string but got `%s`", jsonObj.get("disabledFieldMappers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enabledOutboundFieldMappers") != null && !jsonObj.get("enabledOutboundFieldMappers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabledOutboundFieldMappers` to be an array in the JSON string but got `%s`", jsonObj.get("enabledOutboundFieldMappers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("templateMatchers") != null && !jsonObj.get("templateMatchers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateMatchers` to be an array in the JSON string but got `%s`", jsonObj.get("templateMatchers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAppConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAppConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAppConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAppConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAppConfig>() {
           @Override
           public void write(JsonWriter out, UpdateAppConfig value) throws IOException {
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
           public UpdateAppConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateAppConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateAppConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateAppConfig
  * @throws IOException if the JSON string is invalid with respect to UpdateAppConfig
  */
  public static UpdateAppConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAppConfig.class);
  }

 /**
  * Convert an instance of UpdateAppConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
