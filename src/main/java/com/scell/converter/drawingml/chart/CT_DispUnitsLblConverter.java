package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_DispUnitsLblModel;
import org.docx4j.dml.chart.CTDispUnitsLbl;

public class CT_DispUnitsLblConverter {
  private CT_DispUnitsLblConverter() {
  }

  public static CT_DispUnitsLblModel fromDocx4j(CTDispUnitsLbl value) {
    if (value == null) return null;
    return new CT_DispUnitsLblModel(CT_LayoutConverter.fromDocx4j(value.getLayout()), CT_TxConverter.fromDocx4j(value.getTx()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()));
  }

  public static CTDispUnitsLbl toDocx4j(CT_DispUnitsLblModel value) {
    return null;
  }
}
