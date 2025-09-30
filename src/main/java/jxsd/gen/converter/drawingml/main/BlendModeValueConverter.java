package jxsd.gen.converter.drawingml.main;

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
    if (value == STBlendMode.OVER) return BlendModeValueModel.OVER;
    if (value == STBlendMode.MULT) return BlendModeValueModel.MULT;
    if (value == STBlendMode.SCREEN) return BlendModeValueModel.SCREEN;
    if (value == STBlendMode.DARKEN) return BlendModeValueModel.DARKEN;
    if (value == STBlendMode.LIGHTEN) return BlendModeValueModel.LIGHTEN;
    return null;
  }

  public static STBlendMode toDocx4j(BlendModeValueModel value) {
    if (value == null) return null;
    if (value == BlendModeValueModel.OVER) return STBlendMode.OVER;
    if (value == BlendModeValueModel.MULT) return STBlendMode.MULT;
    if (value == BlendModeValueModel.SCREEN) return STBlendMode.SCREEN;
    if (value == BlendModeValueModel.DARKEN) return STBlendMode.DARKEN;
    if (value == BlendModeValueModel.LIGHTEN) return STBlendMode.LIGHTEN;
    return null;
  }
}
