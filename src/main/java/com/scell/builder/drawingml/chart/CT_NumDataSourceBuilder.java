package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_NumDataModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.chart.CT_NumRefModel;
import java.lang.Object;

public class CT_NumDataSourceBuilder {
  private int type;

  private Object value;

  public CT_NumDataSourceBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_NumDataSourceBuilder setNumRef(CT_NumRefModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_NumDataSourceBuilder setNumLit(CT_NumDataModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_NumDataSourceModel build() {
    if (this.type == -1) return new CT_NumDataSourceModel();
    if (this.type == 0) return CT_NumDataSourceModel.newNumRef((CT_NumRefModel) this.value);
    if (this.type == 1) return CT_NumDataSourceModel.newNumLit((CT_NumDataModel) this.value);
    return null;
  }

  public CT_NumDataSourceBuilder from(CT_NumDataSourceModel value) {
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
