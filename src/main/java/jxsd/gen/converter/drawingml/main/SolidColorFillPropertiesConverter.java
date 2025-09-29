package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.SolidColorFillPropertiesModel;
import org.docx4j.dml.CTSolidColorFillProperties;

/**
 * This is a generated choice class.
 */
public class SolidColorFillPropertiesConverter {
  private SolidColorFillPropertiesConverter() {
  }

  public static SolidColorFillPropertiesModel fromDocx4j(CTSolidColorFillProperties value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return SolidColorFillPropertiesModel.newScrgbClr(ScRgbColorConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return SolidColorFillPropertiesModel.newSrgbClr(SRgbColorConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) return SolidColorFillPropertiesModel.newHslClr(HslColorConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) return SolidColorFillPropertiesModel.newSysClr(SystemColorConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) return SolidColorFillPropertiesModel.newSchemeClr(SchemeColorConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) return SolidColorFillPropertiesModel.newPrstClr(PresetColorConverter.fromDocx4j(value.getPrstClr()));
    return new SolidColorFillPropertiesModel();
  }

  public static CTSolidColorFillProperties toDocx4j(SolidColorFillPropertiesModel value) {
    if (value == null) return null;
    CTSolidColorFillProperties result = new CTSolidColorFillProperties();
    if (value.isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getScrgbClr()));
    if (value.isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getSrgbClr()));
    if (value.isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getHslClr()));
    if (value.isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getSysClr()));
    if (value.isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getSchemeClr()));
    if (value.isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getPrstClr()));
    return result;
  }
}
