# UserApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignRoleToMultiple**](UserApi.md#assignRoleToMultiple) | **PATCH** /v1/user/assign | Assign or remove multiple users a role within an org |
| [**changePassword**](UserApi.md#changePassword) | **POST** /v1/user/{userId}/password | Change a user&#39;s password, or switch a user to SSO |
| [**createNewUser**](UserApi.md#createNewUser) | **POST** /v1/user | Create a new user |
| [**getAllUsersWithinOrgs**](UserApi.md#getAllUsersWithinOrgs) | **GET** /v1/user | Return all users within an org or across orgs |
| [**getCurrentUser**](UserApi.md#getCurrentUser) | **GET** /v1/user/me | Return the currently logged in user |
| [**getUserByEmail**](UserApi.md#getUserByEmail) | **GET** /v1/user/email/{email} | Return a particular user by email |
| [**getUserById**](UserApi.md#getUserById) | **GET** /v1/user/{userId} | Return a particular user by id |
| [**inviteMultipleNewUsers**](UserApi.md#inviteMultipleNewUsers) | **POST** /v1/user/invite | Create/invite multiple new users |
| [**returnUserByPersonId**](UserApi.md#returnUserByPersonId) | **GET** /v1/user/person/{personId} | Return a particular user by its corresponding person id |
| [**revokeAccessToken**](UserApi.md#revokeAccessToken) | **DELETE** /v1/user/{userId}/token | Revoke a user&#39;s access token |
| [**revokeAccessTokens**](UserApi.md#revokeAccessTokens) | **DELETE** /v1/user/token | Revoke multiple user&#39;s access tokens |
| [**sendPasswordResetEmail**](UserApi.md#sendPasswordResetEmail) | **POST** /v1/user/sendreset | Send a password reset email |
| [**updateExistingUser**](UserApi.md#updateExistingUser) | **PATCH** /v1/user/{userId} | Update an existing user |
| [**viewedUserDetails**](UserApi.md#viewedUserDetails) | **GET** /v1/user/me/view | Return the user the user is currently viewing as |


<a name="assignRoleToMultiple"></a>
# **assignRoleToMultiple**
> assignRoleToMultiple().requestBody(requestBody).execute();

Assign or remove multiple users a role within an org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    try {
      client
              .user
              .assignRoleToMultiple()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#assignRoleToMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .assignRoleToMultiple()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#assignRoleToMultiple");
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
| **requestBody** | [**Map&lt;String, UpdateUser&gt;**](UpdateUser.md)| User data | [optional] |

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

<a name="changePassword"></a>
# **changePassword**
> changePassword(userId).changePasswordRequest(changePasswordRequest).execute();

Change a user&#39;s password, or switch a user to SSO



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String newPassword = "newPassword_example"; // password to change to
    String userId = "userId_example"; // User id
    String oldPassword = "oldPassword_example"; // password to change from
    try {
      client
              .user
              .changePassword(newPassword, userId)
              .oldPassword(oldPassword)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#changePassword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .changePassword(newPassword, userId)
              .oldPassword(oldPassword)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#changePassword");
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
| **userId** | **String**| User id | |
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)|  | [optional] |

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

<a name="createNewUser"></a>
# **createNewUser**
> User createNewUser().createUser(createUser).execute();

Create a new user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Set<OrgAccess> orgs = Arrays.asList(); // list of member orgs with permission levels
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
      User result = client
              .user
              .createNewUser(orgs)
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
      System.err.println("Exception when calling UserApi#createNewUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .createNewUser(orgs)
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
      System.err.println("Exception when calling UserApi#createNewUser");
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
| **createUser** | [**CreateUser**](CreateUser.md)| User data to create | [optional] |

### Return type

[**User**](User.md)

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

<a name="getAllUsersWithinOrgs"></a>
# **getAllUsersWithinOrgs**
> ResultsUser getAllUsersWithinOrgs().orgId(orgId).from(from).limit(limit).sort(sort).execute();

Return all users within an org or across orgs



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org id to search within
    String from = "from_example"; // User id to start from
    Integer limit = 56; // Number of results to return
    String sort = "sort_example"; // Sort by
    try {
      ResultsUser result = client
              .user
              .getAllUsersWithinOrgs()
              .orgId(orgId)
              .from(from)
              .limit(limit)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getAllUsersWithinOrgs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsUser> response = client
              .user
              .getAllUsersWithinOrgs()
              .orgId(orgId)
              .from(from)
              .limit(limit)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getAllUsersWithinOrgs");
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
| **orgId** | **String**| Org id to search within | [optional] |
| **from** | **String**| User id to start from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **sort** | **String**| Sort by | [optional] |

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

<a name="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser().execute();

Return the currently logged in user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    try {
      User result = client
              .user
              .getCurrentUser()
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
      System.err.println("Exception when calling UserApi#getCurrentUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .getCurrentUser()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getCurrentUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

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
| **200** | successful operation |  -  |
| **401** | unauthorized |  -  |

<a name="getUserByEmail"></a>
# **getUserByEmail**
> User getUserByEmail(email).execute();

Return a particular user by email



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String email = "email_example"; // Email
    try {
      User result = client
              .user
              .getUserByEmail(email)
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
      System.err.println("Exception when calling UserApi#getUserByEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .getUserByEmail(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserByEmail");
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
| **email** | **String**| Email | |

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
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="getUserById"></a>
# **getUserById**
> User getUserById(userId).execute();

Return a particular user by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String userId = "userId_example"; // User id
    try {
      User result = client
              .user
              .getUserById(userId)
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
      System.err.println("Exception when calling UserApi#getUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .getUserById(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserById");
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
| **userId** | **String**| User id | |

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
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="inviteMultipleNewUsers"></a>
# **inviteMultipleNewUsers**
> List&lt;Object&gt; inviteMultipleNewUsers().createUser(createUser).execute();

Create/invite multiple new users



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    try {
      List<Object> result = client
              .user
              .inviteMultipleNewUsers()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#inviteMultipleNewUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Object>> response = client
              .user
              .inviteMultipleNewUsers()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#inviteMultipleNewUsers");
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
| **createUser** | [**List&lt;CreateUser&gt;**](CreateUser.md)| User data to create | [optional] |

### Return type

**List&lt;Object&gt;**

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

<a name="returnUserByPersonId"></a>
# **returnUserByPersonId**
> User returnUserByPersonId(personId, orgId).execute();

Return a particular user by its corresponding person id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String personId = "personId_example"; // Person id to fetch user for
    String orgId = "orgId_example"; // Org id to search within
    try {
      User result = client
              .user
              .returnUserByPersonId(personId, orgId)
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
      System.err.println("Exception when calling UserApi#returnUserByPersonId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .returnUserByPersonId(personId, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#returnUserByPersonId");
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
| **personId** | **String**| Person id to fetch user for | |
| **orgId** | **String**| Org id to search within | |

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
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="revokeAccessToken"></a>
# **revokeAccessToken**
> revokeAccessToken(userId).execute();

Revoke a user&#39;s access token



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String userId = "userId_example"; // User id
    try {
      client
              .user
              .revokeAccessToken(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .revokeAccessToken(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeAccessToken");
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
| **userId** | **String**| User id | |

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
| **401** | unauthorized |  -  |
| **404** | not found |  -  |

<a name="revokeAccessTokens"></a>
# **revokeAccessTokens**
> revokeAccessTokens().requestBody(requestBody).execute();

Revoke multiple user&#39;s access tokens



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    try {
      client
              .user
              .revokeAccessTokens()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeAccessTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .revokeAccessTokens()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeAccessTokens");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| User ids | [optional] |

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

<a name="sendPasswordResetEmail"></a>
# **sendPasswordResetEmail**
> sendPasswordResetEmail().emailRequest(emailRequest).execute();

Send a password reset email



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String email = "email_example"; // email address
    try {
      client
              .user
              .sendPasswordResetEmail(email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#sendPasswordResetEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .sendPasswordResetEmail(email)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#sendPasswordResetEmail");
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
| **emailRequest** | [**EmailRequest**](EmailRequest.md)| User email address | [optional] |

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
| **0** | email not found |  -  |

<a name="updateExistingUser"></a>
# **updateExistingUser**
> updateExistingUser(userId).updateUser(updateUser).execute();

Update an existing user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String userId = "userId_example"; // User id
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
    try {
      client
              .user
              .updateExistingUser(userId)
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
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateExistingUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .updateExistingUser(userId)
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
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateExistingUser");
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
| **userId** | **String**| User id | |
| **updateUser** | [**UpdateUser**](UpdateUser.md)| User data to update | [optional] |

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

<a name="viewedUserDetails"></a>
# **viewedUserDetails**
> User viewedUserDetails().execute();

Return the user the user is currently viewing as



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    try {
      User result = client
              .user
              .viewedUserDetails()
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
      System.err.println("Exception when calling UserApi#viewedUserDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .viewedUserDetails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewedUserDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

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
| **200** | successful operation |  -  |
| **401** | unauthorized |  -  |

