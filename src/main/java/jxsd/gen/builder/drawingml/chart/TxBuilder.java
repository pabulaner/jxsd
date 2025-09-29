package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.StrRefModel;
import jxsd.gen.model.drawingml.chart.TxModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated choice class.
 */
public class TxBuilder {
  private int type;

  private Object value;

  public TxBuilder() {
    this.type = -1;
    this.value = null;
  }

  public TxBuilder setStrRef(StrRefModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public TxBuilder setRich(TextBodyModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public TxBuilder from(TxModel value) {
    this.type = -1;
    this.value = null;
    if (value.isStrRef()) {
      this.type = 0;
      this.value = value.getStrRef();
    }
    if (value.isRich()) {
      this.type = 1;
      this.value = value.getRich();
    }
    return this;
  }

  public TxModel build() {
    if (this.type == -1) return new TxModel();
    if (this.type == 0) return TxModel.newStrRef((StrRefModel) this.value);
    if (this.type == 1) return TxModel.newRich((TextBodyModel) this.value);
    return null;
  }
}
