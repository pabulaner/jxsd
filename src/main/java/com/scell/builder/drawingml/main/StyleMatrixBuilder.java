package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.BackgroundFillStyleListModel;
import com.scell.model.drawingml.main.EffectStyleListModel;
import com.scell.model.drawingml.main.FillStyleListModel;
import com.scell.model.drawingml.main.LineStyleListModel;
import com.scell.model.drawingml.main.StyleMatrixModel;

public class StyleMatrixBuilder {
  private StringModel name;

  private FillStyleListModel fillStyleLst;

  private LineStyleListModel lnStyleLst;

  private EffectStyleListModel effectStyleLst;

  private BackgroundFillStyleListModel bgFillStyleLst;

  public StyleMatrixBuilder() {
  }

  public StyleMatrixBuilder setName(StringModel name) {
    this.name = name;
    return this;
  }

  public StyleMatrixBuilder setFillStyleLst(FillStyleListModel fillStyleLst) {
    this.fillStyleLst = fillStyleLst;
    return this;
  }

  public StyleMatrixBuilder setLnStyleLst(LineStyleListModel lnStyleLst) {
    this.lnStyleLst = lnStyleLst;
    return this;
  }

  public StyleMatrixBuilder setEffectStyleLst(EffectStyleListModel effectStyleLst) {
    this.effectStyleLst = effectStyleLst;
    return this;
  }

  public StyleMatrixBuilder setBgFillStyleLst(BackgroundFillStyleListModel bgFillStyleLst) {
    this.bgFillStyleLst = bgFillStyleLst;
    return this;
  }

  public StyleMatrixModel build() {
    return new StyleMatrixModel(this.name, this.fillStyleLst, this.lnStyleLst, this.effectStyleLst, this.bgFillStyleLst);
  }

  public StyleMatrixBuilder from(StyleMatrixModel value) {
    this.name = value.getName();
    this.fillStyleLst = value.getFillStyleLst();
    this.lnStyleLst = value.getLnStyleLst();
    this.effectStyleLst = value.getEffectStyleLst();
    this.bgFillStyleLst = value.getBgFillStyleLst();
    return this;
  }
}
