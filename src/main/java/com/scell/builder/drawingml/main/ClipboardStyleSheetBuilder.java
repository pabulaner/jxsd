package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BaseStylesModel;
import com.scell.model.drawingml.main.ClipboardStyleSheetModel;
import com.scell.model.drawingml.main.ColorMappingModel;

public class ClipboardStyleSheetBuilder {
  private BaseStylesModel themeElements;

  private ColorMappingModel clrMap;

  public ClipboardStyleSheetBuilder() {
  }

  public ClipboardStyleSheetBuilder setThemeElements(BaseStylesModel themeElements) {
    this.themeElements = themeElements;
    return this;
  }

  public ClipboardStyleSheetBuilder setClrMap(ColorMappingModel clrMap) {
    this.clrMap = clrMap;
    return this;
  }

  public ClipboardStyleSheetModel build() {
    return new ClipboardStyleSheetModel(this.themeElements, this.clrMap);
  }

  public ClipboardStyleSheetBuilder from(ClipboardStyleSheetModel value) {
    this.themeElements = value.getThemeElements();
    this.clrMap = value.getClrMap();
    return this;
  }
}
