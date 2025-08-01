package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BlendModeValueModel;
import org.docx4j.dml.STBlendMode;

public class BlendModeValueConverter {
  private BlendModeValueConverter() {
  }

  public static BlendModeValueModel fromDocx4J(STBlendMode value) {
    if (value == null) return null;
    if (value == STBlendMode.OVER) return BlendModeValueModel.OVER;
    if (value == STBlendMode.MULT) return BlendModeValueModel.MULT;
    if (value == STBlendMode.SCREEN) return BlendModeValueModel.SCREEN;
    if (value == STBlendMode.DARKEN) return BlendModeValueModel.DARKEN;
    if (value == STBlendMode.LIGHTEN) return BlendModeValueModel.LIGHTEN;
    return null;
  }
}
