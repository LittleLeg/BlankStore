// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Paypal.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class PaypalCredentialsProto extends Message {

  public static final String DEFAULT_PREAPPROVALKEY = "";
  public static final String DEFAULT_PAYPALEMAIL = "";

  @ProtoField(tag = 1, type = STRING)
  public final String preapprovalKey;

  @ProtoField(tag = 2, type = STRING)
  public final String paypalEmail;

  public PaypalCredentialsProto(String preapprovalKey, String paypalEmail) {
    this.preapprovalKey = preapprovalKey;
    this.paypalEmail = paypalEmail;
  }

  private PaypalCredentialsProto(Builder builder) {
    this(builder.preapprovalKey, builder.paypalEmail);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PaypalCredentialsProto)) return false;
    PaypalCredentialsProto o = (PaypalCredentialsProto) other;
    return equals(preapprovalKey, o.preapprovalKey)
        && equals(paypalEmail, o.paypalEmail);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = preapprovalKey != null ? preapprovalKey.hashCode() : 0;
      result = result * 37 + (paypalEmail != null ? paypalEmail.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PaypalCredentialsProto> {

    public String preapprovalKey;
    public String paypalEmail;

    public Builder() {
    }

    public Builder(PaypalCredentialsProto message) {
      super(message);
      if (message == null) return;
      this.preapprovalKey = message.preapprovalKey;
      this.paypalEmail = message.paypalEmail;
    }

    public Builder preapprovalKey(String preapprovalKey) {
      this.preapprovalKey = preapprovalKey;
      return this;
    }

    public Builder paypalEmail(String paypalEmail) {
      this.paypalEmail = paypalEmail;
      return this;
    }

    @Override
    public PaypalCredentialsProto build() {
      return new PaypalCredentialsProto(this);
    }
  }
}