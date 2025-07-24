package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class Path2DModel {
  private final PathFillModeModel fill;

  private final BooleanModel extrusionOk;

  private final PositiveCoordinateModel h;

  private final PositiveCoordinateModel w;

  private final BooleanModel stroke;

  private final List<CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo;

  public Path2DModel(PathFillModeModel fill, BooleanModel extrusionOk, PositiveCoordinateModel h,
      PositiveCoordinateModel w, BooleanModel stroke,
      List<CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo) {
    this.fill = fill;
    this.extrusionOk = extrusionOk;
    this.h = h;
    this.w = w;
    this.stroke = stroke;
    this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
  }

  public PathFillModeModel getFill() {
    return this.fill;
  }

  public BooleanModel getExtrusionOk() {
    return this.extrusionOk;
  }

  public PositiveCoordinateModel getH() {
    return this.h;
  }

  public PositiveCoordinateModel getW() {
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

    public static CloseOrMoveToOrLnToModel newClose(Path2DCloseModel value) {
      return new CloseOrMoveToOrLnToModel(0, value);
    }

    public boolean isClose() {
      return this.type == 0;
    }

    public Path2DCloseModel getClose() {
      return (Path2DCloseModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newMoveTo(Path2DMoveToModel value) {
      return new CloseOrMoveToOrLnToModel(1, value);
    }

    public boolean isMoveTo() {
      return this.type == 1;
    }

    public Path2DMoveToModel getMoveTo() {
      return (Path2DMoveToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newLnTo(Path2DLineToModel value) {
      return new CloseOrMoveToOrLnToModel(2, value);
    }

    public boolean isLnTo() {
      return this.type == 2;
    }

    public Path2DLineToModel getLnTo() {
      return (Path2DLineToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newArcTo(Path2DArcToModel value) {
      return new CloseOrMoveToOrLnToModel(3, value);
    }

    public boolean isArcTo() {
      return this.type == 3;
    }

    public Path2DArcToModel getArcTo() {
      return (Path2DArcToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newQuadBezTo(Path2DQuadBezierToModel value) {
      return new CloseOrMoveToOrLnToModel(4, value);
    }

    public boolean isQuadBezTo() {
      return this.type == 4;
    }

    public Path2DQuadBezierToModel getQuadBezTo() {
      return (Path2DQuadBezierToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newCubicBezTo(Path2DCubicBezierToModel value) {
      return new CloseOrMoveToOrLnToModel(5, value);
    }

    public boolean isCubicBezTo() {
      return this.type == 5;
    }

    public Path2DCubicBezierToModel getCubicBezTo() {
      return (Path2DCubicBezierToModel) this.value;
    }
  }
}
