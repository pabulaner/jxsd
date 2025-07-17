package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_BlackWhiteModeModel;
import org.docx4j.dml.STBlackWhiteMode;

public class ST_BlackWhiteModeConverter {
  private ST_BlackWhiteModeConverter() {
  }

  public static ST_BlackWhiteModeModel fromDocx4j(STBlackWhiteMode value) {
    if (value == null) return null;
    if (value == STBlackWhiteMode.CLR) return ST_BlackWhiteModeModel.CLR;
    if (value == STBlackWhiteMode.AUTO) return ST_BlackWhiteModeModel.AUTO;
    if (value == STBlackWhiteMode.GRAY) return ST_BlackWhiteModeModel.GRAY;
    if (value == STBlackWhiteMode.LT_GRAY) return ST_BlackWhiteModeModel.LT_GRAY;
    if (value == STBlackWhiteMode.INV_GRAY) return ST_BlackWhiteModeModel.INV_GRAY;
    if (value == STBlackWhiteMode.GRAY_WHITE) return ST_BlackWhiteModeModel.GRAY_WHITE;
    if (value == STBlackWhiteMode.BLACK_GRAY) return ST_BlackWhiteModeModel.BLACK_GRAY;
    if (value == STBlackWhiteMode.BLACK_WHITE) return ST_BlackWhiteModeModel.BLACK_WHITE;
    if (value == STBlackWhiteMode.BLACK) return ST_BlackWhiteModeModel.BLACK;
    if (value == STBlackWhiteMode.WHITE) return ST_BlackWhiteModeModel.WHITE;
    if (value == STBlackWhiteMode.HIDDEN) return ST_BlackWhiteModeModel.HIDDEN;
    return null;
  }

  public static STBlackWhiteMode toDocx4j(ST_BlackWhiteModeModel value) {
    return null;
  }
}
