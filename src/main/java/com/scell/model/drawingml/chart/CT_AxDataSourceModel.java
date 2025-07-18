package com.scell.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class CT_AxDataSourceModel {
  private final int type;

  private final Object value;

  public CT_AxDataSourceModel() {
    this(-1, null);
  }

  private CT_AxDataSourceModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_AxDataSourceModel newMultiLvlStrRef(CT_MultiLvlStrRefModel value) {
    return new CT_AxDataSourceModel(0, value);
  }

  public boolean isMultiLvlStrRef() {
    return this.type == 0;
  }

  public CT_MultiLvlStrRefModel getMultiLvlStrRef() {
    return (CT_MultiLvlStrRefModel) this.value;
  }

  public static CT_AxDataSourceModel newNumRef(CT_NumRefModel value) {
    return new CT_AxDataSourceModel(1, value);
  }

  public boolean isNumRef() {
    return this.type == 1;
  }

  public CT_NumRefModel getNumRef() {
    return (CT_NumRefModel) this.value;
  }

  public static CT_AxDataSourceModel newNumLit(CT_NumDataModel value) {
    return new CT_AxDataSourceModel(2, value);
  }

  public boolean isNumLit() {
    return this.type == 2;
  }

  public CT_NumDataModel getNumLit() {
    return (CT_NumDataModel) this.value;
  }

  public static CT_AxDataSourceModel newStrRef(CT_StrRefModel value) {
    return new CT_AxDataSourceModel(3, value);
  }

  public boolean isStrRef() {
    return this.type == 3;
  }

  public CT_StrRefModel getStrRef() {
    return (CT_StrRefModel) this.value;
  }

  public static CT_AxDataSourceModel newStrLit(CT_StrDataModel value) {
    return new CT_AxDataSourceModel(4, value);
  }

  public boolean isStrLit() {
    return this.type == 4;
  }

  public CT_StrDataModel getStrLit() {
    return (CT_StrDataModel) this.value;
  }
}
