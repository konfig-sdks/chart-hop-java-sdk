# SamlApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**performSsoAssertion**](SamlApi.md#performSsoAssertion) | **POST** /saml/{org}/login | Return an redirect to the designated Idp, given an identity provider |
| [**performSsoAssertion_0**](SamlApi.md#performSsoAssertion_0) | **POST** /saml/sso/{org} | Single sign on URL, where SAML assertion is perform |
| [**savePerOrgXmlCertFromIdp**](SamlApi.md#savePerOrgXmlCertFromIdp) | **GET** /saml/org/{orgId}/xml-cert | Save per org Xml Cert from IDP |
| [**savePerOrgXmlCertFromIdp_0**](SamlApi.md#savePerOrgXmlCertFromIdp_0) | **POST** /saml/org/{orgId}/xml-cert | Save per org Xml Cert from IDP |


<a name="performSsoAssertion"></a>
# **performSsoAssertion**
> performSsoAssertion(org).idp(idp).execute();

Return an redirect to the designated Idp, given an identity provider



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SamlApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String org = "org_example"; // Org slug
    String idp = "idp_example"; // Identifier Provider
    try {
      client
              .saml
              .performSsoAssertion(org)
              .idp(idp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamlApi#performSsoAssertion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .saml
              .performSsoAssertion(org)
              .idp(idp)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamlApi#performSsoAssertion");
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
| **org** | **String**| Org slug | |
| **idp** | **String**| Identifier Provider | [optional] |

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
| **0** | invalid data |  -  |

<a name="performSsoAssertion_0"></a>
# **performSsoAssertion_0**
> performSsoAssertion_0(org).token(token).saMLResponse(saMLResponse).relayState(relayState).samlPerformSsoAssertionRequest(samlPerformSsoAssertionRequest).execute();

Single sign on URL, where SAML assertion is perform



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SamlApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String org = "org_example"; // Org slug
    String token = "token_example";
    String saMLResponse = "saMLResponse_example"; // SAML Response
    String relayState = "relayState_example"; // Relay State
    try {
      client
              .saml
              .performSsoAssertion_0(org)
              .token(token)
              .saMLResponse(saMLResponse)
              .relayState(relayState)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamlApi#performSsoAssertion_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .saml
              .performSsoAssertion_0(org)
              .token(token)
              .saMLResponse(saMLResponse)
              .relayState(relayState)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamlApi#performSsoAssertion_0");
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
| **org** | **String**| Org slug | |
| **token** | **String**|  | [optional] |
| **saMLResponse** | **String**| SAML Response | [optional] |
| **relayState** | **String**| Relay State | [optional] |
| **samlPerformSsoAssertionRequest** | [**SamlPerformSsoAssertionRequest**](SamlPerformSsoAssertionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | invalid data |  -  |

<a name="savePerOrgXmlCertFromIdp"></a>
# **savePerOrgXmlCertFromIdp**
> savePerOrgXmlCertFromIdp(orgId).idp(idp).execute();

Save per org Xml Cert from IDP



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SamlApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String idp = "idp_example"; // Identifier Provider
    try {
      client
              .saml
              .savePerOrgXmlCertFromIdp(orgId)
              .idp(idp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamlApi#savePerOrgXmlCertFromIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .saml
              .savePerOrgXmlCertFromIdp(orgId)
              .idp(idp)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamlApi#savePerOrgXmlCertFromIdp");
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
| **idp** | **String**| Identifier Provider | [optional] |

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
| **0** | invalid data |  -  |

<a name="savePerOrgXmlCertFromIdp_0"></a>
# **savePerOrgXmlCertFromIdp_0**
> savePerOrgXmlCertFromIdp_0(orgId).idp(idp).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Save per org Xml Cert from IDP



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SamlApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    File _file = new File("/path/to/file");
    String idp = "idp_example"; // Identifier Provider
    try {
      client
              .saml
              .savePerOrgXmlCertFromIdp_0(orgId)
              ._file(_file)
              .idp(idp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamlApi#savePerOrgXmlCertFromIdp_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .saml
              .savePerOrgXmlCertFromIdp_0(orgId)
              ._file(_file)
              .idp(idp)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamlApi#savePerOrgXmlCertFromIdp_0");
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
| **idp** | **String**| Identifier Provider | [optional] |
| **fileUploadNewFileRequest** | [**FileUploadNewFileRequest**](FileUploadNewFileRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | invalid data |  -  |

