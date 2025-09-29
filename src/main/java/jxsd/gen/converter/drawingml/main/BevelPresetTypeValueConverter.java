package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.BevelPresetTypeValueBuilder;
import jxsd.gen.model.drawingml.main.BevelPresetTypeValueModel;
import org.docx4j.dml.STBevelPresetType;

/**
 * This is a generated enum class.
 */
public class BevelPresetTypeValueConverter {
  private BevelPresetTypeValueConverter() {
  }

  public static BevelPresetTypeValueModel fromDocx4j(STBevelPresetType value) {
    if (value == null) return null;
    if (value == BevelPresetTypeValueBuilder.RELAXED_INSET) return BevelPresetTypeValueModel.RELAXED_INSET;
    if (value == BevelPresetTypeValueBuilder.CIRCLE) return BevelPresetTypeValueModel.CIRCLE;
    if (value == BevelPresetTypeValueBuilder.SLOPE) return BevelPresetTypeValueModel.SLOPE;
    if (value == BevelPresetTypeValueBuilder.CROSS) return BevelPresetTypeValueModel.CROSS;
    if (value == BevelPresetTypeValueBuilder.ANGLE) return BevelPresetTypeValueModel.ANGLE;
    if (value == BevelPresetTypeValueBuilder.SOFT_ROUND) return BevelPresetTypeValueModel.SOFT_ROUND;
    if (value == BevelPresetTypeValueBuilder.CONVEX) return BevelPresetTypeValueModel.CONVEX;
    if (value == BevelPresetTypeValueBuilder.COOL_SLANT) return BevelPresetTypeValueModel.COOL_SLANT;
    if (value == BevelPresetTypeValueBuilder.DIVOT) return BevelPresetTypeValueModel.DIVOT;
    if (value == BevelPresetTypeValueBuilder.RIBLET) return BevelPresetTypeValueModel.RIBLET;
    if (value == BevelPresetTypeValueBuilder.HARD_EDGE) return BevelPresetTypeValueModel.HARD_EDGE;
    if (value == BevelPresetTypeValueBuilder.ART_DECO) return BevelPresetTypeValueModel.ART_DECO;
    return null;
  }

  public static STBevelPresetType toDocx4j(BevelPresetTypeValueModel value) {
    if (value == null) return null;
    if (value == BevelPresetTypeValueModel.RELAXED_INSET) return BevelPresetTypeValueBuilder.RELAXED_INSET;
    if (value == BevelPresetTypeValueModel.CIRCLE) return BevelPresetTypeValueBuilder.CIRCLE;
    if (value == BevelPresetTypeValueModel.SLOPE) return BevelPresetTypeValueBuilder.SLOPE;
    if (value == BevelPresetTypeValueModel.CROSS) return BevelPresetTypeValueBuilder.CROSS;
    if (value == BevelPresetTypeValueModel.ANGLE) return BevelPresetTypeValueBuilder.ANGLE;
    if (value == BevelPresetTypeValueModel.SOFT_ROUND) return BevelPresetTypeValueBuilder.SOFT_ROUND;
    if (value == BevelPresetTypeValueModel.CONVEX) return BevelPresetTypeValueBuilder.CONVEX;
    if (value == BevelPresetTypeValueModel.COOL_SLANT) return BevelPresetTypeValueBuilder.COOL_SLANT;
    if (value == BevelPresetTypeValueModel.DIVOT) return BevelPresetTypeValueBuilder.DIVOT;
    if (value == BevelPresetTypeValueModel.RIBLET) return BevelPresetTypeValueBuilder.RIBLET;
    if (value == BevelPresetTypeValueModel.HARD_EDGE) return BevelPresetTypeValueBuilder.HARD_EDGE;
    if (value == BevelPresetTypeValueModel.ART_DECO) return BevelPresetTypeValueBuilder.ART_DECO;
    return null;
  }
}
