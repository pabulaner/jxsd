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
import test.dml.CTPictureLockingModel.*;
import test.officeDocument.relationships.*;

public class CTPictureLockingConverter
{
	
	private CTPictureLockingConverter() {
		// empty
	}
	
	public static CTPictureLockingModel fromDocx4j(CTPictureLocking value)
	{
		return new CTPictureLockingModel(
		BooleanConverter.fromDocx4j(value.getNoResize())
		,
		BooleanConverter.fromDocx4j(value.getNoChangeAspect())
		,
		BooleanConverter.fromDocx4j(value.getNoEditPoints())
		,
		BooleanConverter.fromDocx4j(value.getNoChangeArrowheads())
		,
		BooleanConverter.fromDocx4j(value.getNoCrop())
		,
		BooleanConverter.fromDocx4j(value.getNoSelect())
		,
		BooleanConverter.fromDocx4j(value.getNoGrp())
		,
		BooleanConverter.fromDocx4j(value.getNoMove())
		,
		BooleanConverter.fromDocx4j(value.getNoRot())
		,
		BooleanConverter.fromDocx4j(value.getNoChangeShapeType())
		,
		BooleanConverter.fromDocx4j(value.getNoAdjustHandles())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
