package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_BuiltInUnitModel;
import org.docx4j.dml.chart.STBuiltInUnit;

public class ST_BuiltInUnitConverter {
  private ST_BuiltInUnitConverter() {
  }

  public static ST_BuiltInUnitModel fromDocx4j(STBuiltInUnit value) {
    if (value == null) return null;
    if (value == STBuiltInUnit.HUNDREDS) return ST_BuiltInUnitModel.HUNDREDS;
    if (value == STBuiltInUnit.THOUSANDS) return ST_BuiltInUnitModel.THOUSANDS;
    if (value == STBuiltInUnit.TEN_THOUSANDS) return ST_BuiltInUnitModel.TEN_THOUSANDS;
    if (value == STBuiltInUnit.HUNDRED_THOUSANDS) return ST_BuiltInUnitModel.HUNDRED_THOUSANDS;
    if (value == STBuiltInUnit.MILLIONS) return ST_BuiltInUnitModel.MILLIONS;
    if (value == STBuiltInUnit.TEN_MILLIONS) return ST_BuiltInUnitModel.TEN_MILLIONS;
    if (value == STBuiltInUnit.HUNDRED_MILLIONS) return ST_BuiltInUnitModel.HUNDRED_MILLIONS;
    if (value == STBuiltInUnit.BILLIONS) return ST_BuiltInUnitModel.BILLIONS;
    if (value == STBuiltInUnit.TRILLIONS) return ST_BuiltInUnitModel.TRILLIONS;
    return null;
  }

  public static STBuiltInUnit toDocx4j(ST_BuiltInUnitModel value) {
    return null;
  }
}
