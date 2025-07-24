package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.AreaSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTAreaSer;

public class AreaSerConverter {
  private AreaSerConverter() {
  }

  public static AreaSerModel fromDocx4J(CTAreaSer value) {
    if (value == null) return null;
    return new AreaSerModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), UnsignedIntConverter.fromDocx4J(value.getOrder()), SerTxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), PictureOptionsConverter.fromDocx4J(value.getPictureOptions()), value.getDPt().stream().map(DPtConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4J).collect(Collectors.toList()), value.getErrBars().stream().map(ErrBarsConverter::fromDocx4J).collect(Collectors.toList()), AxDataSourceConverter.fromDocx4J(value.getCat()), NumDataSourceConverter.fromDocx4J(value.getVal()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
