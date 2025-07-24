package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.NumDataModel;
import com.scell.model.drawingml.chart.NumDataSourceModel;
import com.scell.model.drawingml.chart.NumRefModel;
import java.lang.Object;

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

  public NumDataSourceModel build() {
    if (this.type == -1) return new NumDataSourceModel();
    if (this.type == 0) return NumDataSourceModel.newNumRef((NumRefModel) this.value);
    if (this.type == 1) return NumDataSourceModel.newNumLit((NumDataModel) this.value);
    return null;
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
}
