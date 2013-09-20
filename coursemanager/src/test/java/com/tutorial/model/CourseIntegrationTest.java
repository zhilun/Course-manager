package com.tutorial.model;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;
import org.springframework.transaction.annotation.Transactional;

@RooIntegrationTest(entity = Course.class)
public class CourseIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
    
    @Test
    @Transactional
    public void addAndFetchCourse() {
    Course c = new Course();
    c.setCourseType(CourseTypeEnum.CONTINUING_EDUCATION);
    c.setName("Stand-up Comedy");
    c.setDescription("You'll laugh, you'll cry, it will become a part of you.");
    c.setMaximumCapacity(10);
    c.persist();
    c.flush();
    c.clear();
    Assert.assertNotNull(c.getId());
    Course c2 = Course.findCourse(c.getId());
    Assert.assertNotNull(c2);
    Assert.assertEquals(c.getName(), c2.getName());
    Assert.assertEquals(c2.getDescription(), c.getDescription());
    Assert.assertEquals(
    c.getMaximumCapacity(), c2.getMaximumCapacity());
    Assert.assertEquals(c.getCourseType(), c2.getCourseType());
    }
}
