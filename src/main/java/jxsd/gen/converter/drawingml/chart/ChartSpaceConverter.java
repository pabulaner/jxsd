package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ColorMappingConverter;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.ChartSpaceModel;
import org.docx4j.dml.chart.CTChartSpace;

/**
 * This is a generated sequence class.
 */
public class ChartSpaceConverter {
  private ChartSpaceConverter() {
  }

  public static ChartSpaceModel fromDocx4j(CTChartSpace value) {
    if (value == null) return null;
    return new ChartSpaceModel(BooleanConverter.fromDocx4j(value.getDate1904()), TextLanguageIDConverter.fromDocx4j(value.getLang()), BooleanConverter.fromDocx4j(value.getRoundedCorners()), StyleConverter.fromDocx4j(value.getStyle()), ColorMappingConverter.fromDocx4j(value.getClrMapOvr()), PivotSourceConverter.fromDocx4j(value.getPivotSource()), ProtectionConverter.fromDocx4j(value.getProtection()), ChartConverter.fromDocx4j(value.getChart()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), ExternalDataConverter.fromDocx4j(value.getExternalData()), PrintSettingsConverter.fromDocx4j(value.getPrintSettings()), RelIdConverter.fromDocx4j(value.getUserShapes()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTChartSpace toDocx4j(ChartSpaceModel value) {
    if (value == null) return null;
    CTChartSpace result = new CTChartSpace();
    result.setDate1904(BooleanConverter.toDocx4j(value.getDate1904()));
    result.setLang(TextLanguageIDConverter.toDocx4j(value.getLang()));
    result.setRoundedCorners(BooleanConverter.toDocx4j(value.getRoundedCorners()));
    result.setStyle(StyleConverter.toDocx4j(value.getStyle()));
    result.setClrMapOvr(ColorMappingConverter.toDocx4j(value.getClrMapOvr()));
    result.setPivotSource(PivotSourceConverter.toDocx4j(value.getPivotSource()));
    result.setProtection(ProtectionConverter.toDocx4j(value.getProtection()));
    result.setChart(ChartConverter.toDocx4j(value.getChart()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTxPr(TextBodyConverter.toDocx4j(value.getTxPr()));
    result.setExternalData(ExternalDataConverter.toDocx4j(value.getExternalData()));
    result.setPrintSettings(PrintSettingsConverter.toDocx4j(value.getPrintSettings()));
    result.setUserShapes(RelIdConverter.toDocx4j(value.getUserShapes()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
