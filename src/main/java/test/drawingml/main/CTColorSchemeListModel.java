package test.drawingml.main;

public class CTColorSchemeListModel {
  private final CTColorSchemeAndMappingModel extraClrScheme;

  public CTColorSchemeListModel(CTColorSchemeAndMappingModel extraClrScheme) {
    this.extraClrScheme = extraClrScheme;
  }

  public CTColorSchemeAndMappingModel getExtraClrScheme() {
    return this.extraClrScheme;
  }
}
