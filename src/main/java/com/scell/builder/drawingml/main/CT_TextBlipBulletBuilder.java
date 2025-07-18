package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BlipModel;
import com.scell.model.drawingml.main.CT_TextBlipBulletModel;

public class CT_TextBlipBulletBuilder {
  private CT_BlipModel blip;

  public CT_TextBlipBulletBuilder() {
  }

  public CT_TextBlipBulletBuilder setBlip(CT_BlipModel blip) {
    this.blip = blip;
    return this;
  }

  public CT_TextBlipBulletModel build() {
    return new CT_TextBlipBulletModel(this.blip);
  }

  public CT_TextBlipBulletBuilder from(CT_TextBlipBulletModel value) {
    this.blip = value.getBlip();
    return this;
  }
}
