package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ScRgbColorModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTScRgbColor;

public class CT_ScRgbColorConverter {
  private CT_ScRgbColorConverter() {
  }

  public static CT_ScRgbColorModel fromDocx4j(CTScRgbColor value) {
    if (value == null) return null;
    return new CT_ScRgbColorModel(ST_PercentageConverter.fromDocx4j(value.getG()), ST_PercentageConverter.fromDocx4j(value.getR()), ST_PercentageConverter.fromDocx4j(value.getB()), value.getTintOrShadeOrComp().stream().map(TintOrShadeOrCompConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTScRgbColor toDocx4j(CT_ScRgbColorModel value) {
    return null;
  }

  public static class TintOrShadeOrCompConverter {
    private TintOrShadeOrCompConverter() {
    }

    public static CT_ScRgbColorModel.TintOrShadeOrCompModel fromDocx4j(
        CTScRgbColor.TintOrShadeOrComp value) {
      if (value == null) return null;
    }

    public static CTScRgbColor.TintOrShadeOrComp toDocx4j(
        CT_ScRgbColorModel.TintOrShadeOrCompModel value) {
      return null;
    }
  }
}
