package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorMappingOverrideModel;
import org.docx4j.dml.CTColorMappingOverride;

public class ColorMappingOverrideConverter {
  private ColorMappingOverrideConverter() {
  }

  public static ColorMappingOverrideModel fromDocx4J(CTColorMappingOverride value) {
    if (value == null) return null;
    if (value.getMasterClrMapping() != null) return ColorMappingOverrideModel.newMasterClrMapping(EmptyElementConverter.fromDocx4J(value.getMasterClrMapping()));
    if (value.getOverrideClrMapping() != null) return ColorMappingOverrideModel.newOverrideClrMapping(ColorMappingConverter.fromDocx4J(value.getOverrideClrMapping()));
    return new ColorMappingOverrideModel();
  }
}
