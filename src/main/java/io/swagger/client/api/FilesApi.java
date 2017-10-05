/*
 * directus.io
 * API for directus.io
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.directus.client.ApiCallback;
import io.directus.client.ApiClient;
import io.directus.client.ApiException;
import io.directus.client.ApiResponse;
import io.directus.client.Configuration;
import io.directus.client.Pair;
import io.directus.client.ProgressRequestBody;
import io.directus.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.directus.client.model.GetFile;
import io.directus.client.model.GetFiles;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesApi {
    private ApiClient apiClient;

    public FilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createFile
     * @param data The file&#39;s Base64 content (optional)
     * @param active The file&#39;s status, default options are: 1 (active), 2 (inactive), 0 (deleted) (optional)
     * @param name The name used in the filesystem, including the extension, eg: \&quot;my-file.jpg\&quot;. This is generated by the system based on Global Settings (optional)
     * @param title The file&#39;s title (optional)
     * @param location Location of where the picture was taken, if any. Pulled from the IPTC location when available (optional)
     * @param type The file&#39;s mime type (optional)
     * @param tags A CSV of tags for this file. Pulled from the IPTC keywords when available (optional)
     * @param caption The file&#39;s caption or description. Pulled from the IPTC description when available (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFileCall(String data, Integer active, String name, String title, String location, String type, String tags, String caption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (data != null)
        localVarFormParams.put("data", data);
        if (active != null)
        localVarFormParams.put("active", active);
        if (name != null)
        localVarFormParams.put("name", name);
        if (title != null)
        localVarFormParams.put("title", title);
        if (location != null)
        localVarFormParams.put("location", location);
        if (type != null)
        localVarFormParams.put("type", type);
        if (tags != null)
        localVarFormParams.put("tags", tags);
        if (caption != null)
        localVarFormParams.put("caption", caption);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createFileValidateBeforeCall(String data, Integer active, String name, String title, String location, String type, String tags, String caption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = createFileCall(data, active, name, title, location, type, tags, caption, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates file
     * 
     * @param data The file&#39;s Base64 content (optional)
     * @param active The file&#39;s status, default options are: 1 (active), 2 (inactive), 0 (deleted) (optional)
     * @param name The name used in the filesystem, including the extension, eg: \&quot;my-file.jpg\&quot;. This is generated by the system based on Global Settings (optional)
     * @param title The file&#39;s title (optional)
     * @param location Location of where the picture was taken, if any. Pulled from the IPTC location when available (optional)
     * @param type The file&#39;s mime type (optional)
     * @param tags A CSV of tags for this file. Pulled from the IPTC keywords when available (optional)
     * @param caption The file&#39;s caption or description. Pulled from the IPTC description when available (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createFile(String data, Integer active, String name, String title, String location, String type, String tags, String caption) throws ApiException {
        createFileWithHttpInfo(data, active, name, title, location, type, tags, caption);
    }

    /**
     * Creates file
     * 
     * @param data The file&#39;s Base64 content (optional)
     * @param active The file&#39;s status, default options are: 1 (active), 2 (inactive), 0 (deleted) (optional)
     * @param name The name used in the filesystem, including the extension, eg: \&quot;my-file.jpg\&quot;. This is generated by the system based on Global Settings (optional)
     * @param title The file&#39;s title (optional)
     * @param location Location of where the picture was taken, if any. Pulled from the IPTC location when available (optional)
     * @param type The file&#39;s mime type (optional)
     * @param tags A CSV of tags for this file. Pulled from the IPTC keywords when available (optional)
     * @param caption The file&#39;s caption or description. Pulled from the IPTC description when available (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createFileWithHttpInfo(String data, Integer active, String name, String title, String location, String type, String tags, String caption) throws ApiException {
        com.squareup.okhttp.Call call = createFileValidateBeforeCall(data, active, name, title, location, type, tags, caption, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates file (asynchronously)
     * 
     * @param data The file&#39;s Base64 content (optional)
     * @param active The file&#39;s status, default options are: 1 (active), 2 (inactive), 0 (deleted) (optional)
     * @param name The name used in the filesystem, including the extension, eg: \&quot;my-file.jpg\&quot;. This is generated by the system based on Global Settings (optional)
     * @param title The file&#39;s title (optional)
     * @param location Location of where the picture was taken, if any. Pulled from the IPTC location when available (optional)
     * @param type The file&#39;s mime type (optional)
     * @param tags A CSV of tags for this file. Pulled from the IPTC keywords when available (optional)
     * @param caption The file&#39;s caption or description. Pulled from the IPTC description when available (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFileAsync(String data, Integer active, String name, String title, String location, String type, String tags, String caption, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createFileValidateBeforeCall(data, active, name, title, location, type, tags, caption, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getFile
     * @param fileId ID of file to get (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFileCall(Integer fileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/files/{fileId}"
            .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFileValidateBeforeCall(Integer fileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getFile(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getFileCall(fileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns specific file by id
     * 
     * @param fileId ID of file to get (required)
     * @return GetFile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFile getFile(Integer fileId) throws ApiException {
        ApiResponse<GetFile> resp = getFileWithHttpInfo(fileId);
        return resp.getData();
    }

    /**
     * Returns specific file by id
     * 
     * @param fileId ID of file to get (required)
     * @return ApiResponse&lt;GetFile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFile> getFileWithHttpInfo(Integer fileId) throws ApiException {
        com.squareup.okhttp.Call call = getFileValidateBeforeCall(fileId, null, null);
        Type localVarReturnType = new TypeToken<GetFile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns specific file by id (asynchronously)
     * 
     * @param fileId ID of file to get (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFileAsync(Integer fileId, final ApiCallback<GetFile> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFileValidateBeforeCall(fileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFiles
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFilesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getFilesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns files
     * 
     * @return GetFiles
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFiles getFiles() throws ApiException {
        ApiResponse<GetFiles> resp = getFilesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns files
     * 
     * @return ApiResponse&lt;GetFiles&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFiles> getFilesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getFilesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GetFiles>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns files (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilesAsync(final ApiCallback<GetFiles> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFilesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFiles>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateFile
     * @param fileId ID of file to get (required)
     * @param data The file&#39;s Base64 content (optional)
     * @param active The file&#39;s status, default options are: 1 (active), 2 (inactive), 0 (deleted) (optional)
     * @param name The name used in the filesystem, including the extension, eg: \&quot;my-file.jpg\&quot;. This is generated by the system based on Global Settings (optional)
     * @param title The file&#39;s title (optional)
     * @param location Location of where the picture was taken, if any. Pulled from the IPTC location when available (optional)
     * @param type The file&#39;s mime type (optional)
     * @param tags A CSV of tags for this file. Pulled from the IPTC keywords when available (optional)
     * @param caption The file&#39;s caption or description. Pulled from the IPTC description when available (optional)
     * @param url File url relativity to Directus base url (optional)
     * @param width File width (optional)
     * @param height File height (optional)
     * @param size File size in bytes (optional)
     * @param embedId ID of the embedded file. Ex Youtube ID (optional)
     * @param user File owner (who uploaded the file) (optional)
     * @param dateUploaded File uploaded date. TODO It should be an DateTime object (optional)
     * @param storageAdapter Storage adapter used to upload the file (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFileCall(Integer fileId, String data, Integer active, String name, String title, String location, String type, String tags, String caption, String url, Integer width, Integer height, Integer size, String embedId, Integer user, String dateUploaded, String storageAdapter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/files/{fileId}"
            .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (data != null)
        localVarFormParams.put("data", data);
        if (active != null)
        localVarFormParams.put("active", active);
        if (name != null)
        localVarFormParams.put("name", name);
        if (title != null)
        localVarFormParams.put("title", title);
        if (location != null)
        localVarFormParams.put("location", location);
        if (type != null)
        localVarFormParams.put("type", type);
        if (tags != null)
        localVarFormParams.put("tags", tags);
        if (caption != null)
        localVarFormParams.put("caption", caption);
        if (url != null)
        localVarFormParams.put("url", url);
        if (width != null)
        localVarFormParams.put("width", width);
        if (height != null)
        localVarFormParams.put("height", height);
        if (size != null)
        localVarFormParams.put("size", size);
        if (embedId != null)
        localVarFormParams.put("embed_id", embedId);
        if (user != null)
        localVarFormParams.put("user", user);
        if (dateUploaded != null)
        localVarFormParams.put("date_uploaded", dateUploaded);
        if (storageAdapter != null)
        localVarFormParams.put("storage_adapter", storageAdapter);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFileValidateBeforeCall(Integer fileId, String data, Integer active, String name, String title, String location, String type, String tags, String caption, String url, Integer width, Integer height, Integer size, String embedId, Integer user, String dateUploaded, String storageAdapter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling updateFile(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateFileCall(fileId, data, active, name, title, location, type, tags, caption, url, width, height, size, embedId, user, dateUploaded, storageAdapter, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates file
     * 
     * @param fileId ID of file to get (required)
     * @param data The file&#39;s Base64 content (optional)
     * @param active The file&#39;s status, default options are: 1 (active), 2 (inactive), 0 (deleted) (optional)
     * @param name The name used in the filesystem, including the extension, eg: \&quot;my-file.jpg\&quot;. This is generated by the system based on Global Settings (optional)
     * @param title The file&#39;s title (optional)
     * @param location Location of where the picture was taken, if any. Pulled from the IPTC location when available (optional)
     * @param type The file&#39;s mime type (optional)
     * @param tags A CSV of tags for this file. Pulled from the IPTC keywords when available (optional)
     * @param caption The file&#39;s caption or description. Pulled from the IPTC description when available (optional)
     * @param url File url relativity to Directus base url (optional)
     * @param width File width (optional)
     * @param height File height (optional)
     * @param size File size in bytes (optional)
     * @param embedId ID of the embedded file. Ex Youtube ID (optional)
     * @param user File owner (who uploaded the file) (optional)
     * @param dateUploaded File uploaded date. TODO It should be an DateTime object (optional)
     * @param storageAdapter Storage adapter used to upload the file (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateFile(Integer fileId, String data, Integer active, String name, String title, String location, String type, String tags, String caption, String url, Integer width, Integer height, Integer size, String embedId, Integer user, String dateUploaded, String storageAdapter) throws ApiException {
        updateFileWithHttpInfo(fileId, data, active, name, title, location, type, tags, caption, url, width, height, size, embedId, user, dateUploaded, storageAdapter);
    }

    /**
     * Creates file
     * 
     * @param fileId ID of file to get (required)
     * @param data The file&#39;s Base64 content (optional)
     * @param active The file&#39;s status, default options are: 1 (active), 2 (inactive), 0 (deleted) (optional)
     * @param name The name used in the filesystem, including the extension, eg: \&quot;my-file.jpg\&quot;. This is generated by the system based on Global Settings (optional)
     * @param title The file&#39;s title (optional)
     * @param location Location of where the picture was taken, if any. Pulled from the IPTC location when available (optional)
     * @param type The file&#39;s mime type (optional)
     * @param tags A CSV of tags for this file. Pulled from the IPTC keywords when available (optional)
     * @param caption The file&#39;s caption or description. Pulled from the IPTC description when available (optional)
     * @param url File url relativity to Directus base url (optional)
     * @param width File width (optional)
     * @param height File height (optional)
     * @param size File size in bytes (optional)
     * @param embedId ID of the embedded file. Ex Youtube ID (optional)
     * @param user File owner (who uploaded the file) (optional)
     * @param dateUploaded File uploaded date. TODO It should be an DateTime object (optional)
     * @param storageAdapter Storage adapter used to upload the file (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateFileWithHttpInfo(Integer fileId, String data, Integer active, String name, String title, String location, String type, String tags, String caption, String url, Integer width, Integer height, Integer size, String embedId, Integer user, String dateUploaded, String storageAdapter) throws ApiException {
        com.squareup.okhttp.Call call = updateFileValidateBeforeCall(fileId, data, active, name, title, location, type, tags, caption, url, width, height, size, embedId, user, dateUploaded, storageAdapter, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates file (asynchronously)
     * 
     * @param fileId ID of file to get (required)
     * @param data The file&#39;s Base64 content (optional)
     * @param active The file&#39;s status, default options are: 1 (active), 2 (inactive), 0 (deleted) (optional)
     * @param name The name used in the filesystem, including the extension, eg: \&quot;my-file.jpg\&quot;. This is generated by the system based on Global Settings (optional)
     * @param title The file&#39;s title (optional)
     * @param location Location of where the picture was taken, if any. Pulled from the IPTC location when available (optional)
     * @param type The file&#39;s mime type (optional)
     * @param tags A CSV of tags for this file. Pulled from the IPTC keywords when available (optional)
     * @param caption The file&#39;s caption or description. Pulled from the IPTC description when available (optional)
     * @param url File url relativity to Directus base url (optional)
     * @param width File width (optional)
     * @param height File height (optional)
     * @param size File size in bytes (optional)
     * @param embedId ID of the embedded file. Ex Youtube ID (optional)
     * @param user File owner (who uploaded the file) (optional)
     * @param dateUploaded File uploaded date. TODO It should be an DateTime object (optional)
     * @param storageAdapter Storage adapter used to upload the file (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateFileAsync(Integer fileId, String data, Integer active, String name, String title, String location, String type, String tags, String caption, String url, Integer width, Integer height, Integer size, String embedId, Integer user, String dateUploaded, String storageAdapter, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateFileValidateBeforeCall(fileId, data, active, name, title, location, type, tags, caption, url, width, height, size, embedId, user, dateUploaded, storageAdapter, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
