package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetTextShapeBuilder;

/**
 * This is a generated sequence class.
 */
public class PresetTextShapeModel {
  private final TextShapeTypeValueModel prst;

  private final GeomGuideListModel avLst;

  public PresetTextShapeModel(TextShapeTypeValueModel prst, GeomGuideListModel avLst) {
    this.prst = prst;
    this.avLst = avLst;
  }

  public PresetTextShapeBuilder builder() {
    return new PresetTextShapeBuilder().from(this);
  }

  public TextShapeTypeValueModel getPrst() {
    return this.prst;
  }

  public GeomGuideListModel getAvLst() {
    return this.avLst;
  }
}
