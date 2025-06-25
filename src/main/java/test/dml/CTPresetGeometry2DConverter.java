package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTPresetGeometry2DModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPresetGeometry2DConverter
{
	
	private CTPresetGeometry2DConverter() {
		// empty
	}
	
	public static CTPresetGeometry2DModel fromDocx4j(CTPresetGeometry2D value)
	{
		return new CTPresetGeometry2DModel(
		STShapeTypeConverter.fromDocx4j(value.getPrst())
		,
		CTGeomGuideListConverter.fromDocx4j(value.getAvLst())
		
		);
	}
}
