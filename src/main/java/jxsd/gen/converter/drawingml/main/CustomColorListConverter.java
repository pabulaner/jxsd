package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.CustomColorListModel;
import org.docx4j.dml.CTCustomColorList;

/**
 * This is a generated sequence class.
 */
public class CustomColorListConverter {
  private CustomColorListConverter() {
  }

  public static CustomColorListModel fromDocx4j(CTCustomColorList value) {
    if (value == null) return null;
    return new CustomColorListModel(value.getCustClr().stream().map(CustomColorConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTCustomColorList toDocx4j(CustomColorListModel value) {
    if (value == null) return null;
    CTCustomColorList result = new CTCustomColorList();
    result.getCustClr().addAll(value.getCustClr().stream().map(CustomColorConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
