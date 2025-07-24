package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CustomColorListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTCustomColorList;

public class CustomColorListConverter {
  private CustomColorListConverter() {
  }

  public static CustomColorListModel fromDocx4J(CTCustomColorList value) {
    if (value == null) return null;
    return new CustomColorListModel(value.getCustClr().stream().map(CustomColorConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
