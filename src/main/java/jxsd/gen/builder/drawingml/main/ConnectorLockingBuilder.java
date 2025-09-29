package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ConnectorLockingModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class ConnectorLockingBuilder {
  private boolean noResize;

  private boolean noChangeAspect;

  private boolean noEditPoints;

  private boolean noChangeArrowheads;

  private boolean noSelect;

  private boolean noGrp;

  private boolean noMove;

  private boolean noRot;

  private boolean noChangeShapeType;

  private boolean noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public ConnectorLockingBuilder() {
  }

  public ConnectorLockingBuilder setNoResize(boolean noResize) {
    this.noResize = noResize;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeAspect(boolean noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public ConnectorLockingBuilder setNoEditPoints(boolean noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeArrowheads(boolean noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public ConnectorLockingBuilder setNoSelect(boolean noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public ConnectorLockingBuilder setNoGrp(boolean noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public ConnectorLockingBuilder setNoMove(boolean noMove) {
    this.noMove = noMove;
    return this;
  }

  public ConnectorLockingBuilder setNoRot(boolean noRot) {
    this.noRot = noRot;
    return this;
  }

  public ConnectorLockingBuilder setNoChangeShapeType(boolean noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public ConnectorLockingBuilder setNoAdjustHandles(boolean noAdjustHandles) {
    this.noAdjustHandles = noAdjustHandles;
    return this;
  }

  public ConnectorLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
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

  public ConnectorLockingModel build() {
    return new ConnectorLockingModel(this.noResize, this.noChangeAspect, this.noEditPoints, this.noChangeArrowheads, this.noSelect, this.noGrp, this.noMove, this.noRot, this.noChangeShapeType, this.noAdjustHandles, this.extLst);
  }
}
