package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.OuterShadowEffectModel;
import org.docx4j.dml.CTOuterShadowEffect;

/**
 * This is a generated sequence class.
 */
public class OuterShadowEffectConverter {
  private OuterShadowEffectConverter() {
  }

  public static OuterShadowEffectModel fromDocx4j(CTOuterShadowEffect value) {
    if (value == null) return null;
    OuterShadowEffectModel.EG_ColorChoice egColorChoice = new OuterShadowEffectModel.EG_ColorChoice();
    if (value.getScrgbClr() != null) egColorChoice = OuterShadowEffectModel.EG_ColorChoice.newScrgbClr(ScRgbColorConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = OuterShadowEffectModel.EG_ColorChoice.newSrgbClr(SRgbColorConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = OuterShadowEffectModel.EG_ColorChoice.newHslClr(HslColorConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = OuterShadowEffectModel.EG_ColorChoice.newSysClr(SystemColorConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = OuterShadowEffectModel.EG_ColorChoice.newSchemeClr(SchemeColorConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = OuterShadowEffectModel.EG_ColorChoice.newPrstClr(PresetColorConverter.fromDocx4j(value.getPrstClr()));
    return new OuterShadowEffectModel(PositiveCoordinateValueConverter.fromDocx4j(value.getBlurRad()), PositiveCoordinateValueConverter.fromDocx4j(value.getDist()), BooleanValueConverter.fromDocx4j(value.isRotWithShape()), PercentageValueConverter.fromDocx4j(value.getSy()), FixedAngleValueConverter.fromDocx4j(value.getKy()), PercentageValueConverter.fromDocx4j(value.getSx()), FixedAngleValueConverter.fromDocx4j(value.getKx()), PositiveFixedAngleValueConverter.fromDocx4j(value.getDir()), RectAlignmentValueConverter.fromDocx4j(value.getAlgn()), egColorChoice);
  }

  public static CTOuterShadowEffect toDocx4j(OuterShadowEffectModel value) {
    if (value == null) return null;
    CTOuterShadowEffect result = new CTOuterShadowEffect();
    result.setBlurRad(PositiveCoordinateValueConverter.toDocx4j(value.getBlurRad()));
    result.setDist(PositiveCoordinateValueConverter.toDocx4j(value.getDist()));
    result.setRotWithShape(BooleanValueConverter.toDocx4j(value.getRotWithShape()));
    result.setSy(PercentageValueConverter.toDocx4j(value.getSy()));
    result.setKy(FixedAngleValueConverter.toDocx4j(value.getKy()));
    result.setSx(PercentageValueConverter.toDocx4j(value.getSx()));
    result.setKx(FixedAngleValueConverter.toDocx4j(value.getKx()));
    result.setDir(PositiveFixedAngleValueConverter.toDocx4j(value.getDir()));
    result.setAlgn(RectAlignmentValueConverter.toDocx4j(value.getAlgn()));
    if (value.getEGColorChoice().isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getEGColorChoice().getScrgbClr()));
    if (value.getEGColorChoice().isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getEGColorChoice().getSrgbClr()));
    if (value.getEGColorChoice().isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getEGColorChoice().getHslClr()));
    if (value.getEGColorChoice().isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getEGColorChoice().getSysClr()));
    if (value.getEGColorChoice().isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getEGColorChoice().getSchemeClr()));
    if (value.getEGColorChoice().isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getEGColorChoice().getPrstClr()));
    return result;
  }
}
