package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Path2DListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2DList;

public class Path2DListConverter {
  private Path2DListConverter() {
  }

  public static Path2DListModel fromDocx4J(CTPath2DList value) {
    if (value == null) return null;
    return new Path2DListModel(value.getPath().stream().map(Path2DConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
