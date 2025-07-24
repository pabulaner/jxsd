package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.EmptyElementModel;

public class EmptyElementBuilder {
  public EmptyElementBuilder() {
  }

  public EmptyElementModel build() {
    return new EmptyElementModel();
  }

  public EmptyElementBuilder from(EmptyElementModel value) {
    return this;
  }
}
