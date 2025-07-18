package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorMappingOverrideModel;
import org.docx4j.dml.CTColorMappingOverride;

public class CT_ColorMappingOverrideConverter {
  private CT_ColorMappingOverrideConverter() {
  }

  public static CT_ColorMappingOverrideModel fromDocx4J(CTColorMappingOverride value) {
    if (value == null) return null;
    if (value.getMasterClrMapping() != null) return CT_ColorMappingOverrideModel.newMasterClrMapping(CT_EmptyElementConverter.fromDocx4J(value.getMasterClrMapping()));
    if (value.getOverrideClrMapping() != null) return CT_ColorMappingOverrideModel.newOverrideClrMapping(CT_ColorMappingConverter.fromDocx4J(value.getOverrideClrMapping()));
    return new CT_ColorMappingOverrideModel();
  }

  public static CTColorMappingOverride toDocx4J(CT_ColorMappingOverrideModel value) {
    return null;
  }
}
