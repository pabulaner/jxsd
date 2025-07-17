package model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class CT_SerTxModel {
  private final int type;

  private final Object value;

  public CT_SerTxModel() {
    this(-1, null);
  }

  private CT_SerTxModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_SerTxModel newStrRef(CT_StrRefModel value) {
    return new CT_SerTxModel(0, value);
  }

  public boolean isStrRef() {
    return this.type == 0;
  }

  public CT_StrRefModel getStrRef() {
    return (CT_StrRefModel) this.value;
  }

  public static CT_SerTxModel newV(ST_XstringModel value) {
    return new CT_SerTxModel(1, value);
  }

  public boolean isV() {
    return this.type == 1;
  }

  public ST_XstringModel getV() {
    return (ST_XstringModel) this.value;
  }
}
