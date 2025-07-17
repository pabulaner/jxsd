package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_TitleModel;
import org.docx4j.dml.chart.CTTitle;

public class CT_TitleConverter {
  private CT_TitleConverter() {
  }

  public static CT_TitleModel fromDocx4j(CTTitle value) {
    if (value == null) return null;
    return new CT_TitleModel(CT_TxConverter.fromDocx4j(value.getTx()), CT_LayoutConverter.fromDocx4j(value.getLayout()), CT_BooleanConverter.fromDocx4j(value.getOverlay()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTitle toDocx4j(CT_TitleModel value) {
    return null;
  }
}
