package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.StrDataModel;
import org.docx4j.dml.chart.CTStrData;

/**
 * This is a generated sequence class.
 */
public class StrDataConverter {
  private StrDataConverter() {
  }

  public static StrDataModel fromDocx4j(CTStrData value) {
    if (value == null) return null;
    return new StrDataModel(UnsignedIntConverter.fromDocx4j(value.getPtCount()), value.getPt().stream().map(StrValConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTStrData toDocx4j(StrDataModel value) {
    if (value == null) return null;
    CTStrData result = new CTStrData();
    result.setPtCount(UnsignedIntConverter.toDocx4j(value.getPtCount()));
    result.getPt().addAll(value.getPt().stream().map(StrValConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
