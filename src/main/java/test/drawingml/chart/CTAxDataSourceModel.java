package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTAxDataSourceModel {
  private final Integer type;

  private final Object value;

  public CTAxDataSourceModel() {
    this(-1, null);
  }

  private CTAxDataSourceModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTAxDataSourceModel newMultiLvlStrRef(CTMultiLvlStrRefModel value) {
    return new CTAxDataSourceModel(0, value);
  }

  public Boolean isMultiLvlStrRef() {
    return this.type == 0;
  }

  public CTMultiLvlStrRefModel getMultiLvlStrRef() {
    return (CTMultiLvlStrRefModel) this.value;
  }

  public static CTAxDataSourceModel newNumRef(CTNumRefModel value) {
    return new CTAxDataSourceModel(1, value);
  }

  public Boolean isNumRef() {
    return this.type == 1;
  }

  public CTNumRefModel getNumRef() {
    return (CTNumRefModel) this.value;
  }

  public static CTAxDataSourceModel newNumLit(CTNumDataModel value) {
    return new CTAxDataSourceModel(2, value);
  }

  public Boolean isNumLit() {
    return this.type == 2;
  }

  public CTNumDataModel getNumLit() {
    return (CTNumDataModel) this.value;
  }

  public static CTAxDataSourceModel newStrRef(CTStrRefModel value) {
    return new CTAxDataSourceModel(3, value);
  }

  public Boolean isStrRef() {
    return this.type == 3;
  }

  public CTStrRefModel getStrRef() {
    return (CTStrRefModel) this.value;
  }

  public static CTAxDataSourceModel newStrLit(CTStrDataModel value) {
    return new CTAxDataSourceModel(4, value);
  }

  public Boolean isStrLit() {
    return this.type == 4;
  }

  public CTStrDataModel getStrLit() {
    return (CTStrDataModel) this.value;
  }
}
