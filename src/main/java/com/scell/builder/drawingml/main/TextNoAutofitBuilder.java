package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextNoAutofitModel;

public class TextNoAutofitBuilder {
  public TextNoAutofitBuilder() {
  }

  public TextNoAutofitModel build() {
    return new TextNoAutofitModel();
  }

  public TextNoAutofitBuilder from(TextNoAutofitModel value) {
    return this;
  }
}
