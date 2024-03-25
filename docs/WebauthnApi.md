# WebauthnApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkExistingKey**](WebauthnApi.md#checkExistingKey) | **GET** /v1/webauthn/verify | Check for an existing physical key for this user |
| [**removeRegisteredCredentialsByEmail**](WebauthnApi.md#removeRegisteredCredentialsByEmail) | **DELETE** /v1/webauthn/register/{emailBase64} | Delete registered credentials by the given email |
| [**verifyPhysicalKeyForUser**](WebauthnApi.md#verifyPhysicalKeyForUser) | **GET** /v1/webauthn/register | Check for an existing physical key for this user |
| [**verifyPhysicalKeyForUser_0**](WebauthnApi.md#verifyPhysicalKeyForUser_0) | **POST** /v1/webauthn/register | Check for an existing WebAuthn key for this user |
| [**verifyPhysicalKeyForUser_1**](WebauthnApi.md#verifyPhysicalKeyForUser_1) | **POST** /v1/webauthn/verify | Check for an existing physical key for this user |


<a name="checkExistingKey"></a>
# **checkExistingKey**
> checkExistingKey().execute();

Check for an existing physical key for this user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebauthnApi;
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
              .webauthn
              .checkExistingKey()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#checkExistingKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webauthn
              .checkExistingKey()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#checkExistingKey");
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
| **200** | OK |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="removeRegisteredCredentialsByEmail"></a>
# **removeRegisteredCredentialsByEmail**
> removeRegisteredCredentialsByEmail(emailBase64).execute();

Delete registered credentials by the given email



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebauthnApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String emailBase64 = "emailBase64_example"; // Email
    try {
      client
              .webauthn
              .removeRegisteredCredentialsByEmail(emailBase64)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#removeRegisteredCredentialsByEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webauthn
              .removeRegisteredCredentialsByEmail(emailBase64)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#removeRegisteredCredentialsByEmail");
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
| **emailBase64** | **String**| Email | |

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

<a name="verifyPhysicalKeyForUser"></a>
# **verifyPhysicalKeyForUser**
> verifyPhysicalKeyForUser().execute();

Check for an existing physical key for this user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebauthnApi;
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
              .webauthn
              .verifyPhysicalKeyForUser()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#verifyPhysicalKeyForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webauthn
              .verifyPhysicalKeyForUser()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#verifyPhysicalKeyForUser");
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
| **200** | OK |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="verifyPhysicalKeyForUser_0"></a>
# **verifyPhysicalKeyForUser_0**
> verifyPhysicalKeyForUser_0().webAuthnRequest(webAuthnRequest).execute();

Check for an existing WebAuthn key for this user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebauthnApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String requestId = "requestId_example";
    String credentialResponse = "credentialResponse_example";
    try {
      client
              .webauthn
              .verifyPhysicalKeyForUser_0(requestId, credentialResponse)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#verifyPhysicalKeyForUser_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webauthn
              .verifyPhysicalKeyForUser_0(requestId, credentialResponse)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#verifyPhysicalKeyForUser_0");
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
| **webAuthnRequest** | [**WebAuthnRequest**](WebAuthnRequest.md)|  | [optional] |

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
| **403** | permission denied |  -  |

<a name="verifyPhysicalKeyForUser_1"></a>
# **verifyPhysicalKeyForUser_1**
> verifyPhysicalKeyForUser_1().webAuthnRequest(webAuthnRequest).execute();

Check for an existing physical key for this user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebauthnApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String requestId = "requestId_example";
    String credentialResponse = "credentialResponse_example";
    try {
      client
              .webauthn
              .verifyPhysicalKeyForUser_1(requestId, credentialResponse)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#verifyPhysicalKeyForUser_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webauthn
              .verifyPhysicalKeyForUser_1(requestId, credentialResponse)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebauthnApi#verifyPhysicalKeyForUser_1");
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
| **webAuthnRequest** | [**WebAuthnRequest**](WebAuthnRequest.md)|  | [optional] |

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
| **403** | permission denied |  -  |

