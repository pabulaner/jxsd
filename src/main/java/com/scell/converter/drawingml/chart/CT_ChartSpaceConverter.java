package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ColorMappingConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_ChartSpaceModel;
import org.docx4j.dml.chart.CTChartSpace;

public class CT_ChartSpaceConverter {
  private CT_ChartSpaceConverter() {
  }

  public static CT_ChartSpaceModel fromDocx4J(CTChartSpace value) {
    if (value == null) return null;
    return new CT_ChartSpaceModel(CT_BooleanConverter.fromDocx4J(value.getDate1904()), CT_TextLanguageIDConverter.fromDocx4J(value.getLang()), CT_BooleanConverter.fromDocx4J(value.getRoundedCorners()), CT_StyleConverter.fromDocx4J(value.getStyle()), CT_ColorMappingConverter.fromDocx4J(value.getClrMapOvr()), CT_PivotSourceConverter.fromDocx4J(value.getPivotSource()), CT_ProtectionConverter.fromDocx4J(value.getProtection()), CT_ChartConverter.fromDocx4J(value.getChart()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TextBodyConverter.fromDocx4J(value.getTxPr()), CT_ExternalDataConverter.fromDocx4J(value.getExternalData()), CT_PrintSettingsConverter.fromDocx4J(value.getPrintSettings()), CT_RelIdConverter.fromDocx4J(value.getUserShapes()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTChartSpace toDocx4J(CT_ChartSpaceModel value) {
    return null;
  }
}
