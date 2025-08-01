package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetCameraTypeValueModel;
import org.docx4j.dml.STPresetCameraType;

public class PresetCameraTypeValueConverter {
  private PresetCameraTypeValueConverter() {
  }

  public static PresetCameraTypeValueModel fromDocx4J(STPresetCameraType value) {
    if (value == null) return null;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_TOP_LEFT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP_LEFT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_TOP) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_TOP_RIGHT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP_RIGHT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_LEFT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_LEFT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_FRONT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_FRONT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_RIGHT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_RIGHT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_BOTTOM_LEFT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM_LEFT;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_BOTTOM) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM;
    if (value == STPresetCameraType.LEGACY_OBLIQUE_BOTTOM_RIGHT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM_RIGHT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_TOP_LEFT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP_LEFT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_TOP) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_TOP_RIGHT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP_RIGHT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_LEFT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_LEFT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_FRONT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_FRONT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_RIGHT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_RIGHT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_BOTTOM_LEFT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM_LEFT;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_BOTTOM) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM;
    if (value == STPresetCameraType.LEGACY_PERSPECTIVE_BOTTOM_RIGHT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM_RIGHT;
    if (value == STPresetCameraType.ORTHOGRAPHIC_FRONT) return PresetCameraTypeValueModel.ORTHOGRAPHIC_FRONT;
    if (value == STPresetCameraType.ISOMETRIC_TOP_UP) return PresetCameraTypeValueModel.ISOMETRIC_TOP_UP;
    if (value == STPresetCameraType.ISOMETRIC_TOP_DOWN) return PresetCameraTypeValueModel.ISOMETRIC_TOP_DOWN;
    if (value == STPresetCameraType.ISOMETRIC_BOTTOM_UP) return PresetCameraTypeValueModel.ISOMETRIC_BOTTOM_UP;
    if (value == STPresetCameraType.ISOMETRIC_BOTTOM_DOWN) return PresetCameraTypeValueModel.ISOMETRIC_BOTTOM_DOWN;
    if (value == STPresetCameraType.ISOMETRIC_LEFT_UP) return PresetCameraTypeValueModel.ISOMETRIC_LEFT_UP;
    if (value == STPresetCameraType.ISOMETRIC_LEFT_DOWN) return PresetCameraTypeValueModel.ISOMETRIC_LEFT_DOWN;
    if (value == STPresetCameraType.ISOMETRIC_RIGHT_UP) return PresetCameraTypeValueModel.ISOMETRIC_RIGHT_UP;
    if (value == STPresetCameraType.ISOMETRIC_RIGHT_DOWN) return PresetCameraTypeValueModel.ISOMETRIC_RIGHT_DOWN;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_1_LEFT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_LEFT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_1_RIGHT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_RIGHT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_1_TOP) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_TOP;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_2_LEFT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_LEFT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_2_RIGHT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_RIGHT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_2_TOP) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_TOP;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_3_LEFT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_LEFT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_3_RIGHT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_RIGHT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_3_BOTTOM) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_BOTTOM;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_4_LEFT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_LEFT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_4_RIGHT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_RIGHT;
    if (value == STPresetCameraType.ISOMETRIC_OFF_AXIS_4_BOTTOM) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_BOTTOM;
    if (value == STPresetCameraType.OBLIQUE_TOP_LEFT) return PresetCameraTypeValueModel.OBLIQUE_TOP_LEFT;
    if (value == STPresetCameraType.OBLIQUE_TOP) return PresetCameraTypeValueModel.OBLIQUE_TOP;
    if (value == STPresetCameraType.OBLIQUE_TOP_RIGHT) return PresetCameraTypeValueModel.OBLIQUE_TOP_RIGHT;
    if (value == STPresetCameraType.OBLIQUE_LEFT) return PresetCameraTypeValueModel.OBLIQUE_LEFT;
    if (value == STPresetCameraType.OBLIQUE_RIGHT) return PresetCameraTypeValueModel.OBLIQUE_RIGHT;
    if (value == STPresetCameraType.OBLIQUE_BOTTOM_LEFT) return PresetCameraTypeValueModel.OBLIQUE_BOTTOM_LEFT;
    if (value == STPresetCameraType.OBLIQUE_BOTTOM) return PresetCameraTypeValueModel.OBLIQUE_BOTTOM;
    if (value == STPresetCameraType.OBLIQUE_BOTTOM_RIGHT) return PresetCameraTypeValueModel.OBLIQUE_BOTTOM_RIGHT;
    if (value == STPresetCameraType.PERSPECTIVE_FRONT) return PresetCameraTypeValueModel.PERSPECTIVE_FRONT;
    if (value == STPresetCameraType.PERSPECTIVE_LEFT) return PresetCameraTypeValueModel.PERSPECTIVE_LEFT;
    if (value == STPresetCameraType.PERSPECTIVE_RIGHT) return PresetCameraTypeValueModel.PERSPECTIVE_RIGHT;
    if (value == STPresetCameraType.PERSPECTIVE_ABOVE) return PresetCameraTypeValueModel.PERSPECTIVE_ABOVE;
    if (value == STPresetCameraType.PERSPECTIVE_BELOW) return PresetCameraTypeValueModel.PERSPECTIVE_BELOW;
    if (value == STPresetCameraType.PERSPECTIVE_ABOVE_LEFT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_ABOVE_LEFT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_ABOVE_RIGHT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_ABOVE_RIGHT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_CONTRASTING_LEFT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_CONTRASTING_LEFT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_CONTRASTING_RIGHT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_CONTRASTING_RIGHT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_HEROIC_LEFT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_LEFT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_HEROIC_RIGHT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_RIGHT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING;
    if (value == STPresetCameraType.PERSPECTIVE_RELAXED) return PresetCameraTypeValueModel.PERSPECTIVE_RELAXED;
    if (value == STPresetCameraType.PERSPECTIVE_RELAXED_MODERATELY) return PresetCameraTypeValueModel.PERSPECTIVE_RELAXED_MODERATELY;
    return null;
  }
}
