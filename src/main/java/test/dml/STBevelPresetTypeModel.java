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
import test.dml.STBevelPresetTypeModel.*;
import test.officeDocument.relationships.*;

public enum STBevelPresetTypeModel {
	
	RELAXED_INSET,
	CIRCLE,
	SLOPE,
	CROSS,
	ANGLE,
	SOFT_ROUND,
	CONVEX,
	COOL_SLANT,
	DIVOT,
	RIBLET,
	HARD_EDGE,
	ART_DECO,
}
