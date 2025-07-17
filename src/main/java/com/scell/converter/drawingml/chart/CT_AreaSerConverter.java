package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_AreaSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTAreaSer;

public class CT_AreaSerConverter {
  private CT_AreaSerConverter() {
  }

  public static CT_AreaSerModel fromDocx4j(CTAreaSer value) {
    if (value == null) return null;
    return new CT_AreaSerModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_UnsignedIntConverter.fromDocx4j(value.getOrder()), CT_SerTxConverter.fromDocx4j(value.getTx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_PictureOptionsConverter.fromDocx4j(value.getPictureOptions()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(CT_TrendlineConverter::fromDocx4j).collect(Collectors.toList()), value.getErrBars().stream().map(CT_ErrBarsConverter::fromDocx4j).collect(Collectors.toList()), CT_AxDataSourceConverter.fromDocx4j(value.getCat()), CT_NumDataSourceConverter.fromDocx4j(value.getVal()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTAreaSer toDocx4j(CT_AreaSerModel value) {
    return null;
  }
}
