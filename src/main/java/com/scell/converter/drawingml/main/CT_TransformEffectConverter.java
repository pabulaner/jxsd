package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TransformEffectModel;
import org.docx4j.dml.CTTransformEffect;

public class CT_TransformEffectConverter {
  private CT_TransformEffectConverter() {
  }

  public static CT_TransformEffectModel fromDocx4j(CTTransformEffect value) {
    if (value == null) return null;
    return new CT_TransformEffectModel(ST_PercentageConverter.fromDocx4j(value.getSy()), ST_FixedAngleConverter.fromDocx4j(value.getKy()), ST_PercentageConverter.fromDocx4j(value.getSx()), ST_CoordinateConverter.fromDocx4j(value.getTy()), ST_FixedAngleConverter.fromDocx4j(value.getKx()), ST_CoordinateConverter.fromDocx4j(value.getTx()));
  }

  public static CTTransformEffect toDocx4j(CT_TransformEffectModel value) {
    return null;
  }
}
