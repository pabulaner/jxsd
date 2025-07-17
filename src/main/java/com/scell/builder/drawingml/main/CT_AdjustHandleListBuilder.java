package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjustHandleListModel;
import com.scell.model.drawingml.main.CT_PolarAdjustHandleModel;
import com.scell.model.drawingml.main.CT_XYAdjustHandleModel;
import java.lang.Object;

public class CT_AdjustHandleListBuilder {
  private int type;

  private Object value;

  public CT_AdjustHandleListBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_AdjustHandleListBuilder setAhXY(CT_XYAdjustHandleModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_AdjustHandleListBuilder setAhPolar(CT_PolarAdjustHandleModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_AdjustHandleListModel build() {
    if (this.type == -1) return new CT_AdjustHandleListModel();
    if (this.type == 0) return CT_AdjustHandleListModel.newAhXY((CT_XYAdjustHandleModel) this.value);
    if (this.type == 1) return CT_AdjustHandleListModel.newAhPolar((CT_PolarAdjustHandleModel) this.value);
    return null;
  }

  public CT_AdjustHandleListBuilder from(CT_AdjustHandleListModel value) {
    this.type = -1;
    this.value = null;
    if (value.isAhXY()) {
      this.type = 0;
      this.value = value.getAhXY();
    }
    if (value.isAhPolar()) {
      this.type = 1;
      this.value = value.getAhPolar();
    }
    return this;
  }
}
