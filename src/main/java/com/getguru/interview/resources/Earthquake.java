//Copyright Guru Technologies 2017
package com.getguru.interview.resources;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * @author Pete Michel
 */
@SuppressWarnings("deprecation")
@JsonSerialize(include=Inclusion.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Earthquake {

  private Date _time;
  private Double _latitude;
  private Double _longitude;
  private Double _depth;
  private Double _magnitude;
  private String _magType;
  private String _id;
  private String _place;
  private String _type;
  
  public Date getTime() {
    return _time;
  }
  public void setTime(Date time) {
    _time = time;
  }
  public Double getLatitude() {
    return _latitude;
  }
  public void setLatitude(Double latitude) {
    _latitude = latitude;
  }
  public Double getLongitude() {
    return _longitude;
  }
  public void setLongitude(Double longitude) {
    _longitude = longitude;
  }
  public Double getDepth() {
    return _depth;
  }
  public void setDepth(Double depth) {
    _depth = depth;
  }
  public Double getMagnitude() {
    return _magnitude;
  }
  public void setMagnitude(Double mag) {
    _magnitude = mag;
  }
  public String getId() {
    return _id;
  }
  public void setId(String id) {
    _id = id;
  }
  public String getPlace() {
    return _place;
  }
  public void setPlace(String place) {
    _place = place;
  }
  public String getMagType() {
    return _magType;
  }
  public void setMagType(String magType) {
    _magType = magType;
  }
  public String getType() {
    return _type;
  }
  public void setType(String type) {
    _type = type;
  }
  
}