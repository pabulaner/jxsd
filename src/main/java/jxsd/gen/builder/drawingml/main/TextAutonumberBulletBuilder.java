package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextAutonumberBulletModel;
import jxsd.gen.model.drawingml.main.TextAutonumberSchemeValueModel;

/**
 * This is a generated sequence class.
 */
public class TextAutonumberBulletBuilder {
  private TextAutonumberSchemeValueModel type;

  private int startAt;

  public TextAutonumberBulletBuilder() {
  }

  public TextAutonumberBulletBuilder setType(TextAutonumberSchemeValueModel type) {
    this.type = type;
    return this;
  }

  public TextAutonumberBulletBuilder setStartAt(int startAt) {
    this.startAt = startAt;
    return this;
  }

  public TextAutonumberBulletBuilder from(TextAutonumberBulletModel value) {
    this.type = value.getType();
    this.startAt = value.getStartAt();
    return this;
  }

  public TextAutonumberBulletModel build() {
    return new TextAutonumberBulletModel(this.type, this.startAt);
  }
}
