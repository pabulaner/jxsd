package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BandFmtsModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBandFmts;

public class BandFmtsConverter {
  private BandFmtsConverter() {
  }

  public static BandFmtsModel fromDocx4J(CTBandFmts value) {
    if (value == null) return null;
    return new BandFmtsModel(value.getBandFmt().stream().map(BandFmtConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
