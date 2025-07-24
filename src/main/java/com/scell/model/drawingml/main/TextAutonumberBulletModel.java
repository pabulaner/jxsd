package com.scell.model.drawingml.main;

public class TextAutonumberBulletModel {
  private final TextAutonumberSchemeModel type;

  private final TextBulletStartAtNumModel startAt;

  public TextAutonumberBulletModel(TextAutonumberSchemeModel type,
      TextBulletStartAtNumModel startAt) {
    this.type = type;
    this.startAt = startAt;
  }

  public TextAutonumberSchemeModel getType() {
    return this.type;
  }

  public TextBulletStartAtNumModel getStartAt() {
    return this.startAt;
  }
}
