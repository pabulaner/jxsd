package model.drawingml.main;

import java.util.List;

public class CT_ColorSchemeListModel {
  private final List<CT_ColorSchemeAndMappingModel> extraClrScheme;

  public CT_ColorSchemeListModel(List<CT_ColorSchemeAndMappingModel> extraClrScheme) {
    this.extraClrScheme = extraClrScheme;
  }

  public List<CT_ColorSchemeAndMappingModel> getExtraClrScheme() {
    return this.extraClrScheme;
  }
}
