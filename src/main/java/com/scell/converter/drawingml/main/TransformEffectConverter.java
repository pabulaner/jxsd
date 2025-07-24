package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TransformEffectModel;
import org.docx4j.dml.CTTransformEffect;

public class TransformEffectConverter {
  private TransformEffectConverter() {
  }

  public static TransformEffectModel fromDocx4J(CTTransformEffect value) {
    if (value == null) return null;
    return new TransformEffectModel(PercentageConverter.fromDocx4J(value.getSy()), FixedAngleConverter.fromDocx4J(value.getKy()), PercentageConverter.fromDocx4J(value.getSx()), CoordinateConverter.fromDocx4J(value.getTy()), FixedAngleConverter.fromDocx4J(value.getKx()), CoordinateConverter.fromDocx4J(value.getTx()));
  }
}
