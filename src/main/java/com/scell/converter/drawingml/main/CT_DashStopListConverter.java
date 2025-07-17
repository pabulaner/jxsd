package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_DashStopListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTDashStopList;

public class CT_DashStopListConverter {
  private CT_DashStopListConverter() {
  }

  public static CT_DashStopListModel fromDocx4j(CTDashStopList value) {
    if (value == null) return null;
    return new CT_DashStopListModel(value.getDs().stream().map(CT_DashStopConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTDashStopList toDocx4j(CT_DashStopListModel value) {
    return null;
  }
}
