package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ExternalDataModel;

/**
 * This is a generated sequence class.
 */
public class ExternalDataBuilder {
  private String id;

  private BooleanModel autoUpdate;

  public ExternalDataBuilder() {
  }

  public ExternalDataBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public ExternalDataBuilder setAutoUpdate(BooleanModel autoUpdate) {
    this.autoUpdate = autoUpdate;
    return this;
  }

  public ExternalDataBuilder from(ExternalDataModel value) {
    this.id = value.getId();
    this.autoUpdate = value.getAutoUpdate();
    return this;
  }

  public ExternalDataModel build() {
    return new ExternalDataModel(this.id, this.autoUpdate);
  }
}
