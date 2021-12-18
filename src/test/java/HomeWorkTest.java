import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HomeWorkTest {

    @ParameterizedTest
    @DisplayName("Проверка определения высокосного года")
    @MethodSource("generatorLeapYear")
    public void checkIsLeapYearTest(int year) {
        assertTrue(HomeWork.checkIsLeapYear(year));
    }

    @ParameterizedTest
    @DisplayName("Проверка определения НЕвысокосного года")
    @MethodSource("generatorNonLeapYear")
    public void checkNonLeapYearTest(int year) {
        assertFalse(HomeWork.checkIsLeapYear(year));
    }

    public static Stream<Arguments> generatorNonLeapYear() {
        return Stream.of(
                Arguments.of(2001),
                Arguments.of(2002),
                Arguments.of(2003),
                Arguments.of(2005),
                Arguments.of(2006),
                Arguments.of(2007),
                Arguments.of(2009),
                Arguments.of(2010),
                Arguments.of(2011),
                Arguments.of(2013),
                Arguments.of(2014),
                Arguments.of(2015),
                Arguments.of(2017),
                Arguments.of(2018),
                Arguments.of(2019),
                Arguments.of(2021)
        );
    }

    public static Stream<Arguments> generatorLeapYear() {
        return Stream.of(
                Arguments.of(1600),
                Arguments.of(1880),
                Arguments.of(1884),
                Arguments.of(1888),
                Arguments.of(1892),
                Arguments.of(1896),
                Arguments.of(1904),
                Arguments.of(1908),
                Arguments.of(1912),
                Arguments.of(1916),
                Arguments.of(1920),
                Arguments.of(1924),
                Arguments.of(1928),
                Arguments.of(1932),
                Arguments.of(1936),
                Arguments.of(1940),
                Arguments.of(1944),
                Arguments.of(1948),
                Arguments.of(1952),
                Arguments.of(1956),
                Arguments.of(1960),
                Arguments.of(1964),
                Arguments.of(1968),
                Arguments.of(1972),
                Arguments.of(1976),
                Arguments.of(1980),
                Arguments.of(1984),
                Arguments.of(1988),
                Arguments.of(1992),
                Arguments.of(1996),
                Arguments.of(2000),
                Arguments.of(2004),
                Arguments.of(2008),
                Arguments.of(2012),
                Arguments.of(2016),
                Arguments.of(2020),
                Arguments.of(2028),
                Arguments.of(2032),
                Arguments.of(2036),
                Arguments.of(2040),
                Arguments.of(2044),
                Arguments.of(2048),
                Arguments.of(2052),
                Arguments.of(2056),
                Arguments.of(2060),
                Arguments.of(2064),
                Arguments.of(2068),
                Arguments.of(2072)
        );
    }

}