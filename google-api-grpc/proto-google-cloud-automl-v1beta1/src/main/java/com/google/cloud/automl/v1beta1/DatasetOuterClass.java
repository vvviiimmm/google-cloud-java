// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/dataset.proto

package com.google.cloud.automl.v1beta1;

public final class DatasetOuterClass {
  private DatasetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Dataset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/automl/v1beta1/dataset.pr"
          + "oto\022\033google.cloud.automl.v1beta1\032\034google"
          + "/api/annotations.proto\0324google/cloud/aut"
          + "oml/v1beta1/annotation_payload.proto\032,go"
          + "ogle/cloud/automl/v1beta1/data_items.pro"
          + "to\032\'google/cloud/automl/v1beta1/image.pr"
          + "oto\032&google/cloud/automl/v1beta1/text.pr"
          + "oto\032-google/cloud/automl/v1beta1/transla"
          + "tion.proto\032\037google/protobuf/timestamp.pr"
          + "oto\"\314\003\n\007Dataset\022_\n\034translation_dataset_m"
          + "etadata\030\027 \001(\01327.google.cloud.automl.v1be"
          + "ta1.TranslationDatasetMetadataH\000\022p\n%imag"
          + "e_classification_dataset_metadata\030\030 \001(\0132"
          + "?.google.cloud.automl.v1beta1.ImageClass"
          + "ificationDatasetMetadataH\000\022n\n$text_class"
          + "ification_dataset_metadata\030\031 \001(\0132>.googl"
          + "e.cloud.automl.v1beta1.TextClassificatio"
          + "nDatasetMetadataH\000\022\014\n\004name\030\001 \001(\t\022\024\n\014disp"
          + "lay_name\030\002 \001(\t\022\025\n\rexample_count\030\025 \001(\005\022/\n"
          + "\013create_time\030\016 \001(\0132\032.google.protobuf.Tim"
          + "estampB\022\n\020dataset_metadataB\204\001\n\037com.googl"
          + "e.cloud.automl.v1beta1P\001ZAgoogle.golang."
          + "org/genproto/googleapis/cloud/automl/v1b"
          + "eta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1beta"
          + "1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.AnnotationPayloadOuterClass.getDescriptor(),
          com.google.cloud.automl.v1beta1.DataItems.getDescriptor(),
          com.google.cloud.automl.v1beta1.ImageProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_Dataset_descriptor,
            new java.lang.String[] {
              "TranslationDatasetMetadata",
              "ImageClassificationDatasetMetadata",
              "TextClassificationDatasetMetadata",
              "Name",
              "DisplayName",
              "ExampleCount",
              "CreateTime",
              "DatasetMetadata",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.automl.v1beta1.AnnotationPayloadOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.DataItems.getDescriptor();
    com.google.cloud.automl.v1beta1.ImageProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TextProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
