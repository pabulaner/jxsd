package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.NumDataSourceModel;
import org.docx4j.dml.chart.CTNumDataSource;

/**
 * This is a generated choice class.
 */
public class NumDataSourceConverter {
  private NumDataSourceConverter() {
  }

  public static NumDataSourceModel fromDocx4j(CTNumDataSource value) {
    if (value == null) return null;
    if (value.getNumRef() != null) return NumDataSourceModel.newNumRef(NumRefConverter.fromDocx4j(value.getNumRef()));
    if (value.getNumLit() != null) return NumDataSourceModel.newNumLit(NumDataConverter.fromDocx4j(value.getNumLit()));
    return new NumDataSourceModel();
  }

  public static CTNumDataSource toDocx4j(NumDataSourceModel value) {
    if (value == null) return null;
    CTNumDataSource result = new CTNumDataSource();
    if (value.isNumRef()) result.setNumRef(NumRefConverter.toDocx4j(value.getNumRef()));
    if (value.isNumLit()) result.setNumLit(NumDataConverter.toDocx4j(value.getNumLit()));
    return result;
  }
}
