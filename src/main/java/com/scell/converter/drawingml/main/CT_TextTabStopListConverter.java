package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextTabStopListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTTextTabStopList;

public class CT_TextTabStopListConverter {
  private CT_TextTabStopListConverter() {
  }

  public static CT_TextTabStopListModel fromDocx4J(CTTextTabStopList value) {
    if (value == null) return null;
    return new CT_TextTabStopListModel(value.getTab().stream().map(CT_TextTabStopConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTTextTabStopList toDocx4J(CT_TextTabStopListModel value) {
    return null;
  }
}
