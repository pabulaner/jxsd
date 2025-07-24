package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.UpDownBarModel;
import org.docx4j.dml.chart.CTUpDownBar;

public class UpDownBarConverter {
  private UpDownBarConverter() {
  }

  public static UpDownBarModel fromDocx4J(CTUpDownBar value) {
    if (value == null) return null;
    return new UpDownBarModel(ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
  }
}
