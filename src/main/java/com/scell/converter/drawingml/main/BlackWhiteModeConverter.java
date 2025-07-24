package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BlackWhiteModeModel;
import org.docx4j.dml.STBlackWhiteMode;

public class BlackWhiteModeConverter {
  private BlackWhiteModeConverter() {
  }

  public static BlackWhiteModeModel fromDocx4J(STBlackWhiteMode value) {
    if (value == null) return null;
    if (value == STBlackWhiteMode.CLR) return BlackWhiteModeModel.CLR;
    if (value == STBlackWhiteMode.AUTO) return BlackWhiteModeModel.AUTO;
    if (value == STBlackWhiteMode.GRAY) return BlackWhiteModeModel.GRAY;
    if (value == STBlackWhiteMode.LT_GRAY) return BlackWhiteModeModel.LT_GRAY;
    if (value == STBlackWhiteMode.INV_GRAY) return BlackWhiteModeModel.INV_GRAY;
    if (value == STBlackWhiteMode.GRAY_WHITE) return BlackWhiteModeModel.GRAY_WHITE;
    if (value == STBlackWhiteMode.BLACK_GRAY) return BlackWhiteModeModel.BLACK_GRAY;
    if (value == STBlackWhiteMode.BLACK_WHITE) return BlackWhiteModeModel.BLACK_WHITE;
    if (value == STBlackWhiteMode.BLACK) return BlackWhiteModeModel.BLACK;
    if (value == STBlackWhiteMode.WHITE) return BlackWhiteModeModel.WHITE;
    if (value == STBlackWhiteMode.HIDDEN) return BlackWhiteModeModel.HIDDEN;
    return null;
  }
}
