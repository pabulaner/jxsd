package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetColorModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPresetColor;

public class CT_PresetColorConverter {
  private CT_PresetColorConverter() {
  }

  public static CT_PresetColorModel fromDocx4j(CTPresetColor value) {
    if (value == null) return null;
    return new CT_PresetColorModel(ST_PresetColorValConverter.fromDocx4j(value.getVal()), value.getTintOrShadeOrComp().stream().map(TintOrShadeOrCompConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTPresetColor toDocx4j(CT_PresetColorModel value) {
    return null;
  }

  public static class TintOrShadeOrCompConverter {
    private TintOrShadeOrCompConverter() {
    }

    public static CT_PresetColorModel.TintOrShadeOrCompModel fromDocx4j(
        CTPresetColor.TintOrShadeOrComp value) {
      if (value == null) return null;
    }

    public static CTPresetColor.TintOrShadeOrComp toDocx4j(
        CT_PresetColorModel.TintOrShadeOrCompModel value) {
      return null;
    }
  }
}
