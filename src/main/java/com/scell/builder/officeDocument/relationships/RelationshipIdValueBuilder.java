package com.scell.builder.officeDocument.relationships;

import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class RelationshipIdValueBuilder {
  private String value;

  public RelationshipIdValueBuilder() {
  }

  public RelationshipIdValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public RelationshipIdValueBuilder from(RelationshipIdValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public RelationshipIdValueModel build() {
    return new RelationshipIdValueModel(this.value);
  }
}
