// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.tutorial.model;

import com.tutorial.model.Course;
import com.tutorial.model.CourseTypeEnum;
import java.math.BigDecimal;
import java.util.Date;

privileged aspect Course_Roo_JavaBean {
    
    public String Course.getName() {
        return this.name;
    }
    
    public void Course.setName(String name) {
        this.name = name;
    }
    
    public String Course.getDescription() {
        return this.description;
    }
    
    public void Course.setDescription(String description) {
        this.description = description;
    }
    
    public BigDecimal Course.getListPrice() {
        return this.listPrice;
    }
    
    public void Course.setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }
    
    public Integer Course.getMaximumCapacity() {
        return this.maximumCapacity;
    }
    
    public void Course.setMaximumCapacity(Integer maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
    
    public Date Course.getRunDate() {
        return this.runDate;
    }
    
    public void Course.setRunDate(Date runDate) {
        this.runDate = runDate;
    }
    
    public CourseTypeEnum Course.getCourseType() {
        return this.courseType;
    }
    
    public void Course.setCourseType(CourseTypeEnum courseType) {
        this.courseType = courseType;
    }
    
}
