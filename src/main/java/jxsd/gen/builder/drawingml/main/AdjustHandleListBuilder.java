package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.main.AdjustHandleListModel;
import jxsd.gen.model.drawingml.main.PolarAdjustHandleModel;
import jxsd.gen.model.drawingml.main.XYAdjustHandleModel;

/**
 * This is a generated sequence class.
 */
public class AdjustHandleListBuilder {
  private List<AdjustHandleListModel.AhXYOrAhPolar> ahXYOrAhPolar;

  public AdjustHandleListBuilder() {
  }

  public AdjustHandleListBuilder setAhXYOrAhPolar(
      List<AdjustHandleListModel.AhXYOrAhPolar> ahXYOrAhPolar) {
    this.ahXYOrAhPolar = ahXYOrAhPolar;
    return this;
  }

  public AdjustHandleListBuilder from(AdjustHandleListModel value) {
    this.ahXYOrAhPolar = value.getAhXYOrAhPolar();
    return this;
  }

  public AdjustHandleListModel build() {
    return new AdjustHandleListModel(this.ahXYOrAhPolar);
  }

  /**
   * This is a generated choice class.
   */
  public static class AhXYOrAhPolar {
    private int type;

    private Object value;

    public AhXYOrAhPolar() {
      this.type = -1;
      this.value = null;
    }

    public AhXYOrAhPolar setAhXY(XYAdjustHandleModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AhXYOrAhPolar setAhPolar(PolarAdjustHandleModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AhXYOrAhPolar from(AdjustHandleListModel.AhXYOrAhPolar value) {
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

    public AdjustHandleListModel.AhXYOrAhPolar build() {
      if (this.type == -1) return new AdjustHandleListModel.AhXYOrAhPolar();
      if (this.type == 0) return AdjustHandleListModel.AhXYOrAhPolar.newAhXY((XYAdjustHandleModel) this.value);
      if (this.type == 1) return AdjustHandleListModel.AhXYOrAhPolar.newAhPolar((PolarAdjustHandleModel) this.value);
      return null;
    }
  }
}
