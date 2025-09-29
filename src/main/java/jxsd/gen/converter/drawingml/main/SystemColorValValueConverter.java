package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.SystemColorValValueBuilder;
import jxsd.gen.model.drawingml.main.SystemColorValValueModel;
import org.docx4j.dml.STSystemColorVal;

/**
 * This is a generated enum class.
 */
public class SystemColorValValueConverter {
  private SystemColorValValueConverter() {
  }

  public static SystemColorValValueModel fromDocx4j(STSystemColorVal value) {
    if (value == null) return null;
    if (value == SystemColorValValueBuilder.SCROLL_BAR) return SystemColorValValueModel.SCROLL_BAR;
    if (value == SystemColorValValueBuilder.BACKGROUND) return SystemColorValValueModel.BACKGROUND;
    if (value == SystemColorValValueBuilder.ACTIVE_CAPTION) return SystemColorValValueModel.ACTIVE_CAPTION;
    if (value == SystemColorValValueBuilder.INACTIVE_CAPTION) return SystemColorValValueModel.INACTIVE_CAPTION;
    if (value == SystemColorValValueBuilder.MENU) return SystemColorValValueModel.MENU;
    if (value == SystemColorValValueBuilder.WINDOW) return SystemColorValValueModel.WINDOW;
    if (value == SystemColorValValueBuilder.WINDOW_FRAME) return SystemColorValValueModel.WINDOW_FRAME;
    if (value == SystemColorValValueBuilder.MENU_TEXT) return SystemColorValValueModel.MENU_TEXT;
    if (value == SystemColorValValueBuilder.WINDOW_TEXT) return SystemColorValValueModel.WINDOW_TEXT;
    if (value == SystemColorValValueBuilder.CAPTION_TEXT) return SystemColorValValueModel.CAPTION_TEXT;
    if (value == SystemColorValValueBuilder.ACTIVE_BORDER) return SystemColorValValueModel.ACTIVE_BORDER;
    if (value == SystemColorValValueBuilder.INACTIVE_BORDER) return SystemColorValValueModel.INACTIVE_BORDER;
    if (value == SystemColorValValueBuilder.APP_WORKSPACE) return SystemColorValValueModel.APP_WORKSPACE;
    if (value == SystemColorValValueBuilder.HIGHLIGHT) return SystemColorValValueModel.HIGHLIGHT;
    if (value == SystemColorValValueBuilder.HIGHLIGHT_TEXT) return SystemColorValValueModel.HIGHLIGHT_TEXT;
    if (value == SystemColorValValueBuilder.BTN_FACE) return SystemColorValValueModel.BTN_FACE;
    if (value == SystemColorValValueBuilder.BTN_SHADOW) return SystemColorValValueModel.BTN_SHADOW;
    if (value == SystemColorValValueBuilder.GRAY_TEXT) return SystemColorValValueModel.GRAY_TEXT;
    if (value == SystemColorValValueBuilder.BTN_TEXT) return SystemColorValValueModel.BTN_TEXT;
    if (value == SystemColorValValueBuilder.INACTIVE_CAPTION_TEXT) return SystemColorValValueModel.INACTIVE_CAPTION_TEXT;
    if (value == SystemColorValValueBuilder.BTN_HIGHLIGHT) return SystemColorValValueModel.BTN_HIGHLIGHT;
    if (value == SystemColorValValueBuilder._3D_DK_SHADOW) return SystemColorValValueModel._3D_DK_SHADOW;
    if (value == SystemColorValValueBuilder._3D_LIGHT) return SystemColorValValueModel._3D_LIGHT;
    if (value == SystemColorValValueBuilder.INFO_TEXT) return SystemColorValValueModel.INFO_TEXT;
    if (value == SystemColorValValueBuilder.INFO_BK) return SystemColorValValueModel.INFO_BK;
    if (value == SystemColorValValueBuilder.HOT_LIGHT) return SystemColorValValueModel.HOT_LIGHT;
    if (value == SystemColorValValueBuilder.GRADIENT_ACTIVE_CAPTION) return SystemColorValValueModel.GRADIENT_ACTIVE_CAPTION;
    if (value == SystemColorValValueBuilder.GRADIENT_INACTIVE_CAPTION) return SystemColorValValueModel.GRADIENT_INACTIVE_CAPTION;
    if (value == SystemColorValValueBuilder.MENU_HIGHLIGHT) return SystemColorValValueModel.MENU_HIGHLIGHT;
    if (value == SystemColorValValueBuilder.MENU_BAR) return SystemColorValValueModel.MENU_BAR;
    return null;
  }

