package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GradientStopModel;
import org.docx4j.dml.CTGradientStop;

public class CT_GradientStopConverter {
  private CT_GradientStopConverter() {
  }

  public static CT_GradientStopModel fromDocx4j(CTGradientStop value) {
    if (value == null) return null;
    return new CT_GradientStopModel(ST_PositiveFixedPercentageConverter.fromDocx4j(value.getPos()), ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr()));
  }

  public static CTGradientStop toDocx4j(CT_GradientStopModel value) {
    return null;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrConverter {
    private ScrgbClrOrSrgbClrOrHslClrConverter() {
    }

    public static CT_GradientStopModel.ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(
        CTGradientStop.ScrgbClrOrSrgbClrOrHslClr value) {
      if (value == null) return null;
    }

    public static CTGradientStop.ScrgbClrOrSrgbClrOrHslClr toDocx4j(
        CT_GradientStopModel.ScrgbClrOrSrgbClrOrHslClrModel value) {
      return null;
    }
  }
}
