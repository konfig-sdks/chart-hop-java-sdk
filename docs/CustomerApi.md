# CustomerApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewCustomer**](CustomerApi.md#createNewCustomer) | **POST** /v1/customer | Create a new customer |
| [**getAllInvoicesForCustomer**](CustomerApi.md#getAllInvoicesForCustomer) | **GET** /v1/customer/{customerId}/invoices | Returns a list of all the invoices for the given customer |
| [**getById**](CustomerApi.md#getById) | **GET** /v1/customer/{customerId} | Return a particular customer by id |
| [**getCharthopSubscription**](CustomerApi.md#getCharthopSubscription) | **GET** /v1/customer/{customerId}/subscription | Returns information about the Charthop subscription for the given customer |
| [**listVisibleCustomers**](CustomerApi.md#listVisibleCustomers) | **GET** /v1/customer | Return all visible customers, paginated by name |
| [**updateExistingCustomer**](CustomerApi.md#updateExistingCustomer) | **PATCH** /v1/customer/{customerId} | Update an existing customer |
| [**updateSubscription**](CustomerApi.md#updateSubscription) | **PATCH** /v1/customer/{customerId}/subscription |  |


<a name="createNewCustomer"></a>
# **createNewCustomer**
> Customer createNewCustomer().createCustomer(createCustomer).execute();

Create a new customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // name of customer
    String email = "email_example"; // email address for billing purposes
    LocalDate startDate = LocalDate.now(); // initial date of billing
    Address billAddress = new Address();
    String industry = "industry_example"; // industry that customer is in
    String source = "ADP_MARKETPLACE"; // source of customer signup
    String status = "ACTIVE"; // current status
    String salesforceAccountId = "salesforceAccountId_example"; // salesforce account id
    List<ProductItem> products = Arrays.asList(); // products that this customer has purchased
    LocalDate endDate = LocalDate.now(); // end of service date for churning customers -- on or after this date, service should be disabled
    LocalDate nextInvoiceDate = LocalDate.now(); // date of next invoice
    String primaryHeadCountFilter = "primaryHeadCountFilter_example"; // primary headcount filter - used for billing purposes
    String secondaryHeadCountFilter = "secondaryHeadCountFilter_example"; // secondary headcount filter - used for billing purposes
    Double arr = 3.4D; // current ARR of the customer based on most recent invoice
    Double projectedArr = 3.4D; // projected ARR of the customer for upcoming invoice, based on plan and headcount
    LocalDate trialStartDate = LocalDate.now(); // date this customer begins their trial period
    LocalDate trialEndDate = LocalDate.now(); // date this customer ends their trial period
    String stripeSubscriptionSync = "SYNC"; // Stripe subscription settings
    try {
      Customer result = client
              .customer
              .createNewCustomer(name, email, startDate)
              .billAddress(billAddress)
              .industry(industry)
              .source(source)
              .status(status)
              .salesforceAccountId(salesforceAccountId)
              .products(products)
              .endDate(endDate)
              .nextInvoiceDate(nextInvoiceDate)
              .primaryHeadCountFilter(primaryHeadCountFilter)
              .secondaryHeadCountFilter(secondaryHeadCountFilter)
              .arr(arr)
              .projectedArr(projectedArr)
              .trialStartDate(trialStartDate)
              .trialEndDate(trialEndDate)
              .stripeSubscriptionSync(stripeSubscriptionSync)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getEmail());
      System.out.println(result.getBillAddress());
      System.out.println(result.getIndustry());
      System.out.println(result.getSource());
      System.out.println(result.getStatus());
      System.out.println(result.getStripeCustomerId());
      System.out.println(result.getSalesforceAccountId());
      System.out.println(result.getProducts());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getNextInvoiceDate());
      System.out.println(result.getOrgCount());
      System.out.println(result.getPrimaryHeadCount());
      System.out.println(result.getSecondaryHeadCount());
      System.out.println(result.getPrimaryHeadCountFilter());
      System.out.println(result.getSecondaryHeadCountFilter());
      System.out.println(result.getArr());
      System.out.println(result.getProjectedArr());
      System.out.println(result.getTrialStartDate());
      System.out.println(result.getTrialEndDate());
      System.out.println(result.getStripeSubscriptionSync());
      System.out.println(result.getCreateAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createNewCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Customer> response = client
              .customer
              .createNewCustomer(name, email, startDate)
              .billAddress(billAddress)
              .industry(industry)
              .source(source)
              .status(status)
              .salesforceAccountId(salesforceAccountId)
              .products(products)
              .endDate(endDate)
              .nextInvoiceDate(nextInvoiceDate)
              .primaryHeadCountFilter(primaryHeadCountFilter)
              .secondaryHeadCountFilter(secondaryHeadCountFilter)
              .arr(arr)
              .projectedArr(projectedArr)
              .trialStartDate(trialStartDate)
              .trialEndDate(trialEndDate)
              .stripeSubscriptionSync(stripeSubscriptionSync)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createNewCustomer");
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
| **createCustomer** | [**CreateCustomer**](CreateCustomer.md)| Customer data to create | [optional] |

### Return type

[**Customer**](Customer.md)

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

<a name="getAllInvoicesForCustomer"></a>
# **getAllInvoicesForCustomer**
> InvoiceResponse getAllInvoicesForCustomer(customerId).execute();

Returns a list of all the invoices for the given customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String customerId = "customerId_example"; // Customer id
    try {
      InvoiceResponse result = client
              .customer
              .getAllInvoicesForCustomer(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoices());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getAllInvoicesForCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceResponse> response = client
              .customer
              .getAllInvoicesForCustomer(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getAllInvoicesForCustomer");
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
| **customerId** | **String**| Customer id | |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

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
> Customer getById(customerId).execute();

Return a particular customer by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String customerId = "customerId_example"; // Customer id
    try {
      Customer result = client
              .customer
              .getById(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getEmail());
      System.out.println(result.getBillAddress());
      System.out.println(result.getIndustry());
      System.out.println(result.getSource());
      System.out.println(result.getStatus());
      System.out.println(result.getStripeCustomerId());
      System.out.println(result.getSalesforceAccountId());
      System.out.println(result.getProducts());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getNextInvoiceDate());
      System.out.println(result.getOrgCount());
      System.out.println(result.getPrimaryHeadCount());
      System.out.println(result.getSecondaryHeadCount());
      System.out.println(result.getPrimaryHeadCountFilter());
      System.out.println(result.getSecondaryHeadCountFilter());
      System.out.println(result.getArr());
      System.out.println(result.getProjectedArr());
      System.out.println(result.getTrialStartDate());
      System.out.println(result.getTrialEndDate());
      System.out.println(result.getStripeSubscriptionSync());
      System.out.println(result.getCreateAt());
      System.out.println(result.getCreateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Customer> response = client
              .customer
              .getById(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getById");
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
| **customerId** | **String**| Customer id | |

### Return type

[**Customer**](Customer.md)

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

<a name="getCharthopSubscription"></a>
# **getCharthopSubscription**
> Subscription getCharthopSubscription(customerId).execute();

Returns information about the Charthop subscription for the given customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String customerId = "customerId_example"; // Customer id
    try {
      Subscription result = client
              .customer
              .getCharthopSubscription(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextInvoiceAt());
      System.out.println(result.getPlan());
      System.out.println(result.getPaymentInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCharthopSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Subscription> response = client
              .customer
              .getCharthopSubscription(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCharthopSubscription");
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
| **customerId** | **String**| Customer id | |

### Return type

[**Subscription**](Subscription.md)

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

<a name="listVisibleCustomers"></a>
# **listVisibleCustomers**
> ResultsCustomer listVisibleCustomers().from(from).limit(limit).status(status).execute();

Return all visible customers, paginated by name



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String from = "from_example"; // Customer id to start from
    Integer limit = 56; // Number of results to return
    String status = "status_example"; // Customer.Status. (ACTIVE/INACTIVE/TRAIL)
    try {
      ResultsCustomer result = client
              .customer
              .listVisibleCustomers()
              .from(from)
              .limit(limit)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#listVisibleCustomers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsCustomer> response = client
              .customer
              .listVisibleCustomers()
              .from(from)
              .limit(limit)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#listVisibleCustomers");
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
| **from** | **String**| Customer id to start from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **status** | **String**| Customer.Status. (ACTIVE/INACTIVE/TRAIL) | [optional] |

### Return type

[**ResultsCustomer**](ResultsCustomer.md)

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

<a name="updateExistingCustomer"></a>
# **updateExistingCustomer**
> updateExistingCustomer(customerId).updateCustomer(updateCustomer).execute();

Update an existing customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String customerId = "customerId_example"; // Customer id
    String name = "name_example"; // name of customer
    String email = "email_example"; // email address for billing purposes
    Address billAddress = new Address();
    String industry = "industry_example"; // industry that customer is in
    String source = "ADP_MARKETPLACE"; // source of customer signup
    String status = "ACTIVE"; // current status
    String salesforceAccountId = "salesforceAccountId_example"; // salesforce account id
    List<ProductItem> products = Arrays.asList(); // products that this customer has purchased
    LocalDate startDate = LocalDate.now(); // initial date of billing
    LocalDate endDate = LocalDate.now(); // end of service date for churning customers -- on or after this date, service should be disabled
    LocalDate nextInvoiceDate = LocalDate.now(); // date of next invoice
    String primaryHeadCountFilter = "primaryHeadCountFilter_example"; // primary headcount filter - used for billing purposes
    String secondaryHeadCountFilter = "secondaryHeadCountFilter_example"; // secondary headcount filter - used for billing purposes
    Double arr = 3.4D; // current ARR of the customer based on most recent invoice
    Double projectedArr = 3.4D; // projected ARR of the customer for upcoming invoice, based on plan and headcount
    LocalDate trialStartDate = LocalDate.now(); // date this customer begins their trial period
    LocalDate trialEndDate = LocalDate.now(); // date this customer ends their trial period
    String stripeSubscriptionSync = "SYNC"; // Stripe subscription settings
    try {
      client
              .customer
              .updateExistingCustomer(customerId)
              .name(name)
              .email(email)
              .billAddress(billAddress)
              .industry(industry)
              .source(source)
              .status(status)
              .salesforceAccountId(salesforceAccountId)
              .products(products)
              .startDate(startDate)
              .endDate(endDate)
              .nextInvoiceDate(nextInvoiceDate)
              .primaryHeadCountFilter(primaryHeadCountFilter)
              .secondaryHeadCountFilter(secondaryHeadCountFilter)
              .arr(arr)
              .projectedArr(projectedArr)
              .trialStartDate(trialStartDate)
              .trialEndDate(trialEndDate)
              .stripeSubscriptionSync(stripeSubscriptionSync)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateExistingCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customer
              .updateExistingCustomer(customerId)
              .name(name)
              .email(email)
              .billAddress(billAddress)
              .industry(industry)
              .source(source)
              .status(status)
              .salesforceAccountId(salesforceAccountId)
              .products(products)
              .startDate(startDate)
              .endDate(endDate)
              .nextInvoiceDate(nextInvoiceDate)
              .primaryHeadCountFilter(primaryHeadCountFilter)
              .secondaryHeadCountFilter(secondaryHeadCountFilter)
              .arr(arr)
              .projectedArr(projectedArr)
              .trialStartDate(trialStartDate)
              .trialEndDate(trialEndDate)
              .stripeSubscriptionSync(stripeSubscriptionSync)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateExistingCustomer");
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
| **customerId** | **String**| Customer id | |
| **updateCustomer** | [**UpdateCustomer**](UpdateCustomer.md)| Customer data to update | [optional] |

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

<a name="updateSubscription"></a>
# **updateSubscription**
> updateSubscription(customerId).updateSubscription(updateSubscription).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String paymentMethod = "paymentMethod_example"; // Payment method to create; 'INVOICE' to make subscription paid by invoice, or the ID of the payment method if to make the subscription automatically charge a card
    String customerId = "customerId_example"; // Customer id
    try {
      client
              .customer
              .updateSubscription(paymentMethod, customerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customer
              .updateSubscription(paymentMethod, customerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateSubscription");
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
| **customerId** | **String**| Customer id | |
| **updateSubscription** | [**UpdateSubscription**](UpdateSubscription.md)| Subscription data to update | [optional] |

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

