package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.main.Path2DArcToModel;
import jxsd.gen.model.drawingml.main.Path2DCloseModel;
import jxsd.gen.model.drawingml.main.Path2DCubicBezierToModel;
import jxsd.gen.model.drawingml.main.Path2DLineToModel;
import jxsd.gen.model.drawingml.main.Path2DModel;
import jxsd.gen.model.drawingml.main.Path2DMoveToModel;
import jxsd.gen.model.drawingml.main.Path2DQuadBezierToModel;
import jxsd.gen.model.drawingml.main.PathFillModeValueModel;

/**
 * This is a generated sequence class.
 */
public class Path2DBuilder {
  private PathFillModeValueModel fill;

  private boolean extrusionOk;

  private long h;

  private long w;

  private boolean stroke;

  private List<Path2DModel.CloseOrMoveToOrLnTo> closeOrMoveToOrLnTo;

  public Path2DBuilder() {
  }

  public Path2DBuilder setFill(PathFillModeValueModel fill) {
    this.fill = fill;
    return this;
  }

  public Path2DBuilder setExtrusionOk(boolean extrusionOk) {
    this.extrusionOk = extrusionOk;
    return this;
  }

  public Path2DBuilder setH(long h) {
    this.h = h;
    return this;
  }

  public Path2DBuilder setW(long w) {
    this.w = w;
    return this;
  }

  public Path2DBuilder setStroke(boolean stroke) {
    this.stroke = stroke;
    return this;
  }

  public Path2DBuilder setCloseOrMoveToOrLnTo(
      List<Path2DModel.CloseOrMoveToOrLnTo> closeOrMoveToOrLnTo) {
    this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
    return this;
  }

  public Path2DBuilder from(Path2DModel value) {
    this.fill = value.getFill();
    this.extrusionOk = value.getExtrusionOk();
    this.h = value.getH();
    this.w = value.getW();
    this.stroke = value.getStroke();
    this.closeOrMoveToOrLnTo = value.getCloseOrMoveToOrLnTo();
    return this;
  }

  public Path2DModel build() {
    return new Path2DModel(this.fill, this.extrusionOk, this.h, this.w, this.stroke, this.closeOrMoveToOrLnTo);
  }

  /**
   * This is a generated choice class.
   */
  public static class CloseOrMoveToOrLnTo {
    private int type;

    private Object value;

    public CloseOrMoveToOrLnTo() {
      this.type = -1;
      this.value = null;
    }

    public CloseOrMoveToOrLnTo setClose(Path2DCloseModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnTo setMoveTo(Path2DMoveToModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnTo setLnTo(Path2DLineToModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnTo setArcTo(Path2DArcToModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnTo setQuadBezTo(Path2DQuadBezierToModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnTo setCubicBezTo(Path2DCubicBezierToModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnTo from(Path2DModel.CloseOrMoveToOrLnTo value) {
      this.type = -1;
      this.value = null;
      if (value.isClose()) {
        this.type = 0;
        this.value = value.getClose();
      }
      if (value.isMoveTo()) {
        this.type = 1;
        this.value = value.getMoveTo();
      }
      if (value.isLnTo()) {
        this.type = 2;
        this.value = value.getLnTo();
      }
      if (value.isArcTo()) {
        this.type = 3;
        this.value = value.getArcTo();
      }
      if (value.isQuadBezTo()) {
        this.type = 4;
        this.value = value.getQuadBezTo();
      }
      if (value.isCubicBezTo()) {
        this.type = 5;
        this.value = value.getCubicBezTo();
      }
      return this;
    }

    public Path2DModel.CloseOrMoveToOrLnTo build() {
      if (this.type == -1) return new Path2DModel.CloseOrMoveToOrLnTo();
      if (this.type == 0) return Path2DModel.CloseOrMoveToOrLnTo.newClose((Path2DCloseModel) this.value);
      if (this.type == 1) return Path2DModel.CloseOrMoveToOrLnTo.newMoveTo((Path2DMoveToModel) this.value);
      if (this.type == 2) return Path2DModel.CloseOrMoveToOrLnTo.newLnTo((Path2DLineToModel) this.value);
      if (this.type == 3) return Path2DModel.CloseOrMoveToOrLnTo.newArcTo((Path2DArcToModel) this.value);
      if (this.type == 4) return Path2DModel.CloseOrMoveToOrLnTo.newQuadBezTo((Path2DQuadBezierToModel) this.value);
      if (this.type == 5) return Path2DModel.CloseOrMoveToOrLnTo.newCubicBezTo((Path2DCubicBezierToModel) this.value);
      return null;
    }
  }
}
