package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjustHandleListModel;
import com.scell.model.drawingml.main.PolarAdjustHandleModel;
import com.scell.model.drawingml.main.XYAdjustHandleModel;
import java.lang.Object;
import java.util.List;

public class AdjustHandleListBuilder {
  private List<AdjustHandleListModel.AhXYOrAhPolarModel> ahXYOrAhPolar;

  public AdjustHandleListBuilder() {
  }

  public AdjustHandleListBuilder setAhXYOrAhPolar(
      List<AdjustHandleListModel.AhXYOrAhPolarModel> ahXYOrAhPolar) {
    this.ahXYOrAhPolar = ahXYOrAhPolar;
    return this;
  }

  public AdjustHandleListModel build() {
    return new AdjustHandleListModel(this.ahXYOrAhPolar);
  }

  public AdjustHandleListBuilder from(AdjustHandleListModel value) {
    this.ahXYOrAhPolar = value.getAhXYOrAhPolar();
    return this;
  }

  public static class AhXYOrAhPolarBuilder {
    private int type;

    private Object value;

    public AhXYOrAhPolarBuilder() {
      this.type = -1;
      this.value = null;
    }

    public AhXYOrAhPolarBuilder setAhXY(XYAdjustHandleModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AhXYOrAhPolarBuilder setAhPolar(PolarAdjustHandleModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AdjustHandleListModel.AhXYOrAhPolarModel build() {
      if (this.type == -1) return new AdjustHandleListModel.AhXYOrAhPolarModel();
      if (this.type == 0) return AdjustHandleListModel.AhXYOrAhPolarModel.newAhXY((XYAdjustHandleModel) this.value);
      if (this.type == 1) return AdjustHandleListModel.AhXYOrAhPolarModel.newAhPolar((PolarAdjustHandleModel) this.value);
      return null;
    }

    public AhXYOrAhPolarBuilder from(AdjustHandleListModel.AhXYOrAhPolarModel value) {
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
}
