package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetLineDashPropertiesModel;
import org.docx4j.dml.CTPresetLineDashProperties;

public class PresetLineDashPropertiesConverter {
  private PresetLineDashPropertiesConverter() {
  }

  public static PresetLineDashPropertiesModel fromDocx4J(CTPresetLineDashProperties value) {
    if (value == null) return null;
    return new PresetLineDashPropertiesModel(PresetLineDashValValueConverter.fromDocx4J(value.getVal()));
  }
}
