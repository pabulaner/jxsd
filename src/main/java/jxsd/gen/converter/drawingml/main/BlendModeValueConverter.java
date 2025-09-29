package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.BlendModeValueBuilder;
import jxsd.gen.model.drawingml.main.BlendModeValueModel;
import org.docx4j.dml.STBlendMode;

/**
 * This is a generated enum class.
 */
public class BlendModeValueConverter {
  private BlendModeValueConverter() {
  }

  public static BlendModeValueModel fromDocx4j(STBlendMode value) {
    if (value == null) return null;
    if (value == BlendModeValueBuilder.OVER) return BlendModeValueModel.OVER;
    if (value == BlendModeValueBuilder.MULT) return BlendModeValueModel.MULT;
    if (value == BlendModeValueBuilder.SCREEN) return BlendModeValueModel.SCREEN;
    if (value == BlendModeValueBuilder.DARKEN) return BlendModeValueModel.DARKEN;
    if (value == BlendModeValueBuilder.LIGHTEN) return BlendModeValueModel.LIGHTEN;
    return null;
  }

  public static STBlendMode toDocx4j(BlendModeValueModel value) {
    if (value == null) return null;
    if (value == BlendModeValueModel.OVER) return BlendModeValueBuilder.OVER;
    if (value == BlendModeValueModel.MULT) return BlendModeValueBuilder.MULT;
    if (value == BlendModeValueModel.SCREEN) return BlendModeValueBuilder.SCREEN;
    if (value == BlendModeValueModel.DARKEN) return BlendModeValueBuilder.DARKEN;
    if (value == BlendModeValueModel.LIGHTEN) return BlendModeValueBuilder.LIGHTEN;
    return null;
  }
}
