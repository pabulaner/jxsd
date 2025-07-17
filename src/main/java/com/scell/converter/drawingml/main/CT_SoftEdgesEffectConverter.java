package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_SoftEdgesEffectModel;
import org.docx4j.dml.CTSoftEdgesEffect;

public class CT_SoftEdgesEffectConverter {
  private CT_SoftEdgesEffectConverter() {
  }

  public static CT_SoftEdgesEffectModel fromDocx4j(CTSoftEdgesEffect value) {
    if (value == null) return null;
    return new CT_SoftEdgesEffectModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getRad()));
  }

  public static CTSoftEdgesEffect toDocx4j(CT_SoftEdgesEffectModel value) {
    return null;
  }
}
