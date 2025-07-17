package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;
import com.scell.model.drawingml.main.CT_EffectReferenceModel;

public class CT_EffectReferenceBuilder {
  private TokenModel ref;

  public CT_EffectReferenceBuilder() {
  }

  public CT_EffectReferenceBuilder setRef(TokenModel ref) {
    this.ref = ref;
    return this;
  }

  public CT_EffectReferenceModel build() {
    return new CT_EffectReferenceModel(this.ref);
  }

  public CT_EffectReferenceBuilder from(CT_EffectReferenceModel value) {
    this.ref = value.getRef();
    return this;
  }
}
