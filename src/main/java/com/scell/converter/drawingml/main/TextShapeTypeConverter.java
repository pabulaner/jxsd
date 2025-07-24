package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextShapeTypeModel;
import org.docx4j.dml.STTextShapeType;

public class TextShapeTypeConverter {
  private TextShapeTypeConverter() {
  }

  public static TextShapeTypeModel fromDocx4J(STTextShapeType value) {
    if (value == null) return null;
    if (value == STTextShapeType.TEXT_NO_SHAPE) return TextShapeTypeModel.TEXT_NO_SHAPE;
    if (value == STTextShapeType.TEXT_PLAIN) return TextShapeTypeModel.TEXT_PLAIN;
    if (value == STTextShapeType.TEXT_STOP) return TextShapeTypeModel.TEXT_STOP;
    if (value == STTextShapeType.TEXT_TRIANGLE) return TextShapeTypeModel.TEXT_TRIANGLE;
    if (value == STTextShapeType.TEXT_TRIANGLE_INVERTED) return TextShapeTypeModel.TEXT_TRIANGLE_INVERTED;
    if (value == STTextShapeType.TEXT_CHEVRON) return TextShapeTypeModel.TEXT_CHEVRON;
    if (value == STTextShapeType.TEXT_CHEVRON_INVERTED) return TextShapeTypeModel.TEXT_CHEVRON_INVERTED;
    if (value == STTextShapeType.TEXT_RING_INSIDE) return TextShapeTypeModel.TEXT_RING_INSIDE;
    if (value == STTextShapeType.TEXT_RING_OUTSIDE) return TextShapeTypeModel.TEXT_RING_OUTSIDE;
    if (value == STTextShapeType.TEXT_ARCH_UP) return TextShapeTypeModel.TEXT_ARCH_UP;
    if (value == STTextShapeType.TEXT_ARCH_DOWN) return TextShapeTypeModel.TEXT_ARCH_DOWN;
    if (value == STTextShapeType.TEXT_CIRCLE) return TextShapeTypeModel.TEXT_CIRCLE;
    if (value == STTextShapeType.TEXT_BUTTON) return TextShapeTypeModel.TEXT_BUTTON;
    if (value == STTextShapeType.TEXT_ARCH_UP_POUR) return TextShapeTypeModel.TEXT_ARCH_UP_POUR;
    if (value == STTextShapeType.TEXT_ARCH_DOWN_POUR) return TextShapeTypeModel.TEXT_ARCH_DOWN_POUR;
    if (value == STTextShapeType.TEXT_CIRCLE_POUR) return TextShapeTypeModel.TEXT_CIRCLE_POUR;
    if (value == STTextShapeType.TEXT_BUTTON_POUR) return TextShapeTypeModel.TEXT_BUTTON_POUR;
    if (value == STTextShapeType.TEXT_CURVE_UP) return TextShapeTypeModel.TEXT_CURVE_UP;
    if (value == STTextShapeType.TEXT_CURVE_DOWN) return TextShapeTypeModel.TEXT_CURVE_DOWN;
    if (value == STTextShapeType.TEXT_CAN_UP) return TextShapeTypeModel.TEXT_CAN_UP;
    if (value == STTextShapeType.TEXT_CAN_DOWN) return TextShapeTypeModel.TEXT_CAN_DOWN;
    if (value == STTextShapeType.TEXT_WAVE_1) return TextShapeTypeModel.TEXT_WAVE_1;
    if (value == STTextShapeType.TEXT_WAVE_2) return TextShapeTypeModel.TEXT_WAVE_2;
    if (value == STTextShapeType.TEXT_DOUBLE_WAVE_1) return TextShapeTypeModel.TEXT_DOUBLE_WAVE_1;
    if (value == STTextShapeType.TEXT_WAVE_4) return TextShapeTypeModel.TEXT_WAVE_4;
    if (value == STTextShapeType.TEXT_INFLATE) return TextShapeTypeModel.TEXT_INFLATE;
    if (value == STTextShapeType.TEXT_DEFLATE) return TextShapeTypeModel.TEXT_DEFLATE;
    if (value == STTextShapeType.TEXT_INFLATE_BOTTOM) return TextShapeTypeModel.TEXT_INFLATE_BOTTOM;
    if (value == STTextShapeType.TEXT_DEFLATE_BOTTOM) return TextShapeTypeModel.TEXT_DEFLATE_BOTTOM;
    if (value == STTextShapeType.TEXT_INFLATE_TOP) return TextShapeTypeModel.TEXT_INFLATE_TOP;
    if (value == STTextShapeType.TEXT_DEFLATE_TOP) return TextShapeTypeModel.TEXT_DEFLATE_TOP;
    if (value == STTextShapeType.TEXT_DEFLATE_INFLATE) return TextShapeTypeModel.TEXT_DEFLATE_INFLATE;
    if (value == STTextShapeType.TEXT_DEFLATE_INFLATE_DEFLATE) return TextShapeTypeModel.TEXT_DEFLATE_INFLATE_DEFLATE;
    if (value == STTextShapeType.TEXT_FADE_RIGHT) return TextShapeTypeModel.TEXT_FADE_RIGHT;
    if (value == STTextShapeType.TEXT_FADE_LEFT) return TextShapeTypeModel.TEXT_FADE_LEFT;
    if (value == STTextShapeType.TEXT_FADE_UP) return TextShapeTypeModel.TEXT_FADE_UP;
    if (value == STTextShapeType.TEXT_FADE_DOWN) return TextShapeTypeModel.TEXT_FADE_DOWN;
    if (value == STTextShapeType.TEXT_SLANT_UP) return TextShapeTypeModel.TEXT_SLANT_UP;
    if (value == STTextShapeType.TEXT_SLANT_DOWN) return TextShapeTypeModel.TEXT_SLANT_DOWN;
    if (value == STTextShapeType.TEXT_CASCADE_UP) return TextShapeTypeModel.TEXT_CASCADE_UP;
    if (value == STTextShapeType.TEXT_CASCADE_DOWN) return TextShapeTypeModel.TEXT_CASCADE_DOWN;
    return null;
  }
}
