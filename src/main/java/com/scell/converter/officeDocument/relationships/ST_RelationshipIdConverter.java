package com.scell.converter.officeDocument.relationships;

import com.scell.model.officeDocument.relationships.ST_RelationshipIdModel;

public class ST_RelationshipIdConverter {
  private ST_RelationshipIdConverter() {
  }

  public static ST_RelationshipIdModel fromDocx4J(String value) {
    if (value == null) return null;
    return new ST_RelationshipIdModel(value);
  }

  public static String toDocx4J(ST_RelationshipIdModel value) {
    return null;
  }
}
