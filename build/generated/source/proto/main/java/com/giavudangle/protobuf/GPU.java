// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processor_message.proto

package com.giavudangle.protobuf;

/**
 * Protobuf type {@code giavudangle.grpc.GPU}
 */
public final class GPU extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:giavudangle.grpc.GPU)
    GPUOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GPU.newBuilder() to construct.
  private GPU(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GPU() {
    brand_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GPU();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GPU(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            brand_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 25: {

            minGhz_ = input.readDouble();
            break;
          }
          case 33: {

            maxGhz_ = input.readDouble();
            break;
          }
          case 42: {
            com.giavudangle.protobuf.Memory.Builder subBuilder = null;
            if (memory_ != null) {
              subBuilder = memory_.toBuilder();
            }
            memory_ = input.readMessage(com.giavudangle.protobuf.Memory.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(memory_);
              memory_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.giavudangle.protobuf.ProcessorMessage.internal_static_giavudangle_grpc_GPU_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.giavudangle.protobuf.ProcessorMessage.internal_static_giavudangle_grpc_GPU_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.giavudangle.protobuf.GPU.class, com.giavudangle.protobuf.GPU.Builder.class);
  }

  public static final int BRAND_FIELD_NUMBER = 1;
  private volatile java.lang.Object brand_;
  /**
   * <code>string brand = 1;</code>
   * @return The brand.
   */
  @java.lang.Override
  public java.lang.String getBrand() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brand_ = s;
      return s;
    }
  }
  /**
   * <code>string brand = 1;</code>
   * @return The bytes for brand.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBrandBytes() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIN_GHZ_FIELD_NUMBER = 3;
  private double minGhz_;
  /**
   * <code>double min_ghz = 3;</code>
   * @return The minGhz.
   */
  @java.lang.Override
  public double getMinGhz() {
    return minGhz_;
  }

  public static final int MAX_GHZ_FIELD_NUMBER = 4;
  private double maxGhz_;
  /**
   * <code>double max_ghz = 4;</code>
   * @return The maxGhz.
   */
  @java.lang.Override
  public double getMaxGhz() {
    return maxGhz_;
  }

  public static final int MEMORY_FIELD_NUMBER = 5;
  private com.giavudangle.protobuf.Memory memory_;
  /**
   * <code>.giavudangle.grpc.Memory memory = 5;</code>
   * @return Whether the memory field is set.
   */
  @java.lang.Override
  public boolean hasMemory() {
    return memory_ != null;
  }
  /**
   * <code>.giavudangle.grpc.Memory memory = 5;</code>
   * @return The memory.
   */
  @java.lang.Override
  public com.giavudangle.protobuf.Memory getMemory() {
    return memory_ == null ? com.giavudangle.protobuf.Memory.getDefaultInstance() : memory_;
  }
  /**
   * <code>.giavudangle.grpc.Memory memory = 5;</code>
   */
  @java.lang.Override
  public com.giavudangle.protobuf.MemoryOrBuilder getMemoryOrBuilder() {
    return getMemory();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brand_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, brand_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (java.lang.Double.doubleToRawLongBits(minGhz_) != 0) {
      output.writeDouble(3, minGhz_);
    }
    if (java.lang.Double.doubleToRawLongBits(maxGhz_) != 0) {
      output.writeDouble(4, maxGhz_);
    }
    if (memory_ != null) {
      output.writeMessage(5, getMemory());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brand_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, brand_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (java.lang.Double.doubleToRawLongBits(minGhz_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, minGhz_);
    }
    if (java.lang.Double.doubleToRawLongBits(maxGhz_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, maxGhz_);
    }
    if (memory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getMemory());
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
    if (!(obj instanceof com.giavudangle.protobuf.GPU)) {
      return super.equals(obj);
    }
    com.giavudangle.protobuf.GPU other = (com.giavudangle.protobuf.GPU) obj;

    if (!getBrand()
        .equals(other.getBrand())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (java.lang.Double.doubleToLongBits(getMinGhz())
        != java.lang.Double.doubleToLongBits(
            other.getMinGhz())) return false;
    if (java.lang.Double.doubleToLongBits(getMaxGhz())
        != java.lang.Double.doubleToLongBits(
            other.getMaxGhz())) return false;
    if (hasMemory() != other.hasMemory()) return false;
    if (hasMemory()) {
      if (!getMemory()
          .equals(other.getMemory())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BRAND_FIELD_NUMBER;
    hash = (53 * hash) + getBrand().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + MIN_GHZ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMinGhz()));
    hash = (37 * hash) + MAX_GHZ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaxGhz()));
    if (hasMemory()) {
      hash = (37 * hash) + MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + getMemory().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.giavudangle.protobuf.GPU parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.giavudangle.protobuf.GPU parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.giavudangle.protobuf.GPU parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.giavudangle.protobuf.GPU parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.giavudangle.protobuf.GPU prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code giavudangle.grpc.GPU}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:giavudangle.grpc.GPU)
      com.giavudangle.protobuf.GPUOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.giavudangle.protobuf.ProcessorMessage.internal_static_giavudangle_grpc_GPU_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.giavudangle.protobuf.ProcessorMessage.internal_static_giavudangle_grpc_GPU_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.giavudangle.protobuf.GPU.class, com.giavudangle.protobuf.GPU.Builder.class);
    }

    // Construct using com.giavudangle.protobuf.GPU.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      brand_ = "";

      name_ = "";

      minGhz_ = 0D;

      maxGhz_ = 0D;

      if (memoryBuilder_ == null) {
        memory_ = null;
      } else {
        memory_ = null;
        memoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.giavudangle.protobuf.ProcessorMessage.internal_static_giavudangle_grpc_GPU_descriptor;
    }

    @java.lang.Override
    public com.giavudangle.protobuf.GPU getDefaultInstanceForType() {
      return com.giavudangle.protobuf.GPU.getDefaultInstance();
    }

    @java.lang.Override
    public com.giavudangle.protobuf.GPU build() {
      com.giavudangle.protobuf.GPU result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.giavudangle.protobuf.GPU buildPartial() {
      com.giavudangle.protobuf.GPU result = new com.giavudangle.protobuf.GPU(this);
      result.brand_ = brand_;
      result.name_ = name_;
      result.minGhz_ = minGhz_;
      result.maxGhz_ = maxGhz_;
      if (memoryBuilder_ == null) {
        result.memory_ = memory_;
      } else {
        result.memory_ = memoryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.giavudangle.protobuf.GPU) {
        return mergeFrom((com.giavudangle.protobuf.GPU)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.giavudangle.protobuf.GPU other) {
      if (other == com.giavudangle.protobuf.GPU.getDefaultInstance()) return this;
      if (!other.getBrand().isEmpty()) {
        brand_ = other.brand_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getMinGhz() != 0D) {
        setMinGhz(other.getMinGhz());
      }
      if (other.getMaxGhz() != 0D) {
        setMaxGhz(other.getMaxGhz());
      }
      if (other.hasMemory()) {
        mergeMemory(other.getMemory());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.giavudangle.protobuf.GPU parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.giavudangle.protobuf.GPU) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object brand_ = "";
    /**
     * <code>string brand = 1;</code>
     * @return The brand.
     */
    public java.lang.String getBrand() {
      java.lang.Object ref = brand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brand_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string brand = 1;</code>
     * @return The bytes for brand.
     */
    public com.google.protobuf.ByteString
        getBrandBytes() {
      java.lang.Object ref = brand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string brand = 1;</code>
     * @param value The brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrand() {
      
      brand_ = getDefaultInstance().getBrand();
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 1;</code>
     * @param value The bytes for brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brand_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private double minGhz_ ;
    /**
     * <code>double min_ghz = 3;</code>
     * @return The minGhz.
     */
    @java.lang.Override
    public double getMinGhz() {
      return minGhz_;
    }
    /**
     * <code>double min_ghz = 3;</code>
     * @param value The minGhz to set.
     * @return This builder for chaining.
     */
    public Builder setMinGhz(double value) {
      
      minGhz_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double min_ghz = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinGhz() {
      
      minGhz_ = 0D;
      onChanged();
      return this;
    }

    private double maxGhz_ ;
    /**
     * <code>double max_ghz = 4;</code>
     * @return The maxGhz.
     */
    @java.lang.Override
    public double getMaxGhz() {
      return maxGhz_;
    }
    /**
     * <code>double max_ghz = 4;</code>
     * @param value The maxGhz to set.
     * @return This builder for chaining.
     */
    public Builder setMaxGhz(double value) {
      
      maxGhz_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double max_ghz = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxGhz() {
      
      maxGhz_ = 0D;
      onChanged();
      return this;
    }

    private com.giavudangle.protobuf.Memory memory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.giavudangle.protobuf.Memory, com.giavudangle.protobuf.Memory.Builder, com.giavudangle.protobuf.MemoryOrBuilder> memoryBuilder_;
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     * @return Whether the memory field is set.
     */
    public boolean hasMemory() {
      return memoryBuilder_ != null || memory_ != null;
    }
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     * @return The memory.
     */
    public com.giavudangle.protobuf.Memory getMemory() {
      if (memoryBuilder_ == null) {
        return memory_ == null ? com.giavudangle.protobuf.Memory.getDefaultInstance() : memory_;
      } else {
        return memoryBuilder_.getMessage();
      }
    }
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     */
    public Builder setMemory(com.giavudangle.protobuf.Memory value) {
      if (memoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        memory_ = value;
        onChanged();
      } else {
        memoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     */
    public Builder setMemory(
        com.giavudangle.protobuf.Memory.Builder builderForValue) {
      if (memoryBuilder_ == null) {
        memory_ = builderForValue.build();
        onChanged();
      } else {
        memoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     */
    public Builder mergeMemory(com.giavudangle.protobuf.Memory value) {
      if (memoryBuilder_ == null) {
        if (memory_ != null) {
          memory_ =
            com.giavudangle.protobuf.Memory.newBuilder(memory_).mergeFrom(value).buildPartial();
        } else {
          memory_ = value;
        }
        onChanged();
      } else {
        memoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     */
    public Builder clearMemory() {
      if (memoryBuilder_ == null) {
        memory_ = null;
        onChanged();
      } else {
        memory_ = null;
        memoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     */
    public com.giavudangle.protobuf.Memory.Builder getMemoryBuilder() {
      
      onChanged();
      return getMemoryFieldBuilder().getBuilder();
    }
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     */
    public com.giavudangle.protobuf.MemoryOrBuilder getMemoryOrBuilder() {
      if (memoryBuilder_ != null) {
        return memoryBuilder_.getMessageOrBuilder();
      } else {
        return memory_ == null ?
            com.giavudangle.protobuf.Memory.getDefaultInstance() : memory_;
      }
    }
    /**
     * <code>.giavudangle.grpc.Memory memory = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.giavudangle.protobuf.Memory, com.giavudangle.protobuf.Memory.Builder, com.giavudangle.protobuf.MemoryOrBuilder> 
        getMemoryFieldBuilder() {
      if (memoryBuilder_ == null) {
        memoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.giavudangle.protobuf.Memory, com.giavudangle.protobuf.Memory.Builder, com.giavudangle.protobuf.MemoryOrBuilder>(
                getMemory(),
                getParentForChildren(),
                isClean());
        memory_ = null;
      }
      return memoryBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:giavudangle.grpc.GPU)
  }

  // @@protoc_insertion_point(class_scope:giavudangle.grpc.GPU)
  private static final com.giavudangle.protobuf.GPU DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.giavudangle.protobuf.GPU();
  }

  public static com.giavudangle.protobuf.GPU getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GPU>
      PARSER = new com.google.protobuf.AbstractParser<GPU>() {
    @java.lang.Override
    public GPU parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GPU(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GPU> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GPU> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.giavudangle.protobuf.GPU getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

