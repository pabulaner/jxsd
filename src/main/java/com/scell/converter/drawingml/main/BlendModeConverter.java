package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BlendModeModel;
import org.docx4j.dml.STBlendMode;

public class BlendModeConverter {
  private BlendModeConverter() {
  }

  public static BlendModeModel fromDocx4J(STBlendMode value) {
    if (value == null) return null;
    if (value == STBlendMode.OVER) return BlendModeModel.OVER;
    if (value == STBlendMode.MULT) return BlendModeModel.MULT;
    if (value == STBlendMode.SCREEN) return BlendModeModel.SCREEN;
    if (value == STBlendMode.DARKEN) return BlendModeModel.DARKEN;
    if (value == STBlendMode.LIGHTEN) return BlendModeModel.LIGHTEN;
    return null;
  }
}
