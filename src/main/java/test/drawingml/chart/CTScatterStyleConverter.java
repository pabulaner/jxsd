package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.chart.CTScatterStyleModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTScatterStyleConverter
{
	
	private CTScatterStyleConverter() {
		// empty
	}
	
	public static CTScatterStyleModel fromDocx4j(CTScatterStyle value)
	{
		return new CTScatterStyleModel(
		STScatterStyleConverter.fromDocx4j(value.getVal())
		
		);
	}
}
