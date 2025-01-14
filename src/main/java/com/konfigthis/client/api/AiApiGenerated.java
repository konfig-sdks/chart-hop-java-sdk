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


import com.konfigthis.client.model.SummarizeFormResponsesRequest;
import com.konfigthis.client.model.SummarizeResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AiApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AiApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AiApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call generateTextSummaryCall(String orgId, SummarizeFormResponsesRequest summarizeFormResponsesRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = summarizeFormResponsesRequest;

        // create path and map variables
        String localVarPath = "/v1/org/{orgId}/ai/form-response/summary"
            .replace("{" + "orgId" + "}", localVarApiClient.escapeString(orgId.toString()));

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
    private okhttp3.Call generateTextSummaryValidateBeforeCall(String orgId, SummarizeFormResponsesRequest summarizeFormResponsesRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling generateTextSummary(Async)");
        }

        return generateTextSummaryCall(orgId, summarizeFormResponsesRequest, _callback);

    }


    private ApiResponse<SummarizeResponse> generateTextSummaryWithHttpInfo(String orgId, SummarizeFormResponsesRequest summarizeFormResponsesRequest) throws ApiException {
        okhttp3.Call localVarCall = generateTextSummaryValidateBeforeCall(orgId, summarizeFormResponsesRequest, null);
        Type localVarReturnType = new TypeToken<SummarizeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call generateTextSummaryAsync(String orgId, SummarizeFormResponsesRequest summarizeFormResponsesRequest, final ApiCallback<SummarizeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateTextSummaryValidateBeforeCall(orgId, summarizeFormResponsesRequest, _callback);
        Type localVarReturnType = new TypeToken<SummarizeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GenerateTextSummaryRequestBuilder {
        private final String questionId;
        private final String orgId;
        private String formId;
        private String assessmentId;

        private GenerateTextSummaryRequestBuilder(String questionId, String orgId) {
            this.questionId = questionId;
            this.orgId = orgId;
        }

        /**
         * Set formId
         * @param formId  (optional)
         * @return GenerateTextSummaryRequestBuilder
         */
        public GenerateTextSummaryRequestBuilder formId(String formId) {
            this.formId = formId;
            return this;
        }
        
        /**
         * Set assessmentId
         * @param assessmentId  (optional)
         * @return GenerateTextSummaryRequestBuilder
         */
        public GenerateTextSummaryRequestBuilder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            return this;
        }
        
        /**
         * Build call for generateTextSummary
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            SummarizeFormResponsesRequest summarizeFormResponsesRequest = buildBodyParams();
            return generateTextSummaryCall(orgId, summarizeFormResponsesRequest, _callback);
        }

        private SummarizeFormResponsesRequest buildBodyParams() {
            SummarizeFormResponsesRequest summarizeFormResponsesRequest = new SummarizeFormResponsesRequest();
            summarizeFormResponsesRequest.questionId(this.questionId);
            summarizeFormResponsesRequest.formId(this.formId);
            summarizeFormResponsesRequest.assessmentId(this.assessmentId);
            return summarizeFormResponsesRequest;
        }

        /**
         * Execute generateTextSummary request
         * @return SummarizeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public SummarizeResponse execute() throws ApiException {
            SummarizeFormResponsesRequest summarizeFormResponsesRequest = buildBodyParams();
            ApiResponse<SummarizeResponse> localVarResp = generateTextSummaryWithHttpInfo(orgId, summarizeFormResponsesRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute generateTextSummary request with HTTP info returned
         * @return ApiResponse&lt;SummarizeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SummarizeResponse> executeWithHttpInfo() throws ApiException {
            SummarizeFormResponsesRequest summarizeFormResponsesRequest = buildBodyParams();
            return generateTextSummaryWithHttpInfo(orgId, summarizeFormResponsesRequest);
        }

        /**
         * Execute generateTextSummary request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SummarizeResponse> _callback) throws ApiException {
            SummarizeFormResponsesRequest summarizeFormResponsesRequest = buildBodyParams();
            return generateTextSummaryAsync(orgId, summarizeFormResponsesRequest, _callback);
        }
    }

    /**
     * Use AI to generate a summary of text form responses
     * 
     * @param orgId Org identifier (either id or slug) (required)
     * @return GenerateTextSummaryRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid data </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> permission denied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public GenerateTextSummaryRequestBuilder generateTextSummary(String questionId, String orgId) throws IllegalArgumentException {
        if (questionId == null) throw new IllegalArgumentException("\"questionId\" is required but got null");
            

        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new GenerateTextSummaryRequestBuilder(questionId, orgId);
    }
}
