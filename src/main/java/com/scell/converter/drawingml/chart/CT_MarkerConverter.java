package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_MarkerModel;
import org.docx4j.dml.chart.CTMarker;

public class CT_MarkerConverter {
  private CT_MarkerConverter() {
  }

  public static CT_MarkerModel fromDocx4j(CTMarker value) {
    if (value == null) return null;
    return new CT_MarkerModel(CT_MarkerStyleConverter.fromDocx4j(value.getSymbol()), CT_MarkerSizeConverter.fromDocx4j(value.getSize()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTMarker toDocx4j(CT_MarkerModel value) {
    return null;
  }
}
