package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_SchemeColorModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTSchemeColor;

public class CT_SchemeColorConverter {
  private CT_SchemeColorConverter() {
  }

  public static CT_SchemeColorModel fromDocx4j(CTSchemeColor value) {
    if (value == null) return null;
    return new CT_SchemeColorModel(ST_SchemeColorValConverter.fromDocx4j(value.getVal()), value.getTintOrShadeOrComp().stream().map(TintOrShadeOrCompConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTSchemeColor toDocx4j(CT_SchemeColorModel value) {
    return null;
  }

  public static class TintOrShadeOrCompConverter {
    private TintOrShadeOrCompConverter() {
    }

    public static CT_SchemeColorModel.TintOrShadeOrCompModel fromDocx4j(
        CTSchemeColor.TintOrShadeOrComp value) {
      if (value == null) return null;
    }

    public static CTSchemeColor.TintOrShadeOrComp toDocx4j(
        CT_SchemeColorModel.TintOrShadeOrCompModel value) {
      return null;
    }
  }
}
