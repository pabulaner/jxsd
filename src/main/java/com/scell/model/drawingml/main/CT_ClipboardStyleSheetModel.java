package com.scell.model.drawingml.main;

public class CT_ClipboardStyleSheetModel {
  private final CT_BaseStylesModel themeElements;

  private final CT_ColorMappingModel clrMap;

  public CT_ClipboardStyleSheetModel(CT_BaseStylesModel themeElements,
      CT_ColorMappingModel clrMap) {
    this.themeElements = themeElements;
    this.clrMap = clrMap;
  }

  public CT_BaseStylesModel getThemeElements() {
    return this.themeElements;
  }

  public CT_ColorMappingModel getClrMap() {
    return this.clrMap;
  }
}
