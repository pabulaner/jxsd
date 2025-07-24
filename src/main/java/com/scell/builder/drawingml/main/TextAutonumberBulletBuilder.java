package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextAutonumberBulletModel;
import com.scell.model.drawingml.main.TextAutonumberSchemeModel;
import com.scell.model.drawingml.main.TextBulletStartAtNumModel;

public class TextAutonumberBulletBuilder {
  private TextAutonumberSchemeModel type;

  private TextBulletStartAtNumModel startAt;

  public TextAutonumberBulletBuilder() {
  }

  public TextAutonumberBulletBuilder setType(TextAutonumberSchemeModel type) {
    this.type = type;
    return this;
  }

  public TextAutonumberBulletBuilder setStartAt(TextBulletStartAtNumModel startAt) {
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
