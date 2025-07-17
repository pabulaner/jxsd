package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_BlurEffectModel;
import org.docx4j.dml.CTBlurEffect;

public class CT_BlurEffectConverter {
  private CT_BlurEffectConverter() {
  }

  public static CT_BlurEffectModel fromDocx4j(CTBlurEffect value) {
    if (value == null) return null;
    return new CT_BlurEffectModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getRad()), BooleanConverter.fromDocx4j(value.getGrow()));
  }

  public static CTBlurEffect toDocx4j(CT_BlurEffectModel value) {
    return null;
  }
}
