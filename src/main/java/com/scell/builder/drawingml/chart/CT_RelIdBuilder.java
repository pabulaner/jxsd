package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RelIdModel;
import com.scell.model.officeDocument.relationships.ST_RelationshipIdModel;

public class CT_RelIdBuilder {
  private ST_RelationshipIdModel id;

  public CT_RelIdBuilder() {
  }

  public CT_RelIdBuilder setId(ST_RelationshipIdModel id) {
    this.id = id;
    return this;
  }

  public CT_RelIdModel build() {
    return new CT_RelIdModel(this.id);
  }

  public CT_RelIdBuilder from(CT_RelIdModel value) {
    this.id = value.getId();
    return this;
  }
}
