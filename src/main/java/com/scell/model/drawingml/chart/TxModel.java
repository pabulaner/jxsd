package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.TextBodyModel;
import java.lang.Integer;
import java.lang.Object;

public class TxModel {
  private final int type;

  private final Object value;

  public TxModel() {
    this(-1, null);
  }

  private TxModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static TxModel newStrRef(StrRefModel value) {
    return new TxModel(0, value);
  }

  public boolean isStrRef() {
    return this.type == 0;
  }

  public StrRefModel getStrRef() {
    return (StrRefModel) this.value;
  }

  public static TxModel newRich(TextBodyModel value) {
    return new TxModel(1, value);
  }

  public boolean isRich() {
    return this.type == 1;
  }

  public TextBodyModel getRich() {
    return (TextBodyModel) this.value;
  }
}
