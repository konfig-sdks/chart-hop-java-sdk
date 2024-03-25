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


import com.konfigthis.client.model.ResultsOnboardStep;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OnboardApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OnboardApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public OnboardApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call incompleteStepsCall(String orgId, Boolean getUncomplete, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/org/{orgId}/onboard"
            .replace("{" + "orgId" + "}", localVarApiClient.escapeString(orgId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (getUncomplete != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("getUncomplete", getUncomplete));
        }

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
    private okhttp3.Call incompleteStepsValidateBeforeCall(String orgId, Boolean getUncomplete, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling incompleteSteps(Async)");
        }

        return incompleteStepsCall(orgId, getUncomplete, _callback);

    }


    private ApiResponse<ResultsOnboardStep> incompleteStepsWithHttpInfo(String orgId, Boolean getUncomplete) throws ApiException {
        okhttp3.Call localVarCall = incompleteStepsValidateBeforeCall(orgId, getUncomplete, null);
        Type localVarReturnType = new TypeToken<ResultsOnboardStep>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call incompleteStepsAsync(String orgId, Boolean getUncomplete, final ApiCallback<ResultsOnboardStep> _callback) throws ApiException {

        okhttp3.Call localVarCall = incompleteStepsValidateBeforeCall(orgId, getUncomplete, _callback);
        Type localVarReturnType = new TypeToken<ResultsOnboardStep>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class IncompleteStepsRequestBuilder {
        private final String orgId;
        private Boolean getUncomplete;

        private IncompleteStepsRequestBuilder(String orgId) {
            this.orgId = orgId;
        }

        /**
         * Set getUncomplete
         * @param getUncomplete Return only uncompleted steps, or all steps? (optional)
         * @return IncompleteStepsRequestBuilder
         */
        public IncompleteStepsRequestBuilder getUncomplete(Boolean getUncomplete) {
            this.getUncomplete = getUncomplete;
            return this;
        }
        
        /**
         * Build call for incompleteSteps
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
            return incompleteStepsCall(orgId, getUncomplete, _callback);
        }


        /**
         * Execute incompleteSteps request
         * @return ResultsOnboardStep
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ResultsOnboardStep execute() throws ApiException {
            ApiResponse<ResultsOnboardStep> localVarResp = incompleteStepsWithHttpInfo(orgId, getUncomplete);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute incompleteSteps request with HTTP info returned
         * @return ApiResponse&lt;ResultsOnboardStep&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResultsOnboardStep> executeWithHttpInfo() throws ApiException {
            return incompleteStepsWithHttpInfo(orgId, getUncomplete);
        }

        /**
         * Execute incompleteSteps request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<ResultsOnboardStep> _callback) throws ApiException {
            return incompleteStepsAsync(orgId, getUncomplete, _callback);
        }
    }

    /**
     * Returns all the onboarding steps the organization has not completed
     * 
     * @param orgId Org identifier (either id or slug) (required)
     * @return IncompleteStepsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public IncompleteStepsRequestBuilder incompleteSteps(String orgId) throws IllegalArgumentException {
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new IncompleteStepsRequestBuilder(orgId);
    }
    private okhttp3.Call markStepSkippedCall(String orgId, String stepName, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/org/{orgId}/onboard/{stepName}/skip"
            .replace("{" + "orgId" + "}", localVarApiClient.escapeString(orgId.toString()))
            .replace("{" + "stepName" + "}", localVarApiClient.escapeString(stepName.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call markStepSkippedValidateBeforeCall(String orgId, String stepName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling markStepSkipped(Async)");
        }

        // verify the required parameter 'stepName' is set
        if (stepName == null) {
            throw new ApiException("Missing the required parameter 'stepName' when calling markStepSkipped(Async)");
        }

        return markStepSkippedCall(orgId, stepName, _callback);

    }


    private ApiResponse<Void> markStepSkippedWithHttpInfo(String orgId, String stepName) throws ApiException {
        okhttp3.Call localVarCall = markStepSkippedValidateBeforeCall(orgId, stepName, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call markStepSkippedAsync(String orgId, String stepName, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = markStepSkippedValidateBeforeCall(orgId, stepName, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class MarkStepSkippedRequestBuilder {
        private final String orgId;
        private final String stepName;

        private MarkStepSkippedRequestBuilder(String orgId, String stepName) {
            this.orgId = orgId;
            this.stepName = stepName;
        }

        /**
         * Build call for markStepSkipped
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return markStepSkippedCall(orgId, stepName, _callback);
        }


        /**
         * Execute markStepSkipped request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            markStepSkippedWithHttpInfo(orgId, stepName);
        }

        /**
         * Execute markStepSkipped request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return markStepSkippedWithHttpInfo(orgId, stepName);
        }

        /**
         * Execute markStepSkipped request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return markStepSkippedAsync(orgId, stepName, _callback);
        }
    }

    /**
     * Marks the given onboard step as &#39;skipped&#39; for the given customer
     * 
     * @param orgId Org identifier (either id or slug) (required)
     * @param stepName Step name (required)
     * @return MarkStepSkippedRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public MarkStepSkippedRequestBuilder markStepSkipped(String orgId, String stepName) throws IllegalArgumentException {
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        if (stepName == null) throw new IllegalArgumentException("\"stepName\" is required but got null");
            

        return new MarkStepSkippedRequestBuilder(orgId, stepName);
    }
}