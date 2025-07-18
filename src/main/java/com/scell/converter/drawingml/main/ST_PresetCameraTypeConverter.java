package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetCameraTypeModel;
import org.docx4j.dml.STPresetCameraType;

public class ST_PresetCameraTypeConverter {
  private ST_PresetCameraTypeConverter() {
  }

  public static ST_PresetCameraTypeModel fromDocx4J(STPresetCameraType value) {
    if (value == null) return null;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_TOP_LEFT) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_TOP_LEFT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_TOP) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_TOP;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_TOP_RIGHT) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_TOP_RIGHT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_LEFT) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_LEFT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_FRONT) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_FRONT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_RIGHT) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_RIGHT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_BOTTOM_LEFT) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_BOTTOM_LEFT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_BOTTOM) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_BOTTOM;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_BOTTOM_RIGHT) return ST_PresetCameraTypeModel.LEGACY_OBLIQUE_BOTTOM_RIGHT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_TOP_LEFT) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_TOP_LEFT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_TOP) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_TOP;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_TOP_RIGHT) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_TOP_RIGHT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_LEFT) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_LEFT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_FRONT) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_FRONT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_RIGHT) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_RIGHT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_BOTTOM_LEFT) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_BOTTOM_LEFT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_BOTTOM) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_BOTTOM;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_BOTTOM_RIGHT) return ST_PresetCameraTypeModel.LEGACY_PERSPECTIVE_BOTTOM_RIGHT;
    if (value == STPresetCameraType.ORTHOGRAPHIC_FRONT) return ST_PresetCameraTypeModel.ORTHOGRAPHIC_FRONT;
    if (value == STPresetCameraType.ISOMETRIC_TOP_UP) return ST_PresetCameraTypeModel.ISOMETRIC_TOP_UP;
    if (value == STPresetCameraType.ISOMETRIC_TOP_DOWN) return ST_PresetCameraTypeModel.ISOMETRIC_TOP_DOWN;
    if (value == STPresetCameraType.ISOMETRIC_BOTTOM_UP) return ST_PresetCameraTypeModel.ISOMETRIC_BOTTOM_UP;
    if (value == STPresetCameraType.ISOMETRIC_BOTTOM_DOWN) return ST_PresetCameraTypeModel.ISOMETRIC_BOTTOM_DOWN;
    if (value == STPresetCameraType.ISOMETRIC_LEFT_UP) return ST_PresetCameraTypeModel.ISOMETRIC_LEFT_UP;
    if (value == STPresetCameraType.ISOMETRIC_LEFT_DOWN) return ST_PresetCameraTypeModel.ISOMETRIC_LEFT_DOWN;
    if (value == STPresetCameraType.ISOMETRIC_RIGHT_UP) return ST_PresetCameraTypeModel.ISOMETRIC_RIGHT_UP;
    if (value == STPresetCameraType.ISOMETRIC_RIGHT_DOWN) return ST_PresetCameraTypeModel.ISOMETRIC_RIGHT_DOWN;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_1_LEFT) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_1_LEFT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_1_RIGHT) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_1_RIGHT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_1_TOP) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_1_TOP;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_2_LEFT) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_2_LEFT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_2_RIGHT) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_2_RIGHT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_2_TOP) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_2_TOP;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_3_LEFT) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_3_LEFT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_3_RIGHT) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_3_RIGHT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_3_BOTTOM) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_3_BOTTOM;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_4_LEFT) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_4_LEFT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_4_RIGHT) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_4_RIGHT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_4_BOTTOM) return ST_PresetCameraTypeModel.ISOMETRIC_OFF_AXIS_4_BOTTOM;
    if (value == STPresetCameraType.OBLIQUE_TOP_LEFT) return ST_PresetCameraTypeModel.OBLIQUE_TOP_LEFT;
    if (value == STPresetCameraType.OBLIQUE_TOP) return ST_PresetCameraTypeModel.OBLIQUE_TOP;
    if (value == STPresetCameraType.OBLIQUE_TOP_RIGHT) return ST_PresetCameraTypeModel.OBLIQUE_TOP_RIGHT;
    if (value == STPresetCameraType.OBLIQUE_LEFT) return ST_PresetCameraTypeModel.OBLIQUE_LEFT;
    if (value == STPresetCameraType.OBLIQUE_RIGHT) return ST_PresetCameraTypeModel.OBLIQUE_RIGHT;
    if (value == STPresetCameraType.OBLIQUE_BOTTOM_LEFT) return ST_PresetCameraTypeModel.OBLIQUE_BOTTOM_LEFT;
    if (value == STPresetCameraType.OBLIQUE_BOTTOM) return ST_PresetCameraTypeModel.OBLIQUE_BOTTOM;
    if (value == STPresetCameraType.OBLIQUE_BOTTOM_RIGHT) return ST_PresetCameraTypeModel.OBLIQUE_BOTTOM_RIGHT;
    if (value == STPresetCameraType.PERSPECTIVE_FRONT) return ST_PresetCameraTypeModel.PERSPECTIVE_FRONT;
    if (value == STPresetCameraType.PERSPECTIVE_LEFT) return ST_PresetCameraTypeModel.PERSPECTIVE_LEFT;
    if (value == STPresetCameraType.PERSPECTIVE_RIGHT) return ST_PresetCameraTypeModel.PERSPECTIVE_RIGHT;
    if (value == STPresetCameraType.PERSPECTIVE_ABOVE) return ST_PresetCameraTypeModel.PERSPECTIVE_ABOVE;
    if (value == STPresetCameraType.PERSPECTIVE_BELOW) return ST_PresetCameraTypeModel.PERSPECTIVE_BELOW;
    if (value == STPresetCameraType.PERSPECTIVE_ABOVE_LEFT_FACING) return ST_PresetCameraTypeModel.PERSPECTIVE_ABOVE_LEFT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_ABOVE_RIGHT_FACING) return ST_PresetCameraTypeModel.PERSPECTIVE_ABOVE_RIGHT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_CONTRASTING_LEFT_FACING) return ST_PresetCameraTypeModel.PERSPECTIVE_CONTRASTING_LEFT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_CONTRASTING_RIGHT_FACING) return ST_PresetCameraTypeModel.PERSPECTIVE_CONTRASTING_RIGHT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_HEROIC_LEFT_FACING) return ST_PresetCameraTypeModel.PERSPECTIVE_HEROIC_LEFT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_HEROIC_RIGHT_FACING) return ST_PresetCameraTypeModel.PERSPECTIVE_HEROIC_RIGHT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING) return ST_PresetCameraTypeModel.PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING) return ST_PresetCameraTypeModel.PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_RELAXED) return ST_PresetCameraTypeModel.PERSPECTIVE_RELAXED;
    if (value == STPresetCameraType.PERSPECTIVE_RELAXED_MODERATELY) return ST_PresetCameraTypeModel.PERSPECTIVE_RELAXED_MODERATELY;
    return null;
  }

  public static STPresetCameraType toDocx4J(ST_PresetCameraTypeModel value) {
    return null;
  }
}
