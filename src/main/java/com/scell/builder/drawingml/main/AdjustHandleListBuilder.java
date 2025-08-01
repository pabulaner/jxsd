package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjustHandleListModel;
import com.scell.model.drawingml.main.PolarAdjustHandleModel;
import com.scell.model.drawingml.main.XYAdjustHandleModel;
import java.lang.Object;
import java.util.List;

public class AdjustHandleListBuilder {
  private List<AdjustHandleListModel.AhXYOrAhPolarValueModel> ahXYOrAhPolar;

  public AdjustHandleListBuilder() {
  }

  public AdjustHandleListBuilder setAhXYOrAhPolar(
      List<AdjustHandleListModel.AhXYOrAhPolarValueModel> ahXYOrAhPolar) {
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

  public static class AhXYOrAhPolarValueBuilder {
    private int type;

    private Object value;

    public AhXYOrAhPolarValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public AhXYOrAhPolarValueBuilder setAhXY(XYAdjustHandleModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AhXYOrAhPolarValueBuilder setAhPolar(PolarAdjustHandleModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AdjustHandleListModel.AhXYOrAhPolarValueModel build() {
      if (this.type == -1) return new AdjustHandleListModel.AhXYOrAhPolarValueModel();
      if (this.type == 0) return AdjustHandleListModel.AhXYOrAhPolarValueModel.newAhXY((XYAdjustHandleModel) this.value);
      if (this.type == 1) return AdjustHandleListModel.AhXYOrAhPolarValueModel.newAhPolar((PolarAdjustHandleModel) this.value);
      return null;
    }

    public AhXYOrAhPolarValueBuilder from(AdjustHandleListModel.AhXYOrAhPolarValueModel value) {
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
