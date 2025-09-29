package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.ColorSchemeListModel;
import org.docx4j.dml.CTColorSchemeList;

/**
 * This is a generated sequence class.
 */
public class ColorSchemeListConverter {
  private ColorSchemeListConverter() {
  }

  public static ColorSchemeListModel fromDocx4j(CTColorSchemeList value) {
    if (value == null) return null;
    return new ColorSchemeListModel(value.getExtraClrScheme().stream().map(ColorSchemeAndMappingConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTColorSchemeList toDocx4j(ColorSchemeListModel value) {
    if (value == null) return null;
    CTColorSchemeList result = new CTColorSchemeList();
    result.getExtraClrScheme().addAll(value.getExtraClrScheme().stream().map(ColorSchemeAndMappingConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
