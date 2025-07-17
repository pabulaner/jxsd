package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.AnyTypeModel;

public class AnyTypeBuilder {
  public AnyTypeBuilder() {
  }

  public AnyTypeModel build() {
    return new AnyTypeModel();
  }

  public AnyTypeBuilder from(AnyTypeModel value) {
    return this;
  }
}
