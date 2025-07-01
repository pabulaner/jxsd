package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTAdjustHandleListModel {
  private final Integer type;

  private final Object value;

  public CTAdjustHandleListModel() {
    this(-1, null);
  }

  private CTAdjustHandleListModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTAdjustHandleListModel newAhXY(CTXYAdjustHandleModel value) {
    return new CTAdjustHandleListModel(0, value);
  }

  public Boolean isAhXY() {
    return this.type == 0;
  }

  public CTXYAdjustHandleModel getAhXY() {
    return (CTXYAdjustHandleModel) this.value;
  }

  public static CTAdjustHandleListModel newAhPolar(CTPolarAdjustHandleModel value) {
    return new CTAdjustHandleListModel(1, value);
  }

  public Boolean isAhPolar() {
    return this.type == 1;
  }

  public CTPolarAdjustHandleModel getAhPolar() {
    return (CTPolarAdjustHandleModel) this.value;
  }
}
