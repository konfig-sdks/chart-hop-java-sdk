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
import com.konfigthis.client.model.CreatePolicy;
import com.konfigthis.client.model.EntityAction;
import com.konfigthis.client.model.PartialPolicy;
import com.konfigthis.client.model.Policy;
import com.konfigthis.client.model.PolicyRule;
import com.konfigthis.client.model.ResultsPolicy;
import com.konfigthis.client.model.UpdatePolicy;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PolicyApi
 */
@Disabled
public class PolicyApiTest {

    private static PolicyApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PolicyApi(apiClient);
    }

    /**
     * Return if a policy is valid
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkValidityOfTest() throws ApiException {
        String orgId = null;
        String description = null;
        String id = null;
        String orgId = null;
        String label = null;
        List<PolicyRule> rules = null;
        String copiedFromId = null;
        String createId = null;
        String createAt = null;
        String updateId = null;
        String updateAt = null;
        String deleteId = null;
        String deleteAt = null;
        api.checkValidityOf(orgId)
                .description(description)
                .id(id)
                .orgId(orgId)
                .label(label)
                .rules(rules)
                .copiedFromId(copiedFromId)
                .createId(createId)
                .createAt(createAt)
                .updateId(updateId)
                .updateAt(updateAt)
                .deleteId(deleteId)
                .deleteAt(deleteAt)
                .execute();
        // TODO: test validations
    }

    /**
     * Copy an existing policy
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void copyExistingPolicyTest() throws ApiException {
        String orgId = null;
        String policyId = null;
        Policy response = api.copyExistingPolicy(orgId, policyId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a policy
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewPolicyTest() throws ApiException {
        String label = null;
        String orgId = null;
        String description = null;
        String orgId = null;
        List<PolicyRule> rules = null;
        String copiedFromId = null;
        Policy response = api.createNewPolicy(label, orgId)
                .description(description)
                .orgId(orgId)
                .rules(rules)
                .copiedFromId(copiedFromId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all entity:action maps allowed on a policy rule
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllEntityActionMapsTest() throws ApiException {
        String orgId = null;
        EntityAction response = api.getAllEntityActionMaps(orgId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all or a set of policies in the organization
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllPoliciesTest() throws ApiException {
        String orgId = null;
        String ids = null;
        String type = null;
        ResultsPolicy response = api.getAllPolicies(orgId)
                .ids(ids)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular policy by id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String orgId = null;
        String policyId = null;
        Policy response = api.getById(orgId, policyId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a policy
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String orgId = null;
        String policyId = null;
        api.removeById(orgId, policyId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing policy
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExistingPolicyTest() throws ApiException {
        String orgId = null;
        String policyId = null;
        String description = null;
        String label = null;
        List<PolicyRule> rules = null;
        api.updateExistingPolicy(orgId, policyId)
                .description(description)
                .label(label)
                .rules(rules)
                .execute();
        // TODO: test validations
    }

}