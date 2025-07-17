package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_StrDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTStrData;

public class CT_StrDataConverter {
  private CT_StrDataConverter() {
  }

  public static CT_StrDataModel fromDocx4j(CTStrData value) {
    if (value == null) return null;
    return new CT_StrDataModel(CT_UnsignedIntConverter.fromDocx4j(value.getPtCount()), value.getPt().stream().map(CT_StrValConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTStrData toDocx4j(CT_StrDataModel value) {
    return null;
  }
}
