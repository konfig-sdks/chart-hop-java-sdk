# QueryApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**expireLiveQuery**](QueryApi.md#expireLiveQuery) | **DELETE** /v1/org/{orgId}/query/{queryToken} | Expire a previously created live query immediately |
| [**liveQueryResult**](QueryApi.md#liveQueryResult) | **GET** /v1/org/{orgId}/query/{queryToken} | Return the results of a previously created live query |
| [**liveQueryToken**](QueryApi.md#liveQueryToken) | **POST** /v1/org/{orgId}/query | Create a live query token |
| [**queryTokens**](QueryApi.md#queryTokens) | **GET** /v1/org/{orgId}/query | Get a list of query tokens |


<a name="expireLiveQuery"></a>
# **expireLiveQuery**
> expireLiveQuery(orgId, queryToken).execute();

Expire a previously created live query immediately



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String queryToken = "queryToken_example"; // Query token (either id or token string)
    try {
      client
              .query
              .expireLiveQuery(orgId, queryToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#expireLiveQuery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .query
              .expireLiveQuery(orgId, queryToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#expireLiveQuery");
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
| **queryToken** | **String**| Query token (either id or token string) | |

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

<a name="liveQueryResult"></a>
# **liveQueryResult**
> liveQueryResult(orgId, queryToken).format(format).mapper(mapper).execute();

Return the results of a previously created live query



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String queryToken = "queryToken_example"; // Query token
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String mapper = "mapper_example"; // Deprecated parameter for backwards-compatibility
    try {
      client
              .query
              .liveQueryResult(orgId, queryToken)
              .format(format)
              .mapper(mapper)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#liveQueryResult");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .query
              .liveQueryResult(orgId, queryToken)
              .format(format)
              .mapper(mapper)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#liveQueryResult");
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
| **queryToken** | **String**| Query token | |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **mapper** | **String**| Deprecated parameter for backwards-compatibility | [optional] |

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

<a name="liveQueryToken"></a>
# **liveQueryToken**
> QueryToken liveQueryToken(orgId).createQueryToken(createQueryToken).execute();

Create a live query token



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String type = "type_example"; // query type
    Object params = null; // query params
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      QueryToken result = client
              .query
              .liveQueryToken(type, params, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getToken());
      System.out.println(result.getOrgId());
      System.out.println(result.getUserId());
      System.out.println(result.getType());
      System.out.println(result.getPath());
      System.out.println(result.getParams());
      System.out.println(result.getAccessCount());
      System.out.println(result.getCreateAt());
      System.out.println(result.getExpireAt());
      System.out.println(result.getActiveAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#liveQueryToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QueryToken> response = client
              .query
              .liveQueryToken(type, params, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#liveQueryToken");
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
| **createQueryToken** | [**CreateQueryToken**](CreateQueryToken.md)|  | [optional] |

### Return type

[**QueryToken**](QueryToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="queryTokens"></a>
# **queryTokens**
> List&lt;QueryToken&gt; queryTokens(orgId).execute();

Get a list of query tokens



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug
    try {
      List<QueryToken> result = client
              .query
              .queryTokens(orgId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#queryTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QueryToken>> response = client
              .query
              .queryTokens(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#queryTokens");
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
| **orgId** | **String**| Org identifier (either id or slug | |

### Return type

[**List&lt;QueryToken&gt;**](QueryToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

