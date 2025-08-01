package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextAutonumberBulletModel;
import com.scell.model.drawingml.main.TextAutonumberSchemeValueModel;
import com.scell.model.drawingml.main.TextBulletStartAtNumValueModel;

public class TextAutonumberBulletBuilder {
  private TextAutonumberSchemeValueModel type;

  private TextBulletStartAtNumValueModel startAt;

  public TextAutonumberBulletBuilder() {
  }

  public TextAutonumberBulletBuilder setType(TextAutonumberSchemeValueModel type) {
    this.type = type;
    return this;
  }

  public TextAutonumberBulletBuilder setStartAt(TextBulletStartAtNumValueModel startAt) {
    this.startAt = startAt;
    return this;
  }

  public TextAutonumberBulletModel build() {
    return new TextAutonumberBulletModel(this.type, this.startAt);
  }

  public TextAutonumberBulletBuilder from(TextAutonumberBulletModel value) {
    this.type = value.getType();
    this.startAt = value.getStartAt();
    return this;
  }
}
