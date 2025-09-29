package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.LegendModel;
import org.docx4j.dml.chart.CTLegend;

/**
 * This is a generated sequence class.
 */
public class LegendConverter {
  private LegendConverter() {
  }

  public static LegendModel fromDocx4j(CTLegend value) {
    if (value == null) return null;
    return new LegendModel(LegendPosConverter.fromDocx4j(value.getLegendPos()), value.getLegendEntry().stream().map(LegendEntryConverter::fromDocx4j).collect(Collectors.toList()), LayoutConverter.fromDocx4j(value.getLayout()), BooleanConverter.fromDocx4j(value.getOverlay()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLegend toDocx4j(LegendModel value) {
    if (value == null) return null;
    CTLegend result = new CTLegend();
    result.setLegendPos(LegendPosConverter.toDocx4j(value.getLegendPos()));
    result.getLegendEntry().addAll(value.getLegendEntry().stream().map(LegendEntryConverter::toDocx4j).collect(Collectors.toList()));
    result.setLayout(LayoutConverter.toDocx4j(value.getLayout()));
    result.setOverlay(BooleanConverter.toDocx4j(value.getOverlay()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTxPr(TextBodyConverter.toDocx4j(value.getTxPr()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
