package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.ErrBarsModel;
import org.docx4j.dml.chart.CTErrBars;

public class ErrBarsConverter {
  private ErrBarsConverter() {
  }

  public static ErrBarsModel fromDocx4J(CTErrBars value) {
    if (value == null) return null;
    return new ErrBarsModel(ErrDirConverter.fromDocx4J(value.getErrDir()), ErrBarTypeConverter.fromDocx4J(value.getErrBarType()), ErrValTypeConverter.fromDocx4J(value.getErrValType()), BooleanConverter.fromDocx4J(value.getNoEndCap()), NumDataSourceConverter.fromDocx4J(value.getPlus()), NumDataSourceConverter.fromDocx4J(value.getMinus()), DoubleConverter.fromDocx4J(value.getVal()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
