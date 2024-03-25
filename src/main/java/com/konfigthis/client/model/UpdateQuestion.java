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
import com.konfigthis.client.model.EnumValue;
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
 * UpdateQuestion
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateQuestion {
  public static final String SERIALIZED_NAME_QUESTION = "question";
  @SerializedName(SERIALIZED_NAME_QUESTION)
  private String question;

  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId;

  /**
   * datatype of the question
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    ADDRESS("ADDRESS"),
    
    BOOLEAN("BOOLEAN"),
    
    COMP("COMP"),
    
    COMPOUND("COMPOUND"),
    
    COMP_BAND("COMP_BAND"),
    
    CONTACTS("CONTACTS"),
    
    CURRENCY("CURRENCY"),
    
    DATE("DATE"),
    
    DECIMAL("DECIMAL"),
    
    ELAPSED_DAYS("ELAPSED_DAYS"),
    
    ELAPSED_MONTHS("ELAPSED_MONTHS"),
    
    ELAPSED_YEARS("ELAPSED_YEARS"),
    
    EMAIL("EMAIL"),
    
    ENUM("ENUM"),
    
    ENUM_EXPR("ENUM_EXPR"),
    
    ENUM_MULTI("ENUM_MULTI"),
    
    ENUM_SCALE("ENUM_SCALE"),
    
    EXPR("EXPR"),
    
    FILE("FILE"),
    
    GROUP("GROUP"),
    
    GROUPS("GROUPS"),
    
    GROUP_ASSIGNMENTS("GROUP_ASSIGNMENTS"),
    
    GROUP_TYPE("GROUP_TYPE"),
    
    IMAGE("IMAGE"),
    
    INTEGER("INTEGER"),
    
    JOB("JOB"),
    
    JOBS("JOBS"),
    
    JOB_TIER("JOB_TIER"),
    
    LIST("LIST"),
    
    MONEY("MONEY"),
    
    NAME("NAME"),
    
    OBJECT("OBJECT"),
    
    PAY_INTERVAL("PAY_INTERVAL"),
    
    PERCENT("PERCENT"),
    
    PERSON("PERSON"),
    
    PERSONS("PERSONS"),
    
    PHONE("PHONE"),
    
    STOCKGRANT("STOCKGRANT"),
    
    STRING("STRING"),
    
    TABLE_REF("TABLE_REF"),
    
    TEXT("TEXT"),
    
    TIMEOFF("TIMEOFF"),
    
    TIMESTAMP("TIMESTAMP"),
    
    TRACKED_GROUP("TRACKED_GROUP"),
    
    URL("URL"),
    
    USER("USER"),
    
    VARIABLE_COMP("VARIABLE_COMP"),
    
    VARIABLE_COMPS("VARIABLE_COMPS");

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
   * plural type of the question datatype (either SINGLE, LIST, or SET)
   */
  @JsonAdapter(PluralEnum.Adapter.class)
 public enum PluralEnum {
    SINGLE("SINGLE"),
    
    LIST("LIST"),
    
    SET("SET");

    private String value;

    PluralEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PluralEnum fromValue(String value) {
      for (PluralEnum b : PluralEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PluralEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PluralEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PluralEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PluralEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLURAL = "plural";
  @SerializedName(SERIALIZED_NAME_PLURAL)
  private PluralEnum plural;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<EnumValue> values = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Object options;

  public UpdateQuestion() {
  }

  public UpdateQuestion question(String question) {
    
    
    
    
    this.question = question;
    return this;
  }

   /**
   * text of the question
   * @return question
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "What is your favorite color?", value = "text of the question")

  public String getQuestion() {
    return question;
  }


  public void setQuestion(String question) {
    
    
    
    this.question = question;
  }


  public UpdateQuestion fieldId(String fieldId) {
    
    
    
    
    this.fieldId = fieldId;
    return this;
  }

   /**
   * if the question is linked to a field, the id of that field. Any question responses will be automatically saved to the field
   * @return fieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if the question is linked to a field, the id of that field. Any question responses will be automatically saved to the field")

  public String getFieldId() {
    return fieldId;
  }


  public void setFieldId(String fieldId) {
    
    
    
    this.fieldId = fieldId;
  }


  public UpdateQuestion type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * datatype of the question
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "datatype of the question")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public UpdateQuestion plural(PluralEnum plural) {
    
    
    
    
    this.plural = plural;
    return this;
  }

   /**
   * plural type of the question datatype (either SINGLE, LIST, or SET)
   * @return plural
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "plural type of the question datatype (either SINGLE, LIST, or SET)")

  public PluralEnum getPlural() {
    return plural;
  }


  public void setPlural(PluralEnum plural) {
    
    
    
    this.plural = plural;
  }


  public UpdateQuestion values(List<EnumValue> values) {
    
    
    
    
    this.values = values;
    return this;
  }

  public UpdateQuestion addValuesItem(EnumValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * possible values (enum type only)
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "possible values (enum type only)")

  public List<EnumValue> getValues() {
    return values;
  }


  public void setValues(List<EnumValue> values) {
    
    
    
    this.values = values;
  }


  public UpdateQuestion options(Object options) {
    
    
    
    
    this.options = options;
    return this;
  }

   /**
   * validation options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "validation options")

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
   * @return the UpdateQuestion instance itself
   */
  public UpdateQuestion putAdditionalProperty(String key, Object value) {
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
    UpdateQuestion updateQuestion = (UpdateQuestion) o;
    return Objects.equals(this.question, updateQuestion.question) &&
        Objects.equals(this.fieldId, updateQuestion.fieldId) &&
        Objects.equals(this.type, updateQuestion.type) &&
        Objects.equals(this.plural, updateQuestion.plural) &&
        Objects.equals(this.values, updateQuestion.values) &&
        Objects.equals(this.options, updateQuestion.options)&&
        Objects.equals(this.additionalProperties, updateQuestion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, fieldId, type, plural, values, options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateQuestion {\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("question");
    openapiFields.add("fieldId");
    openapiFields.add("type");
    openapiFields.add("plural");
    openapiFields.add("values");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateQuestion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateQuestion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateQuestion is not found in the empty JSON string", UpdateQuestion.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("question") != null && !jsonObj.get("question").isJsonNull()) && !jsonObj.get("question").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `question` to be a primitive type in the JSON string but got `%s`", jsonObj.get("question").toString()));
      }
      if ((jsonObj.get("fieldId") != null && !jsonObj.get("fieldId").isJsonNull()) && !jsonObj.get("fieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldId").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("plural") != null && !jsonObj.get("plural").isJsonNull()) && !jsonObj.get("plural").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plural` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plural").toString()));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            EnumValue.validateJsonObject(jsonArrayvalues.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateQuestion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateQuestion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateQuestion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateQuestion.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateQuestion>() {
           @Override
           public void write(JsonWriter out, UpdateQuestion value) throws IOException {
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
           public UpdateQuestion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateQuestion instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateQuestion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateQuestion
  * @throws IOException if the JSON string is invalid with respect to UpdateQuestion
  */
  public static UpdateQuestion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateQuestion.class);
  }

 /**
  * Convert an instance of UpdateQuestion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

