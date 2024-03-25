# PersonApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPerson**](PersonApi.md#createNewPerson) | **POST** /v2/org/{orgId}/person | Create a person |
| [**findInOrganization**](PersonApi.md#findInOrganization) | **GET** /v2/org/{orgId}/person | Find persons in the organization |
| [**getById**](PersonApi.md#getById) | **GET** /v2/org/{orgId}/person/{personId} | Return a particular person by id |
| [**getGeocodesForOrg**](PersonApi.md#getGeocodesForOrg) | **GET** /v2/org/{orgId}/person/geocodes | Return all geocodes for persons in the organization |
| [**removeById**](PersonApi.md#removeById) | **DELETE** /v2/org/{orgId}/person/{personId} | Delete a person |
| [**updateById**](PersonApi.md#updateById) | **PATCH** /v2/org/{orgId}/person/{personId} | Update a person |


<a name="createNewPerson"></a>
# **createNewPerson**
> Object createNewPerson(orgId).scenarioId(scenarioId).date(date).requestBody(requestBody).execute();

Create a person



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id to create the person in
    LocalDate date = LocalDate.now(); // Effective date of person creation
    try {
      Object result = client
              .person
              .createNewPerson(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#createNewPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .person
              .createNewPerson(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#createNewPerson");
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
| **scenarioId** | **String**| Scenario id to create the person in | [optional] |
| **date** | **LocalDate**| Effective date of person creation | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

**Object**

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

<a name="findInOrganization"></a>
# **findInOrganization**
> ResultsData findInOrganization(orgId).scenarioId(scenarioId).date(date).startDate(startDate).endDate(endDate).q(q).from(from).limit(limit).fields(fields).fieldsList(fieldsList).includeAll(includeAll).format(format).returnAccess(returnAccess).execute();

Find persons in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date to search as of
    LocalDate startDate = LocalDate.now(); // Start date, if retrieving persons employed between two dates (inclusive)
    LocalDate endDate = LocalDate.now(); // End date, if retrieving persons employed between two dates (inclusive)
    String q = "q_example"; // Search query
    String from = "from_example"; // Person id to start paginating from
    Integer limit = 56; // Number of results to return
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    List<String> fieldsList = Arrays.asList(); // Fields to retrieve, list syntax
    Boolean includeAll = true; // Include all persons in the system, including ex-employees or persons who were never in jobs
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsData result = client
              .person
              .findInOrganization(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .startDate(startDate)
              .endDate(endDate)
              .q(q)
              .from(from)
              .limit(limit)
              .fields(fields)
              .fieldsList(fieldsList)
              .includeAll(includeAll)
              .format(format)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#findInOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .person
              .findInOrganization(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .startDate(startDate)
              .endDate(endDate)
              .q(q)
              .from(from)
              .limit(limit)
              .fields(fields)
              .fieldsList(fieldsList)
              .includeAll(includeAll)
              .format(format)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#findInOrganization");
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
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date to search as of | [optional] |
| **startDate** | **LocalDate**| Start date, if retrieving persons employed between two dates (inclusive) | [optional] |
| **endDate** | **LocalDate**| End date, if retrieving persons employed between two dates (inclusive) | [optional] |
| **q** | **String**| Search query | [optional] |
| **from** | **String**| Person id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **fieldsList** | [**List&lt;String&gt;**](String.md)| Fields to retrieve, list syntax | [optional] |
| **includeAll** | **Boolean**| Include all persons in the system, including ex-employees or persons who were never in jobs | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

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

<a name="getById"></a>
# **getById**
> Object getById(orgId, personId).scenarioId(scenarioId).date(date).fields(fields).format(format).execute();

Return a particular person by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonApi;
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
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      Object result = client
              .person
              .getById(orgId, personId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .person
              .getById(orgId, personId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getById");
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
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

### Return type

**Object**

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

<a name="getGeocodesForOrg"></a>
# **getGeocodesForOrg**
> List&lt;Geocode&gt; getGeocodesForOrg(orgId).fields(fields).execute();

Return all geocodes for persons in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    try {
      List<Geocode> result = client
              .person
              .getGeocodesForOrg(orgId)
              .fields(fields)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getGeocodesForOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Geocode>> response = client
              .person
              .getGeocodesForOrg(orgId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getGeocodesForOrg");
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
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |

### Return type

[**List&lt;Geocode&gt;**](Geocode.md)

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

<a name="removeById"></a>
# **removeById**
> removeById(orgId, personId).execute();

Delete a person



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonApi;
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
    try {
      client
              .person
              .removeById(orgId, personId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .person
              .removeById(orgId, personId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#removeById");
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

<a name="updateById"></a>
# **updateById**
> updateById(orgId, personId).scenarioId(scenarioId).date(date).requestBody(requestBody).execute();

Update a person



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonApi;
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
    String scenarioId = "scenarioId_example"; // Scenario id to update the person in
    LocalDate date = LocalDate.now(); // Effective date of person update
    try {
      client
              .person
              .updateById(orgId, personId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .person
              .updateById(orgId, personId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#updateById");
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
| **scenarioId** | **String**| Scenario id to update the person in | [optional] |
| **date** | **LocalDate**| Effective date of person update | [optional] |
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

