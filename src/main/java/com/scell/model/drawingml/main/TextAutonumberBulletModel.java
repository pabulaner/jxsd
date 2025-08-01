package com.scell.model.drawingml.main;

public class TextAutonumberBulletModel {
  private final TextAutonumberSchemeValueModel type;

  private final TextBulletStartAtNumValueModel startAt;

  public TextAutonumberBulletModel(TextAutonumberSchemeValueModel type,
      TextBulletStartAtNumValueModel startAt) {
    this.type = type;
    this.startAt = startAt;
  }

  public TextAutonumberSchemeValueModel getType() {
    return this.type;
  }

  public TextBulletStartAtNumValueModel getStartAt() {
    return this.startAt;
  }
}
