/*
 * Copyright 2024 Google LLC
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
// source: google/bigtable/v2/data.proto

// Protobuf Java Version: 3.25.2
package com.google.bigtable.v2;

public interface StreamContinuationTokenOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.StreamContinuationToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The partition that this token applies to.
   * </pre>
   *
   * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
   *
   * @return Whether the partition field is set.
   */
  boolean hasPartition();
  /**
   *
   *
   * <pre>
   * The partition that this token applies to.
   * </pre>
   *
   * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
   *
   * @return The partition.
   */
  com.google.bigtable.v2.StreamPartition getPartition();
  /**
   *
   *
   * <pre>
   * The partition that this token applies to.
   * </pre>
   *
   * <code>.google.bigtable.v2.StreamPartition partition = 1;</code>
   */
  com.google.bigtable.v2.StreamPartitionOrBuilder getPartitionOrBuilder();

  /**
   *
   *
   * <pre>
   * An encoded position in the stream to restart reading from.
   * </pre>
   *
   * <code>string token = 2;</code>
   *
   * @return The token.
   */
  java.lang.String getToken();
  /**
   *
   *
   * <pre>
   * An encoded position in the stream to restart reading from.
   * </pre>
   *
   * <code>string token = 2;</code>
   *
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString getTokenBytes();
}
