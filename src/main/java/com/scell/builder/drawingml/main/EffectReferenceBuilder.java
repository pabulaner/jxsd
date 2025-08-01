package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenValueModel;
import com.scell.model.drawingml.main.EffectReferenceModel;

public class EffectReferenceBuilder {
  private TokenValueModel ref;

  public EffectReferenceBuilder() {
  }

  public EffectReferenceBuilder setRef(TokenValueModel ref) {
    this.ref = ref;
    return this;
  }

  public EffectReferenceModel build() {
    return new EffectReferenceModel(this.ref);
  }

  public EffectReferenceBuilder from(EffectReferenceModel value) {
    this.ref = value.getRef();
    return this;
  }
}
