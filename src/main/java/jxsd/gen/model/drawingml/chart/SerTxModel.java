package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.chart.SerTxBuilder;

/**
 * This is a generated choice class.
 */
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

  public SerTxBuilder builder() {
    return new SerTxBuilder().from(this);
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

  public static SerTxModel newV(String value) {
    return new SerTxModel(1, value);
  }

  public boolean isV() {
    return this.type == 1;
  }

  public String getV() {
    return (String) this.value;
  }
}
