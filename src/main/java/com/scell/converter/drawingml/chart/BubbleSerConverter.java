package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.BubbleSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBubbleSer;

public class BubbleSerConverter {
  private BubbleSerConverter() {
  }

  public static BubbleSerModel fromDocx4J(CTBubbleSer value) {
    if (value == null) return null;
    return new BubbleSerModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), UnsignedIntConverter.fromDocx4J(value.getOrder()), SerTxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), BooleanConverter.fromDocx4J(value.getInvertIfNegative()), value.getDPt().stream().map(DPtConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4J).collect(Collectors.toList()), value.getErrBars().stream().map(ErrBarsConverter::fromDocx4J).collect(Collectors.toList()), AxDataSourceConverter.fromDocx4J(value.getXVal()), NumDataSourceConverter.fromDocx4J(value.getYVal()), NumDataSourceConverter.fromDocx4J(value.getBubbleSize()), BooleanConverter.fromDocx4J(value.getBubble3D()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
