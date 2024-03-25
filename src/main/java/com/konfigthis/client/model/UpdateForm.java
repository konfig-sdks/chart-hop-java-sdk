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
import com.konfigthis.client.model.FormBlock;
import com.konfigthis.client.model.FormField;
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
 * UpdateForm
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateForm {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FormField> fields = null;

  public static final String SERIALIZED_NAME_BLOCKS = "blocks";
  @SerializedName(SERIALIZED_NAME_BLOCKS)
  private List<FormBlock> blocks = null;

  /**
   * status of the form
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
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

  /**
   * type of the form
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    BUILT_IN("BUILT_IN"),
    
    CUSTOM("CUSTOM");

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
   * target type that the form can be filled out about (null defaults to PERSON for backwards compatibility)
   */
  @JsonAdapter(TargetTypeEnum.Adapter.class)
 public enum TargetTypeEnum {
    NONE("NONE"),
    
    PERSON("PERSON");

    private String value;

    TargetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetTypeEnum fromValue(String value) {
      for (TargetTypeEnum b : TargetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TargetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TargetTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARGET_TYPE = "targetType";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private TargetTypeEnum targetType;

  public static final String SERIALIZED_NAME_TARGET_FILTER = "targetFilter";
  @SerializedName(SERIALIZED_NAME_TARGET_FILTER)
  private String targetFilter;

  public static final String SERIALIZED_NAME_SUBMIT_FILTER = "submitFilter";
  @SerializedName(SERIALIZED_NAME_SUBMIT_FILTER)
  private String submitFilter;

  public static final String SERIALIZED_NAME_RESPONSE_READ_FILTER = "responseReadFilter";
  @SerializedName(SERIALIZED_NAME_RESPONSE_READ_FILTER)
  private String responseReadFilter;

  public static final String SERIALIZED_NAME_USE_FIELD_ACCESS = "useFieldAccess";
  @SerializedName(SERIALIZED_NAME_USE_FIELD_ACCESS)
  private Boolean useFieldAccess;

  /**
   * approval needed, if any approval is required
   */
  @JsonAdapter(ApprovalEnum.Adapter.class)
 public enum ApprovalEnum {
    MANAGER("MANAGER"),
    
    GRAND_MANAGER("GRAND_MANAGER");

    private String value;

    ApprovalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApprovalEnum fromValue(String value) {
      for (ApprovalEnum b : ApprovalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApprovalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApprovalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApprovalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApprovalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPROVAL = "approval";
  @SerializedName(SERIALIZED_NAME_APPROVAL)
  private ApprovalEnum approval;

  /**
   * view sensitivity for the author of this form - the level of view access required to view the createId and updateId fields. If null, the author&#39;s identity is always visible as long as the viewer can read the form response. If set to PRIVATE, the author&#39;s identity is stored in ChartHop, but protected such that even users with sensitive access cannot access the data. If set to ANONYMOUS, the author&#39;s identity is not stored in ChartHop at all.
   */
  @JsonAdapter(AuthorSensitiveEnum.Adapter.class)
 public enum AuthorSensitiveEnum {
    ANONYMOUS("ANONYMOUS"),
    
    PRIVATE("PRIVATE"),
    
    HIGH("HIGH"),
    
    MANAGER("MANAGER");

    private String value;

    AuthorSensitiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorSensitiveEnum fromValue(String value) {
      for (AuthorSensitiveEnum b : AuthorSensitiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthorSensitiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorSensitiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorSensitiveEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthorSensitiveEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHOR_SENSITIVE = "authorSensitive";
  @SerializedName(SERIALIZED_NAME_AUTHOR_SENSITIVE)
  private AuthorSensitiveEnum authorSensitive;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Object options;

  public UpdateForm() {
  }

  public UpdateForm description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * description of form
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The Engineering department, where engineers develop new technology and products.", value = "description of form")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UpdateForm label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * human-readable full name of form
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Health Index: Q2", value = "human-readable full name of form")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public UpdateForm fields(List<FormField> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public UpdateForm addFieldsItem(FormField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * ordered list of fields being collected in this form
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ordered list of fields being collected in this form")

  public List<FormField> getFields() {
    return fields;
  }


  public void setFields(List<FormField> fields) {
    
    
    
    this.fields = fields;
  }


  public UpdateForm blocks(List<FormBlock> blocks) {
    
    
    
    
    this.blocks = blocks;
    return this;
  }

  public UpdateForm addBlocksItem(FormBlock blocksItem) {
    if (this.blocks == null) {
      this.blocks = new ArrayList<>();
    }
    this.blocks.add(blocksItem);
    return this;
  }

   /**
   * ordered list of blocks being collected in this form
   * @return blocks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ordered list of blocks being collected in this form")

  public List<FormBlock> getBlocks() {
    return blocks;
  }


  public void setBlocks(List<FormBlock> blocks) {
    
    
    
    this.blocks = blocks;
  }


  public UpdateForm status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * status of the form
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status of the form")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public UpdateForm type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * type of the form
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type of the form")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public UpdateForm targetType(TargetTypeEnum targetType) {
    
    
    
    
    this.targetType = targetType;
    return this;
  }

   /**
   * target type that the form can be filled out about (null defaults to PERSON for backwards compatibility)
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "target type that the form can be filled out about (null defaults to PERSON for backwards compatibility)")

  public TargetTypeEnum getTargetType() {
    return targetType;
  }


  public void setTargetType(TargetTypeEnum targetType) {
    
    
    
    this.targetType = targetType;
  }


  public UpdateForm targetFilter(String targetFilter) {
    
    
    
    
    this.targetFilter = targetFilter;
    return this;
  }

   /**
   * filter that controls on which profiles this tab will appear
   * @return targetFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "filter that controls on which profiles this tab will appear")

  public String getTargetFilter() {
    return targetFilter;
  }


  public void setTargetFilter(String targetFilter) {
    
    
    
    this.targetFilter = targetFilter;
  }


  public UpdateForm submitFilter(String submitFilter) {
    
    
    
    
    this.submitFilter = submitFilter;
    return this;
  }

   /**
   * filter that controls which respondents can submit this form. The form:submit permission, if present, overrides this filter
   * @return submitFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "filter that controls which respondents can submit this form. The form:submit permission, if present, overrides this filter")

  public String getSubmitFilter() {
    return submitFilter;
  }


  public void setSubmitFilter(String submitFilter) {
    
    
    
    this.submitFilter = submitFilter;
  }


  public UpdateForm responseReadFilter(String responseReadFilter) {
    
    
    
    
    this.responseReadFilter = responseReadFilter;
    return this;
  }

   /**
   * filter that controls who can read the form responses. The formResponse:read permission, if present, overrides this filter
   * @return responseReadFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "filter that controls who can read the form responses. The formResponse:read permission, if present, overrides this filter")

  public String getResponseReadFilter() {
    return responseReadFilter;
  }


  public void setResponseReadFilter(String responseReadFilter) {
    
    
    
    this.responseReadFilter = responseReadFilter;
  }


  public UpdateForm useFieldAccess(Boolean useFieldAccess) {
    
    
    
    
    this.useFieldAccess = useFieldAccess;
    return this;
  }

   /**
   * if this option is on, then form response answers will use field permissions to determine access to those responses
   * @return useFieldAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if this option is on, then form response answers will use field permissions to determine access to those responses")

  public Boolean getUseFieldAccess() {
    return useFieldAccess;
  }


  public void setUseFieldAccess(Boolean useFieldAccess) {
    
    
    
    this.useFieldAccess = useFieldAccess;
  }


  public UpdateForm approval(ApprovalEnum approval) {
    
    
    
    
    this.approval = approval;
    return this;
  }

   /**
   * approval needed, if any approval is required
   * @return approval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "approval needed, if any approval is required")

  public ApprovalEnum getApproval() {
    return approval;
  }


  public void setApproval(ApprovalEnum approval) {
    
    
    
    this.approval = approval;
  }


  public UpdateForm authorSensitive(AuthorSensitiveEnum authorSensitive) {
    
    
    
    
    this.authorSensitive = authorSensitive;
    return this;
  }

   /**
   * view sensitivity for the author of this form - the level of view access required to view the createId and updateId fields. If null, the author&#39;s identity is always visible as long as the viewer can read the form response. If set to PRIVATE, the author&#39;s identity is stored in ChartHop, but protected such that even users with sensitive access cannot access the data. If set to ANONYMOUS, the author&#39;s identity is not stored in ChartHop at all.
   * @return authorSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "view sensitivity for the author of this form - the level of view access required to view the createId and updateId fields. If null, the author's identity is always visible as long as the viewer can read the form response. If set to PRIVATE, the author's identity is stored in ChartHop, but protected such that even users with sensitive access cannot access the data. If set to ANONYMOUS, the author's identity is not stored in ChartHop at all.")

  public AuthorSensitiveEnum getAuthorSensitive() {
    return authorSensitive;
  }


  public void setAuthorSensitive(AuthorSensitiveEnum authorSensitive) {
    
    
    
    this.authorSensitive = authorSensitive;
  }


  public UpdateForm options(Object options) {
    
    
    
    
    this.options = options;
    return this;
  }

   /**
   * options, such as notification settings
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "options, such as notification settings")

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
   * @return the UpdateForm instance itself
   */
  public UpdateForm putAdditionalProperty(String key, Object value) {
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
    UpdateForm updateForm = (UpdateForm) o;
    return Objects.equals(this.description, updateForm.description) &&
        Objects.equals(this.label, updateForm.label) &&
        Objects.equals(this.fields, updateForm.fields) &&
        Objects.equals(this.blocks, updateForm.blocks) &&
        Objects.equals(this.status, updateForm.status) &&
        Objects.equals(this.type, updateForm.type) &&
        Objects.equals(this.targetType, updateForm.targetType) &&
        Objects.equals(this.targetFilter, updateForm.targetFilter) &&
        Objects.equals(this.submitFilter, updateForm.submitFilter) &&
        Objects.equals(this.responseReadFilter, updateForm.responseReadFilter) &&
        Objects.equals(this.useFieldAccess, updateForm.useFieldAccess) &&
        Objects.equals(this.approval, updateForm.approval) &&
        Objects.equals(this.authorSensitive, updateForm.authorSensitive) &&
        Objects.equals(this.options, updateForm.options)&&
        Objects.equals(this.additionalProperties, updateForm.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, label, fields, blocks, status, type, targetType, targetFilter, submitFilter, responseReadFilter, useFieldAccess, approval, authorSensitive, options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateForm {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetFilter: ").append(toIndentedString(targetFilter)).append("\n");
    sb.append("    submitFilter: ").append(toIndentedString(submitFilter)).append("\n");
    sb.append("    responseReadFilter: ").append(toIndentedString(responseReadFilter)).append("\n");
    sb.append("    useFieldAccess: ").append(toIndentedString(useFieldAccess)).append("\n");
    sb.append("    approval: ").append(toIndentedString(approval)).append("\n");
    sb.append("    authorSensitive: ").append(toIndentedString(authorSensitive)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("label");
    openapiFields.add("fields");
    openapiFields.add("blocks");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("targetType");
    openapiFields.add("targetFilter");
    openapiFields.add("submitFilter");
    openapiFields.add("responseReadFilter");
    openapiFields.add("useFieldAccess");
    openapiFields.add("approval");
    openapiFields.add("authorSensitive");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateForm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateForm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateForm is not found in the empty JSON string", UpdateForm.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            FormField.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("blocks") != null && !jsonObj.get("blocks").isJsonNull()) {
        JsonArray jsonArrayblocks = jsonObj.getAsJsonArray("blocks");
        if (jsonArrayblocks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("blocks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `blocks` to be an array in the JSON string but got `%s`", jsonObj.get("blocks").toString()));
          }

          // validate the optional field `blocks` (array)
          for (int i = 0; i < jsonArrayblocks.size(); i++) {
            FormBlock.validateJsonObject(jsonArrayblocks.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("targetType") != null && !jsonObj.get("targetType").isJsonNull()) && !jsonObj.get("targetType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetType").toString()));
      }
      if ((jsonObj.get("targetFilter") != null && !jsonObj.get("targetFilter").isJsonNull()) && !jsonObj.get("targetFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetFilter").toString()));
      }
      if ((jsonObj.get("submitFilter") != null && !jsonObj.get("submitFilter").isJsonNull()) && !jsonObj.get("submitFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submitFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submitFilter").toString()));
      }
      if ((jsonObj.get("responseReadFilter") != null && !jsonObj.get("responseReadFilter").isJsonNull()) && !jsonObj.get("responseReadFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseReadFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseReadFilter").toString()));
      }
      if ((jsonObj.get("approval") != null && !jsonObj.get("approval").isJsonNull()) && !jsonObj.get("approval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approval").toString()));
      }
      if ((jsonObj.get("authorSensitive") != null && !jsonObj.get("authorSensitive").isJsonNull()) && !jsonObj.get("authorSensitive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorSensitive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorSensitive").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateForm.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateForm>() {
           @Override
           public void write(JsonWriter out, UpdateForm value) throws IOException {
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
           public UpdateForm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateForm instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateForm
  * @throws IOException if the JSON string is invalid with respect to UpdateForm
  */
  public static UpdateForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateForm.class);
  }

 /**
  * Convert an instance of UpdateForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

