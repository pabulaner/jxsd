package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.TitleModel;
import org.docx4j.dml.chart.CTTitle;

public class TitleConverter {
  private TitleConverter() {
  }

  public static TitleModel fromDocx4J(CTTitle value) {
    if (value == null) return null;
    return new TitleModel(TxConverter.fromDocx4J(value.getTx()), LayoutConverter.fromDocx4J(value.getLayout()), BooleanConverter.fromDocx4J(value.getOverlay()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
