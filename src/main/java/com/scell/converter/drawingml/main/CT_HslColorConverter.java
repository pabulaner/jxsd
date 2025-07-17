package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_HslColorModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTHslColor;

public class CT_HslColorConverter {
  private CT_HslColorConverter() {
  }

  public static CT_HslColorModel fromDocx4j(CTHslColor value) {
    if (value == null) return null;
    return new CT_HslColorModel(ST_PositiveFixedAngleConverter.fromDocx4j(value.getHue()), ST_PercentageConverter.fromDocx4j(value.getLum()), ST_PercentageConverter.fromDocx4j(value.getSat()), value.getTintOrShadeOrComp().stream().map(TintOrShadeOrCompConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTHslColor toDocx4j(CT_HslColorModel value) {
    return null;
  }

  public static class TintOrShadeOrCompConverter {
    private TintOrShadeOrCompConverter() {
    }

    public static CT_HslColorModel.TintOrShadeOrCompModel fromDocx4j(
        CTHslColor.TintOrShadeOrComp value) {
      if (value == null) return null;
    }

    public static CTHslColor.TintOrShadeOrComp toDocx4j(
        CT_HslColorModel.TintOrShadeOrCompModel value) {
      return null;
    }
  }
}
