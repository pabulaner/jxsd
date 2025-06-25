package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.dml.CTPoint2DModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPoint2DConverter
{
	
	private CTPoint2DConverter() {
		// empty
	}
	
	public static CTPoint2DModel fromDocx4j(CTPoint2D value)
	{
		return new CTPoint2DModel(
		STCoordinateConverter.fromDocx4j(value.getY())
		,
		STCoordinateConverter.fromDocx4j(value.getX())
		
		);
	}
}
