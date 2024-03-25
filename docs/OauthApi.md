# OauthApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizeUserToken**](OauthApi.md#authorizeUserToken) | **POST** /oauth/token | Return an Oauth2 Authorization bearer token, given a username and password |
| [**exchangeIdpAccessTokenResponse**](OauthApi.md#exchangeIdpAccessTokenResponse) | **GET** /oauth/sso/{idp}/access-token | Exchange a one-time use Auth Code for the IDP access token response |
| [**generateBearerTokenFromSSO**](OauthApi.md#generateBearerTokenFromSSO) | **POST** /oauth/token/sso/{type} | Return an Oauth2 Authorization bearer token, given a SSO id token |
| [**loginViaIdp**](OauthApi.md#loginViaIdp) | **GET** /oauth/sso/{idp}/login | Login via the auth endpoint |
| [**processOauthRedirectRequest**](OauthApi.md#processOauthRedirectRequest) | **GET** /oauth/app/{appName} | Process an Oauth2 redirect request from an access request for an app installation, storing the accessToken and refreshToken as secrets for the app |
| [**returnViewToken**](OauthApi.md#returnViewToken) | **POST** /oauth/token/view | Return a view-as token |
| [**revokeBearerToken**](OauthApi.md#revokeBearerToken) | **DELETE** /oauth/token | Delete the current Oauth2 bearer token (for signout) |


<a name="authorizeUserToken"></a>
# **authorizeUserToken**
> AccessTokenResponse authorizeUserToken().grantType(grantType).username(username).password(password).scope(scope).code(code).redirectUri(redirectUri).clientId(clientId).refreshToken(refreshToken).oauthAuthorizeUserTokenRequest(oauthAuthorizeUserTokenRequest).execute();

Return an Oauth2 Authorization bearer token, given a username and password



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String grantType = "grantType_example"; // Type of grant; 'password', 'refresh_token', 'authorization_code' supported
    String username = "username_example"; // Username to authenticate
    String password = "password_example"; // Password to authenticate
    String scope = "scope_example"; // Requested access scope or scopes (space separated)
    String code = "code_example"; // Authorization code
    URI redirectUri = new URI(); // Redirect URI
    String clientId = "clientId_example"; // Client id
    String refreshToken = "refreshToken_example"; // Refresh token
    try {
      AccessTokenResponse result = client
              .oauth
              .authorizeUserToken()
              .grantType(grantType)
              .username(username)
              .password(password)
              .scope(scope)
              .code(code)
              .redirectUri(redirectUri)
              .clientId(clientId)
              .refreshToken(refreshToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#authorizeUserToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenResponse> response = client
              .oauth
              .authorizeUserToken()
              .grantType(grantType)
              .username(username)
              .password(password)
              .scope(scope)
              .code(code)
              .redirectUri(redirectUri)
              .clientId(clientId)
              .refreshToken(refreshToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#authorizeUserToken");
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
| **grantType** | **String**| Type of grant; &#39;password&#39;, &#39;refresh_token&#39;, &#39;authorization_code&#39; supported | [optional] |
| **username** | **String**| Username to authenticate | [optional] |
| **password** | **String**| Password to authenticate | [optional] |
| **scope** | **String**| Requested access scope or scopes (space separated) | [optional] |
| **code** | **String**| Authorization code | [optional] |
| **redirectUri** | **URI**| Redirect URI | [optional] |
| **clientId** | **String**| Client id | [optional] |
| **refreshToken** | **String**| Refresh token | [optional] |
| **oauthAuthorizeUserTokenRequest** | [**OauthAuthorizeUserTokenRequest**](OauthAuthorizeUserTokenRequest.md)|  | [optional] |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid credentials |  -  |

<a name="exchangeIdpAccessTokenResponse"></a>
# **exchangeIdpAccessTokenResponse**
> IdpAccessTokenResponse exchangeIdpAccessTokenResponse(idp).authCode(authCode).execute();

Exchange a one-time use Auth Code for the IDP access token response



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String idp = "idp_example"; // Identity provider of SSO login (e.g. adp)
    String authCode = "authCode_example"; // A one-time use Auth Code
    try {
      IdpAccessTokenResponse result = client
              .oauth
              .exchangeIdpAccessTokenResponse(idp)
              .authCode(authCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getIdToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#exchangeIdpAccessTokenResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdpAccessTokenResponse> response = client
              .oauth
              .exchangeIdpAccessTokenResponse(idp)
              .authCode(authCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#exchangeIdpAccessTokenResponse");
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
| **idp** | **String**| Identity provider of SSO login (e.g. adp) | |
| **authCode** | **String**| A one-time use Auth Code | [optional] |

### Return type

[**IdpAccessTokenResponse**](IdpAccessTokenResponse.md)

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

<a name="generateBearerTokenFromSSO"></a>
# **generateBearerTokenFromSSO**
> AccessTokenResponse generateBearerTokenFromSSO(type).createOrg(createOrg).signupSource(signupSource).utmParams(utmParams).email(email).accessTokenRequest(accessTokenRequest).execute();

Return an Oauth2 Authorization bearer token, given a SSO id token



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String idToken = "idToken_example"; // id token
    String scope = "scope_example"; // scope being requested
    String type = "type_example"; // type of SSO request (google or microsoft)
    String fromToken = "fromToken_example"; // an existing token
    Boolean createOrg = true; // automatically create org if possible to do so
    String signupSource = "ADP_MARKETPLACE"; // sign up source (self-serve, connect, or sequoia)
    String utmParams = "utmParams_example"; // utm params (used in salesforce for lead tracking)
    String email = "email_example"; // sign up email address
    try {
      AccessTokenResponse result = client
              .oauth
              .generateBearerTokenFromSSO(idToken, scope, type)
              .fromToken(fromToken)
              .createOrg(createOrg)
              .signupSource(signupSource)
              .utmParams(utmParams)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#generateBearerTokenFromSSO");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenResponse> response = client
              .oauth
              .generateBearerTokenFromSSO(idToken, scope, type)
              .fromToken(fromToken)
              .createOrg(createOrg)
              .signupSource(signupSource)
              .utmParams(utmParams)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#generateBearerTokenFromSSO");
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
| **type** | **String**| type of SSO request (google or microsoft) | |
| **createOrg** | **Boolean**| automatically create org if possible to do so | [optional] |
| **signupSource** | **String**| sign up source (self-serve, connect, or sequoia) | [optional] [enum: ADP_MARKETPLACE, SELF_SERVE, SELF_SERVE_TEST, SEQUOIA_ONE, CONNECT] |
| **utmParams** | **String**| utm params (used in salesforce for lead tracking) | [optional] |
| **email** | **String**| sign up email address | [optional] |
| **accessTokenRequest** | [**AccessTokenRequest**](AccessTokenRequest.md)| access token request | [optional] |

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
| **200** | successful operation |  -  |
| **400** | invalid credentials |  -  |

<a name="loginViaIdp"></a>
# **loginViaIdp**
> loginViaIdp(idp).execute();

Login via the auth endpoint



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String idp = "idp_example"; // Identity provider of SSO login (e.g. adp)
    try {
      client
              .oauth
              .loginViaIdp(idp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#loginViaIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .oauth
              .loginViaIdp(idp)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#loginViaIdp");
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
| **idp** | **String**| Identity provider of SSO login (e.g. adp) | |

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

<a name="processOauthRedirectRequest"></a>
# **processOauthRedirectRequest**
> processOauthRedirectRequest(appName).token(token).state(state).code(code).execute();

Process an Oauth2 redirect request from an access request for an app installation, storing the accessToken and refreshToken as secrets for the app



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String appName = "appName_example"; // App name
    String token = "token_example";
    String state = "state_example"; // State, containing orgId and appUserId
    String code = "code_example"; // Temporary authorization code
    try {
      client
              .oauth
              .processOauthRedirectRequest(appName)
              .token(token)
              .state(state)
              .code(code)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#processOauthRedirectRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .oauth
              .processOauthRedirectRequest(appName)
              .token(token)
              .state(state)
              .code(code)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#processOauthRedirectRequest");
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
| **token** | **String**|  | [optional] |
| **state** | **String**| State, containing orgId and appUserId | [optional] |
| **code** | **String**| Temporary authorization code | [optional] |

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

<a name="returnViewToken"></a>
# **returnViewToken**
> AccessTokenResponse returnViewToken().viewAsRequest(viewAsRequest).execute();

Return a view-as token



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // org id
    String scope = "scope_example"; // scope being requested
    String personId = "personId_example"; // person id
    String userId = "userId_example"; // user id
    String roleId = "roleId_example"; // role id
    try {
      AccessTokenResponse result = client
              .oauth
              .returnViewToken(orgId, scope)
              .personId(personId)
              .userId(userId)
              .roleId(roleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#returnViewToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenResponse> response = client
              .oauth
              .returnViewToken(orgId, scope)
              .personId(personId)
              .userId(userId)
              .roleId(roleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#returnViewToken");
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
| **viewAsRequest** | [**ViewAsRequest**](ViewAsRequest.md)| request on whom to view as | [optional] |

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
| **200** | successful operation |  -  |
| **400** | invalid credentials |  -  |

<a name="revokeBearerToken"></a>
# **revokeBearerToken**
> revokeBearerToken().execute();

Delete the current Oauth2 bearer token (for signout)



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
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
              .oauth
              .revokeBearerToken()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#revokeBearerToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .oauth
              .revokeBearerToken()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#revokeBearerToken");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | not authorized |  -  |

