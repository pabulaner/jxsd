package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_EmptyElementModel;

public class CT_EmptyElementBuilder {
  public CT_EmptyElementBuilder() {
  }

  public CT_EmptyElementModel build() {
    return new CT_EmptyElementModel();
  }

  public CT_EmptyElementBuilder from(CT_EmptyElementModel value) {
    return this;
  }
}
