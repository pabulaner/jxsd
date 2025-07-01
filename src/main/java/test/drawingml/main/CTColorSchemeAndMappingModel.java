package test.drawingml.main;

public class CTColorSchemeAndMappingModel {
  private final CTColorSchemeModel clrScheme;

  private final CTColorMappingModel clrMap;

  public CTColorSchemeAndMappingModel(CTColorSchemeModel clrScheme, CTColorMappingModel clrMap) {
    this.clrScheme = clrScheme;
    this.clrMap = clrMap;
  }

  public CTColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public CTColorMappingModel getClrMap() {
    return this.clrMap;
  }
}
