package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTTextSpacingModel {
  private final Integer type;

  private final Object value;

  public CTTextSpacingModel() {
    this(-1, null);
  }

  private CTTextSpacingModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTTextSpacingModel newSpcPct(CTTextSpacingPercentModel value) {
    return new CTTextSpacingModel(0, value);
  }

  public Boolean isSpcPct() {
    return this.type == 0;
  }

  public CTTextSpacingPercentModel getSpcPct() {
    return (CTTextSpacingPercentModel) this.value;
  }

  public static CTTextSpacingModel newSpcPts(CTTextSpacingPointModel value) {
    return new CTTextSpacingModel(1, value);
  }

  public Boolean isSpcPts() {
    return this.type == 1;
  }

  public CTTextSpacingPointModel getSpcPts() {
    return (CTTextSpacingPointModel) this.value;
  }
}
