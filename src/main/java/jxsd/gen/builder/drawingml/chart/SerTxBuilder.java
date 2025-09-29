package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.SerTxModel;
import jxsd.gen.model.drawingml.chart.StrRefModel;

/**
 * This is a generated choice class.
 */
public class SerTxBuilder {
  private int type;

  private Object value;

  public SerTxBuilder() {
    this.type = -1;
    this.value = null;
  }

  public SerTxBuilder setStrRef(StrRefModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public SerTxBuilder setV(String value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public SerTxBuilder from(SerTxModel value) {
    this.type = -1;
    this.value = null;
    if (value.isStrRef()) {
      this.type = 0;
      this.value = value.getStrRef();
    }
    if (value.isV()) {
      this.type = 1;
      this.value = value.getV();
    }
    return this;
  }

  public SerTxModel build() {
    if (this.type == -1) return new SerTxModel();
    if (this.type == 0) return SerTxModel.newStrRef((StrRefModel) this.value);
    if (this.type == 1) return SerTxModel.newV((String) this.value);
    return null;
  }
}
