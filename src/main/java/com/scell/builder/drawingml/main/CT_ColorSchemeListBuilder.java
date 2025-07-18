package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorSchemeAndMappingModel;
import com.scell.model.drawingml.main.CT_ColorSchemeListModel;
import java.util.List;

public class CT_ColorSchemeListBuilder {
  private List<CT_ColorSchemeAndMappingModel> extraClrScheme;

  public CT_ColorSchemeListBuilder() {
  }

  public CT_ColorSchemeListBuilder setExtraClrScheme(
      List<CT_ColorSchemeAndMappingModel> extraClrScheme) {
    this.extraClrScheme = extraClrScheme;
    return this;
  }

  public CT_ColorSchemeListModel build() {
    return new CT_ColorSchemeListModel(this.extraClrScheme);
  }

  public CT_ColorSchemeListBuilder from(CT_ColorSchemeListModel value) {
    this.extraClrScheme = value.getExtraClrScheme();
    return this;
  }
}
