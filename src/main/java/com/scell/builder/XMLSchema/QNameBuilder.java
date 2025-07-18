package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.QNameModel;

public class QNameBuilder {
  private String value;

  public QNameBuilder() {
    this.value = null;
  }

  public QNameBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public QNameBuilder from(QNameModel value) {
    this.value = value.getValue();
    return this;
  }

  public QNameModel build() {
    return new QNameModel(this.value);
  }
}
