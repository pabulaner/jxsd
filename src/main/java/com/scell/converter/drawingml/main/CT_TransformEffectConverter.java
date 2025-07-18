package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TransformEffectModel;
import org.docx4j.dml.CTTransformEffect;

public class CT_TransformEffectConverter {
  private CT_TransformEffectConverter() {
  }

  public static CT_TransformEffectModel fromDocx4J(CTTransformEffect value) {
    if (value == null) return null;
    return new CT_TransformEffectModel(ST_PercentageConverter.fromDocx4J(value.getSy()), ST_FixedAngleConverter.fromDocx4J(value.getKy()), ST_PercentageConverter.fromDocx4J(value.getSx()), ST_CoordinateConverter.fromDocx4J(value.getTy()), ST_FixedAngleConverter.fromDocx4J(value.getKx()), ST_CoordinateConverter.fromDocx4J(value.getTx()));
  }

  public static CTTransformEffect toDocx4J(CT_TransformEffectModel value) {
    return null;
  }
}
