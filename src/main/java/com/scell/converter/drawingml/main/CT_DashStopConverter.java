package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_DashStopModel;
import org.docx4j.dml.CTDashStop;

public class CT_DashStopConverter {
  private CT_DashStopConverter() {
  }

  public static CT_DashStopModel fromDocx4J(CTDashStop value) {
    if (value == null) return null;
    return new CT_DashStopModel(ST_PositivePercentageConverter.fromDocx4J(value.getSp()), ST_PositivePercentageConverter.fromDocx4J(value.getD()));
  }

  public static CTDashStop toDocx4J(CT_DashStopModel value) {
    return null;
  }
}
