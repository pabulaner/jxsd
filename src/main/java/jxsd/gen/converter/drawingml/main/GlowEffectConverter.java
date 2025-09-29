package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GlowEffectModel;
import org.docx4j.dml.CTGlowEffect;

/**
 * This is a generated sequence class.
 */
public class GlowEffectConverter {
  private GlowEffectConverter() {
  }

  public static GlowEffectModel fromDocx4j(CTGlowEffect value) {
    if (value == null) return null;
    GlowEffectModel.EG_ColorChoice egColorChoice = new GlowEffectModel.EG_ColorChoice();
    if (value.getScrgbClr() != null) egColorChoice = GlowEffectConverter.newEGColorChoice(GlowEffectConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = GlowEffectConverter.newEGColorChoice(GlowEffectConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = GlowEffectConverter.newEGColorChoice(GlowEffectConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = GlowEffectConverter.newEGColorChoice(GlowEffectConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = GlowEffectConverter.newEGColorChoice(GlowEffectConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = GlowEffectConverter.newEGColorChoice(GlowEffectConverter.fromDocx4j(value.getPrstClr()));
    return new GlowEffectModel(PositiveCoordinateValueConverter.fromDocx4j(value.getRad()), egColorChoice);
  }

  public static CTGlowEffect toDocx4j(GlowEffectModel value) {
    if (value == null) return null;
    CTGlowEffect result = new CTGlowEffect();
    result.setRad(PositiveCoordinateValueConverter.toDocx4j(value.getRad()));
    if (value.getEGColorChoice().isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getEGColorChoice().getScrgbClr()));
    if (value.getEGColorChoice().isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getEGColorChoice().getSrgbClr()));
    if (value.getEGColorChoice().isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getEGColorChoice().getHslClr()));
    if (value.getEGColorChoice().isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getEGColorChoice().getSysClr()));
    if (value.getEGColorChoice().isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getEGColorChoice().getSchemeClr()));
    if (value.getEGColorChoice().isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getEGColorChoice().getPrstClr()));
    return result;
  }
}
