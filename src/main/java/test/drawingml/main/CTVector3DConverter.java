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
import test.drawingml.main.CTVector3DModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTVector3DConverter
{
	
	private CTVector3DConverter() {
		// empty
	}
	
	public static CTVector3DModel fromDocx4j(CTVector3D value)
	{
		return new CTVector3DModel(
		STCoordinateConverter.fromDocx4j(value.getDz())
		,
		STCoordinateConverter.fromDocx4j(value.getDy())
		,
		STCoordinateConverter.fromDocx4j(value.getDx())
		
		);
	}
}
