package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Path2DCloseModel;
import org.docx4j.dml.CTPath2DClose;

/**
 * This is a generated sequence class.
 */
public class Path2DCloseConverter {
  private Path2DCloseConverter() {
  }

  public static Path2DCloseModel fromDocx4j(CTPath2DClose value) {
    if (value == null) return null;
    return new Path2DCloseModel();
  }

  public static CTPath2DClose toDocx4j(Path2DCloseModel value) {
    if (value == null) return null;
    CTPath2DClose result = new CTPath2DClose();
    return result;
  }
}
