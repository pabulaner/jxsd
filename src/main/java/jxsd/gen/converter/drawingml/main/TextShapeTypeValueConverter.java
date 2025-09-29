package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextShapeTypeValueBuilder;
import jxsd.gen.model.drawingml.main.TextShapeTypeValueModel;
import org.docx4j.dml.STTextShapeType;

/**
 * This is a generated enum class.
 */
public class TextShapeTypeValueConverter {
  private TextShapeTypeValueConverter() {
  }

  public static TextShapeTypeValueModel fromDocx4j(STTextShapeType value) {
    if (value == null) return null;
    if (value == TextShapeTypeValueBuilder.TEXT_NO_SHAPE) return TextShapeTypeValueModel.TEXT_NO_SHAPE;
    if (value == TextShapeTypeValueBuilder.TEXT_PLAIN) return TextShapeTypeValueModel.TEXT_PLAIN;
    if (value == TextShapeTypeValueBuilder.TEXT_STOP) return TextShapeTypeValueModel.TEXT_STOP;
    if (value == TextShapeTypeValueBuilder.TEXT_TRIANGLE) return TextShapeTypeValueModel.TEXT_TRIANGLE;
    if (value == TextShapeTypeValueBuilder.TEXT_TRIANGLE_INVERTED) return TextShapeTypeValueModel.TEXT_TRIANGLE_INVERTED;
    if (value == TextShapeTypeValueBuilder.TEXT_CHEVRON) return TextShapeTypeValueModel.TEXT_CHEVRON;
    if (value == TextShapeTypeValueBuilder.TEXT_CHEVRON_INVERTED) return TextShapeTypeValueModel.TEXT_CHEVRON_INVERTED;
    if (value == TextShapeTypeValueBuilder.TEXT_RING_INSIDE) return TextShapeTypeValueModel.TEXT_RING_INSIDE;
    if (value == TextShapeTypeValueBuilder.TEXT_RING_OUTSIDE) return TextShapeTypeValueModel.TEXT_RING_OUTSIDE;
    if (value == TextShapeTypeValueBuilder.TEXT_ARCH_UP) return TextShapeTypeValueModel.TEXT_ARCH_UP;
    if (value == TextShapeTypeValueBuilder.TEXT_ARCH_DOWN) return TextShapeTypeValueModel.TEXT_ARCH_DOWN;
    if (value == TextShapeTypeValueBuilder.TEXT_CIRCLE) return TextShapeTypeValueModel.TEXT_CIRCLE;
    if (value == TextShapeTypeValueBuilder.TEXT_BUTTON) return TextShapeTypeValueModel.TEXT_BUTTON;
    if (value == TextShapeTypeValueBuilder.TEXT_ARCH_UP_POUR) return TextShapeTypeValueModel.TEXT_ARCH_UP_POUR;
    if (value == TextShapeTypeValueBuilder.TEXT_ARCH_DOWN_POUR) return TextShapeTypeValueModel.TEXT_ARCH_DOWN_POUR;
    if (value == TextShapeTypeValueBuilder.TEXT_CIRCLE_POUR) return TextShapeTypeValueModel.TEXT_CIRCLE_POUR;
    if (value == TextShapeTypeValueBuilder.TEXT_BUTTON_POUR) return TextShapeTypeValueModel.TEXT_BUTTON_POUR;
    if (value == TextShapeTypeValueBuilder.TEXT_CURVE_UP) return TextShapeTypeValueModel.TEXT_CURVE_UP;
    if (value == TextShapeTypeValueBuilder.TEXT_CURVE_DOWN) return TextShapeTypeValueModel.TEXT_CURVE_DOWN;
    if (value == TextShapeTypeValueBuilder.TEXT_CAN_UP) return TextShapeTypeValueModel.TEXT_CAN_UP;
    if (value == TextShapeTypeValueBuilder.TEXT_CAN_DOWN) return TextShapeTypeValueModel.TEXT_CAN_DOWN;
    if (value == TextShapeTypeValueBuilder.TEXT_WAVE_1) return TextShapeTypeValueModel.TEXT_WAVE_1;
    if (value == TextShapeTypeValueBuilder.TEXT_WAVE_2) return TextShapeTypeValueModel.TEXT_WAVE_2;
    if (value == TextShapeTypeValueBuilder.TEXT_DOUBLE_WAVE_1) return TextShapeTypeValueModel.TEXT_DOUBLE_WAVE_1;
    if (value == TextShapeTypeValueBuilder.TEXT_WAVE_4) return TextShapeTypeValueModel.TEXT_WAVE_4;
    if (value == TextShapeTypeValueBuilder.TEXT_INFLATE) return TextShapeTypeValueModel.TEXT_INFLATE;
    if (value == TextShapeTypeValueBuilder.TEXT_DEFLATE) return TextShapeTypeValueModel.TEXT_DEFLATE;
    if (value == TextShapeTypeValueBuilder.TEXT_INFLATE_BOTTOM) return TextShapeTypeValueModel.TEXT_INFLATE_BOTTOM;
    if (value == TextShapeTypeValueBuilder.TEXT_DEFLATE_BOTTOM) return TextShapeTypeValueModel.TEXT_DEFLATE_BOTTOM;
    if (value == TextShapeTypeValueBuilder.TEXT_INFLATE_TOP) return TextShapeTypeValueModel.TEXT_INFLATE_TOP;
    if (value == TextShapeTypeValueBuilder.TEXT_DEFLATE_TOP) return TextShapeTypeValueModel.TEXT_DEFLATE_TOP;
    if (value == TextShapeTypeValueBuilder.TEXT_DEFLATE_INFLATE) return TextShapeTypeValueModel.TEXT_DEFLATE_INFLATE;
    if (value == TextShapeTypeValueBuilder.TEXT_DEFLATE_INFLATE_DEFLATE) return TextShapeTypeValueModel.TEXT_DEFLATE_INFLATE_DEFLATE;
    if (value == TextShapeTypeValueBuilder.TEXT_FADE_RIGHT) return TextShapeTypeValueModel.TEXT_FADE_RIGHT;
    if (value == TextShapeTypeValueBuilder.TEXT_FADE_LEFT) return TextShapeTypeValueModel.TEXT_FADE_LEFT;
    if (value == TextShapeTypeValueBuilder.TEXT_FADE_UP) return TextShapeTypeValueModel.TEXT_FADE_UP;
    if (value == TextShapeTypeValueBuilder.TEXT_FADE_DOWN) return TextShapeTypeValueModel.TEXT_FADE_DOWN;
    if (value == TextShapeTypeValueBuilder.TEXT_SLANT_UP) return TextShapeTypeValueModel.TEXT_SLANT_UP;
    if (value == TextShapeTypeValueBuilder.TEXT_SLANT_DOWN) return TextShapeTypeValueModel.TEXT_SLANT_DOWN;
    if (value == TextShapeTypeValueBuilder.TEXT_CASCADE_UP) return TextShapeTypeValueModel.TEXT_CASCADE_UP;
    if (value == TextShapeTypeValueBuilder.TEXT_CASCADE_DOWN) return TextShapeTypeValueModel.TEXT_CASCADE_DOWN;
    return null;
  }

