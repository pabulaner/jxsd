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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.chart.CTHPercentModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTHPercentConverter
{
	
	private CTHPercentConverter() {
		// empty
	}
	
	public static CTHPercentModel fromDocx4j(CTHPercent value)
	{
		return new CTHPercentModel(
		STHPercentConverter.fromDocx4j(value.getVal())
		
		);
	}
}
