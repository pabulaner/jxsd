package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_LegendModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLegend;

public class CT_LegendConverter {
  private CT_LegendConverter() {
  }

  public static CT_LegendModel fromDocx4J(CTLegend value) {
    if (value == null) return null;
    return new CT_LegendModel(CT_LegendPosConverter.fromDocx4J(value.getLegendPos()), value.getLegendEntry().stream().map(CT_LegendEntryConverter::fromDocx4J).collect(Collectors.toList()), CT_LayoutConverter.fromDocx4J(value.getLayout()), CT_BooleanConverter.fromDocx4J(value.getOverlay()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TextBodyConverter.fromDocx4J(value.getTxPr()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTLegend toDocx4J(CT_LegendModel value) {
    return null;
  }
}
