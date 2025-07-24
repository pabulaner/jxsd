package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BlipCompressionModel;
import org.docx4j.dml.STBlipCompression;

public class BlipCompressionConverter {
  private BlipCompressionConverter() {
  }

  public static BlipCompressionModel fromDocx4J(STBlipCompression value) {
    if (value == null) return null;
    if (value == STBlipCompression.EMAIL) return BlipCompressionModel.EMAIL;
    if (value == STBlipCompression.SCREEN) return BlipCompressionModel.SCREEN;
    if (value == STBlipCompression.PRINT) return BlipCompressionModel.PRINT;
    if (value == STBlipCompression.HQPRINT) return BlipCompressionModel.HQPRINT;
    if (value == STBlipCompression.NONE) return BlipCompressionModel.NONE;
    return null;
  }
}
