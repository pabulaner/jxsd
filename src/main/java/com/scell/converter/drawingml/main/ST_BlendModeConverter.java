package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_BlendModeModel;
import org.docx4j.dml.STBlendMode;

public class ST_BlendModeConverter {
  private ST_BlendModeConverter() {
  }

  public static ST_BlendModeModel fromDocx4j(STBlendMode value) {
    if (value == null) return null;
    if (value == STBlendMode.OVER) return ST_BlendModeModel.OVER;
    if (value == STBlendMode.MULT) return ST_BlendModeModel.MULT;
    if (value == STBlendMode.SCREEN) return ST_BlendModeModel.SCREEN;
    if (value == STBlendMode.DARKEN) return ST_BlendModeModel.DARKEN;
    if (value == STBlendMode.LIGHTEN) return ST_BlendModeModel.LIGHTEN;
    return null;
  }

  public static STBlendMode toDocx4j(ST_BlendModeModel value) {
    return null;
  }
}
