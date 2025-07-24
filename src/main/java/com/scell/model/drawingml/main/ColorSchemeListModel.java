package com.scell.model.drawingml.main;

import java.util.List;

public class ColorSchemeListModel {
  private final List<ColorSchemeAndMappingModel> extraClrScheme;

  public ColorSchemeListModel(List<ColorSchemeAndMappingModel> extraClrScheme) {
    this.extraClrScheme = extraClrScheme;
  }

  public List<ColorSchemeAndMappingModel> getExtraClrScheme() {
    return this.extraClrScheme;
  }
}
