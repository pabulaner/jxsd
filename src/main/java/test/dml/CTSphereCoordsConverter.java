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
import test.dml.CTSphereCoordsModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTSphereCoordsConverter
{
	
	private CTSphereCoordsConverter() {
		// empty
	}
	
	public static CTSphereCoordsModel fromDocx4j(CTSphereCoords value)
	{
		return new CTSphereCoordsModel(
		STPositiveFixedAngleConverter.fromDocx4j(value.getLat())
		,
		STPositiveFixedAngleConverter.fromDocx4j(value.getRev())
		,
		STPositiveFixedAngleConverter.fromDocx4j(value.getLon())
		
		);
	}
}
