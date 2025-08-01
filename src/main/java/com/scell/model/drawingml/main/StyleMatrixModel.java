package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;

public class StyleMatrixModel {
  private final StringValueModel name;

  private final FillStyleListModel fillStyleLst;

  private final LineStyleListModel lnStyleLst;

  private final EffectStyleListModel effectStyleLst;

  private final BackgroundFillStyleListModel bgFillStyleLst;

  public StyleMatrixModel(StringValueModel name, FillStyleListModel fillStyleLst,
      LineStyleListModel lnStyleLst, EffectStyleListModel effectStyleLst,
      BackgroundFillStyleListModel bgFillStyleLst) {
    this.name = name;
    this.fillStyleLst = fillStyleLst;
    this.lnStyleLst = lnStyleLst;
    this.effectStyleLst = effectStyleLst;
    this.bgFillStyleLst = bgFillStyleLst;
  }

  public StringValueModel getName() {
    return this.name;
  }

  public FillStyleListModel getFillStyleLst() {
    return this.fillStyleLst;
  }

  public LineStyleListModel getLnStyleLst() {
    return this.lnStyleLst;
  }

  public EffectStyleListModel getEffectStyleLst() {
    return this.effectStyleLst;
  }

  public BackgroundFillStyleListModel getBgFillStyleLst() {
    return this.bgFillStyleLst;
  }
}
