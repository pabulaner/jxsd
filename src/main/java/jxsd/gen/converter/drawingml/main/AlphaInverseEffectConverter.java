package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaInverseEffectModel;
import org.docx4j.dml.CTAlphaInverseEffect;

/**
 * This is a generated choice class.
 */
public class AlphaInverseEffectConverter {
  private AlphaInverseEffectConverter() {
  }

  public static AlphaInverseEffectModel fromDocx4j(CTAlphaInverseEffect value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return AlphaInverseEffectModel.newScrgbClr(ScRgbColorConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return AlphaInverseEffectModel.newSrgbClr(SRgbColorConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) return AlphaInverseEffectModel.newHslClr(HslColorConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) return AlphaInverseEffectModel.newSysClr(SystemColorConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) return AlphaInverseEffectModel.newSchemeClr(SchemeColorConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) return AlphaInverseEffectModel.newPrstClr(PresetColorConverter.fromDocx4j(value.getPrstClr()));
    return new AlphaInverseEffectModel();
  }

  public static CTAlphaInverseEffect toDocx4j(AlphaInverseEffectModel value) {
    if (value == null) return null;
    CTAlphaInverseEffect result = new CTAlphaInverseEffect();
    if (value.isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getScrgbClr()));
    if (value.isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getSrgbClr()));
    if (value.isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getHslClr()));
    if (value.isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getSysClr()));
    if (value.isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getSchemeClr()));
    if (value.isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getPrstClr()));
    return result;
  }
}
