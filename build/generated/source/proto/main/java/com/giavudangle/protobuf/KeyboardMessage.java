// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyboard_message.proto

package com.giavudangle.protobuf;

public final class KeyboardMessage {
  private KeyboardMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_giavudangle_grpc_Keyboard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_giavudangle_grpc_Keyboard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026keyboard_message.proto\022\020giavudangle.gr" +
      "pc\"\216\001\n\010Keyboard\0221\n\006layout\030\001 \001(\0162!.giavud" +
      "angle.grpc.Keyboard.Layout\022\017\n\007backlit\030\002 " +
      "\001(\010\">\n\006Layout\022\013\n\007UNKNOWN\020\000\022\n\n\006QWERTY\020\001\022\n" +
      "\n\006QWERTZ\020\002\022\017\n\013ASTRAZENICA\020\003B\"\n\030com.giavu" +
      "dangle.protobufP\001Z\004.;pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_giavudangle_grpc_Keyboard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_giavudangle_grpc_Keyboard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_giavudangle_grpc_Keyboard_descriptor,
        new java.lang.String[] { "Layout", "Backlit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
