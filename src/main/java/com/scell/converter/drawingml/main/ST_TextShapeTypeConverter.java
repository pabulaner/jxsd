package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextShapeTypeModel;
import org.docx4j.dml.STTextShapeType;

public class ST_TextShapeTypeConverter {
  private ST_TextShapeTypeConverter() {
  }

  public static ST_TextShapeTypeModel fromDocx4j(STTextShapeType value) {
    if (value == null) return null;
    if (value == STTextShapeType.TEXT_NO_SHAPE) return ST_TextShapeTypeModel.TEXT_NO_SHAPE;
    if (value == STTextShapeType.TEXT_PLAIN) return ST_TextShapeTypeModel.TEXT_PLAIN;
    if (value == STTextShapeType.TEXT_STOP) return ST_TextShapeTypeModel.TEXT_STOP;
    if (value == STTextShapeType.TEXT_TRIANGLE) return ST_TextShapeTypeModel.TEXT_TRIANGLE;
    if (value == STTextShapeType.TEXT_TRIANGLE_INVERTED) return ST_TextShapeTypeModel.TEXT_TRIANGLE_INVERTED;
    if (value == STTextShapeType.TEXT_CHEVRON) return ST_TextShapeTypeModel.TEXT_CHEVRON;
    if (value == STTextShapeType.TEXT_CHEVRON_INVERTED) return ST_TextShapeTypeModel.TEXT_CHEVRON_INVERTED;
    if (value == STTextShapeType.TEXT_RING_INSIDE) return ST_TextShapeTypeModel.TEXT_RING_INSIDE;
    if (value == STTextShapeType.TEXT_RING_OUTSIDE) return ST_TextShapeTypeModel.TEXT_RING_OUTSIDE;
    if (value == STTextShapeType.TEXT_ARCH_UP) return ST_TextShapeTypeModel.TEXT_ARCH_UP;
    if (value == STTextShapeType.TEXT_ARCH_DOWN) return ST_TextShapeTypeModel.TEXT_ARCH_DOWN;
    if (value == STTextShapeType.TEXT_CIRCLE) return ST_TextShapeTypeModel.TEXT_CIRCLE;
    if (value == STTextShapeType.TEXT_BUTTON) return ST_TextShapeTypeModel.TEXT_BUTTON;
    if (value == STTextShapeType.TEXT_ARCH_UP_POUR) return ST_TextShapeTypeModel.TEXT_ARCH_UP_POUR;
    if (value == STTextShapeType.TEXT_ARCH_DOWN_POUR) return ST_TextShapeTypeModel.TEXT_ARCH_DOWN_POUR;
    if (value == STTextShapeType.TEXT_CIRCLE_POUR) return ST_TextShapeTypeModel.TEXT_CIRCLE_POUR;
    if (value == STTextShapeType.TEXT_BUTTON_POUR) return ST_TextShapeTypeModel.TEXT_BUTTON_POUR;
    if (value == STTextShapeType.TEXT_CURVE_UP) return ST_TextShapeTypeModel.TEXT_CURVE_UP;
    if (value == STTextShapeType.TEXT_CURVE_DOWN) return ST_TextShapeTypeModel.TEXT_CURVE_DOWN;
    if (value == STTextShapeType.TEXT_CAN_UP) return ST_TextShapeTypeModel.TEXT_CAN_UP;
    if (value == STTextShapeType.TEXT_CAN_DOWN) return ST_TextShapeTypeModel.TEXT_CAN_DOWN;
    if (value == STTextShapeType.TEXT_WAVE1) return ST_TextShapeTypeModel.TEXT_WAVE1;
    if (value == STTextShapeType.TEXT_WAVE2) return ST_TextShapeTypeModel.TEXT_WAVE2;
    if (value == STTextShapeType.TEXT_DOUBLE_WAVE1) return ST_TextShapeTypeModel.TEXT_DOUBLE_WAVE1;
    if (value == STTextShapeType.TEXT_WAVE4) return ST_TextShapeTypeModel.TEXT_WAVE4;
    if (value == STTextShapeType.TEXT_INFLATE) return ST_TextShapeTypeModel.TEXT_INFLATE;
    if (value == STTextShapeType.TEXT_DEFLATE) return ST_TextShapeTypeModel.TEXT_DEFLATE;
    if (value == STTextShapeType.TEXT_INFLATE_BOTTOM) return ST_TextShapeTypeModel.TEXT_INFLATE_BOTTOM;
    if (value == STTextShapeType.TEXT_DEFLATE_BOTTOM) return ST_TextShapeTypeModel.TEXT_DEFLATE_BOTTOM;
    if (value == STTextShapeType.TEXT_INFLATE_TOP) return ST_TextShapeTypeModel.TEXT_INFLATE_TOP;
    if (value == STTextShapeType.TEXT_DEFLATE_TOP) return ST_TextShapeTypeModel.TEXT_DEFLATE_TOP;
    if (value == STTextShapeType.TEXT_DEFLATE_INFLATE) return ST_TextShapeTypeModel.TEXT_DEFLATE_INFLATE;
    if (value == STTextShapeType.TEXT_DEFLATE_INFLATE_DEFLATE) return ST_TextShapeTypeModel.TEXT_DEFLATE_INFLATE_DEFLATE;
    if (value == STTextShapeType.TEXT_FADE_RIGHT) return ST_TextShapeTypeModel.TEXT_FADE_RIGHT;
    if (value == STTextShapeType.TEXT_FADE_LEFT) return ST_TextShapeTypeModel.TEXT_FADE_LEFT;
    if (value == STTextShapeType.TEXT_FADE_UP) return ST_TextShapeTypeModel.TEXT_FADE_UP;
    if (value == STTextShapeType.TEXT_FADE_DOWN) return ST_TextShapeTypeModel.TEXT_FADE_DOWN;
    if (value == STTextShapeType.TEXT_SLANT_UP) return ST_TextShapeTypeModel.TEXT_SLANT_UP;
    if (value == STTextShapeType.TEXT_SLANT_DOWN) return ST_TextShapeTypeModel.TEXT_SLANT_DOWN;
    if (value == STTextShapeType.TEXT_CASCADE_UP) return ST_TextShapeTypeModel.TEXT_CASCADE_UP;
    if (value == STTextShapeType.TEXT_CASCADE_DOWN) return ST_TextShapeTypeModel.TEXT_CASCADE_DOWN;
    return null;
  }

  public static STTextShapeType toDocx4j(ST_TextShapeTypeModel value) {
    return null;
  }
}
