package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_BarSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBarSer;

public class CT_BarSerConverter {
  private CT_BarSerConverter() {
  }

  public static CT_BarSerModel fromDocx4J(CTBarSer value) {
    if (value == null) return null;
    return new CT_BarSerModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), CT_UnsignedIntConverter.fromDocx4J(value.getOrder()), CT_SerTxConverter.fromDocx4J(value.getTx()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_BooleanConverter.fromDocx4J(value.getInvertIfNegative()), CT_PictureOptionsConverter.fromDocx4J(value.getPictureOptions()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4J).collect(Collectors.toList()), CT_ErrBarsConverter.fromDocx4J(value.getErrBars()), CT_AxDataSourceConverter.fromDocx4J(value.getCat()), CT_NumDataSourceConverter.fromDocx4J(value.getVal()), CT_ShapeConverter.fromDocx4J(value.getShape()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTBarSer toDocx4J(CT_BarSerModel value) {
    return null;
  }
}
