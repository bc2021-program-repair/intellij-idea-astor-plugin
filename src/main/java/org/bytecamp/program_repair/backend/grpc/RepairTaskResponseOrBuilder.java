// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.bytecamp.program_repair.backend.grpc;

public interface RepairTaskResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RepairTaskResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.RepairTaskResponse.FrameType frame_type = 1;</code>
   * @return The enum numeric value on the wire for frameType.
   */
  int getFrameTypeValue();
  /**
   * <code>.RepairTaskResponse.FrameType frame_type = 1;</code>
   * @return The frameType.
   */
  org.bytecamp.program_repair.backend.grpc.RepairTaskResponse.FrameType getFrameType();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .RepairTaskResponse.Patch patch = 3;</code>
   */
  java.util.List<org.bytecamp.program_repair.backend.grpc.RepairTaskResponse.Patch> 
      getPatchList();
  /**
   * <code>repeated .RepairTaskResponse.Patch patch = 3;</code>
   */
  org.bytecamp.program_repair.backend.grpc.RepairTaskResponse.Patch getPatch(int index);
  /**
   * <code>repeated .RepairTaskResponse.Patch patch = 3;</code>
   */
  int getPatchCount();
  /**
   * <code>repeated .RepairTaskResponse.Patch patch = 3;</code>
   */
  java.util.List<? extends org.bytecamp.program_repair.backend.grpc.RepairTaskResponse.PatchOrBuilder> 
      getPatchOrBuilderList();
  /**
   * <code>repeated .RepairTaskResponse.Patch patch = 3;</code>
   */
  org.bytecamp.program_repair.backend.grpc.RepairTaskResponse.PatchOrBuilder getPatchOrBuilder(
      int index);
}
