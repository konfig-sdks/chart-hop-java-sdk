# CommentApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewComment**](CommentApi.md#createNewComment) | **POST** /v1/org/{orgId}/comment | Post a comment |
| [**getByEntityId**](CommentApi.md#getByEntityId) | **GET** /v1/org/{orgId}/comment/entity/{entityId} | Return comments on a particular entity paginated |
| [**getById**](CommentApi.md#getById) | **GET** /v1/org/{orgId}/comment/{commentId} | Return a particular comment by id |
| [**listCommentsOnCompReview**](CommentApi.md#listCommentsOnCompReview) | **GET** /v1/org/{orgId}/comment/comp-review/{compReviewId} | Return comments on changes within a comp review, paginated |
| [**listCommentsOnScenarioAndChanges**](CommentApi.md#listCommentsOnScenarioAndChanges) | **GET** /v1/org/{orgId}/comment/scenario/{scenarioId} | Return comments on a scenario and the changes within, paginated |
| [**removeById**](CommentApi.md#removeById) | **DELETE** /v1/org/{orgId}/comment/{commentId} | Delete a comment |


<a name="createNewComment"></a>
# **createNewComment**
> Comment createNewComment(orgId).createComment(createComment).execute();

Post a comment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String entityId = "entityId_example"; // entity the comment was posted on
    String entityType = "CHANGE"; // type of entity the comment was posted on
    Markup content = new Markup();
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String parentEntityId = "parentEntityId_example"; // parent entity id that this comment belongs to, should be used with entityId
    try {
      Comment result = client
              .comment
              .createNewComment(entityId, entityType, content, orgId)
              .parentEntityId(parentEntityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getParentEntityId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getContent());
      System.out.println(result.getCreateAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getDeleteAt());
      System.out.println(result.getDeleteId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#createNewComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comment> response = client
              .comment
              .createNewComment(entityId, entityType, content, orgId)
              .parentEntityId(parentEntityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#createNewComment");
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
| **createComment** | [**CreateComment**](CreateComment.md)| Comment data to create | [optional] |

### Return type

[**Comment**](Comment.md)

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

<a name="getByEntityId"></a>
# **getByEntityId**
> ResultsComment getByEntityId(orgId, entityId).from(from).limit(limit).desc(desc).execute();

Return comments on a particular entity paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String entityId = "entityId_example"; // Entity id
    String from = "from_example"; // Comment id to start paginating from
    Integer limit = 56; // Number of results to return
    Boolean desc = true; // Descending (default false)
    try {
      ResultsComment result = client
              .comment
              .getByEntityId(orgId, entityId)
              .from(from)
              .limit(limit)
              .desc(desc)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#getByEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsComment> response = client
              .comment
              .getByEntityId(orgId, entityId)
              .from(from)
              .limit(limit)
              .desc(desc)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#getByEntityId");
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
| **entityId** | **String**| Entity id | |
| **from** | **String**| Comment id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **desc** | **Boolean**| Descending (default false) | [optional] |

### Return type

[**ResultsComment**](ResultsComment.md)

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
> Comment getById(orgId, commentId).execute();

Return a particular comment by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String commentId = "commentId_example"; // Comment id
    try {
      Comment result = client
              .comment
              .getById(orgId, commentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getParentEntityId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getContent());
      System.out.println(result.getCreateAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getDeleteAt());
      System.out.println(result.getDeleteId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comment> response = client
              .comment
              .getById(orgId, commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#getById");
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
| **commentId** | **String**| Comment id | |

### Return type

[**Comment**](Comment.md)

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

<a name="listCommentsOnCompReview"></a>
# **listCommentsOnCompReview**
> ResultsComment listCommentsOnCompReview(orgId, compReviewId).approvalRequestId(approvalRequestId).from(from).limit(limit).desc(desc).isPreview(isPreview).jobId(jobId).execute();

Return comments on changes within a comp review, paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentApi;
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
    String from = "from_example"; // Comment id to start paginating from
    Integer limit = 56; // Number of results to return
    Boolean desc = true; // Descending (default false)
    Boolean isPreview = true; // Whether comments are viewed in preview mode, defaults false
    String jobId = "jobId_example"; // Optional preview user jobId
    try {
      ResultsComment result = client
              .comment
              .listCommentsOnCompReview(orgId, compReviewId)
              .approvalRequestId(approvalRequestId)
              .from(from)
              .limit(limit)
              .desc(desc)
              .isPreview(isPreview)
              .jobId(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#listCommentsOnCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsComment> response = client
              .comment
              .listCommentsOnCompReview(orgId, compReviewId)
              .approvalRequestId(approvalRequestId)
              .from(from)
              .limit(limit)
              .desc(desc)
              .isPreview(isPreview)
              .jobId(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#listCommentsOnCompReview");
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
| **from** | **String**| Comment id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **desc** | **Boolean**| Descending (default false) | [optional] |
| **isPreview** | **Boolean**| Whether comments are viewed in preview mode, defaults false | [optional] |
| **jobId** | **String**| Optional preview user jobId | [optional] |

### Return type

[**ResultsComment**](ResultsComment.md)

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

<a name="listCommentsOnScenarioAndChanges"></a>
# **listCommentsOnScenarioAndChanges**
> ResultsComment listCommentsOnScenarioAndChanges(orgId, scenarioId).from(from).limit(limit).desc(desc).includeChangeComments(includeChangeComments).execute();

Return comments on a scenario and the changes within, paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentApi;
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
    String from = "from_example"; // Comment id to start paginating from
    Integer limit = 56; // Number of results to return
    Boolean desc = true; // Descending (default false)
    Boolean includeChangeComments = true; // Whether to also include comments on changes within the scenario (default false)
    try {
      ResultsComment result = client
              .comment
              .listCommentsOnScenarioAndChanges(orgId, scenarioId)
              .from(from)
              .limit(limit)
              .desc(desc)
              .includeChangeComments(includeChangeComments)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#listCommentsOnScenarioAndChanges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsComment> response = client
              .comment
              .listCommentsOnScenarioAndChanges(orgId, scenarioId)
              .from(from)
              .limit(limit)
              .desc(desc)
              .includeChangeComments(includeChangeComments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#listCommentsOnScenarioAndChanges");
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
| **from** | **String**| Comment id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **desc** | **Boolean**| Descending (default false) | [optional] |
| **includeChangeComments** | **Boolean**| Whether to also include comments on changes within the scenario (default false) | [optional] |

### Return type

[**ResultsComment**](ResultsComment.md)

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

<a name="removeById"></a>
# **removeById**
> removeById(orgId, commentId).execute();

Delete a comment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String commentId = "commentId_example"; // Comment id
    try {
      client
              .comment
              .removeById(orgId, commentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .comment
              .removeById(orgId, commentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#removeById");
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
| **commentId** | **String**| Comment id | |

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

