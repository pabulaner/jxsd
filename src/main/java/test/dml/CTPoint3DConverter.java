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
import test.dml.CTPoint3DModel.*;
import test.officeDocument.relationships.*;

public class CTPoint3DConverter
{
	
	private CTPoint3DConverter() {
		// empty
	}
	
	public static CTPoint3DModel fromDocx4j(CTPoint3D value)
	{
		return new CTPoint3DModel(
		STCoordinateConverter.fromDocx4j(value.getY())
		,
		STCoordinateConverter.fromDocx4j(value.getX())
		,
		STCoordinateConverter.fromDocx4j(value.getZ())
		
		);
	}
}
