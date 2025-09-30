package jxsd.gen.converter.drawingml.main;

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
    if (value == STCompoundLine.SNG) return CompoundLineValueModel.SNG;
    if (value == STCompoundLine.DBL) return CompoundLineValueModel.DBL;
    if (value == STCompoundLine.THICK_THIN) return CompoundLineValueModel.THICK_THIN;
    if (value == STCompoundLine.THIN_THICK) return CompoundLineValueModel.THIN_THICK;
    if (value == STCompoundLine.TRI) return CompoundLineValueModel.TRI;
    return null;
  }

  public static STCompoundLine toDocx4j(CompoundLineValueModel value) {
    if (value == null) return null;
    if (value == CompoundLineValueModel.SNG) return STCompoundLine.SNG;
    if (value == CompoundLineValueModel.DBL) return STCompoundLine.DBL;
    if (value == CompoundLineValueModel.THICK_THIN) return STCompoundLine.THICK_THIN;
    if (value == CompoundLineValueModel.THIN_THICK) return STCompoundLine.THIN_THICK;
    if (value == CompoundLineValueModel.TRI) return STCompoundLine.TRI;
    return null;
  }
}
