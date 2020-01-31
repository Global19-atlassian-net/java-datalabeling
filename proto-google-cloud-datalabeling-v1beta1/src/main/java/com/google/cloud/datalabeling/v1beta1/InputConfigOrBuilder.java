/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required for text import, as language code must be specified.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextMetadata text_metadata = 6;</code>
   *
   * @return Whether the textMetadata field is set.
   */
  boolean hasTextMetadata();
  /**
   *
   *
   * <pre>
   * Required for text import, as language code must be specified.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextMetadata text_metadata = 6;</code>
   *
   * @return The textMetadata.
   */
  com.google.cloud.datalabeling.v1beta1.TextMetadata getTextMetadata();
  /**
   *
   *
   * <pre>
   * Required for text import, as language code must be specified.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextMetadata text_metadata = 6;</code>
   */
  com.google.cloud.datalabeling.v1beta1.TextMetadataOrBuilder getTextMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Source located in Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsSource gcs_source = 2;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Source located in Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsSource gcs_source = 2;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.datalabeling.v1beta1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Source located in Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsSource gcs_source = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Source located in BigQuery. You must specify this field if you are using
   * this InputConfig in an [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob].
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BigQuerySource bigquery_source = 5;</code>
   *
   * @return Whether the bigquerySource field is set.
   */
  boolean hasBigquerySource();
  /**
   *
   *
   * <pre>
   * Source located in BigQuery. You must specify this field if you are using
   * this InputConfig in an [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob].
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BigQuerySource bigquery_source = 5;</code>
   *
   * @return The bigquerySource.
   */
  com.google.cloud.datalabeling.v1beta1.BigQuerySource getBigquerySource();
  /**
   *
   *
   * <pre>
   * Source located in BigQuery. You must specify this field if you are using
   * this InputConfig in an [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob].
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BigQuerySource bigquery_source = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.BigQuerySourceOrBuilder getBigquerySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Data type must be specifed when user tries to import data.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.DataType data_type = 1;</code>
   *
   * @return The enum numeric value on the wire for dataType.
   */
  int getDataTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Data type must be specifed when user tries to import data.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.DataType data_type = 1;</code>
   *
   * @return The dataType.
   */
  com.google.cloud.datalabeling.v1beta1.DataType getDataType();

  /**
   *
   *
   * <pre>
   * Optional. The type of annotation to be performed on this data. You must
   * specify this field if you are using this InputConfig in an
   * [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob].
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationType annotation_type = 3;</code>
   *
   * @return The enum numeric value on the wire for annotationType.
   */
  int getAnnotationTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The type of annotation to be performed on this data. You must
   * specify this field if you are using this InputConfig in an
   * [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob].
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationType annotation_type = 3;</code>
   *
   * @return The annotationType.
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationType getAnnotationType();

  /**
   *
   *
   * <pre>
   * Optional. Metadata about annotations for the input. You must specify this
   * field if you are using this InputConfig in an [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob] for a
   * model version that performs classification.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetadata classification_metadata = 4;
   * </code>
   *
   * @return Whether the classificationMetadata field is set.
   */
  boolean hasClassificationMetadata();
  /**
   *
   *
   * <pre>
   * Optional. Metadata about annotations for the input. You must specify this
   * field if you are using this InputConfig in an [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob] for a
   * model version that performs classification.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetadata classification_metadata = 4;
   * </code>
   *
   * @return The classificationMetadata.
   */
  com.google.cloud.datalabeling.v1beta1.ClassificationMetadata getClassificationMetadata();
  /**
   *
   *
   * <pre>
   * Optional. Metadata about annotations for the input. You must specify this
   * field if you are using this InputConfig in an [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob] for a
   * model version that performs classification.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetadata classification_metadata = 4;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.ClassificationMetadataOrBuilder
      getClassificationMetadataOrBuilder();

  public com.google.cloud.datalabeling.v1beta1.InputConfig.DataTypeMetadataCase
      getDataTypeMetadataCase();

  public com.google.cloud.datalabeling.v1beta1.InputConfig.SourceCase getSourceCase();
}
