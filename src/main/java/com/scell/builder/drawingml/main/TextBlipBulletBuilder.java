package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlipModel;
import com.scell.model.drawingml.main.TextBlipBulletModel;

public class TextBlipBulletBuilder {
  private BlipModel blip;

  public TextBlipBulletBuilder() {
  }

  public TextBlipBulletBuilder setBlip(BlipModel blip) {
    this.blip = blip;
    return this;
  }

  public TextBlipBulletModel build() {
    return new TextBlipBulletModel(this.blip);
  }

  public TextBlipBulletBuilder from(TextBlipBulletModel value) {
    this.blip = value.getBlip();
    return this;
  }
}
