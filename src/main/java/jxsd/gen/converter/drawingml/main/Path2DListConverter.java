package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.Path2DListModel;
import org.docx4j.dml.CTPath2DList;

/**
 * This is a generated sequence class.
 */
public class Path2DListConverter {
  private Path2DListConverter() {
  }

  public static Path2DListModel fromDocx4j(CTPath2DList value) {
    if (value == null) return null;
    return new Path2DListModel(value.getPath().stream().map(Path2DConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTPath2DList toDocx4j(Path2DListModel value) {
    if (value == null) return null;
    CTPath2DList result = new CTPath2DList();
    result.getPath().addAll(value.getPath().stream().map(Path2DConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
