# OnboardApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**incompleteSteps**](OnboardApi.md#incompleteSteps) | **GET** /v1/org/{orgId}/onboard | Returns all the onboarding steps the organization has not completed |
| [**markStepSkipped**](OnboardApi.md#markStepSkipped) | **POST** /v1/org/{orgId}/onboard/{stepName}/skip | Marks the given onboard step as &#39;skipped&#39; for the given customer |


<a name="incompleteSteps"></a>
# **incompleteSteps**
> ResultsOnboardStep incompleteSteps(orgId).getUncomplete(getUncomplete).execute();

Returns all the onboarding steps the organization has not completed



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnboardApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    Boolean getUncomplete = true; // Return only uncompleted steps, or all steps?
    try {
      ResultsOnboardStep result = client
              .onboard
              .incompleteSteps(orgId)
              .getUncomplete(getUncomplete)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardApi#incompleteSteps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsOnboardStep> response = client
              .onboard
              .incompleteSteps(orgId)
              .getUncomplete(getUncomplete)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardApi#incompleteSteps");
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
| **getUncomplete** | **Boolean**| Return only uncompleted steps, or all steps? | [optional] |

### Return type

[**ResultsOnboardStep**](ResultsOnboardStep.md)

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

<a name="markStepSkipped"></a>
# **markStepSkipped**
> markStepSkipped(orgId, stepName).execute();

Marks the given onboard step as &#39;skipped&#39; for the given customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnboardApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String stepName = "stepName_example"; // Step name
    try {
      client
              .onboard
              .markStepSkipped(orgId, stepName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardApi#markStepSkipped");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .onboard
              .markStepSkipped(orgId, stepName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardApi#markStepSkipped");
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
| **stepName** | **String**| Step name | |

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
| **404** | not found |  -  |

