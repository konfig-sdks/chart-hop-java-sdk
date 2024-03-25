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
import com.konfigthis.client.model.Field;
import com.konfigthis.client.model.Job;
import com.konfigthis.client.model.Person;
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
 * PartialAppEntities
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PartialAppEntities {
  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private Map<String, Job> jobs = new HashMap<>();

  public static final String SERIALIZED_NAME_PERSONS = "persons";
  @SerializedName(SERIALIZED_NAME_PERSONS)
  private Map<String, Person> persons = new HashMap<>();

  public static final String SERIALIZED_NAME_PERSON_TO_JOB_MAP = "personToJobMap";
  @SerializedName(SERIALIZED_NAME_PERSON_TO_JOB_MAP)
  private Map<String, Job> personToJobMap = new HashMap<>();

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<Field> fields = new ArrayList<>();

  public PartialAppEntities() {
  }

  public PartialAppEntities jobs(Map<String, Job> jobs) {
    
    
    
    
    this.jobs = jobs;
    return this;
  }

  public PartialAppEntities putJobsItem(String key, Job jobsItem) {
    this.jobs.put(key, jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Job> getJobs() {
    return jobs;
  }


  public void setJobs(Map<String, Job> jobs) {
    
    
    
    this.jobs = jobs;
  }


  public PartialAppEntities persons(Map<String, Person> persons) {
    
    
    
    
    this.persons = persons;
    return this;
  }

  public PartialAppEntities putPersonsItem(String key, Person personsItem) {
    this.persons.put(key, personsItem);
    return this;
  }

   /**
   * Get persons
   * @return persons
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Person> getPersons() {
    return persons;
  }


  public void setPersons(Map<String, Person> persons) {
    
    
    
    this.persons = persons;
  }


  public PartialAppEntities personToJobMap(Map<String, Job> personToJobMap) {
    
    
    
    
    this.personToJobMap = personToJobMap;
    return this;
  }

  public PartialAppEntities putPersonToJobMapItem(String key, Job personToJobMapItem) {
    this.personToJobMap.put(key, personToJobMapItem);
    return this;
  }

   /**
   * Get personToJobMap
   * @return personToJobMap
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Job> getPersonToJobMap() {
    return personToJobMap;
  }


  public void setPersonToJobMap(Map<String, Job> personToJobMap) {
    
    
    
    this.personToJobMap = personToJobMap;
  }


  public PartialAppEntities fields(List<Field> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public PartialAppEntities addFieldsItem(Field fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Field> getFields() {
    return fields;
  }


  public void setFields(List<Field> fields) {
    
    
    
    this.fields = fields;
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
   * @return the PartialAppEntities instance itself
   */
  public PartialAppEntities putAdditionalProperty(String key, Object value) {
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
    PartialAppEntities partialAppEntities = (PartialAppEntities) o;
    return Objects.equals(this.jobs, partialAppEntities.jobs) &&
        Objects.equals(this.persons, partialAppEntities.persons) &&
        Objects.equals(this.personToJobMap, partialAppEntities.personToJobMap) &&
        Objects.equals(this.fields, partialAppEntities.fields)&&
        Objects.equals(this.additionalProperties, partialAppEntities.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, persons, personToJobMap, fields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialAppEntities {\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
    sb.append("    personToJobMap: ").append(toIndentedString(personToJobMap)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("jobs");
    openapiFields.add("persons");
    openapiFields.add("personToJobMap");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jobs");
    openapiRequiredFields.add("persons");
    openapiRequiredFields.add("personToJobMap");
    openapiRequiredFields.add("fields");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartialAppEntities
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PartialAppEntities.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartialAppEntities is not found in the empty JSON string", PartialAppEntities.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PartialAppEntities.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }

      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
      // validate the required field `fields` (array)
      for (int i = 0; i < jsonArrayfields.size(); i++) {
        Field.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartialAppEntities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartialAppEntities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartialAppEntities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartialAppEntities.class));

       return (TypeAdapter<T>) new TypeAdapter<PartialAppEntities>() {
           @Override
           public void write(JsonWriter out, PartialAppEntities value) throws IOException {
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
           public PartialAppEntities read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PartialAppEntities instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PartialAppEntities given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartialAppEntities
  * @throws IOException if the JSON string is invalid with respect to PartialAppEntities
  */
  public static PartialAppEntities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartialAppEntities.class);
  }

 /**
  * Convert an instance of PartialAppEntities to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
