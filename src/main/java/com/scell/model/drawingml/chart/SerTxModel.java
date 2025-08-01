package com.scell.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class SerTxModel {
  private final int type;

  private final Object value;

  public SerTxModel() {
    this(-1, null);
  }

  private SerTxModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static SerTxModel newStrRef(StrRefModel value) {
    return new SerTxModel(0, value);
  }

  public boolean isStrRef() {
    return this.type == 0;
  }

  public StrRefModel getStrRef() {
    return (StrRefModel) this.value;
  }

  public static SerTxModel newV(XstringValueModel value) {
    return new SerTxModel(1, value);
  }

  public boolean isV() {
    return this.type == 1;
  }

  public XstringValueModel getV() {
    return (XstringValueModel) this.value;
  }
}
