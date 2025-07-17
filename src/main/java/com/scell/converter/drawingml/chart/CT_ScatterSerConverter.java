package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_ScatterSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTScatterSer;

public class CT_ScatterSerConverter {
  private CT_ScatterSerConverter() {
  }

  public static CT_ScatterSerModel fromDocx4j(CTScatterSer value) {
    if (value == null) return null;
    return new CT_ScatterSerModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_UnsignedIntConverter.fromDocx4j(value.getOrder()), CT_SerTxConverter.fromDocx4j(value.getTx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_MarkerConverter.fromDocx4j(value.getMarker()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4j).collect(Collectors.toList()), value.getErrBars().stream().map(CT_ErrBarsConverter::fromDocx4j).collect(Collectors.toList()), CT_AxDataSourceConverter.fromDocx4j(value.getXVal()), CT_NumDataSourceConverter.fromDocx4j(value.getYVal()), CT_BooleanConverter.fromDocx4j(value.getSmooth()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTScatterSer toDocx4j(CT_ScatterSerModel value) {
    return null;
  }
}
