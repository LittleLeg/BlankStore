// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Video.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class TermProto extends Message {

  public static final String DEFAULT_HEADER = "";
  public static final String DEFAULT_BODY = "";

  @ProtoField(tag = 5, type = STRING)
  public final String header;

  @ProtoField(tag = 6, type = STRING)
  public final String body;

  public TermProto(String header, String body) {
    this.header = header;
    this.body = body;
  }

  private TermProto(Builder builder) {
    this(builder.header, builder.body);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TermProto)) return false;
    TermProto o = (TermProto) other;
    return equals(header, o.header)
        && equals(body, o.body);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = header != null ? header.hashCode() : 0;
      result = result * 37 + (body != null ? body.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<TermProto> {

    public String header;
    public String body;

    public Builder() {
    }

    public Builder(TermProto message) {
      super(message);
      if (message == null) return;
      this.header = message.header;
      this.body = message.body;
    }

    public Builder header(String header) {
      this.header = header;
      return this;
    }

    public Builder body(String body) {
      this.body = body;
      return this;
    }

    @Override
    public TermProto build() {
      return new TermProto(this);
    }
  }
}
