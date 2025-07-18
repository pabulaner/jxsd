package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_SolidColorFillPropertiesModel;
import org.docx4j.dml.CTSolidColorFillProperties;

public class CT_SolidColorFillPropertiesConverter {
  private CT_SolidColorFillPropertiesConverter() {
  }

  public static CT_SolidColorFillPropertiesModel fromDocx4J(CTSolidColorFillProperties value) {
    if (value == null) return null;
    if (value.getScrgbClr() != null) return CT_SolidColorFillPropertiesModel.newScrgbClr(CT_ScRgbColorConverter.fromDocx4J(value.getScrgbClr()));
    if (value.getSrgbClr() != null) return CT_SolidColorFillPropertiesModel.newSrgbClr(CT_SRgbColorConverter.fromDocx4J(value.getSrgbClr()));
    if (value.getHslClr() != null) return CT_SolidColorFillPropertiesModel.newHslClr(CT_HslColorConverter.fromDocx4J(value.getHslClr()));
    if (value.getSysClr() != null) return CT_SolidColorFillPropertiesModel.newSysClr(CT_SystemColorConverter.fromDocx4J(value.getSysClr()));
    if (value.getSchemeClr() != null) return CT_SolidColorFillPropertiesModel.newSchemeClr(CT_SchemeColorConverter.fromDocx4J(value.getSchemeClr()));
    if (value.getPrstClr() != null) return CT_SolidColorFillPropertiesModel.newPrstClr(CT_PresetColorConverter.fromDocx4J(value.getPrstClr()));
    return new CT_SolidColorFillPropertiesModel();
  }

  public static CTSolidColorFillProperties toDocx4J(CT_SolidColorFillPropertiesModel value) {
    return null;
  }
}
