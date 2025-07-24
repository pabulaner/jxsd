package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.RadarSerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTRadarSer;

public class RadarSerConverter {
  private RadarSerConverter() {
  }

  public static RadarSerModel fromDocx4J(CTRadarSer value) {
    if (value == null) return null;
    return new RadarSerModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), UnsignedIntConverter.fromDocx4J(value.getOrder()), SerTxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), MarkerConverter.fromDocx4J(value.getMarker()), value.getDPt().stream().map(DPtConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), AxDataSourceConverter.fromDocx4J(value.getCat()), NumDataSourceConverter.fromDocx4J(value.getVal()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
