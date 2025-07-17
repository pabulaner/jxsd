package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_LineSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLineSer;

public class CT_LineSerConverter {
  private CT_LineSerConverter() {
  }

  public static CT_LineSerModel fromDocx4j(CTLineSer value) {
    if (value == null) return null;
    return new CT_LineSerModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_UnsignedIntConverter.fromDocx4j(value.getOrder()), CT_SerTxConverter.fromDocx4j(value.getTx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_MarkerConverter.fromDocx4j(value.getMarker()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4j).collect(Collectors.toList()), CT_ErrBarsConverter.fromDocx4j(value.getErrBars()), CT_AxDataSourceConverter.fromDocx4j(value.getCat()), CT_NumDataSourceConverter.fromDocx4j(value.getVal()), CT_BooleanConverter.fromDocx4j(value.getSmooth()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLineSer toDocx4j(CT_LineSerModel value) {
    return null;
  }
}