  public static STSystemColorVal toDocx4j(SystemColorValValueModel value) {
    if (value == null) return null;
    if (value == SystemColorValValueModel.SCROLL_BAR) return SystemColorValValueBuilder.SCROLL_BAR;
    if (value == SystemColorValValueModel.BACKGROUND) return SystemColorValValueBuilder.BACKGROUND;
    if (value == SystemColorValValueModel.ACTIVE_CAPTION) return SystemColorValValueBuilder.ACTIVE_CAPTION;
    if (value == SystemColorValValueModel.INACTIVE_CAPTION) return SystemColorValValueBuilder.INACTIVE_CAPTION;
    if (value == SystemColorValValueModel.MENU) return SystemColorValValueBuilder.MENU;
    if (value == SystemColorValValueModel.WINDOW) return SystemColorValValueBuilder.WINDOW;
    if (value == SystemColorValValueModel.WINDOW_FRAME) return SystemColorValValueBuilder.WINDOW_FRAME;
    if (value == SystemColorValValueModel.MENU_TEXT) return SystemColorValValueBuilder.MENU_TEXT;
    if (value == SystemColorValValueModel.WINDOW_TEXT) return SystemColorValValueBuilder.WINDOW_TEXT;
    if (value == SystemColorValValueModel.CAPTION_TEXT) return SystemColorValValueBuilder.CAPTION_TEXT;
    if (value == SystemColorValValueModel.ACTIVE_BORDER) return SystemColorValValueBuilder.ACTIVE_BORDER;
    if (value == SystemColorValValueModel.INACTIVE_BORDER) return SystemColorValValueBuilder.INACTIVE_BORDER;
    if (value == SystemColorValValueModel.APP_WORKSPACE) return SystemColorValValueBuilder.APP_WORKSPACE;
    if (value == SystemColorValValueModel.HIGHLIGHT) return SystemColorValValueBuilder.HIGHLIGHT;
    if (value == SystemColorValValueModel.HIGHLIGHT_TEXT) return SystemColorValValueBuilder.HIGHLIGHT_TEXT;
    if (value == SystemColorValValueModel.BTN_FACE) return SystemColorValValueBuilder.BTN_FACE;
    if (value == SystemColorValValueModel.BTN_SHADOW) return SystemColorValValueBuilder.BTN_SHADOW;
    if (value == SystemColorValValueModel.GRAY_TEXT) return SystemColorValValueBuilder.GRAY_TEXT;
    if (value == SystemColorValValueModel.BTN_TEXT) return SystemColorValValueBuilder.BTN_TEXT;
    if (value == SystemColorValValueModel.INACTIVE_CAPTION_TEXT) return SystemColorValValueBuilder.INACTIVE_CAPTION_TEXT;
    if (value == SystemColorValValueModel.BTN_HIGHLIGHT) return SystemColorValValueBuilder.BTN_HIGHLIGHT;
    if (value == SystemColorValValueModel._3D_DK_SHADOW) return SystemColorValValueBuilder._3D_DK_SHADOW;
    if (value == SystemColorValValueModel._3D_LIGHT) return SystemColorValValueBuilder._3D_LIGHT;
    if (value == SystemColorValValueModel.INFO_TEXT) return SystemColorValValueBuilder.INFO_TEXT;
    if (value == SystemColorValValueModel.INFO_BK) return SystemColorValValueBuilder.INFO_BK;
    if (value == SystemColorValValueModel.HOT_LIGHT) return SystemColorValValueBuilder.HOT_LIGHT;
    if (value == SystemColorValValueModel.GRADIENT_ACTIVE_CAPTION) return SystemColorValValueBuilder.GRADIENT_ACTIVE_CAPTION;
    if (value == SystemColorValValueModel.GRADIENT_INACTIVE_CAPTION) return SystemColorValValueBuilder.GRADIENT_INACTIVE_CAPTION;
    if (value == SystemColorValValueModel.MENU_HIGHLIGHT) return SystemColorValValueBuilder.MENU_HIGHLIGHT;
    if (value == SystemColorValValueModel.MENU_BAR) return SystemColorValValueBuilder.MENU_BAR;
    return null;
  }
}
