package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BlipCompressionValueModel;
import org.docx4j.dml.STBlipCompression;

public class BlipCompressionValueConverter {
  private BlipCompressionValueConverter() {
  }

  public static BlipCompressionValueModel fromDocx4J(STBlipCompression value) {
    if (value == null) return null;
    if (value == STBlipCompression.EMAIL) return BlipCompressionValueModel.EMAIL;
    if (value == STBlipCompression.SCREEN) return BlipCompressionValueModel.SCREEN;
    if (value == STBlipCompression.PRINT) return BlipCompressionValueModel.PRINT;
    if (value == STBlipCompression.HQPRINT) return BlipCompressionValueModel.HQPRINT;
    if (value == STBlipCompression.NONE) return BlipCompressionValueModel.NONE;
    return null;
  }
}
