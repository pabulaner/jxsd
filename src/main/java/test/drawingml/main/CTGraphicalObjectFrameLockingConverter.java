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
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.main.CTGraphicalObjectFrameLockingModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTGraphicalObjectFrameLockingConverter
{
	
	private CTGraphicalObjectFrameLockingConverter() {
		// empty
	}
	
	public static CTGraphicalObjectFrameLockingModel fromDocx4j(CTGraphicalObjectFrameLocking value)
	{
		return new CTGraphicalObjectFrameLockingModel(
		BooleanConverter.fromDocx4j(value.getNoDrilldown())
		,
		BooleanConverter.fromDocx4j(value.getNoResize())
		,
		BooleanConverter.fromDocx4j(value.getNoChangeAspect())
		,
		BooleanConverter.fromDocx4j(value.getNoSelect())
		,
		BooleanConverter.fromDocx4j(value.getNoGrp())
		,
		BooleanConverter.fromDocx4j(value.getNoMove())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
