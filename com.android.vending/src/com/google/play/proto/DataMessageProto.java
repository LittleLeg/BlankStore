/*
 * Copyright (c) 2014 μg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Unsorted.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class DataMessageProto extends Message {

  public static final String DEFAULT_CATEGORY = "";
  public static final List<AppDataProto> DEFAULT_APPDATA = Collections.emptyList();

  @ProtoField(tag = 1, type = STRING)
  public final String category;

  @ProtoField(tag = 3, label = REPEATED)
  public final List<AppDataProto> appData;

  public DataMessageProto(String category, List<AppDataProto> appData) {
    this.category = category;
    this.appData = immutableCopyOf(appData);
  }

  private DataMessageProto(Builder builder) {
    this(builder.category, builder.appData);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DataMessageProto)) return false;
    DataMessageProto o = (DataMessageProto) other;
    return equals(category, o.category)
        && equals(appData, o.appData);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = category != null ? category.hashCode() : 0;
      result = result * 37 + (appData != null ? appData.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<DataMessageProto> {

    public String category;
    public List<AppDataProto> appData;

    public Builder() {
    }

    public Builder(DataMessageProto message) {
      super(message);
      if (message == null) return;
      this.category = message.category;
      this.appData = copyOf(message.appData);
    }

    public Builder category(String category) {
      this.category = category;
      return this;
    }

    public Builder appData(List<AppDataProto> appData) {
      this.appData = checkForNulls(appData);
      return this;
    }

    @Override
    public DataMessageProto build() {
      return new DataMessageProto(this);
    }
  }
}