package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextShapeAutofitModel;

public class TextShapeAutofitBuilder {
  public TextShapeAutofitBuilder() {
  }

  public TextShapeAutofitModel build() {
    return new TextShapeAutofitModel();
  }

  public TextShapeAutofitBuilder from(TextShapeAutofitModel value) {
    return this;
  }
}
