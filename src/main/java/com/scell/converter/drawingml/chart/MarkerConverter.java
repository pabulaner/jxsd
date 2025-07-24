package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.MarkerModel;
import org.docx4j.dml.chart.CTMarker;

public class MarkerConverter {
  private MarkerConverter() {
  }

  public static MarkerModel fromDocx4J(CTMarker value) {
    if (value == null) return null;
    return new MarkerModel(MarkerStyleConverter.fromDocx4J(value.getSymbol()), MarkerSizeConverter.fromDocx4J(value.getSize()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
