package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetTextShapeModel;
import org.docx4j.dml.CTPresetTextShape;

/**
 * This is a generated sequence class.
 */
public class PresetTextShapeConverter {
  private PresetTextShapeConverter() {
  }

  public static PresetTextShapeModel fromDocx4j(CTPresetTextShape value) {
    if (value == null) return null;
    return new PresetTextShapeModel(TextShapeTypeValueConverter.fromDocx4j(value.getPrst()), GeomGuideListConverter.fromDocx4j(value.getAvLst()));
  }

  public static CTPresetTextShape toDocx4j(PresetTextShapeModel value) {
    if (value == null) return null;
    CTPresetTextShape result = new CTPresetTextShape();
    result.setPrst(TextShapeTypeValueConverter.toDocx4j(value.getPrst()));
    result.setAvLst(GeomGuideListConverter.toDocx4j(value.getAvLst()));
    return result;
  }
}
