package jxsd.gen.converter.drawingml.main;

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
    if (value == STTextShapeType.TEXT_NO_SHAPE) return TextShapeTypeValueModel.TEXT_NO_SHAPE;
    if (value == STTextShapeType.TEXT_PLAIN) return TextShapeTypeValueModel.TEXT_PLAIN;
    if (value == STTextShapeType.TEXT_STOP) return TextShapeTypeValueModel.TEXT_STOP;
    if (value == STTextShapeType.TEXT_TRIANGLE) return TextShapeTypeValueModel.TEXT_TRIANGLE;
    if (value == STTextShapeType.TEXT_TRIANGLE_INVERTED) return TextShapeTypeValueModel.TEXT_TRIANGLE_INVERTED;
    if (value == STTextShapeType.TEXT_CHEVRON) return TextShapeTypeValueModel.TEXT_CHEVRON;
    if (value == STTextShapeType.TEXT_CHEVRON_INVERTED) return TextShapeTypeValueModel.TEXT_CHEVRON_INVERTED;
    if (value == STTextShapeType.TEXT_RING_INSIDE) return TextShapeTypeValueModel.TEXT_RING_INSIDE;
    if (value == STTextShapeType.TEXT_RING_OUTSIDE) return TextShapeTypeValueModel.TEXT_RING_OUTSIDE;
    if (value == STTextShapeType.TEXT_ARCH_UP) return TextShapeTypeValueModel.TEXT_ARCH_UP;
    if (value == STTextShapeType.TEXT_ARCH_DOWN) return TextShapeTypeValueModel.TEXT_ARCH_DOWN;
    if (value == STTextShapeType.TEXT_CIRCLE) return TextShapeTypeValueModel.TEXT_CIRCLE;
    if (value == STTextShapeType.TEXT_BUTTON) return TextShapeTypeValueModel.TEXT_BUTTON;
    if (value == STTextShapeType.TEXT_ARCH_UP_POUR) return TextShapeTypeValueModel.TEXT_ARCH_UP_POUR;
    if (value == STTextShapeType.TEXT_ARCH_DOWN_POUR) return TextShapeTypeValueModel.TEXT_ARCH_DOWN_POUR;
    if (value == STTextShapeType.TEXT_CIRCLE_POUR) return TextShapeTypeValueModel.TEXT_CIRCLE_POUR;
    if (value == STTextShapeType.TEXT_BUTTON_POUR) return TextShapeTypeValueModel.TEXT_BUTTON_POUR;
    if (value == STTextShapeType.TEXT_CURVE_UP) return TextShapeTypeValueModel.TEXT_CURVE_UP;
    if (value == STTextShapeType.TEXT_CURVE_DOWN) return TextShapeTypeValueModel.TEXT_CURVE_DOWN;
    if (value == STTextShapeType.TEXT_CAN_UP) return TextShapeTypeValueModel.TEXT_CAN_UP;
    if (value == STTextShapeType.TEXT_CAN_DOWN) return TextShapeTypeValueModel.TEXT_CAN_DOWN;
    if (value == STTextShapeType.TEXT_WAVE_1) return TextShapeTypeValueModel.TEXT_WAVE_1;
    if (value == STTextShapeType.TEXT_WAVE_2) return TextShapeTypeValueModel.TEXT_WAVE_2;
    if (value == STTextShapeType.TEXT_DOUBLE_WAVE_1) return TextShapeTypeValueModel.TEXT_DOUBLE_WAVE_1;
    if (value == STTextShapeType.TEXT_WAVE_4) return TextShapeTypeValueModel.TEXT_WAVE_4;
    if (value == STTextShapeType.TEXT_INFLATE) return TextShapeTypeValueModel.TEXT_INFLATE;
    if (value == STTextShapeType.TEXT_DEFLATE) return TextShapeTypeValueModel.TEXT_DEFLATE;
    if (value == STTextShapeType.TEXT_INFLATE_BOTTOM) return TextShapeTypeValueModel.TEXT_INFLATE_BOTTOM;
    if (value == STTextShapeType.TEXT_DEFLATE_BOTTOM) return TextShapeTypeValueModel.TEXT_DEFLATE_BOTTOM;
    if (value == STTextShapeType.TEXT_INFLATE_TOP) return TextShapeTypeValueModel.TEXT_INFLATE_TOP;
    if (value == STTextShapeType.TEXT_DEFLATE_TOP) return TextShapeTypeValueModel.TEXT_DEFLATE_TOP;
    if (value == STTextShapeType.TEXT_DEFLATE_INFLATE) return TextShapeTypeValueModel.TEXT_DEFLATE_INFLATE;
    if (value == STTextShapeType.TEXT_DEFLATE_INFLATE_DEFLATE) return TextShapeTypeValueModel.TEXT_DEFLATE_INFLATE_DEFLATE;
    if (value == STTextShapeType.TEXT_FADE_RIGHT) return TextShapeTypeValueModel.TEXT_FADE_RIGHT;
    if (value == STTextShapeType.TEXT_FADE_LEFT) return TextShapeTypeValueModel.TEXT_FADE_LEFT;
    if (value == STTextShapeType.TEXT_FADE_UP) return TextShapeTypeValueModel.TEXT_FADE_UP;
    if (value == STTextShapeType.TEXT_FADE_DOWN) return TextShapeTypeValueModel.TEXT_FADE_DOWN;
    if (value == STTextShapeType.TEXT_SLANT_UP) return TextShapeTypeValueModel.TEXT_SLANT_UP;
    if (value == STTextShapeType.TEXT_SLANT_DOWN) return TextShapeTypeValueModel.TEXT_SLANT_DOWN;
    if (value == STTextShapeType.TEXT_CASCADE_UP) return TextShapeTypeValueModel.TEXT_CASCADE_UP;
    if (value == STTextShapeType.TEXT_CASCADE_DOWN) return TextShapeTypeValueModel.TEXT_CASCADE_DOWN;
    return null;
  }

  public static STTextShapeType toDocx4j(TextShapeTypeValueModel value) {
    if (value == null) return null;
    if (value == TextShapeTypeValueModel.TEXT_NO_SHAPE) return STTextShapeType.TEXT_NO_SHAPE;
    if (value == TextShapeTypeValueModel.TEXT_PLAIN) return STTextShapeType.TEXT_PLAIN;
    if (value == TextShapeTypeValueModel.TEXT_STOP) return STTextShapeType.TEXT_STOP;
    if (value == TextShapeTypeValueModel.TEXT_TRIANGLE) return STTextShapeType.TEXT_TRIANGLE;
    if (value == TextShapeTypeValueModel.TEXT_TRIANGLE_INVERTED) return STTextShapeType.TEXT_TRIANGLE_INVERTED;
    if (value == TextShapeTypeValueModel.TEXT_CHEVRON) return STTextShapeType.TEXT_CHEVRON;
    if (value == TextShapeTypeValueModel.TEXT_CHEVRON_INVERTED) return STTextShapeType.TEXT_CHEVRON_INVERTED;
    if (value == TextShapeTypeValueModel.TEXT_RING_INSIDE) return STTextShapeType.TEXT_RING_INSIDE;
    if (value == TextShapeTypeValueModel.TEXT_RING_OUTSIDE) return STTextShapeType.TEXT_RING_OUTSIDE;
    if (value == TextShapeTypeValueModel.TEXT_ARCH_UP) return STTextShapeType.TEXT_ARCH_UP;
    if (value == TextShapeTypeValueModel.TEXT_ARCH_DOWN) return STTextShapeType.TEXT_ARCH_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_CIRCLE) return STTextShapeType.TEXT_CIRCLE;
    if (value == TextShapeTypeValueModel.TEXT_BUTTON) return STTextShapeType.TEXT_BUTTON;
    if (value == TextShapeTypeValueModel.TEXT_ARCH_UP_POUR) return STTextShapeType.TEXT_ARCH_UP_POUR;
    if (value == TextShapeTypeValueModel.TEXT_ARCH_DOWN_POUR) return STTextShapeType.TEXT_ARCH_DOWN_POUR;
    if (value == TextShapeTypeValueModel.TEXT_CIRCLE_POUR) return STTextShapeType.TEXT_CIRCLE_POUR;
    if (value == TextShapeTypeValueModel.TEXT_BUTTON_POUR) return STTextShapeType.TEXT_BUTTON_POUR;
    if (value == TextShapeTypeValueModel.TEXT_CURVE_UP) return STTextShapeType.TEXT_CURVE_UP;
    if (value == TextShapeTypeValueModel.TEXT_CURVE_DOWN) return STTextShapeType.TEXT_CURVE_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_CAN_UP) return STTextShapeType.TEXT_CAN_UP;
    if (value == TextShapeTypeValueModel.TEXT_CAN_DOWN) return STTextShapeType.TEXT_CAN_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_WAVE_1) return STTextShapeType.TEXT_WAVE_1;
    if (value == TextShapeTypeValueModel.TEXT_WAVE_2) return STTextShapeType.TEXT_WAVE_2;
    if (value == TextShapeTypeValueModel.TEXT_DOUBLE_WAVE_1) return STTextShapeType.TEXT_DOUBLE_WAVE_1;
    if (value == TextShapeTypeValueModel.TEXT_WAVE_4) return STTextShapeType.TEXT_WAVE_4;
    if (value == TextShapeTypeValueModel.TEXT_INFLATE) return STTextShapeType.TEXT_INFLATE;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE) return STTextShapeType.TEXT_DEFLATE;
    if (value == TextShapeTypeValueModel.TEXT_INFLATE_BOTTOM) return STTextShapeType.TEXT_INFLATE_BOTTOM;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE_BOTTOM) return STTextShapeType.TEXT_DEFLATE_BOTTOM;
    if (value == TextShapeTypeValueModel.TEXT_INFLATE_TOP) return STTextShapeType.TEXT_INFLATE_TOP;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE_TOP) return STTextShapeType.TEXT_DEFLATE_TOP;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE_INFLATE) return STTextShapeType.TEXT_DEFLATE_INFLATE;
    if (value == TextShapeTypeValueModel.TEXT_DEFLATE_INFLATE_DEFLATE) return STTextShapeType.TEXT_DEFLATE_INFLATE_DEFLATE;
    if (value == TextShapeTypeValueModel.TEXT_FADE_RIGHT) return STTextShapeType.TEXT_FADE_RIGHT;
    if (value == TextShapeTypeValueModel.TEXT_FADE_LEFT) return STTextShapeType.TEXT_FADE_LEFT;
    if (value == TextShapeTypeValueModel.TEXT_FADE_UP) return STTextShapeType.TEXT_FADE_UP;
    if (value == TextShapeTypeValueModel.TEXT_FADE_DOWN) return STTextShapeType.TEXT_FADE_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_SLANT_UP) return STTextShapeType.TEXT_SLANT_UP;
    if (value == TextShapeTypeValueModel.TEXT_SLANT_DOWN) return STTextShapeType.TEXT_SLANT_DOWN;
    if (value == TextShapeTypeValueModel.TEXT_CASCADE_UP) return STTextShapeType.TEXT_CASCADE_UP;
    if (value == TextShapeTypeValueModel.TEXT_CASCADE_DOWN) return STTextShapeType.TEXT_CASCADE_DOWN;
    return null;
  }
}
