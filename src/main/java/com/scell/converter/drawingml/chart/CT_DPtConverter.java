package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_DPtModel;
import org.docx4j.dml.chart.CTDPt;

public class CT_DPtConverter {
  private CT_DPtConverter() {
  }

  public static CT_DPtModel fromDocx4J(CTDPt value) {
    if (value == null) return null;
    return new CT_DPtModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), CT_BooleanConverter.fromDocx4J(value.getInvertIfNegative()), CT_MarkerConverter.fromDocx4J(value.getMarker()), CT_BooleanConverter.fromDocx4J(value.getBubble3D()), CT_UnsignedIntConverter.fromDocx4J(value.getExplosion()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_PictureOptionsConverter.fromDocx4J(value.getPictureOptions()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTDPt toDocx4J(CT_DPtModel value) {
    return null;
  }
}
