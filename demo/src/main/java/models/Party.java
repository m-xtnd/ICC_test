package models;

import java.time.LocalDate;

public class Party {

  protected int id;
  protected String name;
  protected LocalDate ratified_date;
  protected LocalDate intoForce_date;
  private static int count;

  public Party(int id, String name, LocalDate ratified_date, LocalDate intoForce_date) {
    this.id = ++count;
    this.name = name;
    this.ratified_date = ratified_date;
    this.intoForce_date = intoForce_date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getRatified_date() {
    return ratified_date;
  }

  public void setRatified_date(LocalDate ratified_date) {
    this.ratified_date = ratified_date;
  }

  public LocalDate getIntoForce_date() {
    return intoForce_date;
  }

  public void setIntoForce_date(LocalDate intoForce_date) {
    this.intoForce_date = intoForce_date;
  }

  public static int getCount() {
    return count;
  }

  public static void setCount(int count) {
    Party.count = count;
  }

  public void easyprint() {
    System.out.println(this.getId() + this.getName() + this.getRatified_date() + this.getIntoForce_date());
  }

}