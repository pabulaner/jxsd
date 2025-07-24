package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineStyleListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTLineStyleList;

public class LineStyleListConverter {
  private LineStyleListConverter() {
  }

  public static LineStyleListModel fromDocx4J(CTLineStyleList value) {
    if (value == null) return null;
    return new LineStyleListModel(value.getLn().stream().map(LinePropertiesConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
