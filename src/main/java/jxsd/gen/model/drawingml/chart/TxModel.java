package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.chart.TxBuilder;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated choice class.
 */
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

  public TxBuilder builder() {
    return new TxBuilder().from(this);
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
