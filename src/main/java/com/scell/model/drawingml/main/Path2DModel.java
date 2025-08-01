package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class Path2DModel {
  private final PathFillModeValueModel fill;

  private final BooleanValueModel extrusionOk;

  private final PositiveCoordinateValueModel h;

  private final PositiveCoordinateValueModel w;

  private final BooleanValueModel stroke;

  private final List<CloseOrMoveToOrLnToValueModel> closeOrMoveToOrLnTo;

  public Path2DModel(PathFillModeValueModel fill, BooleanValueModel extrusionOk,
      PositiveCoordinateValueModel h, PositiveCoordinateValueModel w, BooleanValueModel stroke,
      List<CloseOrMoveToOrLnToValueModel> closeOrMoveToOrLnTo) {
    this.fill = fill;
    this.extrusionOk = extrusionOk;
    this.h = h;
    this.w = w;
    this.stroke = stroke;
    this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
  }

  public PathFillModeValueModel getFill() {
    return this.fill;
  }

  public BooleanValueModel getExtrusionOk() {
    return this.extrusionOk;
  }

  public PositiveCoordinateValueModel getH() {
    return this.h;
  }

  public PositiveCoordinateValueModel getW() {
    return this.w;
  }

  public BooleanValueModel getStroke() {
    return this.stroke;
  }

  public List<CloseOrMoveToOrLnToValueModel> getCloseOrMoveToOrLnTo() {
    return this.closeOrMoveToOrLnTo;
  }

  public static class CloseOrMoveToOrLnToValueModel {
    private final int type;

    private final Object value;

    public CloseOrMoveToOrLnToValueModel() {
      this(-1, null);
    }

    private CloseOrMoveToOrLnToValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CloseOrMoveToOrLnToValueModel newClose(Path2DCloseModel value) {
      return new CloseOrMoveToOrLnToValueModel(0, value);
    }

    public boolean isClose() {
      return this.type == 0;
    }

    public Path2DCloseModel getClose() {
      return (Path2DCloseModel) this.value;
    }

    public static CloseOrMoveToOrLnToValueModel newMoveTo(Path2DMoveToModel value) {
      return new CloseOrMoveToOrLnToValueModel(1, value);
    }

    public boolean isMoveTo() {
      return this.type == 1;
    }

    public Path2DMoveToModel getMoveTo() {
      return (Path2DMoveToModel) this.value;
    }

    public static CloseOrMoveToOrLnToValueModel newLnTo(Path2DLineToModel value) {
      return new CloseOrMoveToOrLnToValueModel(2, value);
    }

    public boolean isLnTo() {
      return this.type == 2;
    }

    public Path2DLineToModel getLnTo() {
      return (Path2DLineToModel) this.value;
    }

    public static CloseOrMoveToOrLnToValueModel newArcTo(Path2DArcToModel value) {
      return new CloseOrMoveToOrLnToValueModel(3, value);
    }

    public boolean isArcTo() {
      return this.type == 3;
    }

    public Path2DArcToModel getArcTo() {
      return (Path2DArcToModel) this.value;
    }

    public static CloseOrMoveToOrLnToValueModel newQuadBezTo(Path2DQuadBezierToModel value) {
      return new CloseOrMoveToOrLnToValueModel(4, value);
    }

    public boolean isQuadBezTo() {
      return this.type == 4;
    }

    public Path2DQuadBezierToModel getQuadBezTo() {
      return (Path2DQuadBezierToModel) this.value;
    }

    public static CloseOrMoveToOrLnToValueModel newCubicBezTo(Path2DCubicBezierToModel value) {
      return new CloseOrMoveToOrLnToValueModel(5, value);
    }

    public boolean isCubicBezTo() {
      return this.type == 5;
    }

    public Path2DCubicBezierToModel getCubicBezTo() {
      return (Path2DCubicBezierToModel) this.value;
    }
  }
}
