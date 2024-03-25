# AssessmentApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkDelete**](AssessmentApi.md#bulkDelete) | **POST** /v1/org/{orgId}/assessment/bulk/delete | Delete a set of assessments |
| [**bulkDuplicateAssessments**](AssessmentApi.md#bulkDuplicateAssessments) | **POST** /v1/org/{orgId}/assessment/bulk/duplicate | Duplicate a set of assessments |
| [**completeAssessment**](AssessmentApi.md#completeAssessment) | **POST** /v1/org/{orgId}/assessment/{assessmentId}/complete | Complete a assessment |
| [**createNewAssessment**](AssessmentApi.md#createNewAssessment) | **POST** /v1/org/{orgId}/assessment | Create a assessment |
| [**expireFormTasks**](AssessmentApi.md#expireFormTasks) | **POST** /v1/org/{orgId}/assessment/{assessmentId}/form/{formId}/expire | Expire all pending tasks for a form of an assessment |
| [**getAllPaginated**](AssessmentApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/assessment | Return all assessments in the organization paginated |
| [**getById**](AssessmentApi.md#getById) | **GET** /v1/org/{orgId}/assessment/{assessmentId} | Return a particular assessment by id |
| [**reactivateAssessment**](AssessmentApi.md#reactivateAssessment) | **POST** /v1/org/{orgId}/assessment/{assessmentId}/reactivate | Reactivate a assessment |
| [**removeById**](AssessmentApi.md#removeById) | **DELETE** /v1/org/{orgId}/assessment/{assessmentId} | Delete a assessment |
| [**updateAssessmentTypes**](AssessmentApi.md#updateAssessmentTypes) | **POST** /v1/org/{orgId}/assessment/bulk/move | Update the types of a set of assessments |
| [**updateExistingAssessment**](AssessmentApi.md#updateExistingAssessment) | **PATCH** /v1/org/{orgId}/assessment/{assessmentId} | Update an existing assessment |


<a name="bulkDelete"></a>
# **bulkDelete**
> Process bulkDelete(orgId).requestBody(requestBody).execute();

Delete a set of assessments



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
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
              .assessment
              .bulkDelete(orgId)
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
      System.err.println("Exception when calling AssessmentApi#bulkDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .assessment
              .bulkDelete(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#bulkDelete");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of assessment ids to delete | [optional] |

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

<a name="bulkDuplicateAssessments"></a>
# **bulkDuplicateAssessments**
> Process bulkDuplicateAssessments(orgId).requestBody(requestBody).execute();

Duplicate a set of assessments



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
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
              .assessment
              .bulkDuplicateAssessments(orgId)
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
      System.err.println("Exception when calling AssessmentApi#bulkDuplicateAssessments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .assessment
              .bulkDuplicateAssessments(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#bulkDuplicateAssessments");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of assessment ids to duplicate | [optional] |

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

<a name="completeAssessment"></a>
# **completeAssessment**
> Assessment completeAssessment(orgId, assessmentId).execute();

Complete a assessment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
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
      Assessment result = client
              .assessment
              .completeAssessment(orgId, assessmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getFields());
      System.out.println(result.getShareAccess());
      System.out.println(result.getSensitive());
      System.out.println(result.getColor());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getStatus());
      System.out.println(result.getDoneAt());
      System.out.println(result.getTaskCount());
      System.out.println(result.getTaskDoneCount());
      System.out.println(result.getPeopleIncludedCount());
      System.out.println(result.getQuery());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#completeAssessment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Assessment> response = client
              .assessment
              .completeAssessment(orgId, assessmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#completeAssessment");
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

[**Assessment**](Assessment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | org not found |  -  |

<a name="createNewAssessment"></a>
# **createNewAssessment**
> Assessment createNewAssessment(orgId).createAssessment(createAssessment).execute();

Create a assessment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // human-readable label of assessment
    String type = "REVIEW"; // type of assessment
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String slug = "slug_example"; // unique slug of assessment
    Object fields = null; // assessment fields (description)
    List<ShareAccess> shareAccess = Arrays.asList(); // users who have been granted access to this assessment
    String sensitive = "GLOBAL"; // view sensitivity of this assessment
    String color = "color_example"; // color of assessment
    LocalDate startDate = LocalDate.now(); // Date this assessment begins. In the context of REVIEW goals, the date the review cycle begins.
    LocalDate endDate = LocalDate.now(); // Date this assessment ends, or is completed. In the context of REVIEW assessment, the date the review cycle ends.
    String status = "DRAFT"; // status of this assessment - DRAFT, ACTIVE, DONE
    String doneAt = "doneAt_example"; // timestamp when the status of this assessment was set to done
    Integer taskCount = 56; // number of tasks associated with this assessment
    Integer taskDoneCount = 56; // number of tasks associated with this assessment that are done
    Integer peopleIncludedCount = 56; // number of people included in this assessment
    String query = "query_example"; // Query for which people/jobs can be included in the review.
    try {
      Assessment result = client
              .assessment
              .createNewAssessment(label, type, orgId)
              .slug(slug)
              .fields(fields)
              .shareAccess(shareAccess)
              .sensitive(sensitive)
              .color(color)
              .startDate(startDate)
              .endDate(endDate)
              .status(status)
              .doneAt(doneAt)
              .taskCount(taskCount)
              .taskDoneCount(taskDoneCount)
              .peopleIncludedCount(peopleIncludedCount)
              .query(query)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getFields());
      System.out.println(result.getShareAccess());
      System.out.println(result.getSensitive());
      System.out.println(result.getColor());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getStatus());
      System.out.println(result.getDoneAt());
      System.out.println(result.getTaskCount());
      System.out.println(result.getTaskDoneCount());
      System.out.println(result.getPeopleIncludedCount());
      System.out.println(result.getQuery());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#createNewAssessment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Assessment> response = client
              .assessment
              .createNewAssessment(label, type, orgId)
              .slug(slug)
              .fields(fields)
              .shareAccess(shareAccess)
              .sensitive(sensitive)
              .color(color)
              .startDate(startDate)
              .endDate(endDate)
              .status(status)
              .doneAt(doneAt)
              .taskCount(taskCount)
              .taskDoneCount(taskDoneCount)
              .peopleIncludedCount(peopleIncludedCount)
              .query(query)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#createNewAssessment");
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
| **createAssessment** | [**CreateAssessment**](CreateAssessment.md)| Assessment data to create | [optional] |

### Return type

[**Assessment**](Assessment.md)

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

<a name="expireFormTasks"></a>
# **expireFormTasks**
> Process expireFormTasks(orgId, assessmentId, formId).execute();

Expire all pending tasks for a form of an assessment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
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
      Process result = client
              .assessment
              .expireFormTasks(orgId, assessmentId, formId)
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
      System.err.println("Exception when calling AssessmentApi#expireFormTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .assessment
              .expireFormTasks(orgId, assessmentId, formId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#expireFormTasks");
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
| **404** | org not found |  -  |

<a name="getAllPaginated"></a>
# **getAllPaginated**
> ResultsAssessment getAllPaginated(orgId).type(type).from(from).limit(limit).ids(ids).returnAccess(returnAccess).execute();

Return all assessments in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "REVIEW"; // Type of assessment to filter by
    String from = "from_example"; // Assessment id to start paginating from
    Integer limit = 56; // Number of results to return
    String ids = "ids_example"; // List of ids to filter by
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsAssessment result = client
              .assessment
              .getAllPaginated(orgId)
              .type(type)
              .from(from)
              .limit(limit)
              .ids(ids)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#getAllPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsAssessment> response = client
              .assessment
              .getAllPaginated(orgId)
              .type(type)
              .from(from)
              .limit(limit)
              .ids(ids)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#getAllPaginated");
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
| **type** | **String**| Type of assessment to filter by | [optional] [enum: REVIEW, COMP_REVIEW, SURVEY] |
| **from** | **String**| Assessment id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **ids** | **String**| List of ids to filter by | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ResultsAssessment**](ResultsAssessment.md)

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
> Assessment getById(orgId, assessmentId).execute();

Return a particular assessment by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
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
      Assessment result = client
              .assessment
              .getById(orgId, assessmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getFields());
      System.out.println(result.getShareAccess());
      System.out.println(result.getSensitive());
      System.out.println(result.getColor());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getStatus());
      System.out.println(result.getDoneAt());
      System.out.println(result.getTaskCount());
      System.out.println(result.getTaskDoneCount());
      System.out.println(result.getPeopleIncludedCount());
      System.out.println(result.getQuery());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Assessment> response = client
              .assessment
              .getById(orgId, assessmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#getById");
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

[**Assessment**](Assessment.md)

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

<a name="reactivateAssessment"></a>
# **reactivateAssessment**
> Assessment reactivateAssessment(orgId, assessmentId).execute();

Reactivate a assessment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
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
      Assessment result = client
              .assessment
              .reactivateAssessment(orgId, assessmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getFields());
      System.out.println(result.getShareAccess());
      System.out.println(result.getSensitive());
      System.out.println(result.getColor());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getStatus());
      System.out.println(result.getDoneAt());
      System.out.println(result.getTaskCount());
      System.out.println(result.getTaskDoneCount());
      System.out.println(result.getPeopleIncludedCount());
      System.out.println(result.getQuery());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#reactivateAssessment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Assessment> response = client
              .assessment
              .reactivateAssessment(orgId, assessmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#reactivateAssessment");
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

[**Assessment**](Assessment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | org not found |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(orgId, assessmentId).execute();

Delete a assessment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
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
              .assessment
              .removeById(orgId, assessmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .assessment
              .removeById(orgId, assessmentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#removeById");
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
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="updateAssessmentTypes"></a>
# **updateAssessmentTypes**
> Process updateAssessmentTypes(orgId).bulkChangeAssessmentTypesBody(bulkChangeAssessmentTypesBody).execute();

Update the types of a set of assessments



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    List<String> ids = Arrays.asList();
    String type = "REVIEW";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      Process result = client
              .assessment
              .updateAssessmentTypes(ids, type, orgId)
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
      System.err.println("Exception when calling AssessmentApi#updateAssessmentTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .assessment
              .updateAssessmentTypes(ids, type, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#updateAssessmentTypes");
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
| **bulkChangeAssessmentTypesBody** | [**BulkChangeAssessmentTypesBody**](BulkChangeAssessmentTypesBody.md)| List of assessment ids to update and the new type | [optional] |

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

<a name="updateExistingAssessment"></a>
# **updateExistingAssessment**
> updateExistingAssessment(orgId, assessmentId).silent(silent).updateAssessment(updateAssessment).execute();

Update an existing assessment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssessmentApi;
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
    String label = "label_example"; // human-readable label of assessment
    String slug = "slug_example"; // unique slug of assessment
    String type = "REVIEW"; // type of assessment
    Object fields = null; // assessment fields (description)
    List<ShareAccess> shareAccess = Arrays.asList(); // users who have been granted access to this assessment
    String sensitive = "GLOBAL"; // view sensitivity of this assessment
    String color = "color_example"; // color of assessment
    LocalDate startDate = LocalDate.now(); // Date this assessment begins. In the context of REVIEW goals, the date the review cycle begins.
    LocalDate endDate = LocalDate.now(); // Date this assessment ends, or is completed. In the context of REVIEW assessment, the date the review cycle ends.
    String status = "DRAFT"; // status of this assessment - DRAFT, ACTIVE, DONE
    String doneAt = "doneAt_example"; // timestamp when the status of this assessment was set to done
    Integer taskCount = 56; // number of tasks associated with this assessment
    Integer taskDoneCount = 56; // number of tasks associated with this assessment that are done
    Integer peopleIncludedCount = 56; // number of people included in this assessment
    String query = "query_example"; // Query for which people/jobs can be included in the review.
    Boolean silent = true; // Suppress notification emails
    try {
      client
              .assessment
              .updateExistingAssessment(orgId, assessmentId)
              .label(label)
              .slug(slug)
              .type(type)
              .fields(fields)
              .shareAccess(shareAccess)
              .sensitive(sensitive)
              .color(color)
              .startDate(startDate)
              .endDate(endDate)
              .status(status)
              .doneAt(doneAt)
              .taskCount(taskCount)
              .taskDoneCount(taskDoneCount)
              .peopleIncludedCount(peopleIncludedCount)
              .query(query)
              .silent(silent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#updateExistingAssessment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .assessment
              .updateExistingAssessment(orgId, assessmentId)
              .label(label)
              .slug(slug)
              .type(type)
              .fields(fields)
              .shareAccess(shareAccess)
              .sensitive(sensitive)
              .color(color)
              .startDate(startDate)
              .endDate(endDate)
              .status(status)
              .doneAt(doneAt)
              .taskCount(taskCount)
              .taskDoneCount(taskDoneCount)
              .peopleIncludedCount(peopleIncludedCount)
              .query(query)
              .silent(silent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssessmentApi#updateExistingAssessment");
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
| **silent** | **Boolean**| Suppress notification emails | [optional] |
| **updateAssessment** | [**UpdateAssessment**](UpdateAssessment.md)| Assessment data to update | [optional] |

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

