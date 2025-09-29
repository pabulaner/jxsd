package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ClipboardStyleSheetBuilder;

/**
 * This is a generated sequence class.
 */
public class ClipboardStyleSheetModel {
  private final BaseStylesValueModel themeElements;

  private final ColorMappingModel clrMap;

  public ClipboardStyleSheetModel(BaseStylesValueModel themeElements, ColorMappingModel clrMap) {
    this.themeElements = themeElements;
    this.clrMap = clrMap;
  }

  public ClipboardStyleSheetBuilder builder() {
    return new ClipboardStyleSheetBuilder().from(this);
  }

  public BaseStylesValueModel getThemeElements() {
    return this.themeElements;
  }

  public ColorMappingModel getClrMap() {
    return this.clrMap;
  }
}
