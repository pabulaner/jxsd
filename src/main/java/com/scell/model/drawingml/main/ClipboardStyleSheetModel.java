package com.scell.model.drawingml.main;

public class ClipboardStyleSheetModel {
  private final BaseStylesModel themeElements;

  private final ColorMappingModel clrMap;

  public ClipboardStyleSheetModel(BaseStylesModel themeElements, ColorMappingModel clrMap) {
    this.themeElements = themeElements;
    this.clrMap = clrMap;
  }

  public BaseStylesModel getThemeElements() {
    return this.themeElements;
  }

  public ColorMappingModel getClrMap() {
    return this.clrMap;
  }
}
