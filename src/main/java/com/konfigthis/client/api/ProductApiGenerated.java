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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CreateProduct;
import com.konfigthis.client.model.Product;
import com.konfigthis.client.model.ResultsProduct;
import com.konfigthis.client.model.UpdateProduct;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProductApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProductApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ProductApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createNewProductCall(CreateProduct createProduct, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createProduct;

        // create path and map variables
        String localVarPath = "/v1/product";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewProductValidateBeforeCall(CreateProduct createProduct, final ApiCallback _callback) throws ApiException {
        return createNewProductCall(createProduct, _callback);

    }


    private ApiResponse<Product> createNewProductWithHttpInfo(CreateProduct createProduct) throws ApiException {
        okhttp3.Call localVarCall = createNewProductValidateBeforeCall(createProduct, null);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewProductAsync(CreateProduct createProduct, final ApiCallback<Product> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewProductValidateBeforeCall(createProduct, _callback);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewProductRequestBuilder {
        private final String name;
        private final String salesforceProductId;
        private final String stripeProductId;
        private final Set<String> features;
        private String sku;
        private Map<String, List<FeatureAccessOption>> featureOptions;

        private CreateNewProductRequestBuilder(String name, String salesforceProductId, String stripeProductId, Set<String> features) {
            this.name = name;
            this.salesforceProductId = salesforceProductId;
            this.stripeProductId = stripeProductId;
            this.features = features;
        }

        /**
         * Set sku
         * @param sku unique sku of product (optional)
         * @return CreateNewProductRequestBuilder
         */
        public CreateNewProductRequestBuilder sku(String sku) {
            this.sku = sku;
            return this;
        }
        
        /**
         * Set featureOptions
         * @param featureOptions map of options for the feature (optional)
         * @return CreateNewProductRequestBuilder
         */
        public CreateNewProductRequestBuilder featureOptions(Map<String, List<FeatureAccessOption>> featureOptions) {
            this.featureOptions = featureOptions;
            return this;
        }
        
        /**
         * Build call for createNewProduct
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CreateProduct createProduct = buildBodyParams();
            return createNewProductCall(createProduct, _callback);
        }

        private CreateProduct buildBodyParams() {
            CreateProduct createProduct = new CreateProduct();
            createProduct.name(this.name);
            createProduct.sku(this.sku);
            createProduct.salesforceProductId(this.salesforceProductId);
            createProduct.stripeProductId(this.stripeProductId);
            if (this.features != null)
            createProduct.features(CreateProduct.FeaturesEnum.fromValue(this.features));
            createProduct.featureOptions(this.featureOptions);
            return createProduct;
        }

        /**
         * Execute createNewProduct request
         * @return Product
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public Product execute() throws ApiException {
            CreateProduct createProduct = buildBodyParams();
            ApiResponse<Product> localVarResp = createNewProductWithHttpInfo(createProduct);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNewProduct request with HTTP info returned
         * @return ApiResponse&lt;Product&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Product> executeWithHttpInfo() throws ApiException {
            CreateProduct createProduct = buildBodyParams();
            return createNewProductWithHttpInfo(createProduct);
        }

        /**
         * Execute createNewProduct request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Product> _callback) throws ApiException {
            CreateProduct createProduct = buildBodyParams();
            return createNewProductAsync(createProduct, _callback);
        }
    }

    /**
     * Create a new product
     * 
     * @return CreateNewProductRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewProductRequestBuilder createNewProduct(String name, String salesforceProductId, String stripeProductId, Set<String> features) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (salesforceProductId == null) throw new IllegalArgumentException("\"salesforceProductId\" is required but got null");
            

        if (stripeProductId == null) throw new IllegalArgumentException("\"stripeProductId\" is required but got null");
            

        if (features == null) throw new IllegalArgumentException("\"features\" is required but got null");
        return new CreateNewProductRequestBuilder(name, salesforceProductId, stripeProductId, features);
    }
    private okhttp3.Call getByIdCall(String productId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/product/{productId}"
            .replace("{" + "productId" + "}", localVarApiClient.escapeString(productId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByIdValidateBeforeCall(String productId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling getById(Async)");
        }

        return getByIdCall(productId, _callback);

    }


    private ApiResponse<Product> getByIdWithHttpInfo(String productId) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(productId, null);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String productId, final ApiCallback<Product> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(productId, _callback);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String productId;

        private GetByIdRequestBuilder(String productId) {
            this.productId = productId;
        }

        /**
         * Build call for getById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByIdCall(productId, _callback);
        }


        /**
         * Execute getById request
         * @return Product
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public Product execute() throws ApiException {
            ApiResponse<Product> localVarResp = getByIdWithHttpInfo(productId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;Product&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Product> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(productId);
        }

        /**
         * Execute getById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Product> _callback) throws ApiException {
            return getByIdAsync(productId, _callback);
        }
    }

    /**
     * Return a particular product by id
     * 
     * @param productId Product id (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String productId) throws IllegalArgumentException {
        if (productId == null) throw new IllegalArgumentException("\"productId\" is required but got null");
            

        return new GetByIdRequestBuilder(productId);
    }
    private okhttp3.Call listAllProductsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/product";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAllProductsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listAllProductsCall(_callback);

    }


    private ApiResponse<ResultsProduct> listAllProductsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listAllProductsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ResultsProduct>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllProductsAsync(final ApiCallback<ResultsProduct> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllProductsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ResultsProduct>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllProductsRequestBuilder {

        private ListAllProductsRequestBuilder() {
        }

        /**
         * Build call for listAllProducts
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAllProductsCall(_callback);
        }


        /**
         * Execute listAllProducts request
         * @return ResultsProduct
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ResultsProduct execute() throws ApiException {
            ApiResponse<ResultsProduct> localVarResp = listAllProductsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAllProducts request with HTTP info returned
         * @return ApiResponse&lt;ResultsProduct&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResultsProduct> executeWithHttpInfo() throws ApiException {
            return listAllProductsWithHttpInfo();
        }

        /**
         * Execute listAllProducts request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResultsProduct> _callback) throws ApiException {
            return listAllProductsAsync(_callback);
        }
    }

    /**
     * Return all products
     * 
     * @return ListAllProductsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ListAllProductsRequestBuilder listAllProducts() throws IllegalArgumentException {
        return new ListAllProductsRequestBuilder();
    }
    private okhttp3.Call updateExistingProductCall(String productId, UpdateProduct updateProduct, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = updateProduct;

        // create path and map variables
        String localVarPath = "/v1/product/{productId}"
            .replace("{" + "productId" + "}", localVarApiClient.escapeString(productId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateExistingProductValidateBeforeCall(String productId, UpdateProduct updateProduct, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling updateExistingProduct(Async)");
        }

        return updateExistingProductCall(productId, updateProduct, _callback);

    }


    private ApiResponse<Void> updateExistingProductWithHttpInfo(String productId, UpdateProduct updateProduct) throws ApiException {
        okhttp3.Call localVarCall = updateExistingProductValidateBeforeCall(productId, updateProduct, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call updateExistingProductAsync(String productId, UpdateProduct updateProduct, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateExistingProductValidateBeforeCall(productId, updateProduct, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class UpdateExistingProductRequestBuilder {
        private final String productId;
        private String name;
        private String sku;
        private String salesforceProductId;
        private String stripeProductId;
        private Set<String> features;
        private Map<String, List<FeatureAccessOption>> featureOptions;

        private UpdateExistingProductRequestBuilder(String productId) {
            this.productId = productId;
        }

        /**
         * Set name
         * @param name name of product (optional)
         * @return UpdateExistingProductRequestBuilder
         */
        public UpdateExistingProductRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set sku
         * @param sku unique sku of product (optional)
         * @return UpdateExistingProductRequestBuilder
         */
        public UpdateExistingProductRequestBuilder sku(String sku) {
            this.sku = sku;
            return this;
        }
        
        /**
         * Set salesforceProductId
         * @param salesforceProductId corresponding product id in salesforce (optional)
         * @return UpdateExistingProductRequestBuilder
         */
        public UpdateExistingProductRequestBuilder salesforceProductId(String salesforceProductId) {
            this.salesforceProductId = salesforceProductId;
            return this;
        }
        
        /**
         * Set stripeProductId
         * @param stripeProductId corresponding product id in stripe (optional)
         * @return UpdateExistingProductRequestBuilder
         */
        public UpdateExistingProductRequestBuilder stripeProductId(String stripeProductId) {
            this.stripeProductId = stripeProductId;
            return this;
        }
        
        /**
         * Set features
         * @param features set of features this product has access to (optional)
         * @return UpdateExistingProductRequestBuilder
         */
        public UpdateExistingProductRequestBuilder features(Set<String> features) {
            this.features = features;
            return this;
        }
        
        /**
         * Set featureOptions
         * @param featureOptions map of options for the feature (optional)
         * @return UpdateExistingProductRequestBuilder
         */
        public UpdateExistingProductRequestBuilder featureOptions(Map<String, List<FeatureAccessOption>> featureOptions) {
            this.featureOptions = featureOptions;
            return this;
        }
        
        /**
         * Build call for updateExistingProduct
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            UpdateProduct updateProduct = buildBodyParams();
            return updateExistingProductCall(productId, updateProduct, _callback);
        }

        private UpdateProduct buildBodyParams() {
            UpdateProduct updateProduct = new UpdateProduct();
            updateProduct.name(this.name);
            updateProduct.sku(this.sku);
            updateProduct.salesforceProductId(this.salesforceProductId);
            updateProduct.stripeProductId(this.stripeProductId);
            if (this.features != null)
            updateProduct.features(UpdateProduct.FeaturesEnum.fromValue(this.features));
            updateProduct.featureOptions(this.featureOptions);
            return updateProduct;
        }

        /**
         * Execute updateExistingProduct request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            UpdateProduct updateProduct = buildBodyParams();
            updateExistingProductWithHttpInfo(productId, updateProduct);
        }

        /**
         * Execute updateExistingProduct request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            UpdateProduct updateProduct = buildBodyParams();
            return updateExistingProductWithHttpInfo(productId, updateProduct);
        }

        /**
         * Execute updateExistingProduct request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            UpdateProduct updateProduct = buildBodyParams();
            return updateExistingProductAsync(productId, updateProduct, _callback);
        }
    }

    /**
     * Update an existing product
     * 
     * @param productId Product id (required)
     * @return UpdateExistingProductRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public UpdateExistingProductRequestBuilder updateExistingProduct(String productId) throws IllegalArgumentException {
        if (productId == null) throw new IllegalArgumentException("\"productId\" is required but got null");
            

        return new UpdateExistingProductRequestBuilder(productId);
    }
}
