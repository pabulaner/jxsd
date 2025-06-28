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
import test.drawingml.main.CTPath2DCubicBezierToModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPath2DCubicBezierToConverter
{
	
	private CTPath2DCubicBezierToConverter() {
		// empty
	}
	
	public static CTPath2DCubicBezierToModel fromDocx4j(CTPath2DCubicBezierTo value)
	{
		return new CTPath2DCubicBezierToModel(
		value.getPt().stream().map(CTAdjPoint2DConverter::fromDocx4j).collect(Collectors.toList())
		
		);
	}
}
