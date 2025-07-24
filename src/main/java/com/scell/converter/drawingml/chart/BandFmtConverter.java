package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.BandFmtModel;
import org.docx4j.dml.chart.CTBandFmt;

public class BandFmtConverter {
  private BandFmtConverter() {
  }

  public static BandFmtModel fromDocx4J(CTBandFmt value) {
    if (value == null) return null;
    return new BandFmtModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
  }
}
