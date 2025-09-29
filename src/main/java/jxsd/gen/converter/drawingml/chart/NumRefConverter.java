package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.chart.NumRefModel;
import org.docx4j.dml.chart.CTNumRef;

/**
 * This is a generated sequence class.
 */
public class NumRefConverter {
  private NumRefConverter() {
  }

  public static NumRefModel fromDocx4j(CTNumRef value) {
    if (value == null) return null;
    return new NumRefModel(StringValueConverter.fromDocx4j(value.getF()), NumDataConverter.fromDocx4j(value.getNumCache()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNumRef toDocx4j(NumRefModel value) {
    if (value == null) return null;
    CTNumRef result = new CTNumRef();
    result.setF(StringValueConverter.toDocx4j(value.getF()));
    result.setNumCache(NumDataConverter.toDocx4j(value.getNumCache()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
