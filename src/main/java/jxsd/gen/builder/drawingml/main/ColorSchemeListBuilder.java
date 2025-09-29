package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.ColorSchemeAndMappingModel;
import jxsd.gen.model.drawingml.main.ColorSchemeListModel;

/**
 * This is a generated sequence class.
 */
public class ColorSchemeListBuilder {
  private List<ColorSchemeAndMappingModel> extraClrScheme;

  public ColorSchemeListBuilder() {
  }

  public ColorSchemeListBuilder setExtraClrScheme(List<ColorSchemeAndMappingModel> extraClrScheme) {
    this.extraClrScheme = extraClrScheme;
    return this;
  }

  public ColorSchemeListBuilder from(ColorSchemeListModel value) {
    this.extraClrScheme = value.getExtraClrScheme();
    return this;
  }

  public ColorSchemeListModel build() {
    return new ColorSchemeListModel(this.extraClrScheme);
  }
}
