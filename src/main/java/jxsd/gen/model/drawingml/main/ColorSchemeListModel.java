package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.ColorSchemeListBuilder;

/**
 * This is a generated sequence class.
 */
public class ColorSchemeListModel {
  private final List<ColorSchemeAndMappingModel> extraClrScheme;

  public ColorSchemeListModel(List<ColorSchemeAndMappingModel> extraClrScheme) {
    this.extraClrScheme = extraClrScheme;
  }

  public ColorSchemeListBuilder builder() {
    return new ColorSchemeListBuilder().from(this);
  }

  public List<ColorSchemeAndMappingModel> getExtraClrScheme() {
    return this.extraClrScheme;
  }
}
