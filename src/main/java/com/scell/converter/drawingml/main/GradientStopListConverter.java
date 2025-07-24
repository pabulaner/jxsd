package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GradientStopListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTGradientStopList;

public class GradientStopListConverter {
  private GradientStopListConverter() {
  }

  public static GradientStopListModel fromDocx4J(CTGradientStopList value) {
    if (value == null) return null;
    return new GradientStopListModel(value.getGs().stream().map(GradientStopConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
