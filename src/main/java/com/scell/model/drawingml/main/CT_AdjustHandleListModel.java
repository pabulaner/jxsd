package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_AdjustHandleListModel {
  private final int type;

  private final Object value;

  public CT_AdjustHandleListModel() {
    this(-1, null);
  }

  private CT_AdjustHandleListModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_AdjustHandleListModel newAhXY(CT_XYAdjustHandleModel value) {
    return new CT_AdjustHandleListModel(0, value);
  }

  public boolean isAhXY() {
    return this.type == 0;
  }

  public CT_XYAdjustHandleModel getAhXY() {
    return (CT_XYAdjustHandleModel) this.value;
  }

  public static CT_AdjustHandleListModel newAhPolar(CT_PolarAdjustHandleModel value) {
    return new CT_AdjustHandleListModel(1, value);
  }

  public boolean isAhPolar() {
    return this.type == 1;
  }

  public CT_PolarAdjustHandleModel getAhPolar() {
    return (CT_PolarAdjustHandleModel) this.value;
  }
}
