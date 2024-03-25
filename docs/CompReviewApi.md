# CompReviewApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeCompReview**](CompReviewApi.md#closeCompReview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/conclude | Concludes (or closes) the compensation review |
| [**createBulkDuplicate**](CompReviewApi.md#createBulkDuplicate) | **POST** /v1/org/{orgId}/comp-review/bulk/duplicate | Duplicate a set of comp reviews |
| [**createCompReview**](CompReviewApi.md#createCompReview) | **POST** /v1/org/{orgId}/comp-review | Create a comp review |
| [**createVisualizationData**](CompReviewApi.md#createVisualizationData) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/visualizations | Get data for visualizations for a comp review |
| [**deleteBulkCompReviews**](CompReviewApi.md#deleteBulkCompReviews) | **POST** /v1/org/{orgId}/comp-review/bulk/delete | Delete a set of comp reviews |
| [**deleteCompReview**](CompReviewApi.md#deleteCompReview) | **DELETE** /v1/org/{orgId}/comp-review/{compReviewId} | Delete a comp review |
| [**duplicateCompReview**](CompReviewApi.md#duplicateCompReview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/duplicate | Duplicate a comp review |
| [**exportAuditLog**](CompReviewApi.md#exportAuditLog) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/export/audit | Export a comp review&#39;s audit log |
| [**exportChanges**](CompReviewApi.md#exportChanges) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/export | Export a comp review&#39;s changes |
| [**exportComments**](CompReviewApi.md#exportComments) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/export/comments | Export a comp review&#39;s comments |
| [**findCompReviewById**](CompReviewApi.md#findCompReviewById) | **GET** /v1/org/{orgId}/comp-review/{compReviewId} | Return a particular comp review by ID |
| [**findCompReviews**](CompReviewApi.md#findCompReviews) | **GET** /v1/org/{orgId}/comp-review | Find comp reviews in the organization |
| [**generateCompReview**](CompReviewApi.md#generateCompReview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/generate | Generate a compensation review |
| [**generateTieringPreview**](CompReviewApi.md#generateTieringPreview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/preview | Generate tiering &amp; preview for a compensation review |
| [**getChangeAndGuidelineFlags**](CompReviewApi.md#getChangeAndGuidelineFlags) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/in-cycle/changes/{changeId} | Get the change data and guideline flags associated with an in-cycle change |
| [**getChangesInCycle**](CompReviewApi.md#getChangesInCycle) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/in-cycle/changes | Get the changes for a set of scenarios in an in-cycle comp-review |
| [**getCollabicientInCycle**](CompReviewApi.md#getCollabicientInCycle) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/in-cycle/collabicient | Get a collaborator participant reviewer in-cycle comp-review |
| [**getDateCaches**](CompReviewApi.md#getDateCaches) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/associated-entities | Get the necessary caches on a specific date for a compensation review |
| [**getEligibleEmployees**](CompReviewApi.md#getEligibleEmployees) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/eligible-employees | Get a list of employees eligible for a given comp review |
| [**getMetadataById**](CompReviewApi.md#getMetadataById) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/metadata | Return metadata for a particular comp review by ID |
| [**listRequestResponses**](CompReviewApi.md#listRequestResponses) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/approval-requests | Get a list of approval request responses for a given comp review |
| [**overviewInCycleCompReview**](CompReviewApi.md#overviewInCycleCompReview) | **GET** /v1/org/{orgId}/comp-review/{compReviewId}/in-cycle | Get an overview for a given user in an in-cycle comp-review |
| [**pauseReview**](CompReviewApi.md#pauseReview) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/pause | Pauses the compensation review to allow for editing by an admin |
| [**sendReminderEmail**](CompReviewApi.md#sendReminderEmail) | **POST** /v1/org/{orgId}/comp-review/{compReviewId}/send-reminder-email | Send a reminder email to someone participating in a comp review  |
| [**updateApprovalRequestStatus**](CompReviewApi.md#updateApprovalRequestStatus) | **PATCH** /v1/org/{orgId}/comp-review/{compReviewId}/approval-requests/{approvalRequestId} | Update approval request status, including any rollups |
| [**updateCompReview**](CompReviewApi.md#updateCompReview) | **PATCH** /v1/org/{orgId}/comp-review/{compReviewId} | Update a comp review |


<a name="closeCompReview"></a>
# **closeCompReview**
> closeCompReview(orgId, compReviewId).isFullyApproved(isFullyApproved).execute();

Concludes (or closes) the compensation review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    Boolean isFullyApproved = true; // Whether is review fully approved on conclude (default false)
    try {
      client
              .compReview
              .closeCompReview(orgId, compReviewId)
              .isFullyApproved(isFullyApproved)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#closeCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .compReview
              .closeCompReview(orgId, compReviewId)
              .isFullyApproved(isFullyApproved)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#closeCompReview");
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
| **compReviewId** | **String**| Comp review id | |
| **isFullyApproved** | **Boolean**| Whether is review fully approved on conclude (default false) | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="createBulkDuplicate"></a>
# **createBulkDuplicate**
> Process createBulkDuplicate(orgId).requestBody(requestBody).execute();

Duplicate a set of comp reviews



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
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
              .compReview
              .createBulkDuplicate(orgId)
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
      System.err.println("Exception when calling CompReviewApi#createBulkDuplicate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .compReview
              .createBulkDuplicate(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#createBulkDuplicate");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of comp review ids to duplicate | [optional] |

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
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="createCompReview"></a>
# **createCompReview**
> createCompReview(orgId).createCompReview(createCompReview).execute();

Create a comp review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // human-readable label of goal
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    CompReviewConfig config = new CompReviewConfig();
    String status = "PENDING"; // Whether the compensation review has been approved by the final approvers
    List<ShareAccess> shareAccess = Arrays.asList(); // users who have been granted access to this comp review
    try {
      client
              .compReview
              .createCompReview(label, orgId)
              .config(config)
              .status(status)
              .shareAccess(shareAccess)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#createCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .compReview
              .createCompReview(label, orgId)
              .config(config)
              .status(status)
              .shareAccess(shareAccess)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#createCompReview");
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
| **createCompReview** | [**CreateCompReview**](CreateCompReview.md)| Comp review data to create | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="createVisualizationData"></a>
# **createVisualizationData**
> CompReviewVisualizations createVisualizationData(orgId, compReviewId).viewJobId(viewJobId).preview(preview).includeAllRequests(includeAllRequests).getVisualizationsOptions(getVisualizationsOptions).execute();

Get data for visualizations for a comp review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Boolean isCollabicientView = true; // Are the visualizations for a collaborating participant
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    Set<String> changeIds = Arrays.asList(); // A set of Change ObjectIds used to filter the results of budget and raise calculations
    String viewInCurrency = "viewInCurrency_example"; // Currency to view budget visualizations
    Boolean includeCollaborators = true; // Whether or not to include approval requests on which a user is collaborating when calculating budget amounts for that user
    String viewJobId = "viewJobId_example"; // The job you would like to view as
    Boolean preview = true; // Are the visualizations for a preview
    Boolean includeAllRequests = true; // Allows users with multiple roles to request full access for owner or final approver roles
    try {
      CompReviewVisualizations result = client
              .compReview
              .createVisualizationData(isCollabicientView, orgId, compReviewId)
              .changeIds(changeIds)
              .viewInCurrency(viewInCurrency)
              .includeCollaborators(includeCollaborators)
              .viewJobId(viewJobId)
              .preview(preview)
              .includeAllRequests(includeAllRequests)
              .execute();
      System.out.println(result);
      System.out.println(result.getRaisePercentageHistogram());
      System.out.println(result.getJobToBaseSpendMap());
      System.out.println(result.getBudgetPoolCalculation());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#createVisualizationData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompReviewVisualizations> response = client
              .compReview
              .createVisualizationData(isCollabicientView, orgId, compReviewId)
              .changeIds(changeIds)
              .viewInCurrency(viewInCurrency)
              .includeCollaborators(includeCollaborators)
              .viewJobId(viewJobId)
              .preview(preview)
              .includeAllRequests(includeAllRequests)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#createVisualizationData");
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
| **compReviewId** | **String**| Comp review id | |
| **viewJobId** | **String**| The job you would like to view as | [optional] |
| **preview** | **Boolean**| Are the visualizations for a preview | [optional] |
| **includeAllRequests** | **Boolean**| Allows users with multiple roles to request full access for owner or final approver roles | [optional] |
| **getVisualizationsOptions** | [**GetVisualizationsOptions**](GetVisualizationsOptions.md)| Options for visualizations | [optional] |

### Return type

[**CompReviewVisualizations**](CompReviewVisualizations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deleteBulkCompReviews"></a>
# **deleteBulkCompReviews**
> Process deleteBulkCompReviews(orgId).requestBody(requestBody).execute();

Delete a set of comp reviews



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
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
              .compReview
              .deleteBulkCompReviews(orgId)
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
      System.err.println("Exception when calling CompReviewApi#deleteBulkCompReviews");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .compReview
              .deleteBulkCompReviews(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#deleteBulkCompReviews");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of comp review ids to delete | [optional] |

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
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="deleteCompReview"></a>
# **deleteCompReview**
> deleteCompReview(orgId, compReviewId).execute();

Delete a comp review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      client
              .compReview
              .deleteCompReview(orgId, compReviewId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#deleteCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .compReview
              .deleteCompReview(orgId, compReviewId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#deleteCompReview");
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
| **compReviewId** | **String**| Comp review id | |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="duplicateCompReview"></a>
# **duplicateCompReview**
> CompReview duplicateCompReview(orgId, compReviewId).execute();

Duplicate a comp review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      CompReview result = client
              .compReview
              .duplicateCompReview(orgId, compReviewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getConfig());
      System.out.println(result.getStatus());
      System.out.println(result.getShareAccess());
      System.out.println(result.getReviewerCount());
      System.out.println(result.getSubmittedCount());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#duplicateCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompReview> response = client
              .compReview
              .duplicateCompReview(orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#duplicateCompReview");
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
| **compReviewId** | **String**| Comp review id | |

### Return type

[**CompReview**](CompReview.md)

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
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="exportAuditLog"></a>
# **exportAuditLog**
> Process exportAuditLog(orgId, compReviewId).requestBody(requestBody).execute();

Export a comp review&#39;s audit log



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      Process result = client
              .compReview
              .exportAuditLog(orgId, compReviewId)
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
      System.err.println("Exception when calling CompReviewApi#exportAuditLog");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .compReview
              .exportAuditLog(orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#exportAuditLog");
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
| **compReviewId** | **String**| Comp review id | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| Export options | [optional] |

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
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="exportChanges"></a>
# **exportChanges**
> Process exportChanges(orgId, compReviewId).requestBody(requestBody).execute();

Export a comp review&#39;s changes



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      Process result = client
              .compReview
              .exportChanges(orgId, compReviewId)
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
      System.err.println("Exception when calling CompReviewApi#exportChanges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .compReview
              .exportChanges(orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#exportChanges");
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
| **compReviewId** | **String**| Comp review id | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| Export options | [optional] |

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
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="exportComments"></a>
# **exportComments**
> Process exportComments(orgId, compReviewId).execute();

Export a comp review&#39;s comments



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      Process result = client
              .compReview
              .exportComments(orgId, compReviewId)
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
      System.err.println("Exception when calling CompReviewApi#exportComments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .compReview
              .exportComments(orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#exportComments");
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
| **compReviewId** | **String**| Comp review id | |

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
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="findCompReviewById"></a>
# **findCompReviewById**
> CompReview findCompReviewById(orgId, compReviewId).execute();

Return a particular comp review by ID



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      CompReview result = client
              .compReview
              .findCompReviewById(orgId, compReviewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getConfig());
      System.out.println(result.getStatus());
      System.out.println(result.getShareAccess());
      System.out.println(result.getReviewerCount());
      System.out.println(result.getSubmittedCount());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#findCompReviewById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompReview> response = client
              .compReview
              .findCompReviewById(orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#findCompReviewById");
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
| **compReviewId** | **String**| Comp review id | |

### Return type

[**CompReview**](CompReview.md)

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

<a name="findCompReviews"></a>
# **findCompReviews**
> ResultsCompReview findCompReviews(orgId).from(from).limit(limit).returnAccess(returnAccess).execute();

Find comp reviews in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String from = "from_example"; // Comp review ID to start paginating from
    Integer limit = 56; // Number of results to return
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsCompReview result = client
              .compReview
              .findCompReviews(orgId)
              .from(from)
              .limit(limit)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#findCompReviews");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsCompReview> response = client
              .compReview
              .findCompReviews(orgId)
              .from(from)
              .limit(limit)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#findCompReviews");
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
| **from** | **String**| Comp review ID to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ResultsCompReview**](ResultsCompReview.md)

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

<a name="generateCompReview"></a>
# **generateCompReview**
> Process generateCompReview(orgId, compReviewId).generateCompReviewOptions(generateCompReviewOptions).execute();

Generate a compensation review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Boolean isPreview = true;
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      Process result = client
              .compReview
              .generateCompReview(isPreview, orgId, compReviewId)
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
      System.err.println("Exception when calling CompReviewApi#generateCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .compReview
              .generateCompReview(isPreview, orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#generateCompReview");
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
| **compReviewId** | **String**| Comp review id | |
| **generateCompReviewOptions** | [**GenerateCompReviewOptions**](GenerateCompReviewOptions.md)| Whether this should be generated as a preview | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="generateTieringPreview"></a>
# **generateTieringPreview**
> TiersResponse generateTieringPreview(orgId, compReviewId).execute();

Generate tiering &amp; preview for a compensation review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      TiersResponse result = client
              .compReview
              .generateTieringPreview(orgId, compReviewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getReviews());
      System.out.println(result.getFinalApprovers());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#generateTieringPreview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TiersResponse> response = client
              .compReview
              .generateTieringPreview(orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#generateTieringPreview");
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
| **compReviewId** | **String**| Comp review id | |

### Return type

[**TiersResponse**](TiersResponse.md)

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

<a name="getChangeAndGuidelineFlags"></a>
# **getChangeAndGuidelineFlags**
> InCycleChange getChangeAndGuidelineFlags(orgId, compReviewId, changeId).execute();

Get the change data and guideline flags associated with an in-cycle change



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    String changeId = "changeId_example"; // Change id
    try {
      InCycleChange result = client
              .compReview
              .getChangeAndGuidelineFlags(orgId, compReviewId, changeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChange());
      System.out.println(result.getGuidelines());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getChangeAndGuidelineFlags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InCycleChange> response = client
              .compReview
              .getChangeAndGuidelineFlags(orgId, compReviewId, changeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getChangeAndGuidelineFlags");
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
| **compReviewId** | **String**| Comp review id | |
| **changeId** | **String**| Change id | |

### Return type

[**InCycleChange**](InCycleChange.md)

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

<a name="getChangesInCycle"></a>
# **getChangesInCycle**
> InCycleViewChanges getChangesInCycle(orgId, compReviewId).approvalRequestId(approvalRequestId).isPreview(isPreview).jobId(jobId).execute();

Get the changes for a set of scenarios in an in-cycle comp-review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    String approvalRequestId = "approvalRequestId_example"; // Approval request id
    Boolean isPreview = true;
    String jobId = "jobId_example";
    try {
      InCycleViewChanges result = client
              .compReview
              .getChangesInCycle(orgId, compReviewId)
              .approvalRequestId(approvalRequestId)
              .isPreview(isPreview)
              .jobId(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChangeMap());
      System.out.println(result.getGuidelinesMap());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getChangesInCycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InCycleViewChanges> response = client
              .compReview
              .getChangesInCycle(orgId, compReviewId)
              .approvalRequestId(approvalRequestId)
              .isPreview(isPreview)
              .jobId(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getChangesInCycle");
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
| **compReviewId** | **String**| Comp review id | |
| **approvalRequestId** | **String**| Approval request id | [optional] |
| **isPreview** | **Boolean**|  | [optional] |
| **jobId** | **String**|  | [optional] |

### Return type

[**InCycleViewChanges**](InCycleViewChanges.md)

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

<a name="getCollabicientInCycle"></a>
# **getCollabicientInCycle**
> InCycleViewResponse getCollabicientInCycle(orgId, compReviewId).scenariosOnly(scenariosOnly).proposalOnly(proposalOnly).reviewsOnly(reviewsOnly).columnsOnly(columnsOnly).isPreview(isPreview).collabicientJobId(collabicientJobId).execute();

Get a collaborator participant reviewer in-cycle comp-review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    Boolean scenariosOnly = true;
    Boolean proposalOnly = true;
    Boolean reviewsOnly = true;
    Boolean columnsOnly = true;
    Boolean isPreview = true;
    String collabicientJobId = "collabicientJobId_example";
    try {
      InCycleViewResponse result = client
              .compReview
              .getCollabicientInCycle(orgId, compReviewId)
              .scenariosOnly(scenariosOnly)
              .proposalOnly(proposalOnly)
              .reviewsOnly(reviewsOnly)
              .columnsOnly(columnsOnly)
              .isPreview(isPreview)
              .collabicientJobId(collabicientJobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getReviews());
      System.out.println(result.getProposal());
      System.out.println(result.getScenarioMap());
      System.out.println(result.getParentReviewsMap());
      System.out.println(result.getCollaboratingWithJobIds());
      System.out.println(result.getVisibleColumns());
      System.out.println(result.getError());
      System.out.println(result.getFeatures());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getCollabicientInCycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InCycleViewResponse> response = client
              .compReview
              .getCollabicientInCycle(orgId, compReviewId)
              .scenariosOnly(scenariosOnly)
              .proposalOnly(proposalOnly)
              .reviewsOnly(reviewsOnly)
              .columnsOnly(columnsOnly)
              .isPreview(isPreview)
              .collabicientJobId(collabicientJobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getCollabicientInCycle");
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
| **compReviewId** | **String**| Comp review id | |
| **scenariosOnly** | **Boolean**|  | [optional] |
| **proposalOnly** | **Boolean**|  | [optional] |
| **reviewsOnly** | **Boolean**|  | [optional] |
| **columnsOnly** | **Boolean**|  | [optional] |
| **isPreview** | **Boolean**|  | [optional] |
| **collabicientJobId** | **String**|  | [optional] |

### Return type

[**InCycleViewResponse**](InCycleViewResponse.md)

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

<a name="getDateCaches"></a>
# **getDateCaches**
> PartialAppEntities getDateCaches(orgId, compReviewId).execute();

Get the necessary caches on a specific date for a compensation review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      PartialAppEntities result = client
              .compReview
              .getDateCaches(orgId, compReviewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobs());
      System.out.println(result.getPersons());
      System.out.println(result.getPersonToJobMap());
      System.out.println(result.getFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getDateCaches");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartialAppEntities> response = client
              .compReview
              .getDateCaches(orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getDateCaches");
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
| **compReviewId** | **String**| Comp review id | |

### Return type

[**PartialAppEntities**](PartialAppEntities.md)

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

<a name="getEligibleEmployees"></a>
# **getEligibleEmployees**
> ResultsData getEligibleEmployees(orgId, compReviewId).filterScenarioIds(filterScenarioIds).ineligible(ineligible).from(from).limit(limit).fields(fields).format(format).filter(filter).execute();

Get a list of employees eligible for a given comp review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    String filterScenarioIds = "filterScenarioIds_example"; // Find ineligible employees under specific comp scenario managers
    Boolean ineligible = true; // Whether to get eligible or ineligible employees (defaults to eligible)
    String from = "from_example"; // Job id to start paginating from
    Integer limit = 56; // Number of results to return
    String fields = "fields_example"; // Table fields
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String filter = "filter_example"; // Optional CQL filter to apply to employees
    try {
      ResultsData result = client
              .compReview
              .getEligibleEmployees(orgId, compReviewId)
              .filterScenarioIds(filterScenarioIds)
              .ineligible(ineligible)
              .from(from)
              .limit(limit)
              .fields(fields)
              .format(format)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getEligibleEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .compReview
              .getEligibleEmployees(orgId, compReviewId)
              .filterScenarioIds(filterScenarioIds)
              .ineligible(ineligible)
              .from(from)
              .limit(limit)
              .fields(fields)
              .format(format)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getEligibleEmployees");
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
| **compReviewId** | **String**| Comp review id | |
| **filterScenarioIds** | **String**| Find ineligible employees under specific comp scenario managers | [optional] |
| **ineligible** | **Boolean**| Whether to get eligible or ineligible employees (defaults to eligible) | [optional] |
| **from** | **String**| Job id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **fields** | **String**| Table fields | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **filter** | **String**| Optional CQL filter to apply to employees | [optional] |

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

<a name="getMetadataById"></a>
# **getMetadataById**
> CompReviewMetadata getMetadataById(orgId, compReviewId).execute();

Return metadata for a particular comp review by ID



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      CompReviewMetadata result = client
              .compReview
              .getMetadataById(orgId, compReviewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompReviewId());
      System.out.println(result.getOrgId());
      System.out.println(result.getEligibleEmployees());
      System.out.println(result.getEligibleEmployeesFilter());
      System.out.println(result.getIneligibleEmployees());
      System.out.println(result.getIneligibleEmployeesFilter());
      System.out.println(result.getApprovers());
      System.out.println(result.getReviewers());
      System.out.println(result.getCollaborators());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getMetadataById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompReviewMetadata> response = client
              .compReview
              .getMetadataById(orgId, compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#getMetadataById");
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
| **compReviewId** | **String**| Comp review id | |

### Return type

[**CompReviewMetadata**](CompReviewMetadata.md)

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

<a name="listRequestResponses"></a>
# **listRequestResponses**
> List&lt;ApprovalRequestCompReviewResponse&gt; listRequestResponses(orgId, compReviewId).isPreview(isPreview).execute();

Get a list of approval request responses for a given comp review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    Boolean isPreview = true;
    try {
      List<ApprovalRequestCompReviewResponse> result = client
              .compReview
              .listRequestResponses(orgId, compReviewId)
              .isPreview(isPreview)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#listRequestResponses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApprovalRequestCompReviewResponse>> response = client
              .compReview
              .listRequestResponses(orgId, compReviewId)
              .isPreview(isPreview)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#listRequestResponses");
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
| **compReviewId** | **String**| Comp review id | |
| **isPreview** | **Boolean**|  | [optional] |

### Return type

[**List&lt;ApprovalRequestCompReviewResponse&gt;**](ApprovalRequestCompReviewResponse.md)

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

<a name="overviewInCycleCompReview"></a>
# **overviewInCycleCompReview**
> InCycleViewResponse overviewInCycleCompReview(orgId, compReviewId).scenariosOnly(scenariosOnly).proposalOnly(proposalOnly).reviewsOnly(reviewsOnly).columnsOnly(columnsOnly).isPreview(isPreview).jobId(jobId).includeAllRequests(includeAllRequests).includeFeatures(includeFeatures).execute();

Get an overview for a given user in an in-cycle comp-review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    Boolean scenariosOnly = true;
    Boolean proposalOnly = true;
    Boolean reviewsOnly = true;
    Boolean columnsOnly = true;
    Boolean isPreview = true;
    String jobId = "jobId_example";
    Boolean includeAllRequests = true; // Allows users with multiple roles to request full access for owner or final approver roles
    Boolean includeFeatures = true;
    try {
      InCycleViewResponse result = client
              .compReview
              .overviewInCycleCompReview(orgId, compReviewId)
              .scenariosOnly(scenariosOnly)
              .proposalOnly(proposalOnly)
              .reviewsOnly(reviewsOnly)
              .columnsOnly(columnsOnly)
              .isPreview(isPreview)
              .jobId(jobId)
              .includeAllRequests(includeAllRequests)
              .includeFeatures(includeFeatures)
              .execute();
      System.out.println(result);
      System.out.println(result.getReviews());
      System.out.println(result.getProposal());
      System.out.println(result.getScenarioMap());
      System.out.println(result.getParentReviewsMap());
      System.out.println(result.getCollaboratingWithJobIds());
      System.out.println(result.getVisibleColumns());
      System.out.println(result.getError());
      System.out.println(result.getFeatures());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#overviewInCycleCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InCycleViewResponse> response = client
              .compReview
              .overviewInCycleCompReview(orgId, compReviewId)
              .scenariosOnly(scenariosOnly)
              .proposalOnly(proposalOnly)
              .reviewsOnly(reviewsOnly)
              .columnsOnly(columnsOnly)
              .isPreview(isPreview)
              .jobId(jobId)
              .includeAllRequests(includeAllRequests)
              .includeFeatures(includeFeatures)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#overviewInCycleCompReview");
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
| **compReviewId** | **String**| Comp review id | |
| **scenariosOnly** | **Boolean**|  | [optional] |
| **proposalOnly** | **Boolean**|  | [optional] |
| **reviewsOnly** | **Boolean**|  | [optional] |
| **columnsOnly** | **Boolean**|  | [optional] |
| **isPreview** | **Boolean**|  | [optional] |
| **jobId** | **String**|  | [optional] |
| **includeAllRequests** | **Boolean**| Allows users with multiple roles to request full access for owner or final approver roles | [optional] |
| **includeFeatures** | **Boolean**|  | [optional] |

### Return type

[**InCycleViewResponse**](InCycleViewResponse.md)

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

<a name="pauseReview"></a>
# **pauseReview**
> pauseReview(orgId, compReviewId).execute();

Pauses the compensation review to allow for editing by an admin



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      client
              .compReview
              .pauseReview(orgId, compReviewId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#pauseReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .compReview
              .pauseReview(orgId, compReviewId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#pauseReview");
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
| **compReviewId** | **String**| Comp review id | |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="sendReminderEmail"></a>
# **sendReminderEmail**
> sendReminderEmail(orgId, compReviewId).sendReminderEmailOptions(sendReminderEmailOptions).execute();

Send a reminder email to someone participating in a comp review 



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String approvalRequestId = "approvalRequestId_example";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    try {
      client
              .compReview
              .sendReminderEmail(approvalRequestId, orgId, compReviewId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#sendReminderEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .compReview
              .sendReminderEmail(approvalRequestId, orgId, compReviewId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#sendReminderEmail");
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
| **compReviewId** | **String**| Comp review id | |
| **sendReminderEmailOptions** | [**SendReminderEmailOptions**](SendReminderEmailOptions.md)| Approval request ID | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="updateApprovalRequestStatus"></a>
# **updateApprovalRequestStatus**
> updateApprovalRequestStatus(orgId, compReviewId, approvalRequestId).previewJobId(previewJobId).isFinalApproval(isFinalApproval).collaboratorSelectedReviewerJobId(collaboratorSelectedReviewerJobId).approvalRequestPatchBody(approvalRequestPatchBody).execute();

Update approval request status, including any rollups



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String status = "CANCELED";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp review id
    String approvalRequestId = "approvalRequestId_example"; // Approval request id
    String message = "message_example";
    String previewJobId = "previewJobId_example"; // Preview-as job id
    Boolean isFinalApproval = true; // Updating the final stage status
    String collaboratorSelectedReviewerJobId = "collaboratorSelectedReviewerJobId_example"; // Reviewer job id a collaborator is working on
    try {
      client
              .compReview
              .updateApprovalRequestStatus(status, orgId, compReviewId, approvalRequestId)
              .message(message)
              .previewJobId(previewJobId)
              .isFinalApproval(isFinalApproval)
              .collaboratorSelectedReviewerJobId(collaboratorSelectedReviewerJobId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#updateApprovalRequestStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .compReview
              .updateApprovalRequestStatus(status, orgId, compReviewId, approvalRequestId)
              .message(message)
              .previewJobId(previewJobId)
              .isFinalApproval(isFinalApproval)
              .collaboratorSelectedReviewerJobId(collaboratorSelectedReviewerJobId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#updateApprovalRequestStatus");
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
| **compReviewId** | **String**| Comp review id | |
| **approvalRequestId** | **String**| Approval request id | |
| **previewJobId** | **String**| Preview-as job id | [optional] |
| **isFinalApproval** | **Boolean**| Updating the final stage status | [optional] |
| **collaboratorSelectedReviewerJobId** | **String**| Reviewer job id a collaborator is working on | [optional] |
| **approvalRequestPatchBody** | [**ApprovalRequestPatchBody**](ApprovalRequestPatchBody.md)| Approval request data to update | [optional] |

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
| **0** | successful operation |  -  |

<a name="updateCompReview"></a>
# **updateCompReview**
> CompReview updateCompReview(orgId, compReviewId).updateCompReview(updateCompReview).execute();

Update a comp review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Review id
    String label = "label_example"; // human-readable label of goal
    CompReviewConfig config = new CompReviewConfig();
    String status = "PENDING"; // Whether the compensation review has been approved by the final approvers
    List<ShareAccess> shareAccess = Arrays.asList(); // users who have been granted access to this comp review
    Integer reviewerCount = 56; // count of reviewers in the comp review
    Integer submittedCount = 56; // count of reviews that have been submitted and approved
    try {
      CompReview result = client
              .compReview
              .updateCompReview(orgId, compReviewId)
              .label(label)
              .config(config)
              .status(status)
              .shareAccess(shareAccess)
              .reviewerCount(reviewerCount)
              .submittedCount(submittedCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getConfig());
      System.out.println(result.getStatus());
      System.out.println(result.getShareAccess());
      System.out.println(result.getReviewerCount());
      System.out.println(result.getSubmittedCount());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#updateCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompReview> response = client
              .compReview
              .updateCompReview(orgId, compReviewId)
              .label(label)
              .config(config)
              .status(status)
              .shareAccess(shareAccess)
              .reviewerCount(reviewerCount)
              .submittedCount(submittedCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompReviewApi#updateCompReview");
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
| **compReviewId** | **String**| Review id | |
| **updateCompReview** | [**UpdateCompReview**](UpdateCompReview.md)|  | [optional] |

### Return type

[**CompReview**](CompReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

