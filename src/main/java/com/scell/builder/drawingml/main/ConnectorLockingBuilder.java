package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.ConnectorLockingModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class ConnectorLockingBuilder {
  private BooleanValueModel noResize;

  private BooleanValueModel noChangeAspect;

  private BooleanValueModel noEditPoints;

  private BooleanValueModel noChangeArrowheads;

  private BooleanValueModel noSelect;

  private BooleanValueModel noGrp;

  private BooleanValueModel noMove;

  private BooleanValueModel noRot;

  private BooleanValueModel noChangeShapeType;

  private BooleanValueModel noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public ConnectorLockingBuilder() {
  }

  public ConnectorLockingBuilder setNoResize(BooleanValueModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeAspect(BooleanValueModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public ConnectorLockingBuilder setNoEditPoints(BooleanValueModel noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeArrowheads(BooleanValueModel noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public ConnectorLockingBuilder setNoSelect(BooleanValueModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public ConnectorLockingBuilder setNoGrp(BooleanValueModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public ConnectorLockingBuilder setNoMove(BooleanValueModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public ConnectorLockingBuilder setNoRot(BooleanValueModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeShapeType(BooleanValueModel noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public ConnectorLockingBuilder setNoAdjustHandles(BooleanValueModel noAdjustHandles) {
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
