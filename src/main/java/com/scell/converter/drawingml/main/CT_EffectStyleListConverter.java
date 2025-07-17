package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectStyleListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTEffectStyleList;

public class CT_EffectStyleListConverter {
  private CT_EffectStyleListConverter() {
  }

  public static CT_EffectStyleListModel fromDocx4j(CTEffectStyleList value) {
    if (value == null) return null;
    return new CT_EffectStyleListModel(value.getEffectStyle().stream().map(CT_EffectStyleItemConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTEffectStyleList toDocx4j(CT_EffectStyleListModel value) {
    return null;
  }
}
