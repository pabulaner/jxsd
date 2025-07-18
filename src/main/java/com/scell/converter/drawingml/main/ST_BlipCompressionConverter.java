package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_BlipCompressionModel;
import org.docx4j.dml.STBlipCompression;

public class ST_BlipCompressionConverter {
  private ST_BlipCompressionConverter() {
  }

  public static ST_BlipCompressionModel fromDocx4J(STBlipCompression value) {
    if (value == null) return null;
    if (value == STBlipCompression.EMAIL) return ST_BlipCompressionModel.EMAIL;
    if (value == STBlipCompression.SCREEN) return ST_BlipCompressionModel.SCREEN;
    if (value == STBlipCompression.PRINT) return ST_BlipCompressionModel.PRINT;
    if (value == STBlipCompression.HQPRINT) return ST_BlipCompressionModel.HQPRINT;
    if (value == STBlipCompression.NONE) return ST_BlipCompressionModel.NONE;
    return null;
  }

  public static STBlipCompression toDocx4J(ST_BlipCompressionModel value) {
    return null;
  }
}
