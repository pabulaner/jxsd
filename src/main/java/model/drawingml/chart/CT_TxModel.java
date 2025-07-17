package model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import model.drawingml.main.CT_TextBodyModel;

public class CT_TxModel {
  private final int type;

  private final Object value;

  public CT_TxModel() {
    this(-1, null);
  }

  private CT_TxModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_TxModel newStrRef(CT_StrRefModel value) {
    return new CT_TxModel(0, value);
  }

  public boolean isStrRef() {
    return this.type == 0;
  }

  public CT_StrRefModel getStrRef() {
    return (CT_StrRefModel) this.value;
  }

  public static CT_TxModel newRich(CT_TextBodyModel value) {
    return new CT_TxModel(1, value);
  }

  public boolean isRich() {
    return this.type == 1;
  }

  public CT_TextBodyModel getRich() {
    return (CT_TextBodyModel) this.value;
  }
}
