package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.PivotSourceModel;
import org.docx4j.dml.chart.CTPivotSource;

/**
 * This is a generated sequence class.
 */
public class PivotSourceConverter {
  private PivotSourceConverter() {
  }

  public static PivotSourceModel fromDocx4j(CTPivotSource value) {
    if (value == null) return null;
    return new PivotSourceModel(XstringValueConverter.fromDocx4j(value.getName()), UnsignedIntConverter.fromDocx4j(value.getFmtId()), value.getExtLst().stream().map(ExtensionListConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTPivotSource toDocx4j(PivotSourceModel value) {
    if (value == null) return null;
    CTPivotSource result = new CTPivotSource();
    result.setName(XstringValueConverter.toDocx4j(value.getName()));
    result.setFmtId(UnsignedIntConverter.toDocx4j(value.getFmtId()));
    result.getExtLst().addAll(value.getExtLst().stream().map(ExtensionListConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
