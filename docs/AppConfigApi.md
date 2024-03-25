# AppConfigApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewConfig**](AppConfigApi.md#createNewConfig) | **POST** /v1/app-config | Create a new app config |
| [**getDefaultConfigByApp**](AppConfigApi.md#getDefaultConfigByApp) | **GET** /v1/app-config/{appId} | Return default app configuration by app |
| [**getUserConfigByAppAndUser**](AppConfigApi.md#getUserConfigByAppAndUser) | **GET** /v1/app-config/{appId}/{userId} | Return user app configuration by app and user |
| [**updateById**](AppConfigApi.md#updateById) | **PATCH** /v1/app-config/{appId}/{userId} | Update an existing app |


<a name="createNewConfig"></a>
# **createNewConfig**
> AppConfig createNewConfig().createAppConfig(createAppConfig).execute();

Create a new app config



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String appId = "appId_example"; // app id
    String userId = "userId_example"; // user id, if this person corresponds with a user
    String orgId = "orgId_example"; // org id, if this app config corresponds with an org
    List<FieldMapper> fieldMappers = Arrays.asList(); // list of default field mappers
    List<FieldMapper> customFieldMappers = Arrays.asList(); // list of custom field mappers by a user
    List<OutboundFieldMapper> customOutboundFieldMappers = Arrays.asList(); // list of custom outbound field mappers
    Set<String> disabledFieldMappers = Arrays.asList(); // list of disabled inbound field mappers by id
    Set<String> enabledOutboundFieldMappers = Arrays.asList(); // list of enabled outbound field mappers by id
    List<Map<String, String>> templateMatchers = Arrays.asList(new HashMap<>()); // template field matchers defined by a user
    Object options = null; // app specific options
    try {
      AppConfig result = client
              .appConfig
              .createNewConfig(appId)
              .userId(userId)
              .orgId(orgId)
              .fieldMappers(fieldMappers)
              .customFieldMappers(customFieldMappers)
              .customOutboundFieldMappers(customOutboundFieldMappers)
              .disabledFieldMappers(disabledFieldMappers)
              .enabledOutboundFieldMappers(enabledOutboundFieldMappers)
              .templateMatchers(templateMatchers)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAppId());
      System.out.println(result.getUserId());
      System.out.println(result.getOrgId());
      System.out.println(result.getFieldMappers());
      System.out.println(result.getCustomFieldMappers());
      System.out.println(result.getDefaultOutboundFieldMappers());
      System.out.println(result.getCustomOutboundFieldMappers());
      System.out.println(result.getDisabledFieldMappers());
      System.out.println(result.getEnabledOutboundFieldMappers());
      System.out.println(result.getTemplateMatchers());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppConfigApi#createNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppConfig> response = client
              .appConfig
              .createNewConfig(appId)
              .userId(userId)
              .orgId(orgId)
              .fieldMappers(fieldMappers)
              .customFieldMappers(customFieldMappers)
              .customOutboundFieldMappers(customOutboundFieldMappers)
              .disabledFieldMappers(disabledFieldMappers)
              .enabledOutboundFieldMappers(enabledOutboundFieldMappers)
              .templateMatchers(templateMatchers)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppConfigApi#createNewConfig");
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
| **createAppConfig** | [**CreateAppConfig**](CreateAppConfig.md)| App config data to create | [optional] |

### Return type

[**AppConfig**](AppConfig.md)

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

<a name="getDefaultConfigByApp"></a>
# **getDefaultConfigByApp**
> AppConfig getDefaultConfigByApp(appId).execute();

Return default app configuration by app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String appId = "appId_example"; // App id
    try {
      AppConfig result = client
              .appConfig
              .getDefaultConfigByApp(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAppId());
      System.out.println(result.getUserId());
      System.out.println(result.getOrgId());
      System.out.println(result.getFieldMappers());
      System.out.println(result.getCustomFieldMappers());
      System.out.println(result.getDefaultOutboundFieldMappers());
      System.out.println(result.getCustomOutboundFieldMappers());
      System.out.println(result.getDisabledFieldMappers());
      System.out.println(result.getEnabledOutboundFieldMappers());
      System.out.println(result.getTemplateMatchers());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppConfigApi#getDefaultConfigByApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppConfig> response = client
              .appConfig
              .getDefaultConfigByApp(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppConfigApi#getDefaultConfigByApp");
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
| **appId** | **String**| App id | |

### Return type

[**AppConfig**](AppConfig.md)

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

<a name="getUserConfigByAppAndUser"></a>
# **getUserConfigByAppAndUser**
> AppConfig getUserConfigByAppAndUser(appId, userId).execute();

Return user app configuration by app and user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String appId = "appId_example"; // App id
    String userId = "userId_example"; // User id
    try {
      AppConfig result = client
              .appConfig
              .getUserConfigByAppAndUser(appId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAppId());
      System.out.println(result.getUserId());
      System.out.println(result.getOrgId());
      System.out.println(result.getFieldMappers());
      System.out.println(result.getCustomFieldMappers());
      System.out.println(result.getDefaultOutboundFieldMappers());
      System.out.println(result.getCustomOutboundFieldMappers());
      System.out.println(result.getDisabledFieldMappers());
      System.out.println(result.getEnabledOutboundFieldMappers());
      System.out.println(result.getTemplateMatchers());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppConfigApi#getUserConfigByAppAndUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppConfig> response = client
              .appConfig
              .getUserConfigByAppAndUser(appId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppConfigApi#getUserConfigByAppAndUser");
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
| **appId** | **String**| App id | |
| **userId** | **String**| User id | |

### Return type

[**AppConfig**](AppConfig.md)

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

<a name="updateById"></a>
# **updateById**
> updateById(appId, userId).updateAppConfig(updateAppConfig).execute();

Update an existing app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String appId = "appId_example"; // App id
    String userId = "userId_example"; // User id
    List<FieldMapper> fieldMappers = Arrays.asList(); // list of default field mappers
    List<FieldMapper> customFieldMappers = Arrays.asList(); // list of custom field mappers by a user
    List<OutboundFieldMapper> customOutboundFieldMappers = Arrays.asList(); // list of custom outbound field mappers
    Set<String> disabledFieldMappers = Arrays.asList(); // list of disabled inbound field mappers by id
    Set<String> enabledOutboundFieldMappers = Arrays.asList(); // list of enabled outbound field mappers by id
    List<Map<String, String>> templateMatchers = Arrays.asList(new HashMap<>()); // template field matchers defined by a user
    Object options = null; // app specific options
    try {
      client
              .appConfig
              .updateById(appId, userId)
              .fieldMappers(fieldMappers)
              .customFieldMappers(customFieldMappers)
              .customOutboundFieldMappers(customOutboundFieldMappers)
              .disabledFieldMappers(disabledFieldMappers)
              .enabledOutboundFieldMappers(enabledOutboundFieldMappers)
              .templateMatchers(templateMatchers)
              .options(options)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppConfigApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .appConfig
              .updateById(appId, userId)
              .fieldMappers(fieldMappers)
              .customFieldMappers(customFieldMappers)
              .customOutboundFieldMappers(customOutboundFieldMappers)
              .disabledFieldMappers(disabledFieldMappers)
              .enabledOutboundFieldMappers(enabledOutboundFieldMappers)
              .templateMatchers(templateMatchers)
              .options(options)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppConfigApi#updateById");
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
| **appId** | **String**| App id | |
| **userId** | **String**| User id | |
| **updateAppConfig** | [**UpdateAppConfig**](UpdateAppConfig.md)| App data to update | [optional] |

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

