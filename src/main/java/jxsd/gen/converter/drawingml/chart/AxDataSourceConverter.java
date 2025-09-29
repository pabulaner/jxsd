package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.AxDataSourceModel;
import org.docx4j.dml.chart.CTAxDataSource;

/**
 * This is a generated choice class.
 */
public class AxDataSourceConverter {
  private AxDataSourceConverter() {
  }

  public static AxDataSourceModel fromDocx4j(CTAxDataSource value) {
    if (value == null) return null;
    if (value.getMultiLvlStrRef() != null) return AxDataSourceModel.newMultiLvlStrRef(MultiLvlStrRefConverter.fromDocx4j(value.getMultiLvlStrRef()));
    if (value.getNumRef() != null) return AxDataSourceModel.newNumRef(NumRefConverter.fromDocx4j(value.getNumRef()));
    if (value.getNumLit() != null) return AxDataSourceModel.newNumLit(NumDataConverter.fromDocx4j(value.getNumLit()));
    if (value.getStrRef() != null) return AxDataSourceModel.newStrRef(StrRefConverter.fromDocx4j(value.getStrRef()));
    if (value.getStrLit() != null) return AxDataSourceModel.newStrLit(StrDataConverter.fromDocx4j(value.getStrLit()));
    return new AxDataSourceModel();
  }

  public static CTAxDataSource toDocx4j(AxDataSourceModel value) {
    if (value == null) return null;
    CTAxDataSource result = new CTAxDataSource();
    if (value.isMultiLvlStrRef()) result.setMultiLvlStrRef(MultiLvlStrRefConverter.toDocx4j(value.getMultiLvlStrRef()));
    if (value.isNumRef()) result.setNumRef(NumRefConverter.toDocx4j(value.getNumRef()));
    if (value.isNumLit()) result.setNumLit(NumDataConverter.toDocx4j(value.getNumLit()));
    if (value.isStrRef()) result.setStrRef(StrRefConverter.toDocx4j(value.getStrRef()));
    if (value.isStrLit()) result.setStrLit(StrDataConverter.toDocx4j(value.getStrLit()));
    return result;
  }
}
