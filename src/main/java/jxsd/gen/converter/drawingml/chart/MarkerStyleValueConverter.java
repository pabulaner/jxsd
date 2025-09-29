package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.MarkerStyleValueBuilder;
import jxsd.gen.model.drawingml.chart.MarkerStyleValueModel;
import org.docx4j.dml.chart.STMarkerStyle;

/**
 * This is a generated enum class.
 */
public class MarkerStyleValueConverter {
  private MarkerStyleValueConverter() {
  }

  public static MarkerStyleValueModel fromDocx4j(STMarkerStyle value) {
    if (value == null) return null;
    if (value == MarkerStyleValueBuilder.CIRCLE) return MarkerStyleValueModel.CIRCLE;
    if (value == MarkerStyleValueBuilder.DASH) return MarkerStyleValueModel.DASH;
    if (value == MarkerStyleValueBuilder.DIAMOND) return MarkerStyleValueModel.DIAMOND;
    if (value == MarkerStyleValueBuilder.DOT) return MarkerStyleValueModel.DOT;
    if (value == MarkerStyleValueBuilder.NONE) return MarkerStyleValueModel.NONE;
    if (value == MarkerStyleValueBuilder.PICTURE) return MarkerStyleValueModel.PICTURE;
    if (value == MarkerStyleValueBuilder.PLUS) return MarkerStyleValueModel.PLUS;
    if (value == MarkerStyleValueBuilder.SQUARE) return MarkerStyleValueModel.SQUARE;
    if (value == MarkerStyleValueBuilder.STAR) return MarkerStyleValueModel.STAR;
    if (value == MarkerStyleValueBuilder.TRIANGLE) return MarkerStyleValueModel.TRIANGLE;
    if (value == MarkerStyleValueBuilder.X) return MarkerStyleValueModel.X;
    return null;
  }

  public static STMarkerStyle toDocx4j(MarkerStyleValueModel value) {
    if (value == null) return null;
    if (value == MarkerStyleValueModel.CIRCLE) return MarkerStyleValueBuilder.CIRCLE;
    if (value == MarkerStyleValueModel.DASH) return MarkerStyleValueBuilder.DASH;
    if (value == MarkerStyleValueModel.DIAMOND) return MarkerStyleValueBuilder.DIAMOND;
    if (value == MarkerStyleValueModel.DOT) return MarkerStyleValueBuilder.DOT;
    if (value == MarkerStyleValueModel.NONE) return MarkerStyleValueBuilder.NONE;
    if (value == MarkerStyleValueModel.PICTURE) return MarkerStyleValueBuilder.PICTURE;
    if (value == MarkerStyleValueModel.PLUS) return MarkerStyleValueBuilder.PLUS;
    if (value == MarkerStyleValueModel.SQUARE) return MarkerStyleValueBuilder.SQUARE;
    if (value == MarkerStyleValueModel.STAR) return MarkerStyleValueBuilder.STAR;
    if (value == MarkerStyleValueModel.TRIANGLE) return MarkerStyleValueBuilder.TRIANGLE;
    if (value == MarkerStyleValueModel.X) return MarkerStyleValueBuilder.X;
    return null;
  }
}
