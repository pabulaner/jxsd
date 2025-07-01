package test.drawingml.main;

import test.XMLSchema.BooleanModel;
import test.XMLSchema.StringModel;
import test.officeDocument.relationships.STRelationshipIdModel;

public class CTEmbeddedWAVAudioFileModel {
  private final STRelationshipIdModel embed;

  private final BooleanModel builtIn;

  private final StringModel name;

  public CTEmbeddedWAVAudioFileModel(STRelationshipIdModel embed, BooleanModel builtIn,
      StringModel name) {
    this.embed = embed;
    this.builtIn = builtIn;
    this.name = name;
  }

  public STRelationshipIdModel getEmbed() {
    return this.embed;
  }

  public BooleanModel getBuiltIn() {
    return this.builtIn;
  }

  public StringModel getName() {
    return this.name;
  }
}
