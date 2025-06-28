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
import test.drawingml.main.STTextUnderlineTypeModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STTextUnderlineTypeModel {
	
	NONE,
	WORDS,
	SNG,
	DBL,
	HEAVY,
	DOTTED,
	DOTTED_HEAVY,
	DASH,
	DASH_HEAVY,
	DASH_LONG,
	DASH_LONG_HEAVY,
	DOT_DASH,
	DOT_DASH_HEAVY,
	DOT_DOT_DASH,
	DOT_DOT_DASH_HEAVY,
	WAVY,
	WAVY_HEAVY,
	WAVY_DBL,
}
