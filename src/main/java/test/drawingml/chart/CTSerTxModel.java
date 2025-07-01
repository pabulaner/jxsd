package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTSerTxModel {
  private final Integer type;

  private final Object value;

  public CTSerTxModel() {
    this(-1, null);
  }

  private CTSerTxModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTSerTxModel newStrRef(CTStrRefModel value) {
    return new CTSerTxModel(0, value);
  }

  public Boolean isStrRef() {
    return this.type == 0;
  }

  public CTStrRefModel getStrRef() {
    return (CTStrRefModel) this.value;
  }

  public static CTSerTxModel newV(STXstringModel value) {
    return new CTSerTxModel(1, value);
  }

  public Boolean isV() {
    return this.type == 1;
  }

  public STXstringModel getV() {
    return (STXstringModel) this.value;
  }
}
