package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.EmbeddedWAVAudioFileModel;

/**
 * This is a generated sequence class.
 */
public class EmbeddedWAVAudioFileBuilder {
  private String embed;

  private boolean builtIn;

  private String name;

  public EmbeddedWAVAudioFileBuilder() {
  }

  public EmbeddedWAVAudioFileBuilder setEmbed(String embed) {
    this.embed = embed;
    return this;
  }

  public EmbeddedWAVAudioFileBuilder setBuiltIn(boolean builtIn) {
    this.builtIn = builtIn;
    return this;
  }

  public EmbeddedWAVAudioFileBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public EmbeddedWAVAudioFileBuilder from(EmbeddedWAVAudioFileModel value) {
    this.embed = value.getEmbed();
    this.builtIn = value.getBuiltIn();
    this.name = value.getName();
    return this;
  }

  public EmbeddedWAVAudioFileModel build() {
    return new EmbeddedWAVAudioFileModel(this.embed, this.builtIn, this.name);
  }
}
