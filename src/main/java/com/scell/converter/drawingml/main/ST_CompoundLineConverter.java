package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_CompoundLineModel;
import org.docx4j.dml.STCompoundLine;

public class ST_CompoundLineConverter {
  private ST_CompoundLineConverter() {
  }

  public static ST_CompoundLineModel fromDocx4J(STCompoundLine value) {
    if (value == null) return null;
    if (value == STCompoundLine.SNG) return ST_CompoundLineModel.SNG;
    if (value == STCompoundLine.DBL) return ST_CompoundLineModel.DBL;
    if (value == STCompoundLine.THICK_THIN) return ST_CompoundLineModel.THICK_THIN;
    if (value == STCompoundLine.THIN_THICK) return ST_CompoundLineModel.THIN_THICK;
    if (value == STCompoundLine.TRI) return ST_CompoundLineModel.TRI;
    return null;
  }

  public static STCompoundLine toDocx4J(ST_CompoundLineModel value) {
    return null;
  }
}
