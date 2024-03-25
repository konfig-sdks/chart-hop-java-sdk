# PreloadApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**preloadedDataRetrieval**](PreloadApi.md#preloadedDataRetrieval) | **GET** /v1/org/{orgId}/preload | Return a set of pre-loaded data required by the web app |


<a name="preloadedDataRetrieval"></a>
# **preloadedDataRetrieval**
> PreloadResponse preloadedDataRetrieval(orgId).execute();

Return a set of pre-loaded data required by the web app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PreloadApi;
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
      PreloadResponse result = client
              .preload
              .preloadedDataRetrieval(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrg());
      System.out.println(result.getOrgs());
      System.out.println(result.getUser());
      System.out.println(result.getRole());
      System.out.println(result.getViewUser());
      System.out.println(result.getViewRole());
      System.out.println(result.getGroups());
      System.out.println(result.getScenarios());
      System.out.println(result.getUsers());
      System.out.println(result.getFields());
      System.out.println(result.getForms());
      System.out.println(result.getExchangeRate());
      System.out.println(result.getStock());
      System.out.println(result.getJob());
      System.out.println(result.getCustomer());
      System.out.println(result.getCustomerDetails());
      System.out.println(result.getFeatureAccess());
      System.out.println(result.getEnabledFeatureOptions());
      System.out.println(result.getCategories());
      System.out.println(result.getCategorySort());
      System.out.println(result.getOrgConfig());
      System.out.println(result.getJobs());
      System.out.println(result.getPersons());
      System.out.println(result.getCompBands());
      System.out.println(result.getUiAccess());
      System.out.println(result.getQuestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PreloadApi#preloadedDataRetrieval");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PreloadResponse> response = client
              .preload
              .preloadedDataRetrieval(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PreloadApi#preloadedDataRetrieval");
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

### Return type

[**PreloadResponse**](PreloadResponse.md)

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

