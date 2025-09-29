package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.chart.AxDataSourceBuilder;

/**
 * This is a generated choice class.
 */
public class AxDataSourceModel {
  private final int type;

  private final Object value;

  public AxDataSourceModel() {
    this(-1, null);
  }

  private AxDataSourceModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public AxDataSourceBuilder builder() {
    return new AxDataSourceBuilder().from(this);
  }

  public static AxDataSourceModel newMultiLvlStrRef(MultiLvlStrRefModel value) {
    return new AxDataSourceModel(0, value);
  }

  public boolean isMultiLvlStrRef() {
    return this.type == 0;
  }

  public MultiLvlStrRefModel getMultiLvlStrRef() {
    return (MultiLvlStrRefModel) this.value;
  }

  public static AxDataSourceModel newNumRef(NumRefModel value) {
    return new AxDataSourceModel(1, value);
  }

  public boolean isNumRef() {
    return this.type == 1;
  }

  public NumRefModel getNumRef() {
    return (NumRefModel) this.value;
  }

  public static AxDataSourceModel newNumLit(NumDataModel value) {
    return new AxDataSourceModel(2, value);
  }

  public boolean isNumLit() {
    return this.type == 2;
  }

  public NumDataModel getNumLit() {
    return (NumDataModel) this.value;
  }

  public static AxDataSourceModel newStrRef(StrRefModel value) {
    return new AxDataSourceModel(3, value);
  }

  public boolean isStrRef() {
    return this.type == 3;
  }

  public StrRefModel getStrRef() {
    return (StrRefModel) this.value;
  }

  public static AxDataSourceModel newStrLit(StrDataModel value) {
    return new AxDataSourceModel(4, value);
  }

  public boolean isStrLit() {
    return this.type == 4;
  }

  public StrDataModel getStrLit() {
    return (StrDataModel) this.value;
  }
}
