package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.DashStopModel;
import org.docx4j.dml.CTDashStop;

public class DashStopConverter {
  private DashStopConverter() {
  }

  public static DashStopModel fromDocx4J(CTDashStop value) {
    if (value == null) return null;
    return new DashStopModel(PositivePercentageConverter.fromDocx4J(value.getSp()), PositivePercentageConverter.fromDocx4J(value.getD()));
  }
}
