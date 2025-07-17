package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_DPtModel;
import org.docx4j.dml.chart.CTDPt;

public class CT_DPtConverter {
  private CT_DPtConverter() {
  }

  public static CT_DPtModel fromDocx4j(CTDPt value) {
    if (value == null) return null;
    return new CT_DPtModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_BooleanConverter.fromDocx4j(value.getInvertIfNegative()), CT_MarkerConverter.fromDocx4j(value.getMarker()), CT_BooleanConverter.fromDocx4j(value.getBubble3D()), CT_UnsignedIntConverter.fromDocx4j(value.getExplosion()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_PictureOptionsConverter.fromDocx4j(value.getPictureOptions()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDPt toDocx4j(CT_DPtModel value) {
    return null;
  }
}
