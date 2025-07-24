package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.StrDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTStrData;

public class StrDataConverter {
  private StrDataConverter() {
  }

  public static StrDataModel fromDocx4J(CTStrData value) {
    if (value == null) return null;
    return new StrDataModel(UnsignedIntConverter.fromDocx4J(value.getPtCount()), value.getPt().stream().map(StrValConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
