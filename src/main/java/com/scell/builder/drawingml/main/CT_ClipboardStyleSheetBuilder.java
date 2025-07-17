package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BaseStylesModel;
import com.scell.model.drawingml.main.CT_ClipboardStyleSheetModel;
import com.scell.model.drawingml.main.CT_ColorMappingModel;

public class CT_ClipboardStyleSheetBuilder {
  private CT_BaseStylesModel themeElements;

  private CT_ColorMappingModel clrMap;

  public CT_ClipboardStyleSheetBuilder() {
  }

  public CT_ClipboardStyleSheetBuilder setThemeElements(CT_BaseStylesModel themeElements) {
    this.themeElements = themeElements;
    return this;
  }

  public CT_ClipboardStyleSheetBuilder setClrMap(CT_ColorMappingModel clrMap) {
    this.clrMap = clrMap;
    return this;
  }

  public CT_ClipboardStyleSheetModel build() {
    return new CT_ClipboardStyleSheetModel(this.themeElements, this.clrMap);
  }

  public CT_ClipboardStyleSheetBuilder from(CT_ClipboardStyleSheetModel value) {
    this.themeElements = value.getThemeElements();
    this.clrMap = value.getClrMap();
    return this;
  }
}
