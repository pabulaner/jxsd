package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RelIdModel;

/**
 * This is a generated sequence class.
 */
public class RelIdBuilder {
  private String id;

  public RelIdBuilder() {
  }

  public RelIdBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public RelIdBuilder from(RelIdModel value) {
    this.id = value.getId();
    return this;
  }

  public RelIdModel build() {
    return new RelIdModel(this.id);
  }
}
