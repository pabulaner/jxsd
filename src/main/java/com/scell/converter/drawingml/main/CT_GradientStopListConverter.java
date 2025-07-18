package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GradientStopListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTGradientStopList;

public class CT_GradientStopListConverter {
  private CT_GradientStopListConverter() {
  }

  public static CT_GradientStopListModel fromDocx4J(CTGradientStopList value) {
    if (value == null) return null;
    return new CT_GradientStopListModel(value.getGs().stream().map(CT_GradientStopConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTGradientStopList toDocx4J(CT_GradientStopListModel value) {
    return null;
  }
}
