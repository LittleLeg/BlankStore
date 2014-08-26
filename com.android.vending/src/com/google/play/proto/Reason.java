// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Documents.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class Reason extends Message {

  public static final String DEFAULT_BRIEFREASON = "";
  public static final String DEFAULT_DETAILEDREASON = "";
  public static final String DEFAULT_UNIQUEID = "";

  @ProtoField(tag = 1, type = STRING)
  public final String briefReason;

  @ProtoField(tag = 2, type = STRING)
  public final String detailedReason;

  @ProtoField(tag = 3, type = STRING)
  public final String uniqueId;

  public Reason(String briefReason, String detailedReason, String uniqueId) {
    this.briefReason = briefReason;
    this.detailedReason = detailedReason;
    this.uniqueId = uniqueId;
  }

  private Reason(Builder builder) {
    this(builder.briefReason, builder.detailedReason, builder.uniqueId);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Reason)) return false;
    Reason o = (Reason) other;
    return equals(briefReason, o.briefReason)
        && equals(detailedReason, o.detailedReason)
        && equals(uniqueId, o.uniqueId);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = briefReason != null ? briefReason.hashCode() : 0;
      result = result * 37 + (detailedReason != null ? detailedReason.hashCode() : 0);
      result = result * 37 + (uniqueId != null ? uniqueId.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Reason> {

    public String briefReason;
    public String detailedReason;
    public String uniqueId;

    public Builder() {
    }

    public Builder(Reason message) {
      super(message);
      if (message == null) return;
      this.briefReason = message.briefReason;
      this.detailedReason = message.detailedReason;
      this.uniqueId = message.uniqueId;
    }

    public Builder briefReason(String briefReason) {
      this.briefReason = briefReason;
      return this;
    }

    public Builder detailedReason(String detailedReason) {
      this.detailedReason = detailedReason;
      return this;
    }

    public Builder uniqueId(String uniqueId) {
      this.uniqueId = uniqueId;
      return this;
    }

    @Override
    public Reason build() {
      return new Reason(this);
    }
  }
}
