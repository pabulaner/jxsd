package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ExternalDataBuilder;

/**
 * This is a generated sequence class.
 */
public class ExternalDataModel {
  private final String id;

  private final BooleanModel autoUpdate;

  public ExternalDataModel(String id, BooleanModel autoUpdate) {
    this.id = id;
    this.autoUpdate = autoUpdate;
  }

  public ExternalDataBuilder builder() {
    return new ExternalDataBuilder().from(this);
  }

  public String getId() {
    return this.id;
  }

  public BooleanModel getAutoUpdate() {
    return this.autoUpdate;
  }
}
