package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorSchemeListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTColorSchemeList;

public class ColorSchemeListConverter {
  private ColorSchemeListConverter() {
  }

  public static ColorSchemeListModel fromDocx4J(CTColorSchemeList value) {
    if (value == null) return null;
    return new ColorSchemeListModel(value.getExtraClrScheme().stream().map(ColorSchemeAndMappingConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
