# TimeoffApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approvePendingRequest**](TimeoffApi.md#approvePendingRequest) | **POST** /v1/org/{orgId}/timeoff/{timeOffId}/approve | Approve a pending time off request |
| [**createEntry**](TimeoffApi.md#createEntry) | **POST** /v1/org/{orgId}/timeoff | Create a timeOff |
| [**findTimeOffById**](TimeoffApi.md#findTimeOffById) | **GET** /v1/org/{orgId}/timeoff/{timeOffId} | Return a particular timeOff by id |
| [**getTimeOff**](TimeoffApi.md#getTimeOff) | **GET** /v1/org/{orgId}/timeoff | Retrieve time off |
| [**rejectTimeOffRequest**](TimeoffApi.md#rejectTimeOffRequest) | **POST** /v1/org/{orgId}/timeoff/{timeOffId}/reject | Reject a pending time off request |
| [**removeEntry**](TimeoffApi.md#removeEntry) | **DELETE** /v1/org/{orgId}/timeoff/{timeOffId} | Delete a timeOff |
| [**submitTimeOffRequest**](TimeoffApi.md#submitTimeOffRequest) | **POST** /v1/org/{orgId}/timeoff/request | Request time off |
| [**updateTimeOffEntry**](TimeoffApi.md#updateTimeOffEntry) | **PATCH** /v1/org/{orgId}/timeoff/{timeOffId} | Update an existing timeOff |
| [**validateTimeoffRequest**](TimeoffApi.md#validateTimeoffRequest) | **POST** /v1/org/{orgId}/timeoff/request/validate | Validate a time off request |


<a name="approvePendingRequest"></a>
# **approvePendingRequest**
> approvePendingRequest(orgId, timeOffId).timeOffApproval(timeOffApproval).execute();

Approve a pending time off request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String timeOffId = "timeOffId_example"; // TimeOff id
    String message = "message_example";
    try {
      client
              .timeoff
              .approvePendingRequest(orgId, timeOffId)
              .message(message)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#approvePendingRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeoff
              .approvePendingRequest(orgId, timeOffId)
              .message(message)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#approvePendingRequest");
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
| **timeOffId** | **String**| TimeOff id | |
| **timeOffApproval** | [**TimeOffApproval**](TimeOffApproval.md)| Approval information | [optional] |

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
| **500** | Not Implemented |  -  |

<a name="createEntry"></a>
# **createEntry**
> TimeOff createEntry(orgId).createTimeOffEntity(createTimeOffEntity).execute();

Create a timeOff



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String personId = "personId_example"; // person taking the time off
    LocalDate startDate = LocalDate.now(); // start date of time off, inclusive
    LocalDate endDate = LocalDate.now(); // end date of time off, inclusive
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String externalId = "externalId_example"; // external identifier, if time off synced from external system
    Double days = 3.4D; // number of days used
    Double hours = 3.4D; // number of hours used
    String typeDescription = "typeDescription_example"; // type of time off
    String note = "note_example"; // notes on the time off
    String approval = "APPROVED"; // approval status of the time off
    try {
      TimeOff result = client
              .timeoff
              .createEntry(personId, startDate, endDate, orgId)
              .externalId(externalId)
              .days(days)
              .hours(hours)
              .typeDescription(typeDescription)
              .note(note)
              .approval(approval)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getDays());
      System.out.println(result.getHours());
      System.out.println(result.getType());
      System.out.println(result.getNote());
      System.out.println(result.getApproval());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#createEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOff> response = client
              .timeoff
              .createEntry(personId, startDate, endDate, orgId)
              .externalId(externalId)
              .days(days)
              .hours(hours)
              .typeDescription(typeDescription)
              .note(note)
              .approval(approval)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#createEntry");
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
| **createTimeOffEntity** | [**CreateTimeOffEntity**](CreateTimeOffEntity.md)| TimeOff data to create | [optional] |

### Return type

[**TimeOff**](TimeOff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |
| **500** | Not Implemented |  -  |

<a name="findTimeOffById"></a>
# **findTimeOffById**
> TimeOffEntity findTimeOffById(orgId, timeOffId).execute();

Return a particular timeOff by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String timeOffId = "timeOffId_example"; // TimeOff id
    try {
      TimeOffEntity result = client
              .timeoff
              .findTimeOffById(orgId, timeOffId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getPersonId());
      System.out.println(result.getExternalId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getDays());
      System.out.println(result.getHours());
      System.out.println(result.getTypeDescription());
      System.out.println(result.getNote());
      System.out.println(result.getApproval());
      System.out.println(result.getApprovalAt());
      System.out.println(result.getApprovalUserId());
      System.out.println(result.getRequestAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#findTimeOffById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffEntity> response = client
              .timeoff
              .findTimeOffById(orgId, timeOffId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#findTimeOffById");
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
| **timeOffId** | **String**| TimeOff id | |

### Return type

[**TimeOffEntity**](TimeOffEntity.md)

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
| **500** | Not Implemented |  -  |

<a name="getTimeOff"></a>
# **getTimeOff**
> ResultsTimeOffEntity getTimeOff(orgId).personId(personId).fromDate(fromDate).untilDate(untilDate).from(from).limit(limit).returnAccess(returnAccess).execute();

Retrieve time off



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String personId = "personId_example"; // Person id to filter by
    LocalDate fromDate = LocalDate.now(); // From date, inclusive
    LocalDate untilDate = LocalDate.now(); // Until date, exclusive
    String from = "from_example"; // Time off id to start paginating from
    Integer limit = 56; // Number of results to return
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsTimeOffEntity result = client
              .timeoff
              .getTimeOff(orgId)
              .personId(personId)
              .fromDate(fromDate)
              .untilDate(untilDate)
              .from(from)
              .limit(limit)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#getTimeOff");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsTimeOffEntity> response = client
              .timeoff
              .getTimeOff(orgId)
              .personId(personId)
              .fromDate(fromDate)
              .untilDate(untilDate)
              .from(from)
              .limit(limit)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#getTimeOff");
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
| **personId** | **String**| Person id to filter by | [optional] |
| **fromDate** | **LocalDate**| From date, inclusive | [optional] |
| **untilDate** | **LocalDate**| Until date, exclusive | [optional] |
| **from** | **String**| Time off id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ResultsTimeOffEntity**](ResultsTimeOffEntity.md)

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
| **500** | Not Implemented |  -  |

<a name="rejectTimeOffRequest"></a>
# **rejectTimeOffRequest**
> rejectTimeOffRequest(orgId, timeOffId).timeOffApproval(timeOffApproval).execute();

Reject a pending time off request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String timeOffId = "timeOffId_example"; // TimeOff id
    String message = "message_example";
    try {
      client
              .timeoff
              .rejectTimeOffRequest(orgId, timeOffId)
              .message(message)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#rejectTimeOffRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeoff
              .rejectTimeOffRequest(orgId, timeOffId)
              .message(message)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#rejectTimeOffRequest");
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
| **timeOffId** | **String**| TimeOff id | |
| **timeOffApproval** | [**TimeOffApproval**](TimeOffApproval.md)| Rejection information | [optional] |

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
| **500** | Not Implemented |  -  |

<a name="removeEntry"></a>
# **removeEntry**
> removeEntry(orgId, timeOffId).execute();

Delete a timeOff



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String timeOffId = "timeOffId_example"; // TimeOff id
    try {
      client
              .timeoff
              .removeEntry(orgId, timeOffId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#removeEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeoff
              .removeEntry(orgId, timeOffId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#removeEntry");
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
| **timeOffId** | **String**| TimeOff id | |

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
| **500** | Not Implemented |  -  |

<a name="submitTimeOffRequest"></a>
# **submitTimeOffRequest**
> TimeOff submitTimeOffRequest(orgId).timeOffRequest(timeOffRequest).execute();

Request time off



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String personId = "personId_example";
    String typeDescription = "typeDescription_example";
    String note = "note_example";
    try {
      TimeOff result = client
              .timeoff
              .submitTimeOffRequest(startDate, endDate, orgId)
              .personId(personId)
              .typeDescription(typeDescription)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getDays());
      System.out.println(result.getHours());
      System.out.println(result.getType());
      System.out.println(result.getNote());
      System.out.println(result.getApproval());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#submitTimeOffRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOff> response = client
              .timeoff
              .submitTimeOffRequest(startDate, endDate, orgId)
              .personId(personId)
              .typeDescription(typeDescription)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#submitTimeOffRequest");
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
| **timeOffRequest** | [**TimeOffRequest**](TimeOffRequest.md)| Time off request | [optional] |

### Return type

[**TimeOff**](TimeOff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |
| **500** | Not Implemented |  -  |

<a name="updateTimeOffEntry"></a>
# **updateTimeOffEntry**
> updateTimeOffEntry(orgId, timeOffId).updateTimeOffEntity(updateTimeOffEntity).execute();

Update an existing timeOff



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String timeOffId = "timeOffId_example"; // TimeOff id
    String externalId = "externalId_example"; // external identifier, if time off synced from external system
    LocalDate startDate = LocalDate.now(); // start date of time off, inclusive
    LocalDate endDate = LocalDate.now(); // end date of time off, inclusive
    Double days = 3.4D; // number of days used
    Double hours = 3.4D; // number of hours used
    String typeDescription = "typeDescription_example"; // type of time off
    String note = "note_example"; // notes on the time off
    String approval = "APPROVED"; // approval status of the time off
    try {
      client
              .timeoff
              .updateTimeOffEntry(orgId, timeOffId)
              .externalId(externalId)
              .startDate(startDate)
              .endDate(endDate)
              .days(days)
              .hours(hours)
              .typeDescription(typeDescription)
              .note(note)
              .approval(approval)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#updateTimeOffEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeoff
              .updateTimeOffEntry(orgId, timeOffId)
              .externalId(externalId)
              .startDate(startDate)
              .endDate(endDate)
              .days(days)
              .hours(hours)
              .typeDescription(typeDescription)
              .note(note)
              .approval(approval)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#updateTimeOffEntry");
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
| **timeOffId** | **String**| TimeOff id | |
| **updateTimeOffEntity** | [**UpdateTimeOffEntity**](UpdateTimeOffEntity.md)| TimeOff data to update | [optional] |

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
| **500** | Not Implemented |  -  |

<a name="validateTimeoffRequest"></a>
# **validateTimeoffRequest**
> TimeOff validateTimeoffRequest(orgId).timeOffRequest(timeOffRequest).execute();

Validate a time off request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeoffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String personId = "personId_example";
    String typeDescription = "typeDescription_example";
    String note = "note_example";
    try {
      TimeOff result = client
              .timeoff
              .validateTimeoffRequest(startDate, endDate, orgId)
              .personId(personId)
              .typeDescription(typeDescription)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getDays());
      System.out.println(result.getHours());
      System.out.println(result.getType());
      System.out.println(result.getNote());
      System.out.println(result.getApproval());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#validateTimeoffRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOff> response = client
              .timeoff
              .validateTimeoffRequest(startDate, endDate, orgId)
              .personId(personId)
              .typeDescription(typeDescription)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeoffApi#validateTimeoffRequest");
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
| **timeOffRequest** | [**TimeOffRequest**](TimeOffRequest.md)| Time off request | [optional] |

### Return type

[**TimeOff**](TimeOff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |
| **500** | Not Implemented |  -  |

