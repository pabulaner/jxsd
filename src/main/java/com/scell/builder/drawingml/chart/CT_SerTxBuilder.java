package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SerTxModel;
import com.scell.model.drawingml.chart.CT_StrRefModel;
import com.scell.model.drawingml.chart.ST_XstringModel;
import java.lang.Object;

public class CT_SerTxBuilder {
  private int type;

  private Object value;

  public CT_SerTxBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_SerTxBuilder setStrRef(CT_StrRefModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_SerTxBuilder setV(ST_XstringModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_SerTxModel build() {
    if (this.type == -1) return new CT_SerTxModel();
    if (this.type == 0) return CT_SerTxModel.newStrRef((CT_StrRefModel) this.value);
    if (this.type == 1) return CT_SerTxModel.newV((ST_XstringModel) this.value);
    return null;
  }

  public CT_SerTxBuilder from(CT_SerTxModel value) {
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
}
