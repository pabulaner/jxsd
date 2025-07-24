package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.BarSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBarSer;

public class BarSerConverter {
  private BarSerConverter() {
  }

  public static BarSerModel fromDocx4J(CTBarSer value) {
    if (value == null) return null;
    return new BarSerModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), UnsignedIntConverter.fromDocx4J(value.getOrder()), SerTxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), BooleanConverter.fromDocx4J(value.getInvertIfNegative()), PictureOptionsConverter.fromDocx4J(value.getPictureOptions()), value.getDPt().stream().map(DPtConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4J).collect(Collectors.toList()), ErrBarsConverter.fromDocx4J(value.getErrBars()), AxDataSourceConverter.fromDocx4J(value.getCat()), NumDataSourceConverter.fromDocx4J(value.getVal()), ShapeConverter.fromDocx4J(value.getShape()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
