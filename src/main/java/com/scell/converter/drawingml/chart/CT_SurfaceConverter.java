package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_SurfaceModel;
import org.docx4j.dml.chart.CTSurface;

public class CT_SurfaceConverter {
  private CT_SurfaceConverter() {
  }

  public static CT_SurfaceModel fromDocx4j(CTSurface value) {
    if (value == null) return null;
    return new CT_SurfaceModel(CT_UnsignedIntConverter.fromDocx4j(value.getThickness()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_PictureOptionsConverter.fromDocx4j(value.getPictureOptions()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSurface toDocx4j(CT_SurfaceModel value) {
    return null;
  }
}
