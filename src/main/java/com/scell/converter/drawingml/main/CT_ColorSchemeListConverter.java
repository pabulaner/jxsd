package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorSchemeListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTColorSchemeList;

public class CT_ColorSchemeListConverter {
  private CT_ColorSchemeListConverter() {
  }

  public static CT_ColorSchemeListModel fromDocx4J(CTColorSchemeList value) {
    if (value == null) return null;
    return new CT_ColorSchemeListModel(value.getExtraClrScheme().stream().map(CT_ColorSchemeAndMappingConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTColorSchemeList toDocx4J(CT_ColorSchemeListModel value) {
    return null;
  }
}
