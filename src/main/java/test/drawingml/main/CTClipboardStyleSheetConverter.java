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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.drawingml.main.CTClipboardStyleSheetModel.*;

// SEQUENCE CONVERTER
public class CTClipboardStyleSheetConverter
{
	
	private CTClipboardStyleSheetConverter() {
		// empty
	}
	
	public static CTClipboardStyleSheetModel fromDocx4j(CTClipboardStyleSheet value)
	{
		return new CTClipboardStyleSheetModel(
		CTBaseStylesConverter.fromDocx4j(value.getThemeElements())
		,
		CTColorMappingConverter.fromDocx4j(value.getClrMap())
		
		);
	}
}
