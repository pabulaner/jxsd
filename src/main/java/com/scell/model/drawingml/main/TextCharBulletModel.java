package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;

public class TextCharBulletModel {
  private final StringValueModel _char;

  public TextCharBulletModel(StringValueModel _char) {
    this._char = _char;
  }

  public StringValueModel getChar() {
    return this._char;
  }
}
