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
import com.konfigthis.client.model.ShareAccess;
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
 * Table
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Table {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_LABEL_COLUMN_ID = "labelColumnId";
  @SerializedName(SERIALIZED_NAME_LABEL_COLUMN_ID)
  private String labelColumnId;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATED = "effectiveDated";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATED)
  private Boolean effectiveDated;

  /**
   * base sensitivity of this table and entities in it -- should be either ORG or HIGH
   */
  @JsonAdapter(SensitiveEnum.Adapter.class)
 public enum SensitiveEnum {
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

    SensitiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SensitiveEnum fromValue(String value) {
      for (SensitiveEnum b : SensitiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SensitiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SensitiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SensitiveEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SensitiveEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SENSITIVE = "sensitive";
  @SerializedName(SERIALIZED_NAME_SENSITIVE)
  private SensitiveEnum sensitive;

  public static final String SERIALIZED_NAME_SHARE_ACCESS = "shareAccess";
  @SerializedName(SERIALIZED_NAME_SHARE_ACCESS)
  private List<ShareAccess> shareAccess = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROW_COUNT = "rowCount";
  @SerializedName(SERIALIZED_NAME_ROW_COUNT)
  private Long rowCount;

  public static final String SERIALIZED_NAME_CREATE_ID = "createId";
  @SerializedName(SERIALIZED_NAME_CREATE_ID)
  private String createId;

  public static final String SERIALIZED_NAME_CREATE_AT = "createAt";
  @SerializedName(SERIALIZED_NAME_CREATE_AT)
  private String createAt;

  public static final String SERIALIZED_NAME_UPDATE_ID = "updateId";
  @SerializedName(SERIALIZED_NAME_UPDATE_ID)
  private String updateId;

  public static final String SERIALIZED_NAME_UPDATE_AT = "updateAt";
  @SerializedName(SERIALIZED_NAME_UPDATE_AT)
  private String updateAt;

  public static final String SERIALIZED_NAME_DELETE_ID = "deleteId";
  @SerializedName(SERIALIZED_NAME_DELETE_ID)
  private String deleteId;

  public static final String SERIALIZED_NAME_DELETE_AT = "deleteAt";
  @SerializedName(SERIALIZED_NAME_DELETE_AT)
  private String deleteAt;

  public Table() {
  }

  public Table id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * globally unique id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "globally unique id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Table orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * parent org id
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "parent org id")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public Table name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * name of table
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "budget-data", required = true, value = "name of table")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public Table label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * human readable label for the table
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Budget Data", required = true, value = "human readable label for the table")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public Table labelColumnId(String labelColumnId) {
    
    
    
    
    this.labelColumnId = labelColumnId;
    return this;
  }

   /**
   * if set, use this column id as the label when referencing rows
   * @return labelColumnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if set, use this column id as the label when referencing rows")

  public String getLabelColumnId() {
    return labelColumnId;
  }


  public void setLabelColumnId(String labelColumnId) {
    
    
    
    this.labelColumnId = labelColumnId;
  }


  public Table effectiveDated(Boolean effectiveDated) {
    
    
    
    
    this.effectiveDated = effectiveDated;
    return this;
  }

   /**
   * whether or not the table is time tracked with effective dates (allows time travel or not). If false, then the values set in the table will be the same across all dates.
   * @return effectiveDated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "whether or not the table is time tracked with effective dates (allows time travel or not). If false, then the values set in the table will be the same across all dates.")

  public Boolean getEffectiveDated() {
    return effectiveDated;
  }


  public void setEffectiveDated(Boolean effectiveDated) {
    
    
    
    this.effectiveDated = effectiveDated;
  }


  public Table sensitive(SensitiveEnum sensitive) {
    
    
    
    
    this.sensitive = sensitive;
    return this;
  }

   /**
   * base sensitivity of this table and entities in it -- should be either ORG or HIGH
   * @return sensitive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "base sensitivity of this table and entities in it -- should be either ORG or HIGH")

  public SensitiveEnum getSensitive() {
    return sensitive;
  }


  public void setSensitive(SensitiveEnum sensitive) {
    
    
    
    this.sensitive = sensitive;
  }


  public Table shareAccess(List<ShareAccess> shareAccess) {
    
    
    
    
    this.shareAccess = shareAccess;
    return this;
  }

  public Table addShareAccessItem(ShareAccess shareAccessItem) {
    this.shareAccess.add(shareAccessItem);
    return this;
  }

   /**
   * users who are specifically granted permission to this table
   * @return shareAccess
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "users who are specifically granted permission to this table")

  public List<ShareAccess> getShareAccess() {
    return shareAccess;
  }


  public void setShareAccess(List<ShareAccess> shareAccess) {
    
    
    
    this.shareAccess = shareAccess;
  }


  public Table rowCount(Long rowCount) {
    
    
    
    
    this.rowCount = rowCount;
    return this;
  }

   /**
   * number of rows in the table
   * @return rowCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "number of rows in the table")

  public Long getRowCount() {
    return rowCount;
  }


  public void setRowCount(Long rowCount) {
    
    
    
    this.rowCount = rowCount;
  }


  public Table createId(String createId) {
    
    
    
    
    this.createId = createId;
    return this;
  }

   /**
   * created by user id
   * @return createId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "created by user id")

  public String getCreateId() {
    return createId;
  }


  public void setCreateId(String createId) {
    
    
    
    this.createId = createId;
  }


  public Table createAt(String createAt) {
    
    
    
    
    this.createAt = createAt;
    return this;
  }

   /**
   * created timestamp
   * @return createAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", required = true, value = "created timestamp")

  public String getCreateAt() {
    return createAt;
  }


  public void setCreateAt(String createAt) {
    
    
    
    this.createAt = createAt;
  }


  public Table updateId(String updateId) {
    
    
    
    
    this.updateId = updateId;
    return this;
  }

   /**
   * last updated by user id
   * @return updateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "last updated by user id")

  public String getUpdateId() {
    return updateId;
  }


  public void setUpdateId(String updateId) {
    
    
    
    this.updateId = updateId;
  }


  public Table updateAt(String updateAt) {
    
    
    
    
    this.updateAt = updateAt;
    return this;
  }

   /**
   * last updated timestamp
   * @return updateAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", required = true, value = "last updated timestamp")

  public String getUpdateAt() {
    return updateAt;
  }


  public void setUpdateAt(String updateAt) {
    
    
    
    this.updateAt = updateAt;
  }


  public Table deleteId(String deleteId) {
    
    
    
    
    this.deleteId = deleteId;
    return this;
  }

   /**
   * deleted by user id
   * @return deleteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "deleted by user id")

  public String getDeleteId() {
    return deleteId;
  }


  public void setDeleteId(String deleteId) {
    
    
    
    this.deleteId = deleteId;
  }


  public Table deleteAt(String deleteAt) {
    
    
    
    
    this.deleteAt = deleteAt;
    return this;
  }

   /**
   * deleted timestamp
   * @return deleteAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-24T13:57:52Z", value = "deleted timestamp")

  public String getDeleteAt() {
    return deleteAt;
  }


  public void setDeleteAt(String deleteAt) {
    
    
    
    this.deleteAt = deleteAt;
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
   * @return the Table instance itself
   */
  public Table putAdditionalProperty(String key, Object value) {
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
    Table table = (Table) o;
    return Objects.equals(this.id, table.id) &&
        Objects.equals(this.orgId, table.orgId) &&
        Objects.equals(this.name, table.name) &&
        Objects.equals(this.label, table.label) &&
        Objects.equals(this.labelColumnId, table.labelColumnId) &&
        Objects.equals(this.effectiveDated, table.effectiveDated) &&
        Objects.equals(this.sensitive, table.sensitive) &&
        Objects.equals(this.shareAccess, table.shareAccess) &&
        Objects.equals(this.rowCount, table.rowCount) &&
        Objects.equals(this.createId, table.createId) &&
        Objects.equals(this.createAt, table.createAt) &&
        Objects.equals(this.updateId, table.updateId) &&
        Objects.equals(this.updateAt, table.updateAt) &&
        Objects.equals(this.deleteId, table.deleteId) &&
        Objects.equals(this.deleteAt, table.deleteAt)&&
        Objects.equals(this.additionalProperties, table.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, name, label, labelColumnId, effectiveDated, sensitive, shareAccess, rowCount, createId, createAt, updateId, updateAt, deleteId, deleteAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    labelColumnId: ").append(toIndentedString(labelColumnId)).append("\n");
    sb.append("    effectiveDated: ").append(toIndentedString(effectiveDated)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    shareAccess: ").append(toIndentedString(shareAccess)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    createId: ").append(toIndentedString(createId)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteId: ").append(toIndentedString(deleteId)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("orgId");
    openapiFields.add("name");
    openapiFields.add("label");
    openapiFields.add("labelColumnId");
    openapiFields.add("effectiveDated");
    openapiFields.add("sensitive");
    openapiFields.add("shareAccess");
    openapiFields.add("rowCount");
    openapiFields.add("createId");
    openapiFields.add("createAt");
    openapiFields.add("updateId");
    openapiFields.add("updateAt");
    openapiFields.add("deleteId");
    openapiFields.add("deleteAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("effectiveDated");
    openapiRequiredFields.add("sensitive");
    openapiRequiredFields.add("shareAccess");
    openapiRequiredFields.add("rowCount");
    openapiRequiredFields.add("createId");
    openapiRequiredFields.add("createAt");
    openapiRequiredFields.add("updateId");
    openapiRequiredFields.add("updateAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Table
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Table.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Table is not found in the empty JSON string", Table.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Table.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("labelColumnId") != null && !jsonObj.get("labelColumnId").isJsonNull()) && !jsonObj.get("labelColumnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelColumnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labelColumnId").toString()));
      }
      if (!jsonObj.get("sensitive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sensitive").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("shareAccess").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shareAccess` to be an array in the JSON string but got `%s`", jsonObj.get("shareAccess").toString()));
      }

      JsonArray jsonArrayshareAccess = jsonObj.getAsJsonArray("shareAccess");
      // validate the required field `shareAccess` (array)
      for (int i = 0; i < jsonArrayshareAccess.size(); i++) {
        ShareAccess.validateJsonObject(jsonArrayshareAccess.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("createId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createId").toString()));
      }
      if (!jsonObj.get("createAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createAt").toString()));
      }
      if (!jsonObj.get("updateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateId").toString()));
      }
      if (!jsonObj.get("updateAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateAt").toString()));
      }
      if ((jsonObj.get("deleteId") != null && !jsonObj.get("deleteId").isJsonNull()) && !jsonObj.get("deleteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleteId").toString()));
      }
      if ((jsonObj.get("deleteAt") != null && !jsonObj.get("deleteAt").isJsonNull()) && !jsonObj.get("deleteAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleteAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleteAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Table.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Table' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Table> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Table.class));

       return (TypeAdapter<T>) new TypeAdapter<Table>() {
           @Override
           public void write(JsonWriter out, Table value) throws IOException {
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
           public Table read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Table instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Table given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Table
  * @throws IOException if the JSON string is invalid with respect to Table
  */
  public static Table fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Table.class);
  }

 /**
  * Convert an instance of Table to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

