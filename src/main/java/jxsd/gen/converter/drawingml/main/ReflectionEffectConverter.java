package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.ReflectionEffectModel;
import org.docx4j.dml.CTReflectionEffect;

/**
 * This is a generated sequence class.
 */
public class ReflectionEffectConverter {
  private ReflectionEffectConverter() {
  }

  public static ReflectionEffectModel fromDocx4j(CTReflectionEffect value) {
    if (value == null) return null;
    return new ReflectionEffectModel(PositiveCoordinateValueConverter.fromDocx4j(value.getBlurRad()), PositiveFixedPercentageValueConverter.fromDocx4j(value.getEndPos()), PercentageValueConverter.fromDocx4j(value.getSy()), FixedAngleValueConverter.fromDocx4j(value.getKx()), PositiveFixedPercentageValueConverter.fromDocx4j(value.getStA()), PositiveFixedPercentageValueConverter.fromDocx4j(value.getStPos()), RectAlignmentValueConverter.fromDocx4j(value.getAlgn()), PositiveCoordinateValueConverter.fromDocx4j(value.getDist()), BooleanValueConverter.fromDocx4j(value.isRotWithShape()), FixedAngleValueConverter.fromDocx4j(value.getKy()), PositiveFixedAngleValueConverter.fromDocx4j(value.getFadeDir()), PercentageValueConverter.fromDocx4j(value.getSx()), PositiveFixedAngleValueConverter.fromDocx4j(value.getDir()), PositiveFixedPercentageValueConverter.fromDocx4j(value.getEndA()));
  }

  public static CTReflectionEffect toDocx4j(ReflectionEffectModel value) {
    if (value == null) return null;
    CTReflectionEffect result = new CTReflectionEffect();
    result.setBlurRad(PositiveCoordinateValueConverter.toDocx4j(value.getBlurRad()));
    result.setEndPos(PositiveFixedPercentageValueConverter.toDocx4j(value.getEndPos()));
    result.setSy(PercentageValueConverter.toDocx4j(value.getSy()));
    result.setKx(FixedAngleValueConverter.toDocx4j(value.getKx()));
    result.setStA(PositiveFixedPercentageValueConverter.toDocx4j(value.getStA()));
    result.setStPos(PositiveFixedPercentageValueConverter.toDocx4j(value.getStPos()));
    result.setAlgn(RectAlignmentValueConverter.toDocx4j(value.getAlgn()));
    result.setDist(PositiveCoordinateValueConverter.toDocx4j(value.getDist()));
    result.setRotWithShape(BooleanValueConverter.toDocx4j(value.getRotWithShape()));
    result.setKy(FixedAngleValueConverter.toDocx4j(value.getKy()));
    result.setFadeDir(PositiveFixedAngleValueConverter.toDocx4j(value.getFadeDir()));
    result.setSx(PercentageValueConverter.toDocx4j(value.getSx()));
    result.setDir(PositiveFixedAngleValueConverter.toDocx4j(value.getDir()));
    result.setEndA(PositiveFixedPercentageValueConverter.toDocx4j(value.getEndA()));
    return result;
  }
}
