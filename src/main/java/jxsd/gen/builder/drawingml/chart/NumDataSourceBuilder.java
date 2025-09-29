package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.NumDataModel;
import jxsd.gen.model.drawingml.chart.NumDataSourceModel;
import jxsd.gen.model.drawingml.chart.NumRefModel;

/**
 * This is a generated choice class.
 */
public class NumDataSourceBuilder {
  private int type;

  private Object value;

  public NumDataSourceBuilder() {
    this.type = -1;
    this.value = null;
  }

  public NumDataSourceBuilder setNumRef(NumRefModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public NumDataSourceBuilder setNumLit(NumDataModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public NumDataSourceBuilder from(NumDataSourceModel value) {
    this.type = -1;
    this.value = null;
    if (value.isNumRef()) {
      this.type = 0;
      this.value = value.getNumRef();
    }
    if (value.isNumLit()) {
      this.type = 1;
      this.value = value.getNumLit();
    }
    return this;
  }

  public NumDataSourceModel build() {
    if (this.type == -1) return new NumDataSourceModel();
    if (this.type == 0) return NumDataSourceModel.newNumRef((NumRefModel) this.value);
    if (this.type == 1) return NumDataSourceModel.newNumLit((NumDataModel) this.value);
    return null;
  }
}
