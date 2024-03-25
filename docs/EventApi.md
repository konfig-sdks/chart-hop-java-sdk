# EventApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInboundNotification**](EventApi.md#createInboundNotification) | **POST** /v1/org/{orgId}/event/notify/inbound/{appId}/{inboundId} | Create an inbound event |
| [**createOutboundEvent**](EventApi.md#createOutboundEvent) | **POST** /v1/org/{orgId}/event/notify/outbound/app/{appId} | Create an outbound event |
| [**getEventPayload**](EventApi.md#getEventPayload) | **GET** /v1/org/{orgId}/event/{eventId} | Return individual event, including payload |
| [**getPastEvents**](EventApi.md#getPastEvents) | **GET** /v1/org/{orgId}/event | Return past events, paginated, without payloads present |
| [**resendAssociatedNotifications**](EventApi.md#resendAssociatedNotifications) | **POST** /v1/org/{orgId}/event/{eventId}/notify | Resend all associated notifications for a previous event (superusers only) |


<a name="createInboundNotification"></a>
# **createInboundNotification**
> String createInboundNotification(orgId, appId, inboundId).processId(processId).requestBody(requestBody).execute();

Create an inbound event



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appId = "appId_example"; // App id
    String inboundId = "inboundId_example"; // Inbound id
    String processId = "processId_example"; // Process id
    try {
      String result = client
              .event
              .createInboundNotification(orgId, appId, inboundId)
              .processId(processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createInboundNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .event
              .createInboundNotification(orgId, appId, inboundId)
              .processId(processId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createInboundNotification");
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
| **appId** | **String**| App id | |
| **inboundId** | **String**| Inbound id | |
| **processId** | **String**| Process id | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| Inbound body to create event | [optional] |

### Return type

**String**

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
| **404** | not found |  -  |

<a name="createOutboundEvent"></a>
# **createOutboundEvent**
> String createOutboundEvent(orgId, appId).processId(processId).requestBody(requestBody).execute();

Create an outbound event



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appId = "appId_example"; // App id
    String processId = "processId_example"; // Process id
    try {
      String result = client
              .event
              .createOutboundEvent(orgId, appId)
              .processId(processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createOutboundEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .event
              .createOutboundEvent(orgId, appId)
              .processId(processId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createOutboundEvent");
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
| **appId** | **String**| App id | |
| **processId** | **String**| Process id | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| Outbound body to create event | [optional] |

### Return type

**String**

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
| **404** | not found |  -  |

<a name="getEventPayload"></a>
# **getEventPayload**
> Event getEventPayload(orgId, eventId).execute();

Return individual event, including payload



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String eventId = "eventId_example";
    try {
      Event result = client
              .event
              .getEventPayload(orgId, eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getOrgId());
      System.out.println(result.getType());
      System.out.println(result.getEntityType());
      System.out.println(result.getEntityId());
      System.out.println(result.getTableId());
      System.out.println(result.getJobId());
      System.out.println(result.getPersonId());
      System.out.println(result.getSubtype());
      System.out.println(result.getPayload());
      System.out.println(result.getAt());
      System.out.println(result.getProcessId());
      System.out.println(result.getDate());
      System.out.println(result.getScenarioId());
      System.out.println(result.getParentEntityId());
      System.out.println(result.getFields());
      System.out.println(result.getCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getEventPayload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Event> response = client
              .event
              .getEventPayload(orgId, eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getEventPayload");
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
| **eventId** | **String**|  | |

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getPastEvents"></a>
# **getPastEvents**
> ResultsEvent getPastEvents(orgId).userId(userId).entityId(entityId).entityType(entityType).parentEntityId(parentEntityId).scenarioId(scenarioId).processId(processId).fields(fields).code(code).from(from).limit(limit).execute();

Return past events, paginated, without payloads present



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String userId = "userId_example"; // User id
    String entityId = "entityId_example"; // Entity id
    String entityType = "ACTION"; // Entity type
    String parentEntityId = "parentEntityId_example"; // Parent entity id
    String scenarioId = "scenarioId_example"; // Scenario id
    String processId = "processId_example"; // Process id
    String fields = "fields_example"; // Fields that were modified
    String code = "code_example"; // Event code to search for
    Long from = 56L; // Timestamp to start search at
    Integer limit = 56; // Number of results to return
    try {
      ResultsEvent result = client
              .event
              .getPastEvents(orgId)
              .userId(userId)
              .entityId(entityId)
              .entityType(entityType)
              .parentEntityId(parentEntityId)
              .scenarioId(scenarioId)
              .processId(processId)
              .fields(fields)
              .code(code)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getPastEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsEvent> response = client
              .event
              .getPastEvents(orgId)
              .userId(userId)
              .entityId(entityId)
              .entityType(entityType)
              .parentEntityId(parentEntityId)
              .scenarioId(scenarioId)
              .processId(processId)
              .fields(fields)
              .code(code)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getPastEvents");
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
| **userId** | **String**| User id | [optional] |
| **entityId** | **String**| Entity id | [optional] |
| **entityType** | **String**| Entity type | [optional] [enum: ACTION, AGREEMENT, APP, APP_CONFIG, APPROVAL_CHAIN, APPROVAL_CHAIN_STAGE, APPROVAL_REQUEST, ASSESSMENT, BUDGET_POOL, BUNDLE, CATEGORY, CATEGORY_SORT, CHANGE, COMMENT, COMP_BAND, COMP_REVIEW, CONTENT, CUSTOMER, DATA_VIEW, EXCHANGE_RATE, EMAIL_TEMPLATE, FIELD, FILE, FORM, FORM_DRAFT, FORM_RESPONSE, GEOCODE, GROUP, GUIDELINE, JOB, JOB_LEVEL, MEDIA, MESSAGE, MULTIPLIER, ORG, ORG_CONFIG, PERSON, PROFILE_TAB, POLICY, POSITION, PROCESS, PRODUCT, QUERY_TOKEN, QUESTION, REPORT, REPORT_CHART, ROLE, SCENARIO, STOCK_PRICE, TABLE, TABLE_ROW, TASK_CONFIG, TEMPLATE, TASK, TOKEN, TIMEOFF, TRACKED_GROUP, USER] |
| **parentEntityId** | **String**| Parent entity id | [optional] |
| **scenarioId** | **String**| Scenario id | [optional] |
| **processId** | **String**| Process id | [optional] |
| **fields** | **String**| Fields that were modified | [optional] |
| **code** | **String**| Event code to search for | [optional] |
| **from** | **Long**| Timestamp to start search at | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsEvent**](ResultsEvent.md)

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

<a name="resendAssociatedNotifications"></a>
# **resendAssociatedNotifications**
> resendAssociatedNotifications(orgId, eventId).app(app).execute();

Resend all associated notifications for a previous event (superusers only)



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String eventId = "eventId_example"; // Event id
    String app = "app_example"; // App name to restrict notifications to
    try {
      client
              .event
              .resendAssociatedNotifications(orgId, eventId)
              .app(app)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#resendAssociatedNotifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .event
              .resendAssociatedNotifications(orgId, eventId)
              .app(app)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#resendAssociatedNotifications");
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
| **eventId** | **String**| Event id | |
| **app** | **String**| App name to restrict notifications to | [optional] |

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

