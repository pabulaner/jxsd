package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.DispUnitsLblModel;
import org.docx4j.dml.chart.CTDispUnitsLbl;

public class DispUnitsLblConverter {
  private DispUnitsLblConverter() {
  }

  public static DispUnitsLblModel fromDocx4J(CTDispUnitsLbl value) {
    if (value == null) return null;
    return new DispUnitsLblModel(LayoutConverter.fromDocx4J(value.getLayout()), TxConverter.fromDocx4J(value.getTx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()));
  }
}
