/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author tiennh
 */
public class Student
{
    protected String name;
    protected Double mark;

    public Student(String name, Double mark) {
        this.name = name;
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public Double getMark() {
        return mark;
    }
}
