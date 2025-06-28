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
import test.drawingml.main.CTGroupLockingModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTGroupLockingConverter
{
	
	private CTGroupLockingConverter() {
		// empty
	}
	
	public static CTGroupLockingModel fromDocx4j(CTGroupLocking value)
	{
		return new CTGroupLockingModel(
		BooleanConverter.fromDocx4j(value.getNoResize())
		,
		BooleanConverter.fromDocx4j(value.getNoChangeAspect())
		,
		BooleanConverter.fromDocx4j(value.getNoSelect())
		,
		BooleanConverter.fromDocx4j(value.getNoUngrp())
		,
		BooleanConverter.fromDocx4j(value.getNoGrp())
		,
		BooleanConverter.fromDocx4j(value.getNoMove())
		,
		BooleanConverter.fromDocx4j(value.getNoRot())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
