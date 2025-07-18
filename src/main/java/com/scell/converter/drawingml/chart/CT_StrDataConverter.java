package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_StrDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTStrData;

public class CT_StrDataConverter {
  private CT_StrDataConverter() {
  }

  public static CT_StrDataModel fromDocx4J(CTStrData value) {
    if (value == null) return null;
    return new CT_StrDataModel(CT_UnsignedIntConverter.fromDocx4J(value.getPtCount()), value.getPt().stream().map(CT_StrValConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTStrData toDocx4J(CT_StrDataModel value) {
    return null;
  }
}
