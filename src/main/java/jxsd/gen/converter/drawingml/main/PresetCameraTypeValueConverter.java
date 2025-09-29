package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetCameraTypeValueBuilder;
import jxsd.gen.model.drawingml.main.PresetCameraTypeValueModel;
import org.docx4j.dml.STPresetCameraType;

/**
 * This is a generated enum class.
 */
public class PresetCameraTypeValueConverter {
  private PresetCameraTypeValueConverter() {
  }

  public static PresetCameraTypeValueModel fromDocx4j(STPresetCameraType value) {
    if (value == null) return null;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_TOP_LEFT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP_LEFT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_TOP) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_TOP_RIGHT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP_RIGHT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_LEFT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_LEFT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_FRONT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_FRONT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_RIGHT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_RIGHT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_BOTTOM_LEFT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM_LEFT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_BOTTOM) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM;
    if (value == PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_BOTTOM_RIGHT) return PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM_RIGHT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_TOP_LEFT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP_LEFT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_TOP) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_TOP_RIGHT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP_RIGHT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_LEFT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_LEFT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_FRONT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_FRONT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_RIGHT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_RIGHT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_BOTTOM_LEFT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM_LEFT;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_BOTTOM) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM;
    if (value == PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_BOTTOM_RIGHT) return PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM_RIGHT;
    if (value == PresetCameraTypeValueBuilder.ORTHOGRAPHIC_FRONT) return PresetCameraTypeValueModel.ORTHOGRAPHIC_FRONT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_TOP_UP) return PresetCameraTypeValueModel.ISOMETRIC_TOP_UP;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_TOP_DOWN) return PresetCameraTypeValueModel.ISOMETRIC_TOP_DOWN;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_BOTTOM_UP) return PresetCameraTypeValueModel.ISOMETRIC_BOTTOM_UP;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_BOTTOM_DOWN) return PresetCameraTypeValueModel.ISOMETRIC_BOTTOM_DOWN;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_LEFT_UP) return PresetCameraTypeValueModel.ISOMETRIC_LEFT_UP;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_LEFT_DOWN) return PresetCameraTypeValueModel.ISOMETRIC_LEFT_DOWN;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_RIGHT_UP) return PresetCameraTypeValueModel.ISOMETRIC_RIGHT_UP;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_RIGHT_DOWN) return PresetCameraTypeValueModel.ISOMETRIC_RIGHT_DOWN;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_1_LEFT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_LEFT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_1_RIGHT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_RIGHT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_1_TOP) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_TOP;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_2_LEFT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_LEFT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_2_RIGHT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_RIGHT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_2_TOP) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_TOP;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_3_LEFT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_LEFT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_3_RIGHT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_RIGHT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_3_BOTTOM) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_BOTTOM;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_4_LEFT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_LEFT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_4_RIGHT) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_RIGHT;
    if (value == PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_4_BOTTOM) return PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_BOTTOM;
    if (value == PresetCameraTypeValueBuilder.OBLIQUE_TOP_LEFT) return PresetCameraTypeValueModel.OBLIQUE_TOP_LEFT;
    if (value == PresetCameraTypeValueBuilder.OBLIQUE_TOP) return PresetCameraTypeValueModel.OBLIQUE_TOP;
    if (value == PresetCameraTypeValueBuilder.OBLIQUE_TOP_RIGHT) return PresetCameraTypeValueModel.OBLIQUE_TOP_RIGHT;
    if (value == PresetCameraTypeValueBuilder.OBLIQUE_LEFT) return PresetCameraTypeValueModel.OBLIQUE_LEFT;
    if (value == PresetCameraTypeValueBuilder.OBLIQUE_RIGHT) return PresetCameraTypeValueModel.OBLIQUE_RIGHT;
    if (value == PresetCameraTypeValueBuilder.OBLIQUE_BOTTOM_LEFT) return PresetCameraTypeValueModel.OBLIQUE_BOTTOM_LEFT;
    if (value == PresetCameraTypeValueBuilder.OBLIQUE_BOTTOM) return PresetCameraTypeValueModel.OBLIQUE_BOTTOM;
    if (value == PresetCameraTypeValueBuilder.OBLIQUE_BOTTOM_RIGHT) return PresetCameraTypeValueModel.OBLIQUE_BOTTOM_RIGHT;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_FRONT) return PresetCameraTypeValueModel.PERSPECTIVE_FRONT;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_LEFT) return PresetCameraTypeValueModel.PERSPECTIVE_LEFT;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_RIGHT) return PresetCameraTypeValueModel.PERSPECTIVE_RIGHT;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_ABOVE) return PresetCameraTypeValueModel.PERSPECTIVE_ABOVE;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_BELOW) return PresetCameraTypeValueModel.PERSPECTIVE_BELOW;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_ABOVE_LEFT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_ABOVE_LEFT_FACING;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_ABOVE_RIGHT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_ABOVE_RIGHT_FACING;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_CONTRASTING_LEFT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_CONTRASTING_LEFT_FACING;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_CONTRASTING_RIGHT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_CONTRASTING_RIGHT_FACING;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_HEROIC_LEFT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_LEFT_FACING;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_HEROIC_RIGHT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_RIGHT_FACING;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING) return PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_RELAXED) return PresetCameraTypeValueModel.PERSPECTIVE_RELAXED;
    if (value == PresetCameraTypeValueBuilder.PERSPECTIVE_RELAXED_MODERATELY) return PresetCameraTypeValueModel.PERSPECTIVE_RELAXED_MODERATELY;
    return null;
  }

  public static STPresetCameraType toDocx4j(PresetCameraTypeValueModel value) {
    if (value == null) return null;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP_LEFT) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_TOP_LEFT;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_TOP;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_TOP_RIGHT) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_TOP_RIGHT;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_LEFT) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_LEFT;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_FRONT) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_FRONT;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_RIGHT) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_RIGHT;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM_LEFT) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_BOTTOM_LEFT;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_BOTTOM;
    if (value == PresetCameraTypeValueModel.LEGACY_OBLIQUE_BOTTOM_RIGHT) return PresetCameraTypeValueBuilder.LEGACY_OBLIQUE_BOTTOM_RIGHT;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP_LEFT) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_TOP_LEFT;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_TOP;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_TOP_RIGHT) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_TOP_RIGHT;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_LEFT) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_LEFT;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_FRONT) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_FRONT;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_RIGHT) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_RIGHT;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM_LEFT) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_BOTTOM_LEFT;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_BOTTOM;
    if (value == PresetCameraTypeValueModel.LEGACY_PERSPECTIVE_BOTTOM_RIGHT) return PresetCameraTypeValueBuilder.LEGACY_PERSPECTIVE_BOTTOM_RIGHT;
    if (value == PresetCameraTypeValueModel.ORTHOGRAPHIC_FRONT) return PresetCameraTypeValueBuilder.ORTHOGRAPHIC_FRONT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_TOP_UP) return PresetCameraTypeValueBuilder.ISOMETRIC_TOP_UP;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_TOP_DOWN) return PresetCameraTypeValueBuilder.ISOMETRIC_TOP_DOWN;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_BOTTOM_UP) return PresetCameraTypeValueBuilder.ISOMETRIC_BOTTOM_UP;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_BOTTOM_DOWN) return PresetCameraTypeValueBuilder.ISOMETRIC_BOTTOM_DOWN;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_LEFT_UP) return PresetCameraTypeValueBuilder.ISOMETRIC_LEFT_UP;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_LEFT_DOWN) return PresetCameraTypeValueBuilder.ISOMETRIC_LEFT_DOWN;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_RIGHT_UP) return PresetCameraTypeValueBuilder.ISOMETRIC_RIGHT_UP;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_RIGHT_DOWN) return PresetCameraTypeValueBuilder.ISOMETRIC_RIGHT_DOWN;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_LEFT) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_1_LEFT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_RIGHT) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_1_RIGHT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_1_TOP) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_1_TOP;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_LEFT) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_2_LEFT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_RIGHT) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_2_RIGHT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_2_TOP) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_2_TOP;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_LEFT) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_3_LEFT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_RIGHT) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_3_RIGHT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_3_BOTTOM) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_3_BOTTOM;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_LEFT) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_4_LEFT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_RIGHT) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_4_RIGHT;
    if (value == PresetCameraTypeValueModel.ISOMETRIC_OFF_AXIS_4_BOTTOM) return PresetCameraTypeValueBuilder.ISOMETRIC_OFF_AXIS_4_BOTTOM;
    if (value == PresetCameraTypeValueModel.OBLIQUE_TOP_LEFT) return PresetCameraTypeValueBuilder.OBLIQUE_TOP_LEFT;
    if (value == PresetCameraTypeValueModel.OBLIQUE_TOP) return PresetCameraTypeValueBuilder.OBLIQUE_TOP;
    if (value == PresetCameraTypeValueModel.OBLIQUE_TOP_RIGHT) return PresetCameraTypeValueBuilder.OBLIQUE_TOP_RIGHT;
    if (value == PresetCameraTypeValueModel.OBLIQUE_LEFT) return PresetCameraTypeValueBuilder.OBLIQUE_LEFT;
    if (value == PresetCameraTypeValueModel.OBLIQUE_RIGHT) return PresetCameraTypeValueBuilder.OBLIQUE_RIGHT;
    if (value == PresetCameraTypeValueModel.OBLIQUE_BOTTOM_LEFT) return PresetCameraTypeValueBuilder.OBLIQUE_BOTTOM_LEFT;
    if (value == PresetCameraTypeValueModel.OBLIQUE_BOTTOM) return PresetCameraTypeValueBuilder.OBLIQUE_BOTTOM;
    if (value == PresetCameraTypeValueModel.OBLIQUE_BOTTOM_RIGHT) return PresetCameraTypeValueBuilder.OBLIQUE_BOTTOM_RIGHT;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_FRONT) return PresetCameraTypeValueBuilder.PERSPECTIVE_FRONT;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_LEFT) return PresetCameraTypeValueBuilder.PERSPECTIVE_LEFT;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_RIGHT) return PresetCameraTypeValueBuilder.PERSPECTIVE_RIGHT;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_ABOVE) return PresetCameraTypeValueBuilder.PERSPECTIVE_ABOVE;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_BELOW) return PresetCameraTypeValueBuilder.PERSPECTIVE_BELOW;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_ABOVE_LEFT_FACING) return PresetCameraTypeValueBuilder.PERSPECTIVE_ABOVE_LEFT_FACING;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_ABOVE_RIGHT_FACING) return PresetCameraTypeValueBuilder.PERSPECTIVE_ABOVE_RIGHT_FACING;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_CONTRASTING_LEFT_FACING) return PresetCameraTypeValueBuilder.PERSPECTIVE_CONTRASTING_LEFT_FACING;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_CONTRASTING_RIGHT_FACING) return PresetCameraTypeValueBuilder.PERSPECTIVE_CONTRASTING_RIGHT_FACING;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_LEFT_FACING) return PresetCameraTypeValueBuilder.PERSPECTIVE_HEROIC_LEFT_FACING;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_RIGHT_FACING) return PresetCameraTypeValueBuilder.PERSPECTIVE_HEROIC_RIGHT_FACING;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING) return PresetCameraTypeValueBuilder.PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING) return PresetCameraTypeValueBuilder.PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_RELAXED) return PresetCameraTypeValueBuilder.PERSPECTIVE_RELAXED;
    if (value == PresetCameraTypeValueModel.PERSPECTIVE_RELAXED_MODERATELY) return PresetCameraTypeValueBuilder.PERSPECTIVE_RELAXED_MODERATELY;
    return null;
  }
}
