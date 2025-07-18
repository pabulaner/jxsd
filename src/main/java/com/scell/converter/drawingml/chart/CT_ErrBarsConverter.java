package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_ErrBarsModel;
import org.docx4j.dml.chart.CTErrBars;

public class CT_ErrBarsConverter {
  private CT_ErrBarsConverter() {
  }

  public static CT_ErrBarsModel fromDocx4J(CTErrBars value) {
    if (value == null) return null;
    return new CT_ErrBarsModel(CT_ErrDirConverter.fromDocx4J(value.getErrDir()), CT_ErrBarTypeConverter.fromDocx4J(value.getErrBarType()), CT_ErrValTypeConverter.fromDocx4J(value.getErrValType()), CT_BooleanConverter.fromDocx4J(value.getNoEndCap()), CT_NumDataSourceConverter.fromDocx4J(value.getPlus()), CT_NumDataSourceConverter.fromDocx4J(value.getMinus()), CT_DoubleConverter.fromDocx4J(value.getVal()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTErrBars toDocx4J(CT_ErrBarsModel value) {
    return null;
  }
}
