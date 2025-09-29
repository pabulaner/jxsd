package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BackgroundFillStyleListModel;
import jxsd.gen.model.drawingml.main.EffectStyleListModel;
import jxsd.gen.model.drawingml.main.FillStyleListModel;
import jxsd.gen.model.drawingml.main.LineStyleListModel;
import jxsd.gen.model.drawingml.main.StyleMatrixModel;

/**
 * This is a generated sequence class.
 */
public class StyleMatrixBuilder {
  private String name;

  private FillStyleListModel fillStyleLst;

  private LineStyleListModel lnStyleLst;

  private EffectStyleListModel effectStyleLst;

  private BackgroundFillStyleListModel bgFillStyleLst;

  public StyleMatrixBuilder() {
  }

  public StyleMatrixBuilder setName(String name) {
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

  public StyleMatrixBuilder from(StyleMatrixModel value) {
    this.name = value.getName();
    this.fillStyleLst = value.getFillStyleLst();
    this.lnStyleLst = value.getLnStyleLst();
    this.effectStyleLst = value.getEffectStyleLst();
    this.bgFillStyleLst = value.getBgFillStyleLst();
    return this;
  }

  public StyleMatrixModel build() {
    return new StyleMatrixModel(this.name, this.fillStyleLst, this.lnStyleLst, this.effectStyleLst, this.bgFillStyleLst);
  }
}
