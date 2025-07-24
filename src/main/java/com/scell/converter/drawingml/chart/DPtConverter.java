package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.DPtModel;
import org.docx4j.dml.chart.CTDPt;

public class DPtConverter {
  private DPtConverter() {
  }

  public static DPtModel fromDocx4J(CTDPt value) {
    if (value == null) return null;
    return new DPtModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), BooleanConverter.fromDocx4J(value.getInvertIfNegative()), MarkerConverter.fromDocx4J(value.getMarker()), BooleanConverter.fromDocx4J(value.getBubble3D()), UnsignedIntConverter.fromDocx4J(value.getExplosion()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), PictureOptionsConverter.fromDocx4J(value.getPictureOptions()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
