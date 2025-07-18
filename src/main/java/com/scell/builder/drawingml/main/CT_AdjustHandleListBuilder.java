package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjustHandleListModel;
import com.scell.model.drawingml.main.CT_PolarAdjustHandleModel;
import com.scell.model.drawingml.main.CT_XYAdjustHandleModel;
import java.lang.Object;
import java.util.List;

public class CT_AdjustHandleListBuilder {
  private List<CT_AdjustHandleListModel.AhXYOrAhPolarModel> ahXYOrAhPolar;

  public CT_AdjustHandleListBuilder() {
  }

  public CT_AdjustHandleListBuilder setAhXYOrAhPolar(
      List<CT_AdjustHandleListModel.AhXYOrAhPolarModel> ahXYOrAhPolar) {
    this.ahXYOrAhPolar = ahXYOrAhPolar;
    return this;
  }

  public CT_AdjustHandleListModel build() {
    return new CT_AdjustHandleListModel(this.ahXYOrAhPolar);
  }

  public CT_AdjustHandleListBuilder from(CT_AdjustHandleListModel value) {
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

    public AhXYOrAhPolarBuilder setAhXY(CT_XYAdjustHandleModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AhXYOrAhPolarBuilder setAhPolar(CT_PolarAdjustHandleModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_AdjustHandleListModel.AhXYOrAhPolarModel build() {
      if (this.type == -1) return new CT_AdjustHandleListModel.AhXYOrAhPolarModel();
      if (this.type == 0) return CT_AdjustHandleListModel.AhXYOrAhPolarModel.newAhXY((CT_XYAdjustHandleModel) this.value);
      if (this.type == 1) return CT_AdjustHandleListModel.AhXYOrAhPolarModel.newAhPolar((CT_PolarAdjustHandleModel) this.value);
      return null;
    }

    public AhXYOrAhPolarBuilder from(CT_AdjustHandleListModel.AhXYOrAhPolarModel value) {
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
