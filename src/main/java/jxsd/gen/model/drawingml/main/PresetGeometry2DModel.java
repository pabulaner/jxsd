package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetGeometry2DBuilder;

/**
 * This is a generated sequence class.
 */
public class PresetGeometry2DModel {
  private final ShapeTypeValueModel prst;

  private final GeomGuideListModel avLst;

  public PresetGeometry2DModel(ShapeTypeValueModel prst, GeomGuideListModel avLst) {
    this.prst = prst;
    this.avLst = avLst;
  }

  public PresetGeometry2DBuilder builder() {
    return new PresetGeometry2DBuilder().from(this);
  }

  public ShapeTypeValueModel getPrst() {
    return this.prst;
  }

  public GeomGuideListModel getAvLst() {
    return this.avLst;
  }
}
