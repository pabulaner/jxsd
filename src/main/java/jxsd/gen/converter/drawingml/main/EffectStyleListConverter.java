package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.EffectStyleListModel;
import org.docx4j.dml.CTEffectStyleList;

/**
 * This is a generated sequence class.
 */
public class EffectStyleListConverter {
  private EffectStyleListConverter() {
  }

  public static EffectStyleListModel fromDocx4j(CTEffectStyleList value) {
    if (value == null) return null;
    return new EffectStyleListModel(value.getEffectStyle().stream().map(EffectStyleItemConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTEffectStyleList toDocx4j(EffectStyleListModel value) {
    if (value == null) return null;
    CTEffectStyleList result = new CTEffectStyleList();
    result.getEffectStyle().addAll(value.getEffectStyle().stream().map(EffectStyleItemConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
