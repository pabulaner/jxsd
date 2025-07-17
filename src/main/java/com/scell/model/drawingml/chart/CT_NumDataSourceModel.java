package com.scell.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class CT_NumDataSourceModel {
  private final int type;

  private final Object value;

  public CT_NumDataSourceModel() {
    this(-1, null);
  }

  private CT_NumDataSourceModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_NumDataSourceModel newNumRef(CT_NumRefModel value) {
    return new CT_NumDataSourceModel(0, value);
  }

  public boolean isNumRef() {
    return this.type == 0;
  }

  public CT_NumRefModel getNumRef() {
    return (CT_NumRefModel) this.value;
  }

  public static CT_NumDataSourceModel newNumLit(CT_NumDataModel value) {
    return new CT_NumDataSourceModel(1, value);
  }

  public boolean isNumLit() {
    return this.type == 1;
  }

  public CT_NumDataModel getNumLit() {
    return (CT_NumDataModel) this.value;
  }
}
