package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextCharBulletModel;

/**
 * This is a generated sequence class.
 */
public class TextCharBulletBuilder {
  private String _char;

  public TextCharBulletBuilder() {
  }

  public TextCharBulletBuilder setChar(String _char) {
    this._char = _char;
    return this;
  }

  public TextCharBulletBuilder from(TextCharBulletModel value) {
    this._char = value.getChar();
    return this;
  }

  public TextCharBulletModel build() {
    return new TextCharBulletModel(this._char);
  }
}
