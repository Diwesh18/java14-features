package com.github.kbnt.java14.records;

import java.util.Objects;

/**
 * A very verbose and old-fashioned implementation of the Person interface.
 * 
 * @author <a href="mailto:tech.meshter@gmail.com">Chris T</a>
 *
 */
public final class PersonClass implements Person {
  private final String firstName;
  private final String lastName;
  private final int age;

  public PersonClass(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public String firstName() {
    return this.firstName;
  }

  @Override
  public String lastName() {
    return this.lastName;
  }

  @Override
  public int age() {
    return this.age;
  }

  /*
   * All the methods below were generated by the IDE (Eclipse/Spring Tools Suite)
   */

  @Override
  public int hashCode() {
    return Objects.hash(age, firstName, lastName);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof PersonClass))
      return false;
    PersonClass other = (PersonClass) obj;
    return age == other.age && Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
  }

  @Override
  public String toString() {
    return "PersonClass [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
  }
}
