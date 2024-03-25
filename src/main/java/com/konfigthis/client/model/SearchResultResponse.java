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
import com.konfigthis.client.model.SearchResult;
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
 * SearchResultResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SearchResultResponse {
  public static final String SERIALIZED_NAME_ORGS = "orgs";
  @SerializedName(SERIALIZED_NAME_ORGS)
  private List<SearchResult> orgs = null;

  public static final String SERIALIZED_NAME_CUSTOMERS = "customers";
  @SerializedName(SERIALIZED_NAME_CUSTOMERS)
  private List<SearchResult> customers = null;

  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private List<SearchResult> jobs = null;

  public static final String SERIALIZED_NAME_PERSONS = "persons";
  @SerializedName(SERIALIZED_NAME_PERSONS)
  private List<SearchResult> persons = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<SearchResult> groups = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<SearchResult> fields = null;

  public static final String SERIALIZED_NAME_FUNCTIONS = "functions";
  @SerializedName(SERIALIZED_NAME_FUNCTIONS)
  private List<SearchResult> functions = null;

  public static final String SERIALIZED_NAME_REPORTS = "reports";
  @SerializedName(SERIALIZED_NAME_REPORTS)
  private List<SearchResult> reports = null;

  public static final String SERIALIZED_NAME_SCENARIOS = "scenarios";
  @SerializedName(SERIALIZED_NAME_SCENARIOS)
  private List<SearchResult> scenarios = null;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<SearchResult> users = null;

  public static final String SERIALIZED_NAME_APP_USERS = "appUsers";
  @SerializedName(SERIALIZED_NAME_APP_USERS)
  private List<SearchResult> appUsers = null;

  public static final String SERIALIZED_NAME_COMP_BANDS = "compBands";
  @SerializedName(SERIALIZED_NAME_COMP_BANDS)
  private List<SearchResult> compBands = null;

  public static final String SERIALIZED_NAME_QUESTIONS = "questions";
  @SerializedName(SERIALIZED_NAME_QUESTIONS)
  private List<SearchResult> questions = null;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<SearchResult> contents = null;

  public SearchResultResponse() {
  }

  public SearchResultResponse orgs(List<SearchResult> orgs) {
    
    
    
    
    this.orgs = orgs;
    return this;
  }

  public SearchResultResponse addOrgsItem(SearchResult orgsItem) {
    if (this.orgs == null) {
      this.orgs = new ArrayList<>();
    }
    this.orgs.add(orgsItem);
    return this;
  }

   /**
   * Get orgs
   * @return orgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getOrgs() {
    return orgs;
  }


  public void setOrgs(List<SearchResult> orgs) {
    
    
    
    this.orgs = orgs;
  }


  public SearchResultResponse customers(List<SearchResult> customers) {
    
    
    
    
    this.customers = customers;
    return this;
  }

  public SearchResultResponse addCustomersItem(SearchResult customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<>();
    }
    this.customers.add(customersItem);
    return this;
  }

   /**
   * Get customers
   * @return customers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getCustomers() {
    return customers;
  }


  public void setCustomers(List<SearchResult> customers) {
    
    
    
    this.customers = customers;
  }


  public SearchResultResponse jobs(List<SearchResult> jobs) {
    
    
    
    
    this.jobs = jobs;
    return this;
  }

  public SearchResultResponse addJobsItem(SearchResult jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getJobs() {
    return jobs;
  }


  public void setJobs(List<SearchResult> jobs) {
    
    
    
    this.jobs = jobs;
  }


  public SearchResultResponse persons(List<SearchResult> persons) {
    
    
    
    
    this.persons = persons;
    return this;
  }

  public SearchResultResponse addPersonsItem(SearchResult personsItem) {
    if (this.persons == null) {
      this.persons = new ArrayList<>();
    }
    this.persons.add(personsItem);
    return this;
  }

   /**
   * Get persons
   * @return persons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getPersons() {
    return persons;
  }


  public void setPersons(List<SearchResult> persons) {
    
    
    
    this.persons = persons;
  }


  public SearchResultResponse groups(List<SearchResult> groups) {
    
    
    
    
    this.groups = groups;
    return this;
  }

  public SearchResultResponse addGroupsItem(SearchResult groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getGroups() {
    return groups;
  }


  public void setGroups(List<SearchResult> groups) {
    
    
    
    this.groups = groups;
  }


  public SearchResultResponse fields(List<SearchResult> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public SearchResultResponse addFieldsItem(SearchResult fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getFields() {
    return fields;
  }


  public void setFields(List<SearchResult> fields) {
    
    
    
    this.fields = fields;
  }


  public SearchResultResponse functions(List<SearchResult> functions) {
    
    
    
    
    this.functions = functions;
    return this;
  }

  public SearchResultResponse addFunctionsItem(SearchResult functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

   /**
   * Get functions
   * @return functions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getFunctions() {
    return functions;
  }


  public void setFunctions(List<SearchResult> functions) {
    
    
    
    this.functions = functions;
  }


  public SearchResultResponse reports(List<SearchResult> reports) {
    
    
    
    
    this.reports = reports;
    return this;
  }

  public SearchResultResponse addReportsItem(SearchResult reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getReports() {
    return reports;
  }


  public void setReports(List<SearchResult> reports) {
    
    
    
    this.reports = reports;
  }


  public SearchResultResponse scenarios(List<SearchResult> scenarios) {
    
    
    
    
    this.scenarios = scenarios;
    return this;
  }

  public SearchResultResponse addScenariosItem(SearchResult scenariosItem) {
    if (this.scenarios == null) {
      this.scenarios = new ArrayList<>();
    }
    this.scenarios.add(scenariosItem);
    return this;
  }

   /**
   * Get scenarios
   * @return scenarios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getScenarios() {
    return scenarios;
  }


  public void setScenarios(List<SearchResult> scenarios) {
    
    
    
    this.scenarios = scenarios;
  }


  public SearchResultResponse users(List<SearchResult> users) {
    
    
    
    
    this.users = users;
    return this;
  }

  public SearchResultResponse addUsersItem(SearchResult usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getUsers() {
    return users;
  }


  public void setUsers(List<SearchResult> users) {
    
    
    
    this.users = users;
  }


  public SearchResultResponse appUsers(List<SearchResult> appUsers) {
    
    
    
    
    this.appUsers = appUsers;
    return this;
  }

  public SearchResultResponse addAppUsersItem(SearchResult appUsersItem) {
    if (this.appUsers == null) {
      this.appUsers = new ArrayList<>();
    }
    this.appUsers.add(appUsersItem);
    return this;
  }

   /**
   * Get appUsers
   * @return appUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getAppUsers() {
    return appUsers;
  }


  public void setAppUsers(List<SearchResult> appUsers) {
    
    
    
    this.appUsers = appUsers;
  }


  public SearchResultResponse compBands(List<SearchResult> compBands) {
    
    
    
    
    this.compBands = compBands;
    return this;
  }

  public SearchResultResponse addCompBandsItem(SearchResult compBandsItem) {
    if (this.compBands == null) {
      this.compBands = new ArrayList<>();
    }
    this.compBands.add(compBandsItem);
    return this;
  }

   /**
   * Get compBands
   * @return compBands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getCompBands() {
    return compBands;
  }


  public void setCompBands(List<SearchResult> compBands) {
    
    
    
    this.compBands = compBands;
  }


  public SearchResultResponse questions(List<SearchResult> questions) {
    
    
    
    
    this.questions = questions;
    return this;
  }

  public SearchResultResponse addQuestionsItem(SearchResult questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getQuestions() {
    return questions;
  }


  public void setQuestions(List<SearchResult> questions) {
    
    
    
    this.questions = questions;
  }


  public SearchResultResponse contents(List<SearchResult> contents) {
    
    
    
    
    this.contents = contents;
    return this;
  }

  public SearchResultResponse addContentsItem(SearchResult contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchResult> getContents() {
    return contents;
  }


  public void setContents(List<SearchResult> contents) {
    
    
    
    this.contents = contents;
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
   * @return the SearchResultResponse instance itself
   */
  public SearchResultResponse putAdditionalProperty(String key, Object value) {
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
    SearchResultResponse searchResultResponse = (SearchResultResponse) o;
    return Objects.equals(this.orgs, searchResultResponse.orgs) &&
        Objects.equals(this.customers, searchResultResponse.customers) &&
        Objects.equals(this.jobs, searchResultResponse.jobs) &&
        Objects.equals(this.persons, searchResultResponse.persons) &&
        Objects.equals(this.groups, searchResultResponse.groups) &&
        Objects.equals(this.fields, searchResultResponse.fields) &&
        Objects.equals(this.functions, searchResultResponse.functions) &&
        Objects.equals(this.reports, searchResultResponse.reports) &&
        Objects.equals(this.scenarios, searchResultResponse.scenarios) &&
        Objects.equals(this.users, searchResultResponse.users) &&
        Objects.equals(this.appUsers, searchResultResponse.appUsers) &&
        Objects.equals(this.compBands, searchResultResponse.compBands) &&
        Objects.equals(this.questions, searchResultResponse.questions) &&
        Objects.equals(this.contents, searchResultResponse.contents)&&
        Objects.equals(this.additionalProperties, searchResultResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgs, customers, jobs, persons, groups, fields, functions, reports, scenarios, users, appUsers, compBands, questions, contents, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultResponse {\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    appUsers: ").append(toIndentedString(appUsers)).append("\n");
    sb.append("    compBands: ").append(toIndentedString(compBands)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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
    openapiFields.add("orgs");
    openapiFields.add("customers");
    openapiFields.add("jobs");
    openapiFields.add("persons");
    openapiFields.add("groups");
    openapiFields.add("fields");
    openapiFields.add("functions");
    openapiFields.add("reports");
    openapiFields.add("scenarios");
    openapiFields.add("users");
    openapiFields.add("appUsers");
    openapiFields.add("compBands");
    openapiFields.add("questions");
    openapiFields.add("contents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchResultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchResultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResultResponse is not found in the empty JSON string", SearchResultResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("orgs") != null && !jsonObj.get("orgs").isJsonNull()) {
        JsonArray jsonArrayorgs = jsonObj.getAsJsonArray("orgs");
        if (jsonArrayorgs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("orgs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `orgs` to be an array in the JSON string but got `%s`", jsonObj.get("orgs").toString()));
          }

          // validate the optional field `orgs` (array)
          for (int i = 0; i < jsonArrayorgs.size(); i++) {
            SearchResult.validateJsonObject(jsonArrayorgs.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("customers") != null && !jsonObj.get("customers").isJsonNull()) {
        JsonArray jsonArraycustomers = jsonObj.getAsJsonArray("customers");
        if (jsonArraycustomers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customers` to be an array in the JSON string but got `%s`", jsonObj.get("customers").toString()));
          }

          // validate the optional field `customers` (array)
          for (int i = 0; i < jsonArraycustomers.size(); i++) {
            SearchResult.validateJsonObject(jsonArraycustomers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("jobs") != null && !jsonObj.get("jobs").isJsonNull()) {
        JsonArray jsonArrayjobs = jsonObj.getAsJsonArray("jobs");
        if (jsonArrayjobs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("jobs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `jobs` to be an array in the JSON string but got `%s`", jsonObj.get("jobs").toString()));
          }

          // validate the optional field `jobs` (array)
          for (int i = 0; i < jsonArrayjobs.size(); i++) {
            SearchResult.validateJsonObject(jsonArrayjobs.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("persons") != null && !jsonObj.get("persons").isJsonNull()) {
        JsonArray jsonArraypersons = jsonObj.getAsJsonArray("persons");
        if (jsonArraypersons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("persons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `persons` to be an array in the JSON string but got `%s`", jsonObj.get("persons").toString()));
          }

          // validate the optional field `persons` (array)
          for (int i = 0; i < jsonArraypersons.size(); i++) {
            SearchResult.validateJsonObject(jsonArraypersons.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            SearchResult.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
          };
        }
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
            SearchResult.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("functions") != null && !jsonObj.get("functions").isJsonNull()) {
        JsonArray jsonArrayfunctions = jsonObj.getAsJsonArray("functions");
        if (jsonArrayfunctions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("functions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `functions` to be an array in the JSON string but got `%s`", jsonObj.get("functions").toString()));
          }

          // validate the optional field `functions` (array)
          for (int i = 0; i < jsonArrayfunctions.size(); i++) {
            SearchResult.validateJsonObject(jsonArrayfunctions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("reports") != null && !jsonObj.get("reports").isJsonNull()) {
        JsonArray jsonArrayreports = jsonObj.getAsJsonArray("reports");
        if (jsonArrayreports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reports` to be an array in the JSON string but got `%s`", jsonObj.get("reports").toString()));
          }

          // validate the optional field `reports` (array)
          for (int i = 0; i < jsonArrayreports.size(); i++) {
            SearchResult.validateJsonObject(jsonArrayreports.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("scenarios") != null && !jsonObj.get("scenarios").isJsonNull()) {
        JsonArray jsonArrayscenarios = jsonObj.getAsJsonArray("scenarios");
        if (jsonArrayscenarios != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scenarios").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scenarios` to be an array in the JSON string but got `%s`", jsonObj.get("scenarios").toString()));
          }

          // validate the optional field `scenarios` (array)
          for (int i = 0; i < jsonArrayscenarios.size(); i++) {
            SearchResult.validateJsonObject(jsonArrayscenarios.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            SearchResult.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("appUsers") != null && !jsonObj.get("appUsers").isJsonNull()) {
        JsonArray jsonArrayappUsers = jsonObj.getAsJsonArray("appUsers");
        if (jsonArrayappUsers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("appUsers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `appUsers` to be an array in the JSON string but got `%s`", jsonObj.get("appUsers").toString()));
          }

          // validate the optional field `appUsers` (array)
          for (int i = 0; i < jsonArrayappUsers.size(); i++) {
            SearchResult.validateJsonObject(jsonArrayappUsers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("compBands") != null && !jsonObj.get("compBands").isJsonNull()) {
        JsonArray jsonArraycompBands = jsonObj.getAsJsonArray("compBands");
        if (jsonArraycompBands != null) {
          // ensure the json data is an array
          if (!jsonObj.get("compBands").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `compBands` to be an array in the JSON string but got `%s`", jsonObj.get("compBands").toString()));
          }

          // validate the optional field `compBands` (array)
          for (int i = 0; i < jsonArraycompBands.size(); i++) {
            SearchResult.validateJsonObject(jsonArraycompBands.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("questions") != null && !jsonObj.get("questions").isJsonNull()) {
        JsonArray jsonArrayquestions = jsonObj.getAsJsonArray("questions");
        if (jsonArrayquestions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("questions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `questions` to be an array in the JSON string but got `%s`", jsonObj.get("questions").toString()));
          }

          // validate the optional field `questions` (array)
          for (int i = 0; i < jsonArrayquestions.size(); i++) {
            SearchResult.validateJsonObject(jsonArrayquestions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("contents") != null && !jsonObj.get("contents").isJsonNull()) {
        JsonArray jsonArraycontents = jsonObj.getAsJsonArray("contents");
        if (jsonArraycontents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contents` to be an array in the JSON string but got `%s`", jsonObj.get("contents").toString()));
          }

          // validate the optional field `contents` (array)
          for (int i = 0; i < jsonArraycontents.size(); i++) {
            SearchResult.validateJsonObject(jsonArraycontents.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResultResponse>() {
           @Override
           public void write(JsonWriter out, SearchResultResponse value) throws IOException {
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
           public SearchResultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchResultResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchResultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResultResponse
  * @throws IOException if the JSON string is invalid with respect to SearchResultResponse
  */
  public static SearchResultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResultResponse.class);
  }

 /**
  * Convert an instance of SearchResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
