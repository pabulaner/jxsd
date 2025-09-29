package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GeomGuideModel;
import org.docx4j.dml.CTGeomGuide;

/**
 * This is a generated sequence class.
 */
public class GeomGuideConverter {
  private GeomGuideConverter() {
  }

  public static GeomGuideModel fromDocx4j(CTGeomGuide value) {
    if (value == null) return null;
    return new GeomGuideModel(GeomGuideFormulaValueConverter.fromDocx4j(value.getFmla()), GeomGuideNameValueConverter.fromDocx4j(value.getName()));
  }

  public static CTGeomGuide toDocx4j(GeomGuideModel value) {
    if (value == null) return null;
    CTGeomGuide result = new CTGeomGuide();
    result.setFmla(GeomGuideFormulaValueConverter.toDocx4j(value.getFmla()));
    result.setName(GeomGuideNameValueConverter.toDocx4j(value.getName()));
    return result;
  }
}
