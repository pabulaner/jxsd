package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextAutonumberBulletBuilder;

/**
 * This is a generated sequence class.
 */
public class TextAutonumberBulletModel {
  private final TextAutonumberSchemeValueModel type;

  private final int startAt;

  public TextAutonumberBulletModel(TextAutonumberSchemeValueModel type, int startAt) {
    this.type = type;
    this.startAt = startAt;
  }

  public TextAutonumberBulletBuilder builder() {
    return new TextAutonumberBulletBuilder().from(this);
  }

  public TextAutonumberSchemeValueModel getType() {
    return this.type;
  }

  public int getStartAt() {
    return this.startAt;
  }
}
