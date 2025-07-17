package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_ErrBarsModel;
import org.docx4j.dml.chart.CTErrBars;

public class CT_ErrBarsConverter {
  private CT_ErrBarsConverter() {
  }

  public static CT_ErrBarsModel fromDocx4j(CTErrBars value) {
    if (value == null) return null;
    return new CT_ErrBarsModel(CT_ErrDirConverter.fromDocx4j(value.getErrDir()), CT_ErrBarTypeConverter.fromDocx4j(value.getErrBarType()), CT_ErrValTypeConverter.fromDocx4j(value.getErrValType()), CT_BooleanConverter.fromDocx4j(value.getNoEndCap()), CT_NumDataSourceConverter.fromDocx4j(value.getPlus()), CT_NumDataSourceConverter.fromDocx4j(value.getMinus()), CT_DoubleConverter.fromDocx4j(value.getVal()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTErrBars toDocx4j(CT_ErrBarsModel value) {
    return null;
  }
}
