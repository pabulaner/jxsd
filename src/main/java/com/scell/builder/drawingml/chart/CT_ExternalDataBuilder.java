package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ExternalDataModel;
import com.scell.model.officeDocument.relationships.ST_RelationshipIdModel;

public class CT_ExternalDataBuilder {
  private ST_RelationshipIdModel id;

  private CT_BooleanModel autoUpdate;

  public CT_ExternalDataBuilder() {
  }

  public CT_ExternalDataBuilder setId(ST_RelationshipIdModel id) {
    this.id = id;
    return this;
  }

  public CT_ExternalDataBuilder setAutoUpdate(CT_BooleanModel autoUpdate) {
    this.autoUpdate = autoUpdate;
    return this;
  }

  public CT_ExternalDataModel build() {
    return new CT_ExternalDataModel(this.id, this.autoUpdate);
  }

  public CT_ExternalDataBuilder from(CT_ExternalDataModel value) {
    this.id = value.getId();
    this.autoUpdate = value.getAutoUpdate();
    return this;
  }
}
