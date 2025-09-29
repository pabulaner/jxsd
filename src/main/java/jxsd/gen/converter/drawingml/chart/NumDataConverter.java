package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.NumDataModel;
import org.docx4j.dml.chart.CTNumData;

/**
 * This is a generated sequence class.
 */
public class NumDataConverter {
  private NumDataConverter() {
  }

  public static NumDataModel fromDocx4j(CTNumData value) {
    if (value == null) return null;
    return new NumDataModel(XstringValueConverter.fromDocx4j(value.getFormatCode()), UnsignedIntConverter.fromDocx4j(value.getPtCount()), value.getPt().stream().map(NumValConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNumData toDocx4j(NumDataModel value) {
    if (value == null) return null;
    CTNumData result = new CTNumData();
    result.setFormatCode(XstringValueConverter.toDocx4j(value.getFormatCode()));
    result.setPtCount(UnsignedIntConverter.toDocx4j(value.getPtCount()));
    result.getPt().addAll(value.getPt().stream().map(NumValConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
