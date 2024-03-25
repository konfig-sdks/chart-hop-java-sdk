# PolicyApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkValidityOf**](PolicyApi.md#checkValidityOf) | **POST** /v1/org/{orgId}/policy/validate | Return if a policy is valid |
| [**copyExistingPolicy**](PolicyApi.md#copyExistingPolicy) | **POST** /v1/org/{orgId}/policy/{policyId}/copy | Copy an existing policy |
| [**createNewPolicy**](PolicyApi.md#createNewPolicy) | **POST** /v1/org/{orgId}/policy | Create a policy |
| [**getAllEntityActionMaps**](PolicyApi.md#getAllEntityActionMaps) | **GET** /v1/org/{orgId}/policy/action | Return all entity:action maps allowed on a policy rule |
| [**getAllPolicies**](PolicyApi.md#getAllPolicies) | **GET** /v1/org/{orgId}/policy | Return all or a set of policies in the organization |
| [**getById**](PolicyApi.md#getById) | **GET** /v1/org/{orgId}/policy/{policyId} | Return a particular policy by id |
| [**removeById**](PolicyApi.md#removeById) | **DELETE** /v1/org/{orgId}/policy/{policyId} | Delete a policy |
| [**updateExistingPolicy**](PolicyApi.md#updateExistingPolicy) | **PATCH** /v1/org/{orgId}/policy/{policyId} | Update an existing policy |


<a name="checkValidityOf"></a>
# **checkValidityOf**
> checkValidityOf(orgId).partialPolicy(partialPolicy).execute();

Return if a policy is valid



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String description = "description_example"; // description of policy
    String id = "id_example"; // globally unique id
    String orgId = "orgId_example"; // parent organization id (empty if global)
    String label = "label_example"; // human-readable full name of policy
    List<PolicyRule> rules = Arrays.asList(); // the rules that define the policy
    String copiedFromId = "copiedFromId_example"; // policy id that was copied (empty if original)
    String createId = "createId_example"; // created by user id
    String createAt = "createAt_example"; // created timestamp
    String updateId = "updateId_example"; // last updated by user id
    String updateAt = "updateAt_example"; // last updated timestamp
    String deleteId = "deleteId_example"; // deleted by user id
    String deleteAt = "deleteAt_example"; // deleted timestamp
    try {
      client
              .policy
              .checkValidityOf(orgId)
              .description(description)
              .id(id)
              .orgId(orgId)
              .label(label)
              .rules(rules)
              .copiedFromId(copiedFromId)
              .createId(createId)
              .createAt(createAt)
              .updateId(updateId)
              .updateAt(updateAt)
              .deleteId(deleteId)
              .deleteAt(deleteAt)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#checkValidityOf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .checkValidityOf(orgId)
              .description(description)
              .id(id)
              .orgId(orgId)
              .label(label)
              .rules(rules)
              .copiedFromId(copiedFromId)
              .createId(createId)
              .createAt(createAt)
              .updateId(updateId)
              .updateAt(updateAt)
              .deleteId(deleteId)
              .deleteAt(deleteAt)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#checkValidityOf");
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
| **partialPolicy** | [**PartialPolicy**](PartialPolicy.md)| Policy data to verify | [optional] |

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

<a name="copyExistingPolicy"></a>
# **copyExistingPolicy**
> Policy copyExistingPolicy(orgId, policyId).execute();

Copy an existing policy



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String policyId = "policyId_example"; // Policy id
    try {
      Policy result = client
              .policy
              .copyExistingPolicy(orgId, policyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getRules());
      System.out.println(result.getRoles());
      System.out.println(result.getUsers());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#copyExistingPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Policy> response = client
              .policy
              .copyExistingPolicy(orgId, policyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#copyExistingPolicy");
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
| **policyId** | **String**| Policy id | |

### Return type

[**Policy**](Policy.md)

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

<a name="createNewPolicy"></a>
# **createNewPolicy**
> Policy createNewPolicy(orgId).createPolicy(createPolicy).execute();

Create a policy



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // human-readable full name of policy
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String description = "description_example"; // description of policy
    String orgId = "orgId_example"; // parent organization id (empty if global)
    List<PolicyRule> rules = Arrays.asList(); // the rules that define the policy
    String copiedFromId = "copiedFromId_example"; // policy id that was copied (empty if original)
    try {
      Policy result = client
              .policy
              .createNewPolicy(label, orgId)
              .description(description)
              .orgId(orgId)
              .rules(rules)
              .copiedFromId(copiedFromId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getRules());
      System.out.println(result.getRoles());
      System.out.println(result.getUsers());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#createNewPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Policy> response = client
              .policy
              .createNewPolicy(label, orgId)
              .description(description)
              .orgId(orgId)
              .rules(rules)
              .copiedFromId(copiedFromId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#createNewPolicy");
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
| **createPolicy** | [**CreatePolicy**](CreatePolicy.md)| Policy data to create | [optional] |

### Return type

[**Policy**](Policy.md)

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
| **404** | org not found |  -  |

<a name="getAllEntityActionMaps"></a>
# **getAllEntityActionMaps**
> EntityAction getAllEntityActionMaps(orgId).execute();

Return all entity:action maps allowed on a policy rule



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
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
      EntityAction result = client
              .policy
              .getAllEntityActionMaps(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntityToAction());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getAllEntityActionMaps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntityAction> response = client
              .policy
              .getAllEntityActionMaps(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getAllEntityActionMaps");
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

[**EntityAction**](EntityAction.md)

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

<a name="getAllPolicies"></a>
# **getAllPolicies**
> ResultsPolicy getAllPolicies(orgId).ids(ids).type(type).execute();

Return all or a set of policies in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String ids = "ids_example"; // (Optional) Comma separated Policy Ids to find
    String type = "type_example"; // (Optional) Return only default or custom policies
    try {
      ResultsPolicy result = client
              .policy
              .getAllPolicies(orgId)
              .ids(ids)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getAllPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsPolicy> response = client
              .policy
              .getAllPolicies(orgId)
              .ids(ids)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getAllPolicies");
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
| **ids** | **String**| (Optional) Comma separated Policy Ids to find | [optional] |
| **type** | **String**| (Optional) Return only default or custom policies | [optional] |

### Return type

[**ResultsPolicy**](ResultsPolicy.md)

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

<a name="getById"></a>
# **getById**
> Policy getById(orgId, policyId).execute();

Return a particular policy by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String policyId = "policyId_example"; // Policy id
    try {
      Policy result = client
              .policy
              .getById(orgId, policyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getRules());
      System.out.println(result.getRoles());
      System.out.println(result.getUsers());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Policy> response = client
              .policy
              .getById(orgId, policyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getById");
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
| **policyId** | **String**| Policy id | |

### Return type

[**Policy**](Policy.md)

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
> removeById(orgId, policyId).execute();

Delete a policy



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String policyId = "policyId_example"; // Policy id
    try {
      client
              .policy
              .removeById(orgId, policyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .removeById(orgId, policyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#removeById");
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
| **policyId** | **String**| Policy id | |

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
| **404** | not found |  -  |
| **500** | Not Implemented |  -  |

<a name="updateExistingPolicy"></a>
# **updateExistingPolicy**
> updateExistingPolicy(orgId, policyId).updatePolicy(updatePolicy).execute();

Update an existing policy



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String policyId = "policyId_example"; // Policy id
    String description = "description_example"; // description of policy
    String label = "label_example"; // human-readable full name of policy
    List<PolicyRule> rules = Arrays.asList(); // the rules that define the policy
    try {
      client
              .policy
              .updateExistingPolicy(orgId, policyId)
              .description(description)
              .label(label)
              .rules(rules)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#updateExistingPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .updateExistingPolicy(orgId, policyId)
              .description(description)
              .label(label)
              .rules(rules)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#updateExistingPolicy");
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
| **policyId** | **String**| Policy id | |
| **updatePolicy** | [**UpdatePolicy**](UpdatePolicy.md)| Policy data to update | [optional] |

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

