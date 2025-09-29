package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.main.Path2DBuilder;

/**
 * This is a generated sequence class.
 */
public class Path2DModel {
  private final PathFillModeValueModel fill;

  private final boolean extrusionOk;

  private final long h;

  private final long w;

  private final boolean stroke;

  private final List<CloseOrMoveToOrLnTo> closeOrMoveToOrLnTo;

  public Path2DModel(PathFillModeValueModel fill, boolean extrusionOk, long h, long w,
      boolean stroke, List<CloseOrMoveToOrLnTo> closeOrMoveToOrLnTo) {
    this.fill = fill;
    this.extrusionOk = extrusionOk;
    this.h = h;
    this.w = w;
    this.stroke = stroke;
    this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
  }

  public Path2DBuilder builder() {
    return new Path2DBuilder().from(this);
  }

  public PathFillModeValueModel getFill() {
    return this.fill;
  }

  public boolean getExtrusionOk() {
    return this.extrusionOk;
  }

  public long getH() {
    return this.h;
  }

  public long getW() {
    return this.w;
  }

  public boolean getStroke() {
    return this.stroke;
  }

  public List<CloseOrMoveToOrLnTo> getCloseOrMoveToOrLnTo() {
    return this.closeOrMoveToOrLnTo;
  }

  /**
   * This is a generated choice class.
   */
  public static class CloseOrMoveToOrLnTo {
    private final int type;

    private final Object value;

    public CloseOrMoveToOrLnTo() {
      this(-1, null);
    }

    private CloseOrMoveToOrLnTo(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public Path2DBuilder.CloseOrMoveToOrLnTo builder() {
      return new Path2DBuilder.CloseOrMoveToOrLnTo().from(this);
    }

    public static CloseOrMoveToOrLnTo newClose(Path2DCloseModel value) {
      return new CloseOrMoveToOrLnTo(0, value);
    }

    public boolean isClose() {
      return this.type == 0;
    }

    public Path2DCloseModel getClose() {
      return (Path2DCloseModel) this.value;
    }

    public static CloseOrMoveToOrLnTo newMoveTo(Path2DMoveToModel value) {
      return new CloseOrMoveToOrLnTo(1, value);
    }

    public boolean isMoveTo() {
      return this.type == 1;
    }

    public Path2DMoveToModel getMoveTo() {
      return (Path2DMoveToModel) this.value;
    }

    public static CloseOrMoveToOrLnTo newLnTo(Path2DLineToModel value) {
      return new CloseOrMoveToOrLnTo(2, value);
    }

    public boolean isLnTo() {
      return this.type == 2;
    }

    public Path2DLineToModel getLnTo() {
      return (Path2DLineToModel) this.value;
    }

    public static CloseOrMoveToOrLnTo newArcTo(Path2DArcToModel value) {
      return new CloseOrMoveToOrLnTo(3, value);
    }

    public boolean isArcTo() {
      return this.type == 3;
    }

    public Path2DArcToModel getArcTo() {
      return (Path2DArcToModel) this.value;
    }

    public static CloseOrMoveToOrLnTo newQuadBezTo(Path2DQuadBezierToModel value) {
      return new CloseOrMoveToOrLnTo(4, value);
    }

    public boolean isQuadBezTo() {
      return this.type == 4;
    }

    public Path2DQuadBezierToModel getQuadBezTo() {
      return (Path2DQuadBezierToModel) this.value;
    }

    public static CloseOrMoveToOrLnTo newCubicBezTo(Path2DCubicBezierToModel value) {
      return new CloseOrMoveToOrLnTo(5, value);
    }

    public boolean isCubicBezTo() {
      return this.type == 5;
    }

    public Path2DCubicBezierToModel getCubicBezTo() {
      return (Path2DCubicBezierToModel) this.value;
    }
  }
}
