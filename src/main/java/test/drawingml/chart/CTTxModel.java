package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.drawingml.main.CTTextBodyModel;

public class CTTxModel {
  private final Integer type;

  private final Object value;

  public CTTxModel() {
    this(-1, null);
  }

  private CTTxModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTTxModel newStrRef(CTStrRefModel value) {
    return new CTTxModel(0, value);
  }

  public Boolean isStrRef() {
    return this.type == 0;
  }

  public CTStrRefModel getStrRef() {
    return (CTStrRefModel) this.value;
  }

  public static CTTxModel newRich(CTTextBodyModel value) {
    return new CTTxModel(1, value);
  }

  public Boolean isRich() {
    return this.type == 1;
  }

  public CTTextBodyModel getRich() {
    return (CTTextBodyModel) this.value;
  }
}
