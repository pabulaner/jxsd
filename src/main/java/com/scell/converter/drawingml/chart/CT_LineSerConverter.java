package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_LineSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLineSer;

public class CT_LineSerConverter {
  private CT_LineSerConverter() {
  }

  public static CT_LineSerModel fromDocx4J(CTLineSer value) {
    if (value == null) return null;
    return new CT_LineSerModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), CT_UnsignedIntConverter.fromDocx4J(value.getOrder()), CT_SerTxConverter.fromDocx4J(value.getTx()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_MarkerConverter.fromDocx4J(value.getMarker()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4J).collect(Collectors.toList()), CT_ErrBarsConverter.fromDocx4J(value.getErrBars()), CT_AxDataSourceConverter.fromDocx4J(value.getCat()), CT_NumDataSourceConverter.fromDocx4J(value.getVal()), CT_BooleanConverter.fromDocx4J(value.getSmooth()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTLineSer toDocx4J(CT_LineSerModel value) {
    return null;
  }
}
