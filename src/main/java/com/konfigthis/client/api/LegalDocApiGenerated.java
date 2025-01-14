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


import com.konfigthis.client.model.CreateLegalDoc;
import com.konfigthis.client.model.LegalDoc;
import java.time.LocalDate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LegalDocApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LegalDocApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LegalDocApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createDocumentCall(CreateLegalDoc createLegalDoc, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createLegalDoc;

        // create path and map variables
        String localVarPath = "/v1/legaldoc";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createDocumentValidateBeforeCall(CreateLegalDoc createLegalDoc, final ApiCallback _callback) throws ApiException {
        return createDocumentCall(createLegalDoc, _callback);

    }


    private ApiResponse<Void> createDocumentWithHttpInfo(CreateLegalDoc createLegalDoc) throws ApiException {
        okhttp3.Call localVarCall = createDocumentValidateBeforeCall(createLegalDoc, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call createDocumentAsync(CreateLegalDoc createLegalDoc, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDocumentValidateBeforeCall(createLegalDoc, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class CreateDocumentRequestBuilder {
        private final String name;
        private final String content;
        private final LocalDate date;

        private CreateDocumentRequestBuilder(String name, String content, LocalDate date) {
            this.name = name;
            this.content = content;
            this.date = date;
        }

        /**
         * Build call for createDocument
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
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CreateLegalDoc createLegalDoc = buildBodyParams();
            return createDocumentCall(createLegalDoc, _callback);
        }

        private CreateLegalDoc buildBodyParams() {
            CreateLegalDoc createLegalDoc = new CreateLegalDoc();
            createLegalDoc.name(this.name);
            createLegalDoc.content(this.content);
            createLegalDoc.date(this.date);
            return createLegalDoc;
        }

        /**
         * Execute createDocument request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            CreateLegalDoc createLegalDoc = buildBodyParams();
            createDocumentWithHttpInfo(createLegalDoc);
        }

        /**
         * Execute createDocument request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            CreateLegalDoc createLegalDoc = buildBodyParams();
            return createDocumentWithHttpInfo(createLegalDoc);
        }

        /**
         * Execute createDocument request (asynchronously)
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
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            CreateLegalDoc createLegalDoc = buildBodyParams();
            return createDocumentAsync(createLegalDoc, _callback);
        }
    }

    /**
     * Create a legal doc
     * 
     * @return CreateDocumentRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
     </table>
     */
    public CreateDocumentRequestBuilder createDocument(String name, String content, LocalDate date) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (content == null) throw new IllegalArgumentException("\"content\" is required but got null");
            

        if (date == null) throw new IllegalArgumentException("\"date\" is required but got null");
        return new CreateDocumentRequestBuilder(name, content, date);
    }
    private okhttp3.Call getByNameCall(String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/legaldoc/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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
    private okhttp3.Call getByNameValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getByName(Async)");
        }

        return getByNameCall(name, _callback);

    }


    private ApiResponse<LegalDoc> getByNameWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = getByNameValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<LegalDoc>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByNameAsync(String name, final ApiCallback<LegalDoc> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByNameValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<LegalDoc>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByNameRequestBuilder {
        private final String name;

        private GetByNameRequestBuilder(String name) {
            this.name = name;
        }

        /**
         * Build call for getByName
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByNameCall(name, _callback);
        }


        /**
         * Execute getByName request
         * @return LegalDoc
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public LegalDoc execute() throws ApiException {
            ApiResponse<LegalDoc> localVarResp = getByNameWithHttpInfo(name);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getByName request with HTTP info returned
         * @return ApiResponse&lt;LegalDoc&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<LegalDoc> executeWithHttpInfo() throws ApiException {
            return getByNameWithHttpInfo(name);
        }

        /**
         * Execute getByName request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<LegalDoc> _callback) throws ApiException {
            return getByNameAsync(name, _callback);
        }
    }

    /**
     * Retrieve the legal doc by name
     * 
     * @param name name (required)
     * @return GetByNameRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
     </table>
     */
    public GetByNameRequestBuilder getByName(String name) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        return new GetByNameRequestBuilder(name);
    }
}
