package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;

public class TextCharBulletModel {
  private final StringModel _char;

  public TextCharBulletModel(StringModel _char) {
    this._char = _char;
  }

  public StringModel getChar() {
    return this._char;
  }
}
