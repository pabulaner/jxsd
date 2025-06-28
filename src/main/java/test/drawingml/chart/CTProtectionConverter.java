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
import test.drawingml.chart.CTProtectionModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTProtectionConverter
{
	
	private CTProtectionConverter() {
		// empty
	}
	
	public static CTProtectionModel fromDocx4j(CTProtection value)
	{
		return new CTProtectionModel(
		CTBooleanConverter.fromDocx4j(value.getChartObject())
		,
		CTBooleanConverter.fromDocx4j(value.getData())
		,
		CTBooleanConverter.fromDocx4j(value.getFormatting())
		,
		CTBooleanConverter.fromDocx4j(value.getSelection())
		,
		CTBooleanConverter.fromDocx4j(value.getUserInterface())
		
		);
	}
}
