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
import test.drawingml.main.STSystemColorValModel.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STSystemColorValModel {
	
	SCROLL_BAR,
	BACKGROUND,
	ACTIVE_CAPTION,
	INACTIVE_CAPTION,
	MENU,
	WINDOW,
	WINDOW_FRAME,
	MENU_TEXT,
	WINDOW_TEXT,
	CAPTION_TEXT,
	ACTIVE_BORDER,
	INACTIVE_BORDER,
	APP_WORKSPACE,
	HIGHLIGHT,
	HIGHLIGHT_TEXT,
	BTN_FACE,
	BTN_SHADOW,
	GRAY_TEXT,
	BTN_TEXT,
	INACTIVE_CAPTION_TEXT,
	BTN_HIGHLIGHT,
	_3D_DK_SHADOW,
	_3D_LIGHT,
	INFO_TEXT,
	INFO_BK,
	HOT_LIGHT,
	GRADIENT_ACTIVE_CAPTION,
	GRADIENT_INACTIVE_CAPTION,
	MENU_HIGHLIGHT,
	MENU_BAR,
}
