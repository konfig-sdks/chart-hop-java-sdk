# ExchangeRateApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkUpdateCustomRates**](ExchangeRateApi.md#bulkUpdateCustomRates) | **POST** /v1/org/{orgId}/exchange-rate/{date}/custom/bulkupdate | Bulk update custom currency rates in org custom exchange rates |
| [**deleteCustomRateOnDate**](ExchangeRateApi.md#deleteCustomRateOnDate) | **DELETE** /v1/org/{orgId}/exchange-rate/{date} | Delete a custom exchange rate on a particular date |
| [**getCustomExchangeRates**](ExchangeRateApi.md#getCustomExchangeRates) | **GET** /v1/org/{orgId}/exchange-rate/{date}/custom | Return org custom exchange rates |
| [**getGlobalByDate**](ExchangeRateApi.md#getGlobalByDate) | **GET** /v1/org/{orgId}/exchange-rate/{date}/global | Return the global exchange rates based on USD for a particular date |
| [**getRatesOnDate**](ExchangeRateApi.md#getRatesOnDate) | **GET** /v1/org/{orgId}/exchange-rate/{date} | Return the exchange rates on a particular date |
| [**orgCustomExchangeRatesHistory**](ExchangeRateApi.md#orgCustomExchangeRatesHistory) | **GET** /v1/org/{orgId}/exchange-rate/{date}/history | Return org custom exchange rates |
| [**updateUsdExchangeRatesForDate**](ExchangeRateApi.md#updateUsdExchangeRatesForDate) | **PATCH** /v1/org/{orgId}/exchange-rate/{date} | Update the USD-based exchange rates for a particular date. Must be the first of a month. |


<a name="bulkUpdateCustomRates"></a>
# **bulkUpdateCustomRates**
> bulkUpdateCustomRates(orgId, date).addRates(addRates).updateExchangeRate(updateExchangeRate).execute();

Bulk update custom currency rates in org custom exchange rates



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExchangeRateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to use
    Boolean addRates = true; // Boolean to determine whether to add or remove rates from update
    try {
      client
              .exchangeRate
              .bulkUpdateCustomRates(orgId, date)
              .addRates(addRates)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#bulkUpdateCustomRates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .exchangeRate
              .bulkUpdateCustomRates(orgId, date)
              .addRates(addRates)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#bulkUpdateCustomRates");
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
| **date** | **LocalDate**| Date to use | |
| **addRates** | **Boolean**| Boolean to determine whether to add or remove rates from update | [optional] |
| **updateExchangeRate** | [**List&lt;UpdateExchangeRate&gt;**](UpdateExchangeRate.md)| Update data | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deleteCustomRateOnDate"></a>
# **deleteCustomRateOnDate**
> deleteCustomRateOnDate(orgId, date).currencyCode(currencyCode).execute();

Delete a custom exchange rate on a particular date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExchangeRateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to use
    String currencyCode = "currencyCode_example"; // Currency code
    try {
      client
              .exchangeRate
              .deleteCustomRateOnDate(orgId, date)
              .currencyCode(currencyCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#deleteCustomRateOnDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .exchangeRate
              .deleteCustomRateOnDate(orgId, date)
              .currencyCode(currencyCode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#deleteCustomRateOnDate");
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
| **date** | **LocalDate**| Date to use | |
| **currencyCode** | **String**| Currency code | [optional] |

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

<a name="getCustomExchangeRates"></a>
# **getCustomExchangeRates**
> ExchangeRate getCustomExchangeRates(orgId, date).execute();

Return org custom exchange rates



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExchangeRateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to use
    try {
      ExchangeRate result = client
              .exchangeRate
              .getCustomExchangeRates(orgId, date)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getDate());
      System.out.println(result.getCurrency());
      System.out.println(result.getRates());
      System.out.println(result.getUpdateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#getCustomExchangeRates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExchangeRate> response = client
              .exchangeRate
              .getCustomExchangeRates(orgId, date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#getCustomExchangeRates");
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
| **date** | **LocalDate**| Date to use | |

### Return type

[**ExchangeRate**](ExchangeRate.md)

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

<a name="getGlobalByDate"></a>
# **getGlobalByDate**
> ExchangeRate getGlobalByDate(orgId, date).execute();

Return the global exchange rates based on USD for a particular date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExchangeRateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to use
    try {
      ExchangeRate result = client
              .exchangeRate
              .getGlobalByDate(orgId, date)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getDate());
      System.out.println(result.getCurrency());
      System.out.println(result.getRates());
      System.out.println(result.getUpdateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#getGlobalByDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExchangeRate> response = client
              .exchangeRate
              .getGlobalByDate(orgId, date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#getGlobalByDate");
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
| **date** | **LocalDate**| Date to use | |

### Return type

[**ExchangeRate**](ExchangeRate.md)

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

<a name="getRatesOnDate"></a>
# **getRatesOnDate**
> ExchangeRate getRatesOnDate(orgId, date).execute();

Return the exchange rates on a particular date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExchangeRateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to use
    try {
      ExchangeRate result = client
              .exchangeRate
              .getRatesOnDate(orgId, date)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getDate());
      System.out.println(result.getCurrency());
      System.out.println(result.getRates());
      System.out.println(result.getUpdateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#getRatesOnDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExchangeRate> response = client
              .exchangeRate
              .getRatesOnDate(orgId, date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#getRatesOnDate");
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
| **date** | **LocalDate**| Date to use | |

### Return type

[**ExchangeRate**](ExchangeRate.md)

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

<a name="orgCustomExchangeRatesHistory"></a>
# **orgCustomExchangeRatesHistory**
> List&lt;ExchangeRate&gt; orgCustomExchangeRatesHistory(orgId, date).currency(currency).fromDate(fromDate).toDate(toDate).execute();

Return org custom exchange rates



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExchangeRateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to use
    String currency = "currency_example"; // Currency to search for
    LocalDate fromDate = LocalDate.now(); // Start date for search
    LocalDate toDate = LocalDate.now(); // End date for search
    try {
      List<ExchangeRate> result = client
              .exchangeRate
              .orgCustomExchangeRatesHistory(orgId, date)
              .currency(currency)
              .fromDate(fromDate)
              .toDate(toDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#orgCustomExchangeRatesHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ExchangeRate>> response = client
              .exchangeRate
              .orgCustomExchangeRatesHistory(orgId, date)
              .currency(currency)
              .fromDate(fromDate)
              .toDate(toDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#orgCustomExchangeRatesHistory");
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
| **date** | **LocalDate**| Date to use | |
| **currency** | **String**| Currency to search for | [optional] |
| **fromDate** | **LocalDate**| Start date for search | [optional] |
| **toDate** | **LocalDate**| End date for search | [optional] |

### Return type

[**List&lt;ExchangeRate&gt;**](ExchangeRate.md)

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

<a name="updateUsdExchangeRatesForDate"></a>
# **updateUsdExchangeRatesForDate**
> updateUsdExchangeRatesForDate(orgId, date).updateExchangeRate(updateExchangeRate).execute();

Update the USD-based exchange rates for a particular date. Must be the first of a month.



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExchangeRateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to use
    LocalDate date = LocalDate.now(); // date
    Map<String, Double> rates = new HashMap(); // exchange rates, per currency - the multiplier to convert the base currency into the foreign currency
    try {
      client
              .exchangeRate
              .updateUsdExchangeRatesForDate(orgId, date)
              .date(date)
              .rates(rates)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#updateUsdExchangeRatesForDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .exchangeRate
              .updateUsdExchangeRatesForDate(orgId, date)
              .date(date)
              .rates(rates)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRateApi#updateUsdExchangeRatesForDate");
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
| **date** | **LocalDate**| Date to use | |
| **updateExchangeRate** | [**UpdateExchangeRate**](UpdateExchangeRate.md)|  | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

