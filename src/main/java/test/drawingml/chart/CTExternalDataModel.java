package test.drawingml.chart;

import test.officeDocument.relationships.STRelationshipIdModel;

public class CTExternalDataModel {
  private final STRelationshipIdModel id;

  private final CTBooleanModel autoUpdate;

  public CTExternalDataModel(STRelationshipIdModel id, CTBooleanModel autoUpdate) {
    this.id = id;
    this.autoUpdate = autoUpdate;
  }

  public STRelationshipIdModel getId() {
    return this.id;
  }

  public CTBooleanModel getAutoUpdate() {
    return this.autoUpdate;
  }
}
