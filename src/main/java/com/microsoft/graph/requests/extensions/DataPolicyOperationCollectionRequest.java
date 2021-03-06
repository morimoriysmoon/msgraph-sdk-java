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
 * The class for the Data Policy Operation Collection Request.
 */
public class DataPolicyOperationCollectionRequest extends BaseCollectionRequest<DataPolicyOperationCollectionResponse, IDataPolicyOperationCollectionPage> implements IDataPolicyOperationCollectionRequest {

    /**
     * The request builder for this collection of DataPolicyOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataPolicyOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataPolicyOperationCollectionResponse.class, IDataPolicyOperationCollectionPage.class);
    }

    public void get(final ICallback<IDataPolicyOperationCollectionPage> callback) {
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

    public IDataPolicyOperationCollectionPage get() throws ClientException {
        final DataPolicyOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DataPolicyOperation newDataPolicyOperation, final ICallback<DataPolicyOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DataPolicyOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDataPolicyOperation, callback);
    }

    public DataPolicyOperation post(final DataPolicyOperation newDataPolicyOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DataPolicyOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDataPolicyOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDataPolicyOperationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DataPolicyOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDataPolicyOperationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DataPolicyOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDataPolicyOperationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DataPolicyOperationCollectionRequest)this;
    }

    public IDataPolicyOperationCollectionPage buildFromResponse(final DataPolicyOperationCollectionResponse response) {
        final IDataPolicyOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DataPolicyOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DataPolicyOperationCollectionPage page = new DataPolicyOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
