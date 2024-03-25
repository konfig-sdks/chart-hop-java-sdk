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


import java.time.LocalDate;
import com.konfigthis.client.model.SearchResultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call orgDataByOrgIdAndSearchStringCall(String orgId, String q, String entityTypes, Integer limit, Boolean includeFormer, LocalDate date, String scenarioId, String canAccess, Boolean includeExternalRecruiter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/org/{orgId}/search"
            .replace("{" + "orgId" + "}", localVarApiClient.escapeString(orgId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        if (entityTypes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("entityTypes", entityTypes));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (includeFormer != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeFormer", includeFormer));
        }

        if (date != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date", date));
        }

        if (scenarioId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scenarioId", scenarioId));
        }

        if (canAccess != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("canAccess", canAccess));
        }

        if (includeExternalRecruiter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeExternalRecruiter", includeExternalRecruiter));
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
    private okhttp3.Call orgDataByOrgIdAndSearchStringValidateBeforeCall(String orgId, String q, String entityTypes, Integer limit, Boolean includeFormer, LocalDate date, String scenarioId, String canAccess, Boolean includeExternalRecruiter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling orgDataByOrgIdAndSearchString(Async)");
        }

        return orgDataByOrgIdAndSearchStringCall(orgId, q, entityTypes, limit, includeFormer, date, scenarioId, canAccess, includeExternalRecruiter, _callback);

    }


    private ApiResponse<SearchResultResponse> orgDataByOrgIdAndSearchStringWithHttpInfo(String orgId, String q, String entityTypes, Integer limit, Boolean includeFormer, LocalDate date, String scenarioId, String canAccess, Boolean includeExternalRecruiter) throws ApiException {
        okhttp3.Call localVarCall = orgDataByOrgIdAndSearchStringValidateBeforeCall(orgId, q, entityTypes, limit, includeFormer, date, scenarioId, canAccess, includeExternalRecruiter, null);
        Type localVarReturnType = new TypeToken<SearchResultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call orgDataByOrgIdAndSearchStringAsync(String orgId, String q, String entityTypes, Integer limit, Boolean includeFormer, LocalDate date, String scenarioId, String canAccess, Boolean includeExternalRecruiter, final ApiCallback<SearchResultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = orgDataByOrgIdAndSearchStringValidateBeforeCall(orgId, q, entityTypes, limit, includeFormer, date, scenarioId, canAccess, includeExternalRecruiter, _callback);
        Type localVarReturnType = new TypeToken<SearchResultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class OrgDataByOrgIdAndSearchStringRequestBuilder {
        private final String orgId;
        private String q;
        private String entityTypes;
        private Integer limit;
        private Boolean includeFormer;
        private LocalDate date;
        private String scenarioId;
        private String canAccess;
        private Boolean includeExternalRecruiter;

        private OrgDataByOrgIdAndSearchStringRequestBuilder(String orgId) {
            this.orgId = orgId;
        }

        /**
         * Set q
         * @param q Query search term (optional)
         * @return OrgDataByOrgIdAndSearchStringRequestBuilder
         */
        public OrgDataByOrgIdAndSearchStringRequestBuilder q(String q) {
            this.q = q;
            return this;
        }
        
        /**
         * Set entityTypes
         * @param entityTypes Entity types (optional)
         * @return OrgDataByOrgIdAndSearchStringRequestBuilder
         */
        public OrgDataByOrgIdAndSearchStringRequestBuilder entityTypes(String entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Limit (optional)
         * @return OrgDataByOrgIdAndSearchStringRequestBuilder
         */
        public OrgDataByOrgIdAndSearchStringRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set includeFormer
         * @param includeFormer Include former users or persons (optional)
         * @return OrgDataByOrgIdAndSearchStringRequestBuilder
         */
        public OrgDataByOrgIdAndSearchStringRequestBuilder includeFormer(Boolean includeFormer) {
            this.includeFormer = includeFormer;
            return this;
        }
        
        /**
         * Set date
         * @param date Date (optional)
         * @return OrgDataByOrgIdAndSearchStringRequestBuilder
         */
        public OrgDataByOrgIdAndSearchStringRequestBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }
        
        /**
         * Set scenarioId
         * @param scenarioId Scenario Id (optional)
         * @return OrgDataByOrgIdAndSearchStringRequestBuilder
         */
        public OrgDataByOrgIdAndSearchStringRequestBuilder scenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        
        /**
         * Set canAccess
         * @param canAccess entity action pairs that can be accessed (optional)
         * @return OrgDataByOrgIdAndSearchStringRequestBuilder
         */
        public OrgDataByOrgIdAndSearchStringRequestBuilder canAccess(String canAccess) {
            this.canAccess = canAccess;
            return this;
        }
        
        /**
         * Set includeExternalRecruiter
         * @param includeExternalRecruiter Include External Recruiter (optional)
         * @return OrgDataByOrgIdAndSearchStringRequestBuilder
         */
        public OrgDataByOrgIdAndSearchStringRequestBuilder includeExternalRecruiter(Boolean includeExternalRecruiter) {
            this.includeExternalRecruiter = includeExternalRecruiter;
            return this;
        }
        
        /**
         * Build call for orgDataByOrgIdAndSearchString
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
            return orgDataByOrgIdAndSearchStringCall(orgId, q, entityTypes, limit, includeFormer, date, scenarioId, canAccess, includeExternalRecruiter, _callback);
        }


        /**
         * Execute orgDataByOrgIdAndSearchString request
         * @return SearchResultResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public SearchResultResponse execute() throws ApiException {
            ApiResponse<SearchResultResponse> localVarResp = orgDataByOrgIdAndSearchStringWithHttpInfo(orgId, q, entityTypes, limit, includeFormer, date, scenarioId, canAccess, includeExternalRecruiter);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute orgDataByOrgIdAndSearchString request with HTTP info returned
         * @return ApiResponse&lt;SearchResultResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SearchResultResponse> executeWithHttpInfo() throws ApiException {
            return orgDataByOrgIdAndSearchStringWithHttpInfo(orgId, q, entityTypes, limit, includeFormer, date, scenarioId, canAccess, includeExternalRecruiter);
        }

        /**
         * Execute orgDataByOrgIdAndSearchString request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<SearchResultResponse> _callback) throws ApiException {
            return orgDataByOrgIdAndSearchStringAsync(orgId, q, entityTypes, limit, includeFormer, date, scenarioId, canAccess, includeExternalRecruiter, _callback);
        }
    }

    /**
     * Return people, job, group, and field data for a particular org that match a provided search string
     * 
     * @param orgId Org identifier (either id or slug) (required)
     * @return OrgDataByOrgIdAndSearchStringRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public OrgDataByOrgIdAndSearchStringRequestBuilder orgDataByOrgIdAndSearchString(String orgId) throws IllegalArgumentException {
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new OrgDataByOrgIdAndSearchStringRequestBuilder(orgId);
    }
}
