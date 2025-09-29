package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.GeomGuideBuilder;

/**
 * This is a generated sequence class.
 */
public class GeomGuideModel {
  private final String fmla;

  private final String name;

  public GeomGuideModel(String fmla, String name) {
    this.fmla = fmla;
    this.name = name;
  }

  public GeomGuideBuilder builder() {
    return new GeomGuideBuilder().from(this);
  }

  public String getFmla() {
    return this.fmla;
  }

  public String getName() {
    return this.name;
  }
}
