package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_MultiLvlStrDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTMultiLvlStrData;

public class CT_MultiLvlStrDataConverter {
  private CT_MultiLvlStrDataConverter() {
  }

  public static CT_MultiLvlStrDataModel fromDocx4J(CTMultiLvlStrData value) {
    if (value == null) return null;
    return new CT_MultiLvlStrDataModel(CT_UnsignedIntConverter.fromDocx4J(value.getPtCount()), value.getLvl().stream().map(CT_LvlConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTMultiLvlStrData toDocx4J(CT_MultiLvlStrDataModel value) {
    return null;
  }
}
