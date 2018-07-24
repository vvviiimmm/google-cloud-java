// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * Metadata in google::longrunning::Operation for Knowledge operations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata}
 */
public  final class KnowledgeOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata)
    KnowledgeOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KnowledgeOperationMetadata.newBuilder() to construct.
  private KnowledgeOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KnowledgeOperationMetadata() {
    state_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KnowledgeOperationMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.DocumentProto.internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.DocumentProto.internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.class, com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.Builder.class);
  }

  /**
   * <pre>
   * States of the operation.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * State unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * The operation has been created.
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    PENDING(1),
    /**
     * <pre>
     * The operation is currently running.
     * </pre>
     *
     * <code>RUNNING = 2;</code>
     */
    RUNNING(2),
    /**
     * <pre>
     * The operation is done, either cancelled or completed.
     * </pre>
     *
     * <code>DONE = 3;</code>
     */
    DONE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * State unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The operation has been created.
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    public static final int PENDING_VALUE = 1;
    /**
     * <pre>
     * The operation is currently running.
     * </pre>
     *
     * <code>RUNNING = 2;</code>
     */
    public static final int RUNNING_VALUE = 2;
    /**
     * <pre>
     * The operation is done, either cancelled or completed.
     * </pre>
     *
     * <code>DONE = 3;</code>
     */
    public static final int DONE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    public static State forNumber(int value) {
      switch (value) {
        case 0: return STATE_UNSPECIFIED;
        case 1: return PENDING;
        case 2: return RUNNING;
        case 3: return DONE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   * <pre>
   * Required. The current state of this operation.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State state = 1;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * Required. The current state of this operation.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State state = 1;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State getState() {
    com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State result = com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.valueOf(state_);
    return result == null ? com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (state_ != com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata other = (com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata) obj;

    boolean result = true;
    result = result && state_ == other.state_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Metadata in google::longrunning::Operation for Knowledge operations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata)
      com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto.internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto.internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.class, com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      state_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto.internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata build() {
      com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata buildPartial() {
      com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata result = new com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata(this);
      result.state_ = state_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata other) {
      if (other == com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int state_ = 0;
    /**
     * <pre>
     * Required. The current state of this operation.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State state = 1;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * Required. The current state of this operation.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State state = 1;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The current state of this operation.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State state = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State getState() {
      com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State result = com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.valueOf(state_);
      return result == null ? com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The current state of this operation.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State state = 1;</code>
     */
    public Builder setState(com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The current state of this operation.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State state = 1;</code>
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata)
  private static final com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata();
  }

  public static com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KnowledgeOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<KnowledgeOperationMetadata>() {
    public KnowledgeOperationMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KnowledgeOperationMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KnowledgeOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KnowledgeOperationMetadata> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
