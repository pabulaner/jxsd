package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_NumDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTNumData;

public class CT_NumDataConverter {
  private CT_NumDataConverter() {
  }

  public static CT_NumDataModel fromDocx4J(CTNumData value) {
    if (value == null) return null;
    return new CT_NumDataModel(ST_XstringConverter.fromDocx4J(value.getFormatCode()), CT_UnsignedIntConverter.fromDocx4J(value.getPtCount()), value.getPt().stream().map(CT_NumValConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTNumData toDocx4J(CT_NumDataModel value) {
    return null;
  }
}
