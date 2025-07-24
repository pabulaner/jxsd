package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.DashStopListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTDashStopList;

public class DashStopListConverter {
  private DashStopListConverter() {
  }

  public static DashStopListModel fromDocx4J(CTDashStopList value) {
    if (value == null) return null;
    return new DashStopListModel(value.getDs().stream().map(DashStopConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
