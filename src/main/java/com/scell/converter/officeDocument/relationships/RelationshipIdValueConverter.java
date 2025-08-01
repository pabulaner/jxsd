package com.scell.converter.officeDocument.relationships;

import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class RelationshipIdValueConverter {
  private RelationshipIdValueConverter() {
  }

  public static RelationshipIdValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new RelationshipIdValueModel(value);
  }
}
