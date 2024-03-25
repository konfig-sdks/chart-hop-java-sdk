# UsageApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**recordProductFeatureUsage**](UsageApi.md#recordProductFeatureUsage) | **POST** /v1/org/{orgId}/usage/{type} | Record usage of a product feature |


<a name="recordProductFeatureUsage"></a>
# **recordProductFeatureUsage**
> recordProductFeatureUsage(orgId, type).entityId(entityId).execute();

Record usage of a product feature



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Type of usage
    String entityId = "entityId_example"; // Entity id, if applicable
    try {
      client
              .usage
              .recordProductFeatureUsage(orgId, type)
              .entityId(entityId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#recordProductFeatureUsage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .usage
              .recordProductFeatureUsage(orgId, type)
              .entityId(entityId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#recordProductFeatureUsage");
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
| **type** | **String**| Type of usage | |
| **entityId** | **String**| Entity id, if applicable | [optional] |

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

