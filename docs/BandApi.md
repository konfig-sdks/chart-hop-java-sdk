# BandApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompBand**](BandApi.md#createCompBand) | **POST** /v1/org/{orgId}/band | Create a comp band |
| [**deleteCompBandsOnDate**](BandApi.md#deleteCompBandsOnDate) | **DELETE** /v1/org/{orgId}/band | Delete all comp bands on a date |
| [**deleteCompBandsOnDate_0**](BandApi.md#deleteCompBandsOnDate_0) | **DELETE** /v1/org/{orgId}/band/reset | Delete all comp band data on a date |
| [**findCompBandsInOrg**](BandApi.md#findCompBandsInOrg) | **GET** /v1/org/{orgId}/band/{bandId} | Return a particular comp band by id on an effective date |
| [**findCompBandsInOrg_0**](BandApi.md#findCompBandsInOrg_0) | **GET** /v1/org/{orgId}/band | Find comp bands in the organization |
| [**removeCompBand**](BandApi.md#removeCompBand) | **DELETE** /v1/org/{orgId}/band/{bandId} | Delete a comp band |
| [**updateCompBandById**](BandApi.md#updateCompBandById) | **PATCH** /v1/org/{orgId}/band/{bandId} | Update a comp band |


<a name="createCompBand"></a>
# **createCompBand**
> createCompBand(orgId).date(date).createCompBand(createCompBand).execute();

Create a comp band



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // human-readable name of content
    String color = "color_example"; // hex color associated with the band level
    EnumValue baseInterval = new EnumValue();
    String jobLevel = "jobLevel_example"; // job level associated with the comp band
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    Money baseCompMax = new Money();
    Money baseCompMid = new Money();
    Money baseCompMin = new Money();
    Double baseSpread = 3.4D; // spread percent used to calculate base comp from the midpoint
    Money baseTargetPay = new Money();
    Double baseTargetPayPercentile = 3.4D; // base target pay associated with open jobs at this band level, as a percentile
    Double equityTargetShares = 3.4D; // target equity for the band, in shares
    Double equityTargetPercentOfBase = 3.4D; // target equity for the band, as a percentage of base
    Double equityTargetValue = 3.4D; // target equity for the band, as a monetary value, in the same currency as the base
    Money variableValue = new Money();
    Double variablePercentOfBase = 3.4D; // variable compensation for the band, specified as a percentage of base
    String jobTierOneField = "jobTierOneField_example"; // first job tier associated with the comp band
    String jobTierTwoField = "jobTierTwoField_example"; // second job tier associated with the comp band
    String jobTierThreeField = "jobTierThreeField_example"; // third job tier associated with the comp band
    LocalDate date = LocalDate.now(); // Effective date of band creation
    try {
      client
              .band
              .createCompBand(label, color, baseInterval, jobLevel, orgId)
              .baseCompMax(baseCompMax)
              .baseCompMid(baseCompMid)
              .baseCompMin(baseCompMin)
              .baseSpread(baseSpread)
              .baseTargetPay(baseTargetPay)
              .baseTargetPayPercentile(baseTargetPayPercentile)
              .equityTargetShares(equityTargetShares)
              .equityTargetPercentOfBase(equityTargetPercentOfBase)
              .equityTargetValue(equityTargetValue)
              .variableValue(variableValue)
              .variablePercentOfBase(variablePercentOfBase)
              .jobTierOneField(jobTierOneField)
              .jobTierTwoField(jobTierTwoField)
              .jobTierThreeField(jobTierThreeField)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#createCompBand");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .band
              .createCompBand(label, color, baseInterval, jobLevel, orgId)
              .baseCompMax(baseCompMax)
              .baseCompMid(baseCompMid)
              .baseCompMin(baseCompMin)
              .baseSpread(baseSpread)
              .baseTargetPay(baseTargetPay)
              .baseTargetPayPercentile(baseTargetPayPercentile)
              .equityTargetShares(equityTargetShares)
              .equityTargetPercentOfBase(equityTargetPercentOfBase)
              .equityTargetValue(equityTargetValue)
              .variableValue(variableValue)
              .variablePercentOfBase(variablePercentOfBase)
              .jobTierOneField(jobTierOneField)
              .jobTierTwoField(jobTierTwoField)
              .jobTierThreeField(jobTierThreeField)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#createCompBand");
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
| **date** | **LocalDate**| Effective date of band creation | [optional] |
| **createCompBand** | [**CreateCompBand**](CreateCompBand.md)|  | [optional] |

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

<a name="deleteCompBandsOnDate"></a>
# **deleteCompBandsOnDate**
> Process deleteCompBandsOnDate(orgId).date(date).execute();

Delete all comp bands on a date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Effective date of group update
    try {
      Process result = client
              .band
              .deleteCompBandsOnDate(orgId)
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
      System.err.println("Exception when calling BandApi#deleteCompBandsOnDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .band
              .deleteCompBandsOnDate(orgId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#deleteCompBandsOnDate");
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
| **date** | **LocalDate**| Effective date of group update | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="deleteCompBandsOnDate_0"></a>
# **deleteCompBandsOnDate_0**
> Process deleteCompBandsOnDate_0(orgId).date(date).execute();

Delete all comp band data on a date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Effective date of group update
    try {
      Process result = client
              .band
              .deleteCompBandsOnDate_0(orgId)
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
      System.err.println("Exception when calling BandApi#deleteCompBandsOnDate_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .band
              .deleteCompBandsOnDate_0(orgId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#deleteCompBandsOnDate_0");
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
| **date** | **LocalDate**| Effective date of group update | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="findCompBandsInOrg"></a>
# **findCompBandsInOrg**
> ResultsData findCompBandsInOrg(orgId, bandId).date(date).execute();

Return a particular comp band by id on an effective date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String bandId = "bandId_example"; // Comp band id
    LocalDate date = LocalDate.now(); // Date to search as of
    try {
      ResultsData result = client
              .band
              .findCompBandsInOrg(orgId, bandId)
              .date(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#findCompBandsInOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .band
              .findCompBandsInOrg(orgId, bandId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#findCompBandsInOrg");
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
| **bandId** | **String**| Comp band id | |
| **date** | **LocalDate**| Date to search as of | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="findCompBandsInOrg_0"></a>
# **findCompBandsInOrg_0**
> ResultsData findCompBandsInOrg_0(orgId).date(date).from(from).limit(limit).includeDeleted(includeDeleted).returnAccess(returnAccess).execute();

Find comp bands in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to search as of
    String from = "from_example"; // Table id to start paginating from
    Integer limit = 56; // Number of results to return
    Boolean includeDeleted = true; // Include deleted bands
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsData result = client
              .band
              .findCompBandsInOrg_0(orgId)
              .date(date)
              .from(from)
              .limit(limit)
              .includeDeleted(includeDeleted)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#findCompBandsInOrg_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .band
              .findCompBandsInOrg_0(orgId)
              .date(date)
              .from(from)
              .limit(limit)
              .includeDeleted(includeDeleted)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#findCompBandsInOrg_0");
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
| **date** | **LocalDate**| Date to search as of | [optional] |
| **from** | **String**| Table id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **includeDeleted** | **Boolean**| Include deleted bands | [optional] |
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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="removeCompBand"></a>
# **removeCompBand**
> removeCompBand(orgId, bandId).date(date).execute();

Delete a comp band



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String bandId = "bandId_example"; // Comp band id
    LocalDate date = LocalDate.now(); // Effective date of group update
    try {
      client
              .band
              .removeCompBand(orgId, bandId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#removeCompBand");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .band
              .removeCompBand(orgId, bandId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#removeCompBand");
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
| **bandId** | **String**| Comp band id | |
| **date** | **LocalDate**| Effective date of group update | [optional] |

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

<a name="updateCompBandById"></a>
# **updateCompBandById**
> updateCompBandById(orgId, bandId).date(date).updateCompBand(updateCompBand).execute();

Update a comp band



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String bandId = "bandId_example"; // Band id
    String label = "label_example"; // human-readable name of content
    String color = "color_example"; // hex color associated with the band level
    Money baseCompMax = new Money();
    Money baseCompMid = new Money();
    Money baseCompMin = new Money();
    Double baseSpread = 3.4D; // spread percent used to calculate base comp from the midpoint
    EnumValue baseInterval = new EnumValue();
    Money baseTargetPay = new Money();
    Double baseTargetPayPercentile = 3.4D; // base target pay associated with open jobs at this band level, as a percentile
    Double equityTargetShares = 3.4D; // target equity for the band, in shares
    Double equityTargetPercentOfBase = 3.4D; // target equity for the band, as a percentage of base
    Double equityTargetValue = 3.4D; // target equity for the band, as a monetary value, in the same currency as the base
    Money variableValue = new Money();
    Double variablePercentOfBase = 3.4D; // variable compensation for the band, specified as a percentage of base
    JobTierField jobTierOneField = new JobTierField();
    JobTierField jobTierTwoField = new JobTierField();
    JobTierField jobTierThreeField = new JobTierField();
    String jobLevel = "jobLevel_example"; // job level associated with the comp band
    LocalDate date = LocalDate.now(); // Effective date of band update
    try {
      client
              .band
              .updateCompBandById(orgId, bandId)
              .label(label)
              .color(color)
              .baseCompMax(baseCompMax)
              .baseCompMid(baseCompMid)
              .baseCompMin(baseCompMin)
              .baseSpread(baseSpread)
              .baseInterval(baseInterval)
              .baseTargetPay(baseTargetPay)
              .baseTargetPayPercentile(baseTargetPayPercentile)
              .equityTargetShares(equityTargetShares)
              .equityTargetPercentOfBase(equityTargetPercentOfBase)
              .equityTargetValue(equityTargetValue)
              .variableValue(variableValue)
              .variablePercentOfBase(variablePercentOfBase)
              .jobTierOneField(jobTierOneField)
              .jobTierTwoField(jobTierTwoField)
              .jobTierThreeField(jobTierThreeField)
              .jobLevel(jobLevel)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#updateCompBandById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .band
              .updateCompBandById(orgId, bandId)
              .label(label)
              .color(color)
              .baseCompMax(baseCompMax)
              .baseCompMid(baseCompMid)
              .baseCompMin(baseCompMin)
              .baseSpread(baseSpread)
              .baseInterval(baseInterval)
              .baseTargetPay(baseTargetPay)
              .baseTargetPayPercentile(baseTargetPayPercentile)
              .equityTargetShares(equityTargetShares)
              .equityTargetPercentOfBase(equityTargetPercentOfBase)
              .equityTargetValue(equityTargetValue)
              .variableValue(variableValue)
              .variablePercentOfBase(variablePercentOfBase)
              .jobTierOneField(jobTierOneField)
              .jobTierTwoField(jobTierTwoField)
              .jobTierThreeField(jobTierThreeField)
              .jobLevel(jobLevel)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BandApi#updateCompBandById");
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
| **bandId** | **String**| Band id | |
| **date** | **LocalDate**| Effective date of band update | [optional] |
| **updateCompBand** | [**UpdateCompBand**](UpdateCompBand.md)|  | [optional] |

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

