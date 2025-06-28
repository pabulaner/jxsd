package test.drawingml.chartDrawing;

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
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.CTMarkerModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTMarkerConverter
{
	
	private CTMarkerConverter() {
		// empty
	}
	
	public static CTMarkerModel fromDocx4j(CTMarker value)
	{
		return new CTMarkerModel(
		STMarkerCoordinateConverter.fromDocx4j(value.getX())
		,
		STMarkerCoordinateConverter.fromDocx4j(value.getY())
		
		);
	}
}
