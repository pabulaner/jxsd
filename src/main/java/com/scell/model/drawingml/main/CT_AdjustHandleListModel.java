package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_AdjustHandleListModel {
  private final List<AhXYOrAhPolarModel> ahXYOrAhPolar;

  public CT_AdjustHandleListModel(List<AhXYOrAhPolarModel> ahXYOrAhPolar) {
    this.ahXYOrAhPolar = ahXYOrAhPolar;
  }

  public List<AhXYOrAhPolarModel> getAhXYOrAhPolar() {
    return this.ahXYOrAhPolar;
  }

  public static class AhXYOrAhPolarModel {
    private final int type;

    private final Object value;

    public AhXYOrAhPolarModel() {
      this(-1, null);
    }

    private AhXYOrAhPolarModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static AhXYOrAhPolarModel newAhXY(CT_XYAdjustHandleModel value) {
      return new AhXYOrAhPolarModel(0, value);
    }

    public boolean isAhXY() {
      return this.type == 0;
    }

    public CT_XYAdjustHandleModel getAhXY() {
      return (CT_XYAdjustHandleModel) this.value;
    }

    public static AhXYOrAhPolarModel newAhPolar(CT_PolarAdjustHandleModel value) {
      return new AhXYOrAhPolarModel(1, value);
    }

    public boolean isAhPolar() {
      return this.type == 1;
    }

    public CT_PolarAdjustHandleModel getAhPolar() {
      return (CT_PolarAdjustHandleModel) this.value;
    }
  }
}
