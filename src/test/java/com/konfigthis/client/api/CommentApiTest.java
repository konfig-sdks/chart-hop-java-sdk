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
import com.konfigthis.client.model.Comment;
import com.konfigthis.client.model.CreateComment;
import com.konfigthis.client.model.Markup;
import com.konfigthis.client.model.ResultsComment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentApi
 */
@Disabled
public class CommentApiTest {

    private static CommentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CommentApi(apiClient);
    }

    /**
     * Post a comment
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewCommentTest() throws ApiException {
        String entityId = null;
        String entityType = null;
        Markup content = null;
        String orgId = null;
        String parentEntityId = null;
        Comment response = api.createNewComment(entityId, entityType, content, orgId)
                .parentEntityId(parentEntityId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return comments on a particular entity paginated
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByEntityIdTest() throws ApiException {
        String orgId = null;
        String entityId = null;
        String from = null;
        Integer limit = null;
        Boolean desc = null;
        ResultsComment response = api.getByEntityId(orgId, entityId)
                .from(from)
                .limit(limit)
                .desc(desc)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular comment by id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String orgId = null;
        String commentId = null;
        Comment response = api.getById(orgId, commentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return comments on changes within a comp review, paginated
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCommentsOnCompReviewTest() throws ApiException {
        String orgId = null;
        String compReviewId = null;
        String approvalRequestId = null;
        String from = null;
        Integer limit = null;
        Boolean desc = null;
        Boolean isPreview = null;
        String jobId = null;
        ResultsComment response = api.listCommentsOnCompReview(orgId, compReviewId)
                .approvalRequestId(approvalRequestId)
                .from(from)
                .limit(limit)
                .desc(desc)
                .isPreview(isPreview)
                .jobId(jobId)
                .execute();
        // TODO: test validations
    }

    /**
     * Return comments on a scenario and the changes within, paginated
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCommentsOnScenarioAndChangesTest() throws ApiException {
        String orgId = null;
        String scenarioId = null;
        String from = null;
        Integer limit = null;
        Boolean desc = null;
        Boolean includeChangeComments = null;
        ResultsComment response = api.listCommentsOnScenarioAndChanges(orgId, scenarioId)
                .from(from)
                .limit(limit)
                .desc(desc)
                .includeChangeComments(includeChangeComments)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a comment
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String orgId = null;
        String commentId = null;
        api.removeById(orgId, commentId)
                .execute();
        // TODO: test validations
    }

}