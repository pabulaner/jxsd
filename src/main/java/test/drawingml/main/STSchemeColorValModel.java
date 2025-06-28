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
import test.drawingml.main.STSchemeColorValModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STSchemeColorValModel {
	
	BG1,
	TX1,
	BG2,
	TX2,
	ACCENT1,
	ACCENT2,
	ACCENT3,
	ACCENT4,
	ACCENT5,
	ACCENT6,
	HLINK,
	FOL_HLINK,
	PH_CLR,
	DK1,
	LT1,
	DK2,
	LT2,
}
