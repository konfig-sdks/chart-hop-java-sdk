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
import com.konfigthis.client.model.ReportQuery;
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
 * ReportChart
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportChart {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_REPORT_ID = "reportId";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  /**
   * chart type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    LINE("LINE"),
    
    AREA("AREA"),
    
    STACKED("STACKED"),
    
    BAR("BAR"),
    
    VERTICAL_BAR("VERTICAL_BAR"),
    
    HORIZONTAL_BAR("HORIZONTAL_BAR"),
    
    PIE("PIE"),
    
    TABLE("TABLE"),
    
    TABLE_CROSSTAB("TABLE_CROSSTAB"),
    
    SINGLE_METRIC("SINGLE_METRIC"),
    
    HEADER("HEADER"),
    
    TEXT("TEXT");

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

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_FILTER_OVERRIDE = "filterOverride";
  @SerializedName(SERIALIZED_NAME_FILTER_OVERRIDE)
  private Boolean filterOverride;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private ReportQuery query;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private Integer sort;

  public static final String SERIALIZED_NAME_IS_ADVANCED_QUERY_MODE = "isAdvancedQueryMode";
  @SerializedName(SERIALIZED_NAME_IS_ADVANCED_QUERY_MODE)
  private Boolean isAdvancedQueryMode;

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

  public ReportChart() {
  }

  public ReportChart id(String id) {
    
    
    
    
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


  public ReportChart orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * parent organization id
   * @return orgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "parent organization id")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public ReportChart reportId(String reportId) {
    
    
    
    
    this.reportId = reportId;
    return this;
  }

   /**
   * parent report id
   * @return reportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "parent report id")

  public String getReportId() {
    return reportId;
  }


  public void setReportId(String reportId) {
    
    
    
    this.reportId = reportId;
  }


  public ReportChart label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * chart label
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Headcount Report", required = true, value = "chart label")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public ReportChart type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * chart type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "chart type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public ReportChart filter(String filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * filter that applies to this chart
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "department='Engineering'", value = "filter that applies to this chart")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    
    
    
    this.filter = filter;
  }


  public ReportChart filterOverride(Boolean filterOverride) {
    
    
    
    
    this.filterOverride = filterOverride;
    return this;
  }

   /**
   * whether the chart filter overrides the global filter
   * @return filterOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether the chart filter overrides the global filter")

  public Boolean getFilterOverride() {
    return filterOverride;
  }


  public void setFilterOverride(Boolean filterOverride) {
    
    
    
    this.filterOverride = filterOverride;
  }


  public ReportChart query(ReportQuery query) {
    
    
    
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportQuery getQuery() {
    return query;
  }


  public void setQuery(ReportQuery query) {
    
    
    
    this.query = query;
  }


  public ReportChart sort(Integer sort) {
    
    
    
    
    this.sort = sort;
    return this;
  }

   /**
   * sort order
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sort order")

  public Integer getSort() {
    return sort;
  }


  public void setSort(Integer sort) {
    
    
    
    this.sort = sort;
  }


  public ReportChart isAdvancedQueryMode(Boolean isAdvancedQueryMode) {
    
    
    
    
    this.isAdvancedQueryMode = isAdvancedQueryMode;
    return this;
  }

   /**
   * whether the chart configuration is using advanced mode
   * @return isAdvancedQueryMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether the chart configuration is using advanced mode")

  public Boolean getIsAdvancedQueryMode() {
    return isAdvancedQueryMode;
  }


  public void setIsAdvancedQueryMode(Boolean isAdvancedQueryMode) {
    
    
    
    this.isAdvancedQueryMode = isAdvancedQueryMode;
  }


  public ReportChart createId(String createId) {
    
    
    
    
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


  public ReportChart createAt(String createAt) {
    
    
    
    
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


  public ReportChart updateId(String updateId) {
    
    
    
    
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


  public ReportChart updateAt(String updateAt) {
    
    
    
    
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


  public ReportChart deleteId(String deleteId) {
    
    
    
    
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


  public ReportChart deleteAt(String deleteAt) {
    
    
    
    
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
   * @return the ReportChart instance itself
   */
  public ReportChart putAdditionalProperty(String key, Object value) {
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
    ReportChart reportChart = (ReportChart) o;
    return Objects.equals(this.id, reportChart.id) &&
        Objects.equals(this.orgId, reportChart.orgId) &&
        Objects.equals(this.reportId, reportChart.reportId) &&
        Objects.equals(this.label, reportChart.label) &&
        Objects.equals(this.type, reportChart.type) &&
        Objects.equals(this.filter, reportChart.filter) &&
        Objects.equals(this.filterOverride, reportChart.filterOverride) &&
        Objects.equals(this.query, reportChart.query) &&
        Objects.equals(this.sort, reportChart.sort) &&
        Objects.equals(this.isAdvancedQueryMode, reportChart.isAdvancedQueryMode) &&
        Objects.equals(this.createId, reportChart.createId) &&
        Objects.equals(this.createAt, reportChart.createAt) &&
        Objects.equals(this.updateId, reportChart.updateId) &&
        Objects.equals(this.updateAt, reportChart.updateAt) &&
        Objects.equals(this.deleteId, reportChart.deleteId) &&
        Objects.equals(this.deleteAt, reportChart.deleteAt)&&
        Objects.equals(this.additionalProperties, reportChart.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, reportId, label, type, filter, filterOverride, query, sort, isAdvancedQueryMode, createId, createAt, updateId, updateAt, deleteId, deleteAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportChart {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    filterOverride: ").append(toIndentedString(filterOverride)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    isAdvancedQueryMode: ").append(toIndentedString(isAdvancedQueryMode)).append("\n");
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
    openapiFields.add("reportId");
    openapiFields.add("label");
    openapiFields.add("type");
    openapiFields.add("filter");
    openapiFields.add("filterOverride");
    openapiFields.add("query");
    openapiFields.add("sort");
    openapiFields.add("isAdvancedQueryMode");
    openapiFields.add("createId");
    openapiFields.add("createAt");
    openapiFields.add("updateId");
    openapiFields.add("updateAt");
    openapiFields.add("deleteId");
    openapiFields.add("deleteAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("orgId");
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("createId");
    openapiRequiredFields.add("createAt");
    openapiRequiredFields.add("updateId");
    openapiRequiredFields.add("updateAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportChart
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportChart.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportChart is not found in the empty JSON string", ReportChart.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportChart.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if ((jsonObj.get("reportId") != null && !jsonObj.get("reportId").isJsonNull()) && !jsonObj.get("reportId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportId").toString()));
      }
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // validate the required field `query`
      ReportQuery.validateJsonObject(jsonObj.getAsJsonObject("query"));
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
       if (!ReportChart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportChart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportChart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportChart.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportChart>() {
           @Override
           public void write(JsonWriter out, ReportChart value) throws IOException {
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
           public ReportChart read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportChart instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportChart given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportChart
  * @throws IOException if the JSON string is invalid with respect to ReportChart
  */
  public static ReportChart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportChart.class);
  }

 /**
  * Convert an instance of ReportChart to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
