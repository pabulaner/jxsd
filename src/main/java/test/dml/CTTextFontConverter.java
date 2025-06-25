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

public class CTTextFontConverter
{
	
	public static class TypefaceConverter
	{
		
		private CTTextFontConverter() {
			// empty
		}
		
		public static TypefaceModel fromDocx4j(String value) {
			return new TypefaceModel(value);
		}
	}
	public static class PanoseConverter
	{
		
		private CTTextFontConverter() {
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
