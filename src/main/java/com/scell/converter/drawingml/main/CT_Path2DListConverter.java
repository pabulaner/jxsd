package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2DList;

public class CT_Path2DListConverter {
  private CT_Path2DListConverter() {
  }

  public static CT_Path2DListModel fromDocx4J(CTPath2DList value) {
    if (value == null) return null;
    return new CT_Path2DListModel(value.getPath().stream().map(CT_Path2DConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTPath2DList toDocx4J(CT_Path2DListModel value) {
    return null;
  }
}
