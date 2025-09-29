package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.main.AdjustHandleListBuilder;

/**
 * This is a generated sequence class.
 */
public class AdjustHandleListModel {
  private final List<AhXYOrAhPolar> ahXYOrAhPolar;

  public AdjustHandleListModel(List<AhXYOrAhPolar> ahXYOrAhPolar) {
    this.ahXYOrAhPolar = ahXYOrAhPolar;
  }

  public AdjustHandleListBuilder builder() {
    return new AdjustHandleListBuilder().from(this);
  }

  public List<AhXYOrAhPolar> getAhXYOrAhPolar() {
    return this.ahXYOrAhPolar;
  }

  /**
   * This is a generated choice class.
   */
  public static class AhXYOrAhPolar {
    private final int type;

    private final Object value;

    public AhXYOrAhPolar() {
      this(-1, null);
    }

    private AhXYOrAhPolar(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public AdjustHandleListBuilder.AhXYOrAhPolar builder() {
      return new AdjustHandleListBuilder.AhXYOrAhPolar().from(this);
    }

    public static AhXYOrAhPolar newAhXY(XYAdjustHandleModel value) {
      return new AhXYOrAhPolar(0, value);
    }

    public boolean isAhXY() {
      return this.type == 0;
    }

    public XYAdjustHandleModel getAhXY() {
      return (XYAdjustHandleModel) this.value;
    }

    public static AhXYOrAhPolar newAhPolar(PolarAdjustHandleModel value) {
      return new AhXYOrAhPolar(1, value);
    }

    public boolean isAhPolar() {
      return this.type == 1;
    }

    public PolarAdjustHandleModel getAhPolar() {
      return (PolarAdjustHandleModel) this.value;
    }
  }
}
