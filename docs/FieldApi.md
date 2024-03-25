# FieldApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewField**](FieldApi.md#createNewField) | **POST** /v1/org/{orgId}/field | Create a field |
| [**getAllPaginated**](FieldApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/field | Return all fields in the organization paginated |
| [**getBuiltInFields**](FieldApi.md#getBuiltInFields) | **GET** /v1/org/{orgId}/field/built-in | Get built-in fields |
| [**getById**](FieldApi.md#getById) | **GET** /v1/org/{orgId}/field/{fieldId} | Return a particular field by id |
| [**getFieldsInCategory**](FieldApi.md#getFieldsInCategory) | **GET** /v1/org/{orgId}/field/category/{categoryId} | Return fields in a particular category |
| [**getUncategorizedFields**](FieldApi.md#getUncategorizedFields) | **GET** /v1/org/{orgId}/field/category | Return uncategorized fields |
| [**remove**](FieldApi.md#remove) | **DELETE** /v1/org/{orgId}/field/delete | Delete fields |
| [**removeById**](FieldApi.md#removeById) | **DELETE** /v1/org/{orgId}/field/{fieldId} | Delete a field |
| [**removeFieldOverrides**](FieldApi.md#removeFieldOverrides) | **POST** /v1/org/{orgId}/field/remove-overrides | Remove overrides from fields |
| [**removeFromCategories**](FieldApi.md#removeFromCategories) | **POST** /v1/org/{orgId}/field/remove-category | Remove field from all associated categories |
| [**updateExistingField**](FieldApi.md#updateExistingField) | **PATCH** /v1/org/{orgId}/field/{fieldId} | Update an existing field |
| [**updateFieldDryRun**](FieldApi.md#updateFieldDryRun) | **PATCH** /v1/org/{orgId}/field/{fieldId}/dryrun | Perform a dry-run of an update to an existing field that will require migrations |
| [**updateStatusForExistingFields**](FieldApi.md#updateStatusForExistingFields) | **POST** /v1/org/{orgId}/field/status | Update status for existing fields |


<a name="createNewField"></a>
# **createNewField**
> Field createNewField(orgId).tableType(tableType).createField(createField).execute();

Create a field



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // short field name
    String label = "label_example"; // human-readable full name of field
    String type = "ADDRESS"; // type of field
    String entityType = "JOB"; // entity type of field
    String sensitive = "GLOBAL"; // sensitivity level of data
    Boolean isUnique = true; // indicates that this field value is unique in conjunction with entityType PERSON or JOB
    Boolean isRequired = true; // indicates that this field value is required
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String description = "description_example"; // description of field
    String orgId = "orgId_example"; // parent organization id (empty if global)
    String question = "question_example"; // human-readable question associated with field
    Boolean inUse = true; // disallow any updates to this Field (except for field.question string)
    String expr = "expr_example"; // calculated expression
    String exprType = "ADDRESS"; // the expected type of the evaluated expression
    String plural = "SINGLE"; // plural type of the field (either SINGLE, LIST, or SET)
    List<EnumValue> values = Arrays.asList(); // possible values (enum type only)
    Object defaultValue = null; // default value if field is not set
    Object options = null; // validation options
    Boolean hideExpr = true; // hide expression-derived values from non-sensitive users
    Integer expireDays = 56; // number of days after which the data becomes invalid
    String status = "ACTIVE"; // the status of the field
    String tableId = "tableId_example"; // the table id this field applies to, only applicable when EntityType equals TABLE
    TableRef tableRef = new TableRef();
    Boolean isEffectiveDated = true; // indicates that this field value is effective-dated
    Set<String> dataFetchTypes = Arrays.asList(); // set of data fetch types
    Set<String> aliases = Arrays.asList(); // set of aliases for this field
    String calc = "ADDRESS"; // unique ID for the function that runs to calculate the value of this field. For native fields only
    String categoryId = "categoryId_example"; // ID of the category to which this field belongs, if any
    String classification = "COMPOUND"; // indicates how this field is calculated (whether it's stored in the DB, evaluated through the expression service, or compound)
    Integer places = 56; // number of decimal places for money values
    String tableType = "tableType_example"; // table type to add the field to
    try {
      Field result = client
              .field
              .createNewField(name, label, type, entityType, sensitive, isUnique, isRequired, orgId)
              .description(description)
              .orgId(orgId)
              .question(question)
              .inUse(inUse)
              .expr(expr)
              .exprType(exprType)
              .plural(plural)
              .values(values)
              .defaultValue(defaultValue)
              .options(options)
              .hideExpr(hideExpr)
              .expireDays(expireDays)
              .status(status)
              .tableId(tableId)
              .tableRef(tableRef)
              .isEffectiveDated(isEffectiveDated)
              .dataFetchTypes(dataFetchTypes)
              .aliases(aliases)
              .calc(calc)
              .categoryId(categoryId)
              .classification(classification)
              .places(places)
              .tableType(tableType)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getLabel());
      System.out.println(result.getQuestion());
      System.out.println(result.getInUse());
      System.out.println(result.getExpr());
      System.out.println(result.getExprType());
      System.out.println(result.getType());
      System.out.println(result.getPlural());
      System.out.println(result.getValues());
      System.out.println(result.getDefaultValue());
      System.out.println(result.getOptions());
      System.out.println(result.getEntityType());
      System.out.println(result.getIsUnique());
      System.out.println(result.getIsRequired());
      System.out.println(result.getIsEffectiveDated());
      System.out.println(result.getAliases());
      System.out.println(result.getCalc());
      System.out.println(result.getClassification());
      System.out.println(result.getSensitive());
      System.out.println(result.getHideExpr());
      System.out.println(result.getExpireDays());
      System.out.println(result.getCategoryId());
      System.out.println(result.getCategoryIds());
      System.out.println(result.getStatus());
      System.out.println(result.getTableId());
      System.out.println(result.getTableName());
      System.out.println(result.getTableRef());
      System.out.println(result.getReadonly());
      System.out.println(result.getBuiltIn());
      System.out.println(result.getCanOverrideSensitivity());
      System.out.println(result.getPlaces());
      System.out.println(result.getOverrideRevert());
      System.out.println(result.getOverrideName());
      System.out.println(result.getHasSubfields());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#createNewField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Field> response = client
              .field
              .createNewField(name, label, type, entityType, sensitive, isUnique, isRequired, orgId)
              .description(description)
              .orgId(orgId)
              .question(question)
              .inUse(inUse)
              .expr(expr)
              .exprType(exprType)
              .plural(plural)
              .values(values)
              .defaultValue(defaultValue)
              .options(options)
              .hideExpr(hideExpr)
              .expireDays(expireDays)
              .status(status)
              .tableId(tableId)
              .tableRef(tableRef)
              .isEffectiveDated(isEffectiveDated)
              .dataFetchTypes(dataFetchTypes)
              .aliases(aliases)
              .calc(calc)
              .categoryId(categoryId)
              .classification(classification)
              .places(places)
              .tableType(tableType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#createNewField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **tableType** | **String**| table type to add the field to | [optional] |
| **createField** | [**CreateField**](CreateField.md)| Field data to create | [optional] |

### Return type

[**Field**](Field.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | org not found |  -  |

<a name="getAllPaginated"></a>
# **getAllPaginated**
> ResultsField getAllPaginated(orgId).from(from).limit(limit).ids(ids).table(table).tableType(tableType).form(form).builtin(builtin).includeTtst(includeTtst).execute();

Return all fields in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String from = "from_example"; // Field id to start paginating from
    Integer limit = 56; // Number of results to return
    String ids = "ids_example"; // Comma separated Field Ids to find
    String table = "table_example"; // Retrieve fields from a particular table (id or name); if not passed, returns non-table fields
    String tableType = "tableType_example"; // Retrieve fields from a particular table type; ignored if table not passed
    String form = "form_example"; // Retrieve fields relating to a particular form
    String builtin = "builtin_example"; // Include built-in (builtin), custom (custom) or all fields - defaults to custom
    Boolean includeTtst = true; // Include custom ttst fields - defaults to false
    try {
      ResultsField result = client
              .field
              .getAllPaginated(orgId)
              .from(from)
              .limit(limit)
              .ids(ids)
              .table(table)
              .tableType(tableType)
              .form(form)
              .builtin(builtin)
              .includeTtst(includeTtst)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getAllPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsField> response = client
              .field
              .getAllPaginated(orgId)
              .from(from)
              .limit(limit)
              .ids(ids)
              .table(table)
              .tableType(tableType)
              .form(form)
              .builtin(builtin)
              .includeTtst(includeTtst)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getAllPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **from** | **String**| Field id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **ids** | **String**| Comma separated Field Ids to find | [optional] |
| **table** | **String**| Retrieve fields from a particular table (id or name); if not passed, returns non-table fields | [optional] |
| **tableType** | **String**| Retrieve fields from a particular table type; ignored if table not passed | [optional] |
| **form** | **String**| Retrieve fields relating to a particular form | [optional] |
| **builtin** | **String**| Include built-in (builtin), custom (custom) or all fields - defaults to custom | [optional] |
| **includeTtst** | **Boolean**| Include custom ttst fields - defaults to false | [optional] |

### Return type

[**ResultsField**](ResultsField.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getBuiltInFields"></a>
# **getBuiltInFields**
> ResultsPartialField getBuiltInFields(orgId).execute();

Get built-in fields



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      ResultsPartialField result = client
              .field
              .getBuiltInFields(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getBuiltInFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsPartialField> response = client
              .field
              .getBuiltInFields(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getBuiltInFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |

### Return type

[**ResultsPartialField**](ResultsPartialField.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getById"></a>
# **getById**
> Field getById(orgId, fieldId).execute();

Return a particular field by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fieldId = "fieldId_example"; // Field id
    try {
      Field result = client
              .field
              .getById(orgId, fieldId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getLabel());
      System.out.println(result.getQuestion());
      System.out.println(result.getInUse());
      System.out.println(result.getExpr());
      System.out.println(result.getExprType());
      System.out.println(result.getType());
      System.out.println(result.getPlural());
      System.out.println(result.getValues());
      System.out.println(result.getDefaultValue());
      System.out.println(result.getOptions());
      System.out.println(result.getEntityType());
      System.out.println(result.getIsUnique());
      System.out.println(result.getIsRequired());
      System.out.println(result.getIsEffectiveDated());
      System.out.println(result.getAliases());
      System.out.println(result.getCalc());
      System.out.println(result.getClassification());
      System.out.println(result.getSensitive());
      System.out.println(result.getHideExpr());
      System.out.println(result.getExpireDays());
      System.out.println(result.getCategoryId());
      System.out.println(result.getCategoryIds());
      System.out.println(result.getStatus());
      System.out.println(result.getTableId());
      System.out.println(result.getTableName());
      System.out.println(result.getTableRef());
      System.out.println(result.getReadonly());
      System.out.println(result.getBuiltIn());
      System.out.println(result.getCanOverrideSensitivity());
      System.out.println(result.getPlaces());
      System.out.println(result.getOverrideRevert());
      System.out.println(result.getOverrideName());
      System.out.println(result.getHasSubfields());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Field> response = client
              .field
              .getById(orgId, fieldId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **fieldId** | **String**| Field id | |

### Return type

[**Field**](Field.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="getFieldsInCategory"></a>
# **getFieldsInCategory**
> ResultsField getFieldsInCategory(orgId, categoryId).execute();

Return fields in a particular category



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String categoryId = "categoryId_example"; // Category id
    try {
      ResultsField result = client
              .field
              .getFieldsInCategory(orgId, categoryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getFieldsInCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsField> response = client
              .field
              .getFieldsInCategory(orgId, categoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getFieldsInCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **categoryId** | **String**| Category id | |

### Return type

[**ResultsField**](ResultsField.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getUncategorizedFields"></a>
# **getUncategorizedFields**
> ResultsField getUncategorizedFields(orgId).execute();

Return uncategorized fields



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      ResultsField result = client
              .field
              .getUncategorizedFields(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getUncategorizedFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsField> response = client
              .field
              .getUncategorizedFields(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#getUncategorizedFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |

### Return type

[**ResultsField**](ResultsField.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="remove"></a>
# **remove**
> remove(orgId).requestBody(requestBody).execute();

Delete fields



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      client
              .field
              .remove(orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .field
              .remove(orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| Field ids | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(orgId, fieldId).execute();

Delete a field



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fieldId = "fieldId_example"; // Field id
    try {
      client
              .field
              .removeById(orgId, fieldId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .field
              .removeById(orgId, fieldId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **fieldId** | **String**| Field id | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="removeFieldOverrides"></a>
# **removeFieldOverrides**
> removeFieldOverrides(orgId).fieldRemoveOverrideRequest(fieldRemoveOverrideRequest).execute();

Remove overrides from fields



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Set<String> fieldIds = Arrays.asList(); // Field ids
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      client
              .field
              .removeFieldOverrides(fieldIds, orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#removeFieldOverrides");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .field
              .removeFieldOverrides(fieldIds, orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#removeFieldOverrides");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **fieldRemoveOverrideRequest** | [**FieldRemoveOverrideRequest**](FieldRemoveOverrideRequest.md)| Fields for which to remove overrides | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="removeFromCategories"></a>
# **removeFromCategories**
> removeFromCategories(orgId).fieldRemoveCategoryRequest(fieldRemoveCategoryRequest).execute();

Remove field from all associated categories



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Set<String> fieldIds = Arrays.asList(); // Field ids
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      client
              .field
              .removeFromCategories(fieldIds, orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#removeFromCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .field
              .removeFromCategories(fieldIds, orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#removeFromCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **fieldRemoveCategoryRequest** | [**FieldRemoveCategoryRequest**](FieldRemoveCategoryRequest.md)| Fields to set as uncategorized | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="updateExistingField"></a>
# **updateExistingField**
> updateExistingField(orgId, fieldId).updateField(updateField).execute();

Update an existing field



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fieldId = "fieldId_example"; // Field id
    String description = "description_example"; // description of field
    String name = "name_example"; // short field name
    String label = "label_example"; // human-readable full name of field
    String question = "question_example"; // human-readable question associated with field
    Boolean inUse = true; // disallow any updates to this Field (except for field.question string)
    String expr = "expr_example"; // calculated expression
    String exprType = "ADDRESS"; // the expected type of the evaluated expression
    String type = "ADDRESS"; // type of field
    String plural = "SINGLE"; // plural type of the field (either SINGLE, LIST, or SET)
    List<EnumValue> values = Arrays.asList(); // possible values (enum type only)
    Object defaultValue = null; // default value if field is not set
    Object options = null; // validation options
    String sensitive = "GLOBAL"; // sensitivity level of data
    Boolean hideExpr = true; // hide expression-derived values from non-sensitive users
    Integer expireDays = 56; // number of days after which the data becomes invalid
    String status = "ACTIVE"; // the status of the field
    TableRef tableRef = new TableRef();
    Boolean isUnique = true; // indicates that this field value is unique in conjunction with entityType PERSON or JOB
    Boolean isRequired = true; // indicates that this field value is required
    Boolean isEffectiveDated = true; // indicates that this field value is effective-dated
    Set<String> dataFetchTypes = Arrays.asList(); // set of data fetch types
    Set<String> aliases = Arrays.asList(); // set of aliases for this field
    String calc = "ADDRESS"; // unique ID for the function that runs to calculate the value of this field. For native fields only
    String categoryId = "categoryId_example"; // ID of the category to which this field belongs, if any
    String classification = "COMPOUND"; // indicates how this field is calculated (whether it's stored in the DB, evaluated through the expression service, or compound)
    Integer places = 56; // number of decimal places for money values
    try {
      client
              .field
              .updateExistingField(orgId, fieldId)
              .description(description)
              .name(name)
              .label(label)
              .question(question)
              .inUse(inUse)
              .expr(expr)
              .exprType(exprType)
              .type(type)
              .plural(plural)
              .values(values)
              .defaultValue(defaultValue)
              .options(options)
              .sensitive(sensitive)
              .hideExpr(hideExpr)
              .expireDays(expireDays)
              .status(status)
              .tableRef(tableRef)
              .isUnique(isUnique)
              .isRequired(isRequired)
              .isEffectiveDated(isEffectiveDated)
              .dataFetchTypes(dataFetchTypes)
              .aliases(aliases)
              .calc(calc)
              .categoryId(categoryId)
              .classification(classification)
              .places(places)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#updateExistingField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .field
              .updateExistingField(orgId, fieldId)
              .description(description)
              .name(name)
              .label(label)
              .question(question)
              .inUse(inUse)
              .expr(expr)
              .exprType(exprType)
              .type(type)
              .plural(plural)
              .values(values)
              .defaultValue(defaultValue)
              .options(options)
              .sensitive(sensitive)
              .hideExpr(hideExpr)
              .expireDays(expireDays)
              .status(status)
              .tableRef(tableRef)
              .isUnique(isUnique)
              .isRequired(isRequired)
              .isEffectiveDated(isEffectiveDated)
              .dataFetchTypes(dataFetchTypes)
              .aliases(aliases)
              .calc(calc)
              .categoryId(categoryId)
              .classification(classification)
              .places(places)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#updateExistingField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **fieldId** | **String**| Field id | |
| **updateField** | [**UpdateField**](UpdateField.md)| Field data to update | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="updateFieldDryRun"></a>
# **updateFieldDryRun**
> updateFieldDryRun(orgId, fieldId).updateField(updateField).execute();

Perform a dry-run of an update to an existing field that will require migrations



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fieldId = "fieldId_example"; // Field id
    String description = "description_example"; // description of field
    String name = "name_example"; // short field name
    String label = "label_example"; // human-readable full name of field
    String question = "question_example"; // human-readable question associated with field
    Boolean inUse = true; // disallow any updates to this Field (except for field.question string)
    String expr = "expr_example"; // calculated expression
    String exprType = "ADDRESS"; // the expected type of the evaluated expression
    String type = "ADDRESS"; // type of field
    String plural = "SINGLE"; // plural type of the field (either SINGLE, LIST, or SET)
    List<EnumValue> values = Arrays.asList(); // possible values (enum type only)
    Object defaultValue = null; // default value if field is not set
    Object options = null; // validation options
    String sensitive = "GLOBAL"; // sensitivity level of data
    Boolean hideExpr = true; // hide expression-derived values from non-sensitive users
    Integer expireDays = 56; // number of days after which the data becomes invalid
    String status = "ACTIVE"; // the status of the field
    TableRef tableRef = new TableRef();
    Boolean isUnique = true; // indicates that this field value is unique in conjunction with entityType PERSON or JOB
    Boolean isRequired = true; // indicates that this field value is required
    Boolean isEffectiveDated = true; // indicates that this field value is effective-dated
    Set<String> dataFetchTypes = Arrays.asList(); // set of data fetch types
    Set<String> aliases = Arrays.asList(); // set of aliases for this field
    String calc = "ADDRESS"; // unique ID for the function that runs to calculate the value of this field. For native fields only
    String categoryId = "categoryId_example"; // ID of the category to which this field belongs, if any
    String classification = "COMPOUND"; // indicates how this field is calculated (whether it's stored in the DB, evaluated through the expression service, or compound)
    Integer places = 56; // number of decimal places for money values
    try {
      client
              .field
              .updateFieldDryRun(orgId, fieldId)
              .description(description)
              .name(name)
              .label(label)
              .question(question)
              .inUse(inUse)
              .expr(expr)
              .exprType(exprType)
              .type(type)
              .plural(plural)
              .values(values)
              .defaultValue(defaultValue)
              .options(options)
              .sensitive(sensitive)
              .hideExpr(hideExpr)
              .expireDays(expireDays)
              .status(status)
              .tableRef(tableRef)
              .isUnique(isUnique)
              .isRequired(isRequired)
              .isEffectiveDated(isEffectiveDated)
              .dataFetchTypes(dataFetchTypes)
              .aliases(aliases)
              .calc(calc)
              .categoryId(categoryId)
              .classification(classification)
              .places(places)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#updateFieldDryRun");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .field
              .updateFieldDryRun(orgId, fieldId)
              .description(description)
              .name(name)
              .label(label)
              .question(question)
              .inUse(inUse)
              .expr(expr)
              .exprType(exprType)
              .type(type)
              .plural(plural)
              .values(values)
              .defaultValue(defaultValue)
              .options(options)
              .sensitive(sensitive)
              .hideExpr(hideExpr)
              .expireDays(expireDays)
              .status(status)
              .tableRef(tableRef)
              .isUnique(isUnique)
              .isRequired(isRequired)
              .isEffectiveDated(isEffectiveDated)
              .dataFetchTypes(dataFetchTypes)
              .aliases(aliases)
              .calc(calc)
              .categoryId(categoryId)
              .classification(classification)
              .places(places)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#updateFieldDryRun");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **fieldId** | **String**| Field id | |
| **updateField** | [**UpdateField**](UpdateField.md)| Field data to update | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="updateStatusForExistingFields"></a>
# **updateStatusForExistingFields**
> updateStatusForExistingFields(orgId).fieldStatusUpdateRequest(fieldStatusUpdateRequest).execute();

Update status for existing fields



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String updateStatus = "ACTIVE"; // New status to update
    List<String> fieldIds = Arrays.asList(); // Field ids to apply status to
    List<String> reservedFieldNames = Arrays.asList(); // Reserved field names to apply status to
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      client
              .field
              .updateStatusForExistingFields(updateStatus, fieldIds, reservedFieldNames, orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#updateStatusForExistingFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .field
              .updateStatusForExistingFields(updateStatus, fieldIds, reservedFieldNames, orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldApi#updateStatusForExistingFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **fieldStatusUpdateRequest** | [**FieldStatusUpdateRequest**](FieldStatusUpdateRequest.md)| Field data to update | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

