package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.ConnectorLockingModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class ConnectorLockingBuilder {
  private BooleanModel noResize;

  private BooleanModel noChangeAspect;

  private BooleanModel noEditPoints;

  private BooleanModel noChangeArrowheads;

  private BooleanModel noSelect;

  private BooleanModel noGrp;

  private BooleanModel noMove;

  private BooleanModel noRot;

  private BooleanModel noChangeShapeType;

  private BooleanModel noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public ConnectorLockingBuilder() {
  }

  public ConnectorLockingBuilder setNoResize(BooleanModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeAspect(BooleanModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public ConnectorLockingBuilder setNoEditPoints(BooleanModel noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeArrowheads(BooleanModel noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public ConnectorLockingBuilder setNoSelect(BooleanModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public ConnectorLockingBuilder setNoGrp(BooleanModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public ConnectorLockingBuilder setNoMove(BooleanModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public ConnectorLockingBuilder setNoRot(BooleanModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeShapeType(BooleanModel noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public ConnectorLockingBuilder setNoAdjustHandles(BooleanModel noAdjustHandles) {
    this.noAdjustHandles = noAdjustHandles;
    return this;
  }

  public ConnectorLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ConnectorLockingModel build() {
    return new ConnectorLockingModel(this.noResize, this.noChangeAspect, this.noEditPoints, this.noChangeArrowheads, this.noSelect, this.noGrp, this.noMove, this.noRot, this.noChangeShapeType, this.noAdjustHandles, this.extLst);
  }

  public ConnectorLockingBuilder from(ConnectorLockingModel value) {
    this.noResize = value.getNoResize();
    this.noChangeAspect = value.getNoChangeAspect();
    this.noEditPoints = value.getNoEditPoints();
    this.noChangeArrowheads = value.getNoChangeArrowheads();
    this.noSelect = value.getNoSelect();
    this.noGrp = value.getNoGrp();
    this.noMove = value.getNoMove();
    this.noRot = value.getNoRot();
    this.noChangeShapeType = value.getNoChangeShapeType();
    this.noAdjustHandles = value.getNoAdjustHandles();
    this.extLst = value.getExtLst();
    return this;
  }
}
