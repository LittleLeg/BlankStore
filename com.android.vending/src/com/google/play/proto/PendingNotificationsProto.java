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
// Source file: proto/Notifications.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REPEATED;

public final class PendingNotificationsProto extends Message {

  public static final List<DataMessageProto> DEFAULT_NOTIFICATION = Collections.emptyList();
  public static final Long DEFAULT_NEXTCHECKMILLIS = 0L;

  @ProtoField(tag = 1, label = REPEATED)
  public final List<DataMessageProto> notification;

  @ProtoField(tag = 2, type = INT64)
  public final Long nextCheckMillis;

  public PendingNotificationsProto(List<DataMessageProto> notification, Long nextCheckMillis) {
    this.notification = immutableCopyOf(notification);
    this.nextCheckMillis = nextCheckMillis;
  }

  private PendingNotificationsProto(Builder builder) {
    this(builder.notification, builder.nextCheckMillis);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PendingNotificationsProto)) return false;
    PendingNotificationsProto o = (PendingNotificationsProto) other;
    return equals(notification, o.notification)
        && equals(nextCheckMillis, o.nextCheckMillis);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = notification != null ? notification.hashCode() : 1;
      result = result * 37 + (nextCheckMillis != null ? nextCheckMillis.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PendingNotificationsProto> {

    public List<DataMessageProto> notification;
    public Long nextCheckMillis;

    public Builder() {
    }

    public Builder(PendingNotificationsProto message) {
      super(message);
      if (message == null) return;
      this.notification = copyOf(message.notification);
      this.nextCheckMillis = message.nextCheckMillis;
    }

    public Builder notification(List<DataMessageProto> notification) {
      this.notification = checkForNulls(notification);
      return this;
    }

    public Builder nextCheckMillis(Long nextCheckMillis) {
      this.nextCheckMillis = nextCheckMillis;
      return this;
    }

    @Override
    public PendingNotificationsProto build() {
      return new PendingNotificationsProto(this);
    }
  }
}
