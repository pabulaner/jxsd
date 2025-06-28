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
import test.drawingml.main.CTColorSchemeModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTColorSchemeConverter
{
	
	private CTColorSchemeConverter() {
		// empty
	}
	
	public static CTColorSchemeModel fromDocx4j(CTColorScheme value)
	{
		return new CTColorSchemeModel(
		StringConverter.fromDocx4j(value.getName())
		,
		CTColorConverter.fromDocx4j(value.getDk1())
		,
		CTColorConverter.fromDocx4j(value.getLt1())
		,
		CTColorConverter.fromDocx4j(value.getDk2())
		,
		CTColorConverter.fromDocx4j(value.getLt2())
		,
		CTColorConverter.fromDocx4j(value.getAccent1())
		,
		CTColorConverter.fromDocx4j(value.getAccent2())
		,
		CTColorConverter.fromDocx4j(value.getAccent3())
		,
		CTColorConverter.fromDocx4j(value.getAccent4())
		,
		CTColorConverter.fromDocx4j(value.getAccent5())
		,
		CTColorConverter.fromDocx4j(value.getAccent6())
		,
		CTColorConverter.fromDocx4j(value.getHlink())
		,
		CTColorConverter.fromDocx4j(value.getFolHlink())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
