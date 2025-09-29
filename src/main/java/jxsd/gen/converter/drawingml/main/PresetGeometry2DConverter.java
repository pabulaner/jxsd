package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetGeometry2DModel;
import org.docx4j.dml.CTPresetGeometry2D;

/**
 * This is a generated sequence class.
 */
public class PresetGeometry2DConverter {
  private PresetGeometry2DConverter() {
  }

  public static PresetGeometry2DModel fromDocx4j(CTPresetGeometry2D value) {
    if (value == null) return null;
    return new PresetGeometry2DModel(ShapeTypeValueConverter.fromDocx4j(value.getPrst()), GeomGuideListConverter.fromDocx4j(value.getAvLst()));
  }

  public static CTPresetGeometry2D toDocx4j(PresetGeometry2DModel value) {
    if (value == null) return null;
    CTPresetGeometry2D result = new CTPresetGeometry2D();
    result.setPrst(ShapeTypeValueConverter.toDocx4j(value.getPrst()));
    result.setAvLst(GeomGuideListConverter.toDocx4j(value.getAvLst()));
    return result;
  }
}
