package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.LegendModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLegend;

public class LegendConverter {
  private LegendConverter() {
  }

  public static LegendModel fromDocx4J(CTLegend value) {
    if (value == null) return null;
    return new LegendModel(LegendPosConverter.fromDocx4J(value.getLegendPos()), value.getLegendEntry().stream().map(LegendEntryConverter::fromDocx4J).collect(Collectors.toList()), LayoutConverter.fromDocx4J(value.getLayout()), BooleanConverter.fromDocx4J(value.getOverlay()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
