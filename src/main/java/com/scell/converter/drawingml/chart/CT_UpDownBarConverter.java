package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_UpDownBarModel;
import org.docx4j.dml.chart.CTUpDownBar;

public class CT_UpDownBarConverter {
  private CT_UpDownBarConverter() {
  }

  public static CT_UpDownBarModel fromDocx4j(CTUpDownBar value) {
    if (value == null) return null;
    return new CT_UpDownBarModel(CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()));
  }

  public static CTUpDownBar toDocx4j(CT_UpDownBarModel value) {
    return null;
  }
}
