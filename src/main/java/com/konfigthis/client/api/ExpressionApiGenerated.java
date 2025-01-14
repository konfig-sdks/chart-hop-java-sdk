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


import com.konfigthis.client.model.EvaluateExpressionRequest;
import com.konfigthis.client.model.EvaluateExpressionResponse;
import com.konfigthis.client.model.ValidateExpressionRequest;
import com.konfigthis.client.model.ValidateExpressionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ExpressionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExpressionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ExpressionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call evaluateCarrotExpressionCall(String orgId, EvaluateExpressionRequest evaluateExpressionRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = evaluateExpressionRequest;

        // create path and map variables
        String localVarPath = "/v1/org/{orgId}/cql/evaluate"
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
    private okhttp3.Call evaluateCarrotExpressionValidateBeforeCall(String orgId, EvaluateExpressionRequest evaluateExpressionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling evaluateCarrotExpression(Async)");
        }

        return evaluateCarrotExpressionCall(orgId, evaluateExpressionRequest, _callback);

    }


    private ApiResponse<EvaluateExpressionResponse> evaluateCarrotExpressionWithHttpInfo(String orgId, EvaluateExpressionRequest evaluateExpressionRequest) throws ApiException {
        okhttp3.Call localVarCall = evaluateCarrotExpressionValidateBeforeCall(orgId, evaluateExpressionRequest, null);
        Type localVarReturnType = new TypeToken<EvaluateExpressionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call evaluateCarrotExpressionAsync(String orgId, EvaluateExpressionRequest evaluateExpressionRequest, final ApiCallback<EvaluateExpressionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = evaluateCarrotExpressionValidateBeforeCall(orgId, evaluateExpressionRequest, _callback);
        Type localVarReturnType = new TypeToken<EvaluateExpressionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class EvaluateCarrotExpressionRequestBuilder {
        private final String expr;
        private final String entityType;
        private final String entityId;
        private final String orgId;

        private EvaluateCarrotExpressionRequestBuilder(String expr, String entityType, String entityId, String orgId) {
            this.expr = expr;
            this.entityType = entityType;
            this.entityId = entityId;
            this.orgId = orgId;
        }

        /**
         * Build call for evaluateCarrotExpression
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            EvaluateExpressionRequest evaluateExpressionRequest = buildBodyParams();
            return evaluateCarrotExpressionCall(orgId, evaluateExpressionRequest, _callback);
        }

        private EvaluateExpressionRequest buildBodyParams() {
            EvaluateExpressionRequest evaluateExpressionRequest = new EvaluateExpressionRequest();
            evaluateExpressionRequest.expr(this.expr);
            if (this.entityType != null)
            evaluateExpressionRequest.entityType(EvaluateExpressionRequest.EntityTypeEnum.fromValue(this.entityType));
            evaluateExpressionRequest.entityId(this.entityId);
            return evaluateExpressionRequest;
        }

        /**
         * Execute evaluateCarrotExpression request
         * @return EvaluateExpressionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
         </table>
         */
        public EvaluateExpressionResponse execute() throws ApiException {
            EvaluateExpressionRequest evaluateExpressionRequest = buildBodyParams();
            ApiResponse<EvaluateExpressionResponse> localVarResp = evaluateCarrotExpressionWithHttpInfo(orgId, evaluateExpressionRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute evaluateCarrotExpression request with HTTP info returned
         * @return ApiResponse&lt;EvaluateExpressionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EvaluateExpressionResponse> executeWithHttpInfo() throws ApiException {
            EvaluateExpressionRequest evaluateExpressionRequest = buildBodyParams();
            return evaluateCarrotExpressionWithHttpInfo(orgId, evaluateExpressionRequest);
        }

        /**
         * Execute evaluateCarrotExpression request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EvaluateExpressionResponse> _callback) throws ApiException {
            EvaluateExpressionRequest evaluateExpressionRequest = buildBodyParams();
            return evaluateCarrotExpressionAsync(orgId, evaluateExpressionRequest, _callback);
        }
    }

    /**
     * Evaluate carrot expression
     * 
     * @param orgId Org identifier (either id or slug) (required)
     * @return EvaluateCarrotExpressionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
     </table>
     */
    public EvaluateCarrotExpressionRequestBuilder evaluateCarrotExpression(String expr, String entityType, String entityId, String orgId) throws IllegalArgumentException {
        if (expr == null) throw new IllegalArgumentException("\"expr\" is required but got null");
            

        if (entityType == null) throw new IllegalArgumentException("\"entityType\" is required but got null");
            

        if (entityId == null) throw new IllegalArgumentException("\"entityId\" is required but got null");
            

        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new EvaluateCarrotExpressionRequestBuilder(expr, entityType, entityId, orgId);
    }
    private okhttp3.Call validateCarrotExpressionCall(String orgId, ValidateExpressionRequest validateExpressionRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = validateExpressionRequest;

        // create path and map variables
        String localVarPath = "/v1/org/{orgId}/cql/validate"
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
    private okhttp3.Call validateCarrotExpressionValidateBeforeCall(String orgId, ValidateExpressionRequest validateExpressionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling validateCarrotExpression(Async)");
        }

        return validateCarrotExpressionCall(orgId, validateExpressionRequest, _callback);

    }


    private ApiResponse<ValidateExpressionResponse> validateCarrotExpressionWithHttpInfo(String orgId, ValidateExpressionRequest validateExpressionRequest) throws ApiException {
        okhttp3.Call localVarCall = validateCarrotExpressionValidateBeforeCall(orgId, validateExpressionRequest, null);
        Type localVarReturnType = new TypeToken<ValidateExpressionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call validateCarrotExpressionAsync(String orgId, ValidateExpressionRequest validateExpressionRequest, final ApiCallback<ValidateExpressionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateCarrotExpressionValidateBeforeCall(orgId, validateExpressionRequest, _callback);
        Type localVarReturnType = new TypeToken<ValidateExpressionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ValidateCarrotExpressionRequestBuilder {
        private final List<String> expressions;
        private final String orgId;

        private ValidateCarrotExpressionRequestBuilder(List<String> expressions, String orgId) {
            this.expressions = expressions;
            this.orgId = orgId;
        }

        /**
         * Build call for validateCarrotExpression
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ValidateExpressionRequest validateExpressionRequest = buildBodyParams();
            return validateCarrotExpressionCall(orgId, validateExpressionRequest, _callback);
        }

        private ValidateExpressionRequest buildBodyParams() {
            ValidateExpressionRequest validateExpressionRequest = new ValidateExpressionRequest();
            validateExpressionRequest.expressions(this.expressions);
            return validateExpressionRequest;
        }

        /**
         * Execute validateCarrotExpression request
         * @return ValidateExpressionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
         </table>
         */
        public ValidateExpressionResponse execute() throws ApiException {
            ValidateExpressionRequest validateExpressionRequest = buildBodyParams();
            ApiResponse<ValidateExpressionResponse> localVarResp = validateCarrotExpressionWithHttpInfo(orgId, validateExpressionRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute validateCarrotExpression request with HTTP info returned
         * @return ApiResponse&lt;ValidateExpressionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ValidateExpressionResponse> executeWithHttpInfo() throws ApiException {
            ValidateExpressionRequest validateExpressionRequest = buildBodyParams();
            return validateCarrotExpressionWithHttpInfo(orgId, validateExpressionRequest);
        }

        /**
         * Execute validateCarrotExpression request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ValidateExpressionResponse> _callback) throws ApiException {
            ValidateExpressionRequest validateExpressionRequest = buildBodyParams();
            return validateCarrotExpressionAsync(orgId, validateExpressionRequest, _callback);
        }
    }

    /**
     * Validate carrot expression(s)
     * 
     * @param orgId Org identifier (either id or slug) (required)
     * @return ValidateCarrotExpressionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> not authorized </td><td>  -  </td></tr>
     </table>
     */
    public ValidateCarrotExpressionRequestBuilder validateCarrotExpression(List<String> expressions, String orgId) throws IllegalArgumentException {
        if (expressions == null) throw new IllegalArgumentException("\"expressions\" is required but got null");
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new ValidateCarrotExpressionRequestBuilder(expressions, orgId);
    }
}
