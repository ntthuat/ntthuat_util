package org.ntthuat.util;

import org.ntthuat.constant.DatePattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/29 10:23 AM
 * $Log: DateUtil.java
 */
public final class DateUtil
{

  private DateUtil()
  {
  }

  /**
   * Revert java.util.Date to java.time.LocalDate
   *
   * @param inputDate - java.util.Date
   * @return java.time.LocalDate
   */
  public static LocalDate convertDate2LocalDate(java.util.Date inputDate)
  {
    return inputDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
  }

  /**
   * Revert java.sql.Date to java.time.LocalDate
   *
   * @param inputDate - java.sql.Date
   * @return java.time.LocalDate
   */
  public static LocalDate convertDate2LocalDate(java.sql.Date inputDate)
  {
    // TODO
    return null;
  }

  public static java.util.Date convertString2Date(String dateInString, DatePattern pattern)
  {
    SimpleDateFormat formatter = new SimpleDateFormat(pattern.getPattern());
    return getDate(dateInString, formatter);
  }

  public static java.util.Date convertString2Date(String dateInString, String pattern)
  {
    SimpleDateFormat formatter = new SimpleDateFormat(pattern);
    return getDate(dateInString, formatter);
  }

  private static java.util.Date getDate(String dateInString, SimpleDateFormat formatter)
  {
    try {
      return formatter.parse(dateInString);
    } catch (ParseException e) {
      // TODO: check here
      e.printStackTrace();
      return null;
    }
  }
}
