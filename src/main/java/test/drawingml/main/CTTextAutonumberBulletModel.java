package test.drawingml.main;

public class CTTextAutonumberBulletModel {
  private final STTextAutonumberSchemeModel type;

  private final STTextBulletStartAtNumModel startAt;

  public CTTextAutonumberBulletModel(STTextAutonumberSchemeModel type,
      STTextBulletStartAtNumModel startAt) {
    this.type = type;
    this.startAt = startAt;
  }

  public STTextAutonumberSchemeModel getType() {
    return this.type;
  }

  public STTextBulletStartAtNumModel getStartAt() {
    return this.startAt;
  }
}
