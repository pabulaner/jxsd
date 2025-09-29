package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.EmbeddedWAVAudioFileBuilder;

/**
 * This is a generated sequence class.
 */
public class EmbeddedWAVAudioFileModel {
  private final String embed;

  private final boolean builtIn;

  private final String name;

  public EmbeddedWAVAudioFileModel(String embed, boolean builtIn, String name) {
    this.embed = embed;
    this.builtIn = builtIn;
    this.name = name;
  }

  public EmbeddedWAVAudioFileBuilder builder() {
    return new EmbeddedWAVAudioFileBuilder().from(this);
  }

  public String getEmbed() {
    return this.embed;
  }

  public boolean getBuiltIn() {
    return this.builtIn;
  }

  public String getName() {
    return this.name;
  }
}
