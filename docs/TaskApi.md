# TaskApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBulkTasks**](TaskApi.md#deleteBulkTasks) | **DELETE** /v1/org/{orgId}/task/bulk-delete | Bulk delete tasks |
| [**getAllTasks**](TaskApi.md#getAllTasks) | **GET** /v1/org/{orgId}/task | Return all existing tasks |
| [**getAssessmentTasksSummary**](TaskApi.md#getAssessmentTasksSummary) | **GET** /v1/org/{orgId}/task/summary/{assessmentId} | Return the tasks for a given assessment |
| [**getCurrentUserTasks**](TaskApi.md#getCurrentUserTasks) | **GET** /v1/org/{orgId}/task/me | Return the tasks for the current user |
| [**markAsSkipped**](TaskApi.md#markAsSkipped) | **PATCH** /v1/org/{orgId}/task/{taskId}/skip | Skip task |
| [**queryAssessmentTasks**](TaskApi.md#queryAssessmentTasks) | **GET** /v1/org/{orgId}/task/task | Query tasks for assessments in the organization |
| [**removeById**](TaskApi.md#removeById) | **DELETE** /v1/org/{orgId}/task/{taskId} | Delete task |
| [**removeFormFromAssessment**](TaskApi.md#removeFormFromAssessment) | **DELETE** /v1/org/{orgId}/task/{assessmentId}/{formId} | Delete task |
| [**sendReminderNotification**](TaskApi.md#sendReminderNotification) | **POST** /v1/org/{orgId}/task/remind | Send a reminder notification for a particular task |
| [**updateStatus**](TaskApi.md#updateStatus) | **PATCH** /v1/org/{orgId}/task/{taskId}/mark-done | Mark task done |


<a name="deleteBulkTasks"></a>
# **deleteBulkTasks**
> Process deleteBulkTasks(orgId).requestBody(requestBody).execute();

Bulk delete tasks



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
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
              .task
              .deleteBulkTasks(orgId)
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
      System.err.println("Exception when calling TaskApi#deleteBulkTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .task
              .deleteBulkTasks(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#deleteBulkTasks");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of task ids to delete | [optional] |

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
| **401** | unauthorized |  -  |

<a name="getAllTasks"></a>
# **getAllTasks**
> ResultsTask getAllTasks(orgId).userId(userId).assessmentId(assessmentId).status(status).type(type).entityId(entityId).targetId(targetId).limit(limit).execute();

Return all existing tasks



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String userId = "userId_example"; // Task User id
    String assessmentId = "assessmentId_example"; // Assessment id
    String status = "status_example"; // Task.Status. (PENDING/DONE)
    String type = "type_example"; // Task.Type of task (form)
    String entityId = "entityId_example"; // Entity Id
    String targetId = "targetId_example"; // Target Id
    Integer limit = 56; // Number of results to return
    try {
      ResultsTask result = client
              .task
              .getAllTasks(orgId)
              .userId(userId)
              .assessmentId(assessmentId)
              .status(status)
              .type(type)
              .entityId(entityId)
              .targetId(targetId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#getAllTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsTask> response = client
              .task
              .getAllTasks(orgId)
              .userId(userId)
              .assessmentId(assessmentId)
              .status(status)
              .type(type)
              .entityId(entityId)
              .targetId(targetId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#getAllTasks");
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
| **userId** | **String**| Task User id | [optional] |
| **assessmentId** | **String**| Assessment id | [optional] |
| **status** | **String**| Task.Status. (PENDING/DONE) | [optional] |
| **type** | **String**| Task.Type of task (form) | [optional] |
| **entityId** | **String**| Entity Id | [optional] |
| **targetId** | **String**| Target Id | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsTask**](ResultsTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | unauthorized |  -  |

<a name="getAssessmentTasksSummary"></a>
# **getAssessmentTasksSummary**
> getAssessmentTasksSummary(orgId, assessmentId).execute();

Return the tasks for a given assessment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String assessmentId = "assessmentId_example"; // Assessment id
    try {
      client
              .task
              .getAssessmentTasksSummary(orgId, assessmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#getAssessmentTasksSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .task
              .getAssessmentTasksSummary(orgId, assessmentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#getAssessmentTasksSummary");
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
| **assessmentId** | **String**| Assessment id | |

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
| **0** | unauthorized |  -  |

<a name="getCurrentUserTasks"></a>
# **getCurrentUserTasks**
> ResultsTask getCurrentUserTasks(orgId).assessmentId(assessmentId).status(status).type(type).entityId(entityId).targetId(targetId).limit(limit).execute();

Return the tasks for the current user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String assessmentId = "assessmentId_example"; // Assessment id
    String status = "status_example"; // Task.Status. (PENDING/ACTIVE)
    String type = "type_example"; // Task.Type of task (form)
    String entityId = "entityId_example"; // Entity Id
    String targetId = "targetId_example"; // Target Id
    Integer limit = 56; // Number of results to return
    try {
      ResultsTask result = client
              .task
              .getCurrentUserTasks(orgId)
              .assessmentId(assessmentId)
              .status(status)
              .type(type)
              .entityId(entityId)
              .targetId(targetId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#getCurrentUserTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsTask> response = client
              .task
              .getCurrentUserTasks(orgId)
              .assessmentId(assessmentId)
              .status(status)
              .type(type)
              .entityId(entityId)
              .targetId(targetId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#getCurrentUserTasks");
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
| **assessmentId** | **String**| Assessment id | [optional] |
| **status** | **String**| Task.Status. (PENDING/ACTIVE) | [optional] |
| **type** | **String**| Task.Type of task (form) | [optional] |
| **entityId** | **String**| Entity Id | [optional] |
| **targetId** | **String**| Target Id | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsTask**](ResultsTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | unauthorized |  -  |

<a name="markAsSkipped"></a>
# **markAsSkipped**
> markAsSkipped(orgId, taskId).execute();

Skip task



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String taskId = "taskId_example"; // Task id
    try {
      client
              .task
              .markAsSkipped(orgId, taskId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#markAsSkipped");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .task
              .markAsSkipped(orgId, taskId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#markAsSkipped");
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
| **taskId** | **String**| Task id | |

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
| **0** | unauthorized |  -  |

<a name="queryAssessmentTasks"></a>
# **queryAssessmentTasks**
> ResultsData queryAssessmentTasks(orgId).userId(userId).assessmentId(assessmentId).status(status).type(type).entityId(entityId).targetId(targetId).limit(limit).fields(fields).format(format).from(from).returnAccess(returnAccess).returnFormCompletionLinks(returnFormCompletionLinks).execute();

Query tasks for assessments in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String userId = "userId_example"; // Task User id
    String assessmentId = "assessmentId_example"; // Assessment id
    String status = "status_example"; // Task.Status. (PENDING/DONE)
    String type = "type_example"; // Task.Type. (FORM_SUBMIT/CHANGE_APPROVE)
    String entityId = "entityId_example"; // Entity Id
    String targetId = "targetId_example"; // Target Id
    Integer limit = 56; // Number of results to return
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String from = "from_example"; // Job id to start paginating from
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    Boolean returnFormCompletionLinks = true; // Return links that employees would use to complete a task if true else return links that direct to the form settings
    try {
      ResultsData result = client
              .task
              .queryAssessmentTasks(orgId)
              .userId(userId)
              .assessmentId(assessmentId)
              .status(status)
              .type(type)
              .entityId(entityId)
              .targetId(targetId)
              .limit(limit)
              .fields(fields)
              .format(format)
              .from(from)
              .returnAccess(returnAccess)
              .returnFormCompletionLinks(returnFormCompletionLinks)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#queryAssessmentTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .task
              .queryAssessmentTasks(orgId)
              .userId(userId)
              .assessmentId(assessmentId)
              .status(status)
              .type(type)
              .entityId(entityId)
              .targetId(targetId)
              .limit(limit)
              .fields(fields)
              .format(format)
              .from(from)
              .returnAccess(returnAccess)
              .returnFormCompletionLinks(returnFormCompletionLinks)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#queryAssessmentTasks");
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
| **userId** | **String**| Task User id | [optional] |
| **assessmentId** | **String**| Assessment id | [optional] |
| **status** | **String**| Task.Status. (PENDING/DONE) | [optional] |
| **type** | **String**| Task.Type. (FORM_SUBMIT/CHANGE_APPROVE) | [optional] |
| **entityId** | **String**| Entity Id | [optional] |
| **targetId** | **String**| Target Id | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **from** | **String**| Job id to start paginating from | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |
| **returnFormCompletionLinks** | **Boolean**| Return links that employees would use to complete a task if true else return links that direct to the form settings | [optional] |

### Return type

[**ResultsData**](ResultsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(orgId, taskId).execute();

Delete task



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String taskId = "taskId_example"; // Task id
    try {
      client
              .task
              .removeById(orgId, taskId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .task
              .removeById(orgId, taskId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#removeById");
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
| **taskId** | **String**| Task id | |

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
| **0** | unauthorized |  -  |

<a name="removeFormFromAssessment"></a>
# **removeFormFromAssessment**
> removeFormFromAssessment(orgId, assessmentId, formId).execute();

Delete task



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String assessmentId = "assessmentId_example"; // Assessment id
    String formId = "formId_example"; // Form id
    try {
      client
              .task
              .removeFormFromAssessment(orgId, assessmentId, formId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#removeFormFromAssessment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .task
              .removeFormFromAssessment(orgId, assessmentId, formId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#removeFormFromAssessment");
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
| **assessmentId** | **String**| Assessment id | |
| **formId** | **String**| Form id | |

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
| **0** | unauthorized |  -  |

<a name="sendReminderNotification"></a>
# **sendReminderNotification**
> sendReminderNotification(orgId).taskRemindRequest(taskRemindRequest).execute();

Send a reminder notification for a particular task



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    List<String> taskIds = Arrays.asList();
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String message = "message_example";
    try {
      client
              .task
              .sendReminderNotification(taskIds, orgId)
              .message(message)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#sendReminderNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .task
              .sendReminderNotification(taskIds, orgId)
              .message(message)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#sendReminderNotification");
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
| **taskRemindRequest** | [**TaskRemindRequest**](TaskRemindRequest.md)| Request body | [optional] |

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
| **0** | unauthorized |  -  |

<a name="updateStatus"></a>
# **updateStatus**
> updateStatus(orgId, taskId).execute();

Mark task done



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String taskId = "taskId_example"; // Task id
    try {
      client
              .task
              .updateStatus(orgId, taskId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#updateStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .task
              .updateStatus(orgId, taskId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#updateStatus");
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
| **taskId** | **String**| Task id | |

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
| **0** | unauthorized |  -  |

