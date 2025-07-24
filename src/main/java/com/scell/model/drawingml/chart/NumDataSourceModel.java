package com.scell.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class NumDataSourceModel {
  private final int type;

  private final Object value;

  public NumDataSourceModel() {
    this(-1, null);
  }

  private NumDataSourceModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static NumDataSourceModel newNumRef(NumRefModel value) {
    return new NumDataSourceModel(0, value);
  }

  public boolean isNumRef() {
    return this.type == 0;
  }

  public NumRefModel getNumRef() {
    return (NumRefModel) this.value;
  }

  public static NumDataSourceModel newNumLit(NumDataModel value) {
    return new NumDataSourceModel(1, value);
  }

  public boolean isNumLit() {
    return this.type == 1;
  }

  public NumDataModel getNumLit() {
    return (NumDataModel) this.value;
  }
}
