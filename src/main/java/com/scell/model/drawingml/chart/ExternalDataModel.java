package com.scell.model.drawingml.chart;

import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class ExternalDataModel {
  private final RelationshipIdValueModel id;

  private final BooleanModel autoUpdate;

  public ExternalDataModel(RelationshipIdValueModel id, BooleanModel autoUpdate) {
    this.id = id;
    this.autoUpdate = autoUpdate;
  }

  public RelationshipIdValueModel getId() {
    return this.id;
  }

  public BooleanModel getAutoUpdate() {
    return this.autoUpdate;
  }
}
