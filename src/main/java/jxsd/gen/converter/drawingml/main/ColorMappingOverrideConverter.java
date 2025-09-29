package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorMappingOverrideModel;
import org.docx4j.dml.CTColorMappingOverride;

/**
 * This is a generated choice class.
 */
public class ColorMappingOverrideConverter {
  private ColorMappingOverrideConverter() {
  }

  public static ColorMappingOverrideModel fromDocx4j(CTColorMappingOverride value) {
    if (value == null) return null;
    if (value.getMasterClrMapping() != null) return ColorMappingOverrideModel.newMasterClrMapping(EmptyElementConverter.fromDocx4j(value.getMasterClrMapping()));
    if (value.getOverrideClrMapping() != null) return ColorMappingOverrideModel.newOverrideClrMapping(ColorMappingConverter.fromDocx4j(value.getOverrideClrMapping()));
    return new ColorMappingOverrideModel();
  }

  public static CTColorMappingOverride toDocx4j(ColorMappingOverrideModel value) {
    if (value == null) return null;
    CTColorMappingOverride result = new CTColorMappingOverride();
    if (value.isMasterClrMapping()) result.setMasterClrMapping(EmptyElementConverter.toDocx4j(value.getMasterClrMapping()));
    if (value.isOverrideClrMapping()) result.setOverrideClrMapping(ColorMappingConverter.toDocx4j(value.getOverrideClrMapping()));
    return result;
  }
}
