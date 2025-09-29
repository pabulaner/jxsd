package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ShapeStyleModel;
import org.docx4j.dml.CTShapeStyle;

/**
 * This is a generated sequence class.
 */
public class ShapeStyleConverter {
  private ShapeStyleConverter() {
  }

  public static ShapeStyleModel fromDocx4j(CTShapeStyle value) {
    if (value == null) return null;
    return new ShapeStyleModel(StyleMatrixReferenceConverter.fromDocx4j(value.getLnRef()), StyleMatrixReferenceConverter.fromDocx4j(value.getFillRef()), StyleMatrixReferenceConverter.fromDocx4j(value.getEffectRef()), FontReferenceConverter.fromDocx4j(value.getFontRef()));
  }

  public static CTShapeStyle toDocx4j(ShapeStyleModel value) {
    if (value == null) return null;
    CTShapeStyle result = new CTShapeStyle();
    result.setLnRef(StyleMatrixReferenceConverter.toDocx4j(value.getLnRef()));
    result.setFillRef(StyleMatrixReferenceConverter.toDocx4j(value.getFillRef()));
    result.setEffectRef(StyleMatrixReferenceConverter.toDocx4j(value.getEffectRef()));
    result.setFontRef(FontReferenceConverter.toDocx4j(value.getFontRef()));
    return result;
  }
}
