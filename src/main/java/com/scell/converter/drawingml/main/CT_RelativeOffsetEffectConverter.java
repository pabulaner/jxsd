package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_RelativeOffsetEffectModel;
import org.docx4j.dml.CTRelativeOffsetEffect;

public class CT_RelativeOffsetEffectConverter {
  private CT_RelativeOffsetEffectConverter() {
  }

  public static CT_RelativeOffsetEffectModel fromDocx4J(CTRelativeOffsetEffect value) {
    if (value == null) return null;
    return new CT_RelativeOffsetEffectModel(ST_PercentageConverter.fromDocx4J(value.getTy()), ST_PercentageConverter.fromDocx4J(value.getTx()));
  }

  public static CTRelativeOffsetEffect toDocx4J(CT_RelativeOffsetEffectModel value) {
    return null;
  }
}
