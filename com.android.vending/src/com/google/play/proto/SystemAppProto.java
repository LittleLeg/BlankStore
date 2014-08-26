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

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class SystemAppProto extends Message {

  public static final String DEFAULT_PACKAGENAME = "";
  public static final Integer DEFAULT_VERSIONCODE = 0;
  public static final List<String> DEFAULT_CERTIFICATEHASH = Collections.emptyList();

  @ProtoField(tag = 11, type = STRING)
  public final String packageName;

  @ProtoField(tag = 12, type = INT32)
  public final Integer versionCode;

  @ProtoField(tag = 13, type = STRING, label = REPEATED)
  public final List<String> certificateHash;

  public SystemAppProto(String packageName, Integer versionCode, List<String> certificateHash) {
    this.packageName = packageName;
    this.versionCode = versionCode;
    this.certificateHash = immutableCopyOf(certificateHash);
  }

  private SystemAppProto(Builder builder) {
    this(builder.packageName, builder.versionCode, builder.certificateHash);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SystemAppProto)) return false;
    SystemAppProto o = (SystemAppProto) other;
    return equals(packageName, o.packageName)
        && equals(versionCode, o.versionCode)
        && equals(certificateHash, o.certificateHash);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = packageName != null ? packageName.hashCode() : 0;
      result = result * 37 + (versionCode != null ? versionCode.hashCode() : 0);
      result = result * 37 + (certificateHash != null ? certificateHash.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<SystemAppProto> {

    public String packageName;
    public Integer versionCode;
    public List<String> certificateHash;

    public Builder() {
    }

    public Builder(SystemAppProto message) {
      super(message);
      if (message == null) return;
      this.packageName = message.packageName;
      this.versionCode = message.versionCode;
      this.certificateHash = copyOf(message.certificateHash);
    }

    public Builder packageName(String packageName) {
      this.packageName = packageName;
      return this;
    }

    public Builder versionCode(Integer versionCode) {
      this.versionCode = versionCode;
      return this;
    }

    public Builder certificateHash(List<String> certificateHash) {
      this.certificateHash = checkForNulls(certificateHash);
      return this;
    }

    @Override
    public SystemAppProto build() {
      return new SystemAppProto(this);
    }
  }
}
