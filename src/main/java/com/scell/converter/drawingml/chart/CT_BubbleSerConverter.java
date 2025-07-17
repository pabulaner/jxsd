package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_BubbleSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBubbleSer;

public class CT_BubbleSerConverter {
  private CT_BubbleSerConverter() {
  }

  public static CT_BubbleSerModel fromDocx4j(CTBubbleSer value) {
    if (value == null) return null;
    return new CT_BubbleSerModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_UnsignedIntConverter.fromDocx4j(value.getOrder()), CT_SerTxConverter.fromDocx4j(value.getTx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_BooleanConverter.fromDocx4j(value.getInvertIfNegative()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4j).collect(Collectors.toList()), value.getErrBars().stream().map(CT_ErrBarsConverter::fromDocx4j).collect(Collectors.toList()), CT_AxDataSourceConverter.fromDocx4j(value.getXVal()), CT_NumDataSourceConverter.fromDocx4j(value.getYVal()), CT_NumDataSourceConverter.fromDocx4j(value.getBubbleSize()), CT_BooleanConverter.fromDocx4j(value.getBubble3D()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBubbleSer toDocx4j(CT_BubbleSerModel value) {
    return null;
  }
}
