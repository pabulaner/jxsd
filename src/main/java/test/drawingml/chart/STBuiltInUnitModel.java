package test.drawingml.chart;

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
import test.drawingml.chart.STBuiltInUnitModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STBuiltInUnitModel {
	
	HUNDREDS,
	THOUSANDS,
	TEN_THOUSANDS,
	HUNDRED_THOUSANDS,
	MILLIONS,
	TEN_MILLIONS,
	HUNDRED_MILLIONS,
	BILLIONS,
	TRILLIONS,
}
