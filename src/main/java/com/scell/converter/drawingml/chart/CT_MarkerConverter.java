package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_MarkerModel;
import org.docx4j.dml.chart.CTMarker;

public class CT_MarkerConverter {
  private CT_MarkerConverter() {
  }

  public static CT_MarkerModel fromDocx4J(CTMarker value) {
    if (value == null) return null;
    return new CT_MarkerModel(CT_MarkerStyleConverter.fromDocx4J(value.getSymbol()), CT_MarkerSizeConverter.fromDocx4J(value.getSize()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTMarker toDocx4J(CT_MarkerModel value) {
    return null;
  }
}
