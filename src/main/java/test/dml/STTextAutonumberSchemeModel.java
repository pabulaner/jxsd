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
import test.dml.STTextAutonumberSchemeModel.*;
import test.officeDocument.relationships.*;

public enum STTextAutonumberSchemeModel {
	
	ALPHA_LC_PAREN_BOTH,
	ALPHA_UC_PAREN_BOTH,
	ALPHA_LC_PAREN_R,
	ALPHA_UC_PAREN_R,
	ALPHA_LC_PERIOD,
	ALPHA_UC_PERIOD,
	ARABIC_PAREN_BOTH,
	ARABIC_PAREN_R,
	ARABIC_PERIOD,
	ARABIC_PLAIN,
	ROMAN_LC_PAREN_BOTH,
	ROMAN_UC_PAREN_BOTH,
	ROMAN_LC_PAREN_R,
	ROMAN_UC_PAREN_R,
	ROMAN_LC_PERIOD,
	ROMAN_UC_PERIOD,
	CIRCLE_NUM_DB_PLAIN,
	CIRCLE_NUM_WD_BLACK_PLAIN,
	CIRCLE_NUM_WD_WHITE_PLAIN,
	ARABIC_DB_PERIOD,
	ARABIC_DB_PLAIN,
	EA1_CHS_PERIOD,
	EA1_CHS_PLAIN,
	EA1_CHT_PERIOD,
	EA1_CHT_PLAIN,
	EA1_JPN_CHS_DB_PERIOD,
	EA1_JPN_KOR_PLAIN,
	EA1_JPN_KOR_PERIOD,
	ARABIC1_MINUS,
	ARABIC2_MINUS,
	HEBREW2_MINUS,
	THAI_ALPHA_PERIOD,
	THAI_ALPHA_PAREN_R,
	THAI_ALPHA_PAREN_BOTH,
	THAI_NUM_PERIOD,
	THAI_NUM_PAREN_R,
	THAI_NUM_PAREN_BOTH,
	HINDI_ALPHA_PERIOD,
	HINDI_NUM_PERIOD,
	HINDI_NUM_PAREN_R,
	HINDI_ALPHA1_PERIOD,
}
