package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GeomGuideModel;

/**
 * This is a generated sequence class.
 */
public class GeomGuideBuilder {
  private String fmla;

  private String name;

  public GeomGuideBuilder() {
  }

  public GeomGuideBuilder setFmla(String fmla) {
    this.fmla = fmla;
    return this;
  }

  public GeomGuideBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public GeomGuideBuilder from(GeomGuideModel value) {
    this.fmla = value.getFmla();
    this.name = value.getName();
    return this;
  }

  public GeomGuideModel build() {
    return new GeomGuideModel(this.fmla, this.name);
  }
}
