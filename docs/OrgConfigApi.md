# OrgConfigApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIfNotExists**](OrgConfigApi.md#createIfNotExists) | **POST** /v1/org/{orgId}/config | Create an org config if it doesn&#39;t exist |
| [**getByOrgId**](OrgConfigApi.md#getByOrgId) | **GET** /v1/org/{orgId}/config | Return config for a given org |
| [**patchExistingConfig**](OrgConfigApi.md#patchExistingConfig) | **PATCH** /v1/org/{orgId}/config | Update an existing org config |


<a name="createIfNotExists"></a>
# **createIfNotExists**
> OrgConfig createIfNotExists(orgId).createOrgConfig(createOrgConfig).execute();

Create an org config if it doesn&#39;t exist



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // parent organization id
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    Set<String> hiddenFieldIds = Arrays.asList(); // set of hidden field ids of an org
    Set<BuiltInCategoryMap> builtinCategoryMap = Arrays.asList(); // set of maps of the custom fields that belongs to a built-in category
    Set<BuiltInFieldConfig> builtinFieldConfig = Arrays.asList(); // Org configuration for built-in fields
    CompensationBandsConfig compensationBandsConfig = new CompensationBandsConfig();
    List<SmartCurrencyOption> smartCurrencyOptions = Arrays.asList(); // Options for where to source a currency to use when currency is unknown. order specific
    String smartCurrencyDefault = "smartCurrencyDefault_example"; // The default currency to use when currency is unknown and there are no options set in smartCurrencyOptions
    Set<String> requiredJobFields = Arrays.asList(); // Org configuration for required job fields
    Map<String, String> scenarioApprovalChains = new HashMap(); // Configures which approval chains to use with specific scenario types
    Boolean isOpenJobRoleApprovalEnabled = true; // Whether to show open job approval on Open Job Profile page
    Set<GrantAlias> grantConfiguration = Arrays.asList(); // Org Grant Configuration
    try {
      OrgConfig result = client
              .orgConfig
              .createIfNotExists(orgId, orgId)
              .hiddenFieldIds(hiddenFieldIds)
              .builtinCategoryMap(builtinCategoryMap)
              .builtinFieldConfig(builtinFieldConfig)
              .compensationBandsConfig(compensationBandsConfig)
              .smartCurrencyOptions(smartCurrencyOptions)
              .smartCurrencyDefault(smartCurrencyDefault)
              .requiredJobFields(requiredJobFields)
              .scenarioApprovalChains(scenarioApprovalChains)
              .isOpenJobRoleApprovalEnabled(isOpenJobRoleApprovalEnabled)
              .grantConfiguration(grantConfiguration)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getHiddenFieldIds());
      System.out.println(result.getBuiltinCategoryMap());
      System.out.println(result.getBuiltinFieldConfig());
      System.out.println(result.getCompensationBandsConfig());
      System.out.println(result.getSmartCurrencyOptions());
      System.out.println(result.getSmartCurrencyDefault());
      System.out.println(result.getRequiredJobFields());
      System.out.println(result.getScenarioApprovalChains());
      System.out.println(result.getIsOpenJobRoleApprovalEnabled());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
      System.out.println(result.getGrantConfiguration());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConfigApi#createIfNotExists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgConfig> response = client
              .orgConfig
              .createIfNotExists(orgId, orgId)
              .hiddenFieldIds(hiddenFieldIds)
              .builtinCategoryMap(builtinCategoryMap)
              .builtinFieldConfig(builtinFieldConfig)
              .compensationBandsConfig(compensationBandsConfig)
              .smartCurrencyOptions(smartCurrencyOptions)
              .smartCurrencyDefault(smartCurrencyDefault)
              .requiredJobFields(requiredJobFields)
              .scenarioApprovalChains(scenarioApprovalChains)
              .isOpenJobRoleApprovalEnabled(isOpenJobRoleApprovalEnabled)
              .grantConfiguration(grantConfiguration)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConfigApi#createIfNotExists");
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
| **createOrgConfig** | [**CreateOrgConfig**](CreateOrgConfig.md)| Org config to create | [optional] |

### Return type

[**OrgConfig**](OrgConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |
| **500** | internal server error |  -  |

<a name="getByOrgId"></a>
# **getByOrgId**
> OrgConfig getByOrgId(orgId).execute();

Return config for a given org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgConfigApi;
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
      OrgConfig result = client
              .orgConfig
              .getByOrgId(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getHiddenFieldIds());
      System.out.println(result.getBuiltinCategoryMap());
      System.out.println(result.getBuiltinFieldConfig());
      System.out.println(result.getCompensationBandsConfig());
      System.out.println(result.getSmartCurrencyOptions());
      System.out.println(result.getSmartCurrencyDefault());
      System.out.println(result.getRequiredJobFields());
      System.out.println(result.getScenarioApprovalChains());
      System.out.println(result.getIsOpenJobRoleApprovalEnabled());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
      System.out.println(result.getGrantConfiguration());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConfigApi#getByOrgId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgConfig> response = client
              .orgConfig
              .getByOrgId(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConfigApi#getByOrgId");
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

[**OrgConfig**](OrgConfig.md)

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
| **500** | internal server error |  -  |

<a name="patchExistingConfig"></a>
# **patchExistingConfig**
> patchExistingConfig(orgId).updateOrgConfig(updateOrgConfig).execute();

Update an existing org config



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    Set<String> hiddenFieldIds = Arrays.asList(); // set of hidden field ids of an org
    Set<BuiltInCategoryMap> builtinCategoryMap = Arrays.asList(); // set of maps of the custom fields that belongs to a built-in category
    Set<BuiltInFieldConfig> builtinFieldConfig = Arrays.asList(); // Org configuration for built-in fields
    CompensationBandsConfig compensationBandsConfig = new CompensationBandsConfig();
    List<SmartCurrencyOption> smartCurrencyOptions = Arrays.asList(); // Options for where to source a currency to use when currency is unknown. order specific
    String smartCurrencyDefault = "smartCurrencyDefault_example"; // The default currency to use when currency is unknown and there are no options set in smartCurrencyOptions
    Set<String> requiredJobFields = Arrays.asList(); // Org configuration for required job fields
    Map<String, String> scenarioApprovalChains = new HashMap(); // Configures which approval chains to use with specific scenario types
    Boolean isOpenJobRoleApprovalEnabled = true; // Whether to show open job approval on Open Job Profile page
    Set<GrantAlias> grantConfiguration = Arrays.asList(); // Org Grant Configuration
    try {
      client
              .orgConfig
              .patchExistingConfig(orgId)
              .hiddenFieldIds(hiddenFieldIds)
              .builtinCategoryMap(builtinCategoryMap)
              .builtinFieldConfig(builtinFieldConfig)
              .compensationBandsConfig(compensationBandsConfig)
              .smartCurrencyOptions(smartCurrencyOptions)
              .smartCurrencyDefault(smartCurrencyDefault)
              .requiredJobFields(requiredJobFields)
              .scenarioApprovalChains(scenarioApprovalChains)
              .isOpenJobRoleApprovalEnabled(isOpenJobRoleApprovalEnabled)
              .grantConfiguration(grantConfiguration)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConfigApi#patchExistingConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .orgConfig
              .patchExistingConfig(orgId)
              .hiddenFieldIds(hiddenFieldIds)
              .builtinCategoryMap(builtinCategoryMap)
              .builtinFieldConfig(builtinFieldConfig)
              .compensationBandsConfig(compensationBandsConfig)
              .smartCurrencyOptions(smartCurrencyOptions)
              .smartCurrencyDefault(smartCurrencyDefault)
              .requiredJobFields(requiredJobFields)
              .scenarioApprovalChains(scenarioApprovalChains)
              .isOpenJobRoleApprovalEnabled(isOpenJobRoleApprovalEnabled)
              .grantConfiguration(grantConfiguration)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConfigApi#patchExistingConfig");
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
| **updateOrgConfig** | [**UpdateOrgConfig**](UpdateOrgConfig.md)| Sort data to update | [optional] |

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
| **404** | not found |  -  |
| **500** | internal server error |  -  |

