/*
 * ChartHop API
 * REST API for ChartHop
 *
 * The version of the OpenAPI document: V1.0.0
 * Contact: support@charthop.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Address;
import com.konfigthis.client.model.CreateCustomer;
import com.konfigthis.client.model.Customer;
import com.konfigthis.client.model.InvoiceResponse;
import java.time.LocalDate;
import com.konfigthis.client.model.ProductItem;
import com.konfigthis.client.model.ResultsCustomer;
import com.konfigthis.client.model.Subscription;
import com.konfigthis.client.model.UpdateCustomer;
import com.konfigthis.client.model.UpdateSubscription;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerApi
 */
@Disabled
public class CustomerApiTest {

    private static CustomerApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CustomerApi(apiClient);
    }

    /**
     * Create a new customer
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewCustomerTest() throws ApiException {
        String name = null;
        String email = null;
        LocalDate startDate = null;
        Address billAddress = null;
        String industry = null;
        String source = null;
        String status = null;
        String salesforceAccountId = null;
        List<ProductItem> products = null;
        LocalDate endDate = null;
        LocalDate nextInvoiceDate = null;
        String primaryHeadCountFilter = null;
        String secondaryHeadCountFilter = null;
        Double arr = null;
        Double projectedArr = null;
        LocalDate trialStartDate = null;
        LocalDate trialEndDate = null;
        String stripeSubscriptionSync = null;
        Customer response = api.createNewCustomer(name, email, startDate)
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
        // TODO: test validations
    }

    /**
     * Returns a list of all the invoices for the given customer
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllInvoicesForCustomerTest() throws ApiException {
        String customerId = null;
        InvoiceResponse response = api.getAllInvoicesForCustomer(customerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular customer by id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String customerId = null;
        Customer response = api.getById(customerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns information about the Charthop subscription for the given customer
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCharthopSubscriptionTest() throws ApiException {
        String customerId = null;
        Subscription response = api.getCharthopSubscription(customerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all visible customers, paginated by name
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listVisibleCustomersTest() throws ApiException {
        String from = null;
        Integer limit = null;
        String status = null;
        ResultsCustomer response = api.listVisibleCustomers()
                .from(from)
                .limit(limit)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing customer
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExistingCustomerTest() throws ApiException {
        String customerId = null;
        String name = null;
        String email = null;
        Address billAddress = null;
        String industry = null;
        String source = null;
        String status = null;
        String salesforceAccountId = null;
        List<ProductItem> products = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        LocalDate nextInvoiceDate = null;
        String primaryHeadCountFilter = null;
        String secondaryHeadCountFilter = null;
        Double arr = null;
        Double projectedArr = null;
        LocalDate trialStartDate = null;
        LocalDate trialEndDate = null;
        String stripeSubscriptionSync = null;
        api.updateExistingCustomer(customerId)
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
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSubscriptionTest() throws ApiException {
        String paymentMethod = null;
        String customerId = null;
        api.updateSubscription(paymentMethod, customerId)
                .execute();
        // TODO: test validations
    }

}
