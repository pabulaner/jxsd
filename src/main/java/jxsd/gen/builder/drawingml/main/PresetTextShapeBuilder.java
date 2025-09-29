package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GeomGuideListModel;
import jxsd.gen.model.drawingml.main.PresetTextShapeModel;
import jxsd.gen.model.drawingml.main.TextShapeTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class PresetTextShapeBuilder {
  private TextShapeTypeValueModel prst;

  private GeomGuideListModel avLst;

  public PresetTextShapeBuilder() {
  }

  public PresetTextShapeBuilder setPrst(TextShapeTypeValueModel prst) {
    this.prst = prst;
    return this;
  }

  public PresetTextShapeBuilder setAvLst(GeomGuideListModel avLst) {
    this.avLst = avLst;
    return this;
  }

  public PresetTextShapeBuilder from(PresetTextShapeModel value) {
    this.prst = value.getPrst();
    this.avLst = value.getAvLst();
    return this;
  }

  public PresetTextShapeModel build() {
    return new PresetTextShapeModel(this.prst, this.avLst);
  }
}
