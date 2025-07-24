package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.SurfaceSerModel;
import org.docx4j.dml.chart.CTSurfaceSer;

public class SurfaceSerConverter {
  private SurfaceSerConverter() {
  }

  public static SurfaceSerModel fromDocx4J(CTSurfaceSer value) {
    if (value == null) return null;
    return new SurfaceSerModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), UnsignedIntConverter.fromDocx4J(value.getOrder()), SerTxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), AxDataSourceConverter.fromDocx4J(value.getCat()), NumDataSourceConverter.fromDocx4J(value.getVal()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
