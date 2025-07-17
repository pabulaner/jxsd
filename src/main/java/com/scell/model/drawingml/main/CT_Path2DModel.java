package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_Path2DModel {
  private final ST_PathFillModeModel fill;

  private final BooleanModel extrusionOk;

  private final ST_PositiveCoordinateModel h;

  private final ST_PositiveCoordinateModel w;

  private final BooleanModel stroke;

  private final List<CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo;

  public CT_Path2DModel(ST_PathFillModeModel fill, BooleanModel extrusionOk,
      ST_PositiveCoordinateModel h, ST_PositiveCoordinateModel w, BooleanModel stroke,
      List<CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo) {
    this.fill = fill;
    this.extrusionOk = extrusionOk;
    this.h = h;
    this.w = w;
    this.stroke = stroke;
    this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
  }

  public ST_PathFillModeModel getFill() {
    return this.fill;
  }

  public BooleanModel getExtrusionOk() {
    return this.extrusionOk;
  }

  public ST_PositiveCoordinateModel getH() {
    return this.h;
  }

  public ST_PositiveCoordinateModel getW() {
    return this.w;
  }

  public BooleanModel getStroke() {
    return this.stroke;
  }

  public List<CloseOrMoveToOrLnToModel> getCloseOrMoveToOrLnTo() {
    return this.closeOrMoveToOrLnTo;
  }

  public static class CloseOrMoveToOrLnToModel {
    private final int type;

    private final Object value;

    public CloseOrMoveToOrLnToModel() {
      this(-1, null);
    }

    private CloseOrMoveToOrLnToModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CloseOrMoveToOrLnToModel newClose(CT_Path2DCloseModel value) {
      return new CloseOrMoveToOrLnToModel(0, value);
    }

    public boolean isClose() {
      return this.type == 0;
    }

    public CT_Path2DCloseModel getClose() {
      return (CT_Path2DCloseModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newMoveTo(CT_Path2DMoveToModel value) {
      return new CloseOrMoveToOrLnToModel(1, value);
    }

    public boolean isMoveTo() {
      return this.type == 1;
    }

    public CT_Path2DMoveToModel getMoveTo() {
      return (CT_Path2DMoveToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newLnTo(CT_Path2DLineToModel value) {
      return new CloseOrMoveToOrLnToModel(2, value);
    }

    public boolean isLnTo() {
      return this.type == 2;
    }

    public CT_Path2DLineToModel getLnTo() {
      return (CT_Path2DLineToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newArcTo(CT_Path2DArcToModel value) {
      return new CloseOrMoveToOrLnToModel(3, value);
    }

    public boolean isArcTo() {
      return this.type == 3;
    }

    public CT_Path2DArcToModel getArcTo() {
      return (CT_Path2DArcToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newQuadBezTo(CT_Path2DQuadBezierToModel value) {
      return new CloseOrMoveToOrLnToModel(4, value);
    }

    public boolean isQuadBezTo() {
      return this.type == 4;
    }

    public CT_Path2DQuadBezierToModel getQuadBezTo() {
      return (CT_Path2DQuadBezierToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newCubicBezTo(CT_Path2DCubicBezierToModel value) {
      return new CloseOrMoveToOrLnToModel(5, value);
    }

    public boolean isCubicBezTo() {
      return this.type == 5;
    }

    public CT_Path2DCubicBezierToModel getCubicBezTo() {
      return (CT_Path2DCubicBezierToModel) this.value;
    }
  }
}
