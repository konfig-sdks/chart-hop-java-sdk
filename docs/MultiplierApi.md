# MultiplierApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMultiplier**](MultiplierApi.md#createNewMultiplier) | **POST** /v1/org/{orgId}/multiplier | Create a multiplier |
| [**deleteMultiplierById**](MultiplierApi.md#deleteMultiplierById) | **DELETE** /v1/org/{orgId}/multiplier/{multiplierId} | Delete a multiplier |
| [**findCompBandMultipliersInOrg**](MultiplierApi.md#findCompBandMultipliersInOrg) | **GET** /v1/org/{orgId}/multiplier/{multiplierId} | Return a particular comp band multiplier by id on an effective date |
| [**findCompBandMultipliersInOrg_0**](MultiplierApi.md#findCompBandMultipliersInOrg_0) | **GET** /v1/org/{orgId}/multiplier | Find comp band multipliers in the organization |
| [**updateMultiplerById**](MultiplierApi.md#updateMultiplerById) | **PATCH** /v1/org/{orgId}/multiplier/{multiplierId} | Update a multiplier |


<a name="createNewMultiplier"></a>
# **createNewMultiplier**
> createNewMultiplier(orgId).date(date).createMultiplier(createMultiplier).execute();

Create a multiplier



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MultiplierApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // human-readable name of multiplier
    Double value = 3.4D; // amount to multiply the initial value by
    String expr = "expr_example"; // calculated expression to match against the job
    String orgId = "orgId_example"; // org identifier (either id or slug)
    String code = "code_example";
    String category = "category_example"; // tag to group multipliers together by
    LocalDate date = LocalDate.now(); // Effective date of multiplier creation
    try {
      client
              .multiplier
              .createNewMultiplier(label, value, expr, orgId)
              .code(code)
              .category(category)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#createNewMultiplier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .multiplier
              .createNewMultiplier(label, value, expr, orgId)
              .code(code)
              .category(category)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#createNewMultiplier");
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
| **orgId** | **String**| org identifier (either id or slug) | |
| **date** | **LocalDate**| Effective date of multiplier creation | [optional] |
| **createMultiplier** | [**CreateMultiplier**](CreateMultiplier.md)|  | [optional] |

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

<a name="deleteMultiplierById"></a>
# **deleteMultiplierById**
> deleteMultiplierById(orgId, multiplierId).date(date).execute();

Delete a multiplier



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MultiplierApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String multiplierId = "multiplierId_example"; // Multiplier id
    LocalDate date = LocalDate.now(); // Effective date of group update
    try {
      client
              .multiplier
              .deleteMultiplierById(orgId, multiplierId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#deleteMultiplierById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .multiplier
              .deleteMultiplierById(orgId, multiplierId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#deleteMultiplierById");
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
| **multiplierId** | **String**| Multiplier id | |
| **date** | **LocalDate**| Effective date of group update | [optional] |

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

<a name="findCompBandMultipliersInOrg"></a>
# **findCompBandMultipliersInOrg**
> ResultsData findCompBandMultipliersInOrg(orgId, multiplierId).date(date).execute();

Return a particular comp band multiplier by id on an effective date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MultiplierApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String multiplierId = "multiplierId_example"; // Comp band multiplier id
    LocalDate date = LocalDate.now(); // Date to search as of
    try {
      ResultsData result = client
              .multiplier
              .findCompBandMultipliersInOrg(orgId, multiplierId)
              .date(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#findCompBandMultipliersInOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .multiplier
              .findCompBandMultipliersInOrg(orgId, multiplierId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#findCompBandMultipliersInOrg");
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
| **multiplierId** | **String**| Comp band multiplier id | |
| **date** | **LocalDate**| Date to search as of | [optional] |

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

<a name="findCompBandMultipliersInOrg_0"></a>
# **findCompBandMultipliersInOrg_0**
> ResultsData findCompBandMultipliersInOrg_0(orgId).date(date).from(from).limit(limit).includeDeleted(includeDeleted).execute();

Find comp band multipliers in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MultiplierApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to search as of
    String from = "from_example"; // Multiplier id to start paginating from
    Integer limit = 56; // Number of results to return
    Boolean includeDeleted = true; // Include deleted multipliers
    try {
      ResultsData result = client
              .multiplier
              .findCompBandMultipliersInOrg_0(orgId)
              .date(date)
              .from(from)
              .limit(limit)
              .includeDeleted(includeDeleted)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#findCompBandMultipliersInOrg_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .multiplier
              .findCompBandMultipliersInOrg_0(orgId)
              .date(date)
              .from(from)
              .limit(limit)
              .includeDeleted(includeDeleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#findCompBandMultipliersInOrg_0");
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
| **date** | **LocalDate**| Date to search as of | [optional] |
| **from** | **String**| Multiplier id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **includeDeleted** | **Boolean**| Include deleted multipliers | [optional] |

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

<a name="updateMultiplerById"></a>
# **updateMultiplerById**
> updateMultiplerById(orgId, multiplierId).date(date).updateMultiplier(updateMultiplier).execute();

Update a multiplier



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MultiplierApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String multiplierId = "multiplierId_example"; // Multiplier id
    String label = "label_example"; // human-readable name of multiplier
    String code = "code_example";
    Double value = 3.4D; // amount to multiply the initial value by
    String expr = "expr_example"; // calculated expression to match against the job
    String category = "category_example"; // tag to group multipliers together by
    LocalDate date = LocalDate.now(); // Effective date of multiplier update
    try {
      client
              .multiplier
              .updateMultiplerById(orgId, multiplierId)
              .label(label)
              .code(code)
              .value(value)
              .expr(expr)
              .category(category)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#updateMultiplerById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .multiplier
              .updateMultiplerById(orgId, multiplierId)
              .label(label)
              .code(code)
              .value(value)
              .expr(expr)
              .category(category)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiplierApi#updateMultiplerById");
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
| **multiplierId** | **String**| Multiplier id | |
| **date** | **LocalDate**| Effective date of multiplier update | [optional] |
| **updateMultiplier** | [**UpdateMultiplier**](UpdateMultiplier.md)|  | [optional] |

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

