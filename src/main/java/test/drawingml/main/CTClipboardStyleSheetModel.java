package test.drawingml.main;

public class CTClipboardStyleSheetModel {
  private final CTBaseStylesModel themeElements;

  private final CTColorMappingModel clrMap;

  public CTClipboardStyleSheetModel(CTBaseStylesModel themeElements, CTColorMappingModel clrMap) {
    this.themeElements = themeElements;
    this.clrMap = clrMap;
  }

  public CTBaseStylesModel getThemeElements() {
    return this.themeElements;
  }

  public CTColorMappingModel getClrMap() {
    return this.clrMap;
  }
}
