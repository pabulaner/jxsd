package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BevelPresetTypeModel;
import org.docx4j.dml.STBevelPresetType;

public class BevelPresetTypeConverter {
  private BevelPresetTypeConverter() {
  }

  public static BevelPresetTypeModel fromDocx4J(STBevelPresetType value) {
    if (value == null) return null;
    if (value == STBevelPresetType.RELAXED_INSET) return BevelPresetTypeModel.RELAXED_INSET;
    if (value == STBevelPresetType.CIRCLE) return BevelPresetTypeModel.CIRCLE;
    if (value == STBevelPresetType.SLOPE) return BevelPresetTypeModel.SLOPE;
    if (value == STBevelPresetType.CROSS) return BevelPresetTypeModel.CROSS;
    if (value == STBevelPresetType.ANGLE) return BevelPresetTypeModel.ANGLE;
    if (value == STBevelPresetType.SOFT_ROUND) return BevelPresetTypeModel.SOFT_ROUND;
    if (value == STBevelPresetType.CONVEX) return BevelPresetTypeModel.CONVEX;
    if (value == STBevelPresetType.COOL_SLANT) return BevelPresetTypeModel.COOL_SLANT;
    if (value == STBevelPresetType.DIVOT) return BevelPresetTypeModel.DIVOT;
    if (value == STBevelPresetType.RIBLET) return BevelPresetTypeModel.RIBLET;
    if (value == STBevelPresetType.HARD_EDGE) return BevelPresetTypeModel.HARD_EDGE;
    if (value == STBevelPresetType.ART_DECO) return BevelPresetTypeModel.ART_DECO;
    return null;
  }
}
