package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextCharBulletBuilder;

/**
 * This is a generated sequence class.
 */
public class TextCharBulletModel {
  private final String _char;

  public TextCharBulletModel(String _char) {
    this._char = _char;
  }

  public TextCharBulletBuilder builder() {
    return new TextCharBulletBuilder().from(this);
  }

  public String getChar() {
    return this._char;
  }
}
