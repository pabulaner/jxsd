package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_BandFmtModel;
import org.docx4j.dml.chart.CTBandFmt;

public class CT_BandFmtConverter {
  private CT_BandFmtConverter() {
  }

  public static CT_BandFmtModel fromDocx4J(CTBandFmt value) {
    if (value == null) return null;
    return new CT_BandFmtModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
  }

  public static CTBandFmt toDocx4J(CT_BandFmtModel value) {
    return null;
  }
}
