package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.LineSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLineSer;

public class LineSerConverter {
  private LineSerConverter() {
  }

  public static LineSerModel fromDocx4J(CTLineSer value) {
    if (value == null) return null;
    return new LineSerModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), UnsignedIntConverter.fromDocx4J(value.getOrder()), SerTxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), MarkerConverter.fromDocx4J(value.getMarker()), value.getDPt().stream().map(DPtConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4J).collect(Collectors.toList()), ErrBarsConverter.fromDocx4J(value.getErrBars()), AxDataSourceConverter.fromDocx4J(value.getCat()), NumDataSourceConverter.fromDocx4J(value.getVal()), BooleanConverter.fromDocx4J(value.getSmooth()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
