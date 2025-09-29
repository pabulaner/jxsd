package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextBlipBulletBuilder;

/**
 * This is a generated sequence class.
 */
public class TextBlipBulletModel {
  private final BlipModel blip;

  public TextBlipBulletModel(BlipModel blip) {
    this.blip = blip;
  }

  public TextBlipBulletBuilder builder() {
    return new TextBlipBulletBuilder().from(this);
  }

  public BlipModel getBlip() {
    return this.blip;
  }
}
