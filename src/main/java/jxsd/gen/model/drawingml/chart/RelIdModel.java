package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.RelIdBuilder;

/**
 * This is a generated sequence class.
 */
public class RelIdModel {
  private final String id;

  public RelIdModel(String id) {
    this.id = id;
  }

  public RelIdBuilder builder() {
    return new RelIdBuilder().from(this);
  }

  public String getId() {
    return this.id;
  }
}
