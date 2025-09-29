package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.TextTabStopListModel;
import org.docx4j.dml.CTTextTabStopList;

/**
 * This is a generated sequence class.
 */
public class TextTabStopListConverter {
  private TextTabStopListConverter() {
  }

  public static TextTabStopListModel fromDocx4j(CTTextTabStopList value) {
    if (value == null) return null;
    return new TextTabStopListModel(value.getTab().stream().map(TextTabStopConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTTextTabStopList toDocx4j(TextTabStopListModel value) {
    if (value == null) return null;
    CTTextTabStopList result = new CTTextTabStopList();
    result.getTab().addAll(value.getTab().stream().map(TextTabStopConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
