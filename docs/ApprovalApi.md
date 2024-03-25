# ApprovalApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChain**](ApprovalApi.md#createChain) | **POST** /v1/org/{orgId}/approval-chain | Create an approval chain |
| [**createChainStage**](ApprovalApi.md#createChainStage) | **POST** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage | Create an approval chain stage |
| [**createRequest**](ApprovalApi.md#createRequest) | **POST** /v1/org/{orgId}/approval-chain/{approvalChainId}/request | Create an approval request |
| [**deleteApprovalChainStage**](ApprovalApi.md#deleteApprovalChainStage) | **DELETE** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage/{approvalChainStageId} | Delete an approval chain stage |
| [**deleteChainById**](ApprovalApi.md#deleteChainById) | **DELETE** /v1/org/{orgId}/approval-chain/{approvalChainId} | Delete a approval chain |
| [**deleteRequestApproval**](ApprovalApi.md#deleteRequestApproval) | **DELETE** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId} | Delete an approval request |
| [**generateDefaultChainStages**](ApprovalApi.md#generateDefaultChainStages) | **POST** /v1/org/{orgId}/approval-chain/create-default-chain | Build a default approval chain based on entity type |
| [**getAllApprovalRequestsForApprovalChain**](ApprovalApi.md#getAllApprovalRequestsForApprovalChain) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/request | Return all approval requests for an approval chain |
| [**getAllStagesForChain**](ApprovalApi.md#getAllStagesForChain) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage/{approvalChainStageId} | Return all approval chain stages for an approval chain |
| [**getApprovalChainById**](ApprovalApi.md#getApprovalChainById) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId} | Return a particular approval chain by id |
| [**getApprovalChainStages**](ApprovalApi.md#getApprovalChainStages) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage | Return all approval chain stages for an approval chain |
| [**getApprovalChains**](ApprovalApi.md#getApprovalChains) | **GET** /v1/org/{orgId}/approval-chain | Return approval chains |
| [**getCompReviewResponsesForChain**](ApprovalApi.md#getCompReviewResponsesForChain) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/entity/comp-review | Return all approval request comp review responses for an approval chain |
| [**getScenarioResponses**](ApprovalApi.md#getScenarioResponses) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/entity/scenario | Return all approval request scenario responses for an approval chain |
| [**reassignApproverAtStage**](ApprovalApi.md#reassignApproverAtStage) | **POST** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId}/reassign-approver | Reassigning an approver at a stage |
| [**requestApprovalRequest**](ApprovalApi.md#requestApprovalRequest) | **GET** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId} | Return an approval request |
| [**sendStageReviewerReminder**](ApprovalApi.md#sendStageReviewerReminder) | **POST** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId}/send-reminder | Send a reminder for a stage reviewer in an existing approval request |
| [**updateChain**](ApprovalApi.md#updateChain) | **PATCH** /v1/org/{orgId}/approval-chain/{approvalChainId} | Update a approval chain |
| [**updateExistingRequest**](ApprovalApi.md#updateExistingRequest) | **PATCH** /v1/org/{orgId}/approval-chain/{approvalChainId}/request/{approvalRequestId} | Update an existing approval request |
| [**updateStageById**](ApprovalApi.md#updateStageById) | **PATCH** /v1/org/{orgId}/approval-chain/{approvalChainId}/stage/{approvalChainStageId} | Update an existing approval chain stage |


<a name="createChain"></a>
# **createChain**
> ApprovalChain createChain(orgId).createDefaultStages(createDefaultStages).createApprovalChain(createApprovalChain).execute();

Create an approval chain



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // human-readable name of approval chain
    Boolean isPreview = true; // isPreview specifies that this is a preview for implementations that use it (e.g. Compensation Reviews)
    Set<String> approvalNotifierUserIds = Arrays.asList(); // ids of any users who should be notified when approval is complete
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String entityId = "entityId_example"; // entity id
    String entityType = "COMP_REVIEW"; // entity type
    String fallbackApproverJobId = "fallbackApproverJobId_example"; // the jobId of the fallback approver
    String fallbackApproverJobError = "fallbackApproverJobError_example"; // most recent error for fallback approver
    Boolean createDefaultStages = true; // Create default stages
    try {
      ApprovalChain result = client
              .approval
              .createChain(name, isPreview, approvalNotifierUserIds, orgId)
              .entityId(entityId)
              .entityType(entityType)
              .fallbackApproverJobId(fallbackApproverJobId)
              .fallbackApproverJobError(fallbackApproverJobError)
              .createDefaultStages(createDefaultStages)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getName());
      System.out.println(result.getIsPreview());
      System.out.println(result.getFallbackApproverJobId());
      System.out.println(result.getFallbackApproverJobError());
      System.out.println(result.getApprovalNotifierUserIds());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#createChain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalChain> response = client
              .approval
              .createChain(name, isPreview, approvalNotifierUserIds, orgId)
              .entityId(entityId)
              .entityType(entityType)
              .fallbackApproverJobId(fallbackApproverJobId)
              .fallbackApproverJobError(fallbackApproverJobError)
              .createDefaultStages(createDefaultStages)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#createChain");
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
| **createDefaultStages** | **Boolean**| Create default stages | [optional] |
| **createApprovalChain** | [**CreateApprovalChain**](CreateApprovalChain.md)| ApprovalChain data to create | [optional] |

### Return type

[**ApprovalChain**](ApprovalChain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="createChainStage"></a>
# **createChainStage**
> ApprovalChainStage createChainStage(orgId, approvalChainId).createApprovalChainStage(createApprovalChainStage).execute();

Create an approval chain stage



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String rejectBehavior = "BACK_TO_BEGINNING"; // determines which stage becomes active when a rejection event happens
    String status = "CANCELED"; // status of the stage
    Boolean approvalCommentRequired = true; // requires a comment on an approval event
    Boolean rejectionCommentRequired = true; // requires a comment on an rejection event
    Integer order = 56; // order of stage in approval chain
    List<ApprovalGroup> groups = Arrays.asList(); // list of groups that are involved in this approval stage
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String inclusionExpression = "inclusionExpression_example"; // optional custom expression to determine stage inclusion behavior
    String inclusionBehavior = "ONLY_INCLUDE_IF"; // determines whether stage is conditional based on an expression
    String expandExpression = "expandExpression_example"; // optional custom expression to determine approval request tree
    try {
      ApprovalChainStage result = client
              .approval
              .createChainStage(rejectBehavior, status, approvalCommentRequired, rejectionCommentRequired, order, groups, orgId, approvalChainId)
              .inclusionExpression(inclusionExpression)
              .inclusionBehavior(inclusionBehavior)
              .expandExpression(expandExpression)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getApprovalChainId());
      System.out.println(result.getInclusionExpression());
      System.out.println(result.getInclusionBehavior());
      System.out.println(result.getExpandExpression());
      System.out.println(result.getRejectBehavior());
      System.out.println(result.getStatus());
      System.out.println(result.getApprovalCommentRequired());
      System.out.println(result.getRejectionCommentRequired());
      System.out.println(result.getOrder());
      System.out.println(result.getGroups());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#createChainStage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalChainStage> response = client
              .approval
              .createChainStage(rejectBehavior, status, approvalCommentRequired, rejectionCommentRequired, order, groups, orgId, approvalChainId)
              .inclusionExpression(inclusionExpression)
              .inclusionBehavior(inclusionBehavior)
              .expandExpression(expandExpression)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#createChainStage");
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
| **approvalChainId** | **String**| Approval chain id | |
| **createApprovalChainStage** | [**CreateApprovalChainStage**](CreateApprovalChainStage.md)| Approval chain stage data to create | [optional] |

### Return type

[**ApprovalChainStage**](ApprovalChainStage.md)

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

<a name="createRequest"></a>
# **createRequest**
> ApprovalRequest createRequest(orgId, approvalChainId).dryRun(dryRun).approvalRequestCreateBody(approvalRequestCreateBody).execute();

Create an approval request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String entityId = "entityId_example";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    Boolean dryRun = true; // Dry run without creating real request
    try {
      ApprovalRequest result = client
              .approval
              .createRequest(entityId, orgId, approvalChainId)
              .dryRun(dryRun)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getCompReviewId());
      System.out.println(result.getApprovalChainId());
      System.out.println(result.getCreateId());
      System.out.println(result.getStageOverrides());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#createRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalRequest> response = client
              .approval
              .createRequest(entityId, orgId, approvalChainId)
              .dryRun(dryRun)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#createRequest");
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
| **approvalChainId** | **String**| Approval chain id | |
| **dryRun** | **Boolean**| Dry run without creating real request | [optional] |
| **approvalRequestCreateBody** | [**ApprovalRequestCreateBody**](ApprovalRequestCreateBody.md)| Approval request data to create | [optional] |

### Return type

[**ApprovalRequest**](ApprovalRequest.md)

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

<a name="deleteApprovalChainStage"></a>
# **deleteApprovalChainStage**
> deleteApprovalChainStage(orgId, approvalChainId, approvalChainStageId).execute();

Delete an approval chain stage



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String approvalChainStageId = "approvalChainStageId_example"; // Approval chain stage id
    try {
      client
              .approval
              .deleteApprovalChainStage(orgId, approvalChainId, approvalChainStageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#deleteApprovalChainStage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .approval
              .deleteApprovalChainStage(orgId, approvalChainId, approvalChainStageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#deleteApprovalChainStage");
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
| **approvalChainId** | **String**| Approval chain id | |
| **approvalChainStageId** | **String**| Approval chain stage id | |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deleteChainById"></a>
# **deleteChainById**
> deleteChainById(orgId, approvalChainId).execute();

Delete a approval chain



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    try {
      client
              .approval
              .deleteChainById(orgId, approvalChainId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#deleteChainById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .approval
              .deleteChainById(orgId, approvalChainId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#deleteChainById");
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
| **approvalChainId** | **String**| Approval chain id | |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deleteRequestApproval"></a>
# **deleteRequestApproval**
> deleteRequestApproval(orgId, approvalChainId, approvalRequestId).approvalRequestDeleteBody(approvalRequestDeleteBody).execute();

Delete an approval request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String approvalRequestId = "approvalRequestId_example"; // Approval request id
    String message = "message_example";
    try {
      client
              .approval
              .deleteRequestApproval(orgId, approvalChainId, approvalRequestId)
              .message(message)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#deleteRequestApproval");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .approval
              .deleteRequestApproval(orgId, approvalChainId, approvalRequestId)
              .message(message)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#deleteRequestApproval");
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
| **approvalChainId** | **String**| Approval chain id | |
| **approvalRequestId** | **String**| Approval request id | |
| **approvalRequestDeleteBody** | [**ApprovalRequestDeleteBody**](ApprovalRequestDeleteBody.md)| Body params for deletion | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="generateDefaultChainStages"></a>
# **generateDefaultChainStages**
> ApprovalChainStage generateDefaultChainStages(orgId).defaultChainCreateBody(defaultChainCreateBody).execute();

Build a default approval chain based on entity type



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String entityType = "COMP_REVIEW";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      ApprovalChainStage result = client
              .approval
              .generateDefaultChainStages(entityType, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getApprovalChainId());
      System.out.println(result.getInclusionExpression());
      System.out.println(result.getInclusionBehavior());
      System.out.println(result.getExpandExpression());
      System.out.println(result.getRejectBehavior());
      System.out.println(result.getStatus());
      System.out.println(result.getApprovalCommentRequired());
      System.out.println(result.getRejectionCommentRequired());
      System.out.println(result.getOrder());
      System.out.println(result.getGroups());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#generateDefaultChainStages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalChainStage> response = client
              .approval
              .generateDefaultChainStages(entityType, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#generateDefaultChainStages");
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
| **defaultChainCreateBody** | [**DefaultChainCreateBody**](DefaultChainCreateBody.md)| Approval request data to create | [optional] |

### Return type

[**ApprovalChainStage**](ApprovalChainStage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | org not found |  -  |

<a name="getAllApprovalRequestsForApprovalChain"></a>
# **getAllApprovalRequestsForApprovalChain**
> ResultsApprovalRequest getAllApprovalRequestsForApprovalChain(orgId, approvalChainId).limit(limit).entityType(entityType).entityIds(entityIds).execute();

Return all approval requests for an approval chain



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    Integer limit = 56; // Number of results to return
    String entityType = "COMP_REVIEW"; // entity type to filter on
    String entityIds = "entityIds_example"; // entity ids to filter on
    try {
      ResultsApprovalRequest result = client
              .approval
              .getAllApprovalRequestsForApprovalChain(orgId, approvalChainId)
              .limit(limit)
              .entityType(entityType)
              .entityIds(entityIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getAllApprovalRequestsForApprovalChain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsApprovalRequest> response = client
              .approval
              .getAllApprovalRequestsForApprovalChain(orgId, approvalChainId)
              .limit(limit)
              .entityType(entityType)
              .entityIds(entityIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getAllApprovalRequestsForApprovalChain");
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
| **approvalChainId** | **String**| Approval chain id | |
| **limit** | **Integer**| Number of results to return | [optional] |
| **entityType** | **String**| entity type to filter on | [optional] [enum: COMP_REVIEW, SCENARIO, TIMEOFF] |
| **entityIds** | **String**| entity ids to filter on | [optional] |

### Return type

[**ResultsApprovalRequest**](ResultsApprovalRequest.md)

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

<a name="getAllStagesForChain"></a>
# **getAllStagesForChain**
> ApprovalChainStage getAllStagesForChain(orgId, approvalChainId, approvalChainStageId).execute();

Return all approval chain stages for an approval chain



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String approvalChainStageId = "approvalChainStageId_example"; // Approval chain stage id
    try {
      ApprovalChainStage result = client
              .approval
              .getAllStagesForChain(orgId, approvalChainId, approvalChainStageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getApprovalChainId());
      System.out.println(result.getInclusionExpression());
      System.out.println(result.getInclusionBehavior());
      System.out.println(result.getExpandExpression());
      System.out.println(result.getRejectBehavior());
      System.out.println(result.getStatus());
      System.out.println(result.getApprovalCommentRequired());
      System.out.println(result.getRejectionCommentRequired());
      System.out.println(result.getOrder());
      System.out.println(result.getGroups());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getAllStagesForChain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalChainStage> response = client
              .approval
              .getAllStagesForChain(orgId, approvalChainId, approvalChainStageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getAllStagesForChain");
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
| **approvalChainId** | **String**| Approval chain id | |
| **approvalChainStageId** | **String**| Approval chain stage id | |

### Return type

[**ApprovalChainStage**](ApprovalChainStage.md)

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

<a name="getApprovalChainById"></a>
# **getApprovalChainById**
> ApprovalChain getApprovalChainById(orgId, approvalChainId).execute();

Return a particular approval chain by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    try {
      ApprovalChain result = client
              .approval
              .getApprovalChainById(orgId, approvalChainId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getName());
      System.out.println(result.getIsPreview());
      System.out.println(result.getFallbackApproverJobId());
      System.out.println(result.getFallbackApproverJobError());
      System.out.println(result.getApprovalNotifierUserIds());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getApprovalChainById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalChain> response = client
              .approval
              .getApprovalChainById(orgId, approvalChainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getApprovalChainById");
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
| **approvalChainId** | **String**| Approval chain id | |

### Return type

[**ApprovalChain**](ApprovalChain.md)

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

<a name="getApprovalChainStages"></a>
# **getApprovalChainStages**
> ResultsApprovalChainStage getApprovalChainStages(orgId, approvalChainId).limit(limit).execute();

Return all approval chain stages for an approval chain



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    Integer limit = 56; // Number of results to return
    try {
      ResultsApprovalChainStage result = client
              .approval
              .getApprovalChainStages(orgId, approvalChainId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getApprovalChainStages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsApprovalChainStage> response = client
              .approval
              .getApprovalChainStages(orgId, approvalChainId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getApprovalChainStages");
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
| **approvalChainId** | **String**| Approval chain id | |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsApprovalChainStage**](ResultsApprovalChainStage.md)

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

<a name="getApprovalChains"></a>
# **getApprovalChains**
> ResultsApprovalChain getApprovalChains(orgId).entityType(entityType).entityId(entityId).limit(limit).execute();

Return approval chains



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String entityType = "COMP_REVIEW"; // The type of entity
    String entityId = "entityId_example"; // the id of the entity
    Integer limit = 56; // Number of results to return
    try {
      ResultsApprovalChain result = client
              .approval
              .getApprovalChains(orgId)
              .entityType(entityType)
              .entityId(entityId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getApprovalChains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsApprovalChain> response = client
              .approval
              .getApprovalChains(orgId)
              .entityType(entityType)
              .entityId(entityId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getApprovalChains");
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
| **entityType** | **String**| The type of entity | [optional] [enum: COMP_REVIEW, SCENARIO, TIMEOFF] |
| **entityId** | **String**| the id of the entity | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsApprovalChain**](ResultsApprovalChain.md)

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

<a name="getCompReviewResponsesForChain"></a>
# **getCompReviewResponsesForChain**
> ResultsApprovalRequestCompReviewResponse getCompReviewResponsesForChain(orgId, approvalChainId).limit(limit).entityIds(entityIds).execute();

Return all approval request comp review responses for an approval chain



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    Integer limit = 56; // Number of results to return
    List<String> entityIds = Arrays.asList(); // entity ids to filter on
    try {
      ResultsApprovalRequestCompReviewResponse result = client
              .approval
              .getCompReviewResponsesForChain(orgId, approvalChainId)
              .limit(limit)
              .entityIds(entityIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getCompReviewResponsesForChain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsApprovalRequestCompReviewResponse> response = client
              .approval
              .getCompReviewResponsesForChain(orgId, approvalChainId)
              .limit(limit)
              .entityIds(entityIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getCompReviewResponsesForChain");
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
| **approvalChainId** | **String**| Approval chain id | |
| **limit** | **Integer**| Number of results to return | [optional] |
| **entityIds** | [**List&lt;String&gt;**](String.md)| entity ids to filter on | [optional] |

### Return type

[**ResultsApprovalRequestCompReviewResponse**](ResultsApprovalRequestCompReviewResponse.md)

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

<a name="getScenarioResponses"></a>
# **getScenarioResponses**
> ResultsApprovalRequestScenarioResponse getScenarioResponses(orgId, approvalChainId).limit(limit).entityIds(entityIds).execute();

Return all approval request scenario responses for an approval chain



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    Integer limit = 56; // Number of results to return
    String entityIds = "entityIds_example"; // entity ids to filter on
    try {
      ResultsApprovalRequestScenarioResponse result = client
              .approval
              .getScenarioResponses(orgId, approvalChainId)
              .limit(limit)
              .entityIds(entityIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getScenarioResponses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsApprovalRequestScenarioResponse> response = client
              .approval
              .getScenarioResponses(orgId, approvalChainId)
              .limit(limit)
              .entityIds(entityIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#getScenarioResponses");
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
| **approvalChainId** | **String**| Approval chain id | |
| **limit** | **Integer**| Number of results to return | [optional] |
| **entityIds** | **String**| entity ids to filter on | [optional] |

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

<a name="reassignApproverAtStage"></a>
# **reassignApproverAtStage**
> reassignApproverAtStage(orgId, approvalChainId, approvalRequestId).reassignApproverPatchBody(reassignApproverPatchBody).execute();

Reassigning an approver at a stage



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Integer stageOrder = 56;
    String initialJobId = "initialJobId_example";
    String reassignJobId = "reassignJobId_example";
    String message = "message_example";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String approvalRequestId = "approvalRequestId_example"; // approval request id
    try {
      client
              .approval
              .reassignApproverAtStage(stageOrder, initialJobId, reassignJobId, message, orgId, approvalChainId, approvalRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#reassignApproverAtStage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .approval
              .reassignApproverAtStage(stageOrder, initialJobId, reassignJobId, message, orgId, approvalChainId, approvalRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#reassignApproverAtStage");
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
| **approvalChainId** | **String**| Approval chain id | |
| **approvalRequestId** | **String**| approval request id | |
| **reassignApproverPatchBody** | [**ReassignApproverPatchBody**](ReassignApproverPatchBody.md)| approval request data to update | [optional] |

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

<a name="requestApprovalRequest"></a>
# **requestApprovalRequest**
> ApprovalRequest requestApprovalRequest(orgId, approvalChainId, approvalRequestId).execute();

Return an approval request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String approvalRequestId = "approvalRequestId_example"; // Approval request id
    try {
      ApprovalRequest result = client
              .approval
              .requestApprovalRequest(orgId, approvalChainId, approvalRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getCompReviewId());
      System.out.println(result.getApprovalChainId());
      System.out.println(result.getCreateId());
      System.out.println(result.getStageOverrides());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#requestApprovalRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApprovalRequest> response = client
              .approval
              .requestApprovalRequest(orgId, approvalChainId, approvalRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#requestApprovalRequest");
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
| **approvalChainId** | **String**| Approval chain id | |
| **approvalRequestId** | **String**| Approval request id | |

### Return type

[**ApprovalRequest**](ApprovalRequest.md)

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

<a name="sendStageReviewerReminder"></a>
# **sendStageReviewerReminder**
> sendStageReviewerReminder(orgId, approvalChainId, approvalRequestId).sendReminderBody(sendReminderBody).execute();

Send a reminder for a stage reviewer in an existing approval request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String jobId = "jobId_example";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String approvalRequestId = "approvalRequestId_example"; // approval request id
    try {
      client
              .approval
              .sendStageReviewerReminder(jobId, orgId, approvalChainId, approvalRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#sendStageReviewerReminder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .approval
              .sendStageReviewerReminder(jobId, orgId, approvalChainId, approvalRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#sendStageReviewerReminder");
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
| **approvalChainId** | **String**| Approval chain id | |
| **approvalRequestId** | **String**| approval request id | |
| **sendReminderBody** | [**SendReminderBody**](SendReminderBody.md)| reminder body | [optional] |

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

<a name="updateChain"></a>
# **updateChain**
> updateChain(orgId, approvalChainId).updateApprovalChain(updateApprovalChain).execute();

Update a approval chain



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // approval chain id
    String name = "name_example"; // human-readable name of approval chain
    Boolean isPreview = true; // isPreview specifies that this is a preview for implementations that use it (e.g. Compensation Reviews)
    String fallbackApproverJobId = "fallbackApproverJobId_example"; // the jobId of the fallback approver
    String fallbackApproverJobError = "fallbackApproverJobError_example"; // most recent error for fallback approver
    Set<String> approvalNotifierUserIds = Arrays.asList(); // ids of any users who should be notified when approval is complete
    try {
      client
              .approval
              .updateChain(orgId, approvalChainId)
              .name(name)
              .isPreview(isPreview)
              .fallbackApproverJobId(fallbackApproverJobId)
              .fallbackApproverJobError(fallbackApproverJobError)
              .approvalNotifierUserIds(approvalNotifierUserIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#updateChain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .approval
              .updateChain(orgId, approvalChainId)
              .name(name)
              .isPreview(isPreview)
              .fallbackApproverJobId(fallbackApproverJobId)
              .fallbackApproverJobError(fallbackApproverJobError)
              .approvalNotifierUserIds(approvalNotifierUserIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#updateChain");
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
| **approvalChainId** | **String**| approval chain id | |
| **updateApprovalChain** | [**UpdateApprovalChain**](UpdateApprovalChain.md)|  | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="updateExistingRequest"></a>
# **updateExistingRequest**
> updateExistingRequest(orgId, approvalChainId, approvalRequestId).previewJobId(previewJobId).approvalRequestPatchBody(approvalRequestPatchBody).execute();

Update an existing approval request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
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
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String approvalRequestId = "approvalRequestId_example"; // approval request id
    String message = "message_example";
    String previewJobId = "previewJobId_example"; // preview-as job id
    try {
      client
              .approval
              .updateExistingRequest(status, orgId, approvalChainId, approvalRequestId)
              .message(message)
              .previewJobId(previewJobId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#updateExistingRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .approval
              .updateExistingRequest(status, orgId, approvalChainId, approvalRequestId)
              .message(message)
              .previewJobId(previewJobId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#updateExistingRequest");
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
| **approvalChainId** | **String**| Approval chain id | |
| **approvalRequestId** | **String**| approval request id | |
| **previewJobId** | **String**| preview-as job id | [optional] |
| **approvalRequestPatchBody** | [**ApprovalRequestPatchBody**](ApprovalRequestPatchBody.md)| approval request data to update | [optional] |

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

<a name="updateStageById"></a>
# **updateStageById**
> updateStageById(orgId, approvalChainId, approvalChainStageId).updateApprovalChainStage(updateApprovalChainStage).execute();

Update an existing approval chain stage



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApprovalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String approvalChainId = "approvalChainId_example"; // Approval chain id
    String approvalChainStageId = "approvalChainStageId_example"; // approval chain stage id
    String inclusionExpression = "inclusionExpression_example"; // optional custom expression to determine stage inclusion behavior
    String inclusionBehavior = "ONLY_INCLUDE_IF"; // determines whether stage is conditional based on an expression
    String expandExpression = "expandExpression_example"; // optional custom expression to determine approval request tree
    String rejectBehavior = "BACK_TO_BEGINNING"; // determines which stage becomes active when a rejection event happens
    String status = "CANCELED"; // status of the stage
    Boolean approvalCommentRequired = true; // requires a comment on an approval event
    Boolean rejectionCommentRequired = true; // requires a comment on an rejection event
    Integer order = 56; // order of stage in approval chain
    List<ApprovalGroup> groups = Arrays.asList(); // list of groups that are involved in this approval stage
    try {
      client
              .approval
              .updateStageById(orgId, approvalChainId, approvalChainStageId)
              .inclusionExpression(inclusionExpression)
              .inclusionBehavior(inclusionBehavior)
              .expandExpression(expandExpression)
              .rejectBehavior(rejectBehavior)
              .status(status)
              .approvalCommentRequired(approvalCommentRequired)
              .rejectionCommentRequired(rejectionCommentRequired)
              .order(order)
              .groups(groups)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#updateStageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .approval
              .updateStageById(orgId, approvalChainId, approvalChainStageId)
              .inclusionExpression(inclusionExpression)
              .inclusionBehavior(inclusionBehavior)
              .expandExpression(expandExpression)
              .rejectBehavior(rejectBehavior)
              .status(status)
              .approvalCommentRequired(approvalCommentRequired)
              .rejectionCommentRequired(rejectionCommentRequired)
              .order(order)
              .groups(groups)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalApi#updateStageById");
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
| **approvalChainId** | **String**| Approval chain id | |
| **approvalChainStageId** | **String**| approval chain stage id | |
| **updateApprovalChainStage** | [**UpdateApprovalChainStage**](UpdateApprovalChainStage.md)| approval chain stage data to update | [optional] |

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

