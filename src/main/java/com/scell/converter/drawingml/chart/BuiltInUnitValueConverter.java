package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BuiltInUnitValueModel;
import org.docx4j.dml.chart.STBuiltInUnit;

public class BuiltInUnitValueConverter {
  private BuiltInUnitValueConverter() {
  }

  public static BuiltInUnitValueModel fromDocx4J(STBuiltInUnit value) {
    if (value == null) return null;
    if (value == STBuiltInUnit.HUNDREDS) return BuiltInUnitValueModel.HUNDREDS;
    if (value == STBuiltInUnit.THOUSANDS) return BuiltInUnitValueModel.THOUSANDS;
    if (value == STBuiltInUnit.TEN_THOUSANDS) return BuiltInUnitValueModel.TEN_THOUSANDS;
    if (value == STBuiltInUnit.HUNDRED_THOUSANDS) return BuiltInUnitValueModel.HUNDRED_THOUSANDS;
    if (value == STBuiltInUnit.MILLIONS) return BuiltInUnitValueModel.MILLIONS;
    if (value == STBuiltInUnit.TEN_MILLIONS) return BuiltInUnitValueModel.TEN_MILLIONS;
    if (value == STBuiltInUnit.HUNDRED_MILLIONS) return BuiltInUnitValueModel.HUNDRED_MILLIONS;
    if (value == STBuiltInUnit.BILLIONS) return BuiltInUnitValueModel.BILLIONS;
    if (value == STBuiltInUnit.TRILLIONS) return BuiltInUnitValueModel.TRILLIONS;
    return null;
  }
}
