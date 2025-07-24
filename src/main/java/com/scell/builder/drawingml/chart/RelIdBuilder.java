package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RelIdModel;
import com.scell.model.officeDocument.relationships.RelationshipIdModel;

public class RelIdBuilder {
  private RelationshipIdModel id;

  public RelIdBuilder() {
  }

  public RelIdBuilder setId(RelationshipIdModel id) {
    this.id = id;
    return this;
  }

  public RelIdModel build() {
    return new RelIdModel(this.id);
  }

  public RelIdBuilder from(RelIdModel value) {
    this.id = value.getId();
    return this;
  }
}
