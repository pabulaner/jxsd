package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_GroupLockingModel;
import org.docx4j.dml.CTGroupLocking;

public class CT_GroupLockingConverter {
  private CT_GroupLockingConverter() {
  }

  public static CT_GroupLockingModel fromDocx4J(CTGroupLocking value) {
    if (value == null) return null;
    return new CT_GroupLockingModel(BooleanConverter.fromDocx4J(value.getNoResize()), BooleanConverter.fromDocx4J(value.getNoChangeAspect()), BooleanConverter.fromDocx4J(value.getNoSelect()), BooleanConverter.fromDocx4J(value.getNoUngrp()), BooleanConverter.fromDocx4J(value.getNoGrp()), BooleanConverter.fromDocx4J(value.getNoMove()), BooleanConverter.fromDocx4J(value.getNoRot()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTGroupLocking toDocx4J(CT_GroupLockingModel value) {
    return null;
  }
}
