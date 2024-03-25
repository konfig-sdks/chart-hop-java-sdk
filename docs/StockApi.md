# StockApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHistory**](StockApi.md#getHistory) | **GET** /v1/stock | Return the history of stock prices |
| [**getPriceByDateType**](StockApi.md#getPriceByDateType) | **GET** /v1/stock/{symbol}/{date}/{type} | Get a stock price as of a particular date |
| [**removePrice**](StockApi.md#removePrice) | **DELETE** /v1/stock/{id} | Delete a stock price |
| [**upsertPriceByDateType**](StockApi.md#upsertPriceByDateType) | **PUT** /v1/stock/{symbol}/{date}/{type} | Upsert a stock price |


<a name="getHistory"></a>
# **getHistory**
> ResultsStockPrice getHistory().symbol(symbol).type(type).from(from).limit(limit).execute();

Return the history of stock prices



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String symbol = "symbol_example"; // Symbol to query
    String type = "type_example"; // Types of valuations to retrieve
    LocalDate from = LocalDate.now(); // Date to start from
    Integer limit = 56; // Number of results to return
    try {
      ResultsStockPrice result = client
              .stock
              .getHistory()
              .symbol(symbol)
              .type(type)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#getHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsStockPrice> response = client
              .stock
              .getHistory()
              .symbol(symbol)
              .type(type)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#getHistory");
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
| **symbol** | **String**| Symbol to query | [optional] |
| **type** | **String**| Types of valuations to retrieve | [optional] |
| **from** | **LocalDate**| Date to start from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsStockPrice**](ResultsStockPrice.md)

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

<a name="getPriceByDateType"></a>
# **getPriceByDateType**
> StockPrice getPriceByDateType(symbol, date, type).execute();

Get a stock price as of a particular date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String symbol = "symbol_example"; // Stock symbol
    LocalDate date = LocalDate.now(); // Date to update information for
    String type = "type_example"; // Type of stock price to retrieve (for example 'public')
    try {
      StockPrice result = client
              .stock
              .getPriceByDateType(symbol, date, type)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getStock());
      System.out.println(result.getDate());
      System.out.println(result.getPrice());
      System.out.println(result.getType());
      System.out.println(result.getTotal());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#getPriceByDateType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StockPrice> response = client
              .stock
              .getPriceByDateType(symbol, date, type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#getPriceByDateType");
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
| **symbol** | **String**| Stock symbol | |
| **date** | **LocalDate**| Date to update information for | |
| **type** | **String**| Type of stock price to retrieve (for example &#39;public&#39;) | |

### Return type

[**StockPrice**](StockPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | org not found |  -  |

<a name="removePrice"></a>
# **removePrice**
> removePrice(id).execute();

Delete a stock price



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String id = "id_example"; // Stock entry id
    try {
      client
              .stock
              .removePrice(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#removePrice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .stock
              .removePrice(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#removePrice");
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
| **id** | **String**| Stock entry id | |

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

<a name="upsertPriceByDateType"></a>
# **upsertPriceByDateType**
> StockPrice upsertPriceByDateType(symbol, date, type).updateStockPrice(updateStockPrice).execute();

Upsert a stock price



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String symbol = "symbol_example"; // Stock symbol
    LocalDate date = LocalDate.now(); // Date to update information for
    String type = "type_example"; // Type of stock price to upsert
    String orgId = "orgId_example"; // org id that this stock price derives from
    Double price = 3.4D; // price per share
    Long total = 56L; // total shares outstanding
    try {
      StockPrice result = client
              .stock
              .upsertPriceByDateType(symbol, date, type)
              .orgId(orgId)
              .price(price)
              .total(total)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getStock());
      System.out.println(result.getDate());
      System.out.println(result.getPrice());
      System.out.println(result.getType());
      System.out.println(result.getTotal());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#upsertPriceByDateType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StockPrice> response = client
              .stock
              .upsertPriceByDateType(symbol, date, type)
              .orgId(orgId)
              .price(price)
              .total(total)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#upsertPriceByDateType");
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
| **symbol** | **String**| Stock symbol | |
| **date** | **LocalDate**| Date to update information for | |
| **type** | **String**| Type of stock price to upsert | |
| **updateStockPrice** | [**UpdateStockPrice**](UpdateStockPrice.md)| Stock price data to create | [optional] |

### Return type

[**StockPrice**](StockPrice.md)

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

