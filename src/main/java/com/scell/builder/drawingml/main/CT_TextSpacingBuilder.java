package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextSpacingModel;
import com.scell.model.drawingml.main.CT_TextSpacingPercentModel;
import com.scell.model.drawingml.main.CT_TextSpacingPointModel;
import java.lang.Object;

public class CT_TextSpacingBuilder {
  private int type;

  private Object value;

  public CT_TextSpacingBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_TextSpacingBuilder setSpcPct(CT_TextSpacingPercentModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_TextSpacingBuilder setSpcPts(CT_TextSpacingPointModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_TextSpacingModel build() {
    if (this.type == -1) return new CT_TextSpacingModel();
    if (this.type == 0) return CT_TextSpacingModel.newSpcPct((CT_TextSpacingPercentModel) this.value);
    if (this.type == 1) return CT_TextSpacingModel.newSpcPts((CT_TextSpacingPointModel) this.value);
    return null;
  }

  public CT_TextSpacingBuilder from(CT_TextSpacingModel value) {
    this.type = -1;
    this.value = null;
    if (value.isSpcPct()) {
      this.type = 0;
      this.value = value.getSpcPct();
    }
    if (value.isSpcPts()) {
      this.type = 1;
      this.value = value.getSpcPts();
    }
    return this;
  }
}
