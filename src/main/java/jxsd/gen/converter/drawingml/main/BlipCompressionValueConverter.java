package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.BlipCompressionValueBuilder;
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
    if (value == BlipCompressionValueBuilder.EMAIL) return BlipCompressionValueModel.EMAIL;
    if (value == BlipCompressionValueBuilder.SCREEN) return BlipCompressionValueModel.SCREEN;
    if (value == BlipCompressionValueBuilder.PRINT) return BlipCompressionValueModel.PRINT;
    if (value == BlipCompressionValueBuilder.HQPRINT) return BlipCompressionValueModel.HQPRINT;
    if (value == BlipCompressionValueBuilder.NONE) return BlipCompressionValueModel.NONE;
    return null;
  }

  public static STBlipCompression toDocx4j(BlipCompressionValueModel value) {
    if (value == null) return null;
    if (value == BlipCompressionValueModel.EMAIL) return BlipCompressionValueBuilder.EMAIL;
    if (value == BlipCompressionValueModel.SCREEN) return BlipCompressionValueBuilder.SCREEN;
    if (value == BlipCompressionValueModel.PRINT) return BlipCompressionValueBuilder.PRINT;
    if (value == BlipCompressionValueModel.HQPRINT) return BlipCompressionValueBuilder.HQPRINT;
    if (value == BlipCompressionValueModel.NONE) return BlipCompressionValueBuilder.NONE;
    return null;
  }
}
