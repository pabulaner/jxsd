package com.scell.model.drawingml.chart;

import com.scell.model.officeDocument.relationships.RelationshipIdModel;

public class ExternalDataModel {
  private final RelationshipIdModel id;

  private final BooleanModel autoUpdate;

  public ExternalDataModel(RelationshipIdModel id, BooleanModel autoUpdate) {
    this.id = id;
    this.autoUpdate = autoUpdate;
  }

  public RelationshipIdModel getId() {
    return this.id;
  }

  public BooleanModel getAutoUpdate() {
    return this.autoUpdate;
  }
}
