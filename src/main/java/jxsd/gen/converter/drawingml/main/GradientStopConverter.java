package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GradientStopModel;
import org.docx4j.dml.CTGradientStop;

/**
 * This is a generated sequence class.
 */
public class GradientStopConverter {
  private GradientStopConverter() {
  }

  public static GradientStopModel fromDocx4j(CTGradientStop value) {
    if (value == null) return null;
    GradientStopModel.EG_ColorChoice egColorChoice = new GradientStopModel.EG_ColorChoice();
    if (value.getScrgbClr() != null) egColorChoice = GradientStopConverter.newEGColorChoice(GradientStopConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = GradientStopConverter.newEGColorChoice(GradientStopConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = GradientStopConverter.newEGColorChoice(GradientStopConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = GradientStopConverter.newEGColorChoice(GradientStopConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = GradientStopConverter.newEGColorChoice(GradientStopConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = GradientStopConverter.newEGColorChoice(GradientStopConverter.fromDocx4j(value.getPrstClr()));
    return new GradientStopModel(PositiveFixedPercentageValueConverter.fromDocx4j(value.getPos()), egColorChoice);
  }

  public static CTGradientStop toDocx4j(GradientStopModel value) {
    if (value == null) return null;
    CTGradientStop result = new CTGradientStop();
    result.setPos(PositiveFixedPercentageValueConverter.toDocx4j(value.getPos()));
    if (value.getEGColorChoice().isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getEGColorChoice().getScrgbClr()));
    if (value.getEGColorChoice().isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getEGColorChoice().getSrgbClr()));
    if (value.getEGColorChoice().isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getEGColorChoice().getHslClr()));
    if (value.getEGColorChoice().isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getEGColorChoice().getSysClr()));
    if (value.getEGColorChoice().isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getEGColorChoice().getSchemeClr()));
    if (value.getEGColorChoice().isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getEGColorChoice().getPrstClr()));
    return result;
  }
}
