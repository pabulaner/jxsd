package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.ReflectionEffectModel;
import org.docx4j.dml.CTReflectionEffect;

public class ReflectionEffectConverter {
  private ReflectionEffectConverter() {
  }

  public static ReflectionEffectModel fromDocx4J(CTReflectionEffect value) {
    if (value == null) return null;
    return new ReflectionEffectModel(PositiveCoordinateConverter.fromDocx4J(value.getBlurRad()), PositiveFixedPercentageConverter.fromDocx4J(value.getEndPos()), PercentageConverter.fromDocx4J(value.getSy()), FixedAngleConverter.fromDocx4J(value.getKx()), PositiveFixedPercentageConverter.fromDocx4J(value.getStA()), PositiveFixedPercentageConverter.fromDocx4J(value.getStPos()), RectAlignmentConverter.fromDocx4J(value.getAlgn()), PositiveCoordinateConverter.fromDocx4J(value.getDist()), BooleanConverter.fromDocx4J(value.isRotWithShape()), FixedAngleConverter.fromDocx4J(value.getKy()), PositiveFixedAngleConverter.fromDocx4J(value.getFadeDir()), PercentageConverter.fromDocx4J(value.getSx()), PositiveFixedAngleConverter.fromDocx4J(value.getDir()), PositiveFixedPercentageConverter.fromDocx4J(value.getEndA()));
  }
}
