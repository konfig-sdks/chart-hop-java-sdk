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
import com.konfigthis.client.model.FormResponse;
import com.konfigthis.client.model.FormResponseCount;
import com.konfigthis.client.model.ShareAccess;
import com.konfigthis.client.model.UpdateFormResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FormResponseApi
 */
@Disabled
public class FormResponseApiTest {

    private static FormResponseApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FormResponseApi(apiClient);
    }

    /**
     * Return form responses by form
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByFormTest() throws ApiException {
        String orgId = null;
        String formId = null;
        String assessmentId = null;
        String submitPersonId = null;
        String targetId = null;
        String from = null;
        Integer limit = null;
        String returnAccess = null;
        String format = null;
        api.getByForm(orgId)
                .formId(formId)
                .assessmentId(assessmentId)
                .submitPersonId(submitPersonId)
                .targetId(targetId)
                .from(from)
                .limit(limit)
                .returnAccess(returnAccess)
                .format(format)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular form response by id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String orgId = null;
        String formResponseId = null;
        String format = null;
        FormResponse response = api.getById(orgId, formResponseId)
                .format(format)
                .execute();
        // TODO: test validations
    }

    /**
     * Return the total count of form responses by form
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFormResponseCountTest() throws ApiException {
        String orgId = null;
        String formId = null;
        String assessmentId = null;
        String submitPersonId = null;
        String targetId = null;
        String questionId = null;
        FormResponseCount response = api.getFormResponseCount(orgId)
                .formId(formId)
                .assessmentId(assessmentId)
                .submitPersonId(submitPersonId)
                .targetId(targetId)
                .questionId(questionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a form response
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String orgId = null;
        String formResponseId = null;
        api.removeById(orgId, formResponseId)
                .execute();
        // TODO: test validations
    }

    /**
     * Re-submit (update) an existing form response&#39;s answers
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAnswersMetadataTest() throws ApiException {
        String orgId = null;
        String formResponseId = null;
        api.updateAnswersMetadata(orgId, formResponseId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing form response&#39;s metadata, such as shareAccess information
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMetadataTest() throws ApiException {
        String orgId = null;
        String formResponseId = null;
        List<ShareAccess> shareAccess = null;
        api.updateMetadata(orgId, formResponseId)
                .shareAccess(shareAccess)
                .execute();
        // TODO: test validations
    }

}
