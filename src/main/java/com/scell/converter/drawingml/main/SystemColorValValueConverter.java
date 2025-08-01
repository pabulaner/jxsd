package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.SystemColorValValueModel;
import org.docx4j.dml.STSystemColorVal;

public class SystemColorValValueConverter {
  private SystemColorValValueConverter() {
  }

  public static SystemColorValValueModel fromDocx4J(STSystemColorVal value) {
    if (value == null) return null;
    if (value == STSystemColorVal.SCROLL_BAR) return SystemColorValValueModel.SCROLL_BAR;
    if (value == STSystemColorVal.BACKGROUND) return SystemColorValValueModel.BACKGROUND;
    if (value == STSystemColorVal.ACTIVE_CAPTION) return SystemColorValValueModel.ACTIVE_CAPTION;
    if (value == STSystemColorVal.INACTIVE_CAPTION) return SystemColorValValueModel.INACTIVE_CAPTION;
    if (value == STSystemColorVal.MENU) return SystemColorValValueModel.MENU;
    if (value == STSystemColorVal.WINDOW) return SystemColorValValueModel.WINDOW;
    if (value == STSystemColorVal.WINDOW_FRAME) return SystemColorValValueModel.WINDOW_FRAME;
    if (value == STSystemColorVal.MENU_TEXT) return SystemColorValValueModel.MENU_TEXT;
    if (value == STSystemColorVal.WINDOW_TEXT) return SystemColorValValueModel.WINDOW_TEXT;
    if (value == STSystemColorVal.CAPTION_TEXT) return SystemColorValValueModel.CAPTION_TEXT;
    if (value == STSystemColorVal.ACTIVE_BORDER) return SystemColorValValueModel.ACTIVE_BORDER;
    if (value == STSystemColorVal.INACTIVE_BORDER) return SystemColorValValueModel.INACTIVE_BORDER;
    if (value == STSystemColorVal.APP_WORKSPACE) return SystemColorValValueModel.APP_WORKSPACE;
    if (value == STSystemColorVal.HIGHLIGHT) return SystemColorValValueModel.HIGHLIGHT;
    if (value == STSystemColorVal.HIGHLIGHT_TEXT) return SystemColorValValueModel.HIGHLIGHT_TEXT;
    if (value == STSystemColorVal.BTN_FACE) return SystemColorValValueModel.BTN_FACE;
    if (value == STSystemColorVal.BTN_SHADOW) return SystemColorValValueModel.BTN_SHADOW;
    if (value == STSystemColorVal.GRAY_TEXT) return SystemColorValValueModel.GRAY_TEXT;
    if (value == STSystemColorVal.BTN_TEXT) return SystemColorValValueModel.BTN_TEXT;
    if (value == STSystemColorVal.INACTIVE_CAPTION_TEXT) return SystemColorValValueModel.INACTIVE_CAPTION_TEXT;
    if (value == STSystemColorVal.BTN_HIGHLIGHT) return SystemColorValValueModel.BTN_HIGHLIGHT;
    if (value == STSystemColorVal._3D_DK_SHADOW) return SystemColorValValueModel._3D_DK_SHADOW;
    if (value == STSystemColorVal._3D_LIGHT) return SystemColorValValueModel._3D_LIGHT;
    if (value == STSystemColorVal.INFO_TEXT) return SystemColorValValueModel.INFO_TEXT;
    if (value == STSystemColorVal.INFO_BK) return SystemColorValValueModel.INFO_BK;
    if (value == STSystemColorVal.HOT_LIGHT) return SystemColorValValueModel.HOT_LIGHT;
    if (value == STSystemColorVal.GRADIENT_ACTIVE_CAPTION) return SystemColorValValueModel.GRADIENT_ACTIVE_CAPTION;
    if (value == STSystemColorVal.GRADIENT_INACTIVE_CAPTION) return SystemColorValValueModel.GRADIENT_INACTIVE_CAPTION;
    if (value == STSystemColorVal.MENU_HIGHLIGHT) return SystemColorValValueModel.MENU_HIGHLIGHT;
    if (value == STSystemColorVal.MENU_BAR) return SystemColorValValueModel.MENU_BAR;
    return null;
  }
}
