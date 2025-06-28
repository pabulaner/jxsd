package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.STPresetLineDashValModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STPresetLineDashValModel {
	
	SOLID,
	DOT,
	DASH,
	LG_DASH,
	DASH_DOT,
	LG_DASH_DOT,
	LG_DASH_DOT_DOT,
	SYS_DASH,
	SYS_DOT,
	SYS_DASH_DOT,
	SYS_DASH_DOT_DOT,
}
