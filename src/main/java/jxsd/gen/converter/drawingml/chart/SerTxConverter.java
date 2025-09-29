package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SerTxModel;
import org.docx4j.dml.chart.CTSerTx;

/**
 * This is a generated choice class.
 */
public class SerTxConverter {
  private SerTxConverter() {
  }

  public static SerTxModel fromDocx4j(CTSerTx value) {
    if (value == null) return null;
    if (value.getStrRef() != null) return SerTxModel.newStrRef(StrRefConverter.fromDocx4j(value.getStrRef()));
    if (value.getV() != null) return SerTxModel.newV(XstringValueConverter.fromDocx4j(value.getV()));
    return new SerTxModel();
  }

  public static CTSerTx toDocx4j(SerTxModel value) {
    if (value == null) return null;
    CTSerTx result = new CTSerTx();
    if (value.isStrRef()) result.setStrRef(StrRefConverter.toDocx4j(value.getStrRef()));
    if (value.isV()) result.setV(XstringValueConverter.toDocx4j(value.getV()));
    return result;
  }
}
