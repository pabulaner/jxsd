package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.TokenModel;

public class CT_EffectReferenceModel {
  private final TokenModel ref;

  public CT_EffectReferenceModel(TokenModel ref) {
    this.ref = ref;
  }

  public TokenModel getRef() {
    return this.ref;
  }
}
