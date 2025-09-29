package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.MultiLvlStrDataModel;
import org.docx4j.dml.chart.CTMultiLvlStrData;

/**
 * This is a generated sequence class.
 */
public class MultiLvlStrDataConverter {
  private MultiLvlStrDataConverter() {
  }

  public static MultiLvlStrDataModel fromDocx4j(CTMultiLvlStrData value) {
    if (value == null) return null;
    return new MultiLvlStrDataModel(UnsignedIntConverter.fromDocx4j(value.getPtCount()), value.getLvl().stream().map(LvlConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTMultiLvlStrData toDocx4j(MultiLvlStrDataModel value) {
    if (value == null) return null;
    CTMultiLvlStrData result = new CTMultiLvlStrData();
    result.setPtCount(UnsignedIntConverter.toDocx4j(value.getPtCount()));
    result.getLvl().addAll(value.getLvl().stream().map(LvlConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
