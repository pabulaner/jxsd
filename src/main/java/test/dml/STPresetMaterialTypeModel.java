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
import test.dml.STPresetMaterialTypeModel.*;
import test.officeDocument.relationships.*;

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
