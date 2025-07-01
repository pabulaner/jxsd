package test.drawingml.main;

import test.XMLSchema.StringModel;

public class CTStyleMatrixModel {
  private final StringModel name;

  private final CTFillStyleListModel fillStyleLst;

  private final CTLineStyleListModel lnStyleLst;

  private final CTEffectStyleListModel effectStyleLst;

  private final CTBackgroundFillStyleListModel bgFillStyleLst;

  public CTStyleMatrixModel(StringModel name, CTFillStyleListModel fillStyleLst,
      CTLineStyleListModel lnStyleLst, CTEffectStyleListModel effectStyleLst,
      CTBackgroundFillStyleListModel bgFillStyleLst) {
    this.name = name;
    this.fillStyleLst = fillStyleLst;
    this.lnStyleLst = lnStyleLst;
    this.effectStyleLst = effectStyleLst;
    this.bgFillStyleLst = bgFillStyleLst;
  }

  public StringModel getName() {
    return this.name;
  }

  public CTFillStyleListModel getFillStyleLst() {
    return this.fillStyleLst;
  }

  public CTLineStyleListModel getLnStyleLst() {
    return this.lnStyleLst;
  }

  public CTEffectStyleListModel getEffectStyleLst() {
    return this.effectStyleLst;
  }

  public CTBackgroundFillStyleListModel getBgFillStyleLst() {
    return this.bgFillStyleLst;
  }
}
