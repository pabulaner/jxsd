package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BuiltInUnitValueModel;
import org.docx4j.dml.chart.STBuiltInUnit;

/**
 * This is a generated enum class.
 */
public class BuiltInUnitValueConverter {
  private BuiltInUnitValueConverter() {
  }

  public static BuiltInUnitValueModel fromDocx4j(STBuiltInUnit value) {
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

  public static STBuiltInUnit toDocx4j(BuiltInUnitValueModel value) {
    if (value == null) return null;
    if (value == BuiltInUnitValueModel.HUNDREDS) return STBuiltInUnit.HUNDREDS;
    if (value == BuiltInUnitValueModel.THOUSANDS) return STBuiltInUnit.THOUSANDS;
    if (value == BuiltInUnitValueModel.TEN_THOUSANDS) return STBuiltInUnit.TEN_THOUSANDS;
    if (value == BuiltInUnitValueModel.HUNDRED_THOUSANDS) return STBuiltInUnit.HUNDRED_THOUSANDS;
    if (value == BuiltInUnitValueModel.MILLIONS) return STBuiltInUnit.MILLIONS;
    if (value == BuiltInUnitValueModel.TEN_MILLIONS) return STBuiltInUnit.TEN_MILLIONS;
    if (value == BuiltInUnitValueModel.HUNDRED_MILLIONS) return STBuiltInUnit.HUNDRED_MILLIONS;
    if (value == BuiltInUnitValueModel.BILLIONS) return STBuiltInUnit.BILLIONS;
    if (value == BuiltInUnitValueModel.TRILLIONS) return STBuiltInUnit.TRILLIONS;
    return null;
  }
}
