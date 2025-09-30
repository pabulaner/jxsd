package jxsd.gen.converter.drawingml.chart;

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
    if (value == STMarkerStyle.CIRCLE) return MarkerStyleValueModel.CIRCLE;
    if (value == STMarkerStyle.DASH) return MarkerStyleValueModel.DASH;
    if (value == STMarkerStyle.DIAMOND) return MarkerStyleValueModel.DIAMOND;
    if (value == STMarkerStyle.DOT) return MarkerStyleValueModel.DOT;
    if (value == STMarkerStyle.NONE) return MarkerStyleValueModel.NONE;
    if (value == STMarkerStyle.PICTURE) return MarkerStyleValueModel.PICTURE;
    if (value == STMarkerStyle.PLUS) return MarkerStyleValueModel.PLUS;
    if (value == STMarkerStyle.SQUARE) return MarkerStyleValueModel.SQUARE;
    if (value == STMarkerStyle.STAR) return MarkerStyleValueModel.STAR;
    if (value == STMarkerStyle.TRIANGLE) return MarkerStyleValueModel.TRIANGLE;
    if (value == STMarkerStyle.X) return MarkerStyleValueModel.X;
    return null;
  }

  public static STMarkerStyle toDocx4j(MarkerStyleValueModel value) {
    if (value == null) return null;
    if (value == MarkerStyleValueModel.CIRCLE) return STMarkerStyle.CIRCLE;
    if (value == MarkerStyleValueModel.DASH) return STMarkerStyle.DASH;
    if (value == MarkerStyleValueModel.DIAMOND) return STMarkerStyle.DIAMOND;
    if (value == MarkerStyleValueModel.DOT) return STMarkerStyle.DOT;
    if (value == MarkerStyleValueModel.NONE) return STMarkerStyle.NONE;
    if (value == MarkerStyleValueModel.PICTURE) return STMarkerStyle.PICTURE;
    if (value == MarkerStyleValueModel.PLUS) return STMarkerStyle.PLUS;
    if (value == MarkerStyleValueModel.SQUARE) return STMarkerStyle.SQUARE;
    if (value == MarkerStyleValueModel.STAR) return STMarkerStyle.STAR;
    if (value == MarkerStyleValueModel.TRIANGLE) return STMarkerStyle.TRIANGLE;
    if (value == MarkerStyleValueModel.X) return STMarkerStyle.X;
    return null;
  }
}
