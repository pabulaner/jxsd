package com.scell.converter.officeDocument.relationships;

import com.scell.model.officeDocument.relationships.RelationshipIdModel;

public class RelationshipIdConverter {
  private RelationshipIdConverter() {
  }

  public static RelationshipIdModel fromDocx4J(String value) {
    if (value == null) return null;
    return new RelationshipIdModel(value);
  }
}
