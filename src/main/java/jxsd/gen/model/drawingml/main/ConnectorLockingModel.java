package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ConnectorLockingBuilder;

/**
 * This is a generated sequence class.
 */
public class ConnectorLockingModel {
  private final boolean noResize;

  private final boolean noChangeAspect;

  private final boolean noEditPoints;

  private final boolean noChangeArrowheads;

  private final boolean noSelect;

  private final boolean noGrp;

  private final boolean noMove;

  private final boolean noRot;

  private final boolean noChangeShapeType;

  private final boolean noAdjustHandles;

  private final OfficeArtExtensionListModel extLst;

  public ConnectorLockingModel(boolean noResize, boolean noChangeAspect, boolean noEditPoints,
      boolean noChangeArrowheads, boolean noSelect, boolean noGrp, boolean noMove, boolean noRot,
      boolean noChangeShapeType, boolean noAdjustHandles, OfficeArtExtensionListModel extLst) {
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noEditPoints = noEditPoints;
    this.noChangeArrowheads = noChangeArrowheads;
    this.noSelect = noSelect;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.noRot = noRot;
    this.noChangeShapeType = noChangeShapeType;
    this.noAdjustHandles = noAdjustHandles;
    this.extLst = extLst;
  }

  public ConnectorLockingBuilder builder() {
    return new ConnectorLockingBuilder().from(this);
  }

  public boolean getNoResize() {
    return this.noResize;
  }

  public boolean getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public boolean getNoEditPoints() {
    return this.noEditPoints;
  }

  public boolean getNoChangeArrowheads() {
    return this.noChangeArrowheads;
  }

  public boolean getNoSelect() {
    return this.noSelect;
  }

  public boolean getNoGrp() {
    return this.noGrp;
  }

  public boolean getNoMove() {
    return this.noMove;
  }

  public boolean getNoRot() {
    return this.noRot;
  }

  public boolean getNoChangeShapeType() {
    return this.noChangeShapeType;
  }

  public boolean getNoAdjustHandles() {
    return this.noAdjustHandles;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
