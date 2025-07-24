package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.MultiLvlStrDataModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTMultiLvlStrData;

public class MultiLvlStrDataConverter {
  private MultiLvlStrDataConverter() {
  }

  public static MultiLvlStrDataModel fromDocx4J(CTMultiLvlStrData value) {
    if (value == null) return null;
    return new MultiLvlStrDataModel(UnsignedIntConverter.fromDocx4J(value.getPtCount()), value.getLvl().stream().map(LvlConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
