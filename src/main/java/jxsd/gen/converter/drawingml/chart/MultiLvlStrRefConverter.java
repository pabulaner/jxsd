package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.chart.MultiLvlStrRefModel;
import org.docx4j.dml.chart.CTMultiLvlStrRef;

/**
 * This is a generated sequence class.
 */
public class MultiLvlStrRefConverter {
  private MultiLvlStrRefConverter() {
  }

  public static MultiLvlStrRefModel fromDocx4j(CTMultiLvlStrRef value) {
    if (value == null) return null;
    return new MultiLvlStrRefModel(StringValueConverter.fromDocx4j(value.getF()), MultiLvlStrDataConverter.fromDocx4j(value.getMultiLvlStrCache()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTMultiLvlStrRef toDocx4j(MultiLvlStrRefModel value) {
    if (value == null) return null;
    CTMultiLvlStrRef result = new CTMultiLvlStrRef();
    result.setF(StringValueConverter.toDocx4j(value.getF()));
    result.setMultiLvlStrCache(MultiLvlStrDataConverter.toDocx4j(value.getMultiLvlStrCache()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
