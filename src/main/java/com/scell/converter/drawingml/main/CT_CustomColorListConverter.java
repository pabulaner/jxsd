package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_CustomColorListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTCustomColorList;

public class CT_CustomColorListConverter {
  private CT_CustomColorListConverter() {
  }

  public static CT_CustomColorListModel fromDocx4J(CTCustomColorList value) {
    if (value == null) return null;
    return new CT_CustomColorListModel(value.getCustClr().stream().map(CT_CustomColorConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTCustomColorList toDocx4J(CT_CustomColorListModel value) {
    return null;
  }
}
