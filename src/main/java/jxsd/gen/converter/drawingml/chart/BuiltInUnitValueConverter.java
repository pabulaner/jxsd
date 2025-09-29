package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BuiltInUnitValueBuilder;
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
    if (value == BuiltInUnitValueBuilder.HUNDREDS) return BuiltInUnitValueModel.HUNDREDS;
    if (value == BuiltInUnitValueBuilder.THOUSANDS) return BuiltInUnitValueModel.THOUSANDS;
    if (value == BuiltInUnitValueBuilder.TEN_THOUSANDS) return BuiltInUnitValueModel.TEN_THOUSANDS;
    if (value == BuiltInUnitValueBuilder.HUNDRED_THOUSANDS) return BuiltInUnitValueModel.HUNDRED_THOUSANDS;
    if (value == BuiltInUnitValueBuilder.MILLIONS) return BuiltInUnitValueModel.MILLIONS;
    if (value == BuiltInUnitValueBuilder.TEN_MILLIONS) return BuiltInUnitValueModel.TEN_MILLIONS;
    if (value == BuiltInUnitValueBuilder.HUNDRED_MILLIONS) return BuiltInUnitValueModel.HUNDRED_MILLIONS;
    if (value == BuiltInUnitValueBuilder.BILLIONS) return BuiltInUnitValueModel.BILLIONS;
    if (value == BuiltInUnitValueBuilder.TRILLIONS) return BuiltInUnitValueModel.TRILLIONS;
    return null;
  }

  public static STBuiltInUnit toDocx4j(BuiltInUnitValueModel value) {
    if (value == null) return null;
    if (value == BuiltInUnitValueModel.HUNDREDS) return BuiltInUnitValueBuilder.HUNDREDS;
    if (value == BuiltInUnitValueModel.THOUSANDS) return BuiltInUnitValueBuilder.THOUSANDS;
    if (value == BuiltInUnitValueModel.TEN_THOUSANDS) return BuiltInUnitValueBuilder.TEN_THOUSANDS;
    if (value == BuiltInUnitValueModel.HUNDRED_THOUSANDS) return BuiltInUnitValueBuilder.HUNDRED_THOUSANDS;
    if (value == BuiltInUnitValueModel.MILLIONS) return BuiltInUnitValueBuilder.MILLIONS;
    if (value == BuiltInUnitValueModel.TEN_MILLIONS) return BuiltInUnitValueBuilder.TEN_MILLIONS;
    if (value == BuiltInUnitValueModel.HUNDRED_MILLIONS) return BuiltInUnitValueBuilder.HUNDRED_MILLIONS;
    if (value == BuiltInUnitValueModel.BILLIONS) return BuiltInUnitValueBuilder.BILLIONS;
    if (value == BuiltInUnitValueModel.TRILLIONS) return BuiltInUnitValueBuilder.TRILLIONS;
    return null;
  }
}
