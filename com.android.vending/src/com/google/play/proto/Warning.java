// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Documents.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class Warning extends Message {

  public static final String DEFAULT_LOCALIZEDMESSAGE = "";

  @ProtoField(tag = 1, type = STRING)
  public final String localizedMessage;

  public Warning(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  private Warning(Builder builder) {
    this(builder.localizedMessage);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Warning)) return false;
    return equals(localizedMessage, ((Warning) other).localizedMessage);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = localizedMessage != null ? localizedMessage.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<Warning> {

    public String localizedMessage;

    public Builder() {
    }

    public Builder(Warning message) {
      super(message);
      if (message == null) return;
      this.localizedMessage = message.localizedMessage;
    }

    public Builder localizedMessage(String localizedMessage) {
      this.localizedMessage = localizedMessage;
      return this;
    }

    @Override
    public Warning build() {
      return new Warning(this);
    }
  }
}
