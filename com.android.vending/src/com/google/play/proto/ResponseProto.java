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
// Source file: proto/Requests.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class ResponseProto extends Message {

  public static final List<InnerResponseProto> DEFAULT_RESPONSE = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public final List<InnerResponseProto> Response;

  @ProtoField(tag = 38)
  public final PendingNotificationsProto pendingNotifications;

  public ResponseProto(List<InnerResponseProto> Response, PendingNotificationsProto pendingNotifications) {
    this.Response = immutableCopyOf(Response);
    this.pendingNotifications = pendingNotifications;
  }

  private ResponseProto(Builder builder) {
    this(builder.Response, builder.pendingNotifications);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ResponseProto)) return false;
    ResponseProto o = (ResponseProto) other;
    return equals(Response, o.Response)
        && equals(pendingNotifications, o.pendingNotifications);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = Response != null ? Response.hashCode() : 1;
      result = result * 37 + (pendingNotifications != null ? pendingNotifications.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ResponseProto> {

    public List<InnerResponseProto> Response;
    public PendingNotificationsProto pendingNotifications;

    public Builder() {
    }

    public Builder(ResponseProto message) {
      super(message);
      if (message == null) return;
      this.Response = copyOf(message.Response);
      this.pendingNotifications = message.pendingNotifications;
    }

    public Builder Response(List<InnerResponseProto> Response) {
      this.Response = checkForNulls(Response);
      return this;
    }

    public Builder pendingNotifications(PendingNotificationsProto pendingNotifications) {
      this.pendingNotifications = pendingNotifications;
      return this;
    }

    @Override
    public ResponseProto build() {
      return new ResponseProto(this);
    }
  }
}