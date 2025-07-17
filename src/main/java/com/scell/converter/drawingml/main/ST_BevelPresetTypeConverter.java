package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_BevelPresetTypeModel;
import org.docx4j.dml.STBevelPresetType;

public class ST_BevelPresetTypeConverter {
  private ST_BevelPresetTypeConverter() {
  }

  public static ST_BevelPresetTypeModel fromDocx4j(STBevelPresetType value) {
    if (value == null) return null;
    if (value == STBevelPresetType.RELAXED_INSET) return ST_BevelPresetTypeModel.RELAXED_INSET;
    if (value == STBevelPresetType.CIRCLE) return ST_BevelPresetTypeModel.CIRCLE;
    if (value == STBevelPresetType.SLOPE) return ST_BevelPresetTypeModel.SLOPE;
    if (value == STBevelPresetType.CROSS) return ST_BevelPresetTypeModel.CROSS;
    if (value == STBevelPresetType.ANGLE) return ST_BevelPresetTypeModel.ANGLE;
    if (value == STBevelPresetType.SOFT_ROUND) return ST_BevelPresetTypeModel.SOFT_ROUND;
    if (value == STBevelPresetType.CONVEX) return ST_BevelPresetTypeModel.CONVEX;
    if (value == STBevelPresetType.COOL_SLANT) return ST_BevelPresetTypeModel.COOL_SLANT;
    if (value == STBevelPresetType.DIVOT) return ST_BevelPresetTypeModel.DIVOT;
    if (value == STBevelPresetType.RIBLET) return ST_BevelPresetTypeModel.RIBLET;
    if (value == STBevelPresetType.HARD_EDGE) return ST_BevelPresetTypeModel.HARD_EDGE;
    if (value == STBevelPresetType.ART_DECO) return ST_BevelPresetTypeModel.ART_DECO;
    return null;
  }

  public static STBevelPresetType toDocx4j(ST_BevelPresetTypeModel value) {
    return null;
  }
}
