package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PivotFmtsModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPivotFmts;

public class CT_PivotFmtsConverter {
  private CT_PivotFmtsConverter() {
  }

  public static CT_PivotFmtsModel fromDocx4j(CTPivotFmts value) {
    if (value == null) return null;
    return new CT_PivotFmtsModel(value.getPivotFmt().stream().map(CT_PivotFmtConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTPivotFmts toDocx4j(CT_PivotFmtsModel value) {
    return null;
  }
}
