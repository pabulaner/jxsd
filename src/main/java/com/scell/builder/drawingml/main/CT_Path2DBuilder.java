package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_Path2DArcToModel;
import com.scell.model.drawingml.main.CT_Path2DCloseModel;
import com.scell.model.drawingml.main.CT_Path2DCubicBezierToModel;
import com.scell.model.drawingml.main.CT_Path2DLineToModel;
import com.scell.model.drawingml.main.CT_Path2DModel;
import com.scell.model.drawingml.main.CT_Path2DMoveToModel;
import com.scell.model.drawingml.main.CT_Path2DQuadBezierToModel;
import com.scell.model.drawingml.main.ST_PathFillModeModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;
import java.lang.Object;
import java.util.List;

public class CT_Path2DBuilder {
  private ST_PathFillModeModel fill;

  private BooleanModel extrusionOk;

  private ST_PositiveCoordinateModel h;

  private ST_PositiveCoordinateModel w;

  private BooleanModel stroke;

  private List<CT_Path2DModel.CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo;

  public CT_Path2DBuilder() {
  }

  public CT_Path2DBuilder setFill(ST_PathFillModeModel fill) {
    this.fill = fill;
    return this;
  }

  public CT_Path2DBuilder setExtrusionOk(BooleanModel extrusionOk) {
    this.extrusionOk = extrusionOk;
    return this;
  }

  public CT_Path2DBuilder setH(ST_PositiveCoordinateModel h) {
    this.h = h;
    return this;
  }

  public CT_Path2DBuilder setW(ST_PositiveCoordinateModel w) {
    this.w = w;
    return this;
  }

  public CT_Path2DBuilder setStroke(BooleanModel stroke) {
    this.stroke = stroke;
    return this;
  }

  public CT_Path2DBuilder setCloseOrMoveToOrLnTo(
      List<CT_Path2DModel.CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo) {
    this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
    return this;
  }

  public CT_Path2DModel build() {
    return new CT_Path2DModel(this.fill, this.extrusionOk, this.h, this.w, this.stroke, this.closeOrMoveToOrLnTo);
  }

  public CT_Path2DBuilder from(CT_Path2DModel value) {
    this.fill = value.getFill();
    this.extrusionOk = value.getExtrusionOk();
    this.h = value.getH();
    this.w = value.getW();
    this.stroke = value.getStroke();
    this.closeOrMoveToOrLnTo = value.getCloseOrMoveToOrLnTo();
    return this;
  }

  public static class CloseOrMoveToOrLnToBuilder {
    private int type;

    private Object value;

    public CloseOrMoveToOrLnToBuilder() {
      this.type = -1;
      this.value = null;
    }

    public CloseOrMoveToOrLnToBuilder setClose(CT_Path2DCloseModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToBuilder setMoveTo(CT_Path2DMoveToModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToBuilder setLnTo(CT_Path2DLineToModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToBuilder setArcTo(CT_Path2DArcToModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToBuilder setQuadBezTo(CT_Path2DQuadBezierToModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public CloseOrMoveToOrLnToBuilder setCubicBezTo(CT_Path2DCubicBezierToModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public CT_Path2DModel.CloseOrMoveToOrLnToModel build() {
      if (this.type == -1) return new CT_Path2DModel.CloseOrMoveToOrLnToModel();
      if (this.type == 0) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newClose((CT_Path2DCloseModel) this.value);
      if (this.type == 1) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newMoveTo((CT_Path2DMoveToModel) this.value);
      if (this.type == 2) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newLnTo((CT_Path2DLineToModel) this.value);
      if (this.type == 3) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newArcTo((CT_Path2DArcToModel) this.value);
      if (this.type == 4) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newQuadBezTo((CT_Path2DQuadBezierToModel) this.value);
      if (this.type == 5) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newCubicBezTo((CT_Path2DCubicBezierToModel) this.value);
      return null;
    }

    public CloseOrMoveToOrLnToBuilder from(CT_Path2DModel.CloseOrMoveToOrLnToModel value) {
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
