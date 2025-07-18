package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_SurfaceSerModel;
import org.docx4j.dml.chart.CTSurfaceSer;

public class CT_SurfaceSerConverter {
  private CT_SurfaceSerConverter() {
  }

  public static CT_SurfaceSerModel fromDocx4J(CTSurfaceSer value) {
    if (value == null) return null;
    return new CT_SurfaceSerModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), CT_UnsignedIntConverter.fromDocx4J(value.getOrder()), CT_SerTxConverter.fromDocx4J(value.getTx()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_AxDataSourceConverter.fromDocx4J(value.getCat()), CT_NumDataSourceConverter.fromDocx4J(value.getVal()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTSurfaceSer toDocx4J(CT_SurfaceSerModel value) {
    return null;
  }
}
