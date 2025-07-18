package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_ReflectionEffectModel;
import org.docx4j.dml.CTReflectionEffect;

public class CT_ReflectionEffectConverter {
  private CT_ReflectionEffectConverter() {
  }

  public static CT_ReflectionEffectModel fromDocx4J(CTReflectionEffect value) {
    if (value == null) return null;
    return new CT_ReflectionEffectModel(ST_PositiveCoordinateConverter.fromDocx4J(value.getBlurRad()), ST_PositiveFixedPercentageConverter.fromDocx4J(value.getEndPos()), ST_PercentageConverter.fromDocx4J(value.getSy()), ST_FixedAngleConverter.fromDocx4J(value.getKx()), ST_PositiveFixedPercentageConverter.fromDocx4J(value.getStA()), ST_PositiveFixedPercentageConverter.fromDocx4J(value.getStPos()), ST_RectAlignmentConverter.fromDocx4J(value.getAlgn()), ST_PositiveCoordinateConverter.fromDocx4J(value.getDist()), BooleanConverter.fromDocx4J(value.getRotWithShape()), ST_FixedAngleConverter.fromDocx4J(value.getKy()), ST_PositiveFixedAngleConverter.fromDocx4J(value.getFadeDir()), ST_PercentageConverter.fromDocx4J(value.getSx()), ST_PositiveFixedAngleConverter.fromDocx4J(value.getDir()), ST_PositiveFixedPercentageConverter.fromDocx4J(value.getEndA()));
  }

  public static CTReflectionEffect toDocx4J(CT_ReflectionEffectModel value) {
    return null;
  }
}
