package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BevelPresetTypeValueModel;
import org.docx4j.dml.STBevelPresetType;

public class BevelPresetTypeValueConverter {
  private BevelPresetTypeValueConverter() {
  }

  public static BevelPresetTypeValueModel fromDocx4J(STBevelPresetType value) {
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
}
