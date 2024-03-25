# ApprovalRequestApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllApprovalRequestScenarioResponses**](ApprovalRequestApi.md#getAllApprovalRequestScenarioResponses) | **GET** /v1/org/{orgId}/approval-request/entity/scenario | Return all approval request scenario responses for an org |
| [**getApprovalRequestScenarioResponseByJobId**](ApprovalRequestApi.md#getApprovalRequestScenarioResponseByJobId) | **GET** /v1/org/{orgId}/approval-request/scenario-job/{jobId} | Return a particular approval request scenario response by jobId |
| [**getScenarioResponseById**](ApprovalRequestApi.md#getScenarioResponseById) | **GET** /v1/org/{orgId}/approval-request/{approvalRequestId}/scenario-response | Return a particular approval request scenario response by id |


<a name="getAllApprovalRequestScenarioResponses"></a>
# **getAllApprovalRequestScenarioResponses**
> ResultsApprovalRequestScenarioResponse getAllApprovalRequestScenarioResponses(orgId).limit(limit).entityIds(entityIds).includeDeleted(includeDeleted).execute();

Return all approval request scenario responses for an org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalRequestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    Integer limit = 56; // Number of results to return
    String entityIds = "entityIds_example"; // entity ids to filter on
    Boolean includeDeleted = true; // Include deleted approval requests
    try {
      ResultsApprovalRequestScenarioResponse result = client
              .approvalRequest
              .getAllApprovalRequestScenarioResponses(orgId)
              .limit(limit)
              .entityIds(entityIds)
              .includeDeleted(includeDeleted)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalRequestApi#getAllApprovalRequestScenarioResponses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsApprovalRequestScenarioResponse> response = client
              .approvalRequest
              .getAllApprovalRequestScenarioResponses(orgId)
              .limit(limit)
              .entityIds(entityIds)
              .includeDeleted(includeDeleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalRequestApi#getAllApprovalRequestScenarioResponses");
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
| **limit** | **Integer**| Number of results to return | [optional] |
| **entityIds** | **String**| entity ids to filter on | [optional] |
| **includeDeleted** | **Boolean**| Include deleted approval requests | [optional] |

### Return type

[**ResultsApprovalRequestScenarioResponse**](ResultsApprovalRequestScenarioResponse.md)

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

<a name="getApprovalRequestScenarioResponseByJobId"></a>
# **getApprovalRequestScenarioResponseByJobId**
> ApprovalRequestScenarioResponse getApprovalRequestScenarioResponseByJobId(orgId, jobId).execute();

Return a particular approval request scenario response by jobId



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalRequestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // Job id
    try {
      ApprovalRequestScenarioResponse result = client
              .approvalRequest
              .getApprovalRequestScenarioResponseByJobId(orgId, jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getActiveStage());
      System.out.println(result.getProposerStage());
      System.out.println(result.getNextReviewerStage());
      System.out.println(result.getIsComplete());
      System.out.println(result.getRejectedStage());
      System.out.println(result.getStageOverrides());
      System.out.println(result.getIsApprovalCommentRequiredForActiveStage());
      System.out.println(result.getIsRejectionCommentRequiredForActiveStage());
      System.out.println(result.getApprovalChainId());
      System.out.println(result.getScenarioId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalRequestApi#getApprovalRequestScenarioResponseByJobId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalRequestScenarioResponse> response = client
              .approvalRequest
              .getApprovalRequestScenarioResponseByJobId(orgId, jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalRequestApi#getApprovalRequestScenarioResponseByJobId");
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
| **jobId** | **String**| Job id | |

### Return type

[**ApprovalRequestScenarioResponse**](ApprovalRequestScenarioResponse.md)

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

<a name="getScenarioResponseById"></a>
# **getScenarioResponseById**
> ApprovalRequestScenarioResponse getScenarioResponseById(orgId, approvalRequestId).execute();

Return a particular approval request scenario response by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalRequestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalRequestId = "approvalRequestId_example"; // Approval request id
    try {
      ApprovalRequestScenarioResponse result = client
              .approvalRequest
              .getScenarioResponseById(orgId, approvalRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getActiveStage());
      System.out.println(result.getProposerStage());
      System.out.println(result.getNextReviewerStage());
      System.out.println(result.getIsComplete());
      System.out.println(result.getRejectedStage());
      System.out.println(result.getStageOverrides());
      System.out.println(result.getIsApprovalCommentRequiredForActiveStage());
      System.out.println(result.getIsRejectionCommentRequiredForActiveStage());
      System.out.println(result.getApprovalChainId());
      System.out.println(result.getScenarioId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalRequestApi#getScenarioResponseById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalRequestScenarioResponse> response = client
              .approvalRequest
              .getScenarioResponseById(orgId, approvalRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalRequestApi#getScenarioResponseById");
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
| **approvalRequestId** | **String**| Approval request id | |

### Return type

[**ApprovalRequestScenarioResponse**](ApprovalRequestScenarioResponse.md)

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

