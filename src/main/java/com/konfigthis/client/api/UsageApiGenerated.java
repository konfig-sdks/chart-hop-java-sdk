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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UsageApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsageApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UsageApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call recordProductFeatureUsageCall(String orgId, String type, String entityId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/org/{orgId}/usage/{type}"
            .replace("{" + "orgId" + "}", localVarApiClient.escapeString(orgId.toString()))
            .replace("{" + "type" + "}", localVarApiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (entityId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("entityId", entityId));
        }

        final String[] localVarAccepts = {
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call recordProductFeatureUsageValidateBeforeCall(String orgId, String type, String entityId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling recordProductFeatureUsage(Async)");
        }

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling recordProductFeatureUsage(Async)");
        }

        return recordProductFeatureUsageCall(orgId, type, entityId, _callback);

    }


    private ApiResponse<Void> recordProductFeatureUsageWithHttpInfo(String orgId, String type, String entityId) throws ApiException {
        okhttp3.Call localVarCall = recordProductFeatureUsageValidateBeforeCall(orgId, type, entityId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call recordProductFeatureUsageAsync(String orgId, String type, String entityId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = recordProductFeatureUsageValidateBeforeCall(orgId, type, entityId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class RecordProductFeatureUsageRequestBuilder {
        private final String orgId;
        private final String type;
        private String entityId;

        private RecordProductFeatureUsageRequestBuilder(String orgId, String type) {
            this.orgId = orgId;
            this.type = type;
        }

        /**
         * Set entityId
         * @param entityId Entity id, if applicable (optional)
         * @return RecordProductFeatureUsageRequestBuilder
         */
        public RecordProductFeatureUsageRequestBuilder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        
        /**
         * Build call for recordProductFeatureUsage
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return recordProductFeatureUsageCall(orgId, type, entityId, _callback);
        }


        /**
         * Execute recordProductFeatureUsage request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            recordProductFeatureUsageWithHttpInfo(orgId, type, entityId);
        }

        /**
         * Execute recordProductFeatureUsage request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return recordProductFeatureUsageWithHttpInfo(orgId, type, entityId);
        }

        /**
         * Execute recordProductFeatureUsage request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return recordProductFeatureUsageAsync(orgId, type, entityId, _callback);
        }
    }

    /**
     * Record usage of a product feature
     * 
     * @param orgId Org identifier (either id or slug) (required)
     * @param type Type of usage (required)
     * @return RecordProductFeatureUsageRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public RecordProductFeatureUsageRequestBuilder recordProductFeatureUsage(String orgId, String type) throws IllegalArgumentException {
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        if (type == null) throw new IllegalArgumentException("\"type\" is required but got null");
            

        return new RecordProductFeatureUsageRequestBuilder(orgId, type);
    }
}
