package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.PivotFmtModel;
import org.docx4j.dml.chart.CTPivotFmt;

public class PivotFmtConverter {
  private PivotFmtConverter() {
  }

  public static PivotFmtModel fromDocx4J(CTPivotFmt value) {
    if (value == null) return null;
    return new PivotFmtModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), MarkerConverter.fromDocx4J(value.getMarker()), DLblConverter.fromDocx4J(value.getDLbl()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
