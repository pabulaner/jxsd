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
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTPath2DArcToModel.*;
import test.officeDocument.relationships.*;

public class CTPath2DArcToConverter
{
	
	private CTPath2DArcToConverter() {
		// empty
	}
	
	public static CTPath2DArcToModel fromDocx4j(CTPath2DArcTo value)
	{
		return new CTPath2DArcToModel(
		STAdjAngleConverter.fromDocx4j(value.getStAng())
		,
		STAdjAngleConverter.fromDocx4j(value.getSwAng())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getWR())
		,
		STAdjCoordinateConverter.fromDocx4j(value.getHR())
		
		);
	}
}
