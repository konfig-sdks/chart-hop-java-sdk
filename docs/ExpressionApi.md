# ExpressionApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evaluateCarrotExpression**](ExpressionApi.md#evaluateCarrotExpression) | **POST** /v1/org/{orgId}/cql/evaluate | Evaluate carrot expression |
| [**validateCarrotExpression**](ExpressionApi.md#validateCarrotExpression) | **POST** /v1/org/{orgId}/cql/validate | Validate carrot expression(s) |


<a name="evaluateCarrotExpression"></a>
# **evaluateCarrotExpression**
> EvaluateExpressionResponse evaluateCarrotExpression(orgId).evaluateExpressionRequest(evaluateExpressionRequest).execute();

Evaluate carrot expression



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpressionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String expr = "expr_example";
    String entityType = "ACTION";
    String entityId = "entityId_example";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      EvaluateExpressionResponse result = client
              .expression
              .evaluateCarrotExpression(expr, entityType, entityId, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpressionApi#evaluateCarrotExpression");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EvaluateExpressionResponse> response = client
              .expression
              .evaluateCarrotExpression(expr, entityType, entityId, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpressionApi#evaluateCarrotExpression");
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
| **evaluateExpressionRequest** | [**EvaluateExpressionRequest**](EvaluateExpressionRequest.md)| Expression to be evaluated | [optional] |

### Return type

[**EvaluateExpressionResponse**](EvaluateExpressionResponse.md)

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

<a name="validateCarrotExpression"></a>
# **validateCarrotExpression**
> ValidateExpressionResponse validateCarrotExpression(orgId).validateExpressionRequest(validateExpressionRequest).execute();

Validate carrot expression(s)



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpressionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    List<String> expressions = Arrays.asList();
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      ValidateExpressionResponse result = client
              .expression
              .validateCarrotExpression(expressions, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsValid());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpressionApi#validateCarrotExpression");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ValidateExpressionResponse> response = client
              .expression
              .validateCarrotExpression(expressions, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpressionApi#validateCarrotExpression");
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
| **validateExpressionRequest** | [**ValidateExpressionRequest**](ValidateExpressionRequest.md)| Expression to be validated | [optional] |

### Return type

[**ValidateExpressionResponse**](ValidateExpressionResponse.md)

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

