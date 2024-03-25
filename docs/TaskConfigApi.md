# TaskConfigApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewConfig**](TaskConfigApi.md#createNewConfig) | **POST** /v1/org/{orgId}/task-config | Create a new task config |
| [**getAllConfigs**](TaskConfigApi.md#getAllConfigs) | **GET** /v1/org/{orgId}/task-config | Get all task configs for an org |
| [**getSpecificConfig**](TaskConfigApi.md#getSpecificConfig) | **GET** /v1/org/{orgId}/task-config/{id} | Get a specific task config |


<a name="createNewConfig"></a>
# **createNewConfig**
> TaskConfig createNewConfig(orgId).createTaskConfig(createTaskConfig).execute();

Create a new task config



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String entityId = "entityId_example"; // the primary entity being referenced by the task config
    String type = "FORM_SUBMIT"; // type of task generated by the task config
    String pastDueAction = "NONE"; // sets pastDueAction on the task when it's generated
    String orgId = "orgId_example"; // Org identifier (either id or slug
    String description = "description_example"; // description for all tasks associated with the config that should be used in notifications
    String assessmentId = "assessmentId_example"; // parent assessment id that this task config belongs to
    String parentEntityId = "parentEntityId_example"; // parent entity id that this task config belongs to, should be used with entityId
    DueDate dueDate = new DueDate();
    Boolean isSkippable = true; // sets isSkippable on the task
    String label = "label_example"; // human-readable label that should be used for all tasks associated with the config as the task name
    String deleteId = "deleteId_example"; // deleted by user id
    String deleteAt = "deleteAt_example"; // deleted timestamp
    try {
      TaskConfig result = client
              .taskConfig
              .createNewConfig(entityId, type, pastDueAction, orgId)
              .description(description)
              .assessmentId(assessmentId)
              .parentEntityId(parentEntityId)
              .dueDate(dueDate)
              .isSkippable(isSkippable)
              .label(label)
              .deleteId(deleteId)
              .deleteAt(deleteAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getAssessmentId());
      System.out.println(result.getParentEntityId());
      System.out.println(result.getEntityId());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getDueDate());
      System.out.println(result.getPastDueAction());
      System.out.println(result.getIsSkippable());
      System.out.println(result.getLabel());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskConfigApi#createNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskConfig> response = client
              .taskConfig
              .createNewConfig(entityId, type, pastDueAction, orgId)
              .description(description)
              .assessmentId(assessmentId)
              .parentEntityId(parentEntityId)
              .dueDate(dueDate)
              .isSkippable(isSkippable)
              .label(label)
              .deleteId(deleteId)
              .deleteAt(deleteAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskConfigApi#createNewConfig");
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
| **orgId** | **String**| Org identifier (either id or slug | |
| **createTaskConfig** | [**CreateTaskConfig**](CreateTaskConfig.md)| Task config to create | [optional] |

### Return type

[**TaskConfig**](TaskConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getAllConfigs"></a>
# **getAllConfigs**
> ResultsData getAllConfigs(orgId).from(from).parentEntityId(parentEntityId).assessmentId(assessmentId).entityId(entityId).limit(limit).execute();

Get all task configs for an org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String from = "from_example"; // TaskConfig id to start paginating from
    String parentEntityId = "parentEntityId_example"; // ParentEntityId to query for
    String assessmentId = "assessmentId_example"; // AssessmentId to query for
    String entityId = "entityId_example"; // EntityId to query for
    Integer limit = 56; // Number of results to return
    try {
      ResultsData result = client
              .taskConfig
              .getAllConfigs(orgId)
              .from(from)
              .parentEntityId(parentEntityId)
              .assessmentId(assessmentId)
              .entityId(entityId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskConfigApi#getAllConfigs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .taskConfig
              .getAllConfigs(orgId)
              .from(from)
              .parentEntityId(parentEntityId)
              .assessmentId(assessmentId)
              .entityId(entityId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskConfigApi#getAllConfigs");
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
| **from** | **String**| TaskConfig id to start paginating from | [optional] |
| **parentEntityId** | **String**| ParentEntityId to query for | [optional] |
| **assessmentId** | **String**| AssessmentId to query for | [optional] |
| **entityId** | **String**| EntityId to query for | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getSpecificConfig"></a>
# **getSpecificConfig**
> TaskConfig getSpecificConfig(orgId, id).execute();

Get a specific task config



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String id = "id_example"; // ID of the desired task config
    try {
      TaskConfig result = client
              .taskConfig
              .getSpecificConfig(orgId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getAssessmentId());
      System.out.println(result.getParentEntityId());
      System.out.println(result.getEntityId());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getDueDate());
      System.out.println(result.getPastDueAction());
      System.out.println(result.getIsSkippable());
      System.out.println(result.getLabel());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskConfigApi#getSpecificConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskConfig> response = client
              .taskConfig
              .getSpecificConfig(orgId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskConfigApi#getSpecificConfig");
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
| **id** | **String**| ID of the desired task config | |

### Return type

[**TaskConfig**](TaskConfig.md)

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
