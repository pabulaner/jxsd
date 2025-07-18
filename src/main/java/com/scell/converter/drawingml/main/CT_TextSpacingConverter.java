package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextSpacingModel;
import org.docx4j.dml.CTTextSpacing;

public class CT_TextSpacingConverter {
  private CT_TextSpacingConverter() {
  }

  public static CT_TextSpacingModel fromDocx4J(CTTextSpacing value) {
    if (value == null) return null;
    if (value.getSpcPct() != null) return CT_TextSpacingModel.newSpcPct(CT_TextSpacingPercentConverter.fromDocx4J(value.getSpcPct()));
    if (value.getSpcPts() != null) return CT_TextSpacingModel.newSpcPts(CT_TextSpacingPointConverter.fromDocx4J(value.getSpcPts()));
    return new CT_TextSpacingModel();
  }

  public static CTTextSpacing toDocx4J(CT_TextSpacingModel value) {
    return null;
  }
}