  public static STTextShapeType toDocx4j(TextShapeTypeValueModel value) {
    if (value == null) return null;
    if (value == TextShapeTypeValueModel.TEXT_NO_SHAPE) return TextShapeTypeValueBuilder.TEXT_NO_SHAPE;
    if (value == TextShapeTypeValueModel.TEXT_PLAIN) return TextShapeTypeValueBuilder.TEXT_PLAIN;
    if (value == TextShapeTypeValueModel.TEXT_STOP) return TextShapeTypeValueBuilder.TEXT_STOP;
    if (value == TextShapeTypeValueModel.TEXT_TRIANGLE) return TextShapeTypeValueBuilder.TEXT_TRIANGLE;
    if (value == TextShapeTypeValueModel.TEXT_TRIANGLE_INVERTED) return TextShapeTypeValueBuilder.TEXT_TRIANGLE_INVERTED;
    if (value == TextShapeTypeValueModel.TEXT_CHEVRON) return TextShapeTypeValueBuilder.TEXT_CHEVRON;
    if (value == TextShapeTypeValueModel.TEXT_CHEVRON_INVERTED) return TextShapeTypeValueBuilder.TEXT_CHEVRON_INVERTED;
    if (value == TextShapeTypeValueModel.TEXT_RING_INSIDE) return TextShapeTypeValueBuilder.TEXT_RING_INSIDE;
    if (value == TextShapeTypeValueModel.TEXT_RING_OUTSIDE) return TextShapeTypeValueBuilder.TEXT_RING_OUTSIDE;
    if (value == TextShapeTypeValueModel.TEXT_ARCH_UP) return TextShapeTypeValueBuilder.TEXT_ARCH_UP;
    if (value == TextShapeTypeValueModel.TEXT_ARCH_DOWN) return TextShapeTypeValueBuilder.TEXT_ARCH_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_CIRCLE) return TextShapeTypeValueBuilder.TEXT_CIRCLE;
    if (value == TextShapeTypeValueModel.TEXT_BUTTON) return TextShapeTypeValueBuilder.TEXT_BUTTON;
    if (value == TextShapeTypeValueModel.TEXT_ARCH_UP_POUR) return TextShapeTypeValueBuilder.TEXT_ARCH_UP_POUR;
    if (value == TextShapeTypeValueModel.TEXT_ARCH_DOWN_POUR) return TextShapeTypeValueBuilder.TEXT_ARCH_DOWN_POUR;
    if (value == TextShapeTypeValueModel.TEXT_CIRCLE_POUR) return TextShapeTypeValueBuilder.TEXT_CIRCLE_POUR;
    if (value == TextShapeTypeValueModel.TEXT_BUTTON_POUR) return TextShapeTypeValueBuilder.TEXT_BUTTON_POUR;
    if (value == TextShapeTypeValueModel.TEXT_CURVE_UP) return TextShapeTypeValueBuilder.TEXT_CURVE_UP;
    if (value == TextShapeTypeValueModel.TEXT_CURVE_DOWN) return TextShapeTypeValueBuilder.TEXT_CURVE_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_CAN_UP) return TextShapeTypeValueBuilder.TEXT_CAN_UP;
    if (value == TextShapeTypeValueModel.TEXT_CAN_DOWN) return TextShapeTypeValueBuilder.TEXT_CAN_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_WAVE_1) return TextShapeTypeValueBuilder.TEXT_WAVE_1;
    if (value == TextShapeTypeValueModel.TEXT_WAVE_2) return TextShapeTypeValueBuilder.TEXT_WAVE_2;
    if (value == TextShapeTypeValueModel.TEXT_DOUBLE_WAVE_1) return TextShapeTypeValueBuilder.TEXT_DOUBLE_WAVE_1;
    if (value == TextShapeTypeValueModel.TEXT_WAVE_4) return TextShapeTypeValueBuilder.TEXT_WAVE_4;
    if (value == TextShapeTypeValueModel.TEXT_INFLATE) return TextShapeTypeValueBuilder.TEXT_INFLATE;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE) return TextShapeTypeValueBuilder.TEXT_DEFLATE;
    if (value == TextShapeTypeValueModel.TEXT_INFLATE_BOTTOM) return TextShapeTypeValueBuilder.TEXT_INFLATE_BOTTOM;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE_BOTTOM) return TextShapeTypeValueBuilder.TEXT_DEFLATE_BOTTOM;
    if (value == TextShapeTypeValueModel.TEXT_INFLATE_TOP) return TextShapeTypeValueBuilder.TEXT_INFLATE_TOP;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE_TOP) return TextShapeTypeValueBuilder.TEXT_DEFLATE_TOP;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE_INFLATE) return TextShapeTypeValueBuilder.TEXT_DEFLATE_INFLATE;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE_INFLATE_DEFLATE) return TextShapeTypeValueBuilder.TEXT_DEFLATE_INFLATE_DEFLATE;
    if (value == TextShapeTypeValueModel.TEXT_FADE_RIGHT) return TextShapeTypeValueBuilder.TEXT_FADE_RIGHT;
    if (value == TextShapeTypeValueModel.TEXT_FADE_LEFT) return TextShapeTypeValueBuilder.TEXT_FADE_LEFT;
    if (value == TextShapeTypeValueModel.TEXT_FADE_UP) return TextShapeTypeValueBuilder.TEXT_FADE_UP;
    if (value == TextShapeTypeValueModel.TEXT_FADE_DOWN) return TextShapeTypeValueBuilder.TEXT_FADE_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_SLANT_UP) return TextShapeTypeValueBuilder.TEXT_SLANT_UP;
    if (value == TextShapeTypeValueModel.TEXT_SLANT_DOWN) return TextShapeTypeValueBuilder.TEXT_SLANT_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_CASCADE_UP) return TextShapeTypeValueBuilder.TEXT_CASCADE_UP;
    if (value == TextShapeTypeValueModel.TEXT_CASCADE_DOWN) return TextShapeTypeValueBuilder.TEXT_CASCADE_DOWN;
    return null;
  }
}
