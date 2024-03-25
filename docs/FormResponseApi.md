# FormResponseApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByForm**](FormResponseApi.md#getByForm) | **GET** /v1/org/{orgId}/form-response | Return form responses by form |
| [**getById**](FormResponseApi.md#getById) | **GET** /v1/org/{orgId}/form-response/{formResponseId} | Return a particular form response by id |
| [**getFormResponseCount**](FormResponseApi.md#getFormResponseCount) | **GET** /v1/org/{orgId}/form-response/count | Return the total count of form responses by form |
| [**removeById**](FormResponseApi.md#removeById) | **DELETE** /v1/org/{orgId}/form-response/{formResponseId} | Delete a form response |
| [**updateAnswersMetadata**](FormResponseApi.md#updateAnswersMetadata) | **POST** /v1/org/{orgId}/form-response/{formResponseId} | Re-submit (update) an existing form response&#39;s answers |
| [**updateMetadata**](FormResponseApi.md#updateMetadata) | **PATCH** /v1/org/{orgId}/form-response/{formResponseId} | Update an existing form response&#39;s metadata, such as shareAccess information |


<a name="getByForm"></a>
# **getByForm**
> getByForm(orgId).formId(formId).assessmentId(assessmentId).submitPersonId(submitPersonId).targetId(targetId).from(from).limit(limit).returnAccess(returnAccess).format(format).execute();

Return form responses by form



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormResponseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id to filter by
    String assessmentId = "assessmentId_example"; // Assessment id to filter by
    String submitPersonId = "submitPersonId_example"; // Person id to filter by (person who submitted the form)
    String targetId = "targetId_example"; // Target id to filter by
    String from = "from_example"; // FormResponse id to start paginating from
    Integer limit = 56; // Number of results to return
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      client
              .formResponse
              .getByForm(orgId)
              .formId(formId)
              .assessmentId(assessmentId)
              .submitPersonId(submitPersonId)
              .targetId(targetId)
              .from(from)
              .limit(limit)
              .returnAccess(returnAccess)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#getByForm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .formResponse
              .getByForm(orgId)
              .formId(formId)
              .assessmentId(assessmentId)
              .submitPersonId(submitPersonId)
              .targetId(targetId)
              .from(from)
              .limit(limit)
              .returnAccess(returnAccess)
              .format(format)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#getByForm");
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
| **formId** | **String**| Form id to filter by | [optional] |
| **assessmentId** | **String**| Assessment id to filter by | [optional] |
| **submitPersonId** | **String**| Person id to filter by (person who submitted the form) | [optional] |
| **targetId** | **String**| Target id to filter by | [optional] |
| **from** | **String**| FormResponse id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

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

<a name="getById"></a>
# **getById**
> FormResponse getById(orgId, formResponseId).format(format).execute();

Return a particular form response by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormResponseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formResponseId = "formResponseId_example"; // FormResponse id
    String format = "format_example"; // Data format to use for answers; default is json, can also use json-extended or json-readable
    try {
      FormResponse result = client
              .formResponse
              .getById(orgId, formResponseId)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getExternalId());
      System.out.println(result.getFormId());
      System.out.println(result.getFormVersionId());
      System.out.println(result.getSubmitPersonId());
      System.out.println(result.getSubmitUserId());
      System.out.println(result.getChangeId());
      System.out.println(result.getAssessmentId());
      System.out.println(result.getShareAccess());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getTargetEntityId());
      System.out.println(result.getTargetEntityType());
      System.out.println(result.getAnswers());
      System.out.println(result.getSubmitAt());
      System.out.println(result.getApprovalAt());
      System.out.println(result.getApprovalId());
      System.out.println(result.getApprovalNote());
      System.out.println(result.getStatus());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FormResponse> response = client
              .formResponse
              .getById(orgId, formResponseId)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#getById");
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
| **formResponseId** | **String**| FormResponse id | |
| **format** | **String**| Data format to use for answers; default is json, can also use json-extended or json-readable | [optional] |

### Return type

[**FormResponse**](FormResponse.md)

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

<a name="getFormResponseCount"></a>
# **getFormResponseCount**
> FormResponseCount getFormResponseCount(orgId).formId(formId).assessmentId(assessmentId).submitPersonId(submitPersonId).targetId(targetId).questionId(questionId).execute();

Return the total count of form responses by form



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormResponseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id to filter by
    String assessmentId = "assessmentId_example"; // Assessment id to filter by
    String submitPersonId = "submitPersonId_example"; // Person id to filter by (person who submitted the form)
    String targetId = "targetId_example"; // Target id to filter by
    String questionId = "questionId_example"; // Question id to filter by
    try {
      FormResponseCount result = client
              .formResponse
              .getFormResponseCount(orgId)
              .formId(formId)
              .assessmentId(assessmentId)
              .submitPersonId(submitPersonId)
              .targetId(targetId)
              .questionId(questionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#getFormResponseCount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FormResponseCount> response = client
              .formResponse
              .getFormResponseCount(orgId)
              .formId(formId)
              .assessmentId(assessmentId)
              .submitPersonId(submitPersonId)
              .targetId(targetId)
              .questionId(questionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#getFormResponseCount");
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
| **formId** | **String**| Form id to filter by | [optional] |
| **assessmentId** | **String**| Assessment id to filter by | [optional] |
| **submitPersonId** | **String**| Person id to filter by (person who submitted the form) | [optional] |
| **targetId** | **String**| Target id to filter by | [optional] |
| **questionId** | **String**| Question id to filter by | [optional] |

### Return type

[**FormResponseCount**](FormResponseCount.md)

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
> removeById(orgId, formResponseId).execute();

Delete a form response



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormResponseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formResponseId = "formResponseId_example"; // FormResponse id
    try {
      client
              .formResponse
              .removeById(orgId, formResponseId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .formResponse
              .removeById(orgId, formResponseId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#removeById");
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
| **formResponseId** | **String**| FormResponse id | |

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

<a name="updateAnswersMetadata"></a>
# **updateAnswersMetadata**
> updateAnswersMetadata(orgId, formResponseId).requestBody(requestBody).execute();

Re-submit (update) an existing form response&#39;s answers



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormResponseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formResponseId = "formResponseId_example"; // FormResponse id
    try {
      client
              .formResponse
              .updateAnswersMetadata(orgId, formResponseId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#updateAnswersMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .formResponse
              .updateAnswersMetadata(orgId, formResponseId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#updateAnswersMetadata");
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
| **formResponseId** | **String**| FormResponse id | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| FormResponse data to update | [optional] |

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

<a name="updateMetadata"></a>
# **updateMetadata**
> updateMetadata(orgId, formResponseId).updateFormResponse(updateFormResponse).execute();

Update an existing form response&#39;s metadata, such as shareAccess information



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormResponseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formResponseId = "formResponseId_example"; // FormResponse id
    List<ShareAccess> shareAccess = Arrays.asList(); // list of share access, if the form response has been shared with anyone
    try {
      client
              .formResponse
              .updateMetadata(orgId, formResponseId)
              .shareAccess(shareAccess)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#updateMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .formResponse
              .updateMetadata(orgId, formResponseId)
              .shareAccess(shareAccess)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormResponseApi#updateMetadata");
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
| **formResponseId** | **String**| FormResponse id | |
| **updateFormResponse** | [**UpdateFormResponse**](UpdateFormResponse.md)| FormResponse data to update | [optional] |

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

