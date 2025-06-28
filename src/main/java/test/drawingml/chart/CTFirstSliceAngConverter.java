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
import test.drawingml.chart.CTFirstSliceAngModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTFirstSliceAngConverter
{
	
	private CTFirstSliceAngConverter() {
		// empty
	}
	
	public static CTFirstSliceAngModel fromDocx4j(CTFirstSliceAng value)
	{
		return new CTFirstSliceAngModel(
		STFirstSliceAngConverter.fromDocx4j(value.getVal())
		
		);
	}
}
