package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.STLightRigTypeModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STLightRigTypeModel {
	
	LEGACY_FLAT1,
	LEGACY_FLAT2,
	LEGACY_FLAT3,
	LEGACY_FLAT4,
	LEGACY_NORMAL1,
	LEGACY_NORMAL2,
	LEGACY_NORMAL3,
	LEGACY_NORMAL4,
	LEGACY_HARSH1,
	LEGACY_HARSH2,
	LEGACY_HARSH3,
	LEGACY_HARSH4,
	THREE_PT,
	BALANCED,
	SOFT,
	HARSH,
	FLOOD,
	CONTRASTING,
	MORNING,
	SUNRISE,
	SUNSET,
	CHILLY,
	FREEZING,
	FLAT,
	TWO_PT,
	GLOW,
	BRIGHT_ROOM,
}
