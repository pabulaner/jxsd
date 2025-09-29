package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.CompoundLineValueBuilder;
import jxsd.gen.model.drawingml.main.CompoundLineValueModel;
import org.docx4j.dml.STCompoundLine;

/**
 * This is a generated enum class.
 */
public class CompoundLineValueConverter {
  private CompoundLineValueConverter() {
  }

  public static CompoundLineValueModel fromDocx4j(STCompoundLine value) {
    if (value == null) return null;
    if (value == CompoundLineValueBuilder.SNG) return CompoundLineValueModel.SNG;
    if (value == CompoundLineValueBuilder.DBL) return CompoundLineValueModel.DBL;
    if (value == CompoundLineValueBuilder.THICK_THIN) return CompoundLineValueModel.THICK_THIN;
    if (value == CompoundLineValueBuilder.THIN_THICK) return CompoundLineValueModel.THIN_THICK;
    if (value == CompoundLineValueBuilder.TRI) return CompoundLineValueModel.TRI;
    return null;
  }

  public static STCompoundLine toDocx4j(CompoundLineValueModel value) {
    if (value == null) return null;
    if (value == CompoundLineValueModel.SNG) return CompoundLineValueBuilder.SNG;
    if (value == CompoundLineValueModel.DBL) return CompoundLineValueBuilder.DBL;
    if (value == CompoundLineValueModel.THICK_THIN) return CompoundLineValueBuilder.THICK_THIN;
    if (value == CompoundLineValueModel.THIN_THICK) return CompoundLineValueBuilder.THIN_THICK;
    if (value == CompoundLineValueModel.TRI) return CompoundLineValueBuilder.TRI;
    return null;
  }
}
