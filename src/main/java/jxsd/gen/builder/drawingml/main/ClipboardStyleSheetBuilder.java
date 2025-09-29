package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BaseStylesValueModel;
import jxsd.gen.model.drawingml.main.ClipboardStyleSheetModel;
import jxsd.gen.model.drawingml.main.ColorMappingModel;

/**
 * This is a generated sequence class.
 */
public class ClipboardStyleSheetBuilder {
  private BaseStylesValueModel themeElements;

  private ColorMappingModel clrMap;

  public ClipboardStyleSheetBuilder() {
  }

  public ClipboardStyleSheetBuilder setThemeElements(BaseStylesValueModel themeElements) {
    this.themeElements = themeElements;
    return this;
  }

  public ClipboardStyleSheetBuilder setClrMap(ColorMappingModel clrMap) {
    this.clrMap = clrMap;
    return this;
  }

  public ClipboardStyleSheetBuilder from(ClipboardStyleSheetModel value) {
    this.themeElements = value.getThemeElements();
    this.clrMap = value.getClrMap();
    return this;
  }

  public ClipboardStyleSheetModel build() {
    return new ClipboardStyleSheetModel(this.themeElements, this.clrMap);
  }
}
