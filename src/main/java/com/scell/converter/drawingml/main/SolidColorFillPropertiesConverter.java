package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import org.docx4j.dml.CTSolidColorFillProperties;

public class SolidColorFillPropertiesConverter {
  private SolidColorFillPropertiesConverter() {
  }

  public static SolidColorFillPropertiesModel fromDocx4J(CTSolidColorFillProperties value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return SolidColorFillPropertiesModel.newScrgbClr(ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return SolidColorFillPropertiesModel.newSrgbClr(SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) return SolidColorFillPropertiesModel.newHslClr(HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) return SolidColorFillPropertiesModel.newSysClr(SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) return SolidColorFillPropertiesModel.newSchemeClr(SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) return SolidColorFillPropertiesModel.newPrstClr(PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new SolidColorFillPropertiesModel();
  }
}
