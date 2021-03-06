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
 * The class for the Planner Task Collection Request.
 */
public class PlannerTaskCollectionRequest extends BaseCollectionRequest<PlannerTaskCollectionResponse, IPlannerTaskCollectionPage> implements IPlannerTaskCollectionRequest {

    /**
     * The request builder for this collection of PlannerTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerTaskCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerTaskCollectionResponse.class, IPlannerTaskCollectionPage.class);
    }

    public void get(final ICallback<IPlannerTaskCollectionPage> callback) {
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

    public IPlannerTaskCollectionPage get() throws ClientException {
        final PlannerTaskCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PlannerTask newPlannerTask, final ICallback<PlannerTask> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PlannerTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerTask, callback);
    }

    public PlannerTask post(final PlannerTask newPlannerTask) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PlannerTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerTask);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPlannerTaskCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (PlannerTaskCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPlannerTaskCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (PlannerTaskCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPlannerTaskCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (PlannerTaskCollectionRequest)this;
    }

    public IPlannerTaskCollectionPage buildFromResponse(final PlannerTaskCollectionResponse response) {
        final IPlannerTaskCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PlannerTaskCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PlannerTaskCollectionPage page = new PlannerTaskCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
