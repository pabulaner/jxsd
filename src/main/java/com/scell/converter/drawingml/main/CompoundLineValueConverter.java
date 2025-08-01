package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CompoundLineValueModel;
import org.docx4j.dml.STCompoundLine;

public class CompoundLineValueConverter {
  private CompoundLineValueConverter() {
  }

  public static CompoundLineValueModel fromDocx4J(STCompoundLine value) {
    if (value == null) return null;
    if (value == STCompoundLine.SNG) return CompoundLineValueModel.SNG;
    if (value == STCompoundLine.DBL) return CompoundLineValueModel.DBL;
    if (value == STCompoundLine.THICK_THIN) return CompoundLineValueModel.THICK_THIN;
    if (value == STCompoundLine.THIN_THICK) return CompoundLineValueModel.THIN_THICK;
    if (value == STCompoundLine.TRI) return CompoundLineValueModel.TRI;
    return null;
  }
}
