// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Purchase.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;

public final class PurchaseCartInfoProto extends Message {

  public static final String DEFAULT_ITEMPRICE = "";
  public static final String DEFAULT_TAXINCLUSIVE = "";
  public static final String DEFAULT_TAXEXCLUSIVE = "";
  public static final String DEFAULT_TOTAL = "";
  public static final String DEFAULT_TAXMESSAGE = "";
  public static final String DEFAULT_FOOTERMESSAGE = "";
  public static final String DEFAULT_PRICECURRENCY = "";
  public static final Long DEFAULT_PRICEMICROS = 0L;

  @ProtoField(tag = 1, type = STRING)
  public final String itemPrice;

  @ProtoField(tag = 2, type = STRING)
  public final String taxInclusive;

  @ProtoField(tag = 3, type = STRING)
  public final String taxExclusive;

  @ProtoField(tag = 4, type = STRING)
  public final String total;

  @ProtoField(tag = 5, type = STRING)
  public final String taxMessage;

  @ProtoField(tag = 6, type = STRING)
  public final String footerMessage;

  @ProtoField(tag = 7, type = STRING)
  public final String priceCurrency;

  @ProtoField(tag = 8, type = INT64)
  public final Long priceMicros;

  public PurchaseCartInfoProto(String itemPrice, String taxInclusive, String taxExclusive, String total, String taxMessage, String footerMessage, String priceCurrency, Long priceMicros) {
    this.itemPrice = itemPrice;
    this.taxInclusive = taxInclusive;
    this.taxExclusive = taxExclusive;
    this.total = total;
    this.taxMessage = taxMessage;
    this.footerMessage = footerMessage;
    this.priceCurrency = priceCurrency;
    this.priceMicros = priceMicros;
  }

  private PurchaseCartInfoProto(Builder builder) {
    this(builder.itemPrice, builder.taxInclusive, builder.taxExclusive, builder.total, builder.taxMessage, builder.footerMessage, builder.priceCurrency, builder.priceMicros);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PurchaseCartInfoProto)) return false;
    PurchaseCartInfoProto o = (PurchaseCartInfoProto) other;
    return equals(itemPrice, o.itemPrice)
        && equals(taxInclusive, o.taxInclusive)
        && equals(taxExclusive, o.taxExclusive)
        && equals(total, o.total)
        && equals(taxMessage, o.taxMessage)
        && equals(footerMessage, o.footerMessage)
        && equals(priceCurrency, o.priceCurrency)
        && equals(priceMicros, o.priceMicros);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = itemPrice != null ? itemPrice.hashCode() : 0;
      result = result * 37 + (taxInclusive != null ? taxInclusive.hashCode() : 0);
      result = result * 37 + (taxExclusive != null ? taxExclusive.hashCode() : 0);
      result = result * 37 + (total != null ? total.hashCode() : 0);
      result = result * 37 + (taxMessage != null ? taxMessage.hashCode() : 0);
      result = result * 37 + (footerMessage != null ? footerMessage.hashCode() : 0);
      result = result * 37 + (priceCurrency != null ? priceCurrency.hashCode() : 0);
      result = result * 37 + (priceMicros != null ? priceMicros.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PurchaseCartInfoProto> {

    public String itemPrice;
    public String taxInclusive;
    public String taxExclusive;
    public String total;
    public String taxMessage;
    public String footerMessage;
    public String priceCurrency;
    public Long priceMicros;

    public Builder() {
    }

    public Builder(PurchaseCartInfoProto message) {
      super(message);
      if (message == null) return;
      this.itemPrice = message.itemPrice;
      this.taxInclusive = message.taxInclusive;
      this.taxExclusive = message.taxExclusive;
      this.total = message.total;
      this.taxMessage = message.taxMessage;
      this.footerMessage = message.footerMessage;
      this.priceCurrency = message.priceCurrency;
      this.priceMicros = message.priceMicros;
    }

    public Builder itemPrice(String itemPrice) {
      this.itemPrice = itemPrice;
      return this;
    }

    public Builder taxInclusive(String taxInclusive) {
      this.taxInclusive = taxInclusive;
      return this;
    }

    public Builder taxExclusive(String taxExclusive) {
      this.taxExclusive = taxExclusive;
      return this;
    }

    public Builder total(String total) {
      this.total = total;
      return this;
    }

    public Builder taxMessage(String taxMessage) {
      this.taxMessage = taxMessage;
      return this;
    }

    public Builder footerMessage(String footerMessage) {
      this.footerMessage = footerMessage;
      return this;
    }

    public Builder priceCurrency(String priceCurrency) {
      this.priceCurrency = priceCurrency;
      return this;
    }

    public Builder priceMicros(Long priceMicros) {
      this.priceMicros = priceMicros;
      return this;
    }

    @Override
    public PurchaseCartInfoProto build() {
      return new PurchaseCartInfoProto(this);
    }
  }
}
