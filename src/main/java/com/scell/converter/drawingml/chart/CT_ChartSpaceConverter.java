package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ColorMappingConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_ChartSpaceModel;
import org.docx4j.dml.chart.CTChartSpace;

public class CT_ChartSpaceConverter {
  private CT_ChartSpaceConverter() {
  }

  public static CT_ChartSpaceModel fromDocx4j(CTChartSpace value) {
    if (value == null) return null;
    return new CT_ChartSpaceModel(CT_BooleanConverter.fromDocx4j(value.getDate1904()), CT_TextLanguageIDConverter.fromDocx4j(value.getLang()), CT_BooleanConverter.fromDocx4j(value.getRoundedCorners()), CT_StyleConverter.fromDocx4j(value.getStyle()), CT_ColorMappingConverter.fromDocx4j(value.getClrMapOvr()), CT_PivotSourceConverter.fromDocx4j(value.getPivotSource()), CT_ProtectionConverter.fromDocx4j(value.getProtection()), CT_ChartConverter.fromDocx4j(value.getChart()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_ExternalDataConverter.fromDocx4j(value.getExternalData()), CT_PrintSettingsConverter.fromDocx4j(value.getPrintSettings()), CT_RelIdConverter.fromDocx4j(value.getUserShapes()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTChartSpace toDocx4j(CT_ChartSpaceModel value) {
    return null;
  }
}
