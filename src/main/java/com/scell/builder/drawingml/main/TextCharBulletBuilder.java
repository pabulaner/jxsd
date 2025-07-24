package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.TextCharBulletModel;

public class TextCharBulletBuilder {
  private StringModel _char;

  public TextCharBulletBuilder() {
  }

  public TextCharBulletBuilder setChar(StringModel _char) {
    this._char = _char;
    return this;
  }

  public TextCharBulletModel build() {
    return new TextCharBulletModel(this._char);
  }

  public TextCharBulletBuilder from(TextCharBulletModel value) {
    this._char = value.getChar();
    return this;
  }
}
