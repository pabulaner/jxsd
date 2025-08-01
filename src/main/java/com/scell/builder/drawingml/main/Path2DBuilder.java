package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.Path2DArcToModel;
import com.scell.model.drawingml.main.Path2DCloseModel;
import com.scell.model.drawingml.main.Path2DCubicBezierToModel;
import com.scell.model.drawingml.main.Path2DLineToModel;
import com.scell.model.drawingml.main.Path2DModel;
import com.scell.model.drawingml.main.Path2DMoveToModel;
import com.scell.model.drawingml.main.Path2DQuadBezierToModel;
import com.scell.model.drawingml.main.PathFillModeValueModel;
import com.scell.model.drawingml.main.PositiveCoordinateValueModel;
import java.lang.Object;
import java.util.List;

public class Path2DBuilder {
  private PathFillModeValueModel fill;

  private BooleanValueModel extrusionOk;

  private PositiveCoordinateValueModel h;

  private PositiveCoordinateValueModel w;

  private BooleanValueModel stroke;

  private List<Path2DModel.CloseOrMoveToOrLnToValueModel> closeOrMoveToOrLnTo;

  public Path2DBuilder() {
  }

  public Path2DBuilder setFill(PathFillModeValueModel fill) {
    this.fill = fill;
    return this;
  }

  public Path2DBuilder setExtrusionOk(BooleanValueModel extrusionOk) {
    this.extrusionOk = extrusionOk;
    return this;
  }

  public Path2DBuilder setH(PositiveCoordinateValueModel h) {
    this.h = h;
    return this;
  }

  public Path2DBuilder setW(PositiveCoordinateValueModel w) {
    this.w = w;
    return this;
  }

  public Path2DBuilder setStroke(BooleanValueModel stroke) {
    this.stroke = stroke;
    return this;
  }

  public Path2DBuilder setCloseOrMoveToOrLnTo(
      List<Path2DModel.CloseOrMoveToOrLnToValueModel> closeOrMoveToOrLnTo) {
    this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
    return this;
  }

  public Path2DModel build() {
    return new Path2DModel(this.fill, this.extrusionOk, this.h, this.w, this.stroke, this.closeOrMoveToOrLnTo);
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

  public static class CloseOrMoveToOrLnToValueBuilder {
    private int type;

    private Object value;

    public CloseOrMoveToOrLnToValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public CloseOrMoveToOrLnToValueBuilder setClose(Path2DCloseModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToValueBuilder setMoveTo(Path2DMoveToModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToValueBuilder setLnTo(Path2DLineToModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToValueBuilder setArcTo(Path2DArcToModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToValueBuilder setQuadBezTo(Path2DQuadBezierToModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToValueBuilder setCubicBezTo(Path2DCubicBezierToModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public Path2DModel.CloseOrMoveToOrLnToValueModel build() {
      if (this.type == -1) return new Path2DModel.CloseOrMoveToOrLnToValueModel();
      if (this.type == 0) return Path2DModel.CloseOrMoveToOrLnToValueModel.newClose((Path2DCloseModel) this.value);
      if (this.type == 1) return Path2DModel.CloseOrMoveToOrLnToValueModel.newMoveTo((Path2DMoveToModel) this.value);
      if (this.type == 2) return Path2DModel.CloseOrMoveToOrLnToValueModel.newLnTo((Path2DLineToModel) this.value);
      if (this.type == 3) return Path2DModel.CloseOrMoveToOrLnToValueModel.newArcTo((Path2DArcToModel) this.value);
      if (this.type == 4) return Path2DModel.CloseOrMoveToOrLnToValueModel.newQuadBezTo((Path2DQuadBezierToModel) this.value);
      if (this.type == 5) return Path2DModel.CloseOrMoveToOrLnToValueModel.newCubicBezTo((Path2DCubicBezierToModel) this.value);
      return null;
    }

    public CloseOrMoveToOrLnToValueBuilder from(Path2DModel.CloseOrMoveToOrLnToValueModel value) {
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
  }
}
