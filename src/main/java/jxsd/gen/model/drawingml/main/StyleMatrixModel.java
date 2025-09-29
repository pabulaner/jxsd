package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.StyleMatrixBuilder;

/**
 * This is a generated sequence class.
 */
public class StyleMatrixModel {
  private final String name;

  private final FillStyleListModel fillStyleLst;

  private final LineStyleListModel lnStyleLst;

  private final EffectStyleListModel effectStyleLst;

  private final BackgroundFillStyleListModel bgFillStyleLst;

  public StyleMatrixModel(String name, FillStyleListModel fillStyleLst,
      LineStyleListModel lnStyleLst, EffectStyleListModel effectStyleLst,
      BackgroundFillStyleListModel bgFillStyleLst) {
    this.name = name;
    this.fillStyleLst = fillStyleLst;
    this.lnStyleLst = lnStyleLst;
    this.effectStyleLst = effectStyleLst;
    this.bgFillStyleLst = bgFillStyleLst;
  }

  public StyleMatrixBuilder builder() {
    return new StyleMatrixBuilder().from(this);
  }

  public String getName() {
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
