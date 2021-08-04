// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.bytecamp.program_repair.backend.grpc;

public final class RepairServerProto {
  private RepairServerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RepairTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RepairTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RepairTaskResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RepairTaskResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RepairTaskResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RepairTaskResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RepairTaskResult_Patch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RepairTaskResult_Patch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rservice.proto\"\276\001\n\021RepairTaskRequest\0226\n" +
      "\rlocation_type\030\001 \001(\0162\037.RepairTaskRequest" +
      ".LocationType\022\020\n\010location\030\002 \001(\t\022\017\n\007proje" +
      "ct\030\003 \001(\t\022\021\n\talgorithm\030\004 \001(\t\022\017\n\007content\030\005" +
      " \001(\014\"*\n\014LocationType\022\010\n\004PATH\020\000\022\007\n\003GIT\020\001\022" +
      "\007\n\003ZIP\020\002\"\240\001\n\022RepairTaskResponse\0221\n\nframe" +
      "_type\030\001 \001(\0162\035.RepairTaskResponse.FrameTy" +
      "pe\022\017\n\007message\030\002 \001(\t\022!\n\006result\030\003 \003(\0132\021.Re" +
      "pairTaskResult\"#\n\tFrameType\022\n\n\006STDOUT\020\000\022" +
      "\n\n\006RESULT\020\001\"{\n\020RepairTaskResult\022\017\n\007succe" +
      "ss\030\001 \001(\010\022&\n\005patch\030\003 \003(\0132\027.RepairTaskResu" +
      "lt.Patch\032.\n\005Patch\022\020\n\010modified\030\002 \001(\t\022\023\n\013s" +
      "ource_path\030\003 \001(\t2I\n\014RepairServer\0229\n\nSubm" +
      "itTask\022\022.RepairTaskRequest\032\023.RepairTaskR" +
      "esponse\"\0000\001B?\n(org.bytecamp.program_repa" +
      "ir.backend.grpcB\021RepairServerProtoP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RepairTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RepairTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RepairTaskRequest_descriptor,
        new String[] { "LocationType", "Location", "Project", "Algorithm", "Content", });
    internal_static_RepairTaskResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RepairTaskResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RepairTaskResponse_descriptor,
        new String[] { "FrameType", "Message", "Result", });
    internal_static_RepairTaskResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_RepairTaskResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RepairTaskResult_descriptor,
        new String[] { "Success", "Patch", });
    internal_static_RepairTaskResult_Patch_descriptor =
      internal_static_RepairTaskResult_descriptor.getNestedTypes().get(0);
    internal_static_RepairTaskResult_Patch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RepairTaskResult_Patch_descriptor,
        new String[] { "Modified", "SourcePath", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
