package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_RadarSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTRadarSer;

public class CT_RadarSerConverter {
  private CT_RadarSerConverter() {
  }

  public static CT_RadarSerModel fromDocx4J(CTRadarSer value) {
    if (value == null) return null;
    return new CT_RadarSerModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), CT_UnsignedIntConverter.fromDocx4J(value.getOrder()), CT_SerTxConverter.fromDocx4J(value.getTx()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_MarkerConverter.fromDocx4J(value.getMarker()), value.getDPt().stream().map(CT_DPtConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_AxDataSourceConverter.fromDocx4J(value.getCat()), CT_NumDataSourceConverter.fromDocx4J(value.getVal()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTRadarSer toDocx4J(CT_RadarSerModel value) {
    return null;
  }
}
