package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ColorSchemeAndMappingModel;
import com.scell.model.drawingml.main.ColorSchemeListModel;
import java.util.List;

public class ColorSchemeListBuilder {
  private List<ColorSchemeAndMappingModel> extraClrScheme;

  public ColorSchemeListBuilder() {
  }

  public ColorSchemeListBuilder setExtraClrScheme(List<ColorSchemeAndMappingModel> extraClrScheme) {
    this.extraClrScheme = extraClrScheme;
    return this;
  }

  public ColorSchemeListModel build() {
    return new ColorSchemeListModel(this.extraClrScheme);
  }

  public ColorSchemeListBuilder from(ColorSchemeListModel value) {
    this.extraClrScheme = value.getExtraClrScheme();
    return this;
  }
}
