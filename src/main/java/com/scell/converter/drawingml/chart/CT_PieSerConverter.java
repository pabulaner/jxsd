package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_PieSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPieSer;

public class CT_PieSerConverter {
  private CT_PieSerConverter() {
  }

  public static CT_PieSerModel fromDocx4j(CTPieSer value) {
    if (value == null) return null;
    return new CT_PieSerModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_UnsignedIntConverter.fromDocx4j(value.getOrder()), CT_SerTxConverter.fromDocx4j(value.getTx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_UnsignedIntConverter.fromDocx4j(value.getExplosion()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_AxDataSourceConverter.fromDocx4j(value.getCat()), CT_NumDataSourceConverter.fromDocx4j(value.getVal()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPieSer toDocx4j(CT_PieSerModel value) {
    return null;
  }
}
