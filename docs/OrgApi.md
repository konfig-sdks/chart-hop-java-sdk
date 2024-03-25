# OrgApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consentTermsOfService**](OrgApi.md#consentTermsOfService) | **POST** /v1/org/{orgId}/agreement | Consent on Terms of Service agreement |
| [**createNewJobPlaceholder**](OrgApi.md#createNewJobPlaceholder) | **POST** /v1/org/{orgId}/change-head | Create a new org head in the history, by creating an empty job placeholder above the current head |
| [**createNewOrg**](OrgApi.md#createNewOrg) | **POST** /v1/org | Create a new org |
| [**getById**](OrgApi.md#getById) | **GET** /v1/org/{orgId} | Return a particular org by id |
| [**getBySlug**](OrgApi.md#getBySlug) | **GET** /v1/org/slug/{slug} | Return a particular org by slug |
| [**getDataUserPersonById**](OrgApi.md#getDataUserPersonById) | **GET** /v1/org/{orgId}/data-user-person | Gets a user or person by id. If both are provided, userId takes precedence |
| [**getDataUserPersonCount**](OrgApi.md#getDataUserPersonCount) | **GET** /v1/org/{orgId}/data-user-person-count | Gets the count of joined users, invited users, and org members who are not yet invited |
| [**getDataUsersPersons**](OrgApi.md#getDataUsersPersons) | **GET** /v1/org/{orgId}/data-users-persons | Gets a list of org users (joined or invited) and org members (not yet invited) |
| [**getOauth2AuthorizationCode**](OrgApi.md#getOauth2AuthorizationCode) | **POST** /v1/org/{org}/app-install-code | Retrieve an Oauth2 authorization code to install an app at this org |
| [**getUserAccess**](OrgApi.md#getUserAccess) | **GET** /v1/org/{orgId}/access | Return information on current user&#39;s access |
| [**getValidationBySlug**](OrgApi.md#getValidationBySlug) | **GET** /org/{slug} | Return validation for a org by slug |
| [**getWelcomeEmailSettings**](OrgApi.md#getWelcomeEmailSettings) | **GET** /v1/org/{orgId}/welcome-email | Gets the custom setting or default for the welcome email&#39;s subject, body, cta button label |
| [**listVisibleOrgs**](OrgApi.md#listVisibleOrgs) | **GET** /v1/org | Return all visible orgs, paginated by name |
| [**sendTestEmailToOneself**](OrgApi.md#sendTestEmailToOneself) | **POST** /v1/org/{orgId}/test-email | Send a test welcome email to oneself |
| [**updateExistingOrg**](OrgApi.md#updateExistingOrg) | **PATCH** /v1/org/{orgId} | Update an existing org |
| [**validateAppInstallAuthorizationCode**](OrgApi.md#validateAppInstallAuthorizationCode) | **POST** /v1/org/app-install-code/validate | Validate authorization code |


<a name="consentTermsOfService"></a>
# **consentTermsOfService**
> consentTermsOfService(orgId).agreementRequest(agreementRequest).execute();

Consent on Terms of Service agreement



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String action = "action_example"; // action taken
    String legalDocId = "legalDocId_example"; // legal document entity id
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      client
              .org
              .consentTermsOfService(action, legalDocId, orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#consentTermsOfService");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .org
              .consentTermsOfService(action, legalDocId, orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#consentTermsOfService");
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
| **agreementRequest** | [**AgreementRequest**](AgreementRequest.md)|  | [optional] |

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
| **404** | not found |  -  |

<a name="createNewJobPlaceholder"></a>
# **createNewJobPlaceholder**
> createNewJobPlaceholder(orgId).execute();

Create a new org head in the history, by creating an empty job placeholder above the current head



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
              .org
              .createNewJobPlaceholder(orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#createNewJobPlaceholder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .org
              .createNewJobPlaceholder(orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#createNewJobPlaceholder");
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
| **404** | not found |  -  |

<a name="createNewOrg"></a>
# **createNewOrg**
> Org createNewOrg().createOrg(createOrg).execute();

Create a new org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // name of organization
    String type = "PRIVATE"; // type of organization
    Integer estEmployees = 56; // approximate number of employees
    String status = "ACTIVE"; // current status of organization
    List<String> currencies = Arrays.asList(); // types of currencies in use, with the first currency the primary currency
    String timezone = "timezone_example"; // timezone in use
    Boolean onboarding = true; // current onboarding status of an organization, allowing clearing of org
    String customerId = "customerId_example"; // customer for billing processing
    String slug = "slug_example"; // unique slug of organization
    String industry = "industry_example"; // industry
    Integer estRevenue = 56; // approximate amount of revenue
    Integer foundedYear = 56; // year of founding
    Address address = new Address();
    String phone = "phone_example"; // company phone number in E.164 format
    String email = "email_example"; // primary contact email
    URI url = new URI(); // website URL
    List<OrgDomain> domains = Arrays.asList(); // domains used by this org
    String imagePath = "imagePath_example"; // path to full-sized profile image in storage
    String stock = "stock_example"; // stock symbol
    String appTime = "appTime_example"; // approximate time of day for daily app syncs to run (defaults to 9am Eastern time)
    Integer zone = 56; // infrastructure zone
    Integer fiscalStart = 56; // number of months into the calendar year that the fiscal year starts (1 = February, 2 = March)
    String startDate = "startDate_example"; // start date of history
    Object sensitiveFields = null; // map of sensitive field defaults
    Object options = null; // org-public options
    Object internalOptions = null; // internal (ChartHop controlled) options
    List<OnboardStepResult> onboardSteps = Arrays.asList(); // list of onboard steps that this Org has completed (or skipped)
    Boolean selfServeImporting = true; // completion status of initial import for orgs signed up via self serve
    Integer headCount = 56; // number of total headcount currently in the org
    try {
      Org result = client
              .org
              .createNewOrg(name, type, estEmployees, status, currencies, timezone, onboarding)
              .customerId(customerId)
              .slug(slug)
              .industry(industry)
              .estRevenue(estRevenue)
              .foundedYear(foundedYear)
              .address(address)
              .phone(phone)
              .email(email)
              .url(url)
              .domains(domains)
              .imagePath(imagePath)
              .stock(stock)
              .appTime(appTime)
              .zone(zone)
              .fiscalStart(fiscalStart)
              .startDate(startDate)
              .sensitiveFields(sensitiveFields)
              .options(options)
              .internalOptions(internalOptions)
              .onboardSteps(onboardSteps)
              .selfServeImporting(selfServeImporting)
              .headCount(headCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomerId());
      System.out.println(result.getName());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getIndustry());
      System.out.println(result.getEstEmployees());
      System.out.println(result.getEstRevenue());
      System.out.println(result.getFoundedYear());
      System.out.println(result.getAddress());
      System.out.println(result.getPhone());
      System.out.println(result.getEmail());
      System.out.println(result.getUrl());
      System.out.println(result.getDomains());
      System.out.println(result.getStatus());
      System.out.println(result.getImagePath());
      System.out.println(result.getCurrencies());
      System.out.println(result.getStock());
      System.out.println(result.getTimezone());
      System.out.println(result.getAppTime());
      System.out.println(result.getZone());
      System.out.println(result.getFiscalStart());
      System.out.println(result.getHeadJobId());
      System.out.println(result.getStartDate());
      System.out.println(result.getSensitiveFields());
      System.out.println(result.getOptions());
      System.out.println(result.getInternalOptions());
      System.out.println(result.getOnboardSteps());
      System.out.println(result.getOnboarding());
      System.out.println(result.getSelfServeImporting());
      System.out.println(result.getHeadCount());
      System.out.println(result.getUserCount());
      System.out.println(result.getActiveUserCount());
      System.out.println(result.getActiveAt());
      System.out.println(result.getChangeAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDestroyAt());
      System.out.println(result.getDestroyId());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#createNewOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Org> response = client
              .org
              .createNewOrg(name, type, estEmployees, status, currencies, timezone, onboarding)
              .customerId(customerId)
              .slug(slug)
              .industry(industry)
              .estRevenue(estRevenue)
              .foundedYear(foundedYear)
              .address(address)
              .phone(phone)
              .email(email)
              .url(url)
              .domains(domains)
              .imagePath(imagePath)
              .stock(stock)
              .appTime(appTime)
              .zone(zone)
              .fiscalStart(fiscalStart)
              .startDate(startDate)
              .sensitiveFields(sensitiveFields)
              .options(options)
              .internalOptions(internalOptions)
              .onboardSteps(onboardSteps)
              .selfServeImporting(selfServeImporting)
              .headCount(headCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#createNewOrg");
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
| **createOrg** | [**CreateOrg**](CreateOrg.md)| Org data to create | [optional] |

### Return type

[**Org**](Org.md)

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

<a name="getById"></a>
# **getById**
> Org getById(orgId).execute();

Return a particular org by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      Org result = client
              .org
              .getById(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomerId());
      System.out.println(result.getName());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getIndustry());
      System.out.println(result.getEstEmployees());
      System.out.println(result.getEstRevenue());
      System.out.println(result.getFoundedYear());
      System.out.println(result.getAddress());
      System.out.println(result.getPhone());
      System.out.println(result.getEmail());
      System.out.println(result.getUrl());
      System.out.println(result.getDomains());
      System.out.println(result.getStatus());
      System.out.println(result.getImagePath());
      System.out.println(result.getCurrencies());
      System.out.println(result.getStock());
      System.out.println(result.getTimezone());
      System.out.println(result.getAppTime());
      System.out.println(result.getZone());
      System.out.println(result.getFiscalStart());
      System.out.println(result.getHeadJobId());
      System.out.println(result.getStartDate());
      System.out.println(result.getSensitiveFields());
      System.out.println(result.getOptions());
      System.out.println(result.getInternalOptions());
      System.out.println(result.getOnboardSteps());
      System.out.println(result.getOnboarding());
      System.out.println(result.getSelfServeImporting());
      System.out.println(result.getHeadCount());
      System.out.println(result.getUserCount());
      System.out.println(result.getActiveUserCount());
      System.out.println(result.getActiveAt());
      System.out.println(result.getChangeAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDestroyAt());
      System.out.println(result.getDestroyId());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Org> response = client
              .org
              .getById(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getById");
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

### Return type

[**Org**](Org.md)

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

<a name="getBySlug"></a>
# **getBySlug**
> Org getBySlug(slug).execute();

Return a particular org by slug



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String slug = "slug_example"; // Org slug
    try {
      Org result = client
              .org
              .getBySlug(slug)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomerId());
      System.out.println(result.getName());
      System.out.println(result.getSlug());
      System.out.println(result.getType());
      System.out.println(result.getIndustry());
      System.out.println(result.getEstEmployees());
      System.out.println(result.getEstRevenue());
      System.out.println(result.getFoundedYear());
      System.out.println(result.getAddress());
      System.out.println(result.getPhone());
      System.out.println(result.getEmail());
      System.out.println(result.getUrl());
      System.out.println(result.getDomains());
      System.out.println(result.getStatus());
      System.out.println(result.getImagePath());
      System.out.println(result.getCurrencies());
      System.out.println(result.getStock());
      System.out.println(result.getTimezone());
      System.out.println(result.getAppTime());
      System.out.println(result.getZone());
      System.out.println(result.getFiscalStart());
      System.out.println(result.getHeadJobId());
      System.out.println(result.getStartDate());
      System.out.println(result.getSensitiveFields());
      System.out.println(result.getOptions());
      System.out.println(result.getInternalOptions());
      System.out.println(result.getOnboardSteps());
      System.out.println(result.getOnboarding());
      System.out.println(result.getSelfServeImporting());
      System.out.println(result.getHeadCount());
      System.out.println(result.getUserCount());
      System.out.println(result.getActiveUserCount());
      System.out.println(result.getActiveAt());
      System.out.println(result.getChangeAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDestroyAt());
      System.out.println(result.getDestroyId());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getBySlug");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Org> response = client
              .org
              .getBySlug(slug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getBySlug");
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
| **slug** | **String**| Org slug | |

### Return type

[**Org**](Org.md)

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

<a name="getDataUserPersonById"></a>
# **getDataUserPersonById**
> OrgUsersPersonsResponse getDataUserPersonById(orgId).userId(userId).personId(personId).execute();

Gets a user or person by id. If both are provided, userId takes precedence



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String userId = "userId_example"; // userId
    String personId = "personId_example"; // personId
    try {
      OrgUsersPersonsResponse result = client
              .org
              .getDataUserPersonById(orgId)
              .userId(userId)
              .personId(personId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRows());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getDataUserPersonById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgUsersPersonsResponse> response = client
              .org
              .getDataUserPersonById(orgId)
              .userId(userId)
              .personId(personId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getDataUserPersonById");
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
| **userId** | **String**| userId | [optional] |
| **personId** | **String**| personId | [optional] |

### Return type

[**OrgUsersPersonsResponse**](OrgUsersPersonsResponse.md)

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

<a name="getDataUserPersonCount"></a>
# **getDataUserPersonCount**
> OrgUsersPersonsCountResponse getDataUserPersonCount(orgId).execute();

Gets the count of joined users, invited users, and org members who are not yet invited



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgUsersPersonsCountResponse result = client
              .org
              .getDataUserPersonCount(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getJoinedCount());
      System.out.println(result.getInvitedCount());
      System.out.println(result.getNotInvitedCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getDataUserPersonCount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgUsersPersonsCountResponse> response = client
              .org
              .getDataUserPersonCount(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getDataUserPersonCount");
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

### Return type

[**OrgUsersPersonsCountResponse**](OrgUsersPersonsCountResponse.md)

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

<a name="getDataUsersPersons"></a>
# **getDataUsersPersons**
> OrgUsersPersonsResponse getDataUsersPersons(orgId).limit(limit).offset(offset).sort(sort).role(role).status(status).returnAccess(returnAccess).execute();

Gets a list of org users (joined or invited) and org members (not yet invited)



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    Integer limit = 56; // limit
    Integer offset = 56; // offset
    String sort = "name, email, role, expr, invite, active"; // Sort by
    String role = "Owner, Technical Owner, Employee, etc..."; // Filter by user role label
    String status = "joined, invited, not-invited"; // Filter by status
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      OrgUsersPersonsResponse result = client
              .org
              .getDataUsersPersons(orgId)
              .limit(limit)
              .offset(offset)
              .sort(sort)
              .role(role)
              .status(status)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getRows());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getDataUsersPersons");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgUsersPersonsResponse> response = client
              .org
              .getDataUsersPersons(orgId)
              .limit(limit)
              .offset(offset)
              .sort(sort)
              .role(role)
              .status(status)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getDataUsersPersons");
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
| **limit** | **Integer**| limit | [optional] |
| **offset** | **Integer**| offset | [optional] |
| **sort** | **String**| Sort by | [optional] |
| **role** | **String**| Filter by user role label | [optional] |
| **status** | **String**| Filter by status | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**OrgUsersPersonsResponse**](OrgUsersPersonsResponse.md)

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

<a name="getOauth2AuthorizationCode"></a>
# **getOauth2AuthorizationCode**
> AccessTokenResponse getOauth2AuthorizationCode(org).execute();

Retrieve an Oauth2 authorization code to install an app at this org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String org = "org_example"; // Org identifier (either id or slug)
    try {
      AccessTokenResponse result = client
              .org
              .getOauth2AuthorizationCode(org)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getOauth2AuthorizationCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenResponse> response = client
              .org
              .getOauth2AuthorizationCode(org)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getOauth2AuthorizationCode");
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
| **org** | **String**| Org identifier (either id or slug) | |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="getUserAccess"></a>
# **getUserAccess**
> getUserAccess(orgId).execute();

Return information on current user&#39;s access



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
              .org
              .getUserAccess(orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getUserAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .org
              .getUserAccess(orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getUserAccess");
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
| **0** | successful operation |  -  |

<a name="getValidationBySlug"></a>
# **getValidationBySlug**
> getValidationBySlug(slug).execute();

Return validation for a org by slug



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String slug = "slug_example"; // Org slug
    try {
      client
              .org
              .getValidationBySlug(slug)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getValidationBySlug");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .org
              .getValidationBySlug(slug)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getValidationBySlug");
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
| **slug** | **String**| Org slug | |

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
| **404** | not found |  -  |

<a name="getWelcomeEmailSettings"></a>
# **getWelcomeEmailSettings**
> WelcomeEmailSettings getWelcomeEmailSettings(orgId).execute();

Gets the custom setting or default for the welcome email&#39;s subject, body, cta button label



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      WelcomeEmailSettings result = client
              .org
              .getWelcomeEmailSettings(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWelcomeEmailSubject());
      System.out.println(result.getWelcomeEmailButtonLabel());
      System.out.println(result.getWelcomeEmailBody());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getWelcomeEmailSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WelcomeEmailSettings> response = client
              .org
              .getWelcomeEmailSettings(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getWelcomeEmailSettings");
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

### Return type

[**WelcomeEmailSettings**](WelcomeEmailSettings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **403** | Permission denied |  -  |
| **500** | Service error |  -  |

<a name="listVisibleOrgs"></a>
# **listVisibleOrgs**
> ResultsOrg listVisibleOrgs().from(from).q(q).limit(limit).customerId(customerId).realOnly(realOnly).lastCreateAt(lastCreateAt).lastActiveAt(lastActiveAt).internalOptions(internalOptions).execute();

Return all visible orgs, paginated by name



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String from = "from_example"; // Org id to start from
    String q = "q_example"; // Search query
    Integer limit = 56; // Number of results to return
    String customerId = "customerId_example"; // Find orgs belonging to a particular customer id
    Boolean realOnly = true; // Include only orgs where type is REAL?
    Long lastCreateAt = 56L; // Only include orgs whose last createAt occurred after the date
    Long lastActiveAt = 56L; // Only include orgs whose last activeAt occurred after the date
    String internalOptions = "internalOptions_example"; // Filter orgs by internal option key-value pair
    try {
      ResultsOrg result = client
              .org
              .listVisibleOrgs()
              .from(from)
              .q(q)
              .limit(limit)
              .customerId(customerId)
              .realOnly(realOnly)
              .lastCreateAt(lastCreateAt)
              .lastActiveAt(lastActiveAt)
              .internalOptions(internalOptions)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#listVisibleOrgs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsOrg> response = client
              .org
              .listVisibleOrgs()
              .from(from)
              .q(q)
              .limit(limit)
              .customerId(customerId)
              .realOnly(realOnly)
              .lastCreateAt(lastCreateAt)
              .lastActiveAt(lastActiveAt)
              .internalOptions(internalOptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#listVisibleOrgs");
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
| **from** | **String**| Org id to start from | [optional] |
| **q** | **String**| Search query | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **customerId** | **String**| Find orgs belonging to a particular customer id | [optional] |
| **realOnly** | **Boolean**| Include only orgs where type is REAL? | [optional] |
| **lastCreateAt** | **Long**| Only include orgs whose last createAt occurred after the date | [optional] |
| **lastActiveAt** | **Long**| Only include orgs whose last activeAt occurred after the date | [optional] |
| **internalOptions** | **String**| Filter orgs by internal option key-value pair | [optional] |

### Return type

[**ResultsOrg**](ResultsOrg.md)

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

<a name="sendTestEmailToOneself"></a>
# **sendTestEmailToOneself**
> sendTestEmailToOneself(orgId).testEmailRequest(testEmailRequest).execute();

Send a test welcome email to oneself



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String welcomeEmailSubject = "welcomeEmailSubject_example";
    String welcomeEmailButtonLabel = "welcomeEmailButtonLabel_example";
    String welcomeEmailBody = "welcomeEmailBody_example";
    try {
      client
              .org
              .sendTestEmailToOneself(orgId)
              .welcomeEmailSubject(welcomeEmailSubject)
              .welcomeEmailButtonLabel(welcomeEmailButtonLabel)
              .welcomeEmailBody(welcomeEmailBody)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#sendTestEmailToOneself");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .org
              .sendTestEmailToOneself(orgId)
              .welcomeEmailSubject(welcomeEmailSubject)
              .welcomeEmailButtonLabel(welcomeEmailButtonLabel)
              .welcomeEmailBody(welcomeEmailBody)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#sendTestEmailToOneself");
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
| **testEmailRequest** | [**TestEmailRequest**](TestEmailRequest.md)|  | [optional] |

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
| **404** | not found |  -  |

<a name="updateExistingOrg"></a>
# **updateExistingOrg**
> updateExistingOrg(orgId).updateOrg(updateOrg).execute();

Update an existing org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String customerId = "customerId_example"; // customer for billing processing
    String name = "name_example"; // name of organization
    String slug = "slug_example"; // unique slug of organization
    String type = "PRIVATE"; // type of organization
    String industry = "industry_example"; // industry
    Integer estEmployees = 56; // approximate number of employees
    Integer estRevenue = 56; // approximate amount of revenue
    Integer foundedYear = 56; // year of founding
    Address address = new Address();
    String phone = "phone_example"; // company phone number in E.164 format
    String email = "email_example"; // primary contact email
    URI url = new URI(); // website URL
    List<OrgDomain> domains = Arrays.asList(); // domains used by this org
    String status = "ACTIVE"; // current status of organization
    String imagePath = "imagePath_example"; // path to full-sized profile image in storage
    List<String> currencies = Arrays.asList(); // types of currencies in use, with the first currency the primary currency
    String stock = "stock_example"; // stock symbol
    String timezone = "timezone_example"; // timezone in use
    String appTime = "appTime_example"; // approximate time of day for daily app syncs to run (defaults to 9am Eastern time)
    Integer zone = 56; // infrastructure zone
    Integer fiscalStart = 56; // number of months into the calendar year that the fiscal year starts (1 = February, 2 = March)
    String startDate = "startDate_example"; // start date of history
    Object sensitiveFields = null; // map of sensitive field defaults
    Object options = null; // org-public options
    Object internalOptions = null; // internal (ChartHop controlled) options
    List<OnboardStepResult> onboardSteps = Arrays.asList(); // list of onboard steps that this Org has completed (or skipped)
    Boolean onboarding = true; // current onboarding status of an organization, allowing clearing of org
    Boolean selfServeImporting = true; // completion status of initial import for orgs signed up via self serve
    Integer headCount = 56; // number of total headcount currently in the org
    try {
      client
              .org
              .updateExistingOrg(orgId)
              .customerId(customerId)
              .name(name)
              .slug(slug)
              .type(type)
              .industry(industry)
              .estEmployees(estEmployees)
              .estRevenue(estRevenue)
              .foundedYear(foundedYear)
              .address(address)
              .phone(phone)
              .email(email)
              .url(url)
              .domains(domains)
              .status(status)
              .imagePath(imagePath)
              .currencies(currencies)
              .stock(stock)
              .timezone(timezone)
              .appTime(appTime)
              .zone(zone)
              .fiscalStart(fiscalStart)
              .startDate(startDate)
              .sensitiveFields(sensitiveFields)
              .options(options)
              .internalOptions(internalOptions)
              .onboardSteps(onboardSteps)
              .onboarding(onboarding)
              .selfServeImporting(selfServeImporting)
              .headCount(headCount)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateExistingOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .org
              .updateExistingOrg(orgId)
              .customerId(customerId)
              .name(name)
              .slug(slug)
              .type(type)
              .industry(industry)
              .estEmployees(estEmployees)
              .estRevenue(estRevenue)
              .foundedYear(foundedYear)
              .address(address)
              .phone(phone)
              .email(email)
              .url(url)
              .domains(domains)
              .status(status)
              .imagePath(imagePath)
              .currencies(currencies)
              .stock(stock)
              .timezone(timezone)
              .appTime(appTime)
              .zone(zone)
              .fiscalStart(fiscalStart)
              .startDate(startDate)
              .sensitiveFields(sensitiveFields)
              .options(options)
              .internalOptions(internalOptions)
              .onboardSteps(onboardSteps)
              .onboarding(onboarding)
              .selfServeImporting(selfServeImporting)
              .headCount(headCount)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateExistingOrg");
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
| **updateOrg** | [**UpdateOrg**](UpdateOrg.md)| Org data to update | [optional] |

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

<a name="validateAppInstallAuthorizationCode"></a>
# **validateAppInstallAuthorizationCode**
> AppInstallCodeValidateResponse validateAppInstallAuthorizationCode().appInstallCodeValidateRequest(appInstallCodeValidateRequest).execute();

Validate authorization code



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String authorizationCode = "authorizationCode_example"; // authorization code token value
    Boolean issueAccessToken = true; // flag indicating if authorization code should be exchanged for an access token
    try {
      AppInstallCodeValidateResponse result = client
              .org
              .validateAppInstallAuthorizationCode(authorizationCode, issueAccessToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserId());
      System.out.println(result.getData());
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#validateAppInstallAuthorizationCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppInstallCodeValidateResponse> response = client
              .org
              .validateAppInstallAuthorizationCode(authorizationCode, issueAccessToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#validateAppInstallAuthorizationCode");
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
| **appInstallCodeValidateRequest** | [**AppInstallCodeValidateRequest**](AppInstallCodeValidateRequest.md)| Authorization code to validate | [optional] |

### Return type

[**AppInstallCodeValidateResponse**](AppInstallCodeValidateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

