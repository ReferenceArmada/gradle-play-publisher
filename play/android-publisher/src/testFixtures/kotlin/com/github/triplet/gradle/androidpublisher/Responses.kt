package com.github.triplet.gradle.androidpublisher

import com.google.api.client.googleapis.testing.json.GoogleJsonResponseExceptionFactoryTesting
import com.google.api.client.json.jackson2.JacksonFactory

fun newImage(url: String, sha256: String) = GppImage(url, sha256)

fun newSuccessEditResponse(id: String) = EditResponse.Success(id)

fun newFailureEditResponse(reason: String) = EditResponse.Failure(
        GoogleJsonResponseExceptionFactoryTesting.newMock(
                JacksonFactory.getDefaultInstance(), 400, reason))

fun newUploadInternalSharingArtifactResponse(json: String, downloadUrl: String) =
        UploadInternalSharingArtifactResponse(json, downloadUrl)

fun newUpdateProductResponse(needsCreating: Boolean) = UpdateProductResponse(needsCreating)
