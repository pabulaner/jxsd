package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import com.scell.model.drawingml.chart.CT_MultiLvlStrRefModel;
import com.scell.model.drawingml.chart.CT_NumDataModel;
import com.scell.model.drawingml.chart.CT_NumRefModel;
import com.scell.model.drawingml.chart.CT_StrDataModel;
import com.scell.model.drawingml.chart.CT_StrRefModel;
import java.lang.Object;

public class CT_AxDataSourceBuilder {
  private int type;

  private Object value;

  public CT_AxDataSourceBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_AxDataSourceBuilder setMultiLvlStrRef(CT_MultiLvlStrRefModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_AxDataSourceBuilder setNumRef(CT_NumRefModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_AxDataSourceBuilder setNumLit(CT_NumDataModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public CT_AxDataSourceBuilder setStrRef(CT_StrRefModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public CT_AxDataSourceBuilder setStrLit(CT_StrDataModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public CT_AxDataSourceModel build() {
    if (this.type == -1) return new CT_AxDataSourceModel();
    if (this.type == 0) return CT_AxDataSourceModel.newMultiLvlStrRef((CT_MultiLvlStrRefModel) this.value);
    if (this.type == 1) return CT_AxDataSourceModel.newNumRef((CT_NumRefModel) this.value);
    if (this.type == 2) return CT_AxDataSourceModel.newNumLit((CT_NumDataModel) this.value);
    if (this.type == 3) return CT_AxDataSourceModel.newStrRef((CT_StrRefModel) this.value);
    if (this.type == 4) return CT_AxDataSourceModel.newStrLit((CT_StrDataModel) this.value);
    return null;
  }

  public CT_AxDataSourceBuilder from(CT_AxDataSourceModel value) {
    this.type = -1;
    this.value = null;
    if (value.isMultiLvlStrRef()) {
      this.type = 0;
      this.value = value.getMultiLvlStrRef();
    }
    if (value.isNumRef()) {
      this.type = 1;
      this.value = value.getNumRef();
    }
    if (value.isNumLit()) {
      this.type = 2;
      this.value = value.getNumLit();
    }
    if (value.isStrRef()) {
      this.type = 3;
      this.value = value.getStrRef();
    }
    if (value.isStrLit()) {
      this.type = 4;
      this.value = value.getStrLit();
    }
    return this;
  }
}
