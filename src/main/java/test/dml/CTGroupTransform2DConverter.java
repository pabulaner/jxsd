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
import test.officeDocument.relationships.*;
import test.dml.CTGroupTransform2DModel.*;

public class CTGroupTransform2DConverter
{
	
	private CTGroupTransform2DConverter() {
		// empty
	}
	
	public static CTGroupTransform2DModel fromDocx4j(CTGroupTransform2D value)
	{
		return new CTGroupTransform2DModel(
		BooleanConverter.fromDocx4j(value.getFlipV())
		,
		STAngleConverter.fromDocx4j(value.getRot())
		,
		BooleanConverter.fromDocx4j(value.getFlipH())
		,
		CTPoint2DConverter.fromDocx4j(value.getOff())
		,
		CTPositiveSize2DConverter.fromDocx4j(value.getExt())
		,
		CTPoint2DConverter.fromDocx4j(value.getChOff())
		,
		CTPositiveSize2DConverter.fromDocx4j(value.getChExt())
		
		);
	}
}
