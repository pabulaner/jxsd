package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BlipModel;
import jxsd.gen.model.drawingml.main.TextBlipBulletModel;

/**
 * This is a generated sequence class.
 */
public class TextBlipBulletBuilder {
  private BlipModel blip;

  public TextBlipBulletBuilder() {
  }

  public TextBlipBulletBuilder setBlip(BlipModel blip) {
    this.blip = blip;
    return this;
  }

  public TextBlipBulletBuilder from(TextBlipBulletModel value) {
    this.blip = value.getBlip();
    return this;
  }

  public TextBlipBulletModel build() {
    return new TextBlipBulletModel(this.blip);
  }
}
