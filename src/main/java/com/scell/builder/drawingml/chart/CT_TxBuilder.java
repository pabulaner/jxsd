package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_StrRefModel;
import com.scell.model.drawingml.chart.CT_TxModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.lang.Object;

public class CT_TxBuilder {
  private int type;

  private Object value;

  public CT_TxBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_TxBuilder setStrRef(CT_StrRefModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_TxBuilder setRich(CT_TextBodyModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_TxModel build() {
    if (this.type == -1) return new CT_TxModel();
    if (this.type == 0) return CT_TxModel.newStrRef((CT_StrRefModel) this.value);
    if (this.type == 1) return CT_TxModel.newRich((CT_TextBodyModel) this.value);
    return null;
  }

  public CT_TxBuilder from(CT_TxModel value) {
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
}
