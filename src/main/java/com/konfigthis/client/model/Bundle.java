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
import com.konfigthis.client.model.BundleReport;
import com.konfigthis.client.model.Category;
import com.konfigthis.client.model.Content;
import com.konfigthis.client.model.PartialAction;
import com.konfigthis.client.model.PartialField;
import com.konfigthis.client.model.PartialForm;
import com.konfigthis.client.model.PartialGroup;
import com.konfigthis.client.model.PartialProfileTab;
import com.konfigthis.client.model.PartialTaskConfig;
import com.konfigthis.client.model.Question;
import com.konfigthis.client.model.Template;
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
 * Bundle
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Bundle {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<PartialField> fields = null;

  public static final String SERIALIZED_NAME_FORMS = "forms";
  @SerializedName(SERIALIZED_NAME_FORMS)
  private List<PartialForm> forms = null;

  public static final String SERIALIZED_NAME_QUESTIONS = "questions";
  @SerializedName(SERIALIZED_NAME_QUESTIONS)
  private List<Question> questions = null;

  public static final String SERIALIZED_NAME_PROFILE_TABS = "profileTabs";
  @SerializedName(SERIALIZED_NAME_PROFILE_TABS)
  private List<PartialProfileTab> profileTabs = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<PartialGroup> groups = null;

  public static final String SERIALIZED_NAME_REPORTS = "reports";
  @SerializedName(SERIALIZED_NAME_REPORTS)
  private List<BundleReport> reports = null;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<PartialAction> actions = null;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<Template> templates = null;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<Content> contents = null;

  public static final String SERIALIZED_NAME_TASK_CONFIGS = "taskConfigs";
  @SerializedName(SERIALIZED_NAME_TASK_CONFIGS)
  private List<PartialTaskConfig> taskConfigs = null;

  public Bundle() {
  }

  public Bundle categories(List<Category> categories) {
    
    
    
    
    this.categories = categories;
    return this;
  }

  public Bundle addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * list of categories included in this bundle
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of categories included in this bundle")

  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    
    
    
    this.categories = categories;
  }


  public Bundle fields(List<PartialField> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public Bundle addFieldsItem(PartialField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * list of fields included in this bundle
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of fields included in this bundle")

  public List<PartialField> getFields() {
    return fields;
  }


  public void setFields(List<PartialField> fields) {
    
    
    
    this.fields = fields;
  }


  public Bundle forms(List<PartialForm> forms) {
    
    
    
    
    this.forms = forms;
    return this;
  }

  public Bundle addFormsItem(PartialForm formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<>();
    }
    this.forms.add(formsItem);
    return this;
  }

   /**
   * list of forms included in this bundle
   * @return forms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of forms included in this bundle")

  public List<PartialForm> getForms() {
    return forms;
  }


  public void setForms(List<PartialForm> forms) {
    
    
    
    this.forms = forms;
  }


  public Bundle questions(List<Question> questions) {
    
    
    
    
    this.questions = questions;
    return this;
  }

  public Bundle addQuestionsItem(Question questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * list of questions included in this bundle
   * @return questions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of questions included in this bundle")

  public List<Question> getQuestions() {
    return questions;
  }


  public void setQuestions(List<Question> questions) {
    
    
    
    this.questions = questions;
  }


  public Bundle profileTabs(List<PartialProfileTab> profileTabs) {
    
    
    
    
    this.profileTabs = profileTabs;
    return this;
  }

  public Bundle addProfileTabsItem(PartialProfileTab profileTabsItem) {
    if (this.profileTabs == null) {
      this.profileTabs = new ArrayList<>();
    }
    this.profileTabs.add(profileTabsItem);
    return this;
  }

   /**
   * list of profile tabs included in this bundle
   * @return profileTabs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of profile tabs included in this bundle")

  public List<PartialProfileTab> getProfileTabs() {
    return profileTabs;
  }


  public void setProfileTabs(List<PartialProfileTab> profileTabs) {
    
    
    
    this.profileTabs = profileTabs;
  }


  public Bundle groups(List<PartialGroup> groups) {
    
    
    
    
    this.groups = groups;
    return this;
  }

  public Bundle addGroupsItem(PartialGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * list of content groups included in this bundle
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of content groups included in this bundle")

  public List<PartialGroup> getGroups() {
    return groups;
  }


  public void setGroups(List<PartialGroup> groups) {
    
    
    
    this.groups = groups;
  }


  public Bundle reports(List<BundleReport> reports) {
    
    
    
    
    this.reports = reports;
    return this;
  }

  public Bundle addReportsItem(BundleReport reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * list of reports included in this bundle
   * @return reports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of reports included in this bundle")

  public List<BundleReport> getReports() {
    return reports;
  }


  public void setReports(List<BundleReport> reports) {
    
    
    
    this.reports = reports;
  }


  public Bundle actions(List<PartialAction> actions) {
    
    
    
    
    this.actions = actions;
    return this;
  }

  public Bundle addActionsItem(PartialAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * list of actions included in this bundle
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of actions included in this bundle")

  public List<PartialAction> getActions() {
    return actions;
  }


  public void setActions(List<PartialAction> actions) {
    
    
    
    this.actions = actions;
  }


  public Bundle templates(List<Template> templates) {
    
    
    
    
    this.templates = templates;
    return this;
  }

  public Bundle addTemplatesItem(Template templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * list of templates included in this bundle
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of templates included in this bundle")

  public List<Template> getTemplates() {
    return templates;
  }


  public void setTemplates(List<Template> templates) {
    
    
    
    this.templates = templates;
  }


  public Bundle contents(List<Content> contents) {
    
    
    
    
    this.contents = contents;
    return this;
  }

  public Bundle addContentsItem(Content contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * list of resource content included in this bundle
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of resource content included in this bundle")

  public List<Content> getContents() {
    return contents;
  }


  public void setContents(List<Content> contents) {
    
    
    
    this.contents = contents;
  }


  public Bundle taskConfigs(List<PartialTaskConfig> taskConfigs) {
    
    
    
    
    this.taskConfigs = taskConfigs;
    return this;
  }

  public Bundle addTaskConfigsItem(PartialTaskConfig taskConfigsItem) {
    if (this.taskConfigs == null) {
      this.taskConfigs = new ArrayList<>();
    }
    this.taskConfigs.add(taskConfigsItem);
    return this;
  }

   /**
   * list of task configs included in this bundle
   * @return taskConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of task configs included in this bundle")

  public List<PartialTaskConfig> getTaskConfigs() {
    return taskConfigs;
  }


  public void setTaskConfigs(List<PartialTaskConfig> taskConfigs) {
    
    
    
    this.taskConfigs = taskConfigs;
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
   * @return the Bundle instance itself
   */
  public Bundle putAdditionalProperty(String key, Object value) {
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
    Bundle bundle = (Bundle) o;
    return Objects.equals(this.categories, bundle.categories) &&
        Objects.equals(this.fields, bundle.fields) &&
        Objects.equals(this.forms, bundle.forms) &&
        Objects.equals(this.questions, bundle.questions) &&
        Objects.equals(this.profileTabs, bundle.profileTabs) &&
        Objects.equals(this.groups, bundle.groups) &&
        Objects.equals(this.reports, bundle.reports) &&
        Objects.equals(this.actions, bundle.actions) &&
        Objects.equals(this.templates, bundle.templates) &&
        Objects.equals(this.contents, bundle.contents) &&
        Objects.equals(this.taskConfigs, bundle.taskConfigs)&&
        Objects.equals(this.additionalProperties, bundle.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, fields, forms, questions, profileTabs, groups, reports, actions, templates, contents, taskConfigs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bundle {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    profileTabs: ").append(toIndentedString(profileTabs)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    taskConfigs: ").append(toIndentedString(taskConfigs)).append("\n");
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
    openapiFields.add("categories");
    openapiFields.add("fields");
    openapiFields.add("forms");
    openapiFields.add("questions");
    openapiFields.add("profileTabs");
    openapiFields.add("groups");
    openapiFields.add("reports");
    openapiFields.add("actions");
    openapiFields.add("templates");
    openapiFields.add("contents");
    openapiFields.add("taskConfigs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Bundle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Bundle.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Bundle is not found in the empty JSON string", Bundle.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull()) {
        JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
        if (jsonArraycategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("categories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
          }

          // validate the optional field `categories` (array)
          for (int i = 0; i < jsonArraycategories.size(); i++) {
            Category.validateJsonObject(jsonArraycategories.get(i).getAsJsonObject());
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
            PartialField.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("forms") != null && !jsonObj.get("forms").isJsonNull()) {
        JsonArray jsonArrayforms = jsonObj.getAsJsonArray("forms");
        if (jsonArrayforms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("forms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `forms` to be an array in the JSON string but got `%s`", jsonObj.get("forms").toString()));
          }

          // validate the optional field `forms` (array)
          for (int i = 0; i < jsonArrayforms.size(); i++) {
            PartialForm.validateJsonObject(jsonArrayforms.get(i).getAsJsonObject());
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
            Question.validateJsonObject(jsonArrayquestions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("profileTabs") != null && !jsonObj.get("profileTabs").isJsonNull()) {
        JsonArray jsonArrayprofileTabs = jsonObj.getAsJsonArray("profileTabs");
        if (jsonArrayprofileTabs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("profileTabs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `profileTabs` to be an array in the JSON string but got `%s`", jsonObj.get("profileTabs").toString()));
          }

          // validate the optional field `profileTabs` (array)
          for (int i = 0; i < jsonArrayprofileTabs.size(); i++) {
            PartialProfileTab.validateJsonObject(jsonArrayprofileTabs.get(i).getAsJsonObject());
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
            PartialGroup.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
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
            BundleReport.validateJsonObject(jsonArrayreports.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            PartialAction.validateJsonObject(jsonArrayactions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("templates") != null && !jsonObj.get("templates").isJsonNull()) {
        JsonArray jsonArraytemplates = jsonObj.getAsJsonArray("templates");
        if (jsonArraytemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("templates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `templates` to be an array in the JSON string but got `%s`", jsonObj.get("templates").toString()));
          }

          // validate the optional field `templates` (array)
          for (int i = 0; i < jsonArraytemplates.size(); i++) {
            Template.validateJsonObject(jsonArraytemplates.get(i).getAsJsonObject());
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
            Content.validateJsonObject(jsonArraycontents.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("taskConfigs") != null && !jsonObj.get("taskConfigs").isJsonNull()) {
        JsonArray jsonArraytaskConfigs = jsonObj.getAsJsonArray("taskConfigs");
        if (jsonArraytaskConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taskConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taskConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("taskConfigs").toString()));
          }

          // validate the optional field `taskConfigs` (array)
          for (int i = 0; i < jsonArraytaskConfigs.size(); i++) {
            PartialTaskConfig.validateJsonObject(jsonArraytaskConfigs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Bundle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Bundle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Bundle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Bundle.class));

       return (TypeAdapter<T>) new TypeAdapter<Bundle>() {
           @Override
           public void write(JsonWriter out, Bundle value) throws IOException {
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
           public Bundle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Bundle instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Bundle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Bundle
  * @throws IOException if the JSON string is invalid with respect to Bundle
  */
  public static Bundle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Bundle.class);
  }

 /**
  * Convert an instance of Bundle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

