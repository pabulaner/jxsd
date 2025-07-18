package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_ScatterSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTScatterSer;

public class CT_ScatterSerConverter {
  private CT_ScatterSerConverter() {
  }

  public static CT_ScatterSerModel fromDocx4J(CTScatterSer value) {
    if (value == null) return null;
    return new CT_ScatterSerModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), CT_UnsignedIntConverter.fromDocx4J(value.getOrder()), CT_SerTxConverter.fromDocx4J(value.getTx()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_MarkerConverter.fromDocx4J(value.getMarker()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4J).collect(Collectors.toList()), value.getErrBars().stream().map(CT_ErrBarsConverter::fromDocx4J).collect(Collectors.toList()), CT_AxDataSourceConverter.fromDocx4J(value.getXVal()), CT_NumDataSourceConverter.fromDocx4J(value.getYVal()), CT_BooleanConverter.fromDocx4J(value.getSmooth()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTScatterSer toDocx4J(CT_ScatterSerModel value) {
    return null;
  }
}
