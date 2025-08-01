package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenValueModel;

public class EffectReferenceModel {
  private final TokenValueModel ref;

  public EffectReferenceModel(TokenValueModel ref) {
    this.ref = ref;
  }

  public TokenValueModel getRef() {
    return this.ref;
  }
}
