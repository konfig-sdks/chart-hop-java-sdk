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
import com.konfigthis.client.model.Action;
import com.konfigthis.client.model.ActionRunRequest;
import com.konfigthis.client.model.CreateAction;
import com.konfigthis.client.model.CreateActionBody;
import com.konfigthis.client.model.PartialTaskConfig;
import com.konfigthis.client.model.PatchActionBody;
import com.konfigthis.client.model.ResultsAction;
import com.konfigthis.client.model.UpdateAction;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActionApi
 */
@Disabled
public class ActionApiTest {

    private static ActionApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ActionApi(apiClient);
    }

    /**
     * Create an action
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewActionTest() throws ApiException {
        CreateAction action = null;
        String orgId = null;
        List<PartialTaskConfig> stepTaskConfigs = null;
        Action response = api.createNewAction(action, orgId)
                .stepTaskConfigs(stepTaskConfigs)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an action
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteActionByIdTest() throws ApiException {
        String orgId = null;
        String actionId = null;
        api.deleteActionById(orgId, actionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Run an action - for testing
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeActionForTestingTest() throws ApiException {
        String jobId = null;
        String eventCode = null;
        String orgId = null;
        String actionId = null;
        api.executeActionForTesting(jobId, eventCode, orgId, actionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular action by id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActionByIdTest() throws ApiException {
        String orgId = null;
        String actionId = null;
        Action response = api.getActionById(orgId, actionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all actions in the organization paginated
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllPaginatedTest() throws ApiException {
        String orgId = null;
        String from = null;
        Integer limit = null;
        ResultsAction response = api.getAllPaginated(orgId)
                .from(from)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing action
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExistingActionByIdTest() throws ApiException {
        UpdateAction action = null;
        String orgId = null;
        String actionId = null;
        List<PartialTaskConfig> stepTaskConfigs = null;
        api.updateExistingActionById(action, orgId, actionId)
                .stepTaskConfigs(stepTaskConfigs)
                .execute();
        // TODO: test validations
    }

}
