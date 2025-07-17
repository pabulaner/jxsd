package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_MultiLvlStrDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTMultiLvlStrData;

public class CT_MultiLvlStrDataConverter {
  private CT_MultiLvlStrDataConverter() {
  }

  public static CT_MultiLvlStrDataModel fromDocx4j(CTMultiLvlStrData value) {
    if (value == null) return null;
    return new CT_MultiLvlStrDataModel(CT_UnsignedIntConverter.fromDocx4j(value.getPtCount()), value.getLvl().stream().map(CT_LvlConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTMultiLvlStrData toDocx4j(CT_MultiLvlStrDataModel value) {
    return null;
  }
}
