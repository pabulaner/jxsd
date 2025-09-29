package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GeomGuideListModel;
import jxsd.gen.model.drawingml.main.PresetGeometry2DModel;
import jxsd.gen.model.drawingml.main.ShapeTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class PresetGeometry2DBuilder {
  private ShapeTypeValueModel prst;

  private GeomGuideListModel avLst;

  public PresetGeometry2DBuilder() {
  }

  public PresetGeometry2DBuilder setPrst(ShapeTypeValueModel prst) {
    this.prst = prst;
    return this;
  }

  public PresetGeometry2DBuilder setAvLst(GeomGuideListModel avLst) {
    this.avLst = avLst;
    return this;
  }

  public PresetGeometry2DBuilder from(PresetGeometry2DModel value) {
    this.prst = value.getPrst();
    this.avLst = value.getAvLst();
    return this;
  }

  public PresetGeometry2DModel build() {
    return new PresetGeometry2DModel(this.prst, this.avLst);
  }
}
