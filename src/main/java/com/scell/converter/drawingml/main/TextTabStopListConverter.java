package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextTabStopListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTTextTabStopList;

public class TextTabStopListConverter {
  private TextTabStopListConverter() {
  }

  public static TextTabStopListModel fromDocx4J(CTTextTabStopList value) {
    if (value == null) return null;
    return new TextTabStopListModel(value.getTab().stream().map(TextTabStopConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
