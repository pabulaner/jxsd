package com.scell.builder.officeDocument.relationships;

import com.scell.model.officeDocument.relationships.RelationshipIdModel;

public class RelationshipIdBuilder {
  private String value;

  public RelationshipIdBuilder() {
  }

  public RelationshipIdBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public RelationshipIdBuilder from(RelationshipIdModel value) {
    this.value = value.getValue();
    return this;
  }

  public RelationshipIdModel build() {
    return new RelationshipIdModel(this.value);
  }
}
