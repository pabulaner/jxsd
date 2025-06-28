package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTTextFontModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTTextFontModel.PanoseModel.*;
import test.officeDocument.relationships.*;
import test.drawingml.main.CTTextFontModel.TypefaceModel.*;

// SEQUENCE CONVERTER
public class CTTextFontConverter
{
	
	// RESTRICTION CONVERTER
	public static class TypefaceConverter
	{
		
		private TypefaceConverter() {
			// empty
		}
		
		public static TypefaceModel fromDocx4j(String value) {
			return new TypefaceModel(value);
		}
	}
	// RESTRICTION CONVERTER
	public static class PanoseConverter
	{
		
		private PanoseConverter() {
			// empty
		}
		
		public static PanoseModel fromDocx4j(String value) {
			return new PanoseModel(value);
		}
	}
	private CTTextFontConverter() {
		// empty
	}
	
	public static CTTextFontModel fromDocx4j(CTTextFont value)
	{
		return new CTTextFontModel(
		ByteConverter.fromDocx4j(value.getCharset())
		,
		TypefaceConverter.fromDocx4j(value.getTypeface())
		,
		PanoseConverter.fromDocx4j(value.getPanose())
		,
		ByteConverter.fromDocx4j(value.getPitchFamily())
		
		);
	}
}
