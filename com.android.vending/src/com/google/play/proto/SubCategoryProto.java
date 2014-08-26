// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Category.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class SubCategoryProto extends Message {

  public static final String DEFAULT_SUBCATEGORYDISPLAY = "";
  public static final String DEFAULT_SUBCATEGORYID = "";

  @ProtoField(tag = 2, type = STRING)
  public final String subCategoryDisplay;

  @ProtoField(tag = 3, type = STRING)
  public final String subCategoryId;

  public SubCategoryProto(String subCategoryDisplay, String subCategoryId) {
    this.subCategoryDisplay = subCategoryDisplay;
    this.subCategoryId = subCategoryId;
  }

  private SubCategoryProto(Builder builder) {
    this(builder.subCategoryDisplay, builder.subCategoryId);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SubCategoryProto)) return false;
    SubCategoryProto o = (SubCategoryProto) other;
    return equals(subCategoryDisplay, o.subCategoryDisplay)
        && equals(subCategoryId, o.subCategoryId);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = subCategoryDisplay != null ? subCategoryDisplay.hashCode() : 0;
      result = result * 37 + (subCategoryId != null ? subCategoryId.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<SubCategoryProto> {

    public String subCategoryDisplay;
    public String subCategoryId;

    public Builder() {
    }

    public Builder(SubCategoryProto message) {
      super(message);
      if (message == null) return;
      this.subCategoryDisplay = message.subCategoryDisplay;
      this.subCategoryId = message.subCategoryId;
    }

    public Builder subCategoryDisplay(String subCategoryDisplay) {
      this.subCategoryDisplay = subCategoryDisplay;
      return this;
    }

    public Builder subCategoryId(String subCategoryId) {
      this.subCategoryId = subCategoryId;
      return this;
    }

    @Override
    public SubCategoryProto build() {
      return new SubCategoryProto(this);
    }
  }
}
