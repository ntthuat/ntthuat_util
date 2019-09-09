package org.ntthuat.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/29 11:32 AM
 * $Log: DatePattern.java
 */
@Getter
@AllArgsConstructor
public enum DatePattern
{
  ddMMyyyy_slash("dd/MM/yyyy"), // example: 28/07/2019

  EMMMddyyyy("E, MMM dd yyyy"), // example: Sun, July 28 2019

  EEEEMMMddyyyyHHmmssa("EEEE, MMM dd, yyyy HH:mm:ss a"), // example: Sunday, July 28, 2019 12:10:56 PM // Because we use HH in this constant thus 'a' is meaningless

  EEEEMMMddyyyyhhmmssa("EEEE, MMM dd, yyyy hh:mm:ss a"); // example: Sunday, July 28, 2019 12:10:56 PM

  private final String pattern;
}
