package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrDirValueModel;

/**
 * This is a generated enum class.
 */
public class ErrDirValueBuilder {
  private ErrDirValueModel value;

  public ErrDirValueBuilder() {
  }

  public ErrDirValueBuilder setValue(ErrDirValueModel value) {
    this.value = value;
    return this;
  }

  public ErrDirValueBuilder from(ErrDirValueModel value) {
    this.value = value;
    return this;
  }

  public ErrDirValueModel build() {
    return this.value;
  }
}
