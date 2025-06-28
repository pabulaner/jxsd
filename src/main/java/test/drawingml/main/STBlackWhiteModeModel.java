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
import test.drawingml.main.STBlackWhiteModeModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STBlackWhiteModeModel {
	
	CLR,
	AUTO,
	GRAY,
	LT_GRAY,
	INV_GRAY,
	GRAY_WHITE,
	BLACK_GRAY,
	BLACK_WHITE,
	BLACK,
	WHITE,
	HIDDEN,
}
