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
import test.drawingml.chart.CTPageMarginsModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPageMarginsConverter
{
	
	private CTPageMarginsConverter() {
		// empty
	}
	
	public static CTPageMarginsModel fromDocx4j(CTPageMargins value)
	{
		return new CTPageMarginsModel(
		DoubleConverter.fromDocx4j(value.getFooter())
		,
		DoubleConverter.fromDocx4j(value.getL())
		,
		DoubleConverter.fromDocx4j(value.getT())
		,
		DoubleConverter.fromDocx4j(value.getHeader())
		,
		DoubleConverter.fromDocx4j(value.getR())
		,
		DoubleConverter.fromDocx4j(value.getB())
		
		);
	}
}
