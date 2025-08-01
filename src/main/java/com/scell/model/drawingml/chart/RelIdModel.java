package com.scell.model.drawingml.chart;

import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class RelIdModel {
  private final RelationshipIdValueModel id;

  public RelIdModel(RelationshipIdValueModel id) {
    this.id = id;
  }

  public RelationshipIdValueModel getId() {
    return this.id;
  }
}
