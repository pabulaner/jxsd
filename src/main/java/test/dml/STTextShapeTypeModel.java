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
import test.dml.STTextShapeTypeModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public enum STTextShapeTypeModel {
	
	TEXT_NO_SHAPE,
	TEXT_PLAIN,
	TEXT_STOP,
	TEXT_TRIANGLE,
	TEXT_TRIANGLE_INVERTED,
	TEXT_CHEVRON,
	TEXT_CHEVRON_INVERTED,
	TEXT_RING_INSIDE,
	TEXT_RING_OUTSIDE,
	TEXT_ARCH_UP,
	TEXT_ARCH_DOWN,
	TEXT_CIRCLE,
	TEXT_BUTTON,
	TEXT_ARCH_UP_POUR,
	TEXT_ARCH_DOWN_POUR,
	TEXT_CIRCLE_POUR,
	TEXT_BUTTON_POUR,
	TEXT_CURVE_UP,
	TEXT_CURVE_DOWN,
	TEXT_CAN_UP,
	TEXT_CAN_DOWN,
	TEXT_WAVE1,
	TEXT_WAVE2,
	TEXT_DOUBLE_WAVE1,
	TEXT_WAVE4,
	TEXT_INFLATE,
	TEXT_DEFLATE,
	TEXT_INFLATE_BOTTOM,
	TEXT_DEFLATE_BOTTOM,
	TEXT_INFLATE_TOP,
	TEXT_DEFLATE_TOP,
	TEXT_DEFLATE_INFLATE,
	TEXT_DEFLATE_INFLATE_DEFLATE,
	TEXT_FADE_RIGHT,
	TEXT_FADE_LEFT,
	TEXT_FADE_UP,
	TEXT_FADE_DOWN,
	TEXT_SLANT_UP,
	TEXT_SLANT_DOWN,
	TEXT_CASCADE_UP,
	TEXT_CASCADE_DOWN,
}
