package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.BooleanModel;

public class CTPath2DModel {
  private final STPathFillModeModel fill;

  private final BooleanModel extrusionOk;

  private final STPositiveCoordinateModel h;

  private final STPositiveCoordinateModel w;

  private final BooleanModel stroke;

  private final CloseOrMoveToOrLnToModel closeOrMoveToOrLnTo;

  public CTPath2DModel(STPathFillModeModel fill, BooleanModel extrusionOk,
      STPositiveCoordinateModel h, STPositiveCoordinateModel w, BooleanModel stroke,
      CloseOrMoveToOrLnToModel closeOrMoveToOrLnTo) {
    this.fill = fill;
    this.extrusionOk = extrusionOk;
    this.h = h;
    this.w = w;
    this.stroke = stroke;
    this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
  }

  public STPathFillModeModel getFill() {
    return this.fill;
  }

  public BooleanModel getExtrusionOk() {
    return this.extrusionOk;
  }

  public STPositiveCoordinateModel getH() {
    return this.h;
  }

  public STPositiveCoordinateModel getW() {
    return this.w;
  }

  public BooleanModel getStroke() {
    return this.stroke;
  }

  public CloseOrMoveToOrLnToModel getCloseOrMoveToOrLnTo() {
    return this.closeOrMoveToOrLnTo;
  }

  public static class CloseOrMoveToOrLnToModel {
    private final Integer type;

    private final Object value;

    public CloseOrMoveToOrLnToModel() {
      this(-1, null);
    }

    private CloseOrMoveToOrLnToModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CloseOrMoveToOrLnToModel newClose(CTPath2DCloseModel value) {
      return new CloseOrMoveToOrLnToModel(0, value);
    }

    public Boolean isClose() {
      return this.type == 0;
    }

    public CTPath2DCloseModel getClose() {
      return (CTPath2DCloseModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newMoveTo(CTPath2DMoveToModel value) {
      return new CloseOrMoveToOrLnToModel(1, value);
    }

    public Boolean isMoveTo() {
      return this.type == 1;
    }

    public CTPath2DMoveToModel getMoveTo() {
      return (CTPath2DMoveToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newLnTo(CTPath2DLineToModel value) {
      return new CloseOrMoveToOrLnToModel(2, value);
    }

    public Boolean isLnTo() {
      return this.type == 2;
    }

    public CTPath2DLineToModel getLnTo() {
      return (CTPath2DLineToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newArcTo(CTPath2DArcToModel value) {
      return new CloseOrMoveToOrLnToModel(3, value);
    }

    public Boolean isArcTo() {
      return this.type == 3;
    }

    public CTPath2DArcToModel getArcTo() {
      return (CTPath2DArcToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newQuadBezTo(CTPath2DQuadBezierToModel value) {
      return new CloseOrMoveToOrLnToModel(4, value);
    }

    public Boolean isQuadBezTo() {
      return this.type == 4;
    }

    public CTPath2DQuadBezierToModel getQuadBezTo() {
      return (CTPath2DQuadBezierToModel) this.value;
    }

    public static CloseOrMoveToOrLnToModel newCubicBezTo(CTPath2DCubicBezierToModel value) {
      return new CloseOrMoveToOrLnToModel(5, value);
    }

    public Boolean isCubicBezTo() {
      return this.type == 5;
    }

    public CTPath2DCubicBezierToModel getCubicBezTo() {
      return (CTPath2DCubicBezierToModel) this.value;
    }
  }
}
