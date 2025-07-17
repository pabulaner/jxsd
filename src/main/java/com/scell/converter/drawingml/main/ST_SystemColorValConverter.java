package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_SystemColorValModel;
import org.docx4j.dml.STSystemColorVal;

public class ST_SystemColorValConverter {
  private ST_SystemColorValConverter() {
  }

  public static ST_SystemColorValModel fromDocx4j(STSystemColorVal value) {
    if (value == null) return null;
    if (value == STSystemColorVal.SCROLL_BAR) return ST_SystemColorValModel.SCROLL_BAR;
    if (value == STSystemColorVal.BACKGROUND) return ST_SystemColorValModel.BACKGROUND;
    if (value == STSystemColorVal.ACTIVE_CAPTION) return ST_SystemColorValModel.ACTIVE_CAPTION;
    if (value == STSystemColorVal.INACTIVE_CAPTION) return ST_SystemColorValModel.INACTIVE_CAPTION;
    if (value == STSystemColorVal.MENU) return ST_SystemColorValModel.MENU;
    if (value == STSystemColorVal.WINDOW) return ST_SystemColorValModel.WINDOW;
    if (value == STSystemColorVal.WINDOW_FRAME) return ST_SystemColorValModel.WINDOW_FRAME;
    if (value == STSystemColorVal.MENU_TEXT) return ST_SystemColorValModel.MENU_TEXT;
    if (value == STSystemColorVal.WINDOW_TEXT) return ST_SystemColorValModel.WINDOW_TEXT;
    if (value == STSystemColorVal.CAPTION_TEXT) return ST_SystemColorValModel.CAPTION_TEXT;
    if (value == STSystemColorVal.ACTIVE_BORDER) return ST_SystemColorValModel.ACTIVE_BORDER;
    if (value == STSystemColorVal.INACTIVE_BORDER) return ST_SystemColorValModel.INACTIVE_BORDER;
    if (value == STSystemColorVal.APP_WORKSPACE) return ST_SystemColorValModel.APP_WORKSPACE;
    if (value == STSystemColorVal.HIGHLIGHT) return ST_SystemColorValModel.HIGHLIGHT;
    if (value == STSystemColorVal.HIGHLIGHT_TEXT) return ST_SystemColorValModel.HIGHLIGHT_TEXT;
    if (value == STSystemColorVal.BTN_FACE) return ST_SystemColorValModel.BTN_FACE;
    if (value == STSystemColorVal.BTN_SHADOW) return ST_SystemColorValModel.BTN_SHADOW;
    if (value == STSystemColorVal.GRAY_TEXT) return ST_SystemColorValModel.GRAY_TEXT;
    if (value == STSystemColorVal.BTN_TEXT) return ST_SystemColorValModel.BTN_TEXT;
    if (value == STSystemColorVal.INACTIVE_CAPTION_TEXT) return ST_SystemColorValModel.INACTIVE_CAPTION_TEXT;
    if (value == STSystemColorVal.BTN_HIGHLIGHT) return ST_SystemColorValModel.BTN_HIGHLIGHT;
    if (value == STSystemColorVal._3D_DK_SHADOW) return ST_SystemColorValModel._3D_DK_SHADOW;
    if (value == STSystemColorVal._3D_LIGHT) return ST_SystemColorValModel._3D_LIGHT;
    if (value == STSystemColorVal.INFO_TEXT) return ST_SystemColorValModel.INFO_TEXT;
    if (value == STSystemColorVal.INFO_BK) return ST_SystemColorValModel.INFO_BK;
    if (value == STSystemColorVal.HOT_LIGHT) return ST_SystemColorValModel.HOT_LIGHT;
    if (value == STSystemColorVal.GRADIENT_ACTIVE_CAPTION) return ST_SystemColorValModel.GRADIENT_ACTIVE_CAPTION;
    if (value == STSystemColorVal.GRADIENT_INACTIVE_CAPTION) return ST_SystemColorValModel.GRADIENT_INACTIVE_CAPTION;
    if (value == STSystemColorVal.MENU_HIGHLIGHT) return ST_SystemColorValModel.MENU_HIGHLIGHT;
    if (value == STSystemColorVal.MENU_BAR) return ST_SystemColorValModel.MENU_BAR;
    return null;
  }

  public static STSystemColorVal toDocx4j(ST_SystemColorValModel value) {
    return null;
  }
}
