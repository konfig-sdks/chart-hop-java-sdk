# AccessApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**entityActions**](AccessApi.md#entityActions) | **GET** /v1/org/{orgId}/access/entity/{type} | Return the appropriate actions that can be performed on an entity or set of entities |


<a name="entityActions"></a>
# **entityActions**
> AccessResponse entityActions(orgId, type).id(id).action(action).fields(fields).date(date).scenarioId(scenarioId).execute();

Return the appropriate actions that can be performed on an entity or set of entities



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Entity type
    String id = "id_example"; // Entity ids
    String action = "action_example"; // Actions, defaults to update,delete
    String fields = "fields_example"; // Fields to check, defaults to all fields
    LocalDate date = LocalDate.now(); // Date, defaults to today
    String scenarioId = "scenarioId_example"; // Scenario id, defaults to primary
    try {
      AccessResponse result = client
              .access
              .entityActions(orgId, type)
              .id(id)
              .action(action)
              .fields(fields)
              .date(date)
              .scenarioId(scenarioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#entityActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessResponse> response = client
              .access
              .entityActions(orgId, type)
              .id(id)
              .action(action)
              .fields(fields)
              .date(date)
              .scenarioId(scenarioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#entityActions");
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
| **type** | **String**| Entity type | |
| **id** | **String**| Entity ids | [optional] |
| **action** | **String**| Actions, defaults to update,delete | [optional] |
| **fields** | **String**| Fields to check, defaults to all fields | [optional] |
| **date** | **LocalDate**| Date, defaults to today | [optional] |
| **scenarioId** | **String**| Scenario id, defaults to primary | [optional] |

### Return type

[**AccessResponse**](AccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |

