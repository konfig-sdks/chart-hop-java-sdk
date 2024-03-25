# ScenarioApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustDates**](ScenarioApi.md#adjustDates) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/dates | Adjust the dates of the changes in a scenario |
| [**bulkArchiveScenarios**](ScenarioApi.md#bulkArchiveScenarios) | **POST** /v1/org/{orgId}/scenario/bulk/archive | Archive a set of scenarios |
| [**combineScenarios**](ScenarioApi.md#combineScenarios) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/combine | Combine multiple scenarios into another scenario |
| [**createNew**](ScenarioApi.md#createNew) | **POST** /v1/org/{orgId}/scenario | Create a scenario |
| [**deleteBulkScenarios**](ScenarioApi.md#deleteBulkScenarios) | **POST** /v1/org/{orgId}/scenario/bulk/delete | Delete a set of scenarios |
| [**getById**](ScenarioApi.md#getById) | **GET** /v1/org/{orgId}/scenario/{scenarioId} | Return a particular scenario by id |
| [**listPaginatedScenarios**](ScenarioApi.md#listPaginatedScenarios) | **GET** /v1/org/{orgId}/scenario | Return all scenarios in the organization paginated |
| [**manuallyRecalculateMetadata**](ScenarioApi.md#manuallyRecalculateMetadata) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/recalculate-metadata | Manually recalculate a scenario&#39;s metadata |
| [**mergeIntoPrimaryTimeline**](ScenarioApi.md#mergeIntoPrimaryTimeline) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/merge | Merge a scenario into the primary timeline |
| [**removeById**](ScenarioApi.md#removeById) | **DELETE** /v1/org/{orgId}/scenario/{scenarioId} | Delete a scenario |
| [**unarchiveSetOfScenarios**](ScenarioApi.md#unarchiveSetOfScenarios) | **POST** /v1/org/{orgId}/scenario/bulk/unarchive | Unarchive a set of scenarios |
| [**updateScenarioChange**](ScenarioApi.md#updateScenarioChange) | **PATCH** /v1/org/{orgId}/scenario/{scenarioId} | Update an existing scenario |
| [**updateSharedViewConfig**](ScenarioApi.md#updateSharedViewConfig) | **POST** /v1/org/{orgId}/scenario/{scenarioId}/update-shared-view | Update a scenario view config |


<a name="adjustDates"></a>
# **adjustDates**
> Process adjustDates(orgId, scenarioId).adjustScenarioDateRequest(adjustScenarioDateRequest).execute();

Adjust the dates of the changes in a scenario



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    LocalDate date = LocalDate.now(); // date to use as new start date
    Integer days = 56; // number of days to adjust forward
    try {
      Process result = client
              .scenario
              .adjustDates(orgId, scenarioId)
              .date(date)
              .days(days)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#adjustDates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .scenario
              .adjustDates(orgId, scenarioId)
              .date(date)
              .days(days)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#adjustDates");
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
| **scenarioId** | **String**| Scenario id | |
| **adjustScenarioDateRequest** | [**AdjustScenarioDateRequest**](AdjustScenarioDateRequest.md)|  | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="bulkArchiveScenarios"></a>
# **bulkArchiveScenarios**
> Process bulkArchiveScenarios(orgId).requestBody(requestBody).execute();

Archive a set of scenarios



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
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
      Process result = client
              .scenario
              .bulkArchiveScenarios(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#bulkArchiveScenarios");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .scenario
              .bulkArchiveScenarios(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#bulkArchiveScenarios");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of scenario ids to archive | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="combineScenarios"></a>
# **combineScenarios**
> Process combineScenarios(orgId, scenarioId).combineScenarioRequest(combineScenarioRequest).execute();

Combine multiple scenarios into another scenario



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Set<String> scenarioIds = Arrays.asList(); // scenarios to combine
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id to combine the other scenarios into
    Boolean copyOnly = true;
    Boolean useScenarioDateForChanges = true;
    try {
      Process result = client
              .scenario
              .combineScenarios(scenarioIds, orgId, scenarioId)
              .copyOnly(copyOnly)
              .useScenarioDateForChanges(useScenarioDateForChanges)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#combineScenarios");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .scenario
              .combineScenarios(scenarioIds, orgId, scenarioId)
              .copyOnly(copyOnly)
              .useScenarioDateForChanges(useScenarioDateForChanges)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#combineScenarios");
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
| **scenarioId** | **String**| Scenario id to combine the other scenarios into | |
| **combineScenarioRequest** | [**CombineScenarioRequest**](CombineScenarioRequest.md)|  | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="createNew"></a>
# **createNew**
> Scenario createNew(orgId).silent(silent).skipChangeCreation(skipChangeCreation).createScenario(createScenario).execute();

Create a scenario



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // scenario name
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String description = "description_example"; // scenario description
    String startDate = "startDate_example"; // date that this scenario diverges from primary
    String status = "OPEN"; // status of scenario
    List<ShareAccess> shareAccess = Arrays.asList(); // users who are specifically granted permission to this scenario
    String type = "GENERAL"; // Type of scenario to be created
    String startDateFixed = "FIXED"; // whether or not the start date should stay fixed in time, or update to today's date as time passes
    String query = "query_example"; // Query for selecting which people/jobs are initially included in the scenario (only applies to promotion scenarios)
    Set<String> validJobIdSet = Arrays.asList(); // This scenario changes are restricted to the following jobIds
    String entityId = "entityId_example"; // The entity this scenario is associated with
    String entityType = "COMP_REVIEW"; // The type of entity associated with this scenario
    Set<ScenarioSharedViewConfig> sharedViewConfig = Arrays.asList(); // View configurations associated with this scenario
    Money budget = new Money();
    String costCalc = "costCalc_example"; // CQL used to calculate the budget allocation in the scenario
    Boolean silent = true; // Suppress notification emails
    Boolean skipChangeCreation = true; // Skip over change creation for PROMOTION scenarios
    try {
      Scenario result = client
              .scenario
              .createNew(name, orgId)
              .description(description)
              .startDate(startDate)
              .status(status)
              .shareAccess(shareAccess)
              .type(type)
              .startDateFixed(startDateFixed)
              .query(query)
              .validJobIdSet(validJobIdSet)
              .entityId(entityId)
              .entityType(entityType)
              .sharedViewConfig(sharedViewConfig)
              .budget(budget)
              .costCalc(costCalc)
              .silent(silent)
              .skipChangeCreation(skipChangeCreation)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getStartDate());
      System.out.println(result.getStatus());
      System.out.println(result.getShareAccess());
      System.out.println(result.getCost());
      System.out.println(result.getChangeCount());
      System.out.println(result.getChangeCounts());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
      System.out.println(result.getMergeId());
      System.out.println(result.getMergeAt());
      System.out.println(result.getCalcStartAt());
      System.out.println(result.getCalcEndAt());
      System.out.println(result.getChangeAt());
      System.out.println(result.getChangeId());
      System.out.println(result.getType());
      System.out.println(result.getStartDateFixed());
      System.out.println(result.getQuery());
      System.out.println(result.getValidJobIdSet());
      System.out.println(result.getApprovalRequestId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getSharedViewConfig());
      System.out.println(result.getBudget());
      System.out.println(result.getCostCalc());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Scenario> response = client
              .scenario
              .createNew(name, orgId)
              .description(description)
              .startDate(startDate)
              .status(status)
              .shareAccess(shareAccess)
              .type(type)
              .startDateFixed(startDateFixed)
              .query(query)
              .validJobIdSet(validJobIdSet)
              .entityId(entityId)
              .entityType(entityType)
              .sharedViewConfig(sharedViewConfig)
              .budget(budget)
              .costCalc(costCalc)
              .silent(silent)
              .skipChangeCreation(skipChangeCreation)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#createNew");
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
| **silent** | **Boolean**| Suppress notification emails | [optional] |
| **skipChangeCreation** | **Boolean**| Skip over change creation for PROMOTION scenarios | [optional] |
| **createScenario** | [**CreateScenario**](CreateScenario.md)| Scenario data to create | [optional] |

### Return type

[**Scenario**](Scenario.md)

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

<a name="deleteBulkScenarios"></a>
# **deleteBulkScenarios**
> Process deleteBulkScenarios(orgId).requestBody(requestBody).execute();

Delete a set of scenarios



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
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
      Process result = client
              .scenario
              .deleteBulkScenarios(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#deleteBulkScenarios");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .scenario
              .deleteBulkScenarios(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#deleteBulkScenarios");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of scenario ids to delete | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="getById"></a>
# **getById**
> Scenario getById(orgId, scenarioId).execute();

Return a particular scenario by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    try {
      Scenario result = client
              .scenario
              .getById(orgId, scenarioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getStartDate());
      System.out.println(result.getStatus());
      System.out.println(result.getShareAccess());
      System.out.println(result.getCost());
      System.out.println(result.getChangeCount());
      System.out.println(result.getChangeCounts());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
      System.out.println(result.getMergeId());
      System.out.println(result.getMergeAt());
      System.out.println(result.getCalcStartAt());
      System.out.println(result.getCalcEndAt());
      System.out.println(result.getChangeAt());
      System.out.println(result.getChangeId());
      System.out.println(result.getType());
      System.out.println(result.getStartDateFixed());
      System.out.println(result.getQuery());
      System.out.println(result.getValidJobIdSet());
      System.out.println(result.getApprovalRequestId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getSharedViewConfig());
      System.out.println(result.getBudget());
      System.out.println(result.getCostCalc());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Scenario> response = client
              .scenario
              .getById(orgId, scenarioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#getById");
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
| **scenarioId** | **String**| Scenario id | |

### Return type

[**Scenario**](Scenario.md)

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

<a name="listPaginatedScenarios"></a>
# **listPaginatedScenarios**
> ResultsScenario listPaginatedScenarios(orgId).from(from).status(status).limit(limit).returnAccess(returnAccess).execute();

Return all scenarios in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String from = "from_example"; // Scenario id to start paginating from
    String status = "OPEN"; // Scenario status to filter by
    Integer limit = 56; // Number of results to return
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsScenario result = client
              .scenario
              .listPaginatedScenarios(orgId)
              .from(from)
              .status(status)
              .limit(limit)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#listPaginatedScenarios");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsScenario> response = client
              .scenario
              .listPaginatedScenarios(orgId)
              .from(from)
              .status(status)
              .limit(limit)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#listPaginatedScenarios");
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
| **from** | **String**| Scenario id to start paginating from | [optional] |
| **status** | **String**| Scenario status to filter by | [optional] [enum: OPEN, INACTIVE, MERGED, DRAFT, ARCHIVED] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ResultsScenario**](ResultsScenario.md)

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

<a name="manuallyRecalculateMetadata"></a>
# **manuallyRecalculateMetadata**
> ScenarioMetadata manuallyRecalculateMetadata(orgId, scenarioId).execute();

Manually recalculate a scenario&#39;s metadata



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    try {
      ScenarioMetadata result = client
              .scenario
              .manuallyRecalculateMetadata(orgId, scenarioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getScenarioId());
      System.out.println(result.getChangeCount());
      System.out.println(result.getJobCount());
      System.out.println(result.getAccess());
      System.out.println(result.getCanChange());
      System.out.println(result.getCost());
      System.out.println(result.getCalcEndAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#manuallyRecalculateMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScenarioMetadata> response = client
              .scenario
              .manuallyRecalculateMetadata(orgId, scenarioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#manuallyRecalculateMetadata");
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
| **scenarioId** | **String**| Scenario id | |

### Return type

[**ScenarioMetadata**](ScenarioMetadata.md)

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

<a name="mergeIntoPrimaryTimeline"></a>
# **mergeIntoPrimaryTimeline**
> Process mergeIntoPrimaryTimeline(orgId, scenarioId).skipErrors(skipErrors).execute();

Merge a scenario into the primary timeline



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id to merge
    Boolean skipErrors = true; // If passed, will skip any changes that fail validation
    try {
      Process result = client
              .scenario
              .mergeIntoPrimaryTimeline(orgId, scenarioId)
              .skipErrors(skipErrors)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#mergeIntoPrimaryTimeline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .scenario
              .mergeIntoPrimaryTimeline(orgId, scenarioId)
              .skipErrors(skipErrors)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#mergeIntoPrimaryTimeline");
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
| **scenarioId** | **String**| Scenario id to merge | |
| **skipErrors** | **Boolean**| If passed, will skip any changes that fail validation | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(orgId, scenarioId).execute();

Delete a scenario



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    try {
      client
              .scenario
              .removeById(orgId, scenarioId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .scenario
              .removeById(orgId, scenarioId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#removeById");
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
| **scenarioId** | **String**| Scenario id | |

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

<a name="unarchiveSetOfScenarios"></a>
# **unarchiveSetOfScenarios**
> Process unarchiveSetOfScenarios(orgId).requestBody(requestBody).execute();

Unarchive a set of scenarios



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
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
      Process result = client
              .scenario
              .unarchiveSetOfScenarios(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#unarchiveSetOfScenarios");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .scenario
              .unarchiveSetOfScenarios(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#unarchiveSetOfScenarios");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of scenario ids to unarchive | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="updateScenarioChange"></a>
# **updateScenarioChange**
> updateScenarioChange(orgId, scenarioId).silent(silent).updateScenario(updateScenario).execute();

Update an existing scenario



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    String description = "description_example"; // scenario description
    String name = "name_example"; // scenario name
    String startDate = "startDate_example"; // date that this scenario diverges from primary
    String status = "OPEN"; // status of scenario
    List<ShareAccess> shareAccess = Arrays.asList(); // users who are specifically granted permission to this scenario
    String startDateFixed = "FIXED"; // whether or not the start date should stay fixed in time, or update to today's date as time passes
    Set<String> validJobIdSet = Arrays.asList(); // This scenario changes are restricted to the following jobIds
    String entityId = "entityId_example"; // The entity this scenario is associated with
    String entityType = "COMP_REVIEW"; // The type of entity associated with this scenario
    Set<ScenarioSharedViewConfig> sharedViewConfig = Arrays.asList(); // View configurations associated with this scenario
    Money budget = new Money();
    String costCalc = "costCalc_example"; // CQL used to calculate the budget allocation in the scenario
    Boolean silent = true; // Suppress notification emails
    try {
      client
              .scenario
              .updateScenarioChange(orgId, scenarioId)
              .description(description)
              .name(name)
              .startDate(startDate)
              .status(status)
              .shareAccess(shareAccess)
              .startDateFixed(startDateFixed)
              .validJobIdSet(validJobIdSet)
              .entityId(entityId)
              .entityType(entityType)
              .sharedViewConfig(sharedViewConfig)
              .budget(budget)
              .costCalc(costCalc)
              .silent(silent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#updateScenarioChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .scenario
              .updateScenarioChange(orgId, scenarioId)
              .description(description)
              .name(name)
              .startDate(startDate)
              .status(status)
              .shareAccess(shareAccess)
              .startDateFixed(startDateFixed)
              .validJobIdSet(validJobIdSet)
              .entityId(entityId)
              .entityType(entityType)
              .sharedViewConfig(sharedViewConfig)
              .budget(budget)
              .costCalc(costCalc)
              .silent(silent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#updateScenarioChange");
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
| **scenarioId** | **String**| Scenario id | |
| **silent** | **Boolean**| Suppress notification emails | [optional] |
| **updateScenario** | [**UpdateScenario**](UpdateScenario.md)| Scenario data to update | [optional] |

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

<a name="updateSharedViewConfig"></a>
# **updateSharedViewConfig**
> updateSharedViewConfig(orgId, scenarioId).scenarioSharedViewConfig(scenarioSharedViewConfig).execute();

Update a scenario view config



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScenarioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    List<String> customColumnNames = Arrays.asList(); // list of column names to display
    Map<String, Integer> columnWidths = new HashMap(); // map of column names to widths
    String type = "ALL_CHANGES_GROUPED"; // type of view
    String updateId = "updateId_example"; // update id
    Long updateAt = 56L; // update at
    try {
      client
              .scenario
              .updateSharedViewConfig(orgId, scenarioId)
              .customColumnNames(customColumnNames)
              .columnWidths(columnWidths)
              .type(type)
              .updateId(updateId)
              .updateAt(updateAt)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#updateSharedViewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .scenario
              .updateSharedViewConfig(orgId, scenarioId)
              .customColumnNames(customColumnNames)
              .columnWidths(columnWidths)
              .type(type)
              .updateId(updateId)
              .updateAt(updateAt)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#updateSharedViewConfig");
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
| **scenarioId** | **String**| Scenario id | |
| **scenarioSharedViewConfig** | [**ScenarioSharedViewConfig**](ScenarioSharedViewConfig.md)|  | [optional] |

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

