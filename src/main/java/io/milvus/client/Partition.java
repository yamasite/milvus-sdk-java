/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.milvus.client;

import javax.annotation.Nonnull;

/** Represents a partition containing <code>tableName</code>, <code>partitionName</code> and <code>tag</code> */
public class Partition {
  private final String tableName;
  private final String partitionName;
  private final String tag;

  private Partition(@Nonnull Builder builder) {
    this.tableName = builder.tableName;
    this.partitionName = builder.partitionName;
    this.tag = builder.tag;
  }

  public String getTableName() {
    return tableName;
  }

  public String getPartitionName() {
    return partitionName;
  }

  public String getTag() {
    return tag;
  }

  @Override
  public String toString() {
    return "Partition{"
        + "tableName='"
        + tableName
        + '\''
        + ", partitionName='"
        + partitionName
        + '\''
        + ", tag='"
        + tag
        + '\''
        + '}';
  }

  /** Builder for <code>Partition</code> */
  public static class Builder {
    // Required parameters
    private final String tableName;
    private final String partitionName;
    private final String tag;

    public Builder(@Nonnull String tableName, @Nonnull String partitionName, @Nonnull String tag) {
      this.tableName = tableName;
      this.partitionName = partitionName;
      this.tag = tag;
    }

    public Partition build() {
      return new Partition(this);
    }
  }
}
