// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Schema Extension Request.
 */
public class BaseSchemaExtensionRequest extends BaseRequest implements IBaseSchemaExtensionRequest {

    /**
     * The request for the SchemaExtension
     *
     * @param requestUrl The request URL
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the response
     */
    public BaseSchemaExtensionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<SchemaExtension> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the SchemaExtension from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<SchemaExtension> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SchemaExtension from the service
     * @return The SchemaExtension from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public SchemaExtension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this SchemaExtension with a source
     * @param sourceSchemaExtension The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final SchemaExtension sourceSchemaExtension, final ICallback<SchemaExtension> callback) {
        send(HttpMethod.PATCH, callback, sourceSchemaExtension);
    }

    /**
     * Patches this SchemaExtension with a source
     * @param sourceSchemaExtension The source object with updates
     * @return The updated SchemaExtension
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public SchemaExtension patch(final SchemaExtension sourceSchemaExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourceSchemaExtension);
    }

    /**
     * Creates a SchemaExtension with a new object
     * @param newSchemaExtension The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final SchemaExtension newSchemaExtension, final ICallback<SchemaExtension> callback) {
        send(HttpMethod.POST, callback, newSchemaExtension);
    }

    /**
     * Creates a SchemaExtension with a new object
     * @param newSchemaExtension The new object to create
     * @return The created SchemaExtension
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public SchemaExtension post(final SchemaExtension newSchemaExtension) throws ClientException {
        return send(HttpMethod.POST, newSchemaExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public ISchemaExtensionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (SchemaExtensionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public ISchemaExtensionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (SchemaExtensionRequest)this;
     }

}

