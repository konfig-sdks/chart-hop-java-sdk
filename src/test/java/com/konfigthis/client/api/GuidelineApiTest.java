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
import com.konfigthis.client.model.BasisFieldMatrix;
import com.konfigthis.client.model.CreateGuideline;
import com.konfigthis.client.model.Guideline;
import com.konfigthis.client.model.MoneyRange;
import com.konfigthis.client.model.ResultsGuideline;
import com.konfigthis.client.model.ResultsGuidelineCalculation;
import com.konfigthis.client.model.UpdateGuideline;
import com.konfigthis.client.model.ValueRange;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GuidelineApi
 */
@Disabled
public class GuidelineApiTest {

    private static GuidelineApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GuidelineApi(apiClient);
    }

    /**
     * Get all guidelines for a given comp review
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void allForCompReviewTest() throws ApiException {
        String orgId = null;
        String compReviewId = null;
        Boolean includeDeleted = null;
        ResultsGuideline response = api.allForCompReview(orgId)
                .compReviewId(compReviewId)
                .includeDeleted(includeDeleted)
                .execute();
        // TODO: test validations
    }

    /**
     * Calculate the matrix values for a specific guideline (which may apply to multiple scenarios in the comp review)
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void calculateMatrixValuesForSpecificGuidelineTest() throws ApiException {
        String orgId = null;
        String id = null;
        ResultsGuidelineCalculation response = api.calculateMatrixValuesForSpecificGuideline(orgId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a new guideline
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewGuidelineTest() throws ApiException {
        String compReviewId = null;
        String label = null;
        String appliedField = null;
        String sourceField = null;
        String calculationType = null;
        String flagMode = null;
        Boolean enablePopulateValue = null;
        String basisType = null;
        String orgId = null;
        String budgetPoolId = null;
        String participantsExpr = null;
        Double flagDeviationThreshold = null;
        String basisExpr = null;
        BasisFieldMatrix basisFieldMatrix = null;
        MoneyRange fixedAmountRange = null;
        ValueRange fixedValueRange = null;
        api.createNewGuideline(compReviewId, label, appliedField, sourceField, calculationType, flagMode, enablePopulateValue, basisType, orgId)
                .budgetPoolId(budgetPoolId)
                .participantsExpr(participantsExpr)
                .flagDeviationThreshold(flagDeviationThreshold)
                .basisExpr(basisExpr)
                .basisFieldMatrix(basisFieldMatrix)
                .fixedAmountRange(fixedAmountRange)
                .fixedValueRange(fixedValueRange)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific guideline
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificGuidelineTest() throws ApiException {
        String orgId = null;
        String id = null;
        Guideline response = api.getSpecificGuideline(orgId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a guideline
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String orgId = null;
        String id = null;
        api.removeById(orgId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a guideline
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGuidelineTest() throws ApiException {
        String orgId = null;
        String id = null;
        String label = null;
        String budgetPoolId = null;
        String participantsExpr = null;
        String appliedField = null;
        String sourceField = null;
        String calculationType = null;
        String flagMode = null;
        Double flagDeviationThreshold = null;
        Boolean enablePopulateValue = null;
        String basisType = null;
        String basisExpr = null;
        BasisFieldMatrix basisFieldMatrix = null;
        MoneyRange fixedAmountRange = null;
        ValueRange fixedValueRange = null;
        api.updateGuideline(orgId, id)
                .label(label)
                .budgetPoolId(budgetPoolId)
                .participantsExpr(participantsExpr)
                .appliedField(appliedField)
                .sourceField(sourceField)
                .calculationType(calculationType)
                .flagMode(flagMode)
                .flagDeviationThreshold(flagDeviationThreshold)
                .enablePopulateValue(enablePopulateValue)
                .basisType(basisType)
                .basisExpr(basisExpr)
                .basisFieldMatrix(basisFieldMatrix)
                .fixedAmountRange(fixedAmountRange)
                .fixedValueRange(fixedValueRange)
                .execute();
        // TODO: test validations
    }

}
