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
import test.drawingml.main.CTAdjPoint2DModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTAdjPoint2DConverter
{
	
	private CTAdjPoint2DConverter() {
		// empty
	}
	
	public static CTAdjPoint2DModel fromDocx4j(CTAdjPoint2D value)
	{
		return new CTAdjPoint2DModel(
		STAdjCoordinateConverter.fromDocx4j(value.getY())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getX())
		
		);
	}
}
