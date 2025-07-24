package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.PieSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPieSer;

public class PieSerConverter {
  private PieSerConverter() {
  }

  public static PieSerModel fromDocx4J(CTPieSer value) {
    if (value == null) return null;
    return new PieSerModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), UnsignedIntConverter.fromDocx4J(value.getOrder()), SerTxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), UnsignedIntConverter.fromDocx4J(value.getExplosion()), value.getDPt().stream().map(DPtConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), AxDataSourceConverter.fromDocx4J(value.getCat()), NumDataSourceConverter.fromDocx4J(value.getVal()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
