package com.tutorial.model;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Course {

    /**
     */
    @Column(name = "course_name")
    @Size(min = 1, max = 60)
    private String name;

    /**
     */
    @NotNull
    @Size(max = 1000)
    private String description;

    /**
     */
    @DecimalMin("0.0")
    @DecimalMax("99999.99")
    @Digits(integer = 5, fraction = 2)
    private BigDecimal listPrice;

    /**
     */
    @NotNull
    @Column(name = "max_capacity")
    @Min(1L)
    @Max(9999L)
    private Integer maximumCapacity;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date runDate;

    /**
     */
    @NotNull
    @Enumerated(EnumType.STRING)
    private CourseTypeEnum courseType;
}
