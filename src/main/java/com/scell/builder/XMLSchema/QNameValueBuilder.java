package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.QNameValueModel;

public class QNameValueBuilder {
  private String value;

  public QNameValueBuilder() {
  }

  public QNameValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public QNameValueBuilder from(QNameValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public QNameValueModel build() {
    return new QNameValueModel(this.value);
  }
}
