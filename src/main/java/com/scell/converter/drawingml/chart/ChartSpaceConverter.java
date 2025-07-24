package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ColorMappingConverter;
import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.ChartSpaceModel;
import org.docx4j.dml.chart.CTChartSpace;

public class ChartSpaceConverter {
  private ChartSpaceConverter() {
  }

  public static ChartSpaceModel fromDocx4J(CTChartSpace value) {
    if (value == null) return null;
    return new ChartSpaceModel(BooleanConverter.fromDocx4J(value.getDate1904()), TextLanguageIDConverter.fromDocx4J(value.getLang()), BooleanConverter.fromDocx4J(value.getRoundedCorners()), StyleConverter.fromDocx4J(value.getStyle()), ColorMappingConverter.fromDocx4J(value.getClrMapOvr()), PivotSourceConverter.fromDocx4J(value.getPivotSource()), ProtectionConverter.fromDocx4J(value.getProtection()), ChartConverter.fromDocx4J(value.getChart()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), ExternalDataConverter.fromDocx4J(value.getExternalData()), PrintSettingsConverter.fromDocx4J(value.getPrintSettings()), RelIdConverter.fromDocx4J(value.getUserShapes()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
