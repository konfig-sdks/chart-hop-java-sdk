# ProfileTabApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTab**](ProfileTabApi.md#createNewTab) | **POST** /v1/org/{orgId}/profile-tab | Create a profile tab |
| [**deleteProfileTab**](ProfileTabApi.md#deleteProfileTab) | **DELETE** /v1/org/{orgId}/profile-tab/{profileTabId} | Delete a profile tab |
| [**findTabsForJob**](ProfileTabApi.md#findTabsForJob) | **GET** /v1/org/{orgId}/profile-tab/job/{jobId} | Return all profile tabs applicable to a particular job |
| [**getByOrgIdAndTabId**](ProfileTabApi.md#getByOrgIdAndTabId) | **GET** /v1/org/{orgId}/profile-tab/{profileTabId} | Return a particular profile tab by id |
| [**getEvaluateProfileTabContent**](ProfileTabApi.md#getEvaluateProfileTabContent) | **GET** /v1/org/{orgId}/profile-tab/job/{jobId}/profile-tab/{tabId} | Fetch and evaluate the content of a particular profile tab id, relative to a particular job |
| [**getProfileTabs**](ProfileTabApi.md#getProfileTabs) | **GET** /v1/org/{orgId}/profile-tab/person/{personId} | Return all profile tabs applicable to a particular person |
| [**listProfileTabs**](ProfileTabApi.md#listProfileTabs) | **GET** /v1/org/{orgId}/profile-tab | Return all profile tabs in the organization paginated |
| [**updateExistingTab**](ProfileTabApi.md#updateExistingTab) | **PATCH** /v1/org/{orgId}/profile-tab/{profileTabId} | Update an existing profile tab |


<a name="createNewTab"></a>
# **createNewTab**
> ProfileTab createNewTab(orgId).createProfileTab(createProfileTab).execute();

Create a profile tab



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileTabApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // human-readable name of profile tab
    List<Block> blocks = Arrays.asList(); // ordered list of blocks contained by profile tab
    String status = "ACTIVE"; // status of the profile tab
    Integer sort = 56; // sort order
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String targetFilter = "targetFilter_example"; // filter that controls on which profiles this tab will appear
    String readFilter = "readFilter_example"; // filter that controls which viewers can read this profile tab. The profileTab:read permission, if present, overrides this filter
    try {
      ProfileTab result = client
              .profileTab
              .createNewTab(label, blocks, status, sort, orgId)
              .targetFilter(targetFilter)
              .readFilter(readFilter)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getBlocks());
      System.out.println(result.getStatus());
      System.out.println(result.getTargetFilter());
      System.out.println(result.getReadFilter());
      System.out.println(result.getSort());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#createNewTab");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileTab> response = client
              .profileTab
              .createNewTab(label, blocks, status, sort, orgId)
              .targetFilter(targetFilter)
              .readFilter(readFilter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#createNewTab");
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
| **createProfileTab** | [**CreateProfileTab**](CreateProfileTab.md)| Profile tab data to create | [optional] |

### Return type

[**ProfileTab**](ProfileTab.md)

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

<a name="deleteProfileTab"></a>
# **deleteProfileTab**
> deleteProfileTab(orgId, profileTabId).execute();

Delete a profile tab



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileTabApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String profileTabId = "profileTabId_example"; // Profile tab id
    try {
      client
              .profileTab
              .deleteProfileTab(orgId, profileTabId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#deleteProfileTab");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .profileTab
              .deleteProfileTab(orgId, profileTabId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#deleteProfileTab");
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
| **profileTabId** | **String**| Profile tab id | |

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

<a name="findTabsForJob"></a>
# **findTabsForJob**
> ResultsProfileTabSummary findTabsForJob(orgId, jobId).date(date).fields(fields).execute();

Return all profile tabs applicable to a particular job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileTabApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // Job id
    LocalDate date = LocalDate.now(); // Date
    String fields = "fields_example"; // Return profile tabs that contain particular fields (comma-separated)
    try {
      ResultsProfileTabSummary result = client
              .profileTab
              .findTabsForJob(orgId, jobId)
              .date(date)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#findTabsForJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsProfileTabSummary> response = client
              .profileTab
              .findTabsForJob(orgId, jobId)
              .date(date)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#findTabsForJob");
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
| **jobId** | **String**| Job id | |
| **date** | **LocalDate**| Date | [optional] |
| **fields** | **String**| Return profile tabs that contain particular fields (comma-separated) | [optional] |

### Return type

[**ResultsProfileTabSummary**](ResultsProfileTabSummary.md)

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

<a name="getByOrgIdAndTabId"></a>
# **getByOrgIdAndTabId**
> ProfileTab getByOrgIdAndTabId(orgId, profileTabId).execute();

Return a particular profile tab by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileTabApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String profileTabId = "profileTabId_example"; // Content id
    try {
      ProfileTab result = client
              .profileTab
              .getByOrgIdAndTabId(orgId, profileTabId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getBlocks());
      System.out.println(result.getStatus());
      System.out.println(result.getTargetFilter());
      System.out.println(result.getReadFilter());
      System.out.println(result.getSort());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#getByOrgIdAndTabId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileTab> response = client
              .profileTab
              .getByOrgIdAndTabId(orgId, profileTabId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#getByOrgIdAndTabId");
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
| **profileTabId** | **String**| Content id | |

### Return type

[**ProfileTab**](ProfileTab.md)

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
| **404** | not found |  -  |

<a name="getEvaluateProfileTabContent"></a>
# **getEvaluateProfileTabContent**
> ProfileTabSummary getEvaluateProfileTabContent(orgId, jobId, tabId).date(date).execute();

Fetch and evaluate the content of a particular profile tab id, relative to a particular job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileTabApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // Job id
    String tabId = "tabId_example"; // Profile tab id
    LocalDate date = LocalDate.now(); // Date
    try {
      ProfileTabSummary result = client
              .profileTab
              .getEvaluateProfileTabContent(orgId, jobId, tabId)
              .date(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getLabel());
      System.out.println(result.getIsBuiltin());
      System.out.println(result.getIsSensitive());
      System.out.println(result.getBlocks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#getEvaluateProfileTabContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileTabSummary> response = client
              .profileTab
              .getEvaluateProfileTabContent(orgId, jobId, tabId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#getEvaluateProfileTabContent");
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
| **jobId** | **String**| Job id | |
| **tabId** | **String**| Profile tab id | |
| **date** | **LocalDate**| Date | [optional] |

### Return type

[**ProfileTabSummary**](ProfileTabSummary.md)

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

<a name="getProfileTabs"></a>
# **getProfileTabs**
> ResultsProfileTabSummary getProfileTabs(orgId, personId).date(date).fields(fields).execute();

Return all profile tabs applicable to a particular person



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileTabApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String personId = "personId_example"; // Person id
    LocalDate date = LocalDate.now(); // Date
    String fields = "fields_example"; // Return profile tabs that contain particular fields (comma-separated)
    try {
      ResultsProfileTabSummary result = client
              .profileTab
              .getProfileTabs(orgId, personId)
              .date(date)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#getProfileTabs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsProfileTabSummary> response = client
              .profileTab
              .getProfileTabs(orgId, personId)
              .date(date)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#getProfileTabs");
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
| **personId** | **String**| Person id | |
| **date** | **LocalDate**| Date | [optional] |
| **fields** | **String**| Return profile tabs that contain particular fields (comma-separated) | [optional] |

### Return type

[**ResultsProfileTabSummary**](ResultsProfileTabSummary.md)

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

<a name="listProfileTabs"></a>
# **listProfileTabs**
> ResultsProfileTab listProfileTabs(orgId).status(status).from(from).limit(limit).execute();

Return all profile tabs in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileTabApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String status = "ACTIVE"; // Status to filter by
    String from = "from_example"; // Content id to start paginating from
    Integer limit = 56; // Number of results to return
    try {
      ResultsProfileTab result = client
              .profileTab
              .listProfileTabs(orgId)
              .status(status)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#listProfileTabs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsProfileTab> response = client
              .profileTab
              .listProfileTabs(orgId)
              .status(status)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#listProfileTabs");
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
| **status** | **String**| Status to filter by | [optional] [enum: ACTIVE, INACTIVE] |
| **from** | **String**| Content id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsProfileTab**](ResultsProfileTab.md)

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

<a name="updateExistingTab"></a>
# **updateExistingTab**
> updateExistingTab(orgId, profileTabId).updateProfileTab(updateProfileTab).execute();

Update an existing profile tab



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileTabApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String profileTabId = "profileTabId_example"; // Profile tab id
    String label = "label_example"; // human-readable name of profile tab
    List<Block> blocks = Arrays.asList(); // ordered list of blocks contained by profile tab
    String status = "ACTIVE"; // status of the profile tab
    String targetFilter = "targetFilter_example"; // filter that controls on which profiles this tab will appear
    String readFilter = "readFilter_example"; // filter that controls which viewers can read this profile tab. The profileTab:read permission, if present, overrides this filter
    Integer sort = 56; // sort order
    try {
      client
              .profileTab
              .updateExistingTab(orgId, profileTabId)
              .label(label)
              .blocks(blocks)
              .status(status)
              .targetFilter(targetFilter)
              .readFilter(readFilter)
              .sort(sort)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#updateExistingTab");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .profileTab
              .updateExistingTab(orgId, profileTabId)
              .label(label)
              .blocks(blocks)
              .status(status)
              .targetFilter(targetFilter)
              .readFilter(readFilter)
              .sort(sort)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileTabApi#updateExistingTab");
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
| **profileTabId** | **String**| Profile tab id | |
| **updateProfileTab** | [**UpdateProfileTab**](UpdateProfileTab.md)| Profile tab data to update | [optional] |

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

