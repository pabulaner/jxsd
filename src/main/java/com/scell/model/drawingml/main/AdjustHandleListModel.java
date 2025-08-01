package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class AdjustHandleListModel {
  private final List<AhXYOrAhPolarValueModel> ahXYOrAhPolar;

  public AdjustHandleListModel(List<AhXYOrAhPolarValueModel> ahXYOrAhPolar) {
    this.ahXYOrAhPolar = ahXYOrAhPolar;
  }

  public List<AhXYOrAhPolarValueModel> getAhXYOrAhPolar() {
    return this.ahXYOrAhPolar;
  }

  public static class AhXYOrAhPolarValueModel {
    private final int type;

    private final Object value;

    public AhXYOrAhPolarValueModel() {
      this(-1, null);
    }

    private AhXYOrAhPolarValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static AhXYOrAhPolarValueModel newAhXY(XYAdjustHandleModel value) {
      return new AhXYOrAhPolarValueModel(0, value);
    }

    public boolean isAhXY() {
      return this.type == 0;
    }

    public XYAdjustHandleModel getAhXY() {
      return (XYAdjustHandleModel) this.value;
    }

    public static AhXYOrAhPolarValueModel newAhPolar(PolarAdjustHandleModel value) {
      return new AhXYOrAhPolarValueModel(1, value);
    }

    public boolean isAhPolar() {
      return this.type == 1;
    }

    public PolarAdjustHandleModel getAhPolar() {
      return (PolarAdjustHandleModel) this.value;
    }
  }
}
