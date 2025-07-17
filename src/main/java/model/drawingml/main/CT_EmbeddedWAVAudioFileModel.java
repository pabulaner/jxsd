package model.drawingml.main;

import model.XMLSchema.booleanModel;
import model.XMLSchema.stringModel;
import model.officeDocument.relationships.ST_RelationshipIdModel;

public class CT_EmbeddedWAVAudioFileModel {
  private final ST_RelationshipIdModel embed;

  private final booleanModel builtIn;

  private final stringModel name;

  public CT_EmbeddedWAVAudioFileModel(ST_RelationshipIdModel embed, booleanModel builtIn,
      stringModel name) {
    this.embed = embed;
    this.builtIn = builtIn;
    this.name = name;
  }

  public ST_RelationshipIdModel getEmbed() {
    return this.embed;
  }

  public booleanModel getBuiltIn() {
    return this.builtIn;
  }

  public stringModel getName() {
    return this.name;
  }
}
