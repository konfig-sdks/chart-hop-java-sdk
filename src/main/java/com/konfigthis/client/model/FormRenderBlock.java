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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * FormRenderBlock
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FormRenderBlock {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    QUESTION("QUESTION"),
    
    CONTENT("CONTENT");

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUESTION = "question";
  @SerializedName(SERIALIZED_NAME_QUESTION)
  private String question;

  /**
   * Gets or Sets dataType
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
 public enum DataTypeEnum {
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

    DataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataTypeEnum fromValue(String value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataTypeEnum dataType;

  /**
   * Gets or Sets plural
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
  private Map<String, Object> options = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public FormRenderBlock() {
  }

  public FormRenderBlock type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public FormRenderBlock id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public FormRenderBlock name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public FormRenderBlock question(String question) {
    
    
    
    
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuestion() {
    return question;
  }


  public void setQuestion(String question) {
    
    
    
    this.question = question;
  }


  public FormRenderBlock dataType(DataTypeEnum dataType) {
    
    
    
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataTypeEnum getDataType() {
    return dataType;
  }


  public void setDataType(DataTypeEnum dataType) {
    
    
    
    this.dataType = dataType;
  }


  public FormRenderBlock plural(PluralEnum plural) {
    
    
    
    
    this.plural = plural;
    return this;
  }

   /**
   * Get plural
   * @return plural
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PluralEnum getPlural() {
    return plural;
  }


  public void setPlural(PluralEnum plural) {
    
    
    
    this.plural = plural;
  }


  public FormRenderBlock values(List<EnumValue> values) {
    
    
    
    
    this.values = values;
    return this;
  }

  public FormRenderBlock addValuesItem(EnumValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumValue> getValues() {
    return values;
  }


  public void setValues(List<EnumValue> values) {
    
    
    
    this.values = values;
  }


  public FormRenderBlock options(Map<String, Object> options) {
    
    
    
    
    this.options = options;
    return this;
  }

  public FormRenderBlock putOptionsItem(String key, Object optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getOptions() {
    return options;
  }


  public void setOptions(Map<String, Object> options) {
    
    
    
    this.options = options;
  }


  public FormRenderBlock value(Object value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    
    
    
    this.value = value;
  }


  public FormRenderBlock required(Boolean required) {
    
    
    
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    
    
    
    this.required = required;
  }


  public FormRenderBlock content(String content) {
    
    
    
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    
    
    
    this.content = content;
  }


  public FormRenderBlock label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
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
   * @return the FormRenderBlock instance itself
   */
  public FormRenderBlock putAdditionalProperty(String key, Object value) {
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
    FormRenderBlock formRenderBlock = (FormRenderBlock) o;
    return Objects.equals(this.type, formRenderBlock.type) &&
        Objects.equals(this.id, formRenderBlock.id) &&
        Objects.equals(this.name, formRenderBlock.name) &&
        Objects.equals(this.question, formRenderBlock.question) &&
        Objects.equals(this.dataType, formRenderBlock.dataType) &&
        Objects.equals(this.plural, formRenderBlock.plural) &&
        Objects.equals(this.values, formRenderBlock.values) &&
        Objects.equals(this.options, formRenderBlock.options) &&
        Objects.equals(this.value, formRenderBlock.value) &&
        Objects.equals(this.required, formRenderBlock.required) &&
        Objects.equals(this.content, formRenderBlock.content) &&
        Objects.equals(this.label, formRenderBlock.label)&&
        Objects.equals(this.additionalProperties, formRenderBlock.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, question, dataType, plural, values, options, value, required, content, label, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormRenderBlock {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("question");
    openapiFields.add("dataType");
    openapiFields.add("plural");
    openapiFields.add("values");
    openapiFields.add("options");
    openapiFields.add("value");
    openapiFields.add("required");
    openapiFields.add("content");
    openapiFields.add("label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FormRenderBlock
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FormRenderBlock.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FormRenderBlock is not found in the empty JSON string", FormRenderBlock.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FormRenderBlock.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("question") != null && !jsonObj.get("question").isJsonNull()) && !jsonObj.get("question").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `question` to be a primitive type in the JSON string but got `%s`", jsonObj.get("question").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
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
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FormRenderBlock.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FormRenderBlock' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FormRenderBlock> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FormRenderBlock.class));

       return (TypeAdapter<T>) new TypeAdapter<FormRenderBlock>() {
           @Override
           public void write(JsonWriter out, FormRenderBlock value) throws IOException {
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
           public FormRenderBlock read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FormRenderBlock instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FormRenderBlock given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FormRenderBlock
  * @throws IOException if the JSON string is invalid with respect to FormRenderBlock
  */
  public static FormRenderBlock fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FormRenderBlock.class);
  }

 /**
  * Convert an instance of FormRenderBlock to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
