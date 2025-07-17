package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_TextSpacingModel {
  private final int type;

  private final Object value;

  public CT_TextSpacingModel() {
    this(-1, null);
  }

  private CT_TextSpacingModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_TextSpacingModel newSpcPct(CT_TextSpacingPercentModel value) {
    return new CT_TextSpacingModel(0, value);
  }

  public boolean isSpcPct() {
    return this.type == 0;
  }

  public CT_TextSpacingPercentModel getSpcPct() {
    return (CT_TextSpacingPercentModel) this.value;
  }

  public static CT_TextSpacingModel newSpcPts(CT_TextSpacingPointModel value) {
    return new CT_TextSpacingModel(1, value);
  }

  public boolean isSpcPts() {
    return this.type == 1;
  }

  public CT_TextSpacingPointModel getSpcPts() {
    return (CT_TextSpacingPointModel) this.value;
  }
}
