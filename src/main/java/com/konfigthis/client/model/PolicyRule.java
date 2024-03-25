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
 * PolicyRule
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PolicyRule {
  public static final String SERIALIZED_NAME_ALLOW = "allow";
  @SerializedName(SERIALIZED_NAME_ALLOW)
  private List<String> allow = null;

  public static final String SERIALIZED_NAME_DENY = "deny";
  @SerializedName(SERIALIZED_NAME_DENY)
  private List<String> deny = null;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = null;

  public static final String SERIALIZED_NAME_DEPARTMENT_IDS = "departmentIds";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_IDS)
  private Set<String> departmentIds = null;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_DIRECTIONS = "directions";
  @SerializedName(SERIALIZED_NAME_DIRECTIONS)
  private List<String> directions = null;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<String> types = null;

  public static final String SERIALIZED_NAME_VISIBLE_SENSITIVE = "visibleSensitive";
  @SerializedName(SERIALIZED_NAME_VISIBLE_SENSITIVE)
  private List<String> visibleSensitive = null;

  public static final String SERIALIZED_NAME_FIELDS_SENSITIVE = "fieldsSensitive";
  @SerializedName(SERIALIZED_NAME_FIELDS_SENSITIVE)
  private List<String> fieldsSensitive = null;

  public PolicyRule() {
  }

  public PolicyRule allow(List<String> allow) {
    
    
    
    
    this.allow = allow;
    return this;
  }

  public PolicyRule addAllowItem(String allowItem) {
    if (this.allow == null) {
      this.allow = new ArrayList<>();
    }
    this.allow.add(allowItem);
    return this;
  }

   /**
   * allow rules
   * @return allow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "['job:read', 'person.read']", value = "allow rules")

  public List<String> getAllow() {
    return allow;
  }


  public void setAllow(List<String> allow) {
    
    
    
    this.allow = allow;
  }


  public PolicyRule deny(List<String> deny) {
    
    
    
    
    this.deny = deny;
    return this;
  }

  public PolicyRule addDenyItem(String denyItem) {
    if (this.deny == null) {
      this.deny = new ArrayList<>();
    }
    this.deny.add(denyItem);
    return this;
  }

   /**
   * deny rules
   * @return deny
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "['job:read', 'person.read']", value = "deny rules")

  public List<String> getDeny() {
    return deny;
  }


  public void setDeny(List<String> deny) {
    
    
    
    this.deny = deny;
  }


  public PolicyRule categories(List<String> categories) {
    
    
    
    
    this.categories = categories;
    return this;
  }

  public PolicyRule addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * categories the rule is limited to
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "['Compensation', 'Stock Grants']", value = "categories the rule is limited to")

  public List<String> getCategories() {
    return categories;
  }


  public void setCategories(List<String> categories) {
    
    
    
    this.categories = categories;
  }


  public PolicyRule fields(List<String> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public PolicyRule addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * fields the rule is limited to
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "['base']", value = "fields the rule is limited to")

  public List<String> getFields() {
    return fields;
  }


  public void setFields(List<String> fields) {
    
    
    
    this.fields = fields;
  }


  public PolicyRule departmentIds(Set<String> departmentIds) {
    
    
    
    
    this.departmentIds = departmentIds;
    return this;
  }

  public PolicyRule addDepartmentIdsItem(String departmentIdsItem) {
    if (this.departmentIds == null) {
      this.departmentIds = new LinkedHashSet<>();
    }
    this.departmentIds.add(departmentIdsItem);
    return this;
  }

   /**
   * departments the rule is limited to
   * @return departmentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "departments the rule is limited to")

  public Set<String> getDepartmentIds() {
    return departmentIds;
  }


  public void setDepartmentIds(Set<String> departmentIds) {
    
    
    
    this.departmentIds = departmentIds;
  }


  public PolicyRule filter(String filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * custom filter the rule is limited to
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "department:engineering and under:me", value = "custom filter the rule is limited to")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    
    
    
    this.filter = filter;
  }


  public PolicyRule directions(List<String> directions) {
    
    
    
    
    this.directions = directions;
    return this;
  }

  public PolicyRule addDirectionsItem(String directionsItem) {
    if (this.directions == null) {
      this.directions = new ArrayList<>();
    }
    this.directions.add(directionsItem);
    return this;
  }

   /**
   * directions that the rule applies to -- either self or under
   * @return directions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "directions that the rule applies to -- either self or under")

  public List<String> getDirections() {
    return directions;
  }


  public void setDirections(List<String> directions) {
    
    
    
    this.directions = directions;
  }


  public PolicyRule types(List<String> types) {
    
    
    
    
    this.types = types;
    return this;
  }

  public PolicyRule addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * types that the rule applies to
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "types that the rule applies to")

  public List<String> getTypes() {
    return types;
  }


  public void setTypes(List<String> types) {
    
    
    
    this.types = types;
  }


  public PolicyRule visibleSensitive(List<String> visibleSensitive) {
    
    
    
    
    this.visibleSensitive = visibleSensitive;
    return this;
  }

  public PolicyRule addVisibleSensitiveItem(String visibleSensitiveItem) {
    if (this.visibleSensitive == null) {
      this.visibleSensitive = new ArrayList<>();
    }
    this.visibleSensitive.add(visibleSensitiveItem);
    return this;
  }

   /**
   * if specified, controls visibility of sensitive entities -- for example, [&#39;Manager Shared&#39;, &#39;Manager Only&#39;]
   * @return visibleSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if specified, controls visibility of sensitive entities -- for example, ['Manager Shared', 'Manager Only']")

  public List<String> getVisibleSensitive() {
    return visibleSensitive;
  }


  public void setVisibleSensitive(List<String> visibleSensitive) {
    
    
    
    this.visibleSensitive = visibleSensitive;
  }


  public PolicyRule fieldsSensitive(List<String> fieldsSensitive) {
    
    
    
    
    this.fieldsSensitive = fieldsSensitive;
    return this;
  }

  public PolicyRule addFieldsSensitiveItem(String fieldsSensitiveItem) {
    if (this.fieldsSensitive == null) {
      this.fieldsSensitive = new ArrayList<>();
    }
    this.fieldsSensitive.add(fieldsSensitiveItem);
    return this;
  }

   /**
   * if specified, controls applicability of fields by sensitivity -- for example, [&#39;Manager Shared&#39;, &#39;Manager Only&#39;]
   * @return fieldsSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if specified, controls applicability of fields by sensitivity -- for example, ['Manager Shared', 'Manager Only']")

  public List<String> getFieldsSensitive() {
    return fieldsSensitive;
  }


  public void setFieldsSensitive(List<String> fieldsSensitive) {
    
    
    
    this.fieldsSensitive = fieldsSensitive;
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
   * @return the PolicyRule instance itself
   */
  public PolicyRule putAdditionalProperty(String key, Object value) {
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
    PolicyRule policyRule = (PolicyRule) o;
    return Objects.equals(this.allow, policyRule.allow) &&
        Objects.equals(this.deny, policyRule.deny) &&
        Objects.equals(this.categories, policyRule.categories) &&
        Objects.equals(this.fields, policyRule.fields) &&
        Objects.equals(this.departmentIds, policyRule.departmentIds) &&
        Objects.equals(this.filter, policyRule.filter) &&
        Objects.equals(this.directions, policyRule.directions) &&
        Objects.equals(this.types, policyRule.types) &&
        Objects.equals(this.visibleSensitive, policyRule.visibleSensitive) &&
        Objects.equals(this.fieldsSensitive, policyRule.fieldsSensitive)&&
        Objects.equals(this.additionalProperties, policyRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow, deny, categories, fields, departmentIds, filter, directions, types, visibleSensitive, fieldsSensitive, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRule {\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    deny: ").append(toIndentedString(deny)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    departmentIds: ").append(toIndentedString(departmentIds)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    visibleSensitive: ").append(toIndentedString(visibleSensitive)).append("\n");
    sb.append("    fieldsSensitive: ").append(toIndentedString(fieldsSensitive)).append("\n");
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
    openapiFields.add("allow");
    openapiFields.add("deny");
    openapiFields.add("categories");
    openapiFields.add("fields");
    openapiFields.add("departmentIds");
    openapiFields.add("filter");
    openapiFields.add("directions");
    openapiFields.add("types");
    openapiFields.add("visibleSensitive");
    openapiFields.add("fieldsSensitive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PolicyRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PolicyRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PolicyRule is not found in the empty JSON string", PolicyRule.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allow") != null && !jsonObj.get("allow").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allow` to be an array in the JSON string but got `%s`", jsonObj.get("allow").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("deny") != null && !jsonObj.get("deny").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deny` to be an array in the JSON string but got `%s`", jsonObj.get("deny").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("departmentIds") != null && !jsonObj.get("departmentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `departmentIds` to be an array in the JSON string but got `%s`", jsonObj.get("departmentIds").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("directions") != null && !jsonObj.get("directions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `directions` to be an array in the JSON string but got `%s`", jsonObj.get("directions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("visibleSensitive") != null && !jsonObj.get("visibleSensitive").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibleSensitive` to be an array in the JSON string but got `%s`", jsonObj.get("visibleSensitive").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fieldsSensitive") != null && !jsonObj.get("fieldsSensitive").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldsSensitive` to be an array in the JSON string but got `%s`", jsonObj.get("fieldsSensitive").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PolicyRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PolicyRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PolicyRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PolicyRule.class));

       return (TypeAdapter<T>) new TypeAdapter<PolicyRule>() {
           @Override
           public void write(JsonWriter out, PolicyRule value) throws IOException {
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
           public PolicyRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PolicyRule instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PolicyRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PolicyRule
  * @throws IOException if the JSON string is invalid with respect to PolicyRule
  */
  public static PolicyRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PolicyRule.class);
  }

 /**
  * Convert an instance of PolicyRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
