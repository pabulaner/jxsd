package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_MarkerStyleModel;
import org.docx4j.dml.chart.STMarkerStyle;

public class ST_MarkerStyleConverter {
  private ST_MarkerStyleConverter() {
  }

  public static ST_MarkerStyleModel fromDocx4J(STMarkerStyle value) {
    if (value == null) return null;
    if (value == STMarkerStyle.CIRCLE) return ST_MarkerStyleModel.CIRCLE;
    if (value == STMarkerStyle.DASH) return ST_MarkerStyleModel.DASH;
    if (value == STMarkerStyle.DIAMOND) return ST_MarkerStyleModel.DIAMOND;
    if (value == STMarkerStyle.DOT) return ST_MarkerStyleModel.DOT;
    if (value == STMarkerStyle.NONE) return ST_MarkerStyleModel.NONE;
    if (value == STMarkerStyle.PICTURE) return ST_MarkerStyleModel.PICTURE;
    if (value == STMarkerStyle.PLUS) return ST_MarkerStyleModel.PLUS;
    if (value == STMarkerStyle.SQUARE) return ST_MarkerStyleModel.SQUARE;
    if (value == STMarkerStyle.STAR) return ST_MarkerStyleModel.STAR;
    if (value == STMarkerStyle.TRIANGLE) return ST_MarkerStyleModel.TRIANGLE;
    if (value == STMarkerStyle.X) return ST_MarkerStyleModel.X;
    return null;
  }

  public static STMarkerStyle toDocx4J(ST_MarkerStyleModel value) {
    return null;
  }
}
