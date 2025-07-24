package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class AdjustHandleListModel {
  private final List<AhXYOrAhPolarModel> ahXYOrAhPolar;

  public AdjustHandleListModel(List<AhXYOrAhPolarModel> ahXYOrAhPolar) {
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

    public static AhXYOrAhPolarModel newAhXY(XYAdjustHandleModel value) {
      return new AhXYOrAhPolarModel(0, value);
    }

    public boolean isAhXY() {
      return this.type == 0;
    }

    public XYAdjustHandleModel getAhXY() {
      return (XYAdjustHandleModel) this.value;
    }

    public static AhXYOrAhPolarModel newAhPolar(PolarAdjustHandleModel value) {
      return new AhXYOrAhPolarModel(1, value);
    }

    public boolean isAhPolar() {
      return this.type == 1;
    }

    public PolarAdjustHandleModel getAhPolar() {
      return (PolarAdjustHandleModel) this.value;
    }
  }
}
