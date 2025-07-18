package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_TitleModel;
import org.docx4j.dml.chart.CTTitle;

public class CT_TitleConverter {
  private CT_TitleConverter() {
  }

  public static CT_TitleModel fromDocx4J(CTTitle value) {
    if (value == null) return null;
    return new CT_TitleModel(CT_TxConverter.fromDocx4J(value.getTx()), CT_LayoutConverter.fromDocx4J(value.getLayout()), CT_BooleanConverter.fromDocx4J(value.getOverlay()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TextBodyConverter.fromDocx4J(value.getTxPr()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTTitle toDocx4J(CT_TitleModel value) {
    return null;
  }
}
