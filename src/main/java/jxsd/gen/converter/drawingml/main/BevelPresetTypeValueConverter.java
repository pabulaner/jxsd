package jxsd.gen.converter.drawingml.main;

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
    if (value == STBevelPresetType.RELAXED_INSET) return BevelPresetTypeValueModel.RELAXED_INSET;
    if (value == STBevelPresetType.CIRCLE) return BevelPresetTypeValueModel.CIRCLE;
    if (value == STBevelPresetType.SLOPE) return BevelPresetTypeValueModel.SLOPE;
    if (value == STBevelPresetType.CROSS) return BevelPresetTypeValueModel.CROSS;
    if (value == STBevelPresetType.ANGLE) return BevelPresetTypeValueModel.ANGLE;
    if (value == STBevelPresetType.SOFT_ROUND) return BevelPresetTypeValueModel.SOFT_ROUND;
    if (value == STBevelPresetType.CONVEX) return BevelPresetTypeValueModel.CONVEX;
    if (value == STBevelPresetType.COOL_SLANT) return BevelPresetTypeValueModel.COOL_SLANT;
    if (value == STBevelPresetType.DIVOT) return BevelPresetTypeValueModel.DIVOT;
    if (value == STBevelPresetType.RIBLET) return BevelPresetTypeValueModel.RIBLET;
    if (value == STBevelPresetType.HARD_EDGE) return BevelPresetTypeValueModel.HARD_EDGE;
    if (value == STBevelPresetType.ART_DECO) return BevelPresetTypeValueModel.ART_DECO;
    return null;
  }

  public static STBevelPresetType toDocx4j(BevelPresetTypeValueModel value) {
    if (value == null) return null;
    if (value == BevelPresetTypeValueModel.RELAXED_INSET) return STBevelPresetType.RELAXED_INSET;
    if (value == BevelPresetTypeValueModel.CIRCLE) return STBevelPresetType.CIRCLE;
    if (value == BevelPresetTypeValueModel.SLOPE) return STBevelPresetType.SLOPE;
    if (value == BevelPresetTypeValueModel.CROSS) return STBevelPresetType.CROSS;
    if (value == BevelPresetTypeValueModel.ANGLE) return STBevelPresetType.ANGLE;
    if (value == BevelPresetTypeValueModel.SOFT_ROUND) return STBevelPresetType.SOFT_ROUND;
    if (value == BevelPresetTypeValueModel.CONVEX) return STBevelPresetType.CONVEX;
    if (value == BevelPresetTypeValueModel.COOL_SLANT) return STBevelPresetType.COOL_SLANT;
    if (value == BevelPresetTypeValueModel.DIVOT) return STBevelPresetType.DIVOT;
    if (value == BevelPresetTypeValueModel.RIBLET) return STBevelPresetType.RIBLET;
    if (value == BevelPresetTypeValueModel.HARD_EDGE) return STBevelPresetType.HARD_EDGE;
    if (value == BevelPresetTypeValueModel.ART_DECO) return STBevelPresetType.ART_DECO;
    return null;
  }
}
