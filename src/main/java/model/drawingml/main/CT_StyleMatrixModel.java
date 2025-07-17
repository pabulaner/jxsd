package model.drawingml.main;

import model.XMLSchema.stringModel;

public class CT_StyleMatrixModel {
  private final stringModel name;

  private final CT_FillStyleListModel fillStyleLst;

  private final CT_LineStyleListModel lnStyleLst;

  private final CT_EffectStyleListModel effectStyleLst;

  private final CT_BackgroundFillStyleListModel bgFillStyleLst;

  public CT_StyleMatrixModel(stringModel name, CT_FillStyleListModel fillStyleLst,
      CT_LineStyleListModel lnStyleLst, CT_EffectStyleListModel effectStyleLst,
      CT_BackgroundFillStyleListModel bgFillStyleLst) {
    this.name = name;
    this.fillStyleLst = fillStyleLst;
    this.lnStyleLst = lnStyleLst;
    this.effectStyleLst = effectStyleLst;
    this.bgFillStyleLst = bgFillStyleLst;
  }

  public stringModel getName() {
    return this.name;
  }

  public CT_FillStyleListModel getFillStyleLst() {
    return this.fillStyleLst;
  }

  public CT_LineStyleListModel getLnStyleLst() {
    return this.lnStyleLst;
  }

  public CT_EffectStyleListModel getEffectStyleLst() {
    return this.effectStyleLst;
  }

  public CT_BackgroundFillStyleListModel getBgFillStyleLst() {
    return this.bgFillStyleLst;
  }
}
