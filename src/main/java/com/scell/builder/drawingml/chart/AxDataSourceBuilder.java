package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxDataSourceModel;
import com.scell.model.drawingml.chart.MultiLvlStrRefModel;
import com.scell.model.drawingml.chart.NumDataModel;
import com.scell.model.drawingml.chart.NumRefModel;
import com.scell.model.drawingml.chart.StrDataModel;
import com.scell.model.drawingml.chart.StrRefModel;
import java.lang.Object;

public class AxDataSourceBuilder {
  private int type;

  private Object value;

  public AxDataSourceBuilder() {
    this.type = -1;
    this.value = null;
  }

  public AxDataSourceBuilder setMultiLvlStrRef(MultiLvlStrRefModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public AxDataSourceBuilder setNumRef(NumRefModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public AxDataSourceBuilder setNumLit(NumDataModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public AxDataSourceBuilder setStrRef(StrRefModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public AxDataSourceBuilder setStrLit(StrDataModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public AxDataSourceModel build() {
    if (this.type == -1) return new AxDataSourceModel();
    if (this.type == 0) return AxDataSourceModel.newMultiLvlStrRef((MultiLvlStrRefModel) this.value);
    if (this.type == 1) return AxDataSourceModel.newNumRef((NumRefModel) this.value);
    if (this.type == 2) return AxDataSourceModel.newNumLit((NumDataModel) this.value);
    if (this.type == 3) return AxDataSourceModel.newStrRef((StrRefModel) this.value);
    if (this.type == 4) return AxDataSourceModel.newStrLit((StrDataModel) this.value);
    return null;
  }

  public AxDataSourceBuilder from(AxDataSourceModel value) {
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
