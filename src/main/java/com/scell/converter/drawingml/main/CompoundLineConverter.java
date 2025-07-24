package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CompoundLineModel;
import org.docx4j.dml.STCompoundLine;

public class CompoundLineConverter {
  private CompoundLineConverter() {
  }

  public static CompoundLineModel fromDocx4J(STCompoundLine value) {
    if (value == null) return null;
    if (value == STCompoundLine.SNG) return CompoundLineModel.SNG;
    if (value == STCompoundLine.DBL) return CompoundLineModel.DBL;
    if (value == STCompoundLine.THICK_THIN) return CompoundLineModel.THICK_THIN;
    if (value == STCompoundLine.THIN_THICK) return CompoundLineModel.THIN_THICK;
    if (value == STCompoundLine.TRI) return CompoundLineModel.TRI;
    return null;
  }
}
