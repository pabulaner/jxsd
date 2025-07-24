package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.NumDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTNumData;

public class NumDataConverter {
  private NumDataConverter() {
  }

  public static NumDataModel fromDocx4J(CTNumData value) {
    if (value == null) return null;
    return new NumDataModel(XstringConverter.fromDocx4J(value.getFormatCode()), UnsignedIntConverter.fromDocx4J(value.getPtCount()), value.getPt().stream().map(NumValConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
