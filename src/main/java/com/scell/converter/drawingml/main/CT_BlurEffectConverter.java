package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_BlurEffectModel;
import org.docx4j.dml.CTBlurEffect;

public class CT_BlurEffectConverter {
  private CT_BlurEffectConverter() {
  }

  public static CT_BlurEffectModel fromDocx4J(CTBlurEffect value) {
    if (value == null) return null;
    return new CT_BlurEffectModel(ST_PositiveCoordinateConverter.fromDocx4J(value.getRad()), BooleanConverter.fromDocx4J(value.getGrow()));
  }

  public static CTBlurEffect toDocx4J(CT_BlurEffectModel value) {
    return null;
  }
}
