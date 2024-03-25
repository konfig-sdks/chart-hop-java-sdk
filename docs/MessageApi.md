# MessageApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMessage**](MessageApi.md#createNewMessage) | **POST** /v1/org/{orgId}/message | Create a new message |
| [**getAllForUser**](MessageApi.md#getAllForUser) | **GET** /v1/org/{orgId}/message/me | Return all messages for a particular user |
| [**getMessageById**](MessageApi.md#getMessageById) | **GET** /v1/org/{orgId}/message/{messageId} | Return a particular message by id |
| [**getMessageByKey**](MessageApi.md#getMessageByKey) | **GET** /v1/org/{orgId}/message/me/{messageKey} | Return a particular message by key |
| [**markBulkAsSeen**](MessageApi.md#markBulkAsSeen) | **POST** /v1/org/{orgId}/message/bulk/seen | Marks each message as &#x60;seen&#x60; |
| [**markMessagesAsRead**](MessageApi.md#markMessagesAsRead) | **POST** /v1/org/{orgId}/message/bulk/read | Sets each of the designated message&#39;s &#x60;readAt&#x60; property |
| [**setReadStatus**](MessageApi.md#setReadStatus) | **POST** /v1/org/{orgId}/message/{messageId}/read | Sets the designated message&#39;s &#x60;readAt&#x60; property |


<a name="createNewMessage"></a>
# **createNewMessage**
> Message createNewMessage(orgId).partialMessage(partialMessage).execute();

Create a new message



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String title = "title_example"; // message title
    String id = "id_example"; // globally unique id
    String orgId = "orgId_example"; // parent organization id
    String type = "CHAT"; // type of message
    String notificationType = "SUCCESS"; // type of notification (SUCCESS, ERR, ANNOUNCEMENT etc.)
    String userId = "userId_example"; // user who receives the message
    String content = "content_example"; // message content
    String messageUrl = "messageUrl_example"; // link to message content (if applicable)
    String key = "key_example"; // key of message if applicable (e.g. product-tour, import-complete-{id})
    String readAt = "readAt_example"; // read timestamp
    String seenAt = "seenAt_example"; // seen timestamp
    String createId = "createId_example"; // created by user id
    String createAt = "createAt_example"; // created timestamp
    try {
      Message result = client
              .message
              .createNewMessage(orgId)
              .title(title)
              .id(id)
              .orgId(orgId)
              .type(type)
              .notificationType(notificationType)
              .userId(userId)
              .content(content)
              .messageUrl(messageUrl)
              .key(key)
              .readAt(readAt)
              .seenAt(seenAt)
              .createId(createId)
              .createAt(createAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getType());
      System.out.println(result.getNotificationType());
      System.out.println(result.getUserId());
      System.out.println(result.getContent());
      System.out.println(result.getMessageUrl());
      System.out.println(result.getKey());
      System.out.println(result.getReadAt());
      System.out.println(result.getSeenAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#createNewMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Message> response = client
              .message
              .createNewMessage(orgId)
              .title(title)
              .id(id)
              .orgId(orgId)
              .type(type)
              .notificationType(notificationType)
              .userId(userId)
              .content(content)
              .messageUrl(messageUrl)
              .key(key)
              .readAt(readAt)
              .seenAt(seenAt)
              .createId(createId)
              .createAt(createAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#createNewMessage");
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
| **partialMessage** | [**PartialMessage**](PartialMessage.md)| Message data to create | [optional] |

### Return type

[**Message**](Message.md)

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

<a name="getAllForUser"></a>
# **getAllForUser**
> ResultsMessage getAllForUser(orgId).type(type).unreadOnly(unreadOnly).from(from).limit(limit).execute();

Return all messages for a particular user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Message \"type\" (WEB, CHAT, or EMAIL)
    Boolean unreadOnly = true; // Message \"status\" (read or unread)
    String from = "from_example"; // MessageId to start paginating from
    Integer limit = 56; // Limit
    try {
      ResultsMessage result = client
              .message
              .getAllForUser(orgId)
              .type(type)
              .unreadOnly(unreadOnly)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#getAllForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsMessage> response = client
              .message
              .getAllForUser(orgId)
              .type(type)
              .unreadOnly(unreadOnly)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#getAllForUser");
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
| **type** | **String**| Message \&quot;type\&quot; (WEB, CHAT, or EMAIL) | [optional] |
| **unreadOnly** | **Boolean**| Message \&quot;status\&quot; (read or unread) | [optional] |
| **from** | **String**| MessageId to start paginating from | [optional] |
| **limit** | **Integer**| Limit | [optional] |

### Return type

[**ResultsMessage**](ResultsMessage.md)

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

<a name="getMessageById"></a>
# **getMessageById**
> Message getMessageById(orgId, messageId).execute();

Return a particular message by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String messageId = "messageId_example"; // Message id
    try {
      Message result = client
              .message
              .getMessageById(orgId, messageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getType());
      System.out.println(result.getNotificationType());
      System.out.println(result.getUserId());
      System.out.println(result.getContent());
      System.out.println(result.getMessageUrl());
      System.out.println(result.getKey());
      System.out.println(result.getReadAt());
      System.out.println(result.getSeenAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#getMessageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Message> response = client
              .message
              .getMessageById(orgId, messageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#getMessageById");
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
| **messageId** | **String**| Message id | |

### Return type

[**Message**](Message.md)

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

<a name="getMessageByKey"></a>
# **getMessageByKey**
> Message getMessageByKey(orgId, messageKey).execute();

Return a particular message by key



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String messageKey = "messageKey_example"; // Message key
    try {
      Message result = client
              .message
              .getMessageByKey(orgId, messageKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getType());
      System.out.println(result.getNotificationType());
      System.out.println(result.getUserId());
      System.out.println(result.getContent());
      System.out.println(result.getMessageUrl());
      System.out.println(result.getKey());
      System.out.println(result.getReadAt());
      System.out.println(result.getSeenAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#getMessageByKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Message> response = client
              .message
              .getMessageByKey(orgId, messageKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#getMessageByKey");
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
| **messageKey** | **String**| Message key | |

### Return type

[**Message**](Message.md)

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

<a name="markBulkAsSeen"></a>
# **markBulkAsSeen**
> markBulkAsSeen(orgId).partialMessage(partialMessage).execute();

Marks each message as &#x60;seen&#x60;



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
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
      client
              .message
              .markBulkAsSeen(orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#markBulkAsSeen");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .message
              .markBulkAsSeen(orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#markBulkAsSeen");
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
| **partialMessage** | [**List&lt;PartialMessage&gt;**](PartialMessage.md)| Messages to update | [optional] |

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
| **0** | unauthorized |  -  |

<a name="markMessagesAsRead"></a>
# **markMessagesAsRead**
> markMessagesAsRead(orgId).partialMessage(partialMessage).execute();

Sets each of the designated message&#39;s &#x60;readAt&#x60; property



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
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
      client
              .message
              .markMessagesAsRead(orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#markMessagesAsRead");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .message
              .markMessagesAsRead(orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#markMessagesAsRead");
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
| **partialMessage** | [**List&lt;PartialMessage&gt;**](PartialMessage.md)| Messages to update | [optional] |

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
| **0** | unauthorized |  -  |

<a name="setReadStatus"></a>
# **setReadStatus**
> setReadStatus(orgId, messageId).execute();

Sets the designated message&#39;s &#x60;readAt&#x60; property



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String messageId = "messageId_example"; // Message id
    try {
      client
              .message
              .setReadStatus(orgId, messageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#setReadStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .message
              .setReadStatus(orgId, messageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#setReadStatus");
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
| **messageId** | **String**| Message id | |

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

