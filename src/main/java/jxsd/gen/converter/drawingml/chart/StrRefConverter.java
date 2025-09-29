package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.chart.StrRefModel;
import org.docx4j.dml.chart.CTStrRef;

/**
 * This is a generated sequence class.
 */
public class StrRefConverter {
  private StrRefConverter() {
  }

  public static StrRefModel fromDocx4j(CTStrRef value) {
    if (value == null) return null;
    return new StrRefModel(StringValueConverter.fromDocx4j(value.getF()), StrDataConverter.fromDocx4j(value.getStrCache()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTStrRef toDocx4j(StrRefModel value) {
    if (value == null) return null;
    CTStrRef result = new CTStrRef();
    result.setF(StringValueConverter.toDocx4j(value.getF()));
    result.setStrCache(StrDataConverter.toDocx4j(value.getStrCache()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
