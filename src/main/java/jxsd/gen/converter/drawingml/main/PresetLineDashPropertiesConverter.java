package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetLineDashPropertiesModel;
import org.docx4j.dml.CTPresetLineDashProperties;

/**
 * This is a generated sequence class.
 */
public class PresetLineDashPropertiesConverter {
  private PresetLineDashPropertiesConverter() {
  }

  public static PresetLineDashPropertiesModel fromDocx4j(CTPresetLineDashProperties value) {
    if (value == null) return null;
    return new PresetLineDashPropertiesModel(PresetLineDashValValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPresetLineDashProperties toDocx4j(PresetLineDashPropertiesModel value) {
    if (value == null) return null;
    CTPresetLineDashProperties result = new CTPresetLineDashProperties();
    result.setVal(PresetLineDashValValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
