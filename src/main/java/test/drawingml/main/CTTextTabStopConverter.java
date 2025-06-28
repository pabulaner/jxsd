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
import test.drawingml.main.CTTextTabStopModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTextTabStopConverter
{
	
	private CTTextTabStopConverter() {
		// empty
	}
	
	public static CTTextTabStopModel fromDocx4j(CTTextTabStop value)
	{
		return new CTTextTabStopModel(
		STCoordinate32Converter.fromDocx4j(value.getPos())
		,
		STTextTabAlignTypeConverter.fromDocx4j(value.getAlgn())
		
		);
	}
}
