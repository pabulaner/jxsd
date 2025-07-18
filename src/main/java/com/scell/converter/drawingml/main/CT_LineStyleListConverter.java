package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LineStyleListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTLineStyleList;

public class CT_LineStyleListConverter {
  private CT_LineStyleListConverter() {
  }

  public static CT_LineStyleListModel fromDocx4J(CTLineStyleList value) {
    if (value == null) return null;
    return new CT_LineStyleListModel(value.getLn().stream().map(CT_LinePropertiesConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTLineStyleList toDocx4J(CT_LineStyleListModel value) {
    return null;
  }
}
