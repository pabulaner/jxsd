package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PivotSourceModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPivotSource;

public class PivotSourceConverter {
  private PivotSourceConverter() {
  }

  public static PivotSourceModel fromDocx4J(CTPivotSource value) {
    if (value == null) return null;
    return new PivotSourceModel(XstringConverter.fromDocx4J(value.getName()), UnsignedIntConverter.fromDocx4J(value.getFmtId()), value.getExtLst().stream().map(ExtensionListConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
