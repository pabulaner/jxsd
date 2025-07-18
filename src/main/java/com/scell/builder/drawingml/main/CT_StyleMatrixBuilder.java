package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_BackgroundFillStyleListModel;
import com.scell.model.drawingml.main.CT_EffectStyleListModel;
import com.scell.model.drawingml.main.CT_FillStyleListModel;
import com.scell.model.drawingml.main.CT_LineStyleListModel;
import com.scell.model.drawingml.main.CT_StyleMatrixModel;

public class CT_StyleMatrixBuilder {
  private StringModel name;

  private CT_FillStyleListModel fillStyleLst;

  private CT_LineStyleListModel lnStyleLst;

  private CT_EffectStyleListModel effectStyleLst;

  private CT_BackgroundFillStyleListModel bgFillStyleLst;

  public CT_StyleMatrixBuilder() {
  }

  public CT_StyleMatrixBuilder setName(StringModel name) {
    this.name = name;
    return this;
  }

  public CT_StyleMatrixBuilder setFillStyleLst(CT_FillStyleListModel fillStyleLst) {
    this.fillStyleLst = fillStyleLst;
    return this;
  }

  public CT_StyleMatrixBuilder setLnStyleLst(CT_LineStyleListModel lnStyleLst) {
    this.lnStyleLst = lnStyleLst;
    return this;
  }

  public CT_StyleMatrixBuilder setEffectStyleLst(CT_EffectStyleListModel effectStyleLst) {
    this.effectStyleLst = effectStyleLst;
    return this;
  }

  public CT_StyleMatrixBuilder setBgFillStyleLst(CT_BackgroundFillStyleListModel bgFillStyleLst) {
    this.bgFillStyleLst = bgFillStyleLst;
    return this;
  }

  public CT_StyleMatrixModel build() {
    return new CT_StyleMatrixModel(this.name, this.fillStyleLst, this.lnStyleLst, this.effectStyleLst, this.bgFillStyleLst);
  }

  public CT_StyleMatrixBuilder from(CT_StyleMatrixModel value) {
    this.name = value.getName();
    this.fillStyleLst = value.getFillStyleLst();
    this.lnStyleLst = value.getLnStyleLst();
    this.effectStyleLst = value.getEffectStyleLst();
    this.bgFillStyleLst = value.getBgFillStyleLst();
    return this;
  }
}
