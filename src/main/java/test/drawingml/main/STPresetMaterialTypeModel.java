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
import test.drawingml.chartDrawing.*;
import test.drawingml.main.STPresetMaterialTypeModel.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STPresetMaterialTypeModel {
	
	LEGACY_MATTE,
	LEGACY_PLASTIC,
	LEGACY_METAL,
	LEGACY_WIREFRAME,
	MATTE,
	PLASTIC,
	METAL,
	WARM_MATTE,
	TRANSLUCENT_POWDER,
	POWDER,
	DK_EDGE,
	SOFT_EDGE,
	CLEAR,
	FLAT,
	SOFTMETAL,
}
