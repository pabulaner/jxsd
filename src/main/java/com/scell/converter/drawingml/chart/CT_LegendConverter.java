package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_LegendModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLegend;

public class CT_LegendConverter {
  private CT_LegendConverter() {
  }

  public static CT_LegendModel fromDocx4j(CTLegend value) {
    if (value == null) return null;
    return new CT_LegendModel(CT_LegendPosConverter.fromDocx4j(value.getLegendPos()), value.getLegendEntry().stream().map(CT_LegendEntryConverter::fromDocx4j).collect(Collectors.toList()), CT_LayoutConverter.fromDocx4j(value.getLayout()), CT_BooleanConverter.fromDocx4j(value.getOverlay()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLegend toDocx4j(CT_LegendModel value) {
    return null;
  }
}
