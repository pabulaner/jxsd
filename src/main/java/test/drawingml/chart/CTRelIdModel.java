package test.drawingml.chart;

import test.officeDocument.relationships.STRelationshipIdModel;

public class CTRelIdModel {
  private final STRelationshipIdModel id;

  public CTRelIdModel(STRelationshipIdModel id) {
    this.id = id;
  }

  public STRelationshipIdModel getId() {
    return this.id;
  }
}
