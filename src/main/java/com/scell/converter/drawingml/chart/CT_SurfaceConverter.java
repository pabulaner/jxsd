package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_SurfaceModel;
import org.docx4j.dml.chart.CTSurface;

public class CT_SurfaceConverter {
  private CT_SurfaceConverter() {
  }

  public static CT_SurfaceModel fromDocx4J(CTSurface value) {
    if (value == null) return null;
    return new CT_SurfaceModel(CT_UnsignedIntConverter.fromDocx4J(value.getThickness()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_PictureOptionsConverter.fromDocx4J(value.getPictureOptions()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTSurface toDocx4J(CT_SurfaceModel value) {
    return null;
  }
}
