package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.BlipCompressionValueModel;
import org.docx4j.dml.STBlipCompression;

/**
 * This is a generated enum class.
 */
public class BlipCompressionValueConverter {
  private BlipCompressionValueConverter() {
  }

  public static BlipCompressionValueModel fromDocx4j(STBlipCompression value) {
    if (value == null) return null;
    if (value == STBlipCompression.EMAIL) return BlipCompressionValueModel.EMAIL;
    if (value == STBlipCompression.SCREEN) return BlipCompressionValueModel.SCREEN;
    if (value == STBlipCompression.PRINT) return BlipCompressionValueModel.PRINT;
    if (value == STBlipCompression.HQPRINT) return BlipCompressionValueModel.HQPRINT;
    if (value == STBlipCompression.NONE) return BlipCompressionValueModel.NONE;
    return null;
  }

  public static STBlipCompression toDocx4j(BlipCompressionValueModel value) {
    if (value == null) return null;
    if (value == BlipCompressionValueModel.EMAIL) return STBlipCompression.EMAIL;
    if (value == BlipCompressionValueModel.SCREEN) return STBlipCompression.SCREEN;
    if (value == BlipCompressionValueModel.PRINT) return STBlipCompression.PRINT;
    if (value == BlipCompressionValueModel.HQPRINT) return STBlipCompression.HQPRINT;
    if (value == BlipCompressionValueModel.NONE) return STBlipCompression.NONE;
    return null;
  }
}
