// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Log.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;

public final class ClickLogEvent extends Message {

  public static final Long DEFAULT_EVENTTIME = 0L;
  public static final String DEFAULT_URL = "";
  public static final String DEFAULT_LISTID = "";
  public static final String DEFAULT_REFERRERURL = "";
  public static final String DEFAULT_REFERRERLISTID = "";

  @ProtoField(tag = 1, type = INT64)
  public final Long eventTime;

  @ProtoField(tag = 2, type = STRING)
  public final String url;

  @ProtoField(tag = 3, type = STRING)
  public final String listId;

  @ProtoField(tag = 4, type = STRING)
  public final String referrerUrl;

  @ProtoField(tag = 5, type = STRING)
  public final String referrerListId;

  public ClickLogEvent(Long eventTime, String url, String listId, String referrerUrl, String referrerListId) {
    this.eventTime = eventTime;
    this.url = url;
    this.listId = listId;
    this.referrerUrl = referrerUrl;
    this.referrerListId = referrerListId;
  }

  private ClickLogEvent(Builder builder) {
    this(builder.eventTime, builder.url, builder.listId, builder.referrerUrl, builder.referrerListId);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ClickLogEvent)) return false;
    ClickLogEvent o = (ClickLogEvent) other;
    return equals(eventTime, o.eventTime)
        && equals(url, o.url)
        && equals(listId, o.listId)
        && equals(referrerUrl, o.referrerUrl)
        && equals(referrerListId, o.referrerListId);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = eventTime != null ? eventTime.hashCode() : 0;
      result = result * 37 + (url != null ? url.hashCode() : 0);
      result = result * 37 + (listId != null ? listId.hashCode() : 0);
      result = result * 37 + (referrerUrl != null ? referrerUrl.hashCode() : 0);
      result = result * 37 + (referrerListId != null ? referrerListId.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ClickLogEvent> {

    public Long eventTime;
    public String url;
    public String listId;
    public String referrerUrl;
    public String referrerListId;

    public Builder() {
    }

    public Builder(ClickLogEvent message) {
      super(message);
      if (message == null) return;
      this.eventTime = message.eventTime;
      this.url = message.url;
      this.listId = message.listId;
      this.referrerUrl = message.referrerUrl;
      this.referrerListId = message.referrerListId;
    }

    public Builder eventTime(Long eventTime) {
      this.eventTime = eventTime;
      return this;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder listId(String listId) {
      this.listId = listId;
      return this;
    }

    public Builder referrerUrl(String referrerUrl) {
      this.referrerUrl = referrerUrl;
      return this;
    }

    public Builder referrerListId(String referrerListId) {
      this.referrerListId = referrerListId;
      return this;
    }

    @Override
    public ClickLogEvent build() {
      return new ClickLogEvent(this);
    }
  }
}
