package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BandFmtsModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBandFmts;

public class CT_BandFmtsConverter {
  private CT_BandFmtsConverter() {
  }

  public static CT_BandFmtsModel fromDocx4J(CTBandFmts value) {
    if (value == null) return null;
    return new CT_BandFmtsModel(value.getBandFmt().stream().map(CT_BandFmtConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTBandFmts toDocx4J(CT_BandFmtsModel value) {
    return null;
  }
}
