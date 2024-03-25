# AppApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewApp**](AppApi.md#createNewApp) | **POST** /v1/app | Create a new app |
| [**findInstalledAppUsers**](AppApi.md#findInstalledAppUsers) | **GET** /v1/app/org/{orgId}/install/{appUserId} | Get an installed app |
| [**findInstalledAppUsers_0**](AppApi.md#findInstalledAppUsers_0) | **GET** /v1/app/org/{orgId}/install | Find installed app users |
| [**generateOrRegenerateAccessToken**](AppApi.md#generateOrRegenerateAccessToken) | **POST** /v1/app/org/{orgId}/install/{appUserId}/token | Generate or regenerate a long-lived access token for the app |
| [**getActiveAppsByOrg**](AppApi.md#getActiveAppsByOrg) | **GET** /v1/app/org/{orgId} | Return all active apps available for a particular org |
| [**getById**](AppApi.md#getById) | **GET** /v1/app/{appId} | Return a particular app by id |
| [**getByName**](AppApi.md#getByName) | **GET** /v1/app/name/{appName} | Return a particular app by name |
| [**getInstalledAppByName**](AppApi.md#getInstalledAppByName) | **GET** /v1/app/org/{orgId}/install/name/{appName} | Get an installed app by name |
| [**getOauth2AuthorizationCode**](AppApi.md#getOauth2AuthorizationCode) | **POST** /v1/app/org/{orgId}/install/{appUserId}/code | Retrieve an Oauth2 authorization code for this app, which can be exchanged for an access token |
| [**getTokenForApp**](AppApi.md#getTokenForApp) | **GET** /v1/app/org/{orgId}/install/{appUserId}/token | Retrieve the current token for this app |
| [**getTokenForApp_0**](AppApi.md#getTokenForApp_0) | **GET** /v1/app/org/{orgId}/install/{appUserId}/installdata/{installDataName} | Retrieve the current token for this app |
| [**installAppForOrg**](AppApi.md#installAppForOrg) | **POST** /v1/app/org/{orgId}/install | Install an app for a particular org |
| [**listPublicGlobalApps**](AppApi.md#listPublicGlobalApps) | **GET** /v1/app | Return all publicly visible global apps |
| [**removeById**](AppApi.md#removeById) | **DELETE** /v1/app/{appId} | Delete an app |
| [**runInstalledApp**](AppApi.md#runInstalledApp) | **POST** /v1/app/org/{orgId}/install/{appUserId}/run | Run an installed app |
| [**sendEmailNotification**](AppApi.md#sendEmailNotification) | **POST** /v1/app/notify | Send an email notification to the configured notify users, on behalf of an app |
| [**uninstallAppByUserId**](AppApi.md#uninstallAppByUserId) | **DELETE** /v1/app/org/{orgId}/install/{appUserId} | Uninstall an app |
| [**updateExistingApp**](AppApi.md#updateExistingApp) | **PATCH** /v1/app/{appId} | Update an existing app |
| [**updateInstalledApp**](AppApi.md#updateInstalledApp) | **PATCH** /v1/app/org/{orgId}/install/{appUserId} | Update the settings of an installed app |
| [**validateAppInstallation**](AppApi.md#validateAppInstallation) | **POST** /v1/app/org/{orgId}/install/validate | Validate the installation of an app for a particular org |


<a name="createNewApp"></a>
# **createNewApp**
> App createNewApp().createApp(createApp).execute();

Create a new app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String summary = "summary_example"; // short summary of app
    String title = "title_example"; // human-readable name of app
    String orgId = "orgId_example"; // organization id
    String name = "name_example"; // short unique name
    Integer cronOrder = 56; // execution order of the cron (lower numbers execute earlier)
    String minAccess = "NONE"; // minimum access level requested by app
    String type = "APP"; // APP, BUNDLE, or INTERNAL
    List<String> tags = Arrays.asList(); // tags/categories the app belongs to
    String description = "description_example"; // full description of app, in Markdown
    List<URI> redirectUris = Arrays.asList(); // list of acceptable Oauth2 redirect URIs, if Oauth2 is supported for this app
    List<String> allowedIps = Arrays.asList(); // allowlist of IPs or IP ranges that are allowed to make API calls on behalf of this app
    List<AppConfigField> configFields = Arrays.asList(); // list of configuration fields
    String setupInstructions = "setupInstructions_example"; // setup instructions, in Markdown
    String cronSchedule = "DAILY"; // cron schedule
    String cronDayOfWeek = "MONDAY"; // Day of week if cronSchedule is WEEKLY
    String imagePath = "imagePath_example"; // path to avatar profile image, should be approximately square dimensions and show logo
    String wordmarkImagePath = "wordmarkImagePath_example"; // path to larger profile logo image containing brand wordmark, does not need to be square dimensions
    String poweredByImagePath = "poweredByImagePath_example"; // path to powered by image, should be approximately square dimensions and show logo
    String status = "GLOBAL"; // current status of app
    String roleId = "roleId_example"; // roleId requested by app
    URI eventNotifyUrl = new URI(); // URL that should be notified on events
    Map<String, String> payload = new HashMap(); // custom payload to send in lieu of regular payload
    Set<String> events = Arrays.asList(); // set of events to notify on
    Bundle bundle = new Bundle();
    List<String> scopes = Arrays.asList(); // access scopes that the app is requesting
    try {
      App result = client
              .app
              .createNewApp(summary, title, orgId, name, cronOrder, minAccess, type)
              .tags(tags)
              .description(description)
              .redirectUris(redirectUris)
              .allowedIps(allowedIps)
              .configFields(configFields)
              .setupInstructions(setupInstructions)
              .cronSchedule(cronSchedule)
              .cronDayOfWeek(cronDayOfWeek)
              .imagePath(imagePath)
              .wordmarkImagePath(wordmarkImagePath)
              .poweredByImagePath(poweredByImagePath)
              .status(status)
              .roleId(roleId)
              .eventNotifyUrl(eventNotifyUrl)
              .payload(payload)
              .events(events)
              .bundle(bundle)
              .scopes(scopes)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getSummary());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getRedirectUris());
      System.out.println(result.getAllowedIps());
      System.out.println(result.getConfigFields());
      System.out.println(result.getSetupInstructions());
      System.out.println(result.getCronOrder());
      System.out.println(result.getCronSchedule());
      System.out.println(result.getCronDayOfWeek());
      System.out.println(result.getImagePath());
      System.out.println(result.getWordmarkImagePath());
      System.out.println(result.getPoweredByImagePath());
      System.out.println(result.getStatus());
      System.out.println(result.getMinAccess());
      System.out.println(result.getRoleId());
      System.out.println(result.getEventNotifyUrl());
      System.out.println(result.getPayload());
      System.out.println(result.getEvents());
      System.out.println(result.getType());
      System.out.println(result.getBundle());
      System.out.println(result.getScopes());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#createNewApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<App> response = client
              .app
              .createNewApp(summary, title, orgId, name, cronOrder, minAccess, type)
              .tags(tags)
              .description(description)
              .redirectUris(redirectUris)
              .allowedIps(allowedIps)
              .configFields(configFields)
              .setupInstructions(setupInstructions)
              .cronSchedule(cronSchedule)
              .cronDayOfWeek(cronDayOfWeek)
              .imagePath(imagePath)
              .wordmarkImagePath(wordmarkImagePath)
              .poweredByImagePath(poweredByImagePath)
              .status(status)
              .roleId(roleId)
              .eventNotifyUrl(eventNotifyUrl)
              .payload(payload)
              .events(events)
              .bundle(bundle)
              .scopes(scopes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#createNewApp");
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
| **createApp** | [**CreateApp**](CreateApp.md)| App data to create | [optional] |

### Return type

[**App**](App.md)

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

<a name="findInstalledAppUsers"></a>
# **findInstalledAppUsers**
> User findInstalledAppUsers(orgId, appUserId).execute();

Get an installed app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // App user id
    try {
      User result = client
              .app
              .findInstalledAppUsers(orgId, appUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getAppId());
      System.out.println(result.getName());
      System.out.println(result.getEmail());
      System.out.println(result.getPassword());
      System.out.println(result.getOrgs());
      System.out.println(result.getImagePath());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
      System.out.println(result.getOptions());
      System.out.println(result.getInternalOptions());
      System.out.println(result.getBundleInstall());
      System.out.println(result.getSecrets());
      System.out.println(result.getActiveAt());
      System.out.println(result.getLoginAt());
      System.out.println(result.getLoginFailCount());
      System.out.println(result.getRemoteIp());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getVerifyAt());
      System.out.println(result.getMfas());
      System.out.println(result.getEmailSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#findInstalledAppUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .app
              .findInstalledAppUsers(orgId, appUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#findInstalledAppUsers");
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
| **appUserId** | **String**| App user id | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="findInstalledAppUsers_0"></a>
# **findInstalledAppUsers_0**
> ResultsUser findInstalledAppUsers_0(orgId).type(type).tags(tags).statuses(statuses).includeFormer(includeFormer).from(from).limit(limit).execute();

Find installed app users



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Filter by type (app, bundle)
    String tags = "tags_example"; // Filter by tag
    String statuses = "statuses_example"; // Filter by App User statuses, comma-separated. Accepted values: ['NORMAL', 'INACTIVE', 'UNINSTALLED']
    Boolean includeFormer = true; // Whether to include app users with NONE access to orgs they pertain to.  Default is false
    String from = "from_example"; // App id to start from
    Integer limit = 56; // Number of results to return
    try {
      ResultsUser result = client
              .app
              .findInstalledAppUsers_0(orgId)
              .type(type)
              .tags(tags)
              .statuses(statuses)
              .includeFormer(includeFormer)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#findInstalledAppUsers_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsUser> response = client
              .app
              .findInstalledAppUsers_0(orgId)
              .type(type)
              .tags(tags)
              .statuses(statuses)
              .includeFormer(includeFormer)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#findInstalledAppUsers_0");
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
| **type** | **String**| Filter by type (app, bundle) | [optional] |
| **tags** | **String**| Filter by tag | [optional] |
| **statuses** | **String**| Filter by App User statuses, comma-separated. Accepted values: [&#39;NORMAL&#39;, &#39;INACTIVE&#39;, &#39;UNINSTALLED&#39;] | [optional] |
| **includeFormer** | **Boolean**| Whether to include app users with NONE access to orgs they pertain to.  Default is false | [optional] |
| **from** | **String**| App id to start from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsUser**](ResultsUser.md)

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

<a name="generateOrRegenerateAccessToken"></a>
# **generateOrRegenerateAccessToken**
> AccessTokenResponse generateOrRegenerateAccessToken(orgId, appUserId).scopeRequest(scopeRequest).execute();

Generate or regenerate a long-lived access token for the app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String scope = "scope_example"; // scope being requested
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // App user id
    try {
      AccessTokenResponse result = client
              .app
              .generateOrRegenerateAccessToken(scope, orgId, appUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#generateOrRegenerateAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenResponse> response = client
              .app
              .generateOrRegenerateAccessToken(scope, orgId, appUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#generateOrRegenerateAccessToken");
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
| **appUserId** | **String**| App user id | |
| **scopeRequest** | [**ScopeRequest**](ScopeRequest.md)|  | [optional] |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="getActiveAppsByOrg"></a>
# **getActiveAppsByOrg**
> ResultsApp getActiveAppsByOrg(orgId).q(q).type(type).tags(tags).from(from).limit(limit).execute();

Return all active apps available for a particular org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String q = "q_example"; // Search query
    String type = "type_example"; // Filter by type (app, bundle)
    String tags = "tags_example"; // Filter by tags
    String from = "from_example"; // App id to start from
    Integer limit = 56; // Number of results to return
    try {
      ResultsApp result = client
              .app
              .getActiveAppsByOrg(orgId)
              .q(q)
              .type(type)
              .tags(tags)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getActiveAppsByOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsApp> response = client
              .app
              .getActiveAppsByOrg(orgId)
              .q(q)
              .type(type)
              .tags(tags)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getActiveAppsByOrg");
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
| **q** | **String**| Search query | [optional] |
| **type** | **String**| Filter by type (app, bundle) | [optional] |
| **tags** | **String**| Filter by tags | [optional] |
| **from** | **String**| App id to start from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsApp**](ResultsApp.md)

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

<a name="getById"></a>
# **getById**
> App getById(appId).execute();

Return a particular app by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
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
      App result = client
              .app
              .getById(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getSummary());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getRedirectUris());
      System.out.println(result.getAllowedIps());
      System.out.println(result.getConfigFields());
      System.out.println(result.getSetupInstructions());
      System.out.println(result.getCronOrder());
      System.out.println(result.getCronSchedule());
      System.out.println(result.getCronDayOfWeek());
      System.out.println(result.getImagePath());
      System.out.println(result.getWordmarkImagePath());
      System.out.println(result.getPoweredByImagePath());
      System.out.println(result.getStatus());
      System.out.println(result.getMinAccess());
      System.out.println(result.getRoleId());
      System.out.println(result.getEventNotifyUrl());
      System.out.println(result.getPayload());
      System.out.println(result.getEvents());
      System.out.println(result.getType());
      System.out.println(result.getBundle());
      System.out.println(result.getScopes());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<App> response = client
              .app
              .getById(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getById");
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

[**App**](App.md)

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

<a name="getByName"></a>
# **getByName**
> App getByName(appName).execute();

Return a particular app by name



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String appName = "appName_example"; // App name
    try {
      App result = client
              .app
              .getByName(appName)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getSummary());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getRedirectUris());
      System.out.println(result.getAllowedIps());
      System.out.println(result.getConfigFields());
      System.out.println(result.getSetupInstructions());
      System.out.println(result.getCronOrder());
      System.out.println(result.getCronSchedule());
      System.out.println(result.getCronDayOfWeek());
      System.out.println(result.getImagePath());
      System.out.println(result.getWordmarkImagePath());
      System.out.println(result.getPoweredByImagePath());
      System.out.println(result.getStatus());
      System.out.println(result.getMinAccess());
      System.out.println(result.getRoleId());
      System.out.println(result.getEventNotifyUrl());
      System.out.println(result.getPayload());
      System.out.println(result.getEvents());
      System.out.println(result.getType());
      System.out.println(result.getBundle());
      System.out.println(result.getScopes());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<App> response = client
              .app
              .getByName(appName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getByName");
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
| **appName** | **String**| App name | |

### Return type

[**App**](App.md)

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

<a name="getInstalledAppByName"></a>
# **getInstalledAppByName**
> User getInstalledAppByName(orgId, appName).includeInactive(includeInactive).execute();

Get an installed app by name



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appName = "appName_example"; // App name
    Boolean includeInactive = true; // If the installed appUser is inactive, load inactive instead
    try {
      User result = client
              .app
              .getInstalledAppByName(orgId, appName)
              .includeInactive(includeInactive)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getAppId());
      System.out.println(result.getName());
      System.out.println(result.getEmail());
      System.out.println(result.getPassword());
      System.out.println(result.getOrgs());
      System.out.println(result.getImagePath());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
      System.out.println(result.getOptions());
      System.out.println(result.getInternalOptions());
      System.out.println(result.getBundleInstall());
      System.out.println(result.getSecrets());
      System.out.println(result.getActiveAt());
      System.out.println(result.getLoginAt());
      System.out.println(result.getLoginFailCount());
      System.out.println(result.getRemoteIp());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getVerifyAt());
      System.out.println(result.getMfas());
      System.out.println(result.getEmailSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getInstalledAppByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .app
              .getInstalledAppByName(orgId, appName)
              .includeInactive(includeInactive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getInstalledAppByName");
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
| **appName** | **String**| App name | |
| **includeInactive** | **Boolean**| If the installed appUser is inactive, load inactive instead | [optional] |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="getOauth2AuthorizationCode"></a>
# **getOauth2AuthorizationCode**
> AccessTokenResponse getOauth2AuthorizationCode(orgId, appUserId).scope(scope).execute();

Retrieve an Oauth2 authorization code for this app, which can be exchanged for an access token



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // App user id
    String scope = "scope_example"; // Scopes
    try {
      AccessTokenResponse result = client
              .app
              .getOauth2AuthorizationCode(orgId, appUserId)
              .scope(scope)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getOauth2AuthorizationCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenResponse> response = client
              .app
              .getOauth2AuthorizationCode(orgId, appUserId)
              .scope(scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getOauth2AuthorizationCode");
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
| **appUserId** | **String**| App user id | |
| **scope** | **String**| Scopes | [optional] |

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
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="getTokenForApp"></a>
# **getTokenForApp**
> AccessTokenResponse getTokenForApp(orgId, appUserId).execute();

Retrieve the current token for this app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // App user id
    try {
      AccessTokenResponse result = client
              .app
              .getTokenForApp(orgId, appUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getTokenForApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenResponse> response = client
              .app
              .getTokenForApp(orgId, appUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getTokenForApp");
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
| **appUserId** | **String**| App user id | |

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
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="getTokenForApp_0"></a>
# **getTokenForApp_0**
> getTokenForApp_0(orgId, appUserId, installDataName).execute();

Retrieve the current token for this app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // App user id
    String installDataName = "installDataName_example"; // Name
    try {
      client
              .app
              .getTokenForApp_0(orgId, appUserId, installDataName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getTokenForApp_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .app
              .getTokenForApp_0(orgId, appUserId, installDataName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getTokenForApp_0");
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
| **appUserId** | **String**| App user id | |
| **installDataName** | **String**| Name | |

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

<a name="installAppForOrg"></a>
# **installAppForOrg**
> installAppForOrg(orgId).createUser(createUser).execute();

Install an app for a particular org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Set<OrgAccess> orgs = Arrays.asList(); // list of member orgs with permission levels
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appId = "appId_example"; // if the user is an app user, the id of the app
    Name name = new Name();
    String email = "email_example"; // email address of user
    String imagePath = "imagePath_example"; // path to full-sized profile image in storage
    String status = "SUPERUSER"; // current status of user
    Object options = null; // for apps, options (specific options are specific to the particular app); for users, user-set preferences
    Object internalOptions = null; // internal (ChartHop controlled) options
    Object secrets = null; // write-only secrets; the content of these secrets are not retrievable via the external-facing API
    List<UserEmailSetting> emailSettings = Arrays.asList(); // Email settings for the user
    try {
      client
              .app
              .installAppForOrg(orgs, orgId)
              .appId(appId)
              .name(name)
              .email(email)
              .imagePath(imagePath)
              .status(status)
              .options(options)
              .internalOptions(internalOptions)
              .secrets(secrets)
              .emailSettings(emailSettings)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#installAppForOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .app
              .installAppForOrg(orgs, orgId)
              .appId(appId)
              .name(name)
              .email(email)
              .imagePath(imagePath)
              .status(status)
              .options(options)
              .internalOptions(internalOptions)
              .secrets(secrets)
              .emailSettings(emailSettings)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#installAppForOrg");
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
| **createUser** | [**CreateUser**](CreateUser.md)| App user data to create | [optional] |

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

<a name="listPublicGlobalApps"></a>
# **listPublicGlobalApps**
> ResultsApp listPublicGlobalApps().tag(tag).from(from).limit(limit).execute();

Return all publicly visible global apps



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String tag = "tag_example"; // Tag to filter by
    String from = "from_example"; // App id to start from
    Integer limit = 56; // Number of results to return
    try {
      ResultsApp result = client
              .app
              .listPublicGlobalApps()
              .tag(tag)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#listPublicGlobalApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsApp> response = client
              .app
              .listPublicGlobalApps()
              .tag(tag)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#listPublicGlobalApps");
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
| **tag** | **String**| Tag to filter by | [optional] |
| **from** | **String**| App id to start from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsApp**](ResultsApp.md)

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

<a name="removeById"></a>
# **removeById**
> removeById(appId).execute();

Delete an app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
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
      client
              .app
              .removeById(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .app
              .removeById(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#removeById");
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

<a name="runInstalledApp"></a>
# **runInstalledApp**
> Process runInstalledApp(orgId, appUserId).requestBody(requestBody).execute();

Run an installed app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // App user id
    try {
      Process result = client
              .app
              .runInstalledApp(orgId, appUserId)
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
      System.err.println("Exception when calling AppApi#runInstalledApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .app
              .runInstalledApp(orgId, appUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#runInstalledApp");
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
| **appUserId** | **String**| App user id | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

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
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="sendEmailNotification"></a>
# **sendEmailNotification**
> sendEmailNotification().notifyRequest(notifyRequest).execute();

Send an email notification to the configured notify users, on behalf of an app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String emailSubject = "emailSubject_example"; // email subject line
    String emailContentHtml = "emailContentHtml_example"; // email HTML content
    String emailMarkdown = "emailMarkdown_example"; // email Markdown content
    String chatMarkdown = "chatMarkdown_example"; // chat Markdown content, if chat message should be different/abbreviated
    String notifyType = "notifyType_example"; // Type of notification
    try {
      client
              .app
              .sendEmailNotification()
              .emailSubject(emailSubject)
              .emailContentHtml(emailContentHtml)
              .emailMarkdown(emailMarkdown)
              .chatMarkdown(chatMarkdown)
              .notifyType(notifyType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#sendEmailNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .app
              .sendEmailNotification()
              .emailSubject(emailSubject)
              .emailContentHtml(emailContentHtml)
              .emailMarkdown(emailMarkdown)
              .chatMarkdown(chatMarkdown)
              .notifyType(notifyType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#sendEmailNotification");
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
| **notifyRequest** | [**NotifyRequest**](NotifyRequest.md)|  | [optional] |

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

<a name="uninstallAppByUserId"></a>
# **uninstallAppByUserId**
> uninstallAppByUserId(orgId, appUserId).keepEntityIds(keepEntityIds).execute();

Uninstall an app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // App user id
    String keepEntityIds = "keepEntityIds_example"; // Comma-separated list of bundle-installed entities to delete -- if this parameter is omitted, all bundle-installed entities will be deleted
    try {
      client
              .app
              .uninstallAppByUserId(orgId, appUserId)
              .keepEntityIds(keepEntityIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#uninstallAppByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .app
              .uninstallAppByUserId(orgId, appUserId)
              .keepEntityIds(keepEntityIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#uninstallAppByUserId");
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
| **appUserId** | **String**| App user id | |
| **keepEntityIds** | **String**| Comma-separated list of bundle-installed entities to delete -- if this parameter is omitted, all bundle-installed entities will be deleted | [optional] |

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

<a name="updateExistingApp"></a>
# **updateExistingApp**
> updateExistingApp(appId).updateApp(updateApp).execute();

Update an existing app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String appId = "appId_example"; // App id
    List<String> tags = Arrays.asList(); // tags/categories the app belongs to
    String summary = "summary_example"; // short summary of app
    String title = "title_example"; // human-readable name of app
    String description = "description_example"; // full description of app, in Markdown
    String name = "name_example"; // short unique name
    List<URI> redirectUris = Arrays.asList(); // list of acceptable Oauth2 redirect URIs, if Oauth2 is supported for this app
    List<String> allowedIps = Arrays.asList(); // allowlist of IPs or IP ranges that are allowed to make API calls on behalf of this app
    List<AppConfigField> configFields = Arrays.asList(); // list of configuration fields
    String setupInstructions = "setupInstructions_example"; // setup instructions, in Markdown
    Integer cronOrder = 56; // execution order of the cron (lower numbers execute earlier)
    String cronSchedule = "DAILY"; // cron schedule
    String cronDayOfWeek = "MONDAY"; // Day of week if cronSchedule is WEEKLY
    String imagePath = "imagePath_example"; // path to avatar profile image, should be approximately square dimensions and show logo
    String wordmarkImagePath = "wordmarkImagePath_example"; // path to larger profile logo image containing brand wordmark, does not need to be square dimensions
    String poweredByImagePath = "poweredByImagePath_example"; // path to powered by image, should be approximately square dimensions and show logo
    String status = "GLOBAL"; // current status of app
    String minAccess = "NONE"; // minimum access level requested by app
    String roleId = "roleId_example"; // roleId requested by app
    URI eventNotifyUrl = new URI(); // URL that should be notified on events
    Map<String, String> payload = new HashMap(); // custom payload to send in lieu of regular payload
    Set<String> events = Arrays.asList(); // set of events to notify on
    String type = "APP"; // APP, BUNDLE, or INTERNAL
    Bundle bundle = new Bundle();
    List<String> scopes = Arrays.asList(); // access scopes that the app is requesting
    try {
      client
              .app
              .updateExistingApp(appId)
              .tags(tags)
              .summary(summary)
              .title(title)
              .description(description)
              .name(name)
              .redirectUris(redirectUris)
              .allowedIps(allowedIps)
              .configFields(configFields)
              .setupInstructions(setupInstructions)
              .cronOrder(cronOrder)
              .cronSchedule(cronSchedule)
              .cronDayOfWeek(cronDayOfWeek)
              .imagePath(imagePath)
              .wordmarkImagePath(wordmarkImagePath)
              .poweredByImagePath(poweredByImagePath)
              .status(status)
              .minAccess(minAccess)
              .roleId(roleId)
              .eventNotifyUrl(eventNotifyUrl)
              .payload(payload)
              .events(events)
              .type(type)
              .bundle(bundle)
              .scopes(scopes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#updateExistingApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .app
              .updateExistingApp(appId)
              .tags(tags)
              .summary(summary)
              .title(title)
              .description(description)
              .name(name)
              .redirectUris(redirectUris)
              .allowedIps(allowedIps)
              .configFields(configFields)
              .setupInstructions(setupInstructions)
              .cronOrder(cronOrder)
              .cronSchedule(cronSchedule)
              .cronDayOfWeek(cronDayOfWeek)
              .imagePath(imagePath)
              .wordmarkImagePath(wordmarkImagePath)
              .poweredByImagePath(poweredByImagePath)
              .status(status)
              .minAccess(minAccess)
              .roleId(roleId)
              .eventNotifyUrl(eventNotifyUrl)
              .payload(payload)
              .events(events)
              .type(type)
              .bundle(bundle)
              .scopes(scopes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#updateExistingApp");
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
| **updateApp** | [**UpdateApp**](UpdateApp.md)| App data to update | [optional] |

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

<a name="updateInstalledApp"></a>
# **updateInstalledApp**
> updateInstalledApp(orgId, appUserId).includeInactive(includeInactive).updateUser(updateUser).execute();

Update the settings of an installed app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // App user id
    String appId = "appId_example"; // if the user is an app user, the id of the app
    Name name = new Name();
    String email = "email_example"; // email address of user
    Set<OrgAccess> orgs = Arrays.asList(); // list of member orgs with permission levels
    String imagePath = "imagePath_example"; // path to full-sized profile image in storage
    String status = "SUPERUSER"; // current status of user
    Object options = null; // for apps, options (specific options are specific to the particular app); for users, user-set preferences
    Object internalOptions = null; // internal (ChartHop controlled) options
    Object secrets = null; // write-only secrets; the content of these secrets are not retrievable via the external-facing API
    List<UserEmailSetting> emailSettings = Arrays.asList(); // Email settings for the user
    Boolean includeInactive = true; // If the installed appUser is inactive, load inactive instead
    try {
      client
              .app
              .updateInstalledApp(orgId, appUserId)
              .appId(appId)
              .name(name)
              .email(email)
              .orgs(orgs)
              .imagePath(imagePath)
              .status(status)
              .options(options)
              .internalOptions(internalOptions)
              .secrets(secrets)
              .emailSettings(emailSettings)
              .includeInactive(includeInactive)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#updateInstalledApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .app
              .updateInstalledApp(orgId, appUserId)
              .appId(appId)
              .name(name)
              .email(email)
              .orgs(orgs)
              .imagePath(imagePath)
              .status(status)
              .options(options)
              .internalOptions(internalOptions)
              .secrets(secrets)
              .emailSettings(emailSettings)
              .includeInactive(includeInactive)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#updateInstalledApp");
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
| **appUserId** | **String**| App user id | |
| **includeInactive** | **Boolean**| If the installed appUser is inactive, load inactive instead | [optional] |
| **updateUser** | [**UpdateUser**](UpdateUser.md)| App user data to update | [optional] |

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

<a name="validateAppInstallation"></a>
# **validateAppInstallation**
> BundleInstallValidate validateAppInstallation(orgId).createUser(createUser).execute();

Validate the installation of an app for a particular org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Set<OrgAccess> orgs = Arrays.asList(); // list of member orgs with permission levels
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appId = "appId_example"; // if the user is an app user, the id of the app
    Name name = new Name();
    String email = "email_example"; // email address of user
    String imagePath = "imagePath_example"; // path to full-sized profile image in storage
    String status = "SUPERUSER"; // current status of user
    Object options = null; // for apps, options (specific options are specific to the particular app); for users, user-set preferences
    Object internalOptions = null; // internal (ChartHop controlled) options
    Object secrets = null; // write-only secrets; the content of these secrets are not retrievable via the external-facing API
    List<UserEmailSetting> emailSettings = Arrays.asList(); // Email settings for the user
    try {
      BundleInstallValidate result = client
              .app
              .validateAppInstallation(orgs, orgId)
              .appId(appId)
              .name(name)
              .email(email)
              .imagePath(imagePath)
              .status(status)
              .options(options)
              .internalOptions(internalOptions)
              .secrets(secrets)
              .emailSettings(emailSettings)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getDuplicateEntities());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#validateAppInstallation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BundleInstallValidate> response = client
              .app
              .validateAppInstallation(orgs, orgId)
              .appId(appId)
              .name(name)
              .email(email)
              .imagePath(imagePath)
              .status(status)
              .options(options)
              .internalOptions(internalOptions)
              .secrets(secrets)
              .emailSettings(emailSettings)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#validateAppInstallation");
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
| **createUser** | [**CreateUser**](CreateUser.md)| App user data to create | [optional] |

### Return type

[**BundleInstallValidate**](BundleInstallValidate.md)

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

