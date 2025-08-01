package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.TextCharBulletModel;

public class TextCharBulletBuilder {
  private StringValueModel _char;

  public TextCharBulletBuilder() {
  }

  public TextCharBulletBuilder setChar(StringValueModel _char) {
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
