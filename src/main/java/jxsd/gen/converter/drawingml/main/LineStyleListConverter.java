package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.LineStyleListModel;
import org.docx4j.dml.CTLineStyleList;

/**
 * This is a generated sequence class.
 */
public class LineStyleListConverter {
  private LineStyleListConverter() {
  }

  public static LineStyleListModel fromDocx4j(CTLineStyleList value) {
    if (value == null) return null;
    return new LineStyleListModel(value.getLn().stream().map(LinePropertiesConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTLineStyleList toDocx4j(LineStyleListModel value) {
    if (value == null) return null;
    CTLineStyleList result = new CTLineStyleList();
    result.getLn().addAll(value.getLn().stream().map(LinePropertiesConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
