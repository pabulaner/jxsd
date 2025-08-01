package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ExternalDataModel;
import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class ExternalDataBuilder {
  private RelationshipIdValueModel id;

  private BooleanModel autoUpdate;

  public ExternalDataBuilder() {
  }

  public ExternalDataBuilder setId(RelationshipIdValueModel id) {
    this.id = id;
    return this;
  }

  public ExternalDataBuilder setAutoUpdate(BooleanModel autoUpdate) {
    this.autoUpdate = autoUpdate;
    return this;
  }

  public ExternalDataModel build() {
    return new ExternalDataModel(this.id, this.autoUpdate);
  }

  public ExternalDataBuilder from(ExternalDataModel value) {
    this.id = value.getId();
    this.autoUpdate = value.getAutoUpdate();
    return this;
  }
}
