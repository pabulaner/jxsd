package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.CTTextFontModel.*;
import test.dml.CTTextFontModel.PanoseModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTTextFontModel.TypefaceModel.*;
import test.officeDocument.relationships.*;

public class CTTextFontModel
{
	
	public static class TypefaceModel
	extends StringModel {
		
		public TypefaceModel(String value) {
			super(value);
		}
	}
	public static class PanoseModel
	extends StringModel {
		
		public PanoseModel(String value) {
			super(value);
		}
	}
	private final ByteModel charset;
	private final TypefaceModel typeface;
	private final PanoseModel panose;
	private final ByteModel pitchFamily;
	
	public CTTextFontModel(ByteModel charset, TypefaceModel typeface, PanoseModel panose, ByteModel pitchFamily) {
		this.charset = charset;
		this.typeface = typeface;
		this.panose = panose;
		this.pitchFamily = pitchFamily;
	}
	
	public ByteModel getCharset() {
		return this.charset;
	}
	public TypefaceModel getTypeface() {
		return this.typeface;
	}
	public PanoseModel getPanose() {
		return this.panose;
	}
	public ByteModel getPitchFamily() {
		return this.pitchFamily;
	}
}
