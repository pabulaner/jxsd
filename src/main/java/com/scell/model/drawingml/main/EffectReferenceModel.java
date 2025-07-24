package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;

public class EffectReferenceModel {
  private final TokenModel ref;

  public EffectReferenceModel(TokenModel ref) {
    this.ref = ref;
  }

  public TokenModel getRef() {
    return this.ref;
  }
}
