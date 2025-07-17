package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_BarSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBarSer;

public class CT_BarSerConverter {
  private CT_BarSerConverter() {
  }

  public static CT_BarSerModel fromDocx4j(CTBarSer value) {
    if (value == null) return null;
    return new CT_BarSerModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_UnsignedIntConverter.fromDocx4j(value.getOrder()), CT_SerTxConverter.fromDocx4j(value.getTx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_BooleanConverter.fromDocx4j(value.getInvertIfNegative()), CT_PictureOptionsConverter.fromDocx4j(value.getPictureOptions()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4j).collect(Collectors.toList()), CT_ErrBarsConverter.fromDocx4j(value.getErrBars()), CT_AxDataSourceConverter.fromDocx4j(value.getCat()), CT_NumDataSourceConverter.fromDocx4j(value.getVal()), CT_ShapeConverter.fromDocx4j(value.getShape()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBarSer toDocx4j(CT_BarSerModel value) {
    return null;
  }
}
