package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_SRgbColorModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTSRgbColor;

public class CT_SRgbColorConverter {
  private CT_SRgbColorConverter() {
  }

  public static CT_SRgbColorModel fromDocx4j(CTSRgbColor value) {
    if (value == null) return null;
    return new CT_SRgbColorModel(ST_HexBinary3Converter.fromDocx4j(value.getVal()), value.getTintOrShadeOrComp().stream().map(TintOrShadeOrCompConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTSRgbColor toDocx4j(CT_SRgbColorModel value) {
    return null;
  }

  public static class TintOrShadeOrCompConverter {
    private TintOrShadeOrCompConverter() {
    }

    public static CT_SRgbColorModel.TintOrShadeOrCompModel fromDocx4j(
        CTSRgbColor.TintOrShadeOrComp value) {
      if (value == null) return null;
    }

    public static CTSRgbColor.TintOrShadeOrComp toDocx4j(
        CT_SRgbColorModel.TintOrShadeOrCompModel value) {
      return null;
    }
  }
}
