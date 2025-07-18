package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_AreaSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTAreaSer;

public class CT_AreaSerConverter {
  private CT_AreaSerConverter() {
  }

  public static CT_AreaSerModel fromDocx4J(CTAreaSer value) {
    if (value == null) return null;
    return new CT_AreaSerModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), CT_UnsignedIntConverter.fromDocx4J(value.getOrder()), CT_SerTxConverter.fromDocx4J(value.getTx()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_PictureOptionsConverter.fromDocx4J(value.getPictureOptions()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4J).collect(Collectors.toList()), value.getErrBars().stream().map(CT_ErrBarsConverter::fromDocx4J).collect(Collectors.toList()), CT_AxDataSourceConverter.fromDocx4J(value.getCat()), CT_NumDataSourceConverter.fromDocx4J(value.getVal()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTAreaSer toDocx4J(CT_AreaSerModel value) {
    return null;
  }
}
