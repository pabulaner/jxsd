package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_SurfaceSerModel;
import org.docx4j.dml.chart.CTSurfaceSer;

public class CT_SurfaceSerConverter {
  private CT_SurfaceSerConverter() {
  }

  public static CT_SurfaceSerModel fromDocx4j(CTSurfaceSer value) {
    if (value == null) return null;
    return new CT_SurfaceSerModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_UnsignedIntConverter.fromDocx4j(value.getOrder()), CT_SerTxConverter.fromDocx4j(value.getTx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_AxDataSourceConverter.fromDocx4j(value.getCat()), CT_NumDataSourceConverter.fromDocx4j(value.getVal()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSurfaceSer toDocx4j(CT_SurfaceSerModel value) {
    return null;
  }
}
