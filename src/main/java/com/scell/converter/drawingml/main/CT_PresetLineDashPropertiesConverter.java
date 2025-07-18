package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetLineDashPropertiesModel;
import org.docx4j.dml.CTPresetLineDashProperties;

public class CT_PresetLineDashPropertiesConverter {
  private CT_PresetLineDashPropertiesConverter() {
  }

  public static CT_PresetLineDashPropertiesModel fromDocx4J(CTPresetLineDashProperties value) {
    if (value == null) return null;
    return new CT_PresetLineDashPropertiesModel(ST_PresetLineDashValConverter.fromDocx4J(value.getVal()));
  }

  public static CTPresetLineDashProperties toDocx4J(CT_PresetLineDashPropertiesModel value) {
    return null;
  }
}
