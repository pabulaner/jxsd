package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_NumDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTNumData;

public class CT_NumDataConverter {
  private CT_NumDataConverter() {
  }

  public static CT_NumDataModel fromDocx4j(CTNumData value) {
    if (value == null) return null;
    return new CT_NumDataModel(ST_XstringConverter.fromDocx4j(value.getFormatCode()), CT_UnsignedIntConverter.fromDocx4j(value.getPtCount()), value.getPt().stream().map(CT_NumValConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNumData toDocx4j(CT_NumDataModel value) {
    return null;
  }
}
