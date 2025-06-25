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
import test.XMLSchema.*;
import test.dml.*;
import test.dml.CTAdjPoint2DModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
