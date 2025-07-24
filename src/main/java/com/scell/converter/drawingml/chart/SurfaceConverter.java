package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.SurfaceModel;
import org.docx4j.dml.chart.CTSurface;

public class SurfaceConverter {
  private SurfaceConverter() {
  }

  public static SurfaceModel fromDocx4J(CTSurface value) {
    if (value == null) return null;
    return new SurfaceModel(UnsignedIntConverter.fromDocx4J(value.getThickness()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), PictureOptionsConverter.fromDocx4J(value.getPictureOptions()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
