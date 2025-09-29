package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.InnerShadowEffectModel;
import org.docx4j.dml.CTInnerShadowEffect;

/**
 * This is a generated sequence class.
 */
public class InnerShadowEffectConverter {
  private InnerShadowEffectConverter() {
  }

  public static InnerShadowEffectModel fromDocx4j(CTInnerShadowEffect value) {
    if (value == null) return null;
    InnerShadowEffectModel.EG_ColorChoice egColorChoice = new InnerShadowEffectModel.EG_ColorChoice();
    if (value.getScrgbClr() != null) egColorChoice = InnerShadowEffectConverter.newEGColorChoice(InnerShadowEffectConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = InnerShadowEffectConverter.newEGColorChoice(InnerShadowEffectConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = InnerShadowEffectConverter.newEGColorChoice(InnerShadowEffectConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = InnerShadowEffectConverter.newEGColorChoice(InnerShadowEffectConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = InnerShadowEffectConverter.newEGColorChoice(InnerShadowEffectConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = InnerShadowEffectConverter.newEGColorChoice(InnerShadowEffectConverter.fromDocx4j(value.getPrstClr()));
    return new InnerShadowEffectModel(PositiveCoordinateValueConverter.fromDocx4j(value.getBlurRad()), PositiveCoordinateValueConverter.fromDocx4j(value.getDist()), PositiveFixedAngleValueConverter.fromDocx4j(value.getDir()), egColorChoice);
  }

  public static CTInnerShadowEffect toDocx4j(InnerShadowEffectModel value) {
    if (value == null) return null;
    CTInnerShadowEffect result = new CTInnerShadowEffect();
    result.setBlurRad(PositiveCoordinateValueConverter.toDocx4j(value.getBlurRad()));
    result.setDist(PositiveCoordinateValueConverter.toDocx4j(value.getDist()));
    result.setDir(PositiveFixedAngleValueConverter.toDocx4j(value.getDir()));
    if (value.getEGColorChoice().isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getEGColorChoice().getScrgbClr()));
    if (value.getEGColorChoice().isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getEGColorChoice().getSrgbClr()));
    if (value.getEGColorChoice().isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getEGColorChoice().getHslClr()));
    if (value.getEGColorChoice().isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getEGColorChoice().getSysClr()));
    if (value.getEGColorChoice().isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getEGColorChoice().getSchemeClr()));
    if (value.getEGColorChoice().isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getEGColorChoice().getPrstClr()));
    return result;
  }
}
