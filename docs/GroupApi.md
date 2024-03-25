# GroupApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewGroup**](GroupApi.md#createNewGroup) | **POST** /v2/org/{orgId}/group/{type} | Create a group |
| [**findInOrgOfType**](GroupApi.md#findInOrgOfType) | **GET** /v2/org/{orgId}/group/graph | Find groups in the organization of a certain type |
| [**findOfType**](GroupApi.md#findOfType) | **GET** /v2/org/{orgId}/group/{type} | Find groups in the organization of a certain type |
| [**findOrphanedGroups**](GroupApi.md#findOrphanedGroups) | **GET** /v2/org/{orgId}/group/orphaned | Find groups in the organization that have no child groups |
| [**getById**](GroupApi.md#getById) | **GET** /v2/org/{orgId}/group/{type}/{groupId} | Return a particular group by id |
| [**getOrganizedGroupCounts**](GroupApi.md#getOrganizedGroupCounts) | **GET** /v2/org/{orgId}/group/count | Get organized group counts |
| [**importCsvData**](GroupApi.md#importCsvData) | **POST** /v2/org/{orgId}/group/{type}/import | Import data from CSV file |
| [**markMultipleAsDeleted**](GroupApi.md#markMultipleAsDeleted) | **POST** /v2/org/{orgId}/group/{type}/bulk-delete | Mark multiple groups as deleted |
| [**removeByGroupId**](GroupApi.md#removeByGroupId) | **DELETE** /v2/org/{orgId}/group/{type}/{groupId} | Delete a group |
| [**updateGroupDetails**](GroupApi.md#updateGroupDetails) | **PATCH** /v2/org/{orgId}/group/{type}/{groupId} | Update a group |


<a name="createNewGroup"></a>
# **createNewGroup**
> createNewGroup(orgId, type).scenarioId(scenarioId).date(date).requestBody(requestBody).execute();

Create a group



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Group type
    String scenarioId = "scenarioId_example"; // Scenario id to create the group in
    LocalDate date = LocalDate.now(); // Effective date of group creation
    try {
      client
              .group
              .createNewGroup(orgId, type)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#createNewGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .createNewGroup(orgId, type)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#createNewGroup");
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
| **type** | **String**| Group type | |
| **scenarioId** | **String**| Scenario id to create the group in | [optional] |
| **date** | **LocalDate**| Effective date of group creation | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

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
| **501** | not implemented |  -  |

<a name="findInOrgOfType"></a>
# **findInOrgOfType**
> GroupGraphResults findInOrgOfType(orgId).start(start).depth(depth).groupApproxLimit(groupApproxLimit).jobLimit(jobLimit).scenarioId(scenarioId).jobFilter(jobFilter).groupFilter(groupFilter).date(date).groupFields(groupFields).jobFields(jobFields).positionFields(positionFields).kind(kind).format(format).execute();

Find groups in the organization of a certain type



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String start = "start_example"; // group id to use as the starting point
    Integer depth = 56; // number of levels down
    Integer groupApproxLimit = 56; // limit number of groups
    Integer jobLimit = 56; // limit number of jobs
    String scenarioId = "scenarioId_example"; // scenario id to query
    String jobFilter = "jobFilter_example"; // query string to filter jobs by
    String groupFilter = "groupFilter_example"; // query string to filter group by
    LocalDate date = LocalDate.now(); // date to search as of
    String groupFields = "groupFields_example"; // group fields to return
    String jobFields = "jobFields_example"; // job/person fields to return
    String positionFields = "positionFields_example"; // position fields to return
    String kind = "kind_example"; // kind of group to query (legacy/tracked)
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      GroupGraphResults result = client
              .group
              .findInOrgOfType(orgId)
              .start(start)
              .depth(depth)
              .groupApproxLimit(groupApproxLimit)
              .jobLimit(jobLimit)
              .scenarioId(scenarioId)
              .jobFilter(jobFilter)
              .groupFilter(groupFilter)
              .date(date)
              .groupFields(groupFields)
              .jobFields(jobFields)
              .positionFields(positionFields)
              .kind(kind)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextId());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#findInOrgOfType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupGraphResults> response = client
              .group
              .findInOrgOfType(orgId)
              .start(start)
              .depth(depth)
              .groupApproxLimit(groupApproxLimit)
              .jobLimit(jobLimit)
              .scenarioId(scenarioId)
              .jobFilter(jobFilter)
              .groupFilter(groupFilter)
              .date(date)
              .groupFields(groupFields)
              .jobFields(jobFields)
              .positionFields(positionFields)
              .kind(kind)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#findInOrgOfType");
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
| **start** | **String**| group id to use as the starting point | [optional] |
| **depth** | **Integer**| number of levels down | [optional] |
| **groupApproxLimit** | **Integer**| limit number of groups | [optional] |
| **jobLimit** | **Integer**| limit number of jobs | [optional] |
| **scenarioId** | **String**| scenario id to query | [optional] |
| **jobFilter** | **String**| query string to filter jobs by | [optional] |
| **groupFilter** | **String**| query string to filter group by | [optional] |
| **date** | **LocalDate**| date to search as of | [optional] |
| **groupFields** | **String**| group fields to return | [optional] |
| **jobFields** | **String**| job/person fields to return | [optional] |
| **positionFields** | **String**| position fields to return | [optional] |
| **kind** | **String**| kind of group to query (legacy/tracked) | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

### Return type

[**GroupGraphResults**](GroupGraphResults.md)

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
| **501** | not implemented |  -  |

<a name="findOfType"></a>
# **findOfType**
> ResultsData findOfType(orgId, type).scenarioId(scenarioId).date(date).from(from).limit(limit).fields(fields).jobFields(jobFields).positionFields(positionFields).includeAll(includeAll).search(search).format(format).execute();

Find groups in the organization of a certain type



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Group type
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date to search as of
    String from = "from_example"; // Group id to start paginating from
    Integer limit = 56; // Number of results to return
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String jobFields = "jobFields_example"; // job fields to return, comma-separated
    String positionFields = "positionFields_example"; // position fields to return, comma-separated
    Boolean includeAll = true; // Include all groups, including deleted groups
    String search = "search_example"; // Search string to filter on code & name
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      ResultsData result = client
              .group
              .findOfType(orgId, type)
              .scenarioId(scenarioId)
              .date(date)
              .from(from)
              .limit(limit)
              .fields(fields)
              .jobFields(jobFields)
              .positionFields(positionFields)
              .includeAll(includeAll)
              .search(search)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#findOfType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .group
              .findOfType(orgId, type)
              .scenarioId(scenarioId)
              .date(date)
              .from(from)
              .limit(limit)
              .fields(fields)
              .jobFields(jobFields)
              .positionFields(positionFields)
              .includeAll(includeAll)
              .search(search)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#findOfType");
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
| **type** | **String**| Group type | |
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date to search as of | [optional] |
| **from** | **String**| Group id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **jobFields** | **String**| job fields to return, comma-separated | [optional] |
| **positionFields** | **String**| position fields to return, comma-separated | [optional] |
| **includeAll** | **Boolean**| Include all groups, including deleted groups | [optional] |
| **search** | **String**| Search string to filter on code &amp; name | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="findOrphanedGroups"></a>
# **findOrphanedGroups**
> GroupGraphResults findOrphanedGroups(orgId).start(start).groupLimit(groupLimit).jobLimit(jobLimit).scenarioId(scenarioId).jobFilter(jobFilter).groupFilter(groupFilter).date(date).groupFields(groupFields).jobFields(jobFields).positionFields(positionFields).kind(kind).format(format).execute();

Find groups in the organization that have no child groups



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String start = "start_example"; // group id to use as the starting point
    Integer groupLimit = 56; // limit number of groups
    Integer jobLimit = 56; // limit number of jobs
    String scenarioId = "scenarioId_example"; // scenario id to query
    String jobFilter = "jobFilter_example"; // query string to filter jobs by
    String groupFilter = "groupFilter_example"; // query string to filter group by
    LocalDate date = LocalDate.now(); // date to search as of
    String groupFields = "groupFields_example"; // group fields to return
    String jobFields = "jobFields_example"; // job/person fields to return
    String positionFields = "positionFields_example"; // position fields to return
    String kind = "kind_example"; // kind of group to query (legacy/tracked)
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      GroupGraphResults result = client
              .group
              .findOrphanedGroups(orgId)
              .start(start)
              .groupLimit(groupLimit)
              .jobLimit(jobLimit)
              .scenarioId(scenarioId)
              .jobFilter(jobFilter)
              .groupFilter(groupFilter)
              .date(date)
              .groupFields(groupFields)
              .jobFields(jobFields)
              .positionFields(positionFields)
              .kind(kind)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextId());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#findOrphanedGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupGraphResults> response = client
              .group
              .findOrphanedGroups(orgId)
              .start(start)
              .groupLimit(groupLimit)
              .jobLimit(jobLimit)
              .scenarioId(scenarioId)
              .jobFilter(jobFilter)
              .groupFilter(groupFilter)
              .date(date)
              .groupFields(groupFields)
              .jobFields(jobFields)
              .positionFields(positionFields)
              .kind(kind)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#findOrphanedGroups");
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
| **start** | **String**| group id to use as the starting point | [optional] |
| **groupLimit** | **Integer**| limit number of groups | [optional] |
| **jobLimit** | **Integer**| limit number of jobs | [optional] |
| **scenarioId** | **String**| scenario id to query | [optional] |
| **jobFilter** | **String**| query string to filter jobs by | [optional] |
| **groupFilter** | **String**| query string to filter group by | [optional] |
| **date** | **LocalDate**| date to search as of | [optional] |
| **groupFields** | **String**| group fields to return | [optional] |
| **jobFields** | **String**| job/person fields to return | [optional] |
| **positionFields** | **String**| position fields to return | [optional] |
| **kind** | **String**| kind of group to query (legacy/tracked) | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

### Return type

[**GroupGraphResults**](GroupGraphResults.md)

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
| **501** | not implemented |  -  |

<a name="getById"></a>
# **getById**
> Map&lt;String, Object&gt; getById(orgId, type, groupId).scenarioId(scenarioId).date(date).fields(fields).jobFields(jobFields).positionFields(positionFields).format(format).execute();

Return a particular group by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Group type
    String groupId = "groupId_example"; // Group identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String jobFields = "jobFields_example"; // job fields to return, comma-separated
    String positionFields = "positionFields_example"; // position fields to return, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      Map<String, Object> result = client
              .group
              .getById(orgId, type, groupId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .jobFields(jobFields)
              .positionFields(positionFields)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .group
              .getById(orgId, type, groupId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .jobFields(jobFields)
              .positionFields(positionFields)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getById");
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
| **type** | **String**| Group type | |
| **groupId** | **String**| Group identifier (either id or slug) | |
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **jobFields** | **String**| job fields to return, comma-separated | [optional] |
| **positionFields** | **String**| position fields to return, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

### Return type

**Map&lt;String, Object&gt;**

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

<a name="getOrganizedGroupCounts"></a>
# **getOrganizedGroupCounts**
> GroupCount getOrganizedGroupCounts(orgId).scenarioId(scenarioId).groupFilter(groupFilter).date(date).kind(kind).execute();

Get organized group counts



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // scenario id to query
    String groupFilter = "groupFilter_example"; // query string to filter group by
    LocalDate date = LocalDate.now(); // date to search as of
    String kind = "kind_example"; // kind of group to query (legacy/tracked)
    try {
      GroupCount result = client
              .group
              .getOrganizedGroupCounts(orgId)
              .scenarioId(scenarioId)
              .groupFilter(groupFilter)
              .date(date)
              .kind(kind)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalGroupCount());
      System.out.println(result.getRelationshipGroupCount());
      System.out.println(result.getOrphanedGroupCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getOrganizedGroupCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupCount> response = client
              .group
              .getOrganizedGroupCounts(orgId)
              .scenarioId(scenarioId)
              .groupFilter(groupFilter)
              .date(date)
              .kind(kind)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getOrganizedGroupCounts");
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
| **scenarioId** | **String**| scenario id to query | [optional] |
| **groupFilter** | **String**| query string to filter group by | [optional] |
| **date** | **LocalDate**| date to search as of | [optional] |
| **kind** | **String**| kind of group to query (legacy/tracked) | [optional] |

### Return type

[**GroupCount**](GroupCount.md)

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
| **501** | not implemented |  -  |

<a name="importCsvData"></a>
# **importCsvData**
> Process importCsvData(orgId, type).date(date).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Import data from CSV file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Group type
    File _file = new File("/path/to/file");
    LocalDate date = LocalDate.now(); // Date to update as of
    try {
      Process result = client
              .group
              .importCsvData(orgId, type)
              ._file(_file)
              .date(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#importCsvData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .group
              .importCsvData(orgId, type)
              ._file(_file)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#importCsvData");
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
| **type** | **String**| Group type | |
| **date** | **LocalDate**| Date to update as of | [optional] |
| **fileUploadNewFileRequest** | [**FileUploadNewFileRequest**](FileUploadNewFileRequest.md)|  | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | successful operation |  -  |
| **400** | invalid manifest data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="markMultipleAsDeleted"></a>
# **markMultipleAsDeleted**
> Process markMultipleAsDeleted(orgId, type).scenarioId(scenarioId).requestBody(requestBody).execute();

Mark multiple groups as deleted



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Group type
    String scenarioId = "scenarioId_example"; // Scenario id to update the group in
    try {
      Process result = client
              .group
              .markMultipleAsDeleted(orgId, type)
              .scenarioId(scenarioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#markMultipleAsDeleted");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .group
              .markMultipleAsDeleted(orgId, type)
              .scenarioId(scenarioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#markMultipleAsDeleted");
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
| **type** | **String**| Group type | |
| **scenarioId** | **String**| Scenario id to update the group in | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)| Group ids of groups to bulk delete | [optional] |

### Return type

[**Process**](Process.md)

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

<a name="removeByGroupId"></a>
# **removeByGroupId**
> removeByGroupId(orgId, type, groupId).scenarioId(scenarioId).date(date).execute();

Delete a group



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Group type
    String groupId = "groupId_example"; // Group id
    String scenarioId = "scenarioId_example"; // Scenario id to update the group in
    LocalDate date = LocalDate.now(); // Date to update as of
    try {
      client
              .group
              .removeByGroupId(orgId, type, groupId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeByGroupId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .removeByGroupId(orgId, type, groupId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeByGroupId");
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
| **type** | **String**| Group type | |
| **groupId** | **String**| Group id | |
| **scenarioId** | **String**| Scenario id to update the group in | [optional] |
| **date** | **LocalDate**| Date to update as of | [optional] |

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
| **501** | not implemented |  -  |

<a name="updateGroupDetails"></a>
# **updateGroupDetails**
> updateGroupDetails(orgId, type, groupId).scenarioId(scenarioId).date(date).requestBody(requestBody).execute();

Update a group



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Group type
    String groupId = "groupId_example"; // Group id
    String scenarioId = "scenarioId_example"; // Scenario id to update the group in
    LocalDate date = LocalDate.now(); // Effective date of group update
    try {
      client
              .group
              .updateGroupDetails(orgId, type, groupId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateGroupDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .updateGroupDetails(orgId, type, groupId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateGroupDetails");
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
| **type** | **String**| Group type | |
| **groupId** | **String**| Group id | |
| **scenarioId** | **String**| Scenario id to update the group in | [optional] |
| **date** | **LocalDate**| Effective date of group update | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

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
| **501** | not implemented |  -  |

