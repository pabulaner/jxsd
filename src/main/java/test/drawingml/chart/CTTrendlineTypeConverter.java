package test.drawingml.chart;

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
import test.drawingml.chart.CTTrendlineTypeModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTrendlineTypeConverter
{
	
	private CTTrendlineTypeConverter() {
		// empty
	}
	
	public static CTTrendlineTypeModel fromDocx4j(CTTrendlineType value)
	{
		return new CTTrendlineTypeModel(
		STTrendlineTypeConverter.fromDocx4j(value.getVal())
		
		);
	}
}
