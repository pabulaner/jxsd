package com.scell.builder.officeDocument.relationships;

import com.scell.model.officeDocument.relationships.ST_RelationshipIdModel;

public class ST_RelationshipIdBuilder {
  private String value;

  public ST_RelationshipIdBuilder() {
    this.value = null;
  }

  public ST_RelationshipIdBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ST_RelationshipIdBuilder from(ST_RelationshipIdModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_RelationshipIdModel build() {
    return new ST_RelationshipIdModel(this.value);
  }
}
