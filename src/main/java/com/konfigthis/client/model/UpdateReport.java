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
 * UpdateReport
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateReport {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  /**
   * sharing settings of report
   */
  @JsonAdapter(ShareEnum.Adapter.class)
 public enum ShareEnum {
    NORMAL("NORMAL"),
    
    FULL("FULL");

    private String value;

    ShareEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShareEnum fromValue(String value) {
      for (ShareEnum b : ShareEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShareEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShareEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShareEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShareEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private ShareEnum share;

  /**
   * sensitivity level of report
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
  private List<ShareAccess> shareAccess = null;

  public static final String SERIALIZED_NAME_CHART_IDS = "chartIds";
  @SerializedName(SERIALIZED_NAME_CHART_IDS)
  private List<String> chartIds = null;

  public UpdateReport() {
  }

  public UpdateReport description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * report description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a report on headcount etd", value = "report description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UpdateReport label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * report label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Headcount Report", value = "report label")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public UpdateReport filter(String filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * filter automatically applied to every chart in this report
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "department:engineering", value = "filter automatically applied to every chart in this report")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    
    
    
    this.filter = filter;
  }


  public UpdateReport share(ShareEnum share) {
    
    
    
    
    this.share = share;
    return this;
  }

   /**
   * sharing settings of report
   * @return share
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sharing settings of report")

  public ShareEnum getShare() {
    return share;
  }


  public void setShare(ShareEnum share) {
    
    
    
    this.share = share;
  }


  public UpdateReport sensitive(SensitiveEnum sensitive) {
    
    
    
    
    this.sensitive = sensitive;
    return this;
  }

   /**
   * sensitivity level of report
   * @return sensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sensitivity level of report")

  public SensitiveEnum getSensitive() {
    return sensitive;
  }


  public void setSensitive(SensitiveEnum sensitive) {
    
    
    
    this.sensitive = sensitive;
  }


  public UpdateReport shareAccess(List<ShareAccess> shareAccess) {
    
    
    
    
    this.shareAccess = shareAccess;
    return this;
  }

  public UpdateReport addShareAccessItem(ShareAccess shareAccessItem) {
    if (this.shareAccess == null) {
      this.shareAccess = new ArrayList<>();
    }
    this.shareAccess.add(shareAccessItem);
    return this;
  }

   /**
   * users who are specifically granted permission to view or edit this report
   * @return shareAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "users who are specifically granted permission to view or edit this report")

  public List<ShareAccess> getShareAccess() {
    return shareAccess;
  }


  public void setShareAccess(List<ShareAccess> shareAccess) {
    
    
    
    this.shareAccess = shareAccess;
  }


  public UpdateReport chartIds(List<String> chartIds) {
    
    
    
    
    this.chartIds = chartIds;
    return this;
  }

  public UpdateReport addChartIdsItem(String chartIdsItem) {
    if (this.chartIds == null) {
      this.chartIds = new ArrayList<>();
    }
    this.chartIds.add(chartIdsItem);
    return this;
  }

   /**
   * list of charts in this report
   * @return chartIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of charts in this report")

  public List<String> getChartIds() {
    return chartIds;
  }


  public void setChartIds(List<String> chartIds) {
    
    
    
    this.chartIds = chartIds;
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
   * @return the UpdateReport instance itself
   */
  public UpdateReport putAdditionalProperty(String key, Object value) {
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
    UpdateReport updateReport = (UpdateReport) o;
    return Objects.equals(this.description, updateReport.description) &&
        Objects.equals(this.label, updateReport.label) &&
        Objects.equals(this.filter, updateReport.filter) &&
        Objects.equals(this.share, updateReport.share) &&
        Objects.equals(this.sensitive, updateReport.sensitive) &&
        Objects.equals(this.shareAccess, updateReport.shareAccess) &&
        Objects.equals(this.chartIds, updateReport.chartIds)&&
        Objects.equals(this.additionalProperties, updateReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, label, filter, share, sensitive, shareAccess, chartIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReport {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    shareAccess: ").append(toIndentedString(shareAccess)).append("\n");
    sb.append("    chartIds: ").append(toIndentedString(chartIds)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("share");
    openapiFields.add("sensitive");
    openapiFields.add("shareAccess");
    openapiFields.add("chartIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateReport is not found in the empty JSON string", UpdateReport.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if ((jsonObj.get("share") != null && !jsonObj.get("share").isJsonNull()) && !jsonObj.get("share").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share").toString()));
      }
      if ((jsonObj.get("sensitive") != null && !jsonObj.get("sensitive").isJsonNull()) && !jsonObj.get("sensitive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sensitive").toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("chartIds") != null && !jsonObj.get("chartIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `chartIds` to be an array in the JSON string but got `%s`", jsonObj.get("chartIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateReport.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateReport>() {
           @Override
           public void write(JsonWriter out, UpdateReport value) throws IOException {
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
           public UpdateReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateReport
  * @throws IOException if the JSON string is invalid with respect to UpdateReport
  */
  public static UpdateReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateReport.class);
  }

 /**
  * Convert an instance of UpdateReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

