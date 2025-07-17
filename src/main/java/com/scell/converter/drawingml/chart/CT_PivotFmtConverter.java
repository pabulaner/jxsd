package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_PivotFmtModel;
import org.docx4j.dml.chart.CTPivotFmt;

public class CT_PivotFmtConverter {
  private CT_PivotFmtConverter() {
  }

  public static CT_PivotFmtModel fromDocx4j(CTPivotFmt value) {
    if (value == null) return null;
    return new CT_PivotFmtModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_MarkerConverter.fromDocx4j(value.getMarker()), CT_DLblConverter.fromDocx4j(value.getDLbl()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPivotFmt toDocx4j(CT_PivotFmtModel value) {
    return null;
  }
}
