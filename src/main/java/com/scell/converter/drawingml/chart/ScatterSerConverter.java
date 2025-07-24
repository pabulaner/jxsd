package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.ScatterSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTScatterSer;

public class ScatterSerConverter {
  private ScatterSerConverter() {
  }

  public static ScatterSerModel fromDocx4J(CTScatterSer value) {
    if (value == null) return null;
    return new ScatterSerModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), UnsignedIntConverter.fromDocx4J(value.getOrder()), SerTxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), MarkerConverter.fromDocx4J(value.getMarker()), value.getDPt().stream().map(DPtConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4J).collect(Collectors.toList()), value.getErrBars().stream().map(ErrBarsConverter::fromDocx4J).collect(Collectors.toList()), AxDataSourceConverter.fromDocx4J(value.getXVal()), NumDataSourceConverter.fromDocx4J(value.getYVal()), BooleanConverter.fromDocx4J(value.getSmooth()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
