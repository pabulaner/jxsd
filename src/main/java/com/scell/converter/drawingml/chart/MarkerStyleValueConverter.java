package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerStyleValueModel;
import org.docx4j.dml.chart.STMarkerStyle;

public class MarkerStyleValueConverter {
  private MarkerStyleValueConverter() {
  }

  public static MarkerStyleValueModel fromDocx4J(STMarkerStyle value) {
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
}
