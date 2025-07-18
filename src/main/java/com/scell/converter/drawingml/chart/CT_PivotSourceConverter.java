package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PivotSourceModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPivotSource;

public class CT_PivotSourceConverter {
  private CT_PivotSourceConverter() {
  }

  public static CT_PivotSourceModel fromDocx4J(CTPivotSource value) {
    if (value == null) return null;
    return new CT_PivotSourceModel(ST_XstringConverter.fromDocx4J(value.getName()), CT_UnsignedIntConverter.fromDocx4J(value.getFmtId()), value.getExtLst().stream().map(CT_ExtensionListConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTPivotSource toDocx4J(CT_PivotSourceModel value) {
    return null;
  }
}
