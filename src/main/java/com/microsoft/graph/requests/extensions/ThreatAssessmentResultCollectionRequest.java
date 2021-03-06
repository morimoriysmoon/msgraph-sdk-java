// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Result Collection Request.
 */
public class ThreatAssessmentResultCollectionRequest extends BaseCollectionRequest<ThreatAssessmentResultCollectionResponse, IThreatAssessmentResultCollectionPage> implements IThreatAssessmentResultCollectionRequest {

    /**
     * The request builder for this collection of ThreatAssessmentResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentResultCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThreatAssessmentResultCollectionResponse.class, IThreatAssessmentResultCollectionPage.class);
    }

    public void get(final ICallback<IThreatAssessmentResultCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IThreatAssessmentResultCollectionPage get() throws ClientException {
        final ThreatAssessmentResultCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ThreatAssessmentResult newThreatAssessmentResult, final ICallback<ThreatAssessmentResult> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ThreatAssessmentResultRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newThreatAssessmentResult, callback);
    }

    public ThreatAssessmentResult post(final ThreatAssessmentResult newThreatAssessmentResult) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ThreatAssessmentResultRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newThreatAssessmentResult);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ThreatAssessmentResultCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ThreatAssessmentResultCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ThreatAssessmentResultCollectionRequest)this;
    }

    public IThreatAssessmentResultCollectionPage buildFromResponse(final ThreatAssessmentResultCollectionResponse response) {
        final IThreatAssessmentResultCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ThreatAssessmentResultCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ThreatAssessmentResultCollectionPage page = new ThreatAssessmentResultCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
