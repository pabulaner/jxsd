package com.scell.model.drawingml.main;

public class ClipboardStyleSheetModel {
  private final BaseStylesValueModel themeElements;

  private final ColorMappingModel clrMap;

  public ClipboardStyleSheetModel(BaseStylesValueModel themeElements, ColorMappingModel clrMap) {
    this.themeElements = themeElements;
    this.clrMap = clrMap;
  }

  public BaseStylesValueModel getThemeElements() {
    return this.themeElements;
  }

  public ColorMappingModel getClrMap() {
    return this.clrMap;
  }
}
