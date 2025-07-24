package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PivotFmtsModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPivotFmts;

public class PivotFmtsConverter {
  private PivotFmtsConverter() {
  }

  public static PivotFmtsModel fromDocx4J(CTPivotFmts value) {
    if (value == null) return null;
    return new PivotFmtsModel(value.getPivotFmt().stream().map(PivotFmtConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
