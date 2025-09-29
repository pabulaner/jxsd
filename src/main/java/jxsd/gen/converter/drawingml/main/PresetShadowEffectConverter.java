package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetShadowEffectModel;
import org.docx4j.dml.CTPresetShadowEffect;

/**
 * This is a generated sequence class.
 */
public class PresetShadowEffectConverter {
  private PresetShadowEffectConverter() {
  }

  public static PresetShadowEffectModel fromDocx4j(CTPresetShadowEffect value) {
    if (value == null) return null;
    PresetShadowEffectModel.EG_ColorChoice egColorChoice = new PresetShadowEffectModel.EG_ColorChoice();
    if (value.getScrgbClr() != null) egColorChoice = PresetShadowEffectConverter.newEGColorChoice(PresetShadowEffectConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = PresetShadowEffectConverter.newEGColorChoice(PresetShadowEffectConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = PresetShadowEffectConverter.newEGColorChoice(PresetShadowEffectConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = PresetShadowEffectConverter.newEGColorChoice(PresetShadowEffectConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = PresetShadowEffectConverter.newEGColorChoice(PresetShadowEffectConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = PresetShadowEffectConverter.newEGColorChoice(PresetShadowEffectConverter.fromDocx4j(value.getPrstClr()));
    return new PresetShadowEffectModel(PositiveCoordinateValueConverter.fromDocx4j(value.getDist()), PresetShadowValValueConverter.fromDocx4j(value.getPrst()), PositiveFixedAngleValueConverter.fromDocx4j(value.getDir()), egColorChoice);
  }

  public static CTPresetShadowEffect toDocx4j(PresetShadowEffectModel value) {
    if (value == null) return null;
    CTPresetShadowEffect result = new CTPresetShadowEffect();
    result.setDist(PositiveCoordinateValueConverter.toDocx4j(value.getDist()));
    result.setPrst(PresetShadowValValueConverter.toDocx4j(value.getPrst()));
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
