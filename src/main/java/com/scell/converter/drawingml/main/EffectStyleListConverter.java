package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.EffectStyleListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTEffectStyleList;

public class EffectStyleListConverter {
  private EffectStyleListConverter() {
  }

  public static EffectStyleListModel fromDocx4J(CTEffectStyleList value) {
    if (value == null) return null;
    return new EffectStyleListModel(value.getEffectStyle().stream().map(EffectStyleItemConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
