package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_TextCharBulletModel;

public class CT_TextCharBulletBuilder {
  private StringModel _char;

  public CT_TextCharBulletBuilder() {
  }

  public CT_TextCharBulletBuilder setChar(StringModel _char) {
    this._char = _char;
    return this;
  }

  public CT_TextCharBulletModel build() {
    return new CT_TextCharBulletModel(this._char);
  }

  public CT_TextCharBulletBuilder from(CT_TextCharBulletModel value) {
    this._char = value.getChar();
    return this;
  }
}
