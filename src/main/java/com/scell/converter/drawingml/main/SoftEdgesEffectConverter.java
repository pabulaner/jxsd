package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.SoftEdgesEffectModel;
import org.docx4j.dml.CTSoftEdgesEffect;

public class SoftEdgesEffectConverter {
  private SoftEdgesEffectConverter() {
  }

  public static SoftEdgesEffectModel fromDocx4J(CTSoftEdgesEffect value) {
    if (value == null) return null;
    return new SoftEdgesEffectModel(PositiveCoordinateConverter.fromDocx4J(value.getRad()));
  }
}
