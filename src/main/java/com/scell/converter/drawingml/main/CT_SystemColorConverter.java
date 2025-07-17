package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_SystemColorModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTSystemColor;

public class CT_SystemColorConverter {
  private CT_SystemColorConverter() {
  }

  public static CT_SystemColorModel fromDocx4j(CTSystemColor value) {
    if (value == null) return null;
    return new CT_SystemColorModel(ST_SystemColorValConverter.fromDocx4j(value.getVal()), ST_HexBinary3Converter.fromDocx4j(value.getLastClr()), value.getTintOrShadeOrComp().stream().map(TintOrShadeOrCompConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTSystemColor toDocx4j(CT_SystemColorModel value) {
    return null;
  }

  public static class TintOrShadeOrCompConverter {
    private TintOrShadeOrCompConverter() {
    }

    public static CT_SystemColorModel.TintOrShadeOrCompModel fromDocx4j(
        CTSystemColor.TintOrShadeOrComp value) {
      if (value == null) return null;
    }

    public static CTSystemColor.TintOrShadeOrComp toDocx4j(
        CT_SystemColorModel.TintOrShadeOrCompModel value) {
      return null;
    }
  }
}
